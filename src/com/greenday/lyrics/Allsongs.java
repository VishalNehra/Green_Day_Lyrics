package com.greenday.lyrics;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
import com.greenday.dookie.Basketcase;
import com.greenday.dookie.Burnout;
import com.greenday.dookie.Chump;
import com.greenday.dookie.Comingclean;
import com.greenday.dookie.Emeniussleepus;
import com.greenday.dookie.FOD;
import com.greenday.dookie.Havingblast;
import com.greenday.dookie.Intheend;
import com.greenday.dookie.Longview;
import com.greenday.dookie.Pullingteeth;
import com.greenday.dookie.Sassafrasroots;
import com.greenday.dookie.She;
import com.greenday.dookie.Welcomeparadise;
import com.greenday.dookie.Whencomearound;
import com.greenday.dos.Amy;
import com.greenday.dos.Ashley;
import com.greenday.dos.Babyeyes;
import com.greenday.dos.Cutonight;
import com.greenday.dos.Fucktime;
import com.greenday.dos.Ladycobra;
import com.greenday.dos.Lazybones;
import com.greenday.dos.Makeoutparty;
import com.greenday.dos.Nightlife;
import com.greenday.dos.Stopredflash;
import com.greenday.dos.Strayheart;
import com.greenday.dos.Wildone;
import com.greenday.dos.Wowthatsloud;
import com.greenday.ins.JAR;
import com.greenday.insomniac.Armatage;
import com.greenday.insomniac.Babuvula;
import com.greenday.insomniac.Brainstew;
import com.greenday.insomniac.Brat;
import com.greenday.insomniac.Eightysix;
import com.greenday.insomniac.Geekstink;
import com.greenday.insomniac.Jaded;
import com.greenday.insomniac.Nopride;
import com.greenday.insomniac.Panicsong;
import com.greenday.insomniac.Stuartave;
import com.greenday.insomniac.Stuckwithme;
import com.greenday.insomniac.Tightwad;
import com.greenday.insomniac.Walking;
import com.greenday.insomniac.Westbound;
import com.greenday.kerplunk.Android;
import com.greenday.kerplunk.Bestthing;
import com.greenday.kerplunk.Christie;
import com.greenday.kerplunk.Eighty;
import com.greenday.kerplunk.Lightyears;
import com.greenday.kerplunk.Mygeneration;
import com.greenday.kerplunk.Nooneknows;
import com.greenday.kerplunk.Oneoflies;
import com.greenday.kerplunk.Oominated;
import com.greenday.kerplunk.Privateale;
import com.greenday.kerplunk.Razorbacks;
import com.greenday.kerplunk.Strangeland;
import com.greenday.kerplunk.Sweetchildren;
import com.greenday.kerplunk.Whowrote;
import com.greenday.kerplunk.Wordsmightate;
import com.greenday.nimrod.Allthetime;
import com.greenday.nimrod.Goodriddance;
import com.greenday.nimrod.Grouch;
import com.greenday.nimrod.Haushinka;
import com.greenday.nimrod.Hitchinaride;
import com.greenday.nimrod.Jinx;
import com.greenday.nimrod.Kingforaday;
import com.greenday.nimrod.Niceguys;
import com.greenday.nimrod.Platypus;
import com.greenday.nimrod.Prosthetichead;
import com.greenday.nimrod.Redundant;
import com.greenday.nimrod.Reject;
import com.greenday.nimrod.Scattered;
import com.greenday.nimrod.Takeback;
import com.greenday.nimrod.Uptight;
import com.greenday.nimrod.Walkingalone;
import com.greenday.nimrod.Worryrock;
import com.greenday.shenanigans.Desensitized;
import com.greenday.shenanigans.Dodada;
import com.greenday.shenanigans.Fallinlove;
import com.greenday.shenanigans.Onwagon;
import com.greenday.shenanigans.Outsider;
import com.greenday.shenanigans.Rotting;
import com.greenday.shenanigans.Scumbag;
import com.greenday.shenanigans.Sickofme;
import com.greenday.shenanigans.Suffocate;
import com.greenday.shenanigans.Tiredofwaiting;
import com.greenday.shenanigans.WannabeonTV;
import com.greenday.shenanigans.Youlied;
import com.greenday.shenanigans.Yourdead;
import com.greenday.tcb.Americaneulogy;
import com.greenday.tcb.Eastjesus;
import com.greenday.tcb.Guns;
import com.greenday.tcb.Horseshoes;
import com.greenday.tcb.Inferno;
import com.greenday.tcb.Knowyourenemy;
import com.greenday.tcb.Lastamerican;
import com.greenday.tcb.Lastnight;
import com.greenday.tcb.Lobotomy;
import com.greenday.tcb.Murdercity;
import com.greenday.tcb.Peacemaker;
import com.greenday.tcb.Restlessheart;
import com.greenday.tcb.Seethelight;
import com.greenday.tcb.Songofcentuary;
import com.greenday.tcb.Staticage;
import com.greenday.tcb.Tcb;
import com.greenday.tcb.Vivalagloria;
import com.greenday.tcb.Vivalagloria2;
import com.greenday.tns.Atlibrary;
import com.greenday.tns.Coffeemaker;
import com.greenday.tns.Disappearingboy;
import com.greenday.tns.Dontleaveme;
import com.greenday.tns.Dryice;
import com.greenday.tns.Goingpasalacqua;
import com.greenday.tns.Greenday;
import com.greenday.tns.Iwasthere;
import com.greenday.tns.Judgedaughter;
import com.greenday.tns.Knowledge;
import com.greenday.tns.Oneiwant;
import com.greenday.tns.Onlyofyou;
import com.greenday.tns.Paperlanterns;
import com.greenday.tns.Rest;
import com.greenday.tns.Roadtoacceptance;
import com.greenday.tns.Sixteen;
import com.greenday.tns.Thousandhours;
import com.greenday.tns.Wantbealone;
import com.greenday.tns.Whyyouwanthim;
import com.greenday.tre.Amanda;
import com.greenday.tre.Avesrnde;
import com.greenday.tre.Brutallove;
import com.greenday.tre.Dirtybastards;
import com.greenday.tre.Dramaqueen;
import com.greenday.tre.Kid;
import com.greenday.tre.Littleboytrain;
import com.greenday.tre.Missingyou;
import com.greenday.tre.Ninetyninerev;
import com.greenday.tre.Sexdrugs;
import com.greenday.tre.Theforgotten;
import com.greenday.tre.Walkaway;
import com.greenday.uno.Angelblue;
import com.greenday.uno.Carpediem;
import com.greenday.uno.Fellforyou;
import com.greenday.uno.Killthedj;
import com.greenday.uno.Letyourselfgo;
import com.greenday.uno.Lossofcontrol;
import com.greenday.uno.Nuclearfamily;
import com.greenday.uno.Ohlove;
import com.greenday.uno.Rustyjames;
import com.greenday.uno.Staythenight;
import com.greenday.uno.Sweetsixt;
import com.greenday.uno.Troublemaker;
import com.greenday.unreleased.Allbymyself;
import com.greenday.warning.Bloodsex;
import com.greenday.warning.Castaway;
import com.greenday.warning.Church;
import com.greenday.warning.Deadbeat;
import com.greenday.warning.Fashion;
import com.greenday.warning.Holdon;
import com.greenday.warning.Jackass;
import com.greenday.warning.Macy;
import com.greenday.warning.Minority;
import com.greenday.warning.Misery;
import com.greenday.warning.Waiting;
import com.greenday.warning.Warning;

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
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.all_songs);
		getActionBar().setDisplayHomeAsUpEnabled(true);
		getWindow().setBackgroundDrawableResource(R.drawable.allsongs_bg);
		final ListView lv= (ListView) findViewById(R.id.listView1);
		final EditText txtQuery = (EditText) findViewById(R.id.txtQuery);
		
		//Register broadcast receiver
		IntentFilter iF = new IntentFilter();
		iF.addAction("com.android.music.metachanged");
		registerReceiver(mReceiver, iF);
		
		 //Boot_pref
        boolean firstboot = getSharedPreferences("BOOT_PREF", MODE_PRIVATE).getBoolean("firstboot_allsongs", true);

        if (firstboot){
            // 1) Launch the authentication activity
           		new AlertDialog.Builder(Allsongs.this)
            	.setTitle("INSTRUCTIONS")
            	.setMessage(Html.fromHtml("Instructions for the usage of <b>Now Playing</b> feature<br><br>" +
            			"1. Press on <b><font color='#464ea3'>'Now Playing'</font></b> icon in search bar of 'All Songs'.<br><br>" +
            			"2. Press on <b><font color='#464ea3'>'Search'</font></b> button in the 'Now Playing' screen.<br><br>" +
            			"3. Now press on the <b><font color='#464ea3'>'Play'</font></b> icon in search bar. <br><br>" +
            			"And then you will see name of your current playing song!<br>" +
            			"When you change the song, repeat the same process.<br>" +
            			"<br><br><u><b><font color='#e02923'>Warning!</font></b></u><br>" +
            			"Feature tested only on <br>"))
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
					      "PLAYING_PREF", Context.MODE_PRIVATE);
				String track = prefs.getString("song", "track");
				txtQuery.setText(track);
			}
		});
		
		//Fixes crash of play button
		boolean fix=getIntent().getBooleanExtra("fix", true);
		if(fix)
		{
			//Just kidding :P
		}
		
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
				"I Want To Be On TV",
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
				"Stuart And The Ave",
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
				Toast.makeText(Allsongs.this, "Cleared", 2000).show();
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
					i=new Intent(Allsongs.this, Thousandhours.class);
					startActivity(i);}
				if (values=="16") {
					i=new Intent(Allsongs.this, Sixteen.class);
					startActivity(i);}
				if (values=="2000 Light Years Away") {
					i=new Intent(Allsongs.this, Lightyears.class);
					startActivity(i);}
				if (values=="21 Guns") {
					i=new Intent(Allsongs.this, Guns.class);
					startActivity(i);}
				if (values=="21st Century Breakdown") {
					i=new Intent(Allsongs.this, Tcb.class);
					startActivity(i);}
				if (values=="409 In Your Coffeemaker") {
					i=new Intent(Allsongs.this, Coffeemaker.class);
					startActivity(i);}
				if (values=="80") {
					i=new Intent(Allsongs.this, Eighty.class);
					startActivity(i);}
				if (values=="86") {
					i=new Intent(Allsongs.this, Eightysix.class);
					startActivity(i);}
				if (values=="8th Avenue Serenade") {
					i=new Intent(Allsongs.this, Avesrnde.class);
					startActivity(i);}
				if (values=="99 Revolutions") {
					i=new Intent(Allsongs.this, Ninetyninerev.class);
					startActivity(i);}
				if (values=="All By Myself") {
					i=new Intent(Allsongs.this, Allbymyself.class);
					startActivity(i);}
				if (values=="All The Time") {
					i=new Intent(Allsongs.this, Allthetime.class);
					startActivity(i);}
				if (values=="Amanda") {
					i=new Intent(Allsongs.this, Amanda.class);
					startActivity(i);}
				if (values=="American Eulogy (Mass Hysteria/Modern World)") {
					i=new Intent(Allsongs.this, Americaneulogy.class);
					startActivity(i);}
				if (values=="American Idiot") {
					i=new Intent(Allsongs.this, Americanidiot.class);
					startActivity(i);}
				if (values=="Amy") {
					i=new Intent(Allsongs.this, Amy.class);
					startActivity(i);}
				if (values=="Android") {
					i=new Intent(Allsongs.this, Android.class);
					startActivity(i);}
				if (values=="Angel Blue") {
					i=new Intent(Allsongs.this, Angelblue.class);
					startActivity(i);}
				if (values=="Are We The Waiting") {
					i=new Intent(Allsongs.this, Arewethewaiting.class);
					startActivity(i);}
				if (values=="Armatage Shanks") {
					i=new Intent(Allsongs.this, Armatage.class);
					startActivity(i);}
				if (values=="Ashley") {
					i=new Intent(Allsongs.this, Ashley.class);
					startActivity(i);}
				if (values=="At The Library") {
					i=new Intent(Allsongs.this, Atlibrary.class);
					startActivity(i);}
				if (values=="Bab's Uvula Who?") {
					i=new Intent(Allsongs.this, Babuvula.class);
					startActivity(i);}
				if (values=="Baby Eyes") {
					i=new Intent(Allsongs.this, Babyeyes.class);
					startActivity(i);}
				if (values=="Basket Case") {
					i=new Intent(Allsongs.this, Basketcase.class);
					startActivity(i);}
				if (values=="Before The Lobotomy") {
					i=new Intent(Allsongs.this, Lobotomy.class);
					startActivity(i);}
				if (values=="Best Thing In Town") {
					i=new Intent(Allsongs.this, Bestthing.class);
					startActivity(i);}
				if (values=="Blood, Sex And Booze") {
					i=new Intent(Allsongs.this, Bloodsex.class);
					startActivity(i);}
				if (values=="Boulevard Of Broken Dreams") {
					i=new Intent(Allsongs.this, Boulevardofbd.class);
					startActivity(i);}
				if (values=="Brain Stew") {
					i=new Intent(Allsongs.this, Brainstew.class);
					startActivity(i);}
				if (values=="Brat") {
					i=new Intent(Allsongs.this, Brat.class);
					startActivity(i);}
				if (values=="Brutal Love") {
					i=new Intent(Allsongs.this, Brutallove.class);
					startActivity(i);}
				if (values=="Burnout") {
					i=new Intent(Allsongs.this, Burnout.class);
					startActivity(i);}
				if (values=="Carpe Diem") {
					i=new Intent(Allsongs.this, Carpediem.class);
					startActivity(i);}
				if (values=="Castaway") {
					i=new Intent(Allsongs.this, Castaway.class);
					startActivity(i);}
				if (values=="Christian's Inferno") {
					i=new Intent(Allsongs.this, Inferno.class);
					startActivity(i);}
				if (values=="Christie Road") {
					i=new Intent(Allsongs.this, Christie.class);
					startActivity(i);}
				if (values=="Chump") {
					i=new Intent(Allsongs.this, Chump.class);
					startActivity(i);}
				if (values=="Church On Sunday") {
					i=new Intent(Allsongs.this, Church.class);
					startActivity(i);}
				if (values=="Coming Clean") {
					i=new Intent(Allsongs.this, Comingclean.class);
					startActivity(i);}
				if (values=="Deadbeat Holiday") {
					i=new Intent(Allsongs.this, Deadbeat.class);
					startActivity(i);}
				if (values=="Desensitized") {
					i=new Intent(Allsongs.this, Desensitized.class);
					startActivity(i);}
				if (values=="Dirty Rotten Bastards") {
					i=new Intent(Allsongs.this, Dirtybastards.class);
					startActivity(i);}
				if (values=="Disappearing Boy") {
					i=new Intent(Allsongs.this, Disappearingboy.class);
					startActivity(i);}
				if (values=="Do Da Da") {
					i=new Intent(Allsongs.this, Dodada.class);
					startActivity(i);}
				if (values=="Dominated Love Slave") {
					i=new Intent(Allsongs.this, Oominated.class);
					startActivity(i);}
				if (values=="Don't Leave Me") {
					i=new Intent(Allsongs.this, Dontleaveme.class);
					startActivity(i);}
				if (values=="Don't Wanna Fall In Love") {
					i=new Intent(Allsongs.this, Fallinlove.class);
					startActivity(i);}
				if (values=="Drama Queen") {
					i=new Intent(Allsongs.this, Dramaqueen.class);
					startActivity(i);}
				if (values=="Dry Ice") {
					i=new Intent(Allsongs.this, Dryice.class);
					startActivity(i);}
				if (values=="East Jesus Nowhere") {
					i=new Intent(Allsongs.this, Eastjesus.class);
					startActivity(i);}
				if (values=="Emenius Sleepus") {
					i=new Intent(Allsongs.this, Emeniussleepus.class);
					startActivity(i);}
				if (values=="Extraordinary Girl") {
					i=new Intent(Allsongs.this, Extraordgirl.class);
					startActivity(i);}
				if (values=="F.O.D.") {
					i=new Intent(Allsongs.this, FOD.class);
					startActivity(i);}
				if (values=="Fashion Victim") {
					i=new Intent(Allsongs.this, Fashion.class);
					startActivity(i);}
				if (values=="Fell For You") {
					i=new Intent(Allsongs.this, Fellforyou.class);
					startActivity(i);}
				if (values=="Fuck Time") {
					i=new Intent(Allsongs.this, Fucktime.class);
					startActivity(i);}
				if (values=="Geek Stink Breath") {
					i=new Intent(Allsongs.this, Geekstink.class);
					startActivity(i);}
				if (values=="Give Me Novacaine") {
					i=new Intent(Allsongs.this, Givemenov.class);
					startActivity(i);}
				if (values=="Going To Pasalacqua") {
					i=new Intent(Allsongs.this, Goingpasalacqua.class);
					startActivity(i);}
				if (values=="Good Riddance (Time Of Your Life)") {
					i=new Intent(Allsongs.this, Goodriddance.class);
					startActivity(i);}
				if (values=="Green Day") {
					i=new Intent(Allsongs.this, Greenday.class);
					startActivity(i);}
				if (values=="Ha Ha You're Dead") {
					i=new Intent(Allsongs.this, Yourdead.class);
					startActivity(i);}
				if (values=="Haushinka") {
					i=new Intent(Allsongs.this, Haushinka.class);
					startActivity(i);}
				if (values=="Having A Blast") {
					i=new Intent(Allsongs.this, Havingblast.class);
					startActivity(i);}
				if (values=="Hitchin' A Ride") {
					i=new Intent(Allsongs.this, Hitchinaride.class);
					startActivity(i);}
				if (values=="Hold On") {
					i=new Intent(Allsongs.this, Holdon.class);
					startActivity(i);}
				if (values=="Holiday") {
					i=new Intent(Allsongs.this, Holiday.class);
					startActivity(i);}
				if (values=="Homecoming") {
					i=new Intent(Allsongs.this, Homecoming.class);
					startActivity(i);}
				if (values=="Horseshoes And Handgrenades") {
					i=new Intent(Allsongs.this, Horseshoes.class);
					startActivity(i);}
				if (values=="I Want To Be Alone") {
					i=new Intent(Allsongs.this, Wantbealone.class);
					startActivity(i);}
				if (values=="I Want To Be On TV") {
					i=new Intent(Allsongs.this, WannabeonTV.class);
					startActivity(i);}
				if (values=="I Was There") {
					i=new Intent(Allsongs.this, Iwasthere.class);
					startActivity(i);}
				if (values=="In The End") {
					i=new Intent(Allsongs.this, Intheend.class);
					startActivity(i);}
				if (values=="Jackass") {
					i=new Intent(Allsongs.this, Jackass.class);
					startActivity(i);}
				if (values=="Jaded") {
					i=new Intent(Allsongs.this, Jaded.class);
					startActivity(i);}
				if (values=="Jesus Of Suburbia") {
					i=new Intent(Allsongs.this, Jesusofsuburb.class);
					startActivity(i);}
				if (values=="Jinx") {
					i=new Intent(Allsongs.this, Jinx.class);
					startActivity(i);}
				if (values=="Kill The DJ") {
					i=new Intent(Allsongs.this, Killthedj.class);
					startActivity(i);}
				if (values=="King For A Day") {
					i=new Intent(Allsongs.this, Kingforaday.class);
					startActivity(i);}
				if (values=="Know Your Enemy") {
					i=new Intent(Allsongs.this, Knowyourenemy.class);
					startActivity(i);}
				if (values=="Knowledge") {
					i=new Intent(Allsongs.this, Knowledge.class);
					startActivity(i);}
				if (values=="Lady Cobra") {
					i=new Intent(Allsongs.this, Ladycobra.class);
					startActivity(i);}
				if (values=="Last Night On Earth") {
					i=new Intent(Allsongs.this, Lastnight.class);
					startActivity(i);}
				if (values=="Last Of American Girls") {
					i=new Intent(Allsongs.this, Lastamerican.class);
					startActivity(i);}
				if (values=="Lazy Bones") {
					i=new Intent(Allsongs.this, Lazybones.class);
					startActivity(i);}
				if (values=="Let Yourself Go") {
					i=new Intent(Allsongs.this, Letyourselfgo.class);
					startActivity(i);}
				if (values=="Letterbomb") {
					i=new Intent(Allsongs.this, Letterbomb.class);
					startActivity(i);}
				if (values=="Little Boy Named Train") {
					i=new Intent(Allsongs.this, Littleboytrain.class);
					startActivity(i);}
				if (values=="Longview") {
					i=new Intent(Allsongs.this, Longview.class);
					startActivity(i);}
				if (values=="Loss Of Control") {
					i=new Intent(Allsongs.this, Lossofcontrol.class);
					startActivity(i);}
				if (values=="Macy's Day Parade") {
					i=new Intent(Allsongs.this, Macy.class);
					startActivity(i);}
				if (values=="Makeout Party") {
					i=new Intent(Allsongs.this, Makeoutparty.class);
					startActivity(i);}
				if (values=="Minority") {
					i=new Intent(Allsongs.this, Minority.class);
					startActivity(i);}
				if (values=="Misery") {
					i=new Intent(Allsongs.this, Misery.class);
					startActivity(i);}
				if (values=="Missing You") {
					i=new Intent(Allsongs.this, Missingyou.class);
					startActivity(i);}
				if (values=="Murder City") {
					i=new Intent(Allsongs.this, Murdercity.class);
					startActivity(i);}
				if (values=="My Generation") {
					i=new Intent(Allsongs.this, Mygeneration.class);
					startActivity(i);}
				if (values=="Nice Guys Finish Last") {
					i=new Intent(Allsongs.this, Niceguys.class);
					startActivity(i);}
				if (values=="Nightlife") {
					i=new Intent(Allsongs.this, Nightlife.class);
					startActivity(i);}
				if (values=="No One Knows") {
					i=new Intent(Allsongs.this, Nooneknows.class);
					startActivity(i);}
				if (values=="No Pride") {
					i=new Intent(Allsongs.this, Nopride.class);
					startActivity(i);}
				if (values=="Nuclear Family") {
					i=new Intent(Allsongs.this, Nuclearfamily.class);
					startActivity(i);}
				if (values=="Oh Love") {
					i=new Intent(Allsongs.this, Ohlove.class);
					startActivity(i);}
				if (values=="On The Wagon") {
					i=new Intent(Allsongs.this, Onwagon.class);
					startActivity(i);}
				if (values=="One For The Razorbacks") {
					i=new Intent(Allsongs.this, Razorbacks.class);
					startActivity(i);}
				if (values=="One Of My Lies") {
					i=new Intent(Allsongs.this, Oneoflies.class);
					startActivity(i);}
				if (values=="Only Of You") {
					i=new Intent(Allsongs.this, Onlyofyou.class);
					startActivity(i);}
				if (values=="Outsider") {
					i=new Intent(Allsongs.this, Outsider.class);
					startActivity(i);}
				if (values=="Panic Song") {
					i=new Intent(Allsongs.this, Panicsong.class);
					startActivity(i);}
				if (values=="Paper Lanterns") {
					i=new Intent(Allsongs.this, Paperlanterns.class);
					startActivity(i);}
				if (values=="Peacemaker") {
					i=new Intent(Allsongs.this, Peacemaker.class);
					startActivity(i);}
				if (values=="Platypus (I Hate You)") {
					i=new Intent(Allsongs.this, Platypus.class);
					startActivity(i);}
				if (values=="Private Ale") {
					i=new Intent(Allsongs.this, Privateale.class);
					startActivity(i);}
				if (values=="Prosthetic Head") {
					i=new Intent(Allsongs.this, Prosthetichead.class);
					startActivity(i);}
				if (values=="Pulling Teeth") {
					i=new Intent(Allsongs.this, Pullingteeth.class);
					startActivity(i);}
				if (values=="Redundant") {
					i=new Intent(Allsongs.this, Redundant.class);
					startActivity(i);}
				if (values=="Reject") {
					i=new Intent(Allsongs.this, Reject.class);
					startActivity(i);}
				if (values=="Rest") {
					i=new Intent(Allsongs.this, Rest.class);
					startActivity(i);}
				if (values=="Restless Heart Syndrome") {
					i=new Intent(Allsongs.this, Restlessheart.class);
					startActivity(i);}
				if (values=="Road To Acceptance") {
					i=new Intent(Allsongs.this, Roadtoacceptance.class);
					startActivity(i);}
				if (values=="Rotting") {
					i=new Intent(Allsongs.this, Rotting.class);
					startActivity(i);}
				if (values=="Rusty James") {
					i=new Intent(Allsongs.this, Rustyjames.class);
					startActivity(i);}
				if (values=="Sassafras Roots") {
					i=new Intent(Allsongs.this, Sassafrasroots.class);
					startActivity(i);}
				if (values=="Scattered") {
					i=new Intent(Allsongs.this, Scattered.class);
					startActivity(i);}
				if (values=="Scumbag") {
					i=new Intent(Allsongs.this, Scumbag.class);
					startActivity(i);}
				if (values=="See The Light") {
					i=new Intent(Allsongs.this, Seethelight.class);
					startActivity(i);}
				if (values=="See You Tonight") {
					i=new Intent(Allsongs.this, Cutonight.class);
					startActivity(i);}
				if (values=="Sex, Drugs & Violence") {
					i=new Intent(Allsongs.this, Sexdrugs.class);
					startActivity(i);}
				if (values=="She") {
					i=new Intent(Allsongs.this, She.class);
					startActivity(i);}
				if (values=="She's A Rebel") {
					i=new Intent(Allsongs.this, Shesarebel.class);
					startActivity(i);}
				if (values=="Sick Of Me") {
					i=new Intent(Allsongs.this, Sickofme.class);
					startActivity(i);}
				if (values=="Song Of The Century") {
					i=new Intent(Allsongs.this, Songofcentuary.class);
					startActivity(i);}
				if (values=="St. Jimmy") {
					i=new Intent(Allsongs.this, Stjimmy.class);
					startActivity(i);}
				if (values=="Stay The Night") {
					i=new Intent(Allsongs.this, Staythenight.class);
					startActivity(i);}
				if (values=="Stop When The Red Lights Flash") {
					i=new Intent(Allsongs.this, Stopredflash.class);
					startActivity(i);}
				if (values=="Strangeland") {
					i=new Intent(Allsongs.this, Strangeland.class);
					startActivity(i);}
				if (values=="Stray Heart") {
					i=new Intent(Allsongs.this, Strayheart.class);
					startActivity(i);}
				if (values=="Stuart And The Ave") {
					i=new Intent(Allsongs.this, Stuartave.class);
					startActivity(i);}
				if (values=="Stuck With Me") {
					i=new Intent(Allsongs.this, Stuckwithme.class);
					startActivity(i);}
				if (values=="Suffocate") {
					i=new Intent(Allsongs.this, Suffocate.class);
					startActivity(i);}
				if (values=="Sweet 16") {
					i=new Intent(Allsongs.this, Sweetsixt.class);
					startActivity(i);}
				if (values=="Sweet Children") {
					i=new Intent(Allsongs.this, Sweetchildren.class);
					startActivity(i);}
				if (values=="Take Back") {
					i=new Intent(Allsongs.this, Takeback.class);
					startActivity(i);}
				if (values=="The Forgotten") {
					i=new Intent(Allsongs.this, Theforgotten.class);
					startActivity(i);}
				if (values=="The Grouch") {
					i=new Intent(Allsongs.this, Grouch.class);
					startActivity(i);}
				if (values=="The Judge's Daughter") {
					i=new Intent(Allsongs.this, Judgedaughter.class);
					startActivity(i);}
				if (values=="The One I Want") {
					i=new Intent(Allsongs.this, Oneiwant.class);
					startActivity(i);}
				if (values=="The Static Age") {
					i=new Intent(Allsongs.this, Staticage.class);
					startActivity(i);}
				if (values=="Tight Wadd Hill") {
					i=new Intent(Allsongs.this, Tightwad.class);
					startActivity(i);}
				if (values=="Tired Of Waiting For You") {
					i=new Intent(Allsongs.this, Tiredofwaiting.class);
					startActivity(i);}
				if (values=="Troublemaker") {
					i=new Intent(Allsongs.this, Troublemaker.class);
					startActivity(i);}
				if (values=="Uptight") {
					i=new Intent(Allsongs.this, Uptight.class);
					startActivity(i);}
				if (values=="Waiting") {
					i=new Intent(Allsongs.this, Waiting.class);
					startActivity(i);}
				if (values=="Wake Me Up When September Ends") {
					i=new Intent(Allsongs.this, Wakemeup.class);
					startActivity(i);}
				if (values=="Walk Away") {
					i=new Intent(Allsongs.this, Walkaway.class);
					startActivity(i);}
				if (values=="Walking Alone") {
					i=new Intent(Allsongs.this, Walkingalone.class);
					startActivity(i);}
				if (values=="Walking Contradiction") {
					i=new Intent(Allsongs.this, Walking.class);
					startActivity(i);}
				if (values=="Warning") {
					i=new Intent(Allsongs.this, Warning.class);
					startActivity(i);}
				//if (values=="Welcome To Paradise") {
					//i=new Intent(Allsongs.this, Welcome.class);
					//startActivity(i);}
				if (values=="Welcome To Paradise") {
					i=new Intent(Allsongs.this, Welcomeparadise.class);
					startActivity(i);}
				if (values=="Westbound Sign") {
					i=new Intent(Allsongs.this, Westbound.class);
					startActivity(i);}
				if (values=="Whatsername") {
					i=new Intent(Allsongs.this, Whatshername.class);
					startActivity(i);}
				if (values=="When I Come Around") {
					i=new Intent(Allsongs.this, Whencomearound.class);
					startActivity(i);}
				if (values=="Who Wrote Holden Caulfield?") {
					i=new Intent(Allsongs.this, Whowrote.class);
					startActivity(i);}
				if (values=="Why Do You Want Him?") {
					i=new Intent(Allsongs.this, Whyyouwanthim.class);
					startActivity(i);}
				if (values=="Wild One") {
					i=new Intent(Allsongs.this, Wildone.class);
					startActivity(i);}
				if (values=="Words I Might Have Ate") {
					i=new Intent(Allsongs.this, Wordsmightate.class);
					startActivity(i);}
				if (values=="Worry Rock") {
					i=new Intent(Allsongs.this, Worryrock.class);
					startActivity(i);}
				if (values=="Wow! That's Loud") {
					i=new Intent(Allsongs.this, Wowthatsloud.class);
					startActivity(i);}
				if (values=="X-Kid") {
					i=new Intent(Allsongs.this, Kid.class);
					startActivity(i);}
				if (values=="You Lied") {
					i=new Intent(Allsongs.this, Youlied.class);
					startActivity(i);}
				if (values=="¡Viva La Gloria!") {
					i=new Intent(Allsongs.this, Vivalagloria.class);
					startActivity(i);}
				if (values=="¿Viva La Gloria? (Little Girl)") {
					i=new Intent(Allsongs.this, Vivalagloria2.class);
					startActivity(i);}
				if (values=="J.A.R. (Jason Andrew Relva)") {
					i=new Intent(Allsongs.this, JAR.class);
					startActivity(i);}
				
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
				//Log report
			    Logger log = LoggerFactory.getLogger(Allsongs.class);
			    log.info("All Songs");
				startActivity(new Intent(getApplicationContext(), Reportproblem.class));
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
				      "PLAYING_PREF", Context.MODE_PRIVATE);
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
