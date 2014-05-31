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
		
		String[] values = new String []
				{
				"1,000 Hours",
				"16",
				"2000 Light Years Away",
				"21 Guns",
				"21st Century Breakdown",
				"409 In Your Coffeemaker",
				"80",
				"86",
				"8th Avenue Serenade",
				"99 Revolutions",
				"99 Revolutions (Demo)",
				"All By Myself",
				"All The Time",
				"Amanda",
				"American Eulogy (Mass Hysteria/Modern World)",
				"American Idiot",
				"Amy",
				"Android",
				"Angel Blue",
				"Angel Blue (Demo)",
				"Are We The Waiting",
				"Armatage Shanks",
				"Ashley",
				"Ashley (Demo)",
				"A Little Boy Named Train (Demo)",
				"At The Library",
				"Bab's Uvula Who?",
				"Baby Eyes",
				"Baby Eyes (Demo)",
				"Basket Case",
				"Before The Lobotomy",
				"Best Thing In Town",
				"Blood, Sex And Booze",
				"Boulevard Of Broken Dreams",
				"Brain Stew",
				"Brat",
				"Brutal Love",
				"Burnout",
				"Carpe Diem",
				"Carpe Diem (Demo)",
				"Castaway",
				"Christian's Inferno",
				"Christie Road",
				"Chump",
				"Church On Sunday",
				"Coming Clean",
				"Deadbeat Holiday",
				"Desensitized",
				"Dirty Rotten Bastards",
				"Disappearing Boy",
				"Do Da Da",
				"Dominated Love Slave",
				"Don't Leave Me",
				"Don't Wanna Fall In Love",
				"Drama Queen",
				"Dry Ice",
				"East Jesus Nowhere",
				"Emenius Sleepus",
				"Espionage",
				"Extraordinary Girl",
				"F.O.D.",
				"Fashion Victim",
				"Fell For You",
				"Fell For You (Demo)",
				"Fuck Time",
				"Geek Stink Breath",
				"Give Me Novacaine",
				"Going To Pasalacqua",
				"Good Riddance (Time Of Your Life)",
				"Green Day",
				"Ha Ha You're Dead",
				"Haushinka",
				"Having A Blast",
				"Hitchin' A Ride",
				"Hold On",
				"Holiday",
				"Homecoming",
				"Horseshoes And Handgrenades",
				"I Want To Be Alone",
				"I Want To Be On T.V.",
				"I Was There",
				"In The End",
				"Jackass",
				"Jaded",
				"J.A.R. (Jason Andrew Relva)",
				"Jesus Of Suburbia",
				"Jinx",
				"Kill The DJ",
				"King For A Day",
				"Know Your Enemy",
				"Knowledge",
				"Lady Cobra",
				"Last Night On Earth",
				"Last Of American Girls",
				"Lazy Bones",
				"Let Yourself Go",
				"Let Yourself Go (Demo)",
				"Letterbomb",
				"Little Boy Named Train",
				"Longview",
				"Loss Of Control",
				"Macy's Day Parade",
				"Makeout Party",
				"Makeout Party (Demo)",
				"Minority",
				"Maria",
				"Misery",
				"Missing You",
				"Missing You (Demo)",
				"Murder City",
				"My Generation",
				"Nice Guys Finish Last",
				"Nightlife",
				"No One Knows",
				"No Pride",
				"Nuclear Family",
				"Nuclear Family (Demo)",
				"Oh Love",
				"Oh Love (Demo)",
				"On The Wagon",
				"One For The Razorbacks",
				"One Of My Lies",
				"Only Of You",
				"Outsider",
				"Panic Song",
				"Paper Lanterns",
				"Peacemaker",
				"Platypus (I Hate You)",
				"Poprocks & Coke",
				"Private Ale",
				"Prosthetic Head",
				"Pulling Teeth",
				"Redundant",
				"Reject",
				"Rest",
				"Restless Heart Syndrome",
				"Road To Acceptance",
				"Rotting",
				"Rusty James",
				"Rusty James (Demo)",
				"Sassafras Roots",
				"Scattered",
				"Scumbag",
				"See The Light",
				"See You Tonight",
				"Sex, Drugs & Violence",
				"Sex, Drugs And Violence (Demo)",
				"She",
				"She's A Rebel",
				"Sick Of Me",
				"Song Of The Century",
				"St. Jimmy",
				"State Of Shock",
				"Stay The Night (Acoustic)",
				"Stay The Night",
				"Stay The Night (Demo)",
				"Stop When The Red Lights Flash",
				"Strangeland",
				"Stray Heart",
				"Stray Heart (Demo)",
				"Stuart And The Ave.",
				"Stuck With Me",
				"Suffocate",
				"Sweet 16",
				"Sweet Children",
				"Take Back",
				"The Forgotten",
				"The Grouch",
				"The Judge's Daughter",
				"The One I Want",
				"The Static Age",
				"Tight Wadd Hill",
				"Tired Of Waiting For You",
				"Troublemaker",
				"Uptight",
				"Waiting",
				"Wake Me Up When September Ends",
				"Walk Away",
				"Walking Alone",
				"Walking Contradiction",
				"Warning",
				"Welcome To Paradise",
				"Westbound Sign",
				"Whatsername",
				"When I Come Around",
				"Who Wrote Holden Caulfield?",
				"Why Do You Want Him?",
				"Wild One",
				"Words I Might Have Ate",
				"Worry Rock",
				"Wow! That's Loud",
				"X-Kid",
				"You Lied",
				"¡Viva La Gloria!",
				"¿Viva La Gloria? (Little Girl)"
				};
		
		adapter= new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, values);
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
				String values = adapter.getItem(position);
				// TODO Auto-generated method stub

				if (values=="1,000 Hours") {
					Intent intent = new Intent(Allsongs.this, Tns.class);     
	                intent.putExtra("track", 15);
	                startActivity(intent);}
				if (values=="16") {
					Intent intent = new Intent(Allsongs.this, Tns.class);     
	                intent.putExtra("track", 7);
	                startActivity(intent);}
				if (values=="2000 Light Years Away") {
					Intent intent = new Intent(Allsongs.this, Kerplunk.class);     
	                intent.putExtra("track", 1);
	                startActivity(intent);}
				if (values=="21 Guns") {
					Intent intent = new Intent(Allsongs.this, TcbMain.class);     
	                intent.putExtra("track", 16);
	                startActivity(intent);}
				if (values=="21st Century Breakdown") {
					Intent intent1 = new Intent(Allsongs.this, TcbMain.class);     
	                intent1.putExtra("track", 2);
	                startActivity(intent1);}
				if (values=="409 In Your Coffeemaker") {
					Intent intent = new Intent(Allsongs.this, Tns.class);     
	                intent.putExtra("track", 13);
	                startActivity(intent);}
				if (values=="80") {
					Intent intent = new Intent(Allsongs.this, Kerplunk.class);     
	                intent.putExtra("track", 8);
	                startActivity(intent);}
				if (values=="86") {
					Intent intent = new Intent(Allsongs.this, Insomniac.class);     
	                intent.putExtra("track", 7);
	                startActivity(intent);}
				if (values=="8th Avenue Serenade") {
					Intent intent = new Intent(Allsongs.this, Tre.class);     
	                intent.putExtra("track", 3);
	                startActivity(intent);}
				if (values=="99 Revolutions") {
					Intent intent = new Intent(Allsongs.this, Tre.class);     
	                intent.putExtra("track", 11);
	                startActivity(intent);}
				if (values=="All By Myself") {
					Intent intent = new Intent(Allsongs.this, Dookie.class);     
	                intent.putExtra("track", 1);
	                startActivity(intent);}
				if (values=="All The Time") {
					Intent intent = new Intent(Allsongs.this, Nimrod.class);     
	                intent.putExtra("track", 6);
	                startActivity(intent);}
				if (values=="Amanda") {
					Intent intent = new Intent(Allsongs.this, Tre.class);     
	                intent.putExtra("track", 8);
	                startActivity(intent);}
				if (values=="American Eulogy (Mass Hysteria/Modern World)") {
					Intent intent = new Intent(Allsongs.this, TcbMain.class);     
	                intent.putExtra("track", 17);
	                startActivity(intent);}
				if (values=="American Idiot") {
					Intent intent = new Intent(Allsongs.this, AmericanIdiotMain.class);     
	                intent.putExtra("track", 1);
	                startActivity(intent);}
				if (values=="Amy") {
					Intent intent = new Intent(Allsongs.this, Dos.class);     
	                intent.putExtra("track", 13);
	                startActivity(intent);}
				if (values=="Android") {
					Intent intent = new Intent(Allsongs.this, Kerplunk.class);     
	                intent.putExtra("track", 9);
	                startActivity(intent);}
				if (values=="Angel Blue") {
					Intent intent = new Intent(Allsongs.this, Uno.class);     
	                intent.putExtra("track", 9);
	                startActivity(intent);}
				if (values=="Are We The Waiting") {
					Intent intent = new Intent(Allsongs.this, AmericanIdiotMain.class);   
               	 	intent.putExtra("track", 5);
	                startActivity(intent);}
				if (values=="Armatage Shanks") {
					Intent intent = new Intent(Allsongs.this, Insomniac.class);     
	                intent.putExtra("track", 1);
	                startActivity(intent);}
				if (values=="Ashley") {
					Intent intent = new Intent(Allsongs.this, Dos.class);     
	                intent.putExtra("track", 8);
	                startActivity(intent);}
				if (values=="At The Library") {
					Intent intent = new Intent(Allsongs.this, Tns.class);     
	                intent.putExtra("track", 1);
	                startActivity(intent);}
				if (values=="Bab's Uvula Who?") {
					Intent intent = new Intent(Allsongs.this, Insomniac.class);     
	                intent.putExtra("track", 6);
	                startActivity(intent);}
				if (values=="Baby Eyes") {
					Intent intent = new Intent(Allsongs.this, Dos.class);     
	                intent.putExtra("track", 9);
	                startActivity(intent);}
				if (values=="Basket Case") {
					Intent intent = new Intent(Allsongs.this, Dookie.class);     
	                intent.putExtra("track", 8);
	                startActivity(intent);}
				if (values=="Before The Lobotomy") {
					Intent intent = new Intent(Allsongs.this, TcbMain.class);   
               	 	intent.putExtra("track", 5);
	                startActivity(intent);}
				if (values=="Best Thing In Town") {
					Intent intent = new Intent(Allsongs.this, Kerplunk.class);     
	                intent.putExtra("track", 14);
	                startActivity(intent);}
				if (values=="Blood, Sex And Booze") {
					Intent intent1 = new Intent(Allsongs.this, WarningMain.class);     
                    intent1.putExtra("track", 2);
                    startActivity(intent1);}
				if (values=="Boulevard Of Broken Dreams") {
					Intent intent = new Intent(Allsongs.this, AmericanIdiotMain.class);     
	                intent.putExtra("track", 4);
	                startActivity(intent);}
				if (values=="Brain Stew") {
					Intent intent = new Intent(Allsongs.this, Insomniac.class);     
	                intent.putExtra("track", 10);
	                startActivity(intent);}
				if (values=="Brat") {
					Intent intent1 = new Intent(Allsongs.this, Insomniac.class);     
	                intent1.putExtra("track", 2);
	                startActivity(intent1);}
				if (values=="Brutal Love") {
					Intent intent = new Intent(Allsongs.this, Tre.class);     
	                intent.putExtra("track", 1);
	                startActivity(intent);}
				if (values=="Burnout") {
					Intent intent1 = new Intent(Allsongs.this, Dookie.class);     
	                intent1.putExtra("track", 2);
	                startActivity(intent1);}
				if (values=="Carpe Diem") {
					Intent intent = new Intent(Allsongs.this, Uno.class);     
	                intent.putExtra("track", 3);
	                startActivity(intent);}
				if (values=="Castaway") {
					Intent intent = new Intent(Allsongs.this, WarningMain.class);     
                    intent.putExtra("track", 5);
                    startActivity(intent);}
				if (values=="Christian's Inferno") {
					Intent intent = new Intent(Allsongs.this, TcbMain.class);     
	                intent.putExtra("track", 6);
	                startActivity(intent);}
				if (values=="Christie Road") {
					Intent intent = new Intent(Allsongs.this, Kerplunk.class);     
	                intent.putExtra("track", 4);
	                startActivity(intent);}
				if (values=="Chump") {
					Intent intent = new Intent(Allsongs.this, Dookie.class);     
	                intent.putExtra("track", 4);
	                startActivity(intent);}
				if (values=="Church On Sunday") {
					Intent intent = new Intent(Allsongs.this, WarningMain.class);     
                    intent.putExtra("track", 3);
                    startActivity(intent);}
				if (values=="Coming Clean") {
					Intent intent = new Intent(Allsongs.this, Dookie.class);     
	                intent.putExtra("track", 12);
	                startActivity(intent);}
				if (values=="Deadbeat Holiday") {
					Intent intent = new Intent(Allsongs.this, WarningMain.class);     
                    intent.putExtra("track", 7);
                    startActivity(intent);}
				if (values=="Desensitized") {
					Intent intent1 = new Intent(Allsongs.this, Shenanigans.class);     
	                intent1.putExtra("track", 2);
	                startActivity(intent1);}
				if (values=="Dirty Rotten Bastards") {
					Intent intent = new Intent(Allsongs.this, Tre.class);     
	                intent.putExtra("track", 10);
	                startActivity(intent);}
				if (values=="Disappearing Boy") {
					Intent intent = new Intent(Allsongs.this, Tns.class);     
	                intent.putExtra("track", 4);
	                startActivity(intent);}
				if (values=="Do Da Da") {
					Intent intent = new Intent(Allsongs.this, Shenanigans.class);     
	                intent.putExtra("track", 12);
	                startActivity(intent);}
				if (values=="Dominated Love Slave") {
					Intent intent = new Intent(Allsongs.this, Kerplunk.class);     
	                intent.putExtra("track", 6);
	                startActivity(intent);}
				if (values=="Don't Leave Me") {
					Intent intent1 = new Intent(Allsongs.this, Tns.class);     
	                intent1.putExtra("track", 2);
	                startActivity(intent1);}
				if (values=="Don't Wanna Fall In Love") {
					Intent intent = new Intent(Allsongs.this, Shenanigans.class);   
               	 	intent.putExtra("track", 5);
	                startActivity(intent);}
				if (values=="Drama Queen") {
					Intent intent = new Intent(Allsongs.this, Tre.class);     
	                intent.putExtra("track", 4);
	                startActivity(intent);}
				if (values=="Dry Ice") {
					Intent intent = new Intent(Allsongs.this, Tns.class);     
	                intent.putExtra("track", 16);
	                startActivity(intent);}
				if (values=="East Jesus Nowhere") {
					Intent intent = new Intent(Allsongs.this, TcbMain.class);     
	                intent.putExtra("track", 8);
	                startActivity(intent);}
				if (values=="Emenius Sleepus") {
					Intent intent = new Intent(Allsongs.this, Dookie.class);     
	                intent.putExtra("track", 13);
	                startActivity(intent);}
				if (values=="Espionage") {
					Intent intent = new Intent(Allsongs.this, Shenanigans.class);     
	                intent.putExtra("track", 6);
	                startActivity(intent);}
				if (values=="Extraordinary Girl") {
					Intent intent = new Intent(Allsongs.this, AmericanIdiotMain.class);     
	                intent.putExtra("track", 9);
	                startActivity(intent);}
				if (values=="F.O.D.") {
					Intent intent = new Intent(Allsongs.this, Dookie.class);     
	                intent.putExtra("track", 15);
	                startActivity(intent);}
				if (values=="Fashion Victim") {
					Intent intent = new Intent(Allsongs.this, WarningMain.class);     
                    intent.putExtra("track", 4);
                    startActivity(intent);}
				if (values=="Fell For You") {
					Intent intent = new Intent(Allsongs.this, Uno.class);     
	                intent.putExtra("track", 6);
	                startActivity(intent);}
				if (values=="Fuck Time") {
					Intent intent1 = new Intent(Allsongs.this, Dos.class);     
	                intent1.putExtra("track", 2);
	                startActivity(intent1);}
				if (values=="Geek Stink Breath") {
					Intent intent = new Intent(Allsongs.this, Insomniac.class);     
	                intent.putExtra("track", 4);
	                startActivity(intent);}
				if (values=="Give Me Novacaine") {
					Intent intent = new Intent(Allsongs.this, AmericanIdiotMain.class);     
	                intent.putExtra("track", 7);
	                startActivity(intent);}
				if (values=="Going To Pasalacqua") {
					Intent intent = new Intent(Allsongs.this, Tns.class);     
	                intent.putExtra("track", 6);
	                startActivity(intent);}
				if (values=="Good Riddance (Time Of Your Life)") {
					Intent intent = new Intent(Allsongs.this, Nimrod.class);     
	                intent.putExtra("track", 17);
	                startActivity(intent);}
				if (values=="Green Day") {
					Intent intent = new Intent(Allsongs.this, Tns.class);   
               	 	intent.putExtra("track", 5);
	                startActivity(intent);}
				if (values=="Ha Ha You're Dead") {
					Intent intent = new Intent(Allsongs.this, Shenanigans.class);     
	                intent.putExtra("track", 14);
	                startActivity(intent);}
				if (values=="Haushinka") {
					Intent intent = new Intent(Allsongs.this, Nimrod.class);     
	                intent.putExtra("track", 12);
	                startActivity(intent);}
				if (values=="Having A Blast") {
					Intent intent = new Intent(Allsongs.this, Dookie.class);     
	                intent.putExtra("track", 3);
	                startActivity(intent);}
				if (values=="Hitchin' A Ride") {
					Intent intent1 = new Intent(Allsongs.this, Nimrod.class);     
	                intent1.putExtra("track", 2);
	                startActivity(intent1);}
				if (values=="Hold On") {
					Intent intent = new Intent(Allsongs.this, WarningMain.class);     
	                intent.putExtra("track", 8);
	                startActivity(intent);}
				if (values=="Holiday") {
					Intent intent = new Intent(Allsongs.this, AmericanIdiotMain.class);     
	                intent.putExtra("track", 3);
	                startActivity(intent);}
				if (values=="Homecoming") {
					Intent intent = new Intent(Allsongs.this, AmericanIdiotMain.class);     
	                intent.putExtra("track", 12);
	                startActivity(intent);}
				if (values=="Horseshoes And Handgrenades") {
					Intent intent = new Intent(Allsongs.this, TcbMain.class);     
	                intent.putExtra("track", 14);
	                startActivity(intent);}
				if (values=="I Want To Be Alone") {
					Intent intent = new Intent(Allsongs.this, Tns.class);     
	                intent.putExtra("track", 19);
	                startActivity(intent);}
				if (values=="I Want To Be On T.V.") {
					Intent intent = new Intent(Allsongs.this, Shenanigans.class);     
	                intent.putExtra("track", 7);
	                startActivity(intent);}
				if (values=="I Was There") {
					Intent intent = new Intent(Allsongs.this, Tns.class);     
	                intent.putExtra("track", 3);
	                startActivity(intent);}
				if (values=="In The End") {
					Intent intent = new Intent(Allsongs.this, Dookie.class);     
	                intent.putExtra("track", 14);
	                startActivity(intent);}
				if (values=="Jackass") {
					Intent intent = new Intent(Allsongs.this, WarningMain.class);     
	                intent.putExtra("track", 9);
	                startActivity(intent);}
				if (values=="Jaded") {
					Intent intent = new Intent(Allsongs.this, Insomniac.class);     
	                intent.putExtra("track", 11);
	                startActivity(intent);}
				if (values=="J.A.R. (Jason Andrew Relva)") {
					Intent intent = new Intent(Allsongs.this, Ins.class);     
	                intent.putExtra("track", 8);
	                startActivity(intent);}
				if (values=="Jesus Of Suburbia") {
					Intent intent1 = new Intent(Allsongs.this, AmericanIdiotMain.class);     
	                intent1.putExtra("track", 2);
	                startActivity(intent1);}
				if (values=="Jinx") {
					Intent intent = new Intent(Allsongs.this, Nimrod.class);     
	                intent.putExtra("track", 11);
	                startActivity(intent);}
				if (values=="Kill The DJ") {
					Intent intent = new Intent(Allsongs.this, Uno.class);   
               	 	intent.putExtra("track", 5);
	                startActivity(intent);}
				if (values=="King For A Day") {
					Intent intent = new Intent(Allsongs.this, Nimrod.class);     
	                intent.putExtra("track", 16);
	                startActivity(intent);}
				if (values=="Know Your Enemy") {
					Intent intent = new Intent(Allsongs.this, TcbMain.class);     
	                intent.putExtra("track", 3);
	                startActivity(intent);}
				if (values=="Knowledge") {
					Intent intent = new Intent(Allsongs.this, Tns.class);     
	                intent.putExtra("track", 14);
	                startActivity(intent);}
				if (values=="Lady Cobra") {
					Intent intent = new Intent(Allsongs.this, Dos.class);     
	                intent.putExtra("track", 10);
	                startActivity(intent);}
				if (values=="Last Night On Earth") {
					Intent intent = new Intent(Allsongs.this, TcbMain.class);     
	                intent.putExtra("track", 7);
	                startActivity(intent);}
				if (values=="Last Of American Girls") {
					Intent intent = new Intent(Allsongs.this, TcbMain.class);     
	                intent.putExtra("track", 10);
	                startActivity(intent);}
				if (values=="Lazy Bones") {
					Intent intent = new Intent(Allsongs.this, Dos.class);     
	                intent.putExtra("track", 4);
	                startActivity(intent);}
				if (values=="Let Yourself Go") {
					Intent intent = new Intent(Allsongs.this, Uno.class);     
	                intent.putExtra("track", 4);
	                startActivity(intent);}
				if (values=="Letterbomb") {
					Intent intent = new Intent(Allsongs.this, AmericanIdiotMain.class);     
	                intent.putExtra("track", 10);
	                startActivity(intent);}
				if (values=="Little Boy Named Train") {
					Intent intent = new Intent(Allsongs.this, Tre.class);     
	                intent.putExtra("track", 7);
	                startActivity(intent);}
				if (values=="Longview") {
					Intent intent = new Intent(Allsongs.this, Dookie.class);   
               	 	intent.putExtra("track", 5);
	                startActivity(intent);}
				if (values=="Loss Of Control") {
					Intent intent = new Intent(Allsongs.this, Uno.class);     
	                intent.putExtra("track", 7);
	                startActivity(intent);}
				if (values=="Macy's Day Parade") {
					Intent intent = new Intent(Allsongs.this, WarningMain.class);     
	                intent.putExtra("track", 12);
	                startActivity(intent);}
				if (values=="Makeout Party") {
					Intent intent = new Intent(Allsongs.this, Dos.class);     
	                intent.putExtra("track", 6);
	                startActivity(intent);}
				if (values=="Minority") {
					Intent intent = new Intent(Allsongs.this, WarningMain.class);     
	                intent.putExtra("track", 11);
	                startActivity(intent);}
				if (values=="Maria") {
					Intent intent = new Intent(Allsongs.this, Ins.class);     
	                intent.putExtra("track", 1);
	                startActivity(intent);}
				if (values=="Misery") {
					Intent intent = new Intent(Allsongs.this, WarningMain.class);     
	                intent.putExtra("track", 6);
	                startActivity(intent);}
				if (values=="Missing You") {
					Intent intent1 = new Intent(Allsongs.this, Tre.class);     
	                intent1.putExtra("track", 2);
	                startActivity(intent1);}
				if (values=="Murder City") {
					Intent intent = new Intent(Allsongs.this, TcbMain.class);     
	                intent.putExtra("track", 11);
	                startActivity(intent);}
				if (values=="My Generation") {
					Intent intent = new Intent(Allsongs.this, Kerplunk.class);     
	                intent.putExtra("track", 16);
	                startActivity(intent);}
				if (values=="Nice Guys Finish Last") {
					Intent intent = new Intent(Allsongs.this, Nimrod.class);     
	                intent.putExtra("track", 1);
	                startActivity(intent);}
				if (values=="Nightlife") {
					Intent intent = new Intent(Allsongs.this, Dos.class);     
	                intent.putExtra("track", 11);
	                startActivity(intent);}
				if (values=="No One Knows") {
					Intent intent = new Intent(Allsongs.this, Kerplunk.class);     
	                intent.putExtra("track", 10);
	                startActivity(intent);}
				if (values=="No Pride") {
					Intent intent = new Intent(Allsongs.this, Insomniac.class);   
               	 	intent.putExtra("track", 5);
	                startActivity(intent);}
				if (values=="Nuclear Family") {
					Intent intent = new Intent(Allsongs.this, Uno.class);     
	                intent.putExtra("track", 1);
	                startActivity(intent);}
				if (values=="Oh Love") {
					Intent intent = new Intent(Allsongs.this, Uno.class);     
	                intent.putExtra("track", 12);
	                startActivity(intent);}
				if (values=="On The Wagon") {
					Intent intent = new Intent(Allsongs.this, Shenanigans.class);     
	                intent.putExtra("track", 13);
	                startActivity(intent);}
				if (values=="One For The Razorbacks") {
					Intent intent1 = new Intent(Allsongs.this, Kerplunk.class);     
	                intent1.putExtra("track", 2);
	                startActivity(intent1);}
				if (values=="One Of My Lies") {
					Intent intent = new Intent(Allsongs.this, Kerplunk.class);     
	                intent.putExtra("track", 7);
	                startActivity(intent);}
				if (values=="Only Of You") {
					Intent intent = new Intent(Allsongs.this, Tns.class);     
	                intent.putExtra("track", 17);
	                startActivity(intent);}
				if (values=="Outsider") {
					Intent intent = new Intent(Allsongs.this, Shenanigans.class);     
	                intent.putExtra("track", 4);
	                startActivity(intent);}
				if (values=="Panic Song") {
					Intent intent = new Intent(Allsongs.this, Insomniac.class);     
	                intent.putExtra("track", 8);
	                startActivity(intent);}
				if (values=="Paper Lanterns") {
					Intent intent = new Intent(Allsongs.this, Tns.class);     
	                intent.putExtra("track", 11);
	                startActivity(intent);}
				if (values=="Peacemaker") {
					Intent intent = new Intent(Allsongs.this, TcbMain.class);     
	                intent.putExtra("track", 9);
	                startActivity(intent);}
				if (values=="Platypus (I Hate You)") {
					Intent intent = new Intent(Allsongs.this, Nimrod.class);     
	                intent.putExtra("track", 8);
	                startActivity(intent);}
				if (values=="Poprocks & Coke") {
					Intent intent1 = new Intent(Allsongs.this, Ins.class);     
	                intent1.putExtra("track", 2);
	                startActivity(intent1);}
				if (values=="Private Ale") {
					Intent intent = new Intent(Allsongs.this, Kerplunk.class);   
               	 	intent.putExtra("track", 5);
	                startActivity(intent);}
				if (values=="Prosthetic Head") {
					Intent intent = new Intent(Allsongs.this, Nimrod.class);     
	                intent.putExtra("track", 18);
	                startActivity(intent);}
				if (values=="Pulling Teeth") {
					Intent intent = new Intent(Allsongs.this, Dookie.class);     
	                intent.putExtra("track", 7);
	                startActivity(intent);}
				if (values=="Redundant") {
					Intent intent = new Intent(Allsongs.this, Nimrod.class);     
	                intent.putExtra("track", 4);
	                startActivity(intent);}
				if (values=="Reject") {
					Intent intent = new Intent(Allsongs.this, Nimrod.class);     
	                intent.putExtra("track", 14);
	                startActivity(intent);}
				if (values=="Rest") {
					Intent intent = new Intent(Allsongs.this, Tns.class);     
	                intent.putExtra("track", 9);
	                startActivity(intent);}
				if (values=="Restless Heart Syndrome") {
					Intent intent = new Intent(Allsongs.this, TcbMain.class);     
	                intent.putExtra("track", 13);
	                startActivity(intent);}
				if (values=="Road To Acceptance") {
					Intent intent = new Intent(Allsongs.this, Tns.class);     
	                intent.putExtra("track", 8);
	                startActivity(intent);}
				if (values=="Rotting") {
					Intent intent = new Intent(Allsongs.this, Shenanigans.class);     
	                intent.putExtra("track", 11);
	                startActivity(intent);}
				if (values=="Rusty James") {
					Intent intent = new Intent(Allsongs.this, Uno.class);     
	                intent.putExtra("track", 11);
	                startActivity(intent);}
				if (values=="Sassafras Roots") {
					Intent intent = new Intent(Allsongs.this, Dookie.class);     
	                intent.putExtra("track", 10);
	                startActivity(intent);}
				if (values=="Scattered") {
					Intent intent = new Intent(Allsongs.this, Nimrod.class);   
               	 	intent.putExtra("track", 5);
	                startActivity(intent);}
				if (values=="Scumbag") {
					Intent intent = new Intent(Allsongs.this, Shenanigans.class);     
	                intent.putExtra("track", 8);
	                startActivity(intent);}
				if (values=="See The Light") {
					Intent intent = new Intent(Allsongs.this, TcbMain.class);     
	                intent.putExtra("track", 18);
	                startActivity(intent);}
				if (values=="See You Tonight") {
					Intent intent = new Intent(Allsongs.this, Dos.class);     
	                intent.putExtra("track", 1);
	                startActivity(intent);}
				if (values=="Sex, Drugs & Violence") {
					Intent intent = new Intent(Allsongs.this, Tre.class);     
	                intent.putExtra("track", 6);
	                startActivity(intent);}
				if (values=="She") {
					Intent intent = new Intent(Allsongs.this, Dookie.class);     
	                intent.putExtra("track", 9);
	                startActivity(intent);}
				if (values=="She's A Rebel") {
					Intent intent = new Intent(Allsongs.this, AmericanIdiotMain.class);     
	                intent.putExtra("track", 8);
	                startActivity(intent);}
				if (values=="Sick Of Me") {
					Intent intent = new Intent(Allsongs.this, Shenanigans.class);     
	                intent.putExtra("track", 10);
	                startActivity(intent);}
				if (values=="Song Of The Century") {
					Intent intent = new Intent(Allsongs.this, TcbMain.class);     
	                intent.putExtra("track", 1);
	                startActivity(intent);}
				if (values=="St. Jimmy") {
					Intent intent = new Intent(Allsongs.this, AmericanIdiotMain.class);     
	                intent.putExtra("track", 6);
	                startActivity(intent);}
				if (values=="Stay The Night") {
					Intent intent1 = new Intent(Allsongs.this, Uno.class);     
	                intent1.putExtra("track", 2);
	                startActivity(intent1);}
				if (values=="Stop When The Red Lights Flash") {
					Intent intent = new Intent(Allsongs.this, Dos.class);     
	                intent.putExtra("track", 3);
	                startActivity(intent);}
				if (values=="Strangeland") {
					Intent intent = new Intent(Allsongs.this, Kerplunk.class);     
	                intent.putExtra("track", 15);
	                 startActivity(intent);}
				if (values=="Stray Heart") {
					Intent intent = new Intent(Allsongs.this, Dos.class);     
	                intent.putExtra("track", 7);
	                startActivity(intent);}
				if (values=="Stuart And The Ave.") {
					Intent intent = new Intent(Allsongs.this, Insomniac.class);     
	                intent.putExtra("track", 9);
	                startActivity(intent);}
				if (values=="Stuck With Me") {
					Intent intent = new Intent(Allsongs.this, Insomniac.class);     
	                intent.putExtra("track", 3);
	                startActivity(intent);}
				if (values=="Suffocate") {
					Intent intent = new Intent(Allsongs.this, Shenanigans.class);     
	                intent.putExtra("track", 1);
	                startActivity(intent);}
				if (values=="Sweet 16") {
					Intent intent = new Intent(Allsongs.this, Uno.class);     
	                intent.putExtra("track", 10);
	                startActivity(intent);}
				if (values=="Sweet Children") {
					Intent intent = new Intent(Allsongs.this, Kerplunk.class);     
	                intent.putExtra("track", 13);
	                startActivity(intent);}
				if (values=="Take Back") {
					Intent intent = new Intent(Allsongs.this, Nimrod.class);     
	                intent.putExtra("track", 15);
	                startActivity(intent);}
				if (values=="The Forgotten") {
					Intent intent = new Intent(Allsongs.this, Tre.class);     
	                intent.putExtra("track", 12);
	                startActivity(intent);}
				if (values=="The Grouch") {
					Intent intent = new Intent(Allsongs.this, Nimrod.class);     
	                intent.putExtra("track", 3);
	                startActivity(intent);}
				if (values=="The Judge's Daughter") {
					Intent intent = new Intent(Allsongs.this, Tns.class);     
	                intent.putExtra("track", 10);
	                startActivity(intent);}
				if (values=="The One I Want") {
					Intent intent = new Intent(Allsongs.this, Tns.class);     
	                 intent.putExtra("track", 18);
	                 startActivity(intent);}
				if (values=="The Static Age") {
					Intent intent = new Intent(Allsongs.this, TcbMain.class);     
	                intent.putExtra("track", 15);
	                startActivity(intent);}
				if (values=="Tight Wadd Hill") {
					Intent intent = new Intent(Allsongs.this, Insomniac.class);     
	                intent.putExtra("track", 13);
	                startActivity(intent);}
				if (values=="Tired Of Waiting For You") {
					Intent intent = new Intent(Allsongs.this, Shenanigans.class);     
	                intent.putExtra("track", 9);
	                startActivity(intent);}
				if (values=="Troublemaker") {
					Intent intent = new Intent(Allsongs.this, Uno.class);     
	                intent.putExtra("track", 8);
	                startActivity(intent);}
				if (values=="Uptight") {
					Intent intent = new Intent(Allsongs.this, Nimrod.class);     
	                intent.putExtra("track", 9);
	                startActivity(intent);}
				if (values=="Waiting") {
					Intent intent = new Intent(Allsongs.this, WarningMain.class);     
	                intent.putExtra("track", 10);
	                startActivity(intent);}
				if (values=="Wake Me Up When September Ends") {
					Intent intent = new Intent(Allsongs.this, AmericanIdiotMain.class);     
	                intent.putExtra("track", 11);
	                startActivity(intent);}
				if (values=="Walk Away") {
					Intent intent = new Intent(Allsongs.this, Tre.class);     
	                intent.putExtra("track", 9);
	                startActivity(intent);}
				if (values=="Walking Alone") {
					Intent intent = new Intent(Allsongs.this, Nimrod.class);     
	                intent.putExtra("track", 13);
	                startActivity(intent);}
				if (values=="Walking Contradiction") {
					Intent intent = new Intent(Allsongs.this, Insomniac.class);     
	                intent.putExtra("track", 14);
	                startActivity(intent);}
				if (values=="Warning") {
					Intent intent = new Intent(Allsongs.this, WarningMain.class);     
	                intent.putExtra("track", 1);
	                startActivity(intent);}
				//if (values=="Welcome To Paradise") {
					//i=new Intent(Allsongs.this, Welcome.class);
					//startActivity(i);}
				if (values=="Welcome To Paradise") {
					Intent intent = new Intent(Allsongs.this, Dookie.class);     
	                intent.putExtra("track", 6);
	                startActivity(intent);}
				if (values=="Westbound Sign") {
					Intent intent = new Intent(Allsongs.this, Insomniac.class);     
	                intent.putExtra("track", 12);
	                startActivity(intent);}
				if (values=="Whatsername") {
					Intent intent = new Intent(Allsongs.this, AmericanIdiotMain.class);     
	                intent.putExtra("track", 13);
	                startActivity(intent);}
				if (values=="When I Come Around") {
					Intent intent = new Intent(Allsongs.this, Dookie.class);     
	                intent.putExtra("track", 11);
	                startActivity(intent);}
				if (values=="Who Wrote Holden Caulfield?") {
					Intent intent = new Intent(Allsongs.this, Kerplunk.class);     
	                intent.putExtra("track", 11);
	                startActivity(intent);}
				if (values=="Why Do You Want Him?") {
					Intent intent = new Intent(Allsongs.this, Tns.class);     
	                intent.putExtra("track", 12);
	                startActivity(intent);}
				if (values=="Wild One") {
					Intent intent = new Intent(Allsongs.this, Dos.class);   
               	 	intent.putExtra("track", 5);
	                startActivity(intent);}
				if (values=="Words I Might Have Ate") {
					Intent intent = new Intent(Allsongs.this, Kerplunk.class);     
	                intent.putExtra("track", 12);
	                startActivity(intent);}
				if (values=="Worry Rock") {
					Intent intent = new Intent(Allsongs.this, Nimrod.class);     
	                intent.putExtra("track", 7);
	                startActivity(intent);}
				if (values=="Wow! That's Loud") {
					Intent intent = new Intent(Allsongs.this, Dos.class);     
	                intent.putExtra("track", 12);
	                startActivity(intent);}
				if (values=="X-Kid") {
					Intent intent = new Intent(Allsongs.this, Tre.class);   
               	 	intent.putExtra("track", 5);
	                startActivity(intent);}
				if (values=="You Lied") {
					Intent intent = new Intent(Allsongs.this, Shenanigans.class);     
	                intent.putExtra("track", 3);
	                startActivity(intent);}
				if (values=="¡Viva La Gloria!") {
					Intent intent = new Intent(Allsongs.this, TcbMain.class);     
	                intent.putExtra("track", 4);
	                startActivity(intent);}
				if (values=="¿Viva La Gloria? (Little Girl)") {
					Intent intent = new Intent(Allsongs.this, TcbMain.class);     
	                intent.putExtra("track", 12);
	                startActivity(intent);}
				
				/*
				 * Demolicious
				 */
				if (values=="99 Revolutions (Demo)"){
					Intent newActivity = new Intent(Allsongs.this, Demolicious.class);     
	                newActivity.putExtra("track", 1);
	                startActivity(newActivity);
				}
				if (values=="Angel Blue (Demo)"){
					Intent newActivity = new Intent(Allsongs.this, Demolicious.class);     
	                newActivity.putExtra("track", 2);
	                startActivity(newActivity);
				}if (values=="Carpe Diem (Demo)"){
					Intent newActivity = new Intent(Allsongs.this, Demolicious.class);     
	                newActivity.putExtra("track", 3);
	                startActivity(newActivity);
				}if (values=="State Of Shock"){
					Intent newActivity = new Intent(Allsongs.this, Demolicious.class);     
	                newActivity.putExtra("track", 4);
	                startActivity(newActivity);
				}if (values=="Let Yourself Go (Demo)"){
					Intent newActivity = new Intent(Allsongs.this, Demolicious.class);     
	                newActivity.putExtra("track", 5);
	                startActivity(newActivity);
				}if (values=="Sex, Drugs And Violence (Demo)"){
					Intent newActivity = new Intent(Allsongs.this, Demolicious.class);     
	                newActivity.putExtra("track", 6);
	                startActivity(newActivity);
				}if (values=="Ashley (Demo)"){
					Intent newActivity = new Intent(Allsongs.this, Demolicious.class);     
	                newActivity.putExtra("track", 7);
	                startActivity(newActivity);
				}if (values=="Fell For You (Demo)"){
					Intent newActivity = new Intent(Allsongs.this, Demolicious.class);     
	                newActivity.putExtra("track", 8);
	                startActivity(newActivity);
				}if (values=="Stay The Night (Demo)"){
					Intent newActivity = new Intent(Allsongs.this, Demolicious.class);     
	                newActivity.putExtra("track", 9);
	                startActivity(newActivity);
				}if (values=="Nuclear Family (Demo)"){
					Intent newActivity = new Intent(Allsongs.this, Demolicious.class);     
	                newActivity.putExtra("track", 10);
	                startActivity(newActivity);
				}if (values=="Stray Heart (Demo)"){
					Intent newActivity = new Intent(Allsongs.this, Demolicious.class);     
	                newActivity.putExtra("track", 11);
	                startActivity(newActivity);
				}if (values=="Rusty James (Demo)"){
					Intent newActivity = new Intent(Allsongs.this, Demolicious.class);     
	                newActivity.putExtra("track", 12);
	                startActivity(newActivity);
				}if (values=="A Little Boy Named Train (Demo)"){
					Intent newActivity = new Intent(Allsongs.this, Demolicious.class);     
	                newActivity.putExtra("track", 13);
	                startActivity(newActivity);
				}if (values=="Baby Eyes (Demo)"){
					Intent newActivity = new Intent(Allsongs.this, Demolicious.class);     
	                newActivity.putExtra("track", 14);
	                startActivity(newActivity);
				}if (values=="Makeout Party (Demo)"){
					Intent newActivity = new Intent(Allsongs.this, Demolicious.class);     
	                newActivity.putExtra("track", 15);
	                startActivity(newActivity);
				}if (values=="Oh Love (Demo)"){
					Intent newActivity = new Intent(Allsongs.this, Demolicious.class);     
	                newActivity.putExtra("track", 16);
	                startActivity(newActivity);
				}if (values=="Missing You (Demo)"){
					Intent newActivity = new Intent(Allsongs.this, Demolicious.class);     
	                newActivity.putExtra("track", 17);
	                startActivity(newActivity);
				}if (values=="Stay The Night (Acoustic)"){
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
