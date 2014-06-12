package com.greenday.lyrics;

import com.greenday.americanidiot.AmericanIdiotMain;
import com.greenday.demolicious.Demolicious;
import com.greenday.dookie.Dookie;
import com.greenday.dos.Dos;
import com.greenday.ins.Ins;
import com.greenday.insomniac.Insomniac;
import com.greenday.kerplunk.Kerplunk;
import com.greenday.nimrod.Nimrod;
import com.greenday.shenanigans.Shenanigans;
import com.greenday.tcb.TcbMain;
import com.greenday.tns.Tns;
import com.greenday.tre.Tre;
import com.greenday.uno.Uno;
import com.greenday.warning.WarningMain;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.Editable;
import android.text.Html;
import android.text.TextWatcher;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;

public class Allsongs extends Activity {
	
	ArrayAdapter<String> adapter;
	public static final String SERVICECMD = "com.android.music.musicservicecommand";
	public static final String CMDNAME = "command";
	public static final String CMDTOGGLEPAUSE = "togglepause";
	public static final String CMDSTOP = "stop";
	public static final String CMDPAUSE = "pause";
	public static final String CMDPREVIOUS = "previous";
	public static final String CMDNEXT = "next";
	
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.all_songs);
		
		//Action bar color
        int ab_def_color= Color.parseColor("#222222");
        int ab_color=PreferenceManager.getDefaultSharedPreferences(this).getInt("ab_theme", ab_def_color);
        ActionBar ab =getActionBar();
        ab.setBackgroundDrawable(new ColorDrawable(ab_color));
		
		getActionBar().setDisplayHomeAsUpEnabled(true);
		getWindow().setBackgroundDrawableResource(R.drawable.allsongs_bg);
		final ListView lv= (ListView) findViewById(R.id.listView1);
		final EditText txtQuery = (EditText) findViewById(R.id.txtQuery);
		
		//Register broadcast receiver
		IntentFilter iF = new IntentFilter();
		iF.addAction("com.android.music.metachanged");		//Stock
		iF.addAction("com.getpebble.action.NOW_PLAYING");
		iF.addAction("com.maxmpz.audioplayer.metachanged");		//Poweramp
		iF.addAction("com.htc.music.metachanged");		//HTC stock
		iF.addAction("com.sec.android.app.music.metachanged");		//Samsung
		iF.addAction("com.nullsoft.winamp.metachanged");		//Winamp
		iF.addAction("com.dogsbark.noozy.metachanged");
		iF.addAction("com.sonyericsson.media.infinite.metachanged");
	    iF.addAction("com.amazon.mp3.metachanged");     
	    iF.addAction("com.miui.player.metachanged");        
	    iF.addAction("com.real.IMP.metachanged");
	    iF.addAction("com.sonyericsson.music.true");
	    iF.addAction("com.rdio.android.metachanged");
	    iF.addAction("com.samsung.sec.android.MusicPlayer.metachanged");
	    //iF.addAction("com.andrew.apollo.metachanged");
		registerReceiver(mReceiver, iF);
		
		 //Boot_pref
        boolean firstboot = getSharedPreferences("BOOT_PREF", MODE_PRIVATE).getBoolean("firstboot_allsongs", true);
        if (firstboot){
            // 1) Launch the authentication activity
           		new AlertDialog.Builder(Allsongs.this)
            	.setTitle("INSTRUCTIONS")
            	.setMessage(Html.fromHtml("How to use <b>'Now Playing'</b> feature?<br><br>" +
            			"Just press on <b><font color='#464ea3'>'Play'</font></b> icon in search bar.<br><br>" +
            			"Now, you should see the name of current track in music player.<br><br>" +
            			"<b>Feature tested on:</b><br><font color='#464ea3'><i>Google Play Music<br>" +
            			"Apollo Music Player<br> Poweramp<br> n7player<br> Stock Samsung and HTC players.</i></font>" +
             			"<br><br><u><b><font color='#e02923'>Warning!</font></b></u><br>" +
            			"Make sure that name of Green Day tracks in music player match with the name in the list (or official release name).<br>" +
            			"This feature might not work on <i><font color='#464ea3'>Winamp</i></font> and <i><font color='#464ea3'>Walkman</i></font>."))
            			.setNeutralButton("OK", new DialogInterface.OnClickListener() {
    			            public void onClick(DialogInterface dialog, int which) {
    			                Allsongs.this.closeContextMenu();
    			            }
    			        }).show(); 
            // 2) Save the state
            getSharedPreferences("BOOT_PREF", MODE_PRIVATE)
                .edit()
                .putBoolean("firstboot_allsongs", false)
                .commit();
        }
        //Boot_pref ends

		ImageButton b=(ImageButton) findViewById(R.id.txtQuery_play);
		b.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				SharedPreferences prefs = Allsongs.this.getSharedPreferences(
					      "EXTRA_PREF", Context.MODE_PRIVATE);
				String track = prefs.getString("song", "Not Found");
				txtQuery.setText(track);
			}
		});
		
		//Action bar search
		boolean search = getIntent().getBooleanExtra("Search", false);
		if(search) {
            	getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_VISIBLE);
			}
		
		final String[] value = getResources().getStringArray(R.array.fav_array);
		
		adapter= new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, value);
		lv.setAdapter(adapter);
		lv.setFastScrollEnabled(true);
		lv.setFastScrollAlwaysVisible(true);
		ImageButton ib=(ImageButton) findViewById(R.id.txtQuery_clear);
		ib.setOnClickListener(new OnClickListener() {
			
			@SuppressLint("ShowToast")
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Toast.makeText(Allsongs.this, "Cleared", Toast.LENGTH_SHORT).show();
				txtQuery.setText("");
			}
		});
		/**
         * Enabling Search Filter
         * */
        txtQuery.addTextChangedListener(new TextWatcher() {
             
            @Override
            public void onTextChanged(CharSequence cs, int arg1, int arg2, int arg3) {
                // When user changed the Text
                Allsongs.this.adapter.getFilter().filter(cs);   
            }
             
            @Override
            public void beforeTextChanged(CharSequence cs2, int arg1, int arg2,
                    int arg3) {
                // TODO Auto-generated method stub
            	Allsongs.this.adapter.getFilter().filter(cs2); 
            }
            
            public void afterTextChanged(Editable cs3) {
                // TODO Auto-generated method stub  
            	Allsongs.this.adapter.getFilter().filter(cs3); 
            }
        });

		lv.invalidate();
        
		lv.setOnItemClickListener(new OnItemClickListener() {

			@SuppressWarnings("rawtypes")
			@Override
			public void onItemClick(AdapterView parent, View view,int position, long _id) {
				String values = value[position];
				// TODO Auto-generated method stub

				if (values.equals("1,000 Hours")) {
					Intent intent = new Intent(Allsongs.this, Tns.class);     
	                intent.putExtra("track", 15);
	                startActivity(intent);}
				if (values.equals("16")) {
					Intent intent = new Intent(Allsongs.this, Tns.class);     
	                intent.putExtra("track", 7);
	                startActivity(intent);}
				if (values.equals("2000 Light Years Away")) {
					Intent intent = new Intent(Allsongs.this, Kerplunk.class);     
	                intent.putExtra("track", 1);
	                startActivity(intent);}
				if (values.equals("21 Guns")) {
					Intent intent = new Intent(Allsongs.this, TcbMain.class);     
	                intent.putExtra("track", 16);
	                startActivity(intent);}
				if (values.equals("21st Century Breakdown")) {
					Intent intent1 = new Intent(Allsongs.this, TcbMain.class);     
	                intent1.putExtra("track", 2);
	                startActivity(intent1);}
				if (values.equals("409 In Your Coffeemaker")) {
					Intent intent = new Intent(Allsongs.this, Tns.class);     
	                intent.putExtra("track", 13);
	                startActivity(intent);}
				if (values.equals("80")) {
					Intent intent = new Intent(Allsongs.this, Kerplunk.class);     
	                intent.putExtra("track", 8);
	                startActivity(intent);}
				if (values.equals("86")) {
					Intent intent = new Intent(Allsongs.this, Insomniac.class);     
	                intent.putExtra("track", 7);
	                startActivity(intent);}
				if (values.equals("8th Avenue Serenade")) {
					Intent intent = new Intent(Allsongs.this, Tre.class);     
	                intent.putExtra("track", 3);
	                startActivity(intent);}
				if (values.equals("99 Revolutions")) {
					Intent intent = new Intent(Allsongs.this, Tre.class);     
	                intent.putExtra("track", 11);
	                startActivity(intent);}
				if (values.equals("All By Myself")) {
					Intent intent = new Intent(Allsongs.this, Dookie.class);     
	                intent.putExtra("track", 1);
	                startActivity(intent);}
				if (values.equals("All The Time")) {
					Intent intent = new Intent(Allsongs.this, Nimrod.class);     
	                intent.putExtra("track", 6);
	                startActivity(intent);}
				if (values.equals("Amanda")) {
					Intent intent = new Intent(Allsongs.this, Tre.class);     
	                intent.putExtra("track", 8);
	                startActivity(intent);}
				if (values.equals("American Eulogy (Mass Hysteria/Modern World)")) {
					Intent intent = new Intent(Allsongs.this, TcbMain.class);     
	                intent.putExtra("track", 17);
	                startActivity(intent);}
				if (values.equals("American Idiot")) {
					Intent intent = new Intent(Allsongs.this, AmericanIdiotMain.class);     
	                intent.putExtra("track", 1);
	                startActivity(intent);}
				if (values.equals("Amy")) {
					Intent intent = new Intent(Allsongs.this, Dos.class);     
	                intent.putExtra("track", 13);
	                startActivity(intent);}
				if (values.equals("Android")) {
					Intent intent = new Intent(Allsongs.this, Kerplunk.class);     
	                intent.putExtra("track", 9);
	                startActivity(intent);}
				if (values.equals("Angel Blue")) {
					Intent intent = new Intent(Allsongs.this, Uno.class);     
	                intent.putExtra("track", 9);
	                startActivity(intent);}
				if (values.equals("Are We The Waiting")) {
					Intent intent = new Intent(Allsongs.this, AmericanIdiotMain.class);   
               	 	intent.putExtra("track", 5);
	                startActivity(intent);}
				if (values.equals("Armatage Shanks")) {
					Intent intent = new Intent(Allsongs.this, Insomniac.class);     
	                intent.putExtra("track", 1);
	                startActivity(intent);}
				if (values.equals("Ashley")) {
					Intent intent = new Intent(Allsongs.this, Dos.class);     
	                intent.putExtra("track", 8);
	                startActivity(intent);}
				if (values.equals("At The Library")) {
					Intent intent = new Intent(Allsongs.this, Tns.class);     
	                intent.putExtra("track", 1);
	                startActivity(intent);}
				if (values.equals("Bab's Uvula Who?")) {
					Intent intent = new Intent(Allsongs.this, Insomniac.class);     
	                intent.putExtra("track", 6);
	                startActivity(intent);}
				if (values.equals("Baby Eyes")) {
					Intent intent = new Intent(Allsongs.this, Dos.class);     
	                intent.putExtra("track", 9);
	                startActivity(intent);}
				if (values.equals("Basket Case")) {
					Intent intent = new Intent(Allsongs.this, Dookie.class);     
	                intent.putExtra("track", 8);
	                startActivity(intent);}
				if (values.equals("Before The Lobotomy")) {
					Intent intent = new Intent(Allsongs.this, TcbMain.class);   
               	 	intent.putExtra("track", 5);
	                startActivity(intent);}
				if (values.equals("Best Thing In Town")) {
					Intent intent = new Intent(Allsongs.this, Kerplunk.class);     
	                intent.putExtra("track", 14);
	                startActivity(intent);}
				if (values.equals("Blood, Sex And Booze")) {
					Intent intent1 = new Intent(Allsongs.this, WarningMain.class);     
                    intent1.putExtra("track", 2);
                    startActivity(intent1);}
				if (values.equals("Boulevard Of Broken Dreams")) {
					Intent intent = new Intent(Allsongs.this, AmericanIdiotMain.class);     
	                intent.putExtra("track", 4);
	                startActivity(intent);}
				if (values.equals("Brain Stew")) {
					Intent intent = new Intent(Allsongs.this, Insomniac.class);     
	                intent.putExtra("track", 10);
	                startActivity(intent);}
				if (values.equals("Brat")) {
					Intent intent1 = new Intent(Allsongs.this, Insomniac.class);     
	                intent1.putExtra("track", 2);
	                startActivity(intent1);}
				if (values.equals("Brutal Love")) {
					Intent intent = new Intent(Allsongs.this, Tre.class);     
	                intent.putExtra("track", 1);
	                startActivity(intent);}
				if (values.equals("Burnout")) {
					Intent intent1 = new Intent(Allsongs.this, Dookie.class);     
	                intent1.putExtra("track", 2);
	                startActivity(intent1);}
				if (values.equals("Carpe Diem")) {
					Intent intent = new Intent(Allsongs.this, Uno.class);     
	                intent.putExtra("track", 3);
	                startActivity(intent);}
				if (values.equals("Castaway")) {
					Intent intent = new Intent(Allsongs.this, WarningMain.class);     
                    intent.putExtra("track", 5);
                    startActivity(intent);}
				if (values.equals("Christian's Inferno")) {
					Intent intent = new Intent(Allsongs.this, TcbMain.class);     
	                intent.putExtra("track", 6);
	                startActivity(intent);}
				if (values.equals("Christie Road")) {
					Intent intent = new Intent(Allsongs.this, Kerplunk.class);     
	                intent.putExtra("track", 4);
	                startActivity(intent);}
				if (values.equals("Chump")) {
					Intent intent = new Intent(Allsongs.this, Dookie.class);     
	                intent.putExtra("track", 4);
	                startActivity(intent);}
				if (values.equals("Church On Sunday")) {
					Intent intent = new Intent(Allsongs.this, WarningMain.class);     
                    intent.putExtra("track", 3);
                    startActivity(intent);}
				if (values.equals("Coming Clean")) {
					Intent intent = new Intent(Allsongs.this, Dookie.class);     
	                intent.putExtra("track", 12);
	                startActivity(intent);}
				if (values.equals("Deadbeat Holiday")) {
					Intent intent = new Intent(Allsongs.this, WarningMain.class);     
                    intent.putExtra("track", 7);
                    startActivity(intent);}
				if (values.equals("Desensitized")) {
					Intent intent1 = new Intent(Allsongs.this, Shenanigans.class);     
	                intent1.putExtra("track", 2);
	                startActivity(intent1);}
				if (values.equals("Dirty Rotten Bastards")) {
					Intent intent = new Intent(Allsongs.this, Tre.class);     
	                intent.putExtra("track", 10);
	                startActivity(intent);}
				if (values.equals("Disappearing Boy")) {
					Intent intent = new Intent(Allsongs.this, Tns.class);     
	                intent.putExtra("track", 4);
	                startActivity(intent);}
				if (values.equals("Do Da Da")) {
					Intent intent = new Intent(Allsongs.this, Shenanigans.class);     
	                intent.putExtra("track", 12);
	                startActivity(intent);}
				if (values.equals("Dominated Love Slave")) {
					Intent intent = new Intent(Allsongs.this, Kerplunk.class);     
	                intent.putExtra("track", 6);
	                startActivity(intent);}
				if (values.equals("Don't Leave Me")) {
					Intent intent1 = new Intent(Allsongs.this, Tns.class);     
	                intent1.putExtra("track", 2);
	                startActivity(intent1);}
				if (values.equals("Don't Wanna Fall In Love")) {
					Intent intent = new Intent(Allsongs.this, Shenanigans.class);   
               	 	intent.putExtra("track", 5);
	                startActivity(intent);}
				if (values.equals("Drama Queen")) {
					Intent intent = new Intent(Allsongs.this, Tre.class);     
	                intent.putExtra("track", 4);
	                startActivity(intent);}
				if (values.equals("Dry Ice")) {
					Intent intent = new Intent(Allsongs.this, Tns.class);     
	                intent.putExtra("track", 16);
	                startActivity(intent);}
				if (values.equals("East Jesus Nowhere")) {
					Intent intent = new Intent(Allsongs.this, TcbMain.class);     
	                intent.putExtra("track", 8);
	                startActivity(intent);}
				if (values.equals("Emenius Sleepus")) {
					Intent intent = new Intent(Allsongs.this, Dookie.class);     
	                intent.putExtra("track", 13);
	                startActivity(intent);}
				if (values.equals("Espionage")) {
					Intent intent = new Intent(Allsongs.this, Shenanigans.class);     
	                intent.putExtra("track", 6);
	                startActivity(intent);}
				if (values.equals("Extraordinary Girl")) {
					Intent intent = new Intent(Allsongs.this, AmericanIdiotMain.class);     
	                intent.putExtra("track", 9);
	                startActivity(intent);}
				if (values.equals("F.O.D.")) {
					Intent intent = new Intent(Allsongs.this, Dookie.class);     
	                intent.putExtra("track", 15);
	                startActivity(intent);}
				if (values.equals("Fashion Victim")) {
					Intent intent = new Intent(Allsongs.this, WarningMain.class);     
                    intent.putExtra("track", 4);
                    startActivity(intent);}
				if (values.equals("Fell For You")) {
					Intent intent = new Intent(Allsongs.this, Uno.class);     
	                intent.putExtra("track", 6);
	                startActivity(intent);}
				if (values.equals("Fuck Time")) {
					Intent intent1 = new Intent(Allsongs.this, Dos.class);     
	                intent1.putExtra("track", 2);
	                startActivity(intent1);}
				if (values.equals("Geek Stink Breath")) {
					Intent intent = new Intent(Allsongs.this, Insomniac.class);     
	                intent.putExtra("track", 4);
	                startActivity(intent);}
				if (values.equals("Give Me Novacaine")) {
					Intent intent = new Intent(Allsongs.this, AmericanIdiotMain.class);     
	                intent.putExtra("track", 7);
	                startActivity(intent);}
				if (values.equals("Going To Pasalacqua")) {
					Intent intent = new Intent(Allsongs.this, Tns.class);     
	                intent.putExtra("track", 6);
	                startActivity(intent);}
				if (values.equals("Good Riddance (Time Of Your Life)")) {
					Intent intent = new Intent(Allsongs.this, Nimrod.class);     
	                intent.putExtra("track", 17);
	                startActivity(intent);}
				if (values.equals("Green Day")) {
					Intent intent = new Intent(Allsongs.this, Tns.class);   
               	 	intent.putExtra("track", 5);
	                startActivity(intent);}
				if (values.equals("Ha Ha You're Dead")) {
					Intent intent = new Intent(Allsongs.this, Shenanigans.class);     
	                intent.putExtra("track", 14);
	                startActivity(intent);}
				if (values.equals("Haushinka")) {
					Intent intent = new Intent(Allsongs.this, Nimrod.class);     
	                intent.putExtra("track", 12);
	                startActivity(intent);}
				if (values.equals("Having A Blast")) {
					Intent intent = new Intent(Allsongs.this, Dookie.class);     
	                intent.putExtra("track", 3);
	                startActivity(intent);}
				if (values.equals("Hitchin' A Ride")) {
					Intent intent1 = new Intent(Allsongs.this, Nimrod.class);     
	                intent1.putExtra("track", 2);
	                startActivity(intent1);}
				if (values.equals("Hold On")) {
					Intent intent = new Intent(Allsongs.this, WarningMain.class);     
	                intent.putExtra("track", 8);
	                startActivity(intent);}
				if (values.equals("Holiday")) {
					Intent intent = new Intent(Allsongs.this, AmericanIdiotMain.class);     
	                intent.putExtra("track", 3);
	                startActivity(intent);}
				if (values.equals("Homecoming")) {
					Intent intent = new Intent(Allsongs.this, AmericanIdiotMain.class);     
	                intent.putExtra("track", 12);
	                startActivity(intent);}
				if (values.equals("Horseshoes And Handgrenades")) {
					Intent intent = new Intent(Allsongs.this, TcbMain.class);     
	                intent.putExtra("track", 14);
	                startActivity(intent);}
				if (values.equals("I Want To Be Alone")) {
					Intent intent = new Intent(Allsongs.this, Tns.class);     
	                intent.putExtra("track", 19);
	                startActivity(intent);}
				if (values.equals("I Want To Be On T.V.")) {
					Intent intent = new Intent(Allsongs.this, Shenanigans.class);     
	                intent.putExtra("track", 7);
	                startActivity(intent);}
				if (values.equals("I Was There")) {
					Intent intent = new Intent(Allsongs.this, Tns.class);     
	                intent.putExtra("track", 3);
	                startActivity(intent);}
				if (values.equals("In The End")) {
					Intent intent = new Intent(Allsongs.this, Dookie.class);     
	                intent.putExtra("track", 14);
	                startActivity(intent);}
				if (values.equals("Jackass")) {
					Intent intent = new Intent(Allsongs.this, WarningMain.class);     
	                intent.putExtra("track", 9);
	                startActivity(intent);}
				if (values.equals("Jaded")) {
					Intent intent = new Intent(Allsongs.this, Insomniac.class);     
	                intent.putExtra("track", 11);
	                startActivity(intent);}
				if (values.equals("J.A.R. (Jason Andrew Relva)")) {
					Intent intent = new Intent(Allsongs.this, Ins.class);     
	                intent.putExtra("track", 8);
	                startActivity(intent);}
				if (values.equals("Jesus Of Suburbia")) {
					Intent intent1 = new Intent(Allsongs.this, AmericanIdiotMain.class);     
	                intent1.putExtra("track", 2);
	                startActivity(intent1);}
				if (values.equals("Jinx")) {
					Intent intent = new Intent(Allsongs.this, Nimrod.class);     
	                intent.putExtra("track", 11);
	                startActivity(intent);}
				if (values.equals("Kill The DJ")) {
					Intent intent = new Intent(Allsongs.this, Uno.class);   
               	 	intent.putExtra("track", 5);
	                startActivity(intent);}
				if (values.equals("King For A Day")) {
					Intent intent = new Intent(Allsongs.this, Nimrod.class);     
	                intent.putExtra("track", 16);
	                startActivity(intent);}
				if (values.equals("Know Your Enemy")) {
					Intent intent = new Intent(Allsongs.this, TcbMain.class);     
	                intent.putExtra("track", 3);
	                startActivity(intent);}
				if (values.equals("Knowledge")) {
					Intent intent = new Intent(Allsongs.this, Tns.class);     
	                intent.putExtra("track", 14);
	                startActivity(intent);}
				if (values.equals("Lady Cobra")) {
					Intent intent = new Intent(Allsongs.this, Dos.class);     
	                intent.putExtra("track", 10);
	                startActivity(intent);}
				if (values.equals("Last Night On Earth")) {
					Intent intent = new Intent(Allsongs.this, TcbMain.class);     
	                intent.putExtra("track", 7);
	                startActivity(intent);}
				if (values.equals("Last Of American Girls")) {
					Intent intent = new Intent(Allsongs.this, TcbMain.class);     
	                intent.putExtra("track", 10);
	                startActivity(intent);}
				if (values.equals("Lazy Bones")) {
					Intent intent = new Intent(Allsongs.this, Dos.class);     
	                intent.putExtra("track", 4);
	                startActivity(intent);}
				if (values.equals("Let Yourself Go")) {
					Intent intent = new Intent(Allsongs.this, Uno.class);     
	                intent.putExtra("track", 4);
	                startActivity(intent);}
				if (values.equals("Letterbomb")) {
					Intent intent = new Intent(Allsongs.this, AmericanIdiotMain.class);     
	                intent.putExtra("track", 10);
	                startActivity(intent);}
				if (values.equals("Little Boy Named Train")) {
					Intent intent = new Intent(Allsongs.this, Tre.class);     
	                intent.putExtra("track", 7);
	                startActivity(intent);}
				if (values.equals("Longview")) {
					Intent intent = new Intent(Allsongs.this, Dookie.class);   
               	 	intent.putExtra("track", 5);
	                startActivity(intent);}
				if (values.equals("Loss Of Control")) {
					Intent intent = new Intent(Allsongs.this, Uno.class);     
	                intent.putExtra("track", 7);
	                startActivity(intent);}
				if (values.equals("Macy's Day Parade")) {
					Intent intent = new Intent(Allsongs.this, WarningMain.class);     
	                intent.putExtra("track", 12);
	                startActivity(intent);}
				if (values.equals("Makeout Party")) {
					Intent intent = new Intent(Allsongs.this, Dos.class);     
	                intent.putExtra("track", 6);
	                startActivity(intent);}
				if (values.equals("Minority")) {
					Intent intent = new Intent(Allsongs.this, WarningMain.class);     
	                intent.putExtra("track", 11);
	                startActivity(intent);}
				if (values.equals("Maria")) {
					Intent intent = new Intent(Allsongs.this, Ins.class);     
	                intent.putExtra("track", 1);
	                startActivity(intent);}
				if (values.equals("Misery")) {
					Intent intent = new Intent(Allsongs.this, WarningMain.class);     
	                intent.putExtra("track", 6);
	                startActivity(intent);}
				if (values.equals("Missing You")) {
					Intent intent1 = new Intent(Allsongs.this, Tre.class);     
	                intent1.putExtra("track", 2);
	                startActivity(intent1);}
				if (values.equals("Murder City")) {
					Intent intent = new Intent(Allsongs.this, TcbMain.class);     
	                intent.putExtra("track", 11);
	                startActivity(intent);}
				if (values.equals("My Generation")) {
					Intent intent = new Intent(Allsongs.this, Kerplunk.class);     
	                intent.putExtra("track", 16);
	                startActivity(intent);}
				if (values.equals("Nice Guys Finish Last")) {
					Intent intent = new Intent(Allsongs.this, Nimrod.class);     
	                intent.putExtra("track", 1);
	                startActivity(intent);}
				if (values.equals("Nightlife")) {
					Intent intent = new Intent(Allsongs.this, Dos.class);     
	                intent.putExtra("track", 11);
	                startActivity(intent);}
				if (values.equals("No One Knows")) {
					Intent intent = new Intent(Allsongs.this, Kerplunk.class);     
	                intent.putExtra("track", 10);
	                startActivity(intent);}
				if (values.equals("No Pride")) {
					Intent intent = new Intent(Allsongs.this, Insomniac.class);   
               	 	intent.putExtra("track", 5);
	                startActivity(intent);}
				if (values.equals("Nuclear Family")) {
					Intent intent = new Intent(Allsongs.this, Uno.class);     
	                intent.putExtra("track", 1);
	                startActivity(intent);}
				if (values.equals("Oh Love")) {
					Intent intent = new Intent(Allsongs.this, Uno.class);     
	                intent.putExtra("track", 12);
	                startActivity(intent);}
				if (values.equals("On The Wagon")) {
					Intent intent = new Intent(Allsongs.this, Shenanigans.class);     
	                intent.putExtra("track", 13);
	                startActivity(intent);}
				if (values.equals("One For The Razorbacks")) {
					Intent intent1 = new Intent(Allsongs.this, Kerplunk.class);     
	                intent1.putExtra("track", 2);
	                startActivity(intent1);}
				if (values.equals("One Of My Lies")) {
					Intent intent = new Intent(Allsongs.this, Kerplunk.class);     
	                intent.putExtra("track", 7);
	                startActivity(intent);}
				if (values.equals("Only Of You")) {
					Intent intent = new Intent(Allsongs.this, Tns.class);     
	                intent.putExtra("track", 17);
	                startActivity(intent);}
				if (values.equals("Outsider")) {
					Intent intent = new Intent(Allsongs.this, Shenanigans.class);     
	                intent.putExtra("track", 4);
	                startActivity(intent);}
				if (values.equals("Panic Song")) {
					Intent intent = new Intent(Allsongs.this, Insomniac.class);     
	                intent.putExtra("track", 8);
	                startActivity(intent);}
				if (values.equals("Paper Lanterns")) {
					Intent intent = new Intent(Allsongs.this, Tns.class);     
	                intent.putExtra("track", 11);
	                startActivity(intent);}
				if (values.equals("Peacemaker")) {
					Intent intent = new Intent(Allsongs.this, TcbMain.class);     
	                intent.putExtra("track", 9);
	                startActivity(intent);}
				if (values.equals("Platypus (I Hate You)")) {
					Intent intent = new Intent(Allsongs.this, Nimrod.class);     
	                intent.putExtra("track", 8);
	                startActivity(intent);}
				if (values.equals("Poprocks & Coke")) {
					Intent intent1 = new Intent(Allsongs.this, Ins.class);     
	                intent1.putExtra("track", 2);
	                startActivity(intent1);}
				if (values.equals("Private Ale")) {
					Intent intent = new Intent(Allsongs.this, Kerplunk.class);   
               	 	intent.putExtra("track", 5);
	                startActivity(intent);}
				if (values.equals("Prosthetic Head")) {
					Intent intent = new Intent(Allsongs.this, Nimrod.class);     
	                intent.putExtra("track", 18);
	                startActivity(intent);}
				if (values.equals("Pulling Teeth")) {
					Intent intent = new Intent(Allsongs.this, Dookie.class);     
	                intent.putExtra("track", 7);
	                startActivity(intent);}
				if (values.equals("Redundant")) {
					Intent intent = new Intent(Allsongs.this, Nimrod.class);     
	                intent.putExtra("track", 4);
	                startActivity(intent);}
				if (values.equals("Reject")) {
					Intent intent = new Intent(Allsongs.this, Nimrod.class);     
	                intent.putExtra("track", 14);
	                startActivity(intent);}
				if (values.equals("Rest")) {
					Intent intent = new Intent(Allsongs.this, Tns.class);     
	                intent.putExtra("track", 9);
	                startActivity(intent);}
				if (values.equals("Restless Heart Syndrome")) {
					Intent intent = new Intent(Allsongs.this, TcbMain.class);     
	                intent.putExtra("track", 13);
	                startActivity(intent);}
				if (values.equals("Road To Acceptance")) {
					Intent intent = new Intent(Allsongs.this, Tns.class);     
	                intent.putExtra("track", 8);
	                startActivity(intent);}
				if (values.equals("Rotting")) {
					Intent intent = new Intent(Allsongs.this, Shenanigans.class);     
	                intent.putExtra("track", 11);
	                startActivity(intent);}
				if (values.equals("Rusty James")) {
					Intent intent = new Intent(Allsongs.this, Uno.class);     
	                intent.putExtra("track", 11);
	                startActivity(intent);}
				if (values.equals("Sassafras Roots")) {
					Intent intent = new Intent(Allsongs.this, Dookie.class);     
	                intent.putExtra("track", 10);
	                startActivity(intent);}
				if (values.equals("Scattered")) {
					Intent intent = new Intent(Allsongs.this, Nimrod.class);   
               	 	intent.putExtra("track", 5);
	                startActivity(intent);}
				if (values.equals("Scumbag")) {
					Intent intent = new Intent(Allsongs.this, Shenanigans.class);     
	                intent.putExtra("track", 8);
	                startActivity(intent);}
				if (values.equals("See The Light")) {
					Intent intent = new Intent(Allsongs.this, TcbMain.class);     
	                intent.putExtra("track", 18);
	                startActivity(intent);}
				if (values.equals("See You Tonight")) {
					Intent intent = new Intent(Allsongs.this, Dos.class);     
	                intent.putExtra("track", 1);
	                startActivity(intent);}
				if (values.equals("Sex, Drugs & Violence")) {
					Intent intent = new Intent(Allsongs.this, Tre.class);     
	                intent.putExtra("track", 6);
	                startActivity(intent);}
				if (values.equals("She")) {
					Intent intent = new Intent(Allsongs.this, Dookie.class);     
	                intent.putExtra("track", 9);
	                startActivity(intent);}
				if (values.equals("She's A Rebel")) {
					Intent intent = new Intent(Allsongs.this, AmericanIdiotMain.class);     
	                intent.putExtra("track", 8);
	                startActivity(intent);}
				if (values.equals("Sick Of Me")) {
					Intent intent = new Intent(Allsongs.this, Shenanigans.class);     
	                intent.putExtra("track", 10);
	                startActivity(intent);}
				if (values.equals("Song Of The Century")) {
					Intent intent = new Intent(Allsongs.this, TcbMain.class);     
	                intent.putExtra("track", 1);
	                startActivity(intent);}
				if (values.equals("St. Jimmy")) {
					Intent intent = new Intent(Allsongs.this, AmericanIdiotMain.class);     
	                intent.putExtra("track", 6);
	                startActivity(intent);}
				if (values.equals("Stay The Night")) {
					Intent intent1 = new Intent(Allsongs.this, Uno.class);     
	                intent1.putExtra("track", 2);
	                startActivity(intent1);}
				if (values.equals("Stop When The Red Lights Flash")) {
					Intent intent = new Intent(Allsongs.this, Dos.class);     
	                intent.putExtra("track", 3);
	                startActivity(intent);}
				if (values.equals("Strangeland")) {
					Intent intent = new Intent(Allsongs.this, Kerplunk.class);     
	                intent.putExtra("track", 15);
	                 startActivity(intent);}
				if (values.equals("Stray Heart")) {
					Intent intent = new Intent(Allsongs.this, Dos.class);     
	                intent.putExtra("track", 7);
	                startActivity(intent);}
				if (values.equals("Stuart And The Ave.")) {
					Intent intent = new Intent(Allsongs.this, Insomniac.class);     
	                intent.putExtra("track", 9);
	                startActivity(intent);}
				if (values.equals("Stuck With Me")) {
					Intent intent = new Intent(Allsongs.this, Insomniac.class);     
	                intent.putExtra("track", 3);
	                startActivity(intent);}
				if (values.equals("Suffocate")) {
					Intent intent = new Intent(Allsongs.this, Shenanigans.class);     
	                intent.putExtra("track", 1);
	                startActivity(intent);}
				if (values.equals("Sweet 16")) {
					Intent intent = new Intent(Allsongs.this, Uno.class);     
	                intent.putExtra("track", 10);
	                startActivity(intent);}
				if (values.equals("Sweet Children")) {
					Intent intent = new Intent(Allsongs.this, Kerplunk.class);     
	                intent.putExtra("track", 13);
	                startActivity(intent);}
				if (values.equals("Take Back")) {
					Intent intent = new Intent(Allsongs.this, Nimrod.class);     
	                intent.putExtra("track", 15);
	                startActivity(intent);}
				if (values.equals("The Forgotten")) {
					Intent intent = new Intent(Allsongs.this, Tre.class);     
	                intent.putExtra("track", 12);
	                startActivity(intent);}
				if (values.equals("The Grouch")) {
					Intent intent = new Intent(Allsongs.this, Nimrod.class);     
	                intent.putExtra("track", 3);
	                startActivity(intent);}
				if (values.equals("The Judge's Daughter")) {
					Intent intent = new Intent(Allsongs.this, Tns.class);     
	                intent.putExtra("track", 10);
	                startActivity(intent);}
				if (values.equals("The One I Want")) {
					Intent intent = new Intent(Allsongs.this, Tns.class);     
	                 intent.putExtra("track", 18);
	                 startActivity(intent);}
				if (values.equals("The Static Age")) {
					Intent intent = new Intent(Allsongs.this, TcbMain.class);     
	                intent.putExtra("track", 15);
	                startActivity(intent);}
				if (values.equals("Tight Wadd Hill")) {
					Intent intent = new Intent(Allsongs.this, Insomniac.class);     
	                intent.putExtra("track", 13);
	                startActivity(intent);}
				if (values.equals("Tired Of Waiting For You")) {
					Intent intent = new Intent(Allsongs.this, Shenanigans.class);     
	                intent.putExtra("track", 9);
	                startActivity(intent);}
				if (values.equals("Troublemaker")) {
					Intent intent = new Intent(Allsongs.this, Uno.class);     
	                intent.putExtra("track", 8);
	                startActivity(intent);}
				if (values.equals("Uptight")) {
					Intent intent = new Intent(Allsongs.this, Nimrod.class);     
	                intent.putExtra("track", 9);
	                startActivity(intent);}
				if (values.equals("Waiting")) {
					Intent intent = new Intent(Allsongs.this, WarningMain.class);     
	                intent.putExtra("track", 10);
	                startActivity(intent);}
				if (values.equals("Wake Me Up When September Ends")) {
					Intent intent = new Intent(Allsongs.this, AmericanIdiotMain.class);     
	                intent.putExtra("track", 11);
	                startActivity(intent);}
				if (values.equals("Walk Away")) {
					Intent intent = new Intent(Allsongs.this, Tre.class);     
	                intent.putExtra("track", 9);
	                startActivity(intent);}
				if (values.equals("Walking Alone")) {
					Intent intent = new Intent(Allsongs.this, Nimrod.class);     
	                intent.putExtra("track", 13);
	                startActivity(intent);}
				if (values.equals("Walking Contradiction")) {
					Intent intent = new Intent(Allsongs.this, Insomniac.class);     
	                intent.putExtra("track", 14);
	                startActivity(intent);}
				if (values.equals("Warning")) {
					Intent intent = new Intent(Allsongs.this, WarningMain.class);     
	                intent.putExtra("track", 1);
	                startActivity(intent);}
				//if (values.equals("Welcome To Paradise")) {
					//i=new Intent(Allsongs.this, Welcome.class);
					//startActivity(i);}
				if (values.equals("Welcome To Paradise")) {
					Intent intent = new Intent(Allsongs.this, Dookie.class);     
	                intent.putExtra("track", 6);
	                startActivity(intent);}
				if (values.equals("Westbound Sign")) {
					Intent intent = new Intent(Allsongs.this, Insomniac.class);     
	                intent.putExtra("track", 12);
	                startActivity(intent);}
				if (values.equals("Whatsername")) {
					Intent intent = new Intent(Allsongs.this, AmericanIdiotMain.class);     
	                intent.putExtra("track", 13);
	                startActivity(intent);}
				if (values.equals("When I Come Around")) {
					Intent intent = new Intent(Allsongs.this, Dookie.class);     
	                intent.putExtra("track", 11);
	                startActivity(intent);}
				if (values.equals("Who Wrote Holden Caulfield?")) {
					Intent intent = new Intent(Allsongs.this, Kerplunk.class);     
	                intent.putExtra("track", 11);
	                startActivity(intent);}
				if (values.equals("Why Do You Want Him?")) {
					Intent intent = new Intent(Allsongs.this, Tns.class);     
	                intent.putExtra("track", 12);
	                startActivity(intent);}
				if (values.equals("Wild One")) {
					Intent intent = new Intent(Allsongs.this, Dos.class);   
               	 	intent.putExtra("track", 5);
	                startActivity(intent);}
				if (values.equals("Words I Might Have Ate")) {
					Intent intent = new Intent(Allsongs.this, Kerplunk.class);     
	                intent.putExtra("track", 12);
	                startActivity(intent);}
				if (values.equals("Worry Rock")) {
					Intent intent = new Intent(Allsongs.this, Nimrod.class);     
	                intent.putExtra("track", 7);
	                startActivity(intent);}
				if (values.equals("Wow! That's Loud")) {
					Intent intent = new Intent(Allsongs.this, Dos.class);     
	                intent.putExtra("track", 12);
	                startActivity(intent);}
				if (values.equals("X-Kid")) {
					Intent intent = new Intent(Allsongs.this, Tre.class);   
               	 	intent.putExtra("track", 5);
	                startActivity(intent);}
				if (values.equals("You Lied")) {
					Intent intent = new Intent(Allsongs.this, Shenanigans.class);     
	                intent.putExtra("track", 3);
	                startActivity(intent);}
				if (values.equals("�Viva La Gloria!")) {
					Intent intent = new Intent(Allsongs.this, TcbMain.class);     
	                intent.putExtra("track", 4);
	                startActivity(intent);}
				if (values.equals("�Viva La Gloria? (Little Girl)")) {
					Intent intent = new Intent(Allsongs.this, TcbMain.class);     
	                intent.putExtra("track", 12);
	                startActivity(intent);}
				
				/*
				 * Demolicious
				 */
				if (values.equals("99 Revolutions (Demo)")) {
					Intent newActivity = new Intent(Allsongs.this, Demolicious.class);     
	                newActivity.putExtra("track", 1);
	                startActivity(newActivity);
				}
				if (values.equals("Angel Blue (Demo)")) {
					Intent newActivity = new Intent(Allsongs.this, Demolicious.class);     
	                newActivity.putExtra("track", 2);
	                startActivity(newActivity);
				}if (values.equals("Carpe Diem (Demo)")) {
					Intent newActivity = new Intent(Allsongs.this, Demolicious.class);     
	                newActivity.putExtra("track", 3);
	                startActivity(newActivity);
				}if (values.equals("State Of Shock")) {
					Intent newActivity = new Intent(Allsongs.this, Demolicious.class);     
	                newActivity.putExtra("track", 4);
	                startActivity(newActivity);
				}if (values.equals("Let Yourself Go (Demo)")) {
					Intent newActivity = new Intent(Allsongs.this, Demolicious.class);     
	                newActivity.putExtra("track", 5);
	                startActivity(newActivity);
				}if (values.equals("Sex, Drugs And Violence (Demo)")) {
					Intent newActivity = new Intent(Allsongs.this, Demolicious.class);     
	                newActivity.putExtra("track", 6);
	                startActivity(newActivity);
				}if (values.equals("Ashley (Demo)")) {
					Intent newActivity = new Intent(Allsongs.this, Demolicious.class);     
	                newActivity.putExtra("track", 7);
	                startActivity(newActivity);
				}if (values.equals("Fell For You (Demo)")) {
					Intent newActivity = new Intent(Allsongs.this, Demolicious.class);     
	                newActivity.putExtra("track", 8);
	                startActivity(newActivity);
				}if (values.equals("Stay The Night (Demo)")) {
					Intent newActivity = new Intent(Allsongs.this, Demolicious.class);     
	                newActivity.putExtra("track", 9);
	                startActivity(newActivity);
				}if (values.equals("Nuclear Family (Demo)")) {
					Intent newActivity = new Intent(Allsongs.this, Demolicious.class);     
	                newActivity.putExtra("track", 10);
	                startActivity(newActivity);
				}if (values.equals("Stray Heart (Demo)")) {
					Intent newActivity = new Intent(Allsongs.this, Demolicious.class);     
	                newActivity.putExtra("track", 11);
	                startActivity(newActivity);
				}if (values.equals("Rusty James (Demo)")) {
					Intent newActivity = new Intent(Allsongs.this, Demolicious.class);     
	                newActivity.putExtra("track", 12);
	                startActivity(newActivity);
				}if (values.equals("A Little Boy Named Train (Demo)")) {
					Intent newActivity = new Intent(Allsongs.this, Demolicious.class);     
	                newActivity.putExtra("track", 13);
	                startActivity(newActivity);
				}if (values.equals("Baby Eyes (Demo)")) {
					Intent newActivity = new Intent(Allsongs.this, Demolicious.class);     
	                newActivity.putExtra("track", 14);
	                startActivity(newActivity);
				}if (values.equals("Makeout Party (Demo)")) {
					Intent newActivity = new Intent(Allsongs.this, Demolicious.class);     
	                newActivity.putExtra("track", 15);
	                startActivity(newActivity);
				}if (values.equals("Oh Love (Demo)")) {
					Intent newActivity = new Intent(Allsongs.this, Demolicious.class);     
	                newActivity.putExtra("track", 16);
	                startActivity(newActivity);
				}if (values.equals("Missing You (Demo)")) {
					Intent newActivity = new Intent(Allsongs.this, Demolicious.class);     
	                newActivity.putExtra("track", 17);
	                startActivity(newActivity);
				}if (values.equals("Stay The Night (Acoustic)")) {
					Intent newActivity = new Intent(Allsongs.this, Demolicious.class);     
	                newActivity.putExtra("track", 18);
	                startActivity(newActivity);
				}
				
			}
		});
	}

		@Override
	    public boolean onCreateOptionsMenu(Menu menu) {
	        getMenuInflater().inflate(R.menu.main_all, menu);
	        
	        return true;
	    }
		
		@Override
		public boolean onOptionsItemSelected(MenuItem item) {
			switch (item.getItemId()) {

			case android.R.id.home:
				onBackPressed();
				break;

			default:

			};
			if(item.getItemId()==R.id.item1)
			{
				startActivity(new Intent(getApplicationContext(), Settings.class));
			}
			if(item.getItemId()==R.id.item2)
			{
				Intent intent = new Intent(this, ReportSong.class);
				intent.putExtra("report_sub", "Feedback");
				startActivity(intent);
			}
		            return super.onOptionsItemSelected(item);	
		}
		
		//Fetches broadcast sent by music player
		private BroadcastReceiver mReceiver = new BroadcastReceiver() {

			@SuppressWarnings("unused")
			@Override
			public void onReceive(Context context, Intent intent)
			{
			String action = intent.getAction();
			String artist = intent.getStringExtra("artist");
			final String album = intent.getStringExtra("album");
			final String track = intent.getStringExtra("track");
			Log.d("Music",artist+":"+album+":"+track);
			SharedPreferences prefs = context.getSharedPreferences(
				      "EXTRA_PREF", Context.MODE_PRIVATE);
			prefs.edit().putString("song", track).commit();
			}
		};
		
		@Override
		protected void onDestroy() {
			// TODO Auto-generated method stub
			//To avoid intent leak
			unregisterReceiver(mReceiver);
			super.onDestroy();
		}
}
