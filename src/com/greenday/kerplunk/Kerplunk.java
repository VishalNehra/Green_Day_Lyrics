package com.greenday.kerplunk;

import com.fourmob.poppyview.PoppyViewHelper;
import com.fourmob.poppyview.PoppyViewHelper.PoppyViewPosition;
import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.analytics.HitBuilders;
import com.google.android.gms.analytics.Tracker;
import com.greenday.lyrics.Allsongs;
import com.greenday.lyrics.Favorites;
import com.greenday.lyrics.Frontend;
import com.greenday.lyrics.ReportSong;
import com.greenday.lyrics.Settings;
import com.greenday.lyrics.R;
import com.greenday.lyrics.Frontend.TrackerName;
import com.greenday.database.DBHandler;
import com.greenday.database.Track;
import com.greenday.kerplunk.Info;

import de.keyboardsurfer.android.widget.crouton.Crouton;
import de.keyboardsurfer.android.widget.crouton.Style;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.ImageButton;
import android.widget.TextView;

public class Kerplunk extends Activity {
	
	private PoppyViewHelper mPoppyViewHelper;
	private Tracker t;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.kerplunk);
		
		//Google Analytics
		((Frontend) getApplication()).getTracker(Frontend.TrackerName.APP_TRACKER);
		t = ((Frontend) this.getApplication()).getTracker(
	            TrackerName.APP_TRACKER);
		
		//Action bar color
        int ab_def_color= Color.parseColor("#222222");
        int ab_color=PreferenceManager.getDefaultSharedPreferences(this).getInt("ab_theme", ab_def_color);
        ActionBar ab =getActionBar();
        ab.setBackgroundDrawable(new ColorDrawable(ab_color));
        
        //Text Size
		TextView tv1 = (TextView)findViewById(R.id.textView1);
		int text_size = PreferenceManager.getDefaultSharedPreferences(this).getInt("text", 18);
		tv1.setTextSize(text_size);
		
		//Text Color
		int text_def_color= Color.parseColor("#000000");
        int text_color=PreferenceManager.getDefaultSharedPreferences(this).getInt("text_theme", text_def_color);
        tv1.setTextColor(text_color);
        
        //Background transparency
        int def_alpha = 70;
        int alpha = PreferenceManager.getDefaultSharedPreferences(this).getInt("alpha", def_alpha);
        findViewById(R.id.kerplunk_layout).getBackground().setAlpha(alpha);
		
		//Poppyview
		mPoppyViewHelper=new PoppyViewHelper(this, PoppyViewPosition.BOTTOM);
		View poppyview = mPoppyViewHelper.createPoppyViewOnScrollView(R.id.scrollView, R.layout.poppyview);
		int poppy_def_color=Color.parseColor("#40222222");
		int poppy_color=PreferenceManager.getDefaultSharedPreferences(this).getInt("poppy_theme", poppy_def_color);
		poppyview.setBackgroundColor(poppy_color);
		
		ImageButton search = (ImageButton) poppyview.findViewById(R.id.imageButton1);
		search.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				// Search action | Add as new task
				Intent intent = new Intent(Kerplunk.this, Allsongs.class);
				intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP); 
				intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
				intent.putExtra("Search", true);
				startActivity(intent);
			}
		});
		ImageButton report = (ImageButton) poppyview.findViewById(R.id.imageButton2);
		report.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				int track = getIntent().getExtras().getInt("track");
				Intent intent = new Intent(Kerplunk.this, ReportSong.class);
				if(track == 1){
					intent.putExtra("report_sub", "2000 Light Years Away");
					startActivity(intent);
					}
				if(track == 2){
					intent.putExtra("report_sub", "One For The Razorbacks");
					startActivity(intent);
					}
				if(track == 3){
					intent.putExtra("report_sub", "Welcome To Paradise");
					startActivity(intent);
					}
				if(track == 4){
					intent.putExtra("report_sub", "Christie Road");
					startActivity(intent);
					}
				if(track == 5){
					intent.putExtra("report_sub", "Private Ale");
					startActivity(intent);
					}
				if(track == 6){
					intent.putExtra("report_sub", "Dominated Love Slave");
					startActivity(intent);
					}
				if(track == 7){
					intent.putExtra("report_sub", "One Of My Lies");
					startActivity(intent);
					}
				if(track == 8){
					intent.putExtra("report_sub", "80");
					startActivity(intent);
					}
				if(track == 9){
					intent.putExtra("report_sub", "Android");
					startActivity(intent);
					}
				if(track == 10){
					intent.putExtra("report_sub", "No One Knows");
					startActivity(intent);
					}
				if(track == 11){
					intent.putExtra("report_sub", "Who Wrote Holden Caulfield?");
					startActivity(intent);
					}
				if(track == 12){
					intent.putExtra("report_sub", "Words I Might Have Ate");
					startActivity(intent);
					}
				if(track == 13){
					intent.putExtra("report_sub", "Sweet Children");
					startActivity(intent);
					}
				if(track == 14){
					intent.putExtra("report_sub", "Best Thing In Town");
					startActivity(intent);
					}
				if(track == 15){
					intent.putExtra("report_sub", "Strangeland");
					startActivity(intent);
					}
				if(track == 16){
					intent.putExtra("report_sub", "My Generation");
					startActivity(intent);
					}
			}
		});
		
		ImageButton favourite = (ImageButton) poppyview.findViewById(R.id.imageButton3);
		favourite.setOnClickListener(new OnClickListener() {

			int track = getIntent().getExtras().getInt("track");
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if(track == 1){
					lookupTrack("2000 Light Years Away", track);
					}
				if(track == 2){
					lookupTrack("One For The Razorbacks", track);
					}
				if(track == 3){
					lookupTrack("Welcome To Paradise", track);
					}
				if(track == 4){
					lookupTrack("Christie Road", track);
					}
				if(track == 5){
					lookupTrack("Private Ale", track);
					}
				if(track == 6){
					lookupTrack("Dominated Love Slave", track);
					}
				if(track == 7){
					lookupTrack("One Of My Lies", track);
					}
				if(track == 8){
					lookupTrack("80", track);
					}
				if(track == 9){
					lookupTrack("Android", track);
					}
				if(track == 10){
					lookupTrack("No One Knows", track);
					}
				if(track == 11){
					lookupTrack("Who Wrote Holden Caulfield?", track);
					}
				if(track == 12){
					lookupTrack("Words I Might Have Ate", track);
					}
				if(track == 13){
					lookupTrack("Sweet Children", track);
					}
				if(track == 14){
					lookupTrack("Best Thing In Town", track);
					}
				if(track == 15){
					lookupTrack("Strangeland", track);
					}
				if(track == 16){
					lookupTrack("My Generation", track);
					}
			}
		});
		favourite.setOnLongClickListener(new OnLongClickListener() {
			
			Intent intent = new Intent(Kerplunk.this, Favorites.class);
			@Override
			public boolean onLongClick(View arg0) {
				// TODO Auto-generated method stub
				startActivity(intent);
				return false;
			}
		});
		
		ImageButton label=(ImageButton) poppyview.findViewById(R.id.imageButton4);
		label.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				int track = getIntent().getExtras().getInt("track");
				if(track == 1){
					Info.info1(Kerplunk.this);
				}
				if(track == 2){
					Info.info2(Kerplunk.this);
				}
				if(track == 3){
					Info.info3(Kerplunk.this);
				}
				if(track == 4){
					Info.info4(Kerplunk.this);
				}
				if(track == 5){
					Info.info5(Kerplunk.this);
				}
				if(track == 6){
					Info.info6(Kerplunk.this);
				}
				if(track == 7){
					Info.info7(Kerplunk.this);
				}
				if(track == 8){
					Info.info8(Kerplunk.this);
				}
				if(track == 9){
					Info.info9(Kerplunk.this);
				}
				if(track == 10){
					Info.info10(Kerplunk.this);
				}
				if(track == 11){
					Info.info11(Kerplunk.this);
				}
				if(track == 12){
					Info.info12(Kerplunk.this);
				}
				if(track == 13){
					Info.info13(Kerplunk.this);
				}
				if(track == 14){
					Info.info14(Kerplunk.this);
				}
				if(track == 15){
					Info.info15(Kerplunk.this);
				}
				if(track == 16){
					Info.info16(Kerplunk.this);
				}
			}
		});
		ImageButton settings=(ImageButton) poppyview.findViewById(R.id.imageButton5);
		settings.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent(getApplicationContext(), Settings.class));
			}
		});
		//Poppyview
		
		//Lyrics
		int track = getIntent().getExtras().getInt("track");
		if(track == 1){
			String current = "2000 Light Years Away";
			ab.setTitle(current);
			tv1.setText(R.string.lightyears);
			analytics(current);
		}
		if(track == 2){
			String current = "One For The Razorbacks";
			ab.setTitle(current);
			tv1.setText(R.string.razorbacks);
			analytics(current);
		}
		if(track == 3){
			String current = "Welcome To Paradise";
			ab.setTitle(current);
			tv1.setText(R.string.welcometoparadise);
			analytics(current);
		}
		if(track == 4){
			String current = "Christie Road";
			ab.setTitle(current);
			tv1.setText(R.string.christieroad);
			analytics(current);
		}
		if(track == 5){
			String current = "Private Ale";
			ab.setTitle(current);
			tv1.setText(R.string.privateale);
			analytics(current);
		}
		if(track == 6){
			String current = "Dominated Love Slave";
			ab.setTitle(current);
			tv1.setText(R.string.dominatedloveslave);
			analytics(current);
		}
		if(track == 7){
			String current = "One Of My Lies";
			ab.setTitle(current);
			tv1.setText(R.string.oneoflies);
			analytics(current);
		}
		if(track == 8){
			String current = "80";
			ab.setTitle(current);
			tv1.setText(R.string.eighty);
			analytics(current);
		}
		if(track == 9){
			String current = "Android";
			ab.setTitle(current);
			tv1.setText(R.string.android);
			analytics(current);
		}
		if(track == 10){
			String current = "No One Knows";
			ab.setTitle(current);
			tv1.setText(R.string.nooneknows);
			analytics(current);
		}
		if(track == 11){
			String current = "Who Wrote Holden Caulfield?";
			ab.setTitle(current);
			tv1.setText(R.string.whowrote);
			analytics(current);
		}
		if(track == 12){
			String current = "Words I Might Have Ate";
			ab.setTitle(current);
			tv1.setText(R.string.wordsmightate);
			analytics(current);
		}
		if(track == 13){
			String current = "Sweet Children";
			ab.setTitle(current);
			tv1.setText(R.string.sweetchildren);
			analytics(current);
		}
		if(track == 14){
			String current = "Best Thing In Town";
			ab.setTitle(current);
			tv1.setText(R.string.bestthing);
			analytics(current);
		}
		if(track == 15){
			String current = "Strangeland";
			ab.setTitle(current);
			tv1.setText(R.string.strangeland);
			analytics(current);
		}
		if(track == 16){
			String current = "My Generation";
			ab.setTitle(current);
			tv1.setText(R.string.mygeneration);
			analytics(current);
		}
		
		getActionBar().setDisplayHomeAsUpEnabled(true);
		
		//Display
		boolean display = PreferenceManager.getDefaultSharedPreferences(this).getBoolean("display", false);
		if(display)
		{
			tv1.setKeepScreenOn(true);
		}
	}
	
		@Override
	    public boolean onCreateOptionsMenu(Menu menu) {
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
		            return super.onOptionsItemSelected(item);
		}

		//Checking and adding to database
		public void lookupTrack(String name, int i) {
			DBHandler db = new DBHandler(this, null, null, 1);
			Track findtrack = db.findTrack(name);
			
			if(findtrack != null) {
				Crouton.makeText(this, "Already in favorites", Style.ALERT).show();
			} else {
				db.addTrack(new Track(name, i));
				Crouton.makeText(this, "Added to favorites", Style.INFO).show();
			}
		}
		
		//Analytics
		public void analytics(String s) {
			//Google Analytics
			// Set screen name.
	        t.setScreenName(s);
	        // Send a screen view.
	        t.send(new HitBuilders.AppViewBuilder().build());
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