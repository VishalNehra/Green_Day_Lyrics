package com.greenday.lyrics;

import java.util.ArrayList;
import java.util.List;

import android.app.ActionBar;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Toast;

import com.espian.showcaseview.OnShowcaseEventListener;
import com.espian.showcaseview.ShowcaseView;
import com.espian.showcaseview.targets.ActionItemTarget;
import com.google.android.gms.analytics.GoogleAnalytics;
import com.greenday.americanidiot.AmericanIdiotMain;
import com.greenday.database.DBHandler;
import com.greenday.database.Track;
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
import com.greenday.unreleased.Unreleased;
import com.greenday.warning.WarningMain;

import de.keyboardsurfer.android.widget.crouton.Crouton;
import de.keyboardsurfer.android.widget.crouton.Style;
import de.timroes.android.listview.EnhancedListView;
import de.timroes.android.listview.EnhancedListView.OnDismissCallback;
import de.timroes.android.listview.EnhancedListView.Undoable;

public class Favorites extends Activity {
	
	ArrayAdapter<String> adapter;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.favorites);
		
		//Google Analytics
		//Get a Tracker (should auto-report)
		((Frontend) getApplication()).getTracker(Frontend.TrackerName.APP_TRACKER);
		
		getWindow().setBackgroundDrawableResource(R.drawable.allsongs_bg);
		getActionBar().setDisplayHomeAsUpEnabled(true);
		
		//Action bar color
        int ab_def_color= Color.parseColor("#222222");
        int ab_color=PreferenceManager.getDefaultSharedPreferences(this).getInt("ab_theme", ab_def_color);
        ActionBar ab =getActionBar();
        ab.setBackgroundDrawable(new ColorDrawable(ab_color));
		
		final EnhancedListView lv = (EnhancedListView) findViewById(R.id.listView1);
		
		//Getting list from database
		final DBHandler db = new DBHandler(this, null, null, 1);
		List<Track> track = db.getAllTracks();
		final ArrayList<String> list = new ArrayList<String>();
		
		for(Track t : track) {
			list.add(t.getTrackName());
		}
		
		adapter = new ArrayAdapter<String>(Favorites.this, android.R.layout.simple_list_item_1, list);
		lv.setAdapter(adapter);
		
		//Setting empty listview
		TextView tv = (TextView) findViewById(R.id.textView1);
		tv.setText("Start adding favorites by pressing on '+' icon !");
		lv.setEmptyView(findViewById(R.id.textView1));
		
		lv.setDismissCallback(new OnDismissCallback() {
			
			@Override
			public Undoable onDismiss(EnhancedListView listView, final int position) {
				// TODO Auto-generated method stub
				final String item = adapter.getItem(position);
			    // Remove the item from the adapter
			    adapter.remove(item);
			    // return an Undoable
			    return new EnhancedListView.Undoable() {
				      // Reinsert the item to the adapter
				      @Override 
				      public void undo() {
				    	  adapter.insert(item, position);
				      }

				      // Return a string for your item
				      @Override 
				      public String getTitle() {
				    	  return "Removed " + "\"" + item + "\""; // Undo text
				      }

				      // Delete item completely from your persistent storage
				      @Override 
				      public void discard() {
				    	  db.deleteTrack(item);
				      }
			    };

			}
		});
		//Enabling swipe to dismiss
		lv.enableSwipeToDismiss();
		//Disable touch check for undo
		lv.setRequireTouchBeforeDismiss(false);
		//Scroll
		lv.setFastScrollAlwaysVisible(true);
		lv.setFastScrollEnabled(true);
		
		lv.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position, long _id) {
				
				String values = adapter.getItem(position);
				if (values.equals("1,000 Hours")) {
					Intent intent = new Intent(Favorites.this, Tns.class);     
	                intent.putExtra("track", 15);
	                startActivity(intent);}
				if (values.equals("16")) {
					Intent intent = new Intent(Favorites.this, Tns.class);     
	                intent.putExtra("track", 7);
	                startActivity(intent);}
				if (values.equals("2000 Light Years Away")) {
					Intent intent = new Intent(Favorites.this, Kerplunk.class);     
	                intent.putExtra("track", 1);
	                startActivity(intent);}
				if (values.equals("21 Guns")) {
					Intent intent = new Intent(Favorites.this, TcbMain.class);     
	                intent.putExtra("track", 16);
	                startActivity(intent);}
				if (values.equals("21st Century Breakdown")) {
					Intent intent1 = new Intent(Favorites.this, TcbMain.class);     
	                intent1.putExtra("track", 2);
	                startActivity(intent1);}
				if (values.equals("409 In Your Coffeemaker")) {
					Intent intent = new Intent(Favorites.this, Tns.class);     
	                intent.putExtra("track", 13);
	                startActivity(intent);}
				if (values.equals("80")) {
					Intent intent = new Intent(Favorites.this, Kerplunk.class);     
	                intent.putExtra("track", 8);
	                startActivity(intent);}
				if (values.equals("86")) {
					Intent intent = new Intent(Favorites.this, Insomniac.class);     
	                intent.putExtra("track", 7);
	                startActivity(intent);}
				if (values.equals("8th Avenue Serenade")) {
					Intent intent = new Intent(Favorites.this, Tre.class);     
	                intent.putExtra("track", 3);
	                startActivity(intent);}
				if (values.equals("99 Revolutions")) {
					Intent intent = new Intent(Favorites.this, Tre.class);     
	                intent.putExtra("track", 11);
	                startActivity(intent);}
				if (values.equals("All By Myself")) {
					Intent intent = new Intent(Favorites.this, Dookie.class);     
	                intent.putExtra("track", 1);
	                startActivity(intent);}
				if (values.equals("All The Time")) {
					Intent intent = new Intent(Favorites.this, Nimrod.class);     
	                intent.putExtra("track", 6);
	                startActivity(intent);}
				if (values.equals("Amanda")) {
					Intent intent = new Intent(Favorites.this, Tre.class);     
	                intent.putExtra("track", 8);
	                startActivity(intent);}
				if (values.equals("American Eulogy (Mass Hysteria/Modern World)")) {
					Intent intent = new Intent(Favorites.this, TcbMain.class);     
	                intent.putExtra("track", 17);
	                startActivity(intent);}
				if (values.equals("American Idiot")) {
					Intent intent = new Intent(Favorites.this, AmericanIdiotMain.class);     
	                intent.putExtra("track", 1);
	                startActivity(intent);}
				if (values.equals("Amy")) {
					Intent intent = new Intent(Favorites.this, Dos.class);     
	                intent.putExtra("track", 13);
	                startActivity(intent);}
				if (values.equals("Android")) {
					Intent intent = new Intent(Favorites.this, Kerplunk.class);     
	                intent.putExtra("track", 9);
	                startActivity(intent);}
				if (values.equals("Angel Blue")) {
					Intent intent = new Intent(Favorites.this, Uno.class);     
	                intent.putExtra("track", 9);
	                startActivity(intent);}
				if (values.equals("Are We The Waiting")) {
					Intent intent = new Intent(Favorites.this, AmericanIdiotMain.class);   
               	 	intent.putExtra("track", 5);
	                startActivity(intent);}
				if (values.equals("Armatage Shanks")) {
					Intent intent = new Intent(Favorites.this, Insomniac.class);     
	                intent.putExtra("track", 1);
	                startActivity(intent);}
				if (values.equals("Ashley")) {
					Intent intent = new Intent(Favorites.this, Dos.class);     
	                intent.putExtra("track", 8);
	                startActivity(intent);}
				if (values.equals("At The Library")) {
					Intent intent = new Intent(Favorites.this, Tns.class);     
	                intent.putExtra("track", 1);
	                startActivity(intent);}
				if (values.equals("Bab's Uvula Who?")) {
					Intent intent = new Intent(Favorites.this, Insomniac.class);     
	                intent.putExtra("track", 6);
	                startActivity(intent);}
				if (values.equals("Baby Eyes")) {
					Intent intent = new Intent(Favorites.this, Dos.class);     
	                intent.putExtra("track", 9);
	                startActivity(intent);}
				if (values.equals("Basket Case")) {
					Intent intent = new Intent(Favorites.this, Dookie.class);     
	                intent.putExtra("track", 8);
	                startActivity(intent);}
				if (values.equals("Before The Lobotomy")) {
					Intent intent = new Intent(Favorites.this, TcbMain.class);   
               	 	intent.putExtra("track", 5);
	                startActivity(intent);}
				if (values.equals("Best Thing In Town")) {
					Intent intent = new Intent(Favorites.this, Kerplunk.class);     
	                intent.putExtra("track", 14);
	                startActivity(intent);}
				if (values.equals("Blood, Sex And Booze")) {
					Intent intent1 = new Intent(Favorites.this, WarningMain.class);     
                    intent1.putExtra("track", 2);
                    startActivity(intent1);}
				if (values.equals("Boulevard Of Broken Dreams")) {
					Intent intent = new Intent(Favorites.this, AmericanIdiotMain.class);     
	                intent.putExtra("track", 4);
	                startActivity(intent);}
				if (values.equals("Brain Stew")) {
					Intent intent = new Intent(Favorites.this, Insomniac.class);     
	                intent.putExtra("track", 10);
	                startActivity(intent);}
				if (values.equals("Brat")) {
					Intent intent1 = new Intent(Favorites.this, Insomniac.class);     
	                intent1.putExtra("track", 2);
	                startActivity(intent1);}
				if (values.equals("Brutal Love")) {
					Intent intent = new Intent(Favorites.this, Tre.class);     
	                intent.putExtra("track", 1);
	                startActivity(intent);}
				if (values.equals("Burnout")) {
					Intent intent1 = new Intent(Favorites.this, Dookie.class);     
	                intent1.putExtra("track", 2);
	                startActivity(intent1);}
				if (values.equals("Carpe Diem")) {
					Intent intent = new Intent(Favorites.this, Uno.class);     
	                intent.putExtra("track", 3);
	                startActivity(intent);}
				if (values.equals("Castaway")) {
					Intent intent = new Intent(Favorites.this, WarningMain.class);     
                    intent.putExtra("track", 5);
                    startActivity(intent);}
				if (values.equals("Christian's Inferno")) {
					Intent intent = new Intent(Favorites.this, TcbMain.class);     
	                intent.putExtra("track", 6);
	                startActivity(intent);}
				if (values.equals("Christie Road")) {
					Intent intent = new Intent(Favorites.this, Kerplunk.class);     
	                intent.putExtra("track", 4);
	                startActivity(intent);}
				if (values.equals("Chump")) {
					Intent intent = new Intent(Favorites.this, Dookie.class);     
	                intent.putExtra("track", 4);
	                startActivity(intent);}
				if (values.equals("Church On Sunday")) {
					Intent intent = new Intent(Favorites.this, WarningMain.class);     
                    intent.putExtra("track", 3);
                    startActivity(intent);}
				if (values.equals("Coming Clean")) {
					Intent intent = new Intent(Favorites.this, Dookie.class);     
	                intent.putExtra("track", 12);
	                startActivity(intent);}
				if (values.equals("Deadbeat Holiday")) {
					Intent intent = new Intent(Favorites.this, WarningMain.class);     
                    intent.putExtra("track", 7);
                    startActivity(intent);}
				if (values.equals("Desensitized")) {
					Intent intent1 = new Intent(Favorites.this, Shenanigans.class);     
	                intent1.putExtra("track", 2);
	                startActivity(intent1);}
				if (values.equals("Dirty Rotten Bastards")) {
					Intent intent = new Intent(Favorites.this, Tre.class);     
	                intent.putExtra("track", 10);
	                startActivity(intent);}
				if (values.equals("Disappearing Boy")) {
					Intent intent = new Intent(Favorites.this, Tns.class);     
	                intent.putExtra("track", 4);
	                startActivity(intent);}
				if (values.equals("Do Da Da")) {
					Intent intent = new Intent(Favorites.this, Shenanigans.class);     
	                intent.putExtra("track", 12);
	                startActivity(intent);}
				if (values.equals("Dominated Love Slave")) {
					Intent intent = new Intent(Favorites.this, Kerplunk.class);     
	                intent.putExtra("track", 6);
	                startActivity(intent);}
				if (values.equals("Don't Leave Me")) {
					Intent intent1 = new Intent(Favorites.this, Tns.class);     
	                intent1.putExtra("track", 2);
	                startActivity(intent1);}
				if (values.equals("Don't Wanna Fall In Love")) {
					Intent intent = new Intent(Favorites.this, Shenanigans.class);   
               	 	intent.putExtra("track", 5);
	                startActivity(intent);}
				if (values.equals("Drama Queen")) {
					Intent intent = new Intent(Favorites.this, Tre.class);     
	                intent.putExtra("track", 4);
	                startActivity(intent);}
				if (values.equals("Dry Ice")) {
					Intent intent = new Intent(Favorites.this, Tns.class);     
	                intent.putExtra("track", 16);
	                startActivity(intent);}
				if (values.equals("East Jesus Nowhere")) {
					Intent intent = new Intent(Favorites.this, TcbMain.class);     
	                intent.putExtra("track", 8);
	                startActivity(intent);}
				if (values.equals("Emenius Sleepus")) {
					Intent intent = new Intent(Favorites.this, Dookie.class);     
	                intent.putExtra("track", 13);
	                startActivity(intent);}
				if (values.equals("Espionage")) {
					Intent intent = new Intent(Favorites.this, Shenanigans.class);     
	                intent.putExtra("track", 6);
	                startActivity(intent);}
				if (values.equals("Extraordinary Girl")) {
					Intent intent = new Intent(Favorites.this, AmericanIdiotMain.class);     
	                intent.putExtra("track", 9);
	                startActivity(intent);}
				if (values.equals("F.O.D.")) {
					Intent intent = new Intent(Favorites.this, Dookie.class);     
	                intent.putExtra("track", 15);
	                startActivity(intent);}
				if (values.equals("Fashion Victim")) {
					Intent intent = new Intent(Favorites.this, WarningMain.class);     
                    intent.putExtra("track", 4);
                    startActivity(intent);}
				if (values.equals("Fell For You")) {
					Intent intent = new Intent(Favorites.this, Uno.class);     
	                intent.putExtra("track", 6);
	                startActivity(intent);}
				if (values.equals("Fuck Time")) {
					Intent intent1 = new Intent(Favorites.this, Dos.class);     
	                intent1.putExtra("track", 2);
	                startActivity(intent1);}
				if (values.equals("Geek Stink Breath")) {
					Intent intent = new Intent(Favorites.this, Insomniac.class);     
	                intent.putExtra("track", 4);
	                startActivity(intent);}
				if (values.equals("Give Me Novacaine")) {
					Intent intent = new Intent(Favorites.this, AmericanIdiotMain.class);     
	                intent.putExtra("track", 7);
	                startActivity(intent);}
				if (values.equals("Going To Pasalacqua")) {
					Intent intent = new Intent(Favorites.this, Tns.class);     
	                intent.putExtra("track", 6);
	                startActivity(intent);}
				if (values.equals("Good Riddance (Time Of Your Life)")) {
					Intent intent = new Intent(Favorites.this, Nimrod.class);     
	                intent.putExtra("track", 17);
	                startActivity(intent);}
				if (values.equals("Green Day")) {
					Intent intent = new Intent(Favorites.this, Tns.class);   
               	 	intent.putExtra("track", 5);
	                startActivity(intent);}
				if (values.equals("Ha Ha You're Dead")) {
					Intent intent = new Intent(Favorites.this, Shenanigans.class);     
	                intent.putExtra("track", 14);
	                startActivity(intent);}
				if (values.equals("Haushinka")) {
					Intent intent = new Intent(Favorites.this, Nimrod.class);     
	                intent.putExtra("track", 12);
	                startActivity(intent);}
				if (values.equals("Having A Blast")) {
					Intent intent = new Intent(Favorites.this, Dookie.class);     
	                intent.putExtra("track", 3);
	                startActivity(intent);}
				if (values.equals("Hitchin' A Ride")) {
					Intent intent1 = new Intent(Favorites.this, Nimrod.class);     
	                intent1.putExtra("track", 2);
	                startActivity(intent1);}
				if (values.equals("Hold On")) {
					Intent intent = new Intent(Favorites.this, WarningMain.class);     
	                intent.putExtra("track", 8);
	                startActivity(intent);}
				if (values.equals("Holiday")) {
					Intent intent = new Intent(Favorites.this, AmericanIdiotMain.class);     
	                intent.putExtra("track", 3);
	                startActivity(intent);}
				if (values.equals("Homecoming")) {
					Intent intent = new Intent(Favorites.this, AmericanIdiotMain.class);     
	                intent.putExtra("track", 12);
	                startActivity(intent);}
				if (values.equals("Horseshoes And Handgrenades")) {
					Intent intent = new Intent(Favorites.this, TcbMain.class);     
	                intent.putExtra("track", 14);
	                startActivity(intent);}
				if (values.equals("I Want To Be Alone")) {
					Intent intent = new Intent(Favorites.this, Tns.class);     
	                intent.putExtra("track", 19);
	                startActivity(intent);}
				if (values.equals("I Want To Be On T.V.")) {
					Intent intent = new Intent(Favorites.this, Shenanigans.class);     
	                intent.putExtra("track", 7);
	                startActivity(intent);}
				if (values.equals("I Was There")) {
					Intent intent = new Intent(Favorites.this, Tns.class);     
	                intent.putExtra("track", 3);
	                startActivity(intent);}
				if (values.equals("In The End")) {
					Intent intent = new Intent(Favorites.this, Dookie.class);     
	                intent.putExtra("track", 14);
	                startActivity(intent);}
				if (values.equals("Jackass")) {
					Intent intent = new Intent(Favorites.this, WarningMain.class);     
	                intent.putExtra("track", 9);
	                startActivity(intent);}
				if (values.equals("Jaded")) {
					Intent intent = new Intent(Favorites.this, Insomniac.class);     
	                intent.putExtra("track", 11);
	                startActivity(intent);}
				if (values.equals("J.A.R. (Jason Andrew Relva)")) {
					Intent intent = new Intent(Favorites.this, Ins.class);     
	                intent.putExtra("track", 8);
	                startActivity(intent);}
				if (values.equals("Jesus Of Suburbia")) {
					Intent intent1 = new Intent(Favorites.this, AmericanIdiotMain.class);     
	                intent1.putExtra("track", 2);
	                startActivity(intent1);}
				if (values.equals("Jinx")) {
					Intent intent = new Intent(Favorites.this, Nimrod.class);     
	                intent.putExtra("track", 11);
	                startActivity(intent);}
				if (values.equals("Kill The DJ")) {
					Intent intent = new Intent(Favorites.this, Uno.class);   
               	 	intent.putExtra("track", 5);
	                startActivity(intent);}
				if (values.equals("King For A Day")) {
					Intent intent = new Intent(Favorites.this, Nimrod.class);     
	                intent.putExtra("track", 16);
	                startActivity(intent);}
				if (values.equals("Know Your Enemy")) {
					Intent intent = new Intent(Favorites.this, TcbMain.class);     
	                intent.putExtra("track", 3);
	                startActivity(intent);}
				if (values.equals("Knowledge")) {
					Intent intent = new Intent(Favorites.this, Tns.class);     
	                intent.putExtra("track", 14);
	                startActivity(intent);}
				if (values.equals("Lady Cobra")) {
					Intent intent = new Intent(Favorites.this, Dos.class);     
	                intent.putExtra("track", 10);
	                startActivity(intent);}
				if (values.equals("Last Night On Earth")) {
					Intent intent = new Intent(Favorites.this, TcbMain.class);     
	                intent.putExtra("track", 7);
	                startActivity(intent);}
				if (values.equals("Last Of American Girls")) {
					Intent intent = new Intent(Favorites.this, TcbMain.class);     
	                intent.putExtra("track", 10);
	                startActivity(intent);}
				if (values.equals("Lazy Bones")) {
					Intent intent = new Intent(Favorites.this, Dos.class);     
	                intent.putExtra("track", 4);
	                startActivity(intent);}
				if (values.equals("Let Yourself Go")) {
					Intent intent = new Intent(Favorites.this, Uno.class);     
	                intent.putExtra("track", 4);
	                startActivity(intent);}
				if (values.equals("Letterbomb")) {
					Intent intent = new Intent(Favorites.this, AmericanIdiotMain.class);     
	                intent.putExtra("track", 10);
	                startActivity(intent);}
				if (values.equals("Little Boy Named Train")) {
					Intent intent = new Intent(Favorites.this, Tre.class);     
	                intent.putExtra("track", 7);
	                startActivity(intent);}
				if (values.equals("Longview")) {
					Intent intent = new Intent(Favorites.this, Dookie.class);   
               	 	intent.putExtra("track", 5);
	                startActivity(intent);}
				if (values.equals("Loss Of Control")) {
					Intent intent = new Intent(Favorites.this, Uno.class);     
	                intent.putExtra("track", 7);
	                startActivity(intent);}
				if (values.equals("Macy's Day Parade")) {
					Intent intent = new Intent(Favorites.this, WarningMain.class);     
	                intent.putExtra("track", 12);
	                startActivity(intent);}
				if (values.equals("Makeout Party")) {
					Intent intent = new Intent(Favorites.this, Dos.class);     
	                intent.putExtra("track", 6);
	                startActivity(intent);}
				if (values.equals("Minority")) {
					Intent intent = new Intent(Favorites.this, WarningMain.class);     
	                intent.putExtra("track", 11);
	                startActivity(intent);}
				if (values.equals("Maria")) {
					Intent intent = new Intent(Favorites.this, Ins.class);     
	                intent.putExtra("track", 1);
	                startActivity(intent);}
				if (values.equals("Misery")) {
					Intent intent = new Intent(Favorites.this, WarningMain.class);     
	                intent.putExtra("track", 6);
	                startActivity(intent);}
				if (values.equals("Missing You")) {
					Intent intent1 = new Intent(Favorites.this, Tre.class);     
	                intent1.putExtra("track", 2);
	                startActivity(intent1);}
				if (values.equals("Murder City")) {
					Intent intent = new Intent(Favorites.this, TcbMain.class);     
	                intent.putExtra("track", 11);
	                startActivity(intent);}
				if (values.equals("My Generation")) {
					Intent intent = new Intent(Favorites.this, Kerplunk.class);     
	                intent.putExtra("track", 16);
	                startActivity(intent);}
				if (values.equals("Nice Guys Finish Last")) {
					Intent intent = new Intent(Favorites.this, Nimrod.class);     
	                intent.putExtra("track", 1);
	                startActivity(intent);}
				if (values.equals("Nightlife")) {
					Intent intent = new Intent(Favorites.this, Dos.class);     
	                intent.putExtra("track", 11);
	                startActivity(intent);}
				if (values.equals("No One Knows")) {
					Intent intent = new Intent(Favorites.this, Kerplunk.class);     
	                intent.putExtra("track", 10);
	                startActivity(intent);}
				if (values.equals("No Pride")) {
					Intent intent = new Intent(Favorites.this, Insomniac.class);   
               	 	intent.putExtra("track", 5);
	                startActivity(intent);}
				if (values.equals("Nuclear Family")) {
					Intent intent = new Intent(Favorites.this, Uno.class);     
	                intent.putExtra("track", 1);
	                startActivity(intent);}
				if (values.equals("Oh Love")) {
					Intent intent = new Intent(Favorites.this, Uno.class);     
	                intent.putExtra("track", 12);
	                startActivity(intent);}
				if (values.equals("On The Wagon")) {
					Intent intent = new Intent(Favorites.this, Shenanigans.class);     
	                intent.putExtra("track", 13);
	                startActivity(intent);}
				if (values.equals("One For The Razorbacks")) {
					Intent intent1 = new Intent(Favorites.this, Kerplunk.class);     
	                intent1.putExtra("track", 2);
	                startActivity(intent1);}
				if (values.equals("One Of My Lies")) {
					Intent intent = new Intent(Favorites.this, Kerplunk.class);     
	                intent.putExtra("track", 7);
	                startActivity(intent);}
				if (values.equals("Only Of You")) {
					Intent intent = new Intent(Favorites.this, Tns.class);     
	                intent.putExtra("track", 17);
	                startActivity(intent);}
				if (values.equals("Outsider")) {
					Intent intent = new Intent(Favorites.this, Shenanigans.class);     
	                intent.putExtra("track", 4);
	                startActivity(intent);}
				if (values.equals("Panic Song")) {
					Intent intent = new Intent(Favorites.this, Insomniac.class);     
	                intent.putExtra("track", 8);
	                startActivity(intent);}
				if (values.equals("Paper Lanterns")) {
					Intent intent = new Intent(Favorites.this, Tns.class);     
	                intent.putExtra("track", 11);
	                startActivity(intent);}
				if (values.equals("Peacemaker")) {
					Intent intent = new Intent(Favorites.this, TcbMain.class);     
	                intent.putExtra("track", 9);
	                startActivity(intent);}
				if (values.equals("Platypus (I Hate You)")) {
					Intent intent = new Intent(Favorites.this, Nimrod.class);     
	                intent.putExtra("track", 8);
	                startActivity(intent);}
				if (values.equals("Poprocks & Coke")) {
					Intent intent1 = new Intent(Favorites.this, Ins.class);     
	                intent1.putExtra("track", 2);
	                startActivity(intent1);}
				if (values.equals("Private Ale")) {
					Intent intent = new Intent(Favorites.this, Kerplunk.class);   
               	 	intent.putExtra("track", 5);
	                startActivity(intent);}
				if (values.equals("Prosthetic Head")) {
					Intent intent = new Intent(Favorites.this, Nimrod.class);     
	                intent.putExtra("track", 18);
	                startActivity(intent);}
				if (values.equals("Pulling Teeth")) {
					Intent intent = new Intent(Favorites.this, Dookie.class);     
	                intent.putExtra("track", 7);
	                startActivity(intent);}
				if (values.equals("Redundant")) {
					Intent intent = new Intent(Favorites.this, Nimrod.class);     
	                intent.putExtra("track", 4);
	                startActivity(intent);}
				if (values.equals("Reject")) {
					Intent intent = new Intent(Favorites.this, Nimrod.class);     
	                intent.putExtra("track", 14);
	                startActivity(intent);}
				if (values.equals("Rest")) {
					Intent intent = new Intent(Favorites.this, Tns.class);     
	                intent.putExtra("track", 9);
	                startActivity(intent);}
				if (values.equals("Restless Heart Syndrome")) {
					Intent intent = new Intent(Favorites.this, TcbMain.class);     
	                intent.putExtra("track", 13);
	                startActivity(intent);}
				if (values.equals("Road To Acceptance")) {
					Intent intent = new Intent(Favorites.this, Tns.class);     
	                intent.putExtra("track", 8);
	                startActivity(intent);}
				if (values.equals("Rotting")) {
					Intent intent = new Intent(Favorites.this, Shenanigans.class);     
	                intent.putExtra("track", 11);
	                startActivity(intent);}
				if (values.equals("Rusty James")) {
					Intent intent = new Intent(Favorites.this, Uno.class);     
	                intent.putExtra("track", 11);
	                startActivity(intent);}
				if (values.equals("Sassafras Roots")) {
					Intent intent = new Intent(Favorites.this, Dookie.class);     
	                intent.putExtra("track", 10);
	                startActivity(intent);}
				if (values.equals("Scattered")) {
					Intent intent = new Intent(Favorites.this, Nimrod.class);   
               	 	intent.putExtra("track", 5);
	                startActivity(intent);}
				if (values.equals("Scumbag")) {
					Intent intent = new Intent(Favorites.this, Shenanigans.class);     
	                intent.putExtra("track", 8);
	                startActivity(intent);}
				if (values.equals("See The Light")) {
					Intent intent = new Intent(Favorites.this, TcbMain.class);     
	                intent.putExtra("track", 18);
	                startActivity(intent);}
				if (values.equals("See You Tonight")) {
					Intent intent = new Intent(Favorites.this, Dos.class);     
	                intent.putExtra("track", 1);
	                startActivity(intent);}
				if (values.equals("Sex, Drugs & Violence")) {
					Intent intent = new Intent(Favorites.this, Tre.class);     
	                intent.putExtra("track", 6);
	                startActivity(intent);}
				if (values.equals("She")) {
					Intent intent = new Intent(Favorites.this, Dookie.class);     
	                intent.putExtra("track", 9);
	                startActivity(intent);}
				if (values.equals("She's A Rebel")) {
					Intent intent = new Intent(Favorites.this, AmericanIdiotMain.class);     
	                intent.putExtra("track", 8);
	                startActivity(intent);}
				if (values.equals("Sick Of Me")) {
					Intent intent = new Intent(Favorites.this, Shenanigans.class);     
	                intent.putExtra("track", 10);
	                startActivity(intent);}
				if (values.equals("Song Of The Century")) {
					Intent intent = new Intent(Favorites.this, TcbMain.class);     
	                intent.putExtra("track", 1);
	                startActivity(intent);}
				if (values.equals("St. Jimmy")) {
					Intent intent = new Intent(Favorites.this, AmericanIdiotMain.class);     
	                intent.putExtra("track", 6);
	                startActivity(intent);}
				if (values.equals("Stay The Night")) {
					Intent intent1 = new Intent(Favorites.this, Uno.class);     
	                intent1.putExtra("track", 2);
	                startActivity(intent1);}
				if (values.equals("Stop When The Red Lights Flash")) {
					Intent intent = new Intent(Favorites.this, Dos.class);     
	                intent.putExtra("track", 3);
	                startActivity(intent);}
				if (values.equals("Strangeland")) {
					Intent intent = new Intent(Favorites.this, Kerplunk.class);     
	                intent.putExtra("track", 15);
	                 startActivity(intent);}
				if (values.equals("Stray Heart")) {
					Intent intent = new Intent(Favorites.this, Dos.class);     
	                intent.putExtra("track", 7);
	                startActivity(intent);}
				if (values.equals("Stuart And The Ave.")) {
					Intent intent = new Intent(Favorites.this, Insomniac.class);     
	                intent.putExtra("track", 9);
	                startActivity(intent);}
				if (values.equals("Stuck With Me")) {
					Intent intent = new Intent(Favorites.this, Insomniac.class);     
	                intent.putExtra("track", 3);
	                startActivity(intent);}
				if (values.equals("Suffocate")) {
					Intent intent = new Intent(Favorites.this, Shenanigans.class);     
	                intent.putExtra("track", 1);
	                startActivity(intent);}
				if (values.equals("Sweet 16")) {
					Intent intent = new Intent(Favorites.this, Uno.class);     
	                intent.putExtra("track", 10);
	                startActivity(intent);}
				if (values.equals("Sweet Children")) {
					Intent intent = new Intent(Favorites.this, Kerplunk.class);     
	                intent.putExtra("track", 13);
	                startActivity(intent);}
				if (values.equals("Take Back")) {
					Intent intent = new Intent(Favorites.this, Nimrod.class);     
	                intent.putExtra("track", 15);
	                startActivity(intent);}
				if (values.equals("The Forgotten")) {
					Intent intent = new Intent(Favorites.this, Tre.class);     
	                intent.putExtra("track", 12);
	                startActivity(intent);}
				if (values.equals("The Grouch")) {
					Intent intent = new Intent(Favorites.this, Nimrod.class);     
	                intent.putExtra("track", 3);
	                startActivity(intent);}
				if (values.equals("The Judge's Daughter")) {
					Intent intent = new Intent(Favorites.this, Tns.class);     
	                intent.putExtra("track", 10);
	                startActivity(intent);}
				if (values.equals("The One I Want")) {
					Intent intent = new Intent(Favorites.this, Tns.class);     
	                 intent.putExtra("track", 18);
	                 startActivity(intent);}
				if (values.equals("The Static Age")) {
					Intent intent = new Intent(Favorites.this, TcbMain.class);     
	                intent.putExtra("track", 15);
	                startActivity(intent);}
				if (values.equals("Tight Wadd Hill")) {
					Intent intent = new Intent(Favorites.this, Insomniac.class);     
	                intent.putExtra("track", 13);
	                startActivity(intent);}
				if (values.equals("Tired Of Waiting For You")) {
					Intent intent = new Intent(Favorites.this, Shenanigans.class);     
	                intent.putExtra("track", 9);
	                startActivity(intent);}
				if (values.equals("Troublemaker")) {
					Intent intent = new Intent(Favorites.this, Uno.class);     
	                intent.putExtra("track", 8);
	                startActivity(intent);}
				if (values.equals("Uptight")) {
					Intent intent = new Intent(Favorites.this, Nimrod.class);     
	                intent.putExtra("track", 9);
	                startActivity(intent);}
				if (values.equals("Waiting")) {
					Intent intent = new Intent(Favorites.this, WarningMain.class);     
	                intent.putExtra("track", 10);
	                startActivity(intent);}
				if (values.equals("Wake Me Up When September Ends")) {
					Intent intent = new Intent(Favorites.this, AmericanIdiotMain.class);     
	                intent.putExtra("track", 11);
	                startActivity(intent);}
				if (values.equals("Walk Away")) {
					Intent intent = new Intent(Favorites.this, Tre.class);     
	                intent.putExtra("track", 9);
	                startActivity(intent);}
				if (values.equals("Walking Alone")) {
					Intent intent = new Intent(Favorites.this, Nimrod.class);     
	                intent.putExtra("track", 13);
	                startActivity(intent);}
				if (values.equals("Walking Contradiction")) {
					Intent intent = new Intent(Favorites.this, Insomniac.class);     
	                intent.putExtra("track", 14);
	                startActivity(intent);}
				if (values.equals("Warning")) {
					Intent intent = new Intent(Favorites.this, WarningMain.class);     
	                intent.putExtra("track", 1);
	                startActivity(intent);}
				//if (values.equals("Welcome To Paradise") {
					//i=new Intent(Favorites.this, Welcome.class);
					//startActivity(i);}
				if (values.equals("Welcome To Paradise")) {
					Intent intent = new Intent(Favorites.this, Dookie.class);     
	                intent.putExtra("track", 6);
	                startActivity(intent);}
				if (values.equals("Westbound Sign")) {
					Intent intent = new Intent(Favorites.this, Insomniac.class);     
	                intent.putExtra("track", 12);
	                startActivity(intent);}
				if (values.equals("Whatsername")) {
					Intent intent = new Intent(Favorites.this, AmericanIdiotMain.class);     
	                intent.putExtra("track", 13);
	                startActivity(intent);}
				if (values.equals("When I Come Around")) {
					Intent intent = new Intent(Favorites.this, Dookie.class);     
	                intent.putExtra("track", 11);
	                startActivity(intent);}
				if (values.equals("Who Wrote Holden Caulfield?")) {
					Intent intent = new Intent(Favorites.this, Kerplunk.class);     
	                intent.putExtra("track", 11);
	                startActivity(intent);}
				if (values.equals("Why Do You Want Him?")) {
					Intent intent = new Intent(Favorites.this, Tns.class);     
	                intent.putExtra("track", 12);
	                startActivity(intent);}
				if (values.equals("Wild One")) {
					Intent intent = new Intent(Favorites.this, Dos.class);   
               	 	intent.putExtra("track", 5);
	                startActivity(intent);}
				if (values.equals("Words I Might Have Ate")) {
					Intent intent = new Intent(Favorites.this, Kerplunk.class);     
	                intent.putExtra("track", 12);
	                startActivity(intent);}
				if (values.equals("Worry Rock")) {
					Intent intent = new Intent(Favorites.this, Nimrod.class);     
	                intent.putExtra("track", 7);
	                startActivity(intent);}
				if (values.equals("Wow! That's Loud")) {
					Intent intent = new Intent(Favorites.this, Dos.class);     
	                intent.putExtra("track", 12);
	                startActivity(intent);}
				if (values.equals("X-Kid")) {
					Intent intent = new Intent(Favorites.this, Tre.class);   
               	 	intent.putExtra("track", 5);
	                startActivity(intent);}
				if (values.equals("You Lied")) {
					Intent intent = new Intent(Favorites.this, Shenanigans.class);     
	                intent.putExtra("track", 3);
	                startActivity(intent);}
				if (values.equals("¡Viva La Gloria!")) {
					Intent intent = new Intent(Favorites.this, TcbMain.class);     
	                intent.putExtra("track", 4);
	                startActivity(intent);}
				if (values.equals("¿Viva La Gloria? (Little Girl)")) {
					Intent intent = new Intent(Favorites.this, TcbMain.class);     
	                intent.putExtra("track", 12);
	                startActivity(intent);}
				
				/*
				 * Demolicious
				 */
				if (values.equals("99 Revolutions (Demo)")) {
					Intent newActivity = new Intent(Favorites.this, Demolicious.class);     
	                newActivity.putExtra("track", 1);
	                startActivity(newActivity);
				}
				if (values.equals("Angel Blue (Demo)")) {
					Intent newActivity = new Intent(Favorites.this, Demolicious.class);     
	                newActivity.putExtra("track", 2);
	                startActivity(newActivity);
				}if (values.equals("Carpe Diem (Demo)")) {
					Intent newActivity = new Intent(Favorites.this, Demolicious.class);     
	                newActivity.putExtra("track", 3);
	                startActivity(newActivity);
				}if (values.equals("State Of Shock")) {
					Intent newActivity = new Intent(Favorites.this, Demolicious.class);     
	                newActivity.putExtra("track", 4);
	                startActivity(newActivity);
				}if (values.equals("Let Yourself Go (Demo)")) {
					Intent newActivity = new Intent(Favorites.this, Demolicious.class);     
	                newActivity.putExtra("track", 5);
	                startActivity(newActivity);
				}if (values.equals("Sex, Drugs And Violence (Demo)")) {
					Intent newActivity = new Intent(Favorites.this, Demolicious.class);     
	                newActivity.putExtra("track", 6);
	                startActivity(newActivity);
				}if (values.equals("Ashley (Demo)")) {
					Intent newActivity = new Intent(Favorites.this, Demolicious.class);     
	                newActivity.putExtra("track", 7);
	                startActivity(newActivity);
				}if (values.equals("Fell For You (Demo)")) {
					Intent newActivity = new Intent(Favorites.this, Demolicious.class);     
	                newActivity.putExtra("track", 8);
	                startActivity(newActivity);
				}if (values.equals("Stay The Night (Demo)")) {
					Intent newActivity = new Intent(Favorites.this, Demolicious.class);     
	                newActivity.putExtra("track", 9);
	                startActivity(newActivity);
				}if (values.equals("Nuclear Family (Demo)")) {
					Intent newActivity = new Intent(Favorites.this, Demolicious.class);     
	                newActivity.putExtra("track", 10);
	                startActivity(newActivity);
				}if (values.equals("Stray Heart (Demo)")) {
					Intent newActivity = new Intent(Favorites.this, Demolicious.class);     
	                newActivity.putExtra("track", 11);
	                startActivity(newActivity);
				}if (values.equals("Rusty James (Demo)")) {
					Intent newActivity = new Intent(Favorites.this, Demolicious.class);     
	                newActivity.putExtra("track", 12);
	                startActivity(newActivity);
				}if (values.equals("A Little Boy Named Train (Demo)")) {
					Intent newActivity = new Intent(Favorites.this, Demolicious.class);     
	                newActivity.putExtra("track", 13);
	                startActivity(newActivity);
				}if (values.equals("Baby Eyes (Demo)")) {
					Intent newActivity = new Intent(Favorites.this, Demolicious.class);     
	                newActivity.putExtra("track", 14);
	                startActivity(newActivity);
				}if (values.equals("Makeout Party (Demo)")) {
					Intent newActivity = new Intent(Favorites.this, Demolicious.class);     
	                newActivity.putExtra("track", 15);
	                startActivity(newActivity);
				}if (values.equals("Oh Love (Demo)")) {
					Intent newActivity = new Intent(Favorites.this, Demolicious.class);     
	                newActivity.putExtra("track", 16);
	                startActivity(newActivity);
				}if (values.equals("Missing You (Demo)")) {
					Intent newActivity = new Intent(Favorites.this, Demolicious.class);     
	                newActivity.putExtra("track", 17);
	                startActivity(newActivity);
				}if (values.equals("Stay The Night (Acoustic)")) {
					Intent newActivity = new Intent(Favorites.this, Demolicious.class);     
	                newActivity.putExtra("track", 18);
	                startActivity(newActivity);
				}
				
	            /*
	             * Unreleased
	             */
	            if (values.equals("A Quick One While He's Away")) {
	            	Intent i = new Intent(Favorites.this, Unreleased.class);     
	                i.putExtra("track", 1);
	                startActivity(i);
	            } if (values.equals("Angel and the Jerk")) {
	            	Intent i = new Intent(Favorites.this, Unreleased.class);     
	                i.putExtra("track", 2);
	                startActivity(i);
	            } if (values.equals("Another State Of Mind")) {
	                Intent i = new Intent(Favorites.this, Unreleased.class);     
	                i.putExtra("track", 3);
	                startActivity(i);
	            } if (values.equals("Billie Joe's Mom")) {
	                Intent i = new Intent(Favorites.this, Unreleased.class);     
	                i.putExtra("track", 4);
	                startActivity(i);
	            } if (values.equals("Boys in the Bathroom Stall")) {
	                Intent i = new Intent(Favorites.this, Unreleased.class);     
	                i.putExtra("track", 5);
	                startActivity(i);
	            } if (values.equals("Can't Make Love")) {
	                Intent i = new Intent(Favorites.this, Unreleased.class);     
	                i.putExtra("track", 6);
	                startActivity(i);
	            } if (values.equals("Chocolate Rain")) {
	            	Intent i = new Intent(Favorites.this, Unreleased.class);     
	                i.putExtra("track", 7);
	                startActivity(i);
	            } if (values.equals("Cigarettes And Valentines")) {
	            	Intent i = new Intent(Favorites.this, Unreleased.class);     
	                i.putExtra("track", 8);
	                startActivity(i);
	            } if (values.equals("D.U.I.")) {
	                Intent i = new Intent(Favorites.this, Unreleased.class);     
	                i.putExtra("track", 9);
	                startActivity(i);
	            } if (values.equals("Depression Times")) {
	                Intent i = new Intent(Favorites.this, Unreleased.class);     
	                i.putExtra("track", 10);
	                startActivity(i);
	            } if (values.equals("Don't Want to Know If You Are Lonely")) {
	                Intent i = new Intent(Favorites.this, Unreleased.class);     
	                i.putExtra("track", 11);
	                startActivity(i);
	            } if (values.equals("Dream Catcher")) {
	                Intent i = new Intent(Favorites.this, Unreleased.class);     
	                i.putExtra("track", 12);
	                startActivity(i);
	            } if (values.equals("Favourite Son")) {
	            	Intent i = new Intent(Favorites.this, Unreleased.class);     
	                i.putExtra("track", 13);
	                startActivity(i);
	            } if (values.equals("Food Around the Corner")) {
	            	Intent i = new Intent(Favorites.this, Unreleased.class);     
	                i.putExtra("track", 14);
	                startActivity(i);
	            } if (values.equals("Governator")) {
	                Intent i = new Intent(Favorites.this, Unreleased.class);     
	                i.putExtra("track", 15);
	                startActivity(i);
	            } if (values.equals("Hearts Collide")) {
	                Intent i = new Intent(Favorites.this, Unreleased.class);     
	                i.putExtra("track", 16);
	                startActivity(i);
	            } if (values.equals("Hybrid Moments")) {
	                Intent i = new Intent(Favorites.this, Unreleased.class);     
	                i.putExtra("track", 17);
	                startActivity(i);
	            } if (values.equals("I Fought The Law")) {
	                Intent i = new Intent(Favorites.this, Unreleased.class);     
	                i.putExtra("track", 18);
	                startActivity(i);
	            } if (values.equals("I Run NY")) {
	            	Intent i = new Intent(Favorites.this, Unreleased.class);     
	                i.putExtra("track", 19);
	                startActivity(i);
	            } if (values.equals("Jennifer")) {
	            	Intent i = new Intent(Favorites.this, Unreleased.class);     
	                i.putExtra("track", 20);
	                startActivity(i);
	            } if (values.equals("Lights Out")) {
	                Intent i = new Intent(Favorites.this, Unreleased.class);     
	                i.putExtra("track", 21);
	                startActivity(i);
	            } if (values.equals("Like A Rolling Stone")) {
	                Intent i = new Intent(Favorites.this, Unreleased.class);     
	                i.putExtra("track", 22);
	                startActivity(i);
	            } if (values.equals("Like a Rat Does Cheese")) {
	                Intent i = new Intent(Favorites.this, Unreleased.class);     
	                i.putExtra("track", 23);
	                startActivity(i);
	            } if (values.equals("Look For Love")) {
	                Intent i = new Intent(Favorites.this, Unreleased.class);     
	                i.putExtra("track", 24);
	                startActivity(i);
	            } if (values.equals("Maybe Forever")) {
	            	Intent i = new Intent(Favorites.this, Unreleased.class);     
	                i.putExtra("track", 25);
	                startActivity(i);
	            } if (values.equals("Mechanical Man")) {
	            	Intent i = new Intent(Favorites.this, Unreleased.class);     
	                i.putExtra("track", 26);
	                startActivity(i);
	            } if (values.equals("Midwest Medley")) {
	                Intent i = new Intent(Favorites.this, Unreleased.class);     
	                i.putExtra("track", 27);
	                startActivity(i);
	            } if (values.equals("Minnesota Girl")) {
	                Intent i = new Intent(Favorites.this, Unreleased.class);     
	                i.putExtra("track", 28);
	                startActivity(i);
	            } if (values.equals("Oh Girl")) {
	                Intent i = new Intent(Favorites.this, Unreleased.class);     
	                i.putExtra("track", 29);
	                startActivity(i);
	            } if (values.equals("Olivia")) {
	                Intent i = new Intent(Favorites.this, Unreleased.class);     
	                i.putExtra("track", 30);
	                startActivity(i);
	            } if (values.equals("Private Hell")) {
	            	Intent i = new Intent(Favorites.this, Unreleased.class);     
	                i.putExtra("track", 31);
	                startActivity(i);
	            } if (values.equals("Radio")) {
	            	Intent i = new Intent(Favorites.this, Unreleased.class);     
	                i.putExtra("track", 32);
	                startActivity(i);
	            } if (values.equals("Second Time Around")) {
	                Intent i = new Intent(Favorites.this, Unreleased.class);     
	                i.putExtra("track", 33);
	                startActivity(i);
	            } if (values.equals("Shoplifter")) {
	                Intent i = new Intent(Favorites.this, Unreleased.class);     
	                i.putExtra("track", 34);
	                startActivity(i);
	            } if (values.equals("Shout")) {
	                Intent i = new Intent(Favorites.this, Unreleased.class);     
	                i.putExtra("track", 35);
	                startActivity(i);
	            } if (values.equals("Supermarket")) {
	                Intent i = new Intent(Favorites.this, Unreleased.class);     
	                i.putExtra("track", 36);
	                startActivity(i);
	            } if (values.equals("Teenage Lobotomy")) {
	            	Intent i = new Intent(Favorites.this, Unreleased.class);     
	                i.putExtra("track", 37);
	                startActivity(i);
	            } if (values.equals("That's All Right")) {
	            	Intent i = new Intent(Favorites.this, Unreleased.class);     
	                i.putExtra("track", 38);
	                startActivity(i);
	            } if (values.equals("The Ballad of Wilhelm Fink")) {
	                Intent i = new Intent(Favorites.this, Unreleased.class);     
	                i.putExtra("track", 39);
	                startActivity(i);
	            } if (values.equals("The Saints Are Coming")) {
	                Intent i = new Intent(Favorites.this, Unreleased.class);     
	                i.putExtra("track", 40);
	                startActivity(i);
	            } if (values.equals("The Simpsons Theme")) {
	                Intent i = new Intent(Favorites.this, Unreleased.class);     
	                i.putExtra("track", 41);
	                startActivity(i);
	            } if (values.equals("The Things I Heard Today")) {
	                Intent i = new Intent(Favorites.this, Unreleased.class);     
	                i.putExtra("track", 42);
	                startActivity(i);
	            } if (values.equals("Too Much, Too Soon")) {
	            	Intent i = new Intent(Favorites.this, Unreleased.class);     
	                i.putExtra("track", 43);
	                startActivity(i);
	            } if (values.equals("Walking the Dog")) {
	            	Intent i = new Intent(Favorites.this, Unreleased.class);     
	                i.putExtra("track", 44);
	                startActivity(i);
	            } if (values.equals("We Are The Champions")) {
	                Intent i = new Intent(Favorites.this, Unreleased.class);     
	                i.putExtra("track", 45);
	                startActivity(i);
	            } if (values.equals("What About Today?")) {
	                Intent i = new Intent(Favorites.this, Unreleased.class);     
	                i.putExtra("track", 46);
	                startActivity(i);
	            } if (values.equals("When It's Time")) {
	                Intent i = new Intent(Favorites.this, Unreleased.class);     
	                i.putExtra("track", 47);
	                startActivity(i);
	            } if (values.equals("When Will I Be Loved")) {
	                Intent i = new Intent(Favorites.this, Unreleased.class);     
	                i.putExtra("track", 48);
	                startActivity(i);
	            } if (values.equals("Why Does It Always Rain on Me?")) {
	            	Intent i = new Intent(Favorites.this, Unreleased.class);     
	                i.putExtra("track", 49);
	                startActivity(i);
	            } if (values.equals("Working Class Hero")) {
	            	Intent i = new Intent(Favorites.this, Unreleased.class);     
	                i.putExtra("track", 50);
	                startActivity(i);
	            } if (values.equals("World Vs. World")) {
	                Intent i = new Intent(Favorites.this, Unreleased.class);     
	                i.putExtra("track", 51);
	                startActivity(i);
	            } if (values.equals("You Can't Fool Me")) {
	                Intent i = new Intent(Favorites.this, Unreleased.class);     
	                i.putExtra("track", 52);
	                startActivity(i);
	            }
			}
		});
		
		//Firstboot pref
		boolean firstboot = getSharedPreferences("BOOT_PREF", MODE_PRIVATE).getBoolean("firstboot_favorites", true);
		if(firstboot) {
			
			//Testing showcaseview
			//Config for second Showcaseview
	        final ShowcaseView.ConfigOptions co = new ShowcaseView.ConfigOptions();
	        //For leaving action bar unhidden; 
	  		//co.insert = ShowcaseView.INSERT_TO_VIEW;
	        //co.centerText = true;
	        //First showcaseview
	        ShowcaseView.ConfigOptions co2 = new ShowcaseView.ConfigOptions(); 
			co2.showcaseId=ShowcaseView.ITEM_ACTION_ITEM;
			co2.hideOnClickOutside=true;
			ActionItemTarget target = new ActionItemTarget(Favorites.this, R.id.action_fav);
			ShowcaseView sv2 = ShowcaseView.insertShowcaseView(target, Favorites.this, "Favorites", "\nAdd new favorite by pressing on this button.\n" +
			 		"You can also add new favorite using poppy bar in lyrics.", co2);
			sv2.show();
	        //Click listeners for first showcaseview
	        sv2.setOnShowcaseEventListener(new OnShowcaseEventListener() {
	        	 @Override
	        	    public void onShowcaseViewHide(ShowcaseView showcaseView) {
	        		 
	        		 //Second showcaseview
	        		 @SuppressWarnings("deprecation")
					 ShowcaseView sv = ShowcaseView.insertShowcaseViewWithType(ShowcaseView.ITEM_ACTION_HOME, 1, Favorites.this,
	        	        		"Favorites", "\nSlide from left to right to remove any favorite.", co);
	        	     //sv.animateGesture(0, 100, 200, 200);
	        	     int x_final_pos = getResources().getDisplayMetrics().widthPixels/2;
	        	     int y_init_pos = getResources().getDisplayMetrics().heightPixels/4;
	        	     sv.animateGesture(0, y_init_pos, x_final_pos, y_init_pos);
	        	     sv.setShowcaseIndicatorScale(0);
					 sv.show();
	        	    }

	        	 @Override
	        	    public void onShowcaseViewShow(ShowcaseView showcaseView) {
	        	        //The view is shown
	        	    }

				@Override
				public void onShowcaseViewDidHide(ShowcaseView showcaseView) {
					// TODO Auto-generated method stub
					
				}
	        	});
			
			getSharedPreferences("BOOT_PREF", MODE_PRIVATE)
			.edit()
			.putBoolean("firstboot_favorites", false).commit();
		}
		
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// TODO Auto-generated method stub
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.menu_fav, menu); 
		return super.onCreateOptionsMenu(menu);
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		switch(item.getItemId()) {
		case android.R.id.home:
			onBackPressed();
			return true;
        case R.id.item1:
        	startActivity(new Intent(Favorites.this, Settings.class));
            return true;
        case R.id.item2:
        	Intent intent = new Intent(this, ReportSong.class);
			intent.putExtra("report_sub", "Feedback");
			startActivity(intent);
            return true;
        case R.id.action_search:
			// search action
        	Intent intent2 = new Intent(Favorites.this, Allsongs.class);
        	intent2.putExtra("Search", true);
        	startActivity(intent2);
			return true;
        case R.id.action_fav:
        	//add new favorite button
        	final String[] fav_array = getResources().getStringArray(R.array.fav_array);
        	final DBHandler db = new DBHandler(this, null, null, 1);
        	new AlertDialog.Builder(Favorites.this)
        	.setTitle("Add new favorite")
        	.setIcon(R.drawable.ic_launcher)
        	.setItems(R.array.fav_array, new OnClickListener() {
				
				@Override
				public void onClick(DialogInterface view, int position) {
					// TODO Auto-generated method stub
					//String fav = ad.getListView().getSelectedItem().toString();
					String selected = fav_array[position];
					//adapter.notifyDataSetChanged();
					//Checking for existing record
					Track findtrack = db.findTrack(selected);
					if(findtrack != null) {
						Crouton.makeText(Favorites.this, "Already in favorites", Style.ALERT).show();
					} else {
						//Adding selected item to database
						db.addTrack(new Track(selected, 0));
						Toast.makeText(Favorites.this, "\"" + selected + "\"" + " added as favorite", Toast.LENGTH_LONG).show();
						recreate();
					}
				}
			})
        	.show();
        default:
            return super.onOptionsItemSelected(item);
		}
	}
	
	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		adapter.notifyDataSetChanged();
		super.onResume();
	}
	
	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		//Get an Analytics tracker to report app starts & uncaught exceptions etc.
		GoogleAnalytics.getInstance(this).reportActivityStart(this);
		super.onStart();
	}
	
	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		//Stop the analytics tracking
		GoogleAnalytics.getInstance(this).reportActivityStop(this);
		super.onStop();
	}
	
	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
    	//Protect crouton
        Crouton.clearCroutonsForActivity(this);
		super.onDestroy();
	}
}