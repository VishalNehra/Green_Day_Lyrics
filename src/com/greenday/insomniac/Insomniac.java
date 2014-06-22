package com.greenday.insomniac;

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
import com.greenday.insomniac.Info;

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

public class Insomniac extends Activity {
	private PoppyViewHelper mPoppyViewHelper;
	private Tracker t;
	private View poppyview;
	private TextView tv1;
	private ActionBar ab;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.insomniac);
		
        ab =getActionBar();
		tv1 = (TextView)findViewById(R.id.textView1);
		
		//Poppyview 
		mPoppyViewHelper=new PoppyViewHelper(this, PoppyViewPosition.BOTTOM);
		poppyview = mPoppyViewHelper.createPoppyViewOnScrollView(R.id.scrollView, R.layout.poppyview);
				
        //Loading Preferences
        getPref();
		
		//Google Analytics
		((Frontend) getApplication()).getTracker(Frontend.TrackerName.APP_TRACKER);
		t = ((Frontend) this.getApplication()).getTracker(
	            TrackerName.APP_TRACKER);
		
		//PoppyView
		ImageButton search = (ImageButton) poppyview.findViewById(R.id.imageButton1);
		search.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				// Search action | Add as new task
				Intent intent = new Intent(Insomniac.this, Allsongs.class);
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
				Intent intent = new Intent(Insomniac.this, ReportSong.class);
				if(track == 1){
					intent.putExtra("report_sub", "Armatage Shanks");
					startActivity(intent);
					}
				if(track == 2){
					intent.putExtra("report_sub", "Brat");
					startActivity(intent);
					}
				if(track == 3){
					intent.putExtra("report_sub", "Stuck With Me");
					startActivity(intent);
					}
				if(track == 4){
					intent.putExtra("report_sub", "Geek Stink Breath");
					startActivity(intent);
					}
				if(track == 5){
					intent.putExtra("report_sub", "No Pride");
					startActivity(intent);
					}
				if(track == 6){
					intent.putExtra("report_sub", "Bab's Uvula Who!");
					startActivity(intent);
					}
				if(track == 7){
					intent.putExtra("report_sub", "86");
					startActivity(intent);
					}
				if(track == 8){
					intent.putExtra("report_sub", "Panic Song");
					startActivity(intent);
					}
				if(track == 9){
					intent.putExtra("report_sub", "Stuart And The Ave.");
					startActivity(intent);
					}
				if(track == 10){
					intent.putExtra("report_sub", "Brain Stew");
					startActivity(intent);
					}
				if(track == 11){
					intent.putExtra("report_sub", "Jaded");
					startActivity(intent);
					}
				if(track == 12){
					intent.putExtra("report_sub", "Westbound Sign");
					startActivity(intent);
					}
				if(track == 13){
					intent.putExtra("report_sub", "Tight Wad Hill");
					startActivity(intent);
					}
				if(track == 14){
					intent.putExtra("report_sub", "Walking Contradiction");
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
					lookupTrack("Armatage Shanks", track);
					}
				if(track == 2){
					lookupTrack("Brat", track);
					}
				if(track == 3){
					lookupTrack("Stuck With Me", track);
					}
				if(track == 4){
					lookupTrack("Geek Stink Breath", track);
					}
				if(track == 5){
					lookupTrack("No Pride", track);
					}
				if(track == 6){
					lookupTrack("Bab's Uvula Who!", track);
					}
				if(track == 7){
					lookupTrack("86", track);
					}
				if(track == 8){
					lookupTrack("Panic Song", track);
					}
				if(track == 9){
					lookupTrack("Stuart And The Ave.", track);
					}
				if(track == 10){
					lookupTrack("Brain Stew", track);
					}
				if(track == 11){
					lookupTrack("Jaded", track);
					}
				if(track == 12){
					lookupTrack("Westbound Sign", track);
					}
				if(track == 13){
					lookupTrack("Tight Wad Hill", track);
					}
				if(track == 14){
					lookupTrack("Walking Contradiction", track);
					}
			}
		});
		favourite.setOnLongClickListener(new OnLongClickListener() {
			
			Intent intent = new Intent(Insomniac.this, Favorites.class);
			@Override
			public boolean onLongClick(View arg0) {
				// TODO Auto-generated method stub
				intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP); 
				intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
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
					Info.info1(Insomniac.this);
				}
				if(track == 2){
					Info.info2(Insomniac.this);
				}
				if(track == 3){
					Info.info3(Insomniac.this);
				}
				if(track == 4){
					Info.info4(Insomniac.this);
				}
				if(track == 5){
					Info.info5(Insomniac.this);
				}
				if(track == 6){
					Info.info6(Insomniac.this);
				}
				if(track == 7){
					Info.info7(Insomniac.this);
				}
				if(track == 8){
					Info.info8(Insomniac.this);
				}
				if(track == 9){
					Info.info9(Insomniac.this);
				}
				if(track == 10){
					Info.info10(Insomniac.this);
				}
				if(track == 11){
					Info.info11(Insomniac.this);
				}
				if(track == 12){
					Info.info12(Insomniac.this);
				}
				if(track == 13){
					Info.info13(Insomniac.this);
				}
				if(track == 14){
					Info.info14(Insomniac.this);
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
			String current = "Armatage Shanks";
			ab.setTitle(current);
			tv1.setText(R.string.armatage);
			analytics(current);
		}
		if(track == 2){
			String current = "Brat";
			ab.setTitle(current);
			tv1.setText(R.string.brat);
			analytics(current);
		}
		if(track == 3){
			String current = "Stuck With Me";
			ab.setTitle(current);
			tv1.setText(R.string.stuckwithme);
			analytics(current);
		}
		if(track == 4){
			String current = "Geek Stink Breath";
			ab.setTitle(current);
			tv1.setText(R.string.geekstink);
			analytics(current);
		}
		if(track == 5){
			String current = "No Pride";
			ab.setTitle(current);
			tv1.setText(R.string.nopride);
			analytics(current);
		}
		if(track == 6){
			String current = "Bab's Uvula Who!";
			ab.setTitle(current);
			tv1.setText(R.string.babuvula);
			analytics(current);
		}
		if(track == 7){
			String current = "86";
			ab.setTitle(current);
			tv1.setText(R.string.eightysix);
			analytics(current);
		}
		if(track == 8){
			String current = "Panic Song";
			ab.setTitle(current);
			tv1.setText(R.string.panicsong);
			analytics(current);
		}
		if(track == 9){
			String current = "Stuart And The Ave.";
			ab.setTitle(current);
			tv1.setText(R.string.stuartave);
			analytics(current);
		}
		if(track == 10){
			String current = "Brain Stew";
			ab.setTitle(current);
			tv1.setText(R.string.brainstew);
			analytics(current);
		}
		if(track == 11){
			String current = "Jaded";
			ab.setTitle(current);
			tv1.setText(R.string.jaded);
			analytics(current);
		}
		if(track == 12){
			String current = "Westbound Sign";
			ab.setTitle(current);
			tv1.setText(R.string.westbound);
			analytics(current);
		}
		if(track == 13){
			String current = "Tight Wad Hill";
			ab.setTitle(current);
			tv1.setText(R.string.tightwad);
			analytics(current);
		}
		if(track == 14){
			String current = "Walking Contradiction";
			ab.setTitle(current);
			tv1.setText(R.string.walking);
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
		
		@Override
		protected void onResume() {
			// TODO Auto-generated method stub
			getPref();
			super.onResume();
		}
		
		private void getPref() {
			
			//Action bar color
	        int ab_def_color= Color.parseColor("#222222");
	        int ab_color=PreferenceManager.getDefaultSharedPreferences(this).getInt("ab_theme", ab_def_color);
	        ab.setBackgroundDrawable(new ColorDrawable(ab_color));
	        
	        //Text Size
			int text_size = PreferenceManager.getDefaultSharedPreferences(this).getInt("text", 18);
			tv1.setTextSize(text_size);
			
			//Text Color
			int text_def_color= Color.parseColor("#000000");
	        int text_color=PreferenceManager.getDefaultSharedPreferences(this).getInt("text_theme", text_def_color);
	        tv1.setTextColor(text_color);
	        
	        //Background transparency
	        int def_alpha = 70;
	        int alpha = PreferenceManager.getDefaultSharedPreferences(this).getInt("alpha", def_alpha);
	        findViewById(R.id.insomniac_layout).getBackground().setAlpha(alpha);
	        
	        //PoppyView
	        int poppy_def_color=Color.parseColor("#40222222");
			int poppy_color=PreferenceManager.getDefaultSharedPreferences(this).getInt("poppy_theme", poppy_def_color);
			poppyview.setBackgroundColor(poppy_color);
		}
}