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

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Allsongs extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.all_songs);
		getActionBar().setDisplayHomeAsUpEnabled(true);
		ListView lv= (ListView) findViewById(R.id.listView1);
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
				"8th Ave Serenade",
				"99 Revolutions",
				"All By Myself",
				"All The Time",
				"Amanda",
				"American Eulogy",
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
				"Jesus Of Suburbia",
				"Jinx",
				"Kill The DJ",
				"King For A Day",
				"Know Your Enemy",
				"Knowledge",
				"Lady Cobra",
				"Last Night On Earth",
				"Last Of The American Girls",
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
				"Stop When The Red Light Flash",
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
				"Tired Of Waiting",
				"Troublemaker",
				"Uptight",
				"Waiting",
				"Wake Me Up When September Ends",
				"Walk Away",
				"Walking Alone",
				"Walking Contradiction",
				"Warning",
				"Welcome To Paradise",
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
		lv.setFastScrollEnabled(true);
		lv.setFastScrollAlwaysVisible(true);
		ArrayAdapter<String> adapter=
				new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, values);
		lv.setAdapter(adapter);
		lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> p, View view, int position,
					long id) {
				// TODO Auto-generated method stub
				switch (position)
				{
				case 0: startActivity(new Intent(getApplicationContext(), Thousandhours.class));
				break;
				case 1: startActivity(new Intent(getApplicationContext(), Sixteen.class));
				break;
				case 2: startActivity(new Intent(getApplicationContext(), Lightyears.class));
				break;
				case 3: startActivity(new Intent(getApplicationContext(), Guns.class));
				break;
				case 4: startActivity(new Intent(getApplicationContext(), Tcb.class));
				break;
				case 5: startActivity(new Intent(getApplicationContext(), Coffeemaker.class));
				break;
				case 6: startActivity(new Intent(getApplicationContext(), Eighty.class));
				break;
				case 7: startActivity(new Intent(getApplicationContext(), Eightysix.class));
				break;
				case 8: startActivity(new Intent(getApplicationContext(), Avesrnde.class));
				break;
				case 9: startActivity(new Intent(getApplicationContext(), Ninetyninerev.class));
				break;
				case 10: startActivity(new Intent(getApplicationContext(), Allbymyself.class));
				break;
				case 11: startActivity(new Intent(getApplicationContext(), Allthetime.class));
				break;
				case 12: startActivity(new Intent(getApplicationContext(), Amanda.class));
				break;
				case 13: startActivity(new Intent(getApplicationContext(), Americaneulogy.class));
				break;
				case 14: startActivity(new Intent(getApplicationContext(), Americanidiot.class));
				break;
				case 15: startActivity(new Intent(getApplicationContext(), Amy.class));
				break;
				case 16: startActivity(new Intent(getApplicationContext(), Android.class));
				break;
				case 17: startActivity(new Intent(getApplicationContext(), Angelblue.class));
				break;
				case 18: startActivity(new Intent(getApplicationContext(), Arewethewaiting.class));
				break;
				case 19: startActivity(new Intent(getApplicationContext(), Armatage.class));
				break;
				case 20: startActivity(new Intent(getApplicationContext(), Ashley.class));
				break;
				case 21: startActivity(new Intent(getApplicationContext(), Atlibrary.class));
				break;
				case 22: startActivity(new Intent(getApplicationContext(), Babuvula.class));
				break;
				case 23: startActivity(new Intent(getApplicationContext(), Babyeyes.class));
				break;
				case 24: startActivity(new Intent(getApplicationContext(), Basketcase.class));
				break;
				case 25: startActivity(new Intent(getApplicationContext(), Lobotomy.class));
				break;
				case 26: startActivity(new Intent(getApplicationContext(), Bestthing.class));
				break;
				case 27: startActivity(new Intent(getApplicationContext(), Bloodsex.class));
				break;
				case 28: startActivity(new Intent(getApplicationContext(), Boulevardofbd.class));
				break;
				case 29: startActivity(new Intent(getApplicationContext(), Brainstew.class));
				break;
				case 30: startActivity(new Intent(getApplicationContext(), Brat.class));
				break;
				case 31: startActivity(new Intent(getApplicationContext(), Brutallove.class));
				break;
				case 32: startActivity(new Intent(getApplicationContext(), Burnout.class));
				break;
				case 33: startActivity(new Intent(getApplicationContext(), Carpediem.class));
				break;
				case 34: startActivity(new Intent(getApplicationContext(), Castaway.class));
				break;
				case 35: startActivity(new Intent(getApplicationContext(), Inferno.class));
				break;
				case 36: startActivity(new Intent(getApplicationContext(), Christie.class));
				break;
				case 37: startActivity(new Intent(getApplicationContext(), Chump.class));
				break;
				case 38: startActivity(new Intent(getApplicationContext(), Church.class));
				break;
				case 39: startActivity(new Intent(getApplicationContext(), Comingclean.class));
				break;
				case 40: startActivity(new Intent(getApplicationContext(), Deadbeat.class));
				break;
				case 41: startActivity(new Intent(getApplicationContext(), Desensitized.class));
				break;
				case 42: startActivity(new Intent(getApplicationContext(), Dirtybastards.class));
				break;
				case 43: startActivity(new Intent(getApplicationContext(), Disappearingboy.class));
				break;
				case 44: startActivity(new Intent(getApplicationContext(), Dodada.class));
				break;
				case 45: startActivity(new Intent(getApplicationContext(), Dodada.class));
				break;
				case 46: startActivity(new Intent(getApplicationContext(), Dontleaveme.class));
				break;
				case 47: startActivity(new Intent(getApplicationContext(), Fallinlove.class));
				break;
				case 48: startActivity(new Intent(getApplicationContext(), Dramaqueen.class));
				break;
				case 49: startActivity(new Intent(getApplicationContext(), Dryice.class));
				break;
				case 50: startActivity(new Intent(getApplicationContext(), Eastjesus.class));
				break;
				case 51: startActivity(new Intent(getApplicationContext(), Emeniussleepus.class));
				break;
				case 52: startActivity(new Intent(getApplicationContext(), Extraordgirl.class));
				break;
				case 53: startActivity(new Intent(getApplicationContext(), FOD.class));
				break;
				case 54: startActivity(new Intent(getApplicationContext(), Fashion.class));
				break;
				case 55: startActivity(new Intent(getApplicationContext(), Fellforyou.class));
				break;
				case 56: startActivity(new Intent(getApplicationContext(), Fucktime.class));
				break;
				case 57: startActivity(new Intent(getApplicationContext(), Geekstink.class));
				break;
				case 58: startActivity(new Intent(getApplicationContext(), Givemenov.class));
				break;
				case 59: startActivity(new Intent(getApplicationContext(), Goingpasalacqua.class));
				break;
				case 60: startActivity(new Intent(getApplicationContext(), Goodriddance.class));
				break;
				case 61: startActivity(new Intent(getApplicationContext(), Greenday.class));
				break;
				case 62: startActivity(new Intent(getApplicationContext(), Yourdead.class));
				break;
				case 63: startActivity(new Intent(getApplicationContext(), Haushinka.class));
				break;
				case 64: startActivity(new Intent(getApplicationContext(), Havingblast.class));
				break;
				case 65: startActivity(new Intent(getApplicationContext(), Hitchinaride.class));
				break;
				case 66: startActivity(new Intent(getApplicationContext(), Holdon.class));
				break;
				case 67: startActivity(new Intent(getApplicationContext(), Holiday.class));
				break;
				case 68: startActivity(new Intent(getApplicationContext(), Homecoming.class));
				break;
				case 69: startActivity(new Intent(getApplicationContext(), Horseshoes.class));
				break;
				case 70: startActivity(new Intent(getApplicationContext(), Wantbealone.class));
				break;
				case 71: startActivity(new Intent(getApplicationContext(), WannabeonTV.class));
				break;
				case 72: startActivity(new Intent(getApplicationContext(), Iwasthere.class));
				break;
				case 73: startActivity(new Intent(getApplicationContext(), Intheend.class));
				break;
				case 74: startActivity(new Intent(getApplicationContext(), Jackass.class));
				break;
				case 75: startActivity(new Intent(getApplicationContext(), Jaded.class));
				break;
				case 76: startActivity(new Intent(getApplicationContext(), Jesusofsuburb.class));
				break;
				case 77: startActivity(new Intent(getApplicationContext(), Jinx.class));
				break;
				case 78: startActivity(new Intent(getApplicationContext(), Killthedj.class));
				break;
				case 79: startActivity(new Intent(getApplicationContext(), Kingforaday.class));
				break;
				case 80: startActivity(new Intent(getApplicationContext(), Knowyourenemy.class));
				break;
				case 81: startActivity(new Intent(getApplicationContext(), Knowledge.class));
				break;
				case 82: startActivity(new Intent(getApplicationContext(), Ladycobra.class));
				break;
				case 83: startActivity(new Intent(getApplicationContext(), Lastnight.class));
				break;
				case 84: startActivity(new Intent(getApplicationContext(), Lastamerican.class));
				break;
				case 85: startActivity(new Intent(getApplicationContext(), Lazybones.class));
				break;
				case 86: startActivity(new Intent(getApplicationContext(), Letyourselfgo.class));
				break;
				case 87: startActivity(new Intent(getApplicationContext(), Letterbomb.class));
				break;
				case 88: startActivity(new Intent(getApplicationContext(), Littleboytrain.class));
				break;
				case 89: startActivity(new Intent(getApplicationContext(), Longview.class));
				break;
				case 90: startActivity(new Intent(getApplicationContext(), Lossofcontrol.class));
				break;
				case 91: startActivity(new Intent(getApplicationContext(), Macy.class));
				break;
				case 92: startActivity(new Intent(getApplicationContext(), Makeoutparty.class));
				break;
				case 93: startActivity(new Intent(getApplicationContext(), Minority.class));
				break;
				case 94: startActivity(new Intent(getApplicationContext(), Misery.class));
				break;
				case 95: startActivity(new Intent(getApplicationContext(), Missingyou.class));
				break;
				case 96: startActivity(new Intent(getApplicationContext(), Murdercity.class));
				break;
				case 97: startActivity(new Intent(getApplicationContext(), Mygeneration.class));
				break;
				case 98: startActivity(new Intent(getApplicationContext(), Niceguys.class));
				break;
				case 99: startActivity(new Intent(getApplicationContext(), Nightlife.class));
				break;
				case 100: startActivity(new Intent(getApplicationContext(), Nooneknows.class));
				break;
				case 101: startActivity(new Intent(getApplicationContext(), Nopride.class));
				break;
				case 102: startActivity(new Intent(getApplicationContext(), Nuclearfamily.class));
				break;
				case 103: startActivity(new Intent(getApplicationContext(), Ohlove.class));
				break;
				case 104: startActivity(new Intent(getApplicationContext(), Onwagon.class));
				break;
				case 105: startActivity(new Intent(getApplicationContext(), Razorbacks.class));
				break;
				case 106: startActivity(new Intent(getApplicationContext(), Oneoflies.class));
				break;
				case 107: startActivity(new Intent(getApplicationContext(), Onlyofyou.class));
				break;
				case 108: startActivity(new Intent(getApplicationContext(), Outsider.class));
				break;
				case 109: startActivity(new Intent(getApplicationContext(), Panicsong.class));
				break;
				case 110: startActivity(new Intent(getApplicationContext(), Paperlanterns.class));
				break;
				case 111: startActivity(new Intent(getApplicationContext(), Peacemaker.class));
				break;
				case 112: startActivity(new Intent(getApplicationContext(), Platypus.class));
				break;
				case 113: startActivity(new Intent(getApplicationContext(), Privateale.class));
				break;
				case 114: startActivity(new Intent(getApplicationContext(), Prosthetichead.class));
				break;
				case 115: startActivity(new Intent(getApplicationContext(), Pullingteeth.class));
				break;
				case 116: startActivity(new Intent(getApplicationContext(), Redundant.class));
				break;
				case 117: startActivity(new Intent(getApplicationContext(), Reject.class));
				break;
				case 118: startActivity(new Intent(getApplicationContext(), Rest.class));
				break;
				case 119: startActivity(new Intent(getApplicationContext(), Restlessheart.class));
				break;
				case 120: startActivity(new Intent(getApplicationContext(), Roadtoacceptance.class));
				break;
				case 121: startActivity(new Intent(getApplicationContext(), Rotting.class));
				break;
				case 122: startActivity(new Intent(getApplicationContext(), Rustyjames.class));
				break;
				case 123: startActivity(new Intent(getApplicationContext(), Sassafrasroots.class));
				break;
				case 124: startActivity(new Intent(getApplicationContext(), Scattered.class));
				break;
				case 125: startActivity(new Intent(getApplicationContext(), Scumbag.class));
				break;
				case 126: startActivity(new Intent(getApplicationContext(), Seethelight.class));
				break;
				case 127: startActivity(new Intent(getApplicationContext(), Cutonight.class));
				break;
				case 128: startActivity(new Intent(getApplicationContext(), Sexdrugs.class));
				break;
				case 129: startActivity(new Intent(getApplicationContext(), She.class));
				break;
				case 130: startActivity(new Intent(getApplicationContext(), Shesarebel.class));
				break;
				case 131: startActivity(new Intent(getApplicationContext(), Sickofme.class));
				break;
				case 132: startActivity(new Intent(getApplicationContext(), Songofcentuary.class));
				break;
				case 133: startActivity(new Intent(getApplicationContext(), Stjimmy.class));
				break;
				case 134: startActivity(new Intent(getApplicationContext(), Staythenight.class));
				break;
				case 135: startActivity(new Intent(getApplicationContext(), Stopredflash.class));
				break;
				case 136: startActivity(new Intent(getApplicationContext(), Strangeland.class));
				break;
				case 137: startActivity(new Intent(getApplicationContext(), Strayheart.class));
				break;
				case 138: startActivity(new Intent(getApplicationContext(), Stuartave.class));
				break;
				case 139: startActivity(new Intent(getApplicationContext(), Stuckwithme.class));
				break;
				case 140: startActivity(new Intent(getApplicationContext(), Suffocate.class));
				break;
				case 141: startActivity(new Intent(getApplicationContext(), Sweetsixt.class));
				break;
				case 142: startActivity(new Intent(getApplicationContext(), Sweetchildren.class));
				break;
				case 143: startActivity(new Intent(getApplicationContext(), Takeback.class));
				break;
				case 144: startActivity(new Intent(getApplicationContext(), Theforgotten.class));
				break;
				case 145: startActivity(new Intent(getApplicationContext(), Grouch.class));
				break;
				case 146: startActivity(new Intent(getApplicationContext(), Judgedaughter.class));
				break;
				case 147: startActivity(new Intent(getApplicationContext(), Oneiwant.class));
				break;
				case 148: startActivity(new Intent(getApplicationContext(), Staticage.class));
				break;
				case 149: startActivity(new Intent(getApplicationContext(), Tightwad.class));
				break;
				case 150: startActivity(new Intent(getApplicationContext(), Tiredofwaiting.class));
				break;
				case 151: startActivity(new Intent(getApplicationContext(), Troublemaker.class));
				break;
				case 152: startActivity(new Intent(getApplicationContext(), Uptight.class));
				break;
				case 153: startActivity(new Intent(getApplicationContext(), Waiting.class));
				break;
				case 154: startActivity(new Intent(getApplicationContext(), Wakemeup.class));
				break;
				case 155: startActivity(new Intent(getApplicationContext(), Walkaway.class));
				break;
				case 156: startActivity(new Intent(getApplicationContext(), Walkingalone.class));
				break;
				case 157: startActivity(new Intent(getApplicationContext(), Walking.class));
				break;
				case 158: startActivity(new Intent(getApplicationContext(), Warning.class));
				break;
				case 159: startActivity(new Intent(getApplicationContext(), Welcomeparadise.class));
				break;
				case 160: startActivity(new Intent(getApplicationContext(), com.greenday.ins.Welcomeparadise.class));
				break;
				case 161: startActivity(new Intent(getApplicationContext(), Westbound.class));
				break;
				case 162: startActivity(new Intent(getApplicationContext(), Whatshername.class));
				break;
				case 163: startActivity(new Intent(getApplicationContext(), Whencomearound.class));
				break;
				case 164: startActivity(new Intent(getApplicationContext(), Whowrote.class));
				break;
				case 165: startActivity(new Intent(getApplicationContext(), Whyyouwanthim.class));
				break;
				case 166: startActivity(new Intent(getApplicationContext(), Wildone.class));
				break;
				case 167: startActivity(new Intent(getApplicationContext(), Wordsmightate.class));
				break;
				case 168: startActivity(new Intent(getApplicationContext(), Worryrock.class));
				break;
				case 169: startActivity(new Intent(getApplicationContext(), Wowthatsloud.class));
				break;
				case 170: startActivity(new Intent(getApplicationContext(), Kid.class));
				break;
				case 171: startActivity(new Intent(getApplicationContext(), Youlied.class));
				break;
				case 172: startActivity(new Intent(getApplicationContext(), Vivalagloria.class));
				break;
				case 173: startActivity(new Intent(getApplicationContext(), Vivalagloria2.class));
				break;
				}
				
			}
		});
	}
		
		//Action bar code below
		
		@Override
	    public boolean onCreateOptionsMenu(Menu menu) {
	        getMenuInflater().inflate(R.menu.main, menu);
	        
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
			    Logger log = LoggerFactory.getLogger(Americanidiot.class);
			    log.info("All Songs");
				startActivity(new Intent(getApplicationContext(), Reportproblem.class));
			}
		            return super.onOptionsItemSelected(item);
			
		}
	}
