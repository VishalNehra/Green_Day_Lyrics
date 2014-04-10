package com.greenday.lyrics;

import com.greenday.americanidiot.Americanidiot;
import com.greenday.americanidiot.Arewethewaiting;
import com.greenday.americanidiot.Boulevardofbd;
import com.greenday.americanidiot.Extraordgirl;
import com.greenday.americanidiot.Givemenov;
import com.greenday.americanidiot.Holiday;
import com.greenday.americanidiot.Homecoming;
import com.greenday.americanidiot.Jesusofsuburb;
import com.greenday.americanidiot.Letterbomb;
import com.greenday.americanidiot.Shesarebel;
import com.greenday.americanidiot.Stjimmy;
import com.greenday.americanidiot.Wakemeup;
import com.greenday.americanidiot.Whatshername;
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
import android.app.Activity;
import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Bundle;
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
    	
		//Set theme must be used before super.oncreate or any other layout declaration
		Util.setAppTheme(this);

		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.all_songs);
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
            			"This feature might not work on <i><font color='#464ea3'>Winamp</i></font>."))
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
				"All By Myself",
				"All The Time",
				"Amanda",
				"American Eulogy (Mass Hysteria/Modern World)",
				"American Idiot",
				"Amy",
				"Android",
				"Angel Blue",
				"Are We The Waiting",
				"Armatage Shanks",
				"Ashley",
				"At The Library",
				"Bab's Uvula Who?",
				"Baby Eyes",
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
				"Letterbomb",
				"Little Boy Named Train",
				"Longview",
				"Loss Of Control",
				"Macy's Day Parade",
				"Makeout Party",
				"Minority",
				"Maria",
				"Misery",
				"Missing You",
				"Murder City",
				"My Generation",
				"Nice Guys Finish Last",
				"Nightlife",
				"No One Knows",
				"No Pride",
				"Nuclear Family",
				"Oh Love",
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
				"Sassafras Roots",
				"Scattered",
				"Scumbag",
				"See The Light",
				"See You Tonight",
				"Sex, Drugs & Violence",
				"She",
				"She's A Rebel",
				"Sick Of Me",
				"Song Of The Century",
				"St. Jimmy",
				"Stay The Night",
				"Stop When The Red Lights Flash",
				"Strangeland",
				"Stray Heart",
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
				Intent i =null;

				if (values=="1,000 Hours") {
					Intent newActivity14 = new Intent(Allsongs.this, Tns.class);     
	                newActivity14.putExtra("track", 15);
	                startActivity(newActivity14);}
				if (values=="16") {
					Intent newActivity6 = new Intent(Allsongs.this, Tns.class);     
	                newActivity6.putExtra("track", 7);
	                startActivity(newActivity6);}
				if (values=="2000 Light Years Away") {
					Intent newActivity = new Intent(Allsongs.this, Kerplunk.class);     
	                newActivity.putExtra("track", 1);
	                startActivity(newActivity);}
				if (values=="21 Guns") {
					Intent newActivity15 = new Intent(Allsongs.this, TcbMain.class);     
	                newActivity15.putExtra("track", 16);
	                startActivity(newActivity15);}
				if (values=="21st Century Breakdown") {
					Intent newActivity1 = new Intent(Allsongs.this, TcbMain.class);     
	                newActivity1.putExtra("track", 2);
	                startActivity(newActivity1);}
				if (values=="409 In Your Coffeemaker") {
					Intent newActivity12 = new Intent(Allsongs.this, Tns.class);     
	                newActivity12.putExtra("track", 13);
	                startActivity(newActivity12);}
				if (values=="80") {
					Intent newActivity7 = new Intent(Allsongs.this, Kerplunk.class);     
	                newActivity7.putExtra("track", 8);
	                startActivity(newActivity7);}
				if (values=="86") {
					Intent newActivity6 = new Intent(Allsongs.this, Insomniac.class);     
	                newActivity6.putExtra("track", 7);
	                startActivity(newActivity6);}
				if (values=="8th Avenue Serenade") {
					Intent newActivity2 = new Intent(Allsongs.this, Tre.class);     
	                newActivity2.putExtra("track", 3);
	                startActivity(newActivity2);}
				if (values=="99 Revolutions") {
					Intent newActivity10 = new Intent(Allsongs.this, Tre.class);     
	                newActivity10.putExtra("track", 11);
	                startActivity(newActivity10);}
				if (values=="All By Myself") {
					i=new Intent(Allsongs.this, Allbymyself.class);
					startActivity(i);}
				if (values=="All The Time") {
					Intent newActivity5 = new Intent(Allsongs.this, Nimrod.class);     
	                newActivity5.putExtra("track", 6);
	                startActivity(newActivity5);}
				if (values=="Amanda") {
					Intent newActivity7 = new Intent(Allsongs.this, Tre.class);     
	                newActivity7.putExtra("track", 8);
	                startActivity(newActivity7);}
				if (values=="American Eulogy (Mass Hysteria/Modern World)") {
					Intent newActivity16 = new Intent(Allsongs.this, TcbMain.class);     
	                newActivity16.putExtra("track", 17);
	                startActivity(newActivity16);}
				if (values=="American Idiot") {
					i=new Intent(Allsongs.this, Americanidiot.class);
					startActivity(i);}
				if (values=="Amy") {
					Intent newActivity12 = new Intent(Allsongs.this, Dos.class);     
	                newActivity12.putExtra("track", 13);
	                startActivity(newActivity12);}
				if (values=="Android") {
					Intent newActivity8 = new Intent(Allsongs.this, Kerplunk.class);     
	                newActivity8.putExtra("track", 9);
	                startActivity(newActivity8);}
				if (values=="Angel Blue") {
					Intent newActivity8 = new Intent(Allsongs.this, Uno.class);     
	                newActivity8.putExtra("track", 9);
	                startActivity(newActivity8);}
				if (values=="Are We The Waiting") {
					i=new Intent(Allsongs.this, Arewethewaiting.class);
					startActivity(i);}
				if (values=="Armatage Shanks") {
					Intent newActivity = new Intent(Allsongs.this, Insomniac.class);     
	                newActivity.putExtra("track", 1);
	                startActivity(newActivity);}
				if (values=="Ashley") {
					Intent newActivity7 = new Intent(Allsongs.this, Dos.class);     
	                newActivity7.putExtra("track", 8);
	                startActivity(newActivity7);}
				if (values=="At The Library") {
					Intent newActivity = new Intent(Allsongs.this, Tns.class);     
	                newActivity.putExtra("track", 1);
	                startActivity(newActivity);}
				if (values=="Bab's Uvula Who?") {
					Intent newActivity5 = new Intent(Allsongs.this, Insomniac.class);     
	                newActivity5.putExtra("track", 6);
	                startActivity(newActivity5);}
				if (values=="Baby Eyes") {
					Intent newActivity8 = new Intent(Allsongs.this, Dos.class);     
	                newActivity8.putExtra("track", 9);
	                startActivity(newActivity8);}
				if (values=="Basket Case") {
					i=new Intent(Allsongs.this, Basketcase.class);
					startActivity(i);}
				if (values=="Before The Lobotomy") {
					Intent newActivity4 = new Intent(Allsongs.this, TcbMain.class);   
               	 	newActivity4.putExtra("track", 5);
	                startActivity(newActivity4);}
				if (values=="Best Thing In Town") {
					Intent newActivity13 = new Intent(Allsongs.this, Kerplunk.class);     
	                newActivity13.putExtra("track", 14);
	                startActivity(newActivity13);}
				if (values=="Blood, Sex And Booze") {
					Intent newActivity1 = new Intent(Allsongs.this, WarningMain.class);     
                    newActivity1.putExtra("track", 2);
                    startActivity(newActivity1);}
				if (values=="Boulevard Of Broken Dreams") {
					i=new Intent(Allsongs.this, Boulevardofbd.class);
					startActivity(i);}
				if (values=="Brain Stew") {
					Intent newActivity9 = new Intent(Allsongs.this, Insomniac.class);     
	                newActivity9.putExtra("track", 10);
	                startActivity(newActivity9);}
				if (values=="Brat") {
					Intent newActivity1 = new Intent(Allsongs.this, Insomniac.class);     
	                newActivity1.putExtra("track", 2);
	                startActivity(newActivity1);}
				if (values=="Brutal Love") {
					Intent newActivity = new Intent(Allsongs.this, Tre.class);     
	                newActivity.putExtra("track", 1);
	                startActivity(newActivity);}
				if (values=="Burnout") {
					i=new Intent(Allsongs.this, Burnout.class);
					startActivity(i);}
				if (values=="Carpe Diem") {
					Intent newActivity2 = new Intent(Allsongs.this, Uno.class);     
	                newActivity2.putExtra("track", 3);
	                startActivity(newActivity2);}
				if (values=="Castaway") {
					Intent newActivity4 = new Intent(Allsongs.this, WarningMain.class);     
                    newActivity4.putExtra("track", 5);
                    startActivity(newActivity4);}
				if (values=="Christian's Inferno") {
					Intent newActivity5 = new Intent(Allsongs.this, TcbMain.class);     
	                newActivity5.putExtra("track", 6);
	                startActivity(newActivity5);}
				if (values=="Christie Road") {
					Intent newActivity3 = new Intent(Allsongs.this, Kerplunk.class);     
	                newActivity3.putExtra("track", 4);
	                startActivity(newActivity3);}
				if (values=="Chump") {
					i=new Intent(Allsongs.this, Chump.class);
					startActivity(i);}
				if (values=="Church On Sunday") {
					Intent newActivity2 = new Intent(Allsongs.this, WarningMain.class);     
                    newActivity2.putExtra("track", 3);
                    startActivity(newActivity2);}
				if (values=="Coming Clean") {
					i=new Intent(Allsongs.this, Comingclean.class);
					startActivity(i);}
				if (values=="Deadbeat Holiday") {
					Intent newActivity6 = new Intent(Allsongs.this, WarningMain.class);     
                    newActivity6.putExtra("track", 7);
                    startActivity(newActivity6);}
				if (values=="Desensitized") {
					Intent newActivity1 = new Intent(Allsongs.this, Shenanigans.class);     
	                newActivity1.putExtra("track", 2);
	                startActivity(newActivity1);}
				if (values=="Dirty Rotten Bastards") {
					Intent newActivity9 = new Intent(Allsongs.this, Tre.class);     
	                newActivity9.putExtra("track", 10);
	                startActivity(newActivity9);}
				if (values=="Disappearing Boy") {
					Intent newActivity3 = new Intent(Allsongs.this, Tns.class);     
	                newActivity3.putExtra("track", 4);
	                startActivity(newActivity3);}
				if (values=="Do Da Da") {
					Intent newActivity11 = new Intent(Allsongs.this, Shenanigans.class);     
	                newActivity11.putExtra("track", 12);
	                startActivity(newActivity11);}
				if (values=="Dominated Love Slave") {
					Intent newActivity5 = new Intent(Allsongs.this, Kerplunk.class);     
	                newActivity5.putExtra("track", 6);
	                startActivity(newActivity5);}
				if (values=="Don't Leave Me") {
					Intent newActivity1 = new Intent(Allsongs.this, Tns.class);     
	                newActivity1.putExtra("track", 2);
	                startActivity(newActivity1);}
				if (values=="Don't Wanna Fall In Love") {
					Intent newActivity4 = new Intent(Allsongs.this, Shenanigans.class);   
               	 	newActivity4.putExtra("track", 5);
	                startActivity(newActivity4);}
				if (values=="Drama Queen") {
					Intent newActivity3 = new Intent(Allsongs.this, Tre.class);     
	                newActivity3.putExtra("track", 4);
	                startActivity(newActivity3);}
				if (values=="Dry Ice") {
					Intent newActivity15 = new Intent(Allsongs.this, Tns.class);     
	                newActivity15.putExtra("track", 16);
	                startActivity(newActivity15);}
				if (values=="East Jesus Nowhere") {
					Intent newActivity7 = new Intent(Allsongs.this, TcbMain.class);     
	                newActivity7.putExtra("track", 8);
	                startActivity(newActivity7);}
				if (values=="Emenius Sleepus") {
					i=new Intent(Allsongs.this, Emeniussleepus.class);
					startActivity(i);}
				if (values=="Espionage") {
					Intent newActivity5 = new Intent(Allsongs.this, Shenanigans.class);     
	                newActivity5.putExtra("track", 6);
	                startActivity(newActivity5);}
				if (values=="Extraordinary Girl") {
					i=new Intent(Allsongs.this, Extraordgirl.class);
					startActivity(i);}
				if (values=="F.O.D.") {
					i=new Intent(Allsongs.this, FOD.class);
					startActivity(i);}
				if (values=="Fashion Victim") {
					Intent newActivity3 = new Intent(Allsongs.this, WarningMain.class);     
                    newActivity3.putExtra("track", 4);
                    startActivity(newActivity3);}
				if (values=="Fell For You") {
					Intent newActivity5 = new Intent(Allsongs.this, Uno.class);     
	                newActivity5.putExtra("track", 6);
	                startActivity(newActivity5);}
				if (values=="Fuck Time") {
					Intent newActivity1 = new Intent(Allsongs.this, Dos.class);     
	                newActivity1.putExtra("track", 2);
	                startActivity(newActivity1);}
				if (values=="Geek Stink Breath") {
					Intent newActivity3 = new Intent(Allsongs.this, Insomniac.class);     
	                newActivity3.putExtra("track", 4);
	                startActivity(newActivity3);}
				if (values=="Give Me Novacaine") {
					i=new Intent(Allsongs.this, Givemenov.class);
					startActivity(i);}
				if (values=="Going To Pasalacqua") {
					Intent newActivity5 = new Intent(Allsongs.this, Tns.class);     
	                newActivity5.putExtra("track", 6);
	                startActivity(newActivity5);}
				if (values=="Good Riddance (Time Of Your Life)") {
					Intent newActivity16 = new Intent(Allsongs.this, Nimrod.class);     
	                newActivity16.putExtra("track", 17);
	                startActivity(newActivity16);}
				if (values=="Green Day") {
					Intent newActivity4 = new Intent(Allsongs.this, Tns.class);   
               	 	newActivity4.putExtra("track", 5);
	                startActivity(newActivity4);}
				if (values=="Ha Ha You're Dead") {
					Intent newActivity13 = new Intent(Allsongs.this, Shenanigans.class);     
	                newActivity13.putExtra("track", 14);
	                startActivity(newActivity13);}
				if (values=="Haushinka") {
					Intent newActivity11 = new Intent(Allsongs.this, Nimrod.class);     
	                newActivity11.putExtra("track", 12);
	                startActivity(newActivity11);}
				if (values=="Having A Blast") {
					i=new Intent(Allsongs.this, Havingblast.class);
					startActivity(i);}
				if (values=="Hitchin' A Ride") {
					Intent newActivity1 = new Intent(Allsongs.this, Nimrod.class);     
	                newActivity1.putExtra("track", 2);
	                startActivity(newActivity1);}
				if (values=="Hold On") {
					Intent newActivity7 = new Intent(Allsongs.this, WarningMain.class);     
	                newActivity7.putExtra("track", 8);
	                startActivity(newActivity7);}
				if (values=="Holiday") {
					i=new Intent(Allsongs.this, Holiday.class);
					startActivity(i);}
				if (values=="Homecoming") {
					i=new Intent(Allsongs.this, Homecoming.class);
					startActivity(i);}
				if (values=="Horseshoes And Handgrenades") {
					Intent newActivity13 = new Intent(Allsongs.this, TcbMain.class);     
	                newActivity13.putExtra("track", 14);
	                startActivity(newActivity13);}
				if (values=="I Want To Be Alone") {
					Intent newActivity18 = new Intent(Allsongs.this, Tns.class);     
	                newActivity18.putExtra("track", 19);
	                startActivity(newActivity18);}
				if (values=="I Want To Be On T.V.") {
					Intent newActivity6 = new Intent(Allsongs.this, Shenanigans.class);     
	                newActivity6.putExtra("track", 7);
	                startActivity(newActivity6);}
				if (values=="I Was There") {
					Intent newActivity2 = new Intent(Allsongs.this, Tns.class);     
	                newActivity2.putExtra("track", 3);
	                startActivity(newActivity2);}
				if (values=="In The End") {
					i=new Intent(Allsongs.this, Intheend.class);
					startActivity(i);}
				if (values=="Jackass") {
					Intent newActivity8 = new Intent(Allsongs.this, WarningMain.class);     
	                newActivity8.putExtra("track", 9);
	                startActivity(newActivity8);}
				if (values=="Jaded") {
					Intent newActivity10 = new Intent(Allsongs.this, Insomniac.class);     
	                newActivity10.putExtra("track", 11);
	                startActivity(newActivity10);}
				if (values=="J.A.R. (Jason Andrew Relva)") {
					Intent newActivity7 = new Intent(Allsongs.this, Ins.class);     
	                newActivity7.putExtra("track", 8);
	                startActivity(newActivity7);}
				if (values=="Jesus Of Suburbia") {
					i=new Intent(Allsongs.this, Jesusofsuburb.class);
					startActivity(i);}
				if (values=="Jinx") {
					Intent newActivity10 = new Intent(Allsongs.this, Nimrod.class);     
	                newActivity10.putExtra("track", 11);
	                startActivity(newActivity10);}
				if (values=="Kill The DJ") {
					Intent newActivity4 = new Intent(Allsongs.this, Uno.class);   
               	 	newActivity4.putExtra("track", 5);
	                startActivity(newActivity4);}
				if (values=="King For A Day") {
					Intent newActivity15 = new Intent(Allsongs.this, Nimrod.class);     
	                newActivity15.putExtra("track", 16);
	                startActivity(newActivity15);}
				if (values=="Know Your Enemy") {
					Intent newActivity2 = new Intent(Allsongs.this, TcbMain.class);     
	                newActivity2.putExtra("track", 3);
	                startActivity(newActivity2);}
				if (values=="Knowledge") {
					Intent newActivity13 = new Intent(Allsongs.this, Tns.class);     
	                newActivity13.putExtra("track", 14);
	                startActivity(newActivity13);}
				if (values=="Lady Cobra") {
					Intent newActivity9 = new Intent(Allsongs.this, Dos.class);     
	                newActivity9.putExtra("track", 10);
	                startActivity(newActivity9);}
				if (values=="Last Night On Earth") {
					Intent newActivity6 = new Intent(Allsongs.this, TcbMain.class);     
	                newActivity6.putExtra("track", 7);
	                startActivity(newActivity6);}
				if (values=="Last Of American Girls") {
					Intent newActivity9 = new Intent(Allsongs.this, TcbMain.class);     
	                newActivity9.putExtra("track", 10);
	                startActivity(newActivity9);}
				if (values=="Lazy Bones") {
					Intent newActivity3 = new Intent(Allsongs.this, Dos.class);     
	                newActivity3.putExtra("track", 4);
	                startActivity(newActivity3);}
				if (values=="Let Yourself Go") {
					Intent newActivity3 = new Intent(Allsongs.this, Uno.class);     
	                newActivity3.putExtra("track", 4);
	                startActivity(newActivity3);}
				if (values=="Letterbomb") {
					i=new Intent(Allsongs.this, Letterbomb.class);
					startActivity(i);}
				if (values=="Little Boy Named Train") {
					Intent newActivity6 = new Intent(Allsongs.this, Tre.class);     
	                newActivity6.putExtra("track", 7);
	                startActivity(newActivity6);}
				if (values=="Longview") {
					i=new Intent(Allsongs.this, Longview.class);
					startActivity(i);}
				if (values=="Loss Of Control") {
					Intent newActivity6 = new Intent(Allsongs.this, Uno.class);     
	                newActivity6.putExtra("track", 7);
	                startActivity(newActivity6);}
				if (values=="Macy's Day Parade") {
					Intent newActivity11 = new Intent(Allsongs.this, WarningMain.class);     
	                newActivity11.putExtra("track", 12);
	                startActivity(newActivity11);}
				if (values=="Makeout Party") {
					Intent newActivity5 = new Intent(Allsongs.this, Dos.class);     
	                newActivity5.putExtra("track", 6);
	                startActivity(newActivity5);}
				if (values=="Minority") {
					Intent newActivity10 = new Intent(Allsongs.this, WarningMain.class);     
	                newActivity10.putExtra("track", 11);
	                startActivity(newActivity10);}
				if (values=="Maria") {
					Intent newActivity = new Intent(Allsongs.this, Ins.class);     
	                newActivity.putExtra("track", 1);
	                startActivity(newActivity);}
				if (values=="Misery") {
					Intent newActivity5 = new Intent(Allsongs.this, WarningMain.class);     
	                newActivity5.putExtra("track", 6);
	                startActivity(newActivity5);}
				if (values=="Missing You") {
					Intent newActivity1 = new Intent(Allsongs.this, Tre.class);     
	                newActivity1.putExtra("track", 2);
	                startActivity(newActivity1);}
				if (values=="Murder City") {
					Intent newActivity10 = new Intent(Allsongs.this, TcbMain.class);     
	                newActivity10.putExtra("track", 11);
	                startActivity(newActivity10);}
				if (values=="My Generation") {
					Intent newActivity15 = new Intent(Allsongs.this, Kerplunk.class);     
	                newActivity15.putExtra("track", 16);
	                startActivity(newActivity15);}
				if (values=="Nice Guys Finish Last") {
					Intent newActivity = new Intent(Allsongs.this, Nimrod.class);     
	                newActivity.putExtra("track", 1);
	                startActivity(newActivity);}
				if (values=="Nightlife") {
					Intent newActivity10 = new Intent(Allsongs.this, Dos.class);     
	                newActivity10.putExtra("track", 11);
	                startActivity(newActivity10);}
				if (values=="No One Knows") {
					Intent newActivity9 = new Intent(Allsongs.this, Kerplunk.class);     
	                newActivity9.putExtra("track", 10);
	                startActivity(newActivity9);}
				if (values=="No Pride") {
					Intent newActivity4 = new Intent(Allsongs.this, Insomniac.class);   
               	 	newActivity4.putExtra("track", 5);
	                startActivity(newActivity4);}
				if (values=="Nuclear Family") {
					Intent newActivity = new Intent(Allsongs.this, Uno.class);     
	                newActivity.putExtra("track", 1);
	                startActivity(newActivity);}
				if (values=="Oh Love") {
					Intent newActivity11 = new Intent(Allsongs.this, Uno.class);     
	                newActivity11.putExtra("track", 12);
	                startActivity(newActivity11);}
				if (values=="On The Wagon") {
					Intent newActivity12 = new Intent(Allsongs.this, Shenanigans.class);     
	                newActivity12.putExtra("track", 13);
	                startActivity(newActivity12);}
				if (values=="One For The Razorbacks") {
					Intent newActivity1 = new Intent(Allsongs.this, Kerplunk.class);     
	                newActivity1.putExtra("track", 2);
	                startActivity(newActivity1);}
				if (values=="One Of My Lies") {
					Intent newActivity6 = new Intent(Allsongs.this, Kerplunk.class);     
	                newActivity6.putExtra("track", 7);
	                startActivity(newActivity6);}
				if (values=="Only Of You") {
					Intent newActivity16 = new Intent(Allsongs.this, Tns.class);     
	                newActivity16.putExtra("track", 17);
	                startActivity(newActivity16);}
				if (values=="Outsider") {
					Intent newActivity3 = new Intent(Allsongs.this, Shenanigans.class);     
	                newActivity3.putExtra("track", 4);
	                startActivity(newActivity3);}
				if (values=="Panic Song") {
					Intent newActivity7 = new Intent(Allsongs.this, Insomniac.class);     
	                newActivity7.putExtra("track", 8);
	                startActivity(newActivity7);}
				if (values=="Paper Lanterns") {
					Intent newActivity10 = new Intent(Allsongs.this, Tns.class);     
	                newActivity10.putExtra("track", 11);
	                startActivity(newActivity10);}
				if (values=="Peacemaker") {
					Intent newActivity8 = new Intent(Allsongs.this, TcbMain.class);     
	                newActivity8.putExtra("track", 9);
	                startActivity(newActivity8);}
				if (values=="Platypus (I Hate You)") {
					Intent newActivity7 = new Intent(Allsongs.this, Nimrod.class);     
	                newActivity7.putExtra("track", 8);
	                startActivity(newActivity7);}
				if (values=="Poprocks & Coke") {
					Intent newActivity1 = new Intent(Allsongs.this, Ins.class);     
	                newActivity1.putExtra("track", 2);
	                startActivity(newActivity1);}
				if (values=="Private Ale") {
					Intent newActivity4 = new Intent(Allsongs.this, Kerplunk.class);   
               	 	newActivity4.putExtra("track", 5);
	                startActivity(newActivity4);}
				if (values=="Prosthetic Head") {
					Intent newActivity17 = new Intent(Allsongs.this, Nimrod.class);     
	                newActivity17.putExtra("track", 18);
	                startActivity(newActivity17);}
				if (values=="Pulling Teeth") {
					i=new Intent(Allsongs.this, Pullingteeth.class);
					startActivity(i);}
				if (values=="Redundant") {
					Intent newActivity3 = new Intent(Allsongs.this, Nimrod.class);     
	                newActivity3.putExtra("track", 4);
	                startActivity(newActivity3);}
				if (values=="Reject") {
					Intent newActivity13 = new Intent(Allsongs.this, Nimrod.class);     
	                newActivity13.putExtra("track", 14);
	                startActivity(newActivity13);}
				if (values=="Rest") {
					Intent newActivity8 = new Intent(Allsongs.this, Tns.class);     
	                newActivity8.putExtra("track", 9);
	                startActivity(newActivity8);}
				if (values=="Restless Heart Syndrome") {
					Intent newActivity12 = new Intent(Allsongs.this, TcbMain.class);     
	                newActivity12.putExtra("track", 13);
	                startActivity(newActivity12);}
				if (values=="Road To Acceptance") {
					Intent newActivity7 = new Intent(Allsongs.this, Tns.class);     
	                newActivity7.putExtra("track", 8);
	                startActivity(newActivity7);}
				if (values=="Rotting") {
					Intent newActivity10 = new Intent(Allsongs.this, Shenanigans.class);     
	                newActivity10.putExtra("track", 11);
	                startActivity(newActivity10);}
				if (values=="Rusty James") {
					Intent newActivity10 = new Intent(Allsongs.this, Uno.class);     
	                newActivity10.putExtra("track", 11);
	                startActivity(newActivity10);}
				if (values=="Sassafras Roots") {
					i=new Intent(Allsongs.this, Sassafrasroots.class);
					startActivity(i);}
				if (values=="Scattered") {
					Intent newActivity4 = new Intent(Allsongs.this, Nimrod.class);   
               	 	newActivity4.putExtra("track", 5);
	                startActivity(newActivity4);}
				if (values=="Scumbag") {
					Intent newActivity7 = new Intent(Allsongs.this, Shenanigans.class);     
	                newActivity7.putExtra("track", 8);
	                startActivity(newActivity7);}
				if (values=="See The Light") {
					Intent newActivity17 = new Intent(Allsongs.this, TcbMain.class);     
	                newActivity17.putExtra("track", 18);
	                startActivity(newActivity17);}
				if (values=="See You Tonight") {
					Intent newActivity = new Intent(Allsongs.this, Dos.class);     
	                newActivity.putExtra("track", 1);
	                startActivity(newActivity);}
				if (values=="Sex, Drugs & Violence") {
					Intent newActivity5 = new Intent(Allsongs.this, Tre.class);     
	                newActivity5.putExtra("track", 6);
	                startActivity(newActivity5);}
				if (values=="She") {
					i=new Intent(Allsongs.this, She.class);
					startActivity(i);}
				if (values=="She's A Rebel") {
					i=new Intent(Allsongs.this, Shesarebel.class);
					startActivity(i);}
				if (values=="Sick Of Me") {
					Intent newActivity9 = new Intent(Allsongs.this, Shenanigans.class);     
	                newActivity9.putExtra("track", 10);
	                startActivity(newActivity9);}
				if (values=="Song Of The Century") {
					Intent newActivity = new Intent(Allsongs.this, TcbMain.class);     
	                newActivity.putExtra("track", 1);
	                startActivity(newActivity);}
				if (values=="St. Jimmy") {
					i=new Intent(Allsongs.this, Stjimmy.class);
					startActivity(i);}
				if (values=="Stay The Night") {
					Intent newActivity1 = new Intent(Allsongs.this, Uno.class);     
	                newActivity1.putExtra("track", 2);
	                startActivity(newActivity1);}
				if (values=="Stop When The Red Lights Flash") {
					Intent newActivity2 = new Intent(Allsongs.this, Dos.class);     
	                newActivity2.putExtra("track", 3);
	                startActivity(newActivity2);}
				if (values=="Strangeland") {
					Intent newActivity14 = new Intent(Allsongs.this, Kerplunk.class);     
	                newActivity14.putExtra("track", 15);
	                 startActivity(newActivity14);}
				if (values=="Stray Heart") {
					Intent newActivity6 = new Intent(Allsongs.this, Dos.class);     
	                newActivity6.putExtra("track", 7);
	                startActivity(newActivity6);}
				if (values=="Stuart And The Ave.") {
					Intent newActivity8 = new Intent(Allsongs.this, Insomniac.class);     
	                newActivity8.putExtra("track", 9);
	                startActivity(newActivity8);}
				if (values=="Stuck With Me") {
					Intent newActivity2 = new Intent(Allsongs.this, Insomniac.class);     
	                newActivity2.putExtra("track", 3);
	                startActivity(newActivity2);}
				if (values=="Suffocate") {
					Intent newActivity = new Intent(Allsongs.this, Shenanigans.class);     
	                newActivity.putExtra("track", 1);
	                startActivity(newActivity);}
				if (values=="Sweet 16") {
					Intent newActivity9 = new Intent(Allsongs.this, Uno.class);     
	                newActivity9.putExtra("track", 10);
	                startActivity(newActivity9);}
				if (values=="Sweet Children") {
					Intent newActivity12 = new Intent(Allsongs.this, Kerplunk.class);     
	                newActivity12.putExtra("track", 13);
	                startActivity(newActivity12);}
				if (values=="Take Back") {
					Intent newActivity14 = new Intent(Allsongs.this, Nimrod.class);     
	                newActivity14.putExtra("track", 15);
	                startActivity(newActivity14);}
				if (values=="The Forgotten") {
					Intent newActivity11 = new Intent(Allsongs.this, Tre.class);     
	                newActivity11.putExtra("track", 12);
	                startActivity(newActivity11);}
				if (values=="The Grouch") {
					Intent newActivity2 = new Intent(Allsongs.this, Nimrod.class);     
	                newActivity2.putExtra("track", 3);
	                startActivity(newActivity2);}
				if (values=="The Judge's Daughter") {
					Intent newActivity9 = new Intent(Allsongs.this, Tns.class);     
	                newActivity9.putExtra("track", 10);
	                startActivity(newActivity9);}
				if (values=="The One I Want") {
					Intent newActivity17 = new Intent(Allsongs.this, Tns.class);     
	                 newActivity17.putExtra("track", 18);
	                 startActivity(newActivity17);}
				if (values=="The Static Age") {
					Intent newActivity14 = new Intent(Allsongs.this, TcbMain.class);     
	                newActivity14.putExtra("track", 15);
	                startActivity(newActivity14);}
				if (values=="Tight Wadd Hill") {
					Intent newActivity12 = new Intent(Allsongs.this, Insomniac.class);     
	                newActivity12.putExtra("track", 13);
	                startActivity(newActivity12);}
				if (values=="Tired Of Waiting For You") {
					Intent newActivity8 = new Intent(Allsongs.this, Shenanigans.class);     
	                newActivity8.putExtra("track", 9);
	                startActivity(newActivity8);}
				if (values=="Troublemaker") {
					Intent newActivity7 = new Intent(Allsongs.this, Uno.class);     
	                newActivity7.putExtra("track", 8);
	                startActivity(newActivity7);}
				if (values=="Uptight") {
					Intent newActivity8 = new Intent(Allsongs.this, Nimrod.class);     
	                newActivity8.putExtra("track", 9);
	                startActivity(newActivity8);}
				if (values=="Waiting") {
					Intent newActivity9 = new Intent(Allsongs.this, WarningMain.class);     
	                newActivity9.putExtra("track", 10);
	                startActivity(newActivity9);}
				if (values=="Wake Me Up When September Ends") {
					i=new Intent(Allsongs.this, Wakemeup.class);
					startActivity(i);}
				if (values=="Walk Away") {
					Intent newActivity8 = new Intent(Allsongs.this, Tre.class);     
	                newActivity8.putExtra("track", 9);
	                startActivity(newActivity8);}
				if (values=="Walking Alone") {
					Intent newActivity12 = new Intent(Allsongs.this, Nimrod.class);     
	                newActivity12.putExtra("track", 13);
	                startActivity(newActivity12);}
				if (values=="Walking Contradiction") {
					Intent newActivity13 = new Intent(Allsongs.this, Insomniac.class);     
	                newActivity13.putExtra("track", 14);
	                startActivity(newActivity13);}
				if (values=="Warning") {
					Intent newActivity = new Intent(Allsongs.this, WarningMain.class);     
	                newActivity.putExtra("track", 1);
	                startActivity(newActivity);}
				//if (values=="Welcome To Paradise") {
					//i=new Intent(Allsongs.this, Welcome.class);
					//startActivity(i);}
				if (values=="Welcome To Paradise") {
					i=new Intent(Allsongs.this, Welcomeparadise.class);
					startActivity(i);}
				if (values=="Westbound Sign") {
					Intent newActivity11 = new Intent(Allsongs.this, Insomniac.class);     
	                newActivity11.putExtra("track", 12);
	                startActivity(newActivity11);}
				if (values=="Whatsername") {
					i=new Intent(Allsongs.this, Whatshername.class);
					startActivity(i);}
				if (values=="When I Come Around") {
					i=new Intent(Allsongs.this, Whencomearound.class);
					startActivity(i);}
				if (values=="Who Wrote Holden Caulfield?") {
					Intent newActivity10 = new Intent(Allsongs.this, Kerplunk.class);     
	                newActivity10.putExtra("track", 11);
	                startActivity(newActivity10);}
				if (values=="Why Do You Want Him?") {
					Intent newActivity11 = new Intent(Allsongs.this, Tns.class);     
	                newActivity11.putExtra("track", 12);
	                startActivity(newActivity11);}
				if (values=="Wild One") {
					Intent newActivity4 = new Intent(Allsongs.this, Dos.class);   
               	 	newActivity4.putExtra("track", 5);
	                startActivity(newActivity4);}
				if (values=="Words I Might Have Ate") {
					Intent newActivity11 = new Intent(Allsongs.this, Kerplunk.class);     
	                newActivity11.putExtra("track", 12);
	                startActivity(newActivity11);}
				if (values=="Worry Rock") {
					Intent newActivity6 = new Intent(Allsongs.this, Nimrod.class);     
	                newActivity6.putExtra("track", 7);
	                startActivity(newActivity6);}
				if (values=="Wow! That's Loud") {
					Intent newActivity11 = new Intent(Allsongs.this, Dos.class);     
	                newActivity11.putExtra("track", 12);
	                startActivity(newActivity11);}
				if (values=="X-Kid") {
					Intent newActivity4 = new Intent(Allsongs.this, Tre.class);   
               	 	newActivity4.putExtra("track", 5);
	                startActivity(newActivity4);}
				if (values=="You Lied") {
					Intent newActivity2 = new Intent(Allsongs.this, Shenanigans.class);     
	                newActivity2.putExtra("track", 3);
	                startActivity(newActivity2);}
				if (values=="¡Viva La Gloria!") {
					Intent newActivity3 = new Intent(Allsongs.this, TcbMain.class);     
	                newActivity3.putExtra("track", 4);
	                startActivity(newActivity3);}
				if (values=="¿Viva La Gloria? (Little Girl)") {
					Intent newActivity11 = new Intent(Allsongs.this, TcbMain.class);     
	                newActivity11.putExtra("track", 12);
	                startActivity(newActivity11);}
			}
		});
	}
	
		//Action bar code below

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
		
		//To avoid intent leak
		@Override
		protected void onDestroy() {
			// TODO Auto-generated method stub
			unregisterReceiver(mReceiver);
			super.onDestroy();
		}
}
