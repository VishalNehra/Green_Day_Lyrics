package com.greenday.lyrics;

import java.util.ArrayList;
import java.util.List;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

import com.espian.showcaseview.OnShowcaseEventListener;
import com.espian.showcaseview.ShowcaseView;
import com.greenday.database.DBHandler;
import com.greenday.database.Track;
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
		
		getWindow().setBackgroundDrawableResource(R.drawable.allsongs_bg);
		getActionBar().setDisplayHomeAsUpEnabled(true);
		
		//Action bar color
        int ab_def_color= Color.parseColor("#222222");
        int ab_color=PreferenceManager.getDefaultSharedPreferences(this).getInt("ab_theme", ab_def_color);
        ActionBar ab =getActionBar();
        ab.setBackgroundDrawable(new ColorDrawable(ab_color));
		
		EnhancedListView lv = (EnhancedListView) findViewById(R.id.listView1);
		
		//Getting list from database
		final DBHandler db = new DBHandler(this, null, null, 1);
		List<Track> track = db.getAllTracks();
		final ArrayList<String> list = new ArrayList<String>();
		
		for(Track t : track) {
			list.add(t.getTrackName());
		}
		
		adapter = new ArrayAdapter<String>(Favorites.this, android.R.layout.simple_list_item_1, list);
		lv.setAdapter(adapter);
		
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
		
		lv.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,int position, long _id) {
				String values = adapter.getItem(position);
				Log.d("List item", values);
				// TODO Auto-generated method stub
				
				if(values == "Last Night On Earth") {
					Toast.makeText(Favorites.this, "found it", Toast.LENGTH_LONG).show();
				}

				/*if (values=="1,000 Hours") {
					Log.d("List item", "gotcha!");
					Intent intent = new Intent(Favorites.this, Tns.class);     
	                intent.putExtra("track", 15);
	                startActivity(intent);}
				if (values=="16") {
					Intent intent = new Intent(Favorites.this, Tns.class);     
	                intent.putExtra("track", 7);
	                startActivity(intent);}
				if (values=="2000 Light Years Away") {
					Intent intent = new Intent(Favorites.this, Kerplunk.class);     
	                intent.putExtra("track", 1);
	                startActivity(intent);}
				if (values=="21 Guns") {
					Intent intent = new Intent(Favorites.this, TcbMain.class);     
	                intent.putExtra("track", 16);
	                startActivity(intent);}
				if (values=="21st Century Breakdown") {
					Intent intent1 = new Intent(Favorites.this, TcbMain.class);     
	                intent1.putExtra("track", 2);
	                startActivity(intent1);}
				if (values=="409 In Your Coffeemaker") {
					Intent intent = new Intent(Favorites.this, Tns.class);     
	                intent.putExtra("track", 13);
	                startActivity(intent);}
				if (values=="80") {
					Intent intent = new Intent(Favorites.this, Kerplunk.class);     
	                intent.putExtra("track", 8);
	                startActivity(intent);}
				if (values=="86") {
					Intent intent = new Intent(Favorites.this, Insomniac.class);     
	                intent.putExtra("track", 7);
	                startActivity(intent);}
				if (values=="8th Avenue Serenade") {
					Intent intent = new Intent(Favorites.this, Tre.class);     
	                intent.putExtra("track", 3);
	                startActivity(intent);}
				if (values=="99 Revolutions") {
					Intent intent = new Intent(Favorites.this, Tre.class);     
	                intent.putExtra("track", 11);
	                startActivity(intent);}
				if (values=="All By Myself") {
					Intent intent = new Intent(Favorites.this, Dookie.class);     
	                intent.putExtra("track", 1);
	                startActivity(intent);}
				if (values=="All The Time") {
					Intent intent = new Intent(Favorites.this, Nimrod.class);     
	                intent.putExtra("track", 6);
	                startActivity(intent);}
				if (values=="Amanda") {
					Intent intent = new Intent(Favorites.this, Tre.class);     
	                intent.putExtra("track", 8);
	                startActivity(intent);}
				if (values=="American Eulogy (Mass Hysteria/Modern World)") {
					Intent intent = new Intent(Favorites.this, TcbMain.class);     
	                intent.putExtra("track", 17);
	                startActivity(intent);}
				if (values=="American Idiot") {
					Intent intent = new Intent(Favorites.this, AmericanIdiotMain.class);     
	                intent.putExtra("track", 1);
	                startActivity(intent);}
				if (values=="Amy") {
					Intent intent = new Intent(Favorites.this, Dos.class);     
	                intent.putExtra("track", 13);
	                startActivity(intent);}
				if (values=="Android") {
					Intent intent = new Intent(Favorites.this, Kerplunk.class);     
	                intent.putExtra("track", 9);
	                startActivity(intent);}
				if (values=="Angel Blue") {
					Intent intent = new Intent(Favorites.this, Uno.class);     
	                intent.putExtra("track", 9);
	                startActivity(intent);}
				if (values=="Are We The Waiting") {
					Intent intent = new Intent(Favorites.this, AmericanIdiotMain.class);   
               	 	intent.putExtra("track", 5);
	                startActivity(intent);}
				if (values=="Armatage Shanks") {
					Intent intent = new Intent(Favorites.this, Insomniac.class);     
	                intent.putExtra("track", 1);
	                startActivity(intent);}
				if (values=="Ashley") {
					Intent intent = new Intent(Favorites.this, Dos.class);     
	                intent.putExtra("track", 8);
	                startActivity(intent);}
				if (values=="At The Library") {
					Intent intent = new Intent(Favorites.this, Tns.class);     
	                intent.putExtra("track", 1);
	                startActivity(intent);}
				if (values=="Bab's Uvula Who?") {
					Intent intent = new Intent(Favorites.this, Insomniac.class);     
	                intent.putExtra("track", 6);
	                startActivity(intent);}
				if (values=="Baby Eyes") {
					Intent intent = new Intent(Favorites.this, Dos.class);     
	                intent.putExtra("track", 9);
	                startActivity(intent);}
				if (values=="Basket Case") {
					Intent intent = new Intent(Favorites.this, Dookie.class);     
	                intent.putExtra("track", 8);
	                startActivity(intent);}
				if (values=="Before The Lobotomy") {
					Intent intent = new Intent(Favorites.this, TcbMain.class);   
               	 	intent.putExtra("track", 5);
	                startActivity(intent);}
				if (values=="Best Thing In Town") {
					Intent intent = new Intent(Favorites.this, Kerplunk.class);     
	                intent.putExtra("track", 14);
	                startActivity(intent);}
				if (values=="Blood, Sex And Booze") {
					Intent intent1 = new Intent(Favorites.this, WarningMain.class);     
                    intent1.putExtra("track", 2);
                    startActivity(intent1);}
				if (values=="Boulevard Of Broken Dreams") {
					Intent intent = new Intent(Favorites.this, AmericanIdiotMain.class);     
	                intent.putExtra("track", 4);
	                startActivity(intent);}
				if (values=="Brain Stew") {
					Intent intent = new Intent(Favorites.this, Insomniac.class);     
	                intent.putExtra("track", 10);
	                startActivity(intent);}
				if (values=="Brat") {
					Intent intent1 = new Intent(Favorites.this, Insomniac.class);     
	                intent1.putExtra("track", 2);
	                startActivity(intent1);}
				if (values=="Brutal Love") {
					Intent intent = new Intent(Favorites.this, Tre.class);     
	                intent.putExtra("track", 1);
	                startActivity(intent);}
				if (values=="Burnout") {
					Intent intent1 = new Intent(Favorites.this, Dookie.class);     
	                intent1.putExtra("track", 2);
	                startActivity(intent1);}
				if (values=="Carpe Diem") {
					Intent intent = new Intent(Favorites.this, Uno.class);     
	                intent.putExtra("track", 3);
	                startActivity(intent);}
				if (values=="Castaway") {
					Intent intent = new Intent(Favorites.this, WarningMain.class);     
                    intent.putExtra("track", 5);
                    startActivity(intent);}
				if (values=="Christian's Inferno") {
					Intent intent = new Intent(Favorites.this, TcbMain.class);     
	                intent.putExtra("track", 6);
	                startActivity(intent);}
				if (values=="Christie Road") {
					Intent intent = new Intent(Favorites.this, Kerplunk.class);     
	                intent.putExtra("track", 4);
	                startActivity(intent);}
				if (values=="Chump") {
					Intent intent = new Intent(Favorites.this, Dookie.class);     
	                intent.putExtra("track", 4);
	                startActivity(intent);}
				if (values=="Church On Sunday") {
					Intent intent = new Intent(Favorites.this, WarningMain.class);     
                    intent.putExtra("track", 3);
                    startActivity(intent);}
				if (values=="Coming Clean") {
					Intent intent = new Intent(Favorites.this, Dookie.class);     
	                intent.putExtra("track", 12);
	                startActivity(intent);}
				if (values=="Deadbeat Holiday") {
					Intent intent = new Intent(Favorites.this, WarningMain.class);     
                    intent.putExtra("track", 7);
                    startActivity(intent);}
				if (values=="Desensitized") {
					Intent intent1 = new Intent(Favorites.this, Shenanigans.class);     
	                intent1.putExtra("track", 2);
	                startActivity(intent1);}
				if (values=="Dirty Rotten Bastards") {
					Intent intent = new Intent(Favorites.this, Tre.class);     
	                intent.putExtra("track", 10);
	                startActivity(intent);}
				if (values=="Disappearing Boy") {
					Intent intent = new Intent(Favorites.this, Tns.class);     
	                intent.putExtra("track", 4);
	                startActivity(intent);}
				if (values=="Do Da Da") {
					Intent intent = new Intent(Favorites.this, Shenanigans.class);     
	                intent.putExtra("track", 12);
	                startActivity(intent);}
				if (values=="Dominated Love Slave") {
					Intent intent = new Intent(Favorites.this, Kerplunk.class);     
	                intent.putExtra("track", 6);
	                startActivity(intent);}
				if (values=="Don't Leave Me") {
					Intent intent1 = new Intent(Favorites.this, Tns.class);     
	                intent1.putExtra("track", 2);
	                startActivity(intent1);}
				if (values=="Don't Wanna Fall In Love") {
					Intent intent = new Intent(Favorites.this, Shenanigans.class);   
               	 	intent.putExtra("track", 5);
	                startActivity(intent);}
				if (values=="Drama Queen") {
					Intent intent = new Intent(Favorites.this, Tre.class);     
	                intent.putExtra("track", 4);
	                startActivity(intent);}
				if (values=="Dry Ice") {
					Intent intent = new Intent(Favorites.this, Tns.class);     
	                intent.putExtra("track", 16);
	                startActivity(intent);}
				if (values=="East Jesus Nowhere") {
					Intent intent = new Intent(Favorites.this, TcbMain.class);     
	                intent.putExtra("track", 8);
	                startActivity(intent);}
				if (values=="Emenius Sleepus") {
					Intent intent = new Intent(Favorites.this, Dookie.class);     
	                intent.putExtra("track", 13);
	                startActivity(intent);}
				if (values=="Espionage") {
					Intent intent = new Intent(Favorites.this, Shenanigans.class);     
	                intent.putExtra("track", 6);
	                startActivity(intent);}
				if (values=="Extraordinary Girl") {
					Intent intent = new Intent(Favorites.this, AmericanIdiotMain.class);     
	                intent.putExtra("track", 9);
	                startActivity(intent);}
				if (values=="F.O.D.") {
					Intent intent = new Intent(Favorites.this, Dookie.class);     
	                intent.putExtra("track", 15);
	                startActivity(intent);}
				if (values=="Fashion Victim") {
					Intent intent = new Intent(Favorites.this, WarningMain.class);     
                    intent.putExtra("track", 4);
                    startActivity(intent);}
				if (values=="Fell For You") {
					Intent intent = new Intent(Favorites.this, Uno.class);     
	                intent.putExtra("track", 6);
	                startActivity(intent);}
				if (values=="Fuck Time") {
					Intent intent1 = new Intent(Favorites.this, Dos.class);     
	                intent1.putExtra("track", 2);
	                startActivity(intent1);}
				if (values=="Geek Stink Breath") {
					Intent intent = new Intent(Favorites.this, Insomniac.class);     
	                intent.putExtra("track", 4);
	                startActivity(intent);}
				if (values=="Give Me Novacaine") {
					Intent intent = new Intent(Favorites.this, AmericanIdiotMain.class);     
	                intent.putExtra("track", 7);
	                startActivity(intent);}
				if (values=="Going To Pasalacqua") {
					Intent intent = new Intent(Favorites.this, Tns.class);     
	                intent.putExtra("track", 6);
	                startActivity(intent);}
				if (values=="Good Riddance (Time Of Your Life)") {
					Intent intent = new Intent(Favorites.this, Nimrod.class);     
	                intent.putExtra("track", 17);
	                startActivity(intent);}
				if (values=="Green Day") {
					Intent intent = new Intent(Favorites.this, Tns.class);   
               	 	intent.putExtra("track", 5);
	                startActivity(intent);}
				if (values=="Ha Ha You're Dead") {
					Intent intent = new Intent(Favorites.this, Shenanigans.class);     
	                intent.putExtra("track", 14);
	                startActivity(intent);}
				if (values=="Haushinka") {
					Intent intent = new Intent(Favorites.this, Nimrod.class);     
	                intent.putExtra("track", 12);
	                startActivity(intent);}
				if (values=="Having A Blast") {
					Intent intent = new Intent(Favorites.this, Dookie.class);     
	                intent.putExtra("track", 3);
	                startActivity(intent);}
				if (values=="Hitchin' A Ride") {
					Intent intent1 = new Intent(Favorites.this, Nimrod.class);     
	                intent1.putExtra("track", 2);
	                startActivity(intent1);}
				if (values=="Hold On") {
					Intent intent = new Intent(Favorites.this, WarningMain.class);     
	                intent.putExtra("track", 8);
	                startActivity(intent);}
				if (values=="Holiday") {
					Intent intent = new Intent(Favorites.this, AmericanIdiotMain.class);     
	                intent.putExtra("track", 3);
	                startActivity(intent);}
				if (values=="Homecoming") {
					Intent intent = new Intent(Favorites.this, AmericanIdiotMain.class);     
	                intent.putExtra("track", 12);
	                startActivity(intent);}
				if (values=="Horseshoes And Handgrenades") {
					Intent intent = new Intent(Favorites.this, TcbMain.class);     
	                intent.putExtra("track", 14);
	                startActivity(intent);}
				if (values=="I Want To Be Alone") {
					Intent intent = new Intent(Favorites.this, Tns.class);     
	                intent.putExtra("track", 19);
	                startActivity(intent);}
				if (values=="I Want To Be On T.V.") {
					Intent intent = new Intent(Favorites.this, Shenanigans.class);     
	                intent.putExtra("track", 7);
	                startActivity(intent);}
				if (values=="I Was There") {
					Intent intent = new Intent(Favorites.this, Tns.class);     
	                intent.putExtra("track", 3);
	                startActivity(intent);}
				if (values=="In The End") {
					Intent intent = new Intent(Favorites.this, Dookie.class);     
	                intent.putExtra("track", 14);
	                startActivity(intent);}
				if (values=="Jackass") {
					Intent intent = new Intent(Favorites.this, WarningMain.class);     
	                intent.putExtra("track", 9);
	                startActivity(intent);}
				if (values=="Jaded") {
					Intent intent = new Intent(Favorites.this, Insomniac.class);     
	                intent.putExtra("track", 11);
	                startActivity(intent);}
				if (values=="J.A.R. (Jason Andrew Relva)") {
					Intent intent = new Intent(Favorites.this, Ins.class);     
	                intent.putExtra("track", 8);
	                startActivity(intent);}
				if (values=="Jesus Of Suburbia") {
					Intent intent1 = new Intent(Favorites.this, AmericanIdiotMain.class);     
	                intent1.putExtra("track", 2);
	                startActivity(intent1);}
				if (values=="Jinx") {
					Intent intent = new Intent(Favorites.this, Nimrod.class);     
	                intent.putExtra("track", 11);
	                startActivity(intent);}
				if (values=="Kill The DJ") {
					Intent intent = new Intent(Favorites.this, Uno.class);   
               	 	intent.putExtra("track", 5);
	                startActivity(intent);}
				if (values=="King For A Day") {
					Intent intent = new Intent(Favorites.this, Nimrod.class);     
	                intent.putExtra("track", 16);
	                startActivity(intent);}
				if (values=="Know Your Enemy") {
					Intent intent = new Intent(Favorites.this, TcbMain.class);     
	                intent.putExtra("track", 3);
	                startActivity(intent);}
				if (values=="Knowledge") {
					Intent intent = new Intent(Favorites.this, Tns.class);     
	                intent.putExtra("track", 14);
	                startActivity(intent);}
				if (values=="Lady Cobra") {
					Intent intent = new Intent(Favorites.this, Dos.class);     
	                intent.putExtra("track", 10);
	                startActivity(intent);}
				if (values=="Last Night On Earth") {
					Intent intent = new Intent(Favorites.this, TcbMain.class);     
	                intent.putExtra("track", 7);
	                startActivity(intent);}
				if (values=="Last Of American Girls") {
					Intent intent = new Intent(Favorites.this, TcbMain.class);     
	                intent.putExtra("track", 10);
	                startActivity(intent);}
				if (values=="Lazy Bones") {
					Intent intent = new Intent(Favorites.this, Dos.class);     
	                intent.putExtra("track", 4);
	                startActivity(intent);}
				if (values=="Let Yourself Go") {
					Intent intent = new Intent(Favorites.this, Uno.class);     
	                intent.putExtra("track", 4);
	                startActivity(intent);}
				if (values=="Letterbomb") {
					Intent intent = new Intent(Favorites.this, AmericanIdiotMain.class);     
	                intent.putExtra("track", 10);
	                startActivity(intent);}
				if (values=="Little Boy Named Train") {
					Intent intent = new Intent(Favorites.this, Tre.class);     
	                intent.putExtra("track", 7);
	                startActivity(intent);}
				if (values=="Longview") {
					Intent intent = new Intent(Favorites.this, Dookie.class);   
               	 	intent.putExtra("track", 5);
	                startActivity(intent);}
				if (values=="Loss Of Control") {
					Intent intent = new Intent(Favorites.this, Uno.class);     
	                intent.putExtra("track", 7);
	                startActivity(intent);}
				if (values=="Macy's Day Parade") {
					Intent intent = new Intent(Favorites.this, WarningMain.class);     
	                intent.putExtra("track", 12);
	                startActivity(intent);}
				if (values=="Makeout Party") {
					Intent intent = new Intent(Favorites.this, Dos.class);     
	                intent.putExtra("track", 6);
	                startActivity(intent);}
				if (values=="Minority") {
					Intent intent = new Intent(Favorites.this, WarningMain.class);     
	                intent.putExtra("track", 11);
	                startActivity(intent);}
				if (values=="Maria") {
					Intent intent = new Intent(Favorites.this, Ins.class);     
	                intent.putExtra("track", 1);
	                startActivity(intent);}
				if (values=="Misery") {
					Intent intent = new Intent(Favorites.this, WarningMain.class);     
	                intent.putExtra("track", 6);
	                startActivity(intent);}
				if (values=="Missing You") {
					Intent intent1 = new Intent(Favorites.this, Tre.class);     
	                intent1.putExtra("track", 2);
	                startActivity(intent1);}
				if (values=="Murder City") {
					Intent intent = new Intent(Favorites.this, TcbMain.class);     
	                intent.putExtra("track", 11);
	                startActivity(intent);}
				if (values=="My Generation") {
					Intent intent = new Intent(Favorites.this, Kerplunk.class);     
	                intent.putExtra("track", 16);
	                startActivity(intent);}
				if (values=="Nice Guys Finish Last") {
					Intent intent = new Intent(Favorites.this, Nimrod.class);     
	                intent.putExtra("track", 1);
	                startActivity(intent);}
				if (values=="Nightlife") {
					Intent intent = new Intent(Favorites.this, Dos.class);     
	                intent.putExtra("track", 11);
	                startActivity(intent);}
				if (values=="No One Knows") {
					Intent intent = new Intent(Favorites.this, Kerplunk.class);     
	                intent.putExtra("track", 10);
	                startActivity(intent);}
				if (values=="No Pride") {
					Intent intent = new Intent(Favorites.this, Insomniac.class);   
               	 	intent.putExtra("track", 5);
	                startActivity(intent);}
				if (values=="Nuclear Family") {
					Intent intent = new Intent(Favorites.this, Uno.class);     
	                intent.putExtra("track", 1);
	                startActivity(intent);}
				if (values=="Oh Love") {
					Intent intent = new Intent(Favorites.this, Uno.class);     
	                intent.putExtra("track", 12);
	                startActivity(intent);}
				if (values=="On The Wagon") {
					Intent intent = new Intent(Favorites.this, Shenanigans.class);     
	                intent.putExtra("track", 13);
	                startActivity(intent);}
				if (values=="One For The Razorbacks") {
					Intent intent1 = new Intent(Favorites.this, Kerplunk.class);     
	                intent1.putExtra("track", 2);
	                startActivity(intent1);}
				if (values=="One Of My Lies") {
					Intent intent = new Intent(Favorites.this, Kerplunk.class);     
	                intent.putExtra("track", 7);
	                startActivity(intent);}
				if (values=="Only Of You") {
					Intent intent = new Intent(Favorites.this, Tns.class);     
	                intent.putExtra("track", 17);
	                startActivity(intent);}
				if (values=="Outsider") {
					Intent intent = new Intent(Favorites.this, Shenanigans.class);     
	                intent.putExtra("track", 4);
	                startActivity(intent);}
				if (values=="Panic Song") {
					Intent intent = new Intent(Favorites.this, Insomniac.class);     
	                intent.putExtra("track", 8);
	                startActivity(intent);}
				if (values=="Paper Lanterns") {
					Intent intent = new Intent(Favorites.this, Tns.class);     
	                intent.putExtra("track", 11);
	                startActivity(intent);}
				if (values=="Peacemaker") {
					Intent intent = new Intent(Favorites.this, TcbMain.class);     
	                intent.putExtra("track", 9);
	                startActivity(intent);}
				if (values=="Platypus (I Hate You)") {
					Intent intent = new Intent(Favorites.this, Nimrod.class);     
	                intent.putExtra("track", 8);
	                startActivity(intent);}
				if (values=="Poprocks & Coke") {
					Intent intent1 = new Intent(Favorites.this, Ins.class);     
	                intent1.putExtra("track", 2);
	                startActivity(intent1);}
				if (values=="Private Ale") {
					Intent intent = new Intent(Favorites.this, Kerplunk.class);   
               	 	intent.putExtra("track", 5);
	                startActivity(intent);}
				if (values=="Prosthetic Head") {
					Intent intent = new Intent(Favorites.this, Nimrod.class);     
	                intent.putExtra("track", 18);
	                startActivity(intent);}
				if (values=="Pulling Teeth") {
					Intent intent = new Intent(Favorites.this, Dookie.class);     
	                intent.putExtra("track", 7);
	                startActivity(intent);}
				if (values=="Redundant") {
					Intent intent = new Intent(Favorites.this, Nimrod.class);     
	                intent.putExtra("track", 4);
	                startActivity(intent);}
				if (values=="Reject") {
					Intent intent = new Intent(Favorites.this, Nimrod.class);     
	                intent.putExtra("track", 14);
	                startActivity(intent);}
				if (values=="Rest") {
					Intent intent = new Intent(Favorites.this, Tns.class);     
	                intent.putExtra("track", 9);
	                startActivity(intent);}
				if (values=="Restless Heart Syndrome") {
					Intent intent = new Intent(Favorites.this, TcbMain.class);     
	                intent.putExtra("track", 13);
	                startActivity(intent);}
				if (values=="Road To Acceptance") {
					Intent intent = new Intent(Favorites.this, Tns.class);     
	                intent.putExtra("track", 8);
	                startActivity(intent);}
				if (values=="Rotting") {
					Intent intent = new Intent(Favorites.this, Shenanigans.class);     
	                intent.putExtra("track", 11);
	                startActivity(intent);}
				if (values=="Rusty James") {
					Intent intent = new Intent(Favorites.this, Uno.class);     
	                intent.putExtra("track", 11);
	                startActivity(intent);}
				if (values=="Sassafras Roots") {
					Intent intent = new Intent(Favorites.this, Dookie.class);     
	                intent.putExtra("track", 10);
	                startActivity(intent);}
				if (values=="Scattered") {
					Intent intent = new Intent(Favorites.this, Nimrod.class);   
               	 	intent.putExtra("track", 5);
	                startActivity(intent);}
				if (values=="Scumbag") {
					Intent intent = new Intent(Favorites.this, Shenanigans.class);     
	                intent.putExtra("track", 8);
	                startActivity(intent);}
				if (values=="See The Light") {
					Intent intent = new Intent(Favorites.this, TcbMain.class);     
	                intent.putExtra("track", 18);
	                startActivity(intent);}
				if (values=="See You Tonight") {
					Intent intent = new Intent(Favorites.this, Dos.class);     
	                intent.putExtra("track", 1);
	                startActivity(intent);}
				if (values=="Sex, Drugs & Violence") {
					Intent intent = new Intent(Favorites.this, Tre.class);     
	                intent.putExtra("track", 6);
	                startActivity(intent);}
				if (values=="She") {
					Intent intent = new Intent(Favorites.this, Dookie.class);     
	                intent.putExtra("track", 9);
	                startActivity(intent);}
				if (values=="She's A Rebel") {
					Intent intent = new Intent(Favorites.this, AmericanIdiotMain.class);     
	                intent.putExtra("track", 8);
	                startActivity(intent);}
				if (values=="Sick Of Me") {
					Intent intent = new Intent(Favorites.this, Shenanigans.class);     
	                intent.putExtra("track", 10);
	                startActivity(intent);}
				if (values=="Song Of The Century") {
					Intent intent = new Intent(Favorites.this, TcbMain.class);     
	                intent.putExtra("track", 1);
	                startActivity(intent);}
				if (values=="St. Jimmy") {
					Intent intent = new Intent(Favorites.this, AmericanIdiotMain.class);     
	                intent.putExtra("track", 6);
	                startActivity(intent);}
				if (values=="Stay The Night") {
					Intent intent1 = new Intent(Favorites.this, Uno.class);     
	                intent1.putExtra("track", 2);
	                startActivity(intent1);}
				if (values=="Stop When The Red Lights Flash") {
					Intent intent = new Intent(Favorites.this, Dos.class);     
	                intent.putExtra("track", 3);
	                startActivity(intent);}
				if (values=="Strangeland") {
					Intent intent = new Intent(Favorites.this, Kerplunk.class);     
	                intent.putExtra("track", 15);
	                 startActivity(intent);}
				if (values=="Stray Heart") {
					Intent intent = new Intent(Favorites.this, Dos.class);     
	                intent.putExtra("track", 7);
	                startActivity(intent);}
				if (values=="Stuart And The Ave.") {
					Intent intent = new Intent(Favorites.this, Insomniac.class);     
	                intent.putExtra("track", 9);
	                startActivity(intent);}
				if (values=="Stuck With Me") {
					Intent intent = new Intent(Favorites.this, Insomniac.class);     
	                intent.putExtra("track", 3);
	                startActivity(intent);}
				if (values=="Suffocate") {
					Intent intent = new Intent(Favorites.this, Shenanigans.class);     
	                intent.putExtra("track", 1);
	                startActivity(intent);}
				if (values=="Sweet 16") {
					Intent intent = new Intent(Favorites.this, Uno.class);     
	                intent.putExtra("track", 10);
	                startActivity(intent);}
				if (values=="Sweet Children") {
					Intent intent = new Intent(Favorites.this, Kerplunk.class);     
	                intent.putExtra("track", 13);
	                startActivity(intent);}
				if (values=="Take Back") {
					Intent intent = new Intent(Favorites.this, Nimrod.class);     
	                intent.putExtra("track", 15);
	                startActivity(intent);}
				if (values=="The Forgotten") {
					Intent intent = new Intent(Favorites.this, Tre.class);     
	                intent.putExtra("track", 12);
	                startActivity(intent);}
				if (values=="The Grouch") {
					Intent intent = new Intent(Favorites.this, Nimrod.class);     
	                intent.putExtra("track", 3);
	                startActivity(intent);}
				if (values=="The Judge's Daughter") {
					Intent intent = new Intent(Favorites.this, Tns.class);     
	                intent.putExtra("track", 10);
	                startActivity(intent);}
				if (values=="The One I Want") {
					Intent intent = new Intent(Favorites.this, Tns.class);     
	                 intent.putExtra("track", 18);
	                 startActivity(intent);}
				if (values=="The Static Age") {
					Intent intent = new Intent(Favorites.this, TcbMain.class);     
	                intent.putExtra("track", 15);
	                startActivity(intent);}
				if (values=="Tight Wadd Hill") {
					Intent intent = new Intent(Favorites.this, Insomniac.class);     
	                intent.putExtra("track", 13);
	                startActivity(intent);}
				if (values=="Tired Of Waiting For You") {
					Intent intent = new Intent(Favorites.this, Shenanigans.class);     
	                intent.putExtra("track", 9);
	                startActivity(intent);}
				if (values=="Troublemaker") {
					Intent intent = new Intent(Favorites.this, Uno.class);     
	                intent.putExtra("track", 8);
	                startActivity(intent);}
				if (values=="Uptight") {
					Intent intent = new Intent(Favorites.this, Nimrod.class);     
	                intent.putExtra("track", 9);
	                startActivity(intent);}
				if (values=="Waiting") {
					Intent intent = new Intent(Favorites.this, WarningMain.class);     
	                intent.putExtra("track", 10);
	                startActivity(intent);}
				if (values=="Wake Me Up When September Ends") {
					Intent intent = new Intent(Favorites.this, AmericanIdiotMain.class);     
	                intent.putExtra("track", 11);
	                startActivity(intent);}
				if (values=="Walk Away") {
					Intent intent = new Intent(Favorites.this, Tre.class);     
	                intent.putExtra("track", 9);
	                startActivity(intent);}
				if (values=="Walking Alone") {
					Intent intent = new Intent(Favorites.this, Nimrod.class);     
	                intent.putExtra("track", 13);
	                startActivity(intent);}
				if (values=="Walking Contradiction") {
					Intent intent = new Intent(Favorites.this, Insomniac.class);     
	                intent.putExtra("track", 14);
	                startActivity(intent);}
				if (values=="Warning") {
					Intent intent = new Intent(Favorites.this, WarningMain.class);     
	                intent.putExtra("track", 1);
	                startActivity(intent);}
				//if (values=="Welcome To Paradise") {
					//i=new Intent(Favorites.this, Welcome.class);
					//startActivity(i);}
				if (values=="Welcome To Paradise") {
					Intent intent = new Intent(Favorites.this, Dookie.class);     
	                intent.putExtra("track", 6);
	                startActivity(intent);}
				if (values=="Westbound Sign") {
					Intent intent = new Intent(Favorites.this, Insomniac.class);     
	                intent.putExtra("track", 12);
	                startActivity(intent);}
				if (values=="Whatsername") {
					Intent intent = new Intent(Favorites.this, AmericanIdiotMain.class);     
	                intent.putExtra("track", 13);
	                startActivity(intent);}
				if (values=="When I Come Around") {
					Intent intent = new Intent(Favorites.this, Dookie.class);     
	                intent.putExtra("track", 11);
	                startActivity(intent);}
				if (values=="Who Wrote Holden Caulfield?") {
					Intent intent = new Intent(Favorites.this, Kerplunk.class);     
	                intent.putExtra("track", 11);
	                startActivity(intent);}
				if (values=="Why Do You Want Him?") {
					Intent intent = new Intent(Favorites.this, Tns.class);     
	                intent.putExtra("track", 12);
	                startActivity(intent);}
				if (values=="Wild One") {
					Intent intent = new Intent(Favorites.this, Dos.class);   
               	 	intent.putExtra("track", 5);
	                startActivity(intent);}
				if (values=="Words I Might Have Ate") {
					Intent intent = new Intent(Favorites.this, Kerplunk.class);     
	                intent.putExtra("track", 12);
	                startActivity(intent);}
				if (values=="Worry Rock") {
					Intent intent = new Intent(Favorites.this, Nimrod.class);     
	                intent.putExtra("track", 7);
	                startActivity(intent);}
				if (values=="Wow! That's Loud") {
					Intent intent = new Intent(Favorites.this, Dos.class);     
	                intent.putExtra("track", 12);
	                startActivity(intent);}
				if (values=="X-Kid") {
					Intent intent = new Intent(Favorites.this, Tre.class);   
               	 	intent.putExtra("track", 5);
	                startActivity(intent);}
				if (values=="You Lied") {
					Intent intent = new Intent(Favorites.this, Shenanigans.class);     
	                intent.putExtra("track", 3);
	                startActivity(intent);}
				if (values=="¡Viva La Gloria!") {
					Intent intent = new Intent(Favorites.this, TcbMain.class);     
	                intent.putExtra("track", 4);
	                startActivity(intent);}
				if (values=="¿Viva La Gloria? (Little Girl)") {
					Intent intent = new Intent(Favorites.this, TcbMain.class);     
	                intent.putExtra("track", 12);
	                startActivity(intent);} */
				
				/*
				 * Demolicious
				 
				if (values=="99 Revolutions (Demo)"){
					Intent newActivity = new Intent(Favorites.this, Demolicious.class);     
	                newActivity.putExtra("track", 1);
	                startActivity(newActivity);
				}
				if (values=="Angel Blue (Demo)"){
					Intent newActivity = new Intent(Favorites.this, Demolicious.class);     
	                newActivity.putExtra("track", 2);
	                startActivity(newActivity);
				}if (values=="Carpe Diem (Demo)"){
					Intent newActivity = new Intent(Favorites.this, Demolicious.class);     
	                newActivity.putExtra("track", 3);
	                startActivity(newActivity);
				}if (values=="State Of Shock"){
					Intent newActivity = new Intent(Favorites.this, Demolicious.class);     
	                newActivity.putExtra("track", 4);
	                startActivity(newActivity);
				}if (values=="Let Yourself Go (Demo)"){
					Intent newActivity = new Intent(Favorites.this, Demolicious.class);     
	                newActivity.putExtra("track", 5);
	                startActivity(newActivity);
				}if (values=="Sex, Drugs And Violence (Demo)"){
					Intent newActivity = new Intent(Favorites.this, Demolicious.class);     
	                newActivity.putExtra("track", 6);
	                startActivity(newActivity);
				}if (values=="Ashley (Demo)"){
					Intent newActivity = new Intent(Favorites.this, Demolicious.class);     
	                newActivity.putExtra("track", 7);
	                startActivity(newActivity);
				}if (values=="Fell For You (Demo)"){
					Intent newActivity = new Intent(Favorites.this, Demolicious.class);     
	                newActivity.putExtra("track", 8);
	                startActivity(newActivity);
				}if (values=="Stay The Night (Demo)"){
					Intent newActivity = new Intent(Favorites.this, Demolicious.class);     
	                newActivity.putExtra("track", 9);
	                startActivity(newActivity);
				}if (values=="Nuclear Family (Demo)"){
					Intent newActivity = new Intent(Favorites.this, Demolicious.class);     
	                newActivity.putExtra("track", 10);
	                startActivity(newActivity);
				}if (values=="Stray Heart (Demo)"){
					Intent newActivity = new Intent(Favorites.this, Demolicious.class);     
	                newActivity.putExtra("track", 11);
	                startActivity(newActivity);
				}if (values=="Rusty James (Demo)"){
					Intent newActivity = new Intent(Favorites.this, Demolicious.class);     
	                newActivity.putExtra("track", 12);
	                startActivity(newActivity);
				}if (values=="A Little Boy Named Train (Demo)"){
					Intent newActivity = new Intent(Favorites.this, Demolicious.class);     
	                newActivity.putExtra("track", 13);
	                startActivity(newActivity);
				}if (values=="Baby Eyes (Demo)"){
					Intent newActivity = new Intent(Favorites.this, Demolicious.class);     
	                newActivity.putExtra("track", 14);
	                startActivity(newActivity);
				}if (values=="Makeout Party (Demo)"){
					Intent newActivity = new Intent(Favorites.this, Demolicious.class);     
	                newActivity.putExtra("track", 15);
	                startActivity(newActivity);
				}if (values=="Oh Love (Demo)"){
					Intent newActivity = new Intent(Favorites.this, Demolicious.class);     
	                newActivity.putExtra("track", 16);
	                startActivity(newActivity);
				}if (values=="Missing You (Demo)"){
					Intent newActivity = new Intent(Favorites.this, Demolicious.class);     
	                newActivity.putExtra("track", 17);
	                startActivity(newActivity);
				}if (values=="Stay The Night (Acoustic)"){
					Intent newActivity = new Intent(Favorites.this, Demolicious.class);     
	                newActivity.putExtra("track", 18);
	                startActivity(newActivity);
				}*/
			}
		});
		
		//Testing showcaseview
		//Showcaseview
        ShowcaseView.ConfigOptions co = new ShowcaseView.ConfigOptions();
        //For leavign action bar unhidden; 
  		//co.insert = ShowcaseView.INSERT_TO_VIEW;
        //co.centerText = true;
        @SuppressWarnings("deprecation")
		ShowcaseView sv = ShowcaseView.insertShowcaseViewWithType(ShowcaseView.ITEM_ACTION_HOME, 1, this,
        		"Favorites", "\nSlide from left to right to remove any favorite.\n" +
        				"\nAdd them from their respective lyrics screen.", co);
        //sv.animateGesture(0, 100, 200, 200);
        int x_final_pos = getResources().getDisplayMetrics().widthPixels/2;
        int y_init_pos = getResources().getDisplayMetrics().heightPixels/4;
        sv.animateGesture(0, y_init_pos, x_final_pos, y_init_pos);
        sv.setShowcaseIndicatorScale(0);
        //Click listeners for showcaseview
        sv.setOnShowcaseEventListener(new OnShowcaseEventListener() {
        	 @Override
        	    public void onShowcaseViewHide(ShowcaseView showcaseView) {
        	     //The view is hidden/dismissed
        		 //Crouton.makeText(Favorites.this, "Just another crouton :P", Style.CONFIRM).show();
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
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// TODO Auto-generated method stub
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.main, menu); 
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
        default:
            return super.onOptionsItemSelected(item);
		}
	}
}