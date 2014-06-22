package com.greenday.warning;

import com.fourmob.poppyview.PoppyViewHelper;
import com.fourmob.poppyview.PoppyViewHelper.PoppyViewPosition;
import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.analytics.HitBuilders;
import com.google.android.gms.analytics.Tracker;
import com.greenday.database.DBHandler;
import com.greenday.database.Track;
import com.greenday.lyrics.Allsongs;
import com.greenday.lyrics.Favorites;
import com.greenday.lyrics.Frontend;
import com.greenday.lyrics.ReportSong;
import com.greenday.lyrics.Settings;
import com.greenday.lyrics.R;
import com.greenday.lyrics.Frontend.TrackerName;
import com.greenday.warning.Info;

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

public class WarningMain extends Activity {
	private PoppyViewHelper mPoppyViewHelper;
	private Tracker t;
	private View poppyview;
	private TextView tv1;
	private ActionBar ab;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.warning);
		
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
				Intent intent = new Intent(WarningMain.this, Allsongs.class);
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
				Intent intent = new Intent(WarningMain.this, ReportSong.class);
				if(track == 1){
					intent.putExtra("report_sub", "Warning");
					startActivity(intent);
					}
				if(track == 2){
					intent.putExtra("report_sub", "Blood, Sex and Booze");
					startActivity(intent);
					}
				if(track == 3){
					intent.putExtra("report_sub", "Church On Sunday");
					startActivity(intent);
					}
				if(track == 4){
					intent.putExtra("report_sub", "Fashion Victim");
					startActivity(intent);
					}
				if(track == 5){
					intent.putExtra("report_sub", "Castaway");
					startActivity(intent);
					}
				if(track == 6){
					intent.putExtra("report_sub", "Misery");
					startActivity(intent);
					}
				if(track == 7){
					intent.putExtra("report_sub", "Deadbeat Holiday");
					startActivity(intent);
					}
				if(track == 8){
					intent.putExtra("report_sub", "Hold On");
					startActivity(intent);
					}
				if(track == 9){
					intent.putExtra("report_sub", "Jackass");
					startActivity(intent);
					}
				if(track == 10){
					intent.putExtra("report_sub", "Waiting");
					startActivity(intent);
					}
				if(track == 11){
					intent.putExtra("report_sub", "Minority");
					startActivity(intent);
					}
				if(track == 12){
					intent.putExtra("report_sub", "Macy's Day Parade");
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
					lookupTrack("Warning", track);
					}
				if(track == 2){
					lookupTrack("Blood, Sex and Booze", track);
					}
				if(track == 3){
					lookupTrack("Church On Sunday", track);
					}
				if(track == 4){
					lookupTrack("Fashion Victim", track);
					}
				if(track == 5){
					lookupTrack("Castaway", track);
					}
				if(track == 6){
					lookupTrack("Misery", track);
					}
				if(track == 7){
					lookupTrack("Deadbeat Holiday", track);
					}
				if(track == 8){
					lookupTrack("Hold On", track);
					}
				if(track == 9){
					lookupTrack("Jackass", track);
					}
				if(track == 10){
					lookupTrack("Waiting", track);
					}
				if(track == 11){
					lookupTrack("Minority", track);
					}
				if(track == 12){
					lookupTrack("Macy's Day Parade", track);
					}
			}
		});
		favourite.setOnLongClickListener(new OnLongClickListener() {
			
			Intent intent = new Intent(WarningMain.this, Favorites.class);
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
					Info.info1(WarningMain.this);
				}
				if(track == 2){
					Info.info2(WarningMain.this);
				}
				if(track == 3){
					Info.info3(WarningMain.this);
				}
				if(track == 4){
					Info.info4(WarningMain.this);
				}
				if(track == 5){
					Info.info5(WarningMain.this);
				}
				if(track == 6){
					Info.info6(WarningMain.this);
				}
				if(track == 7){
					Info.info7(WarningMain.this);
				}
				if(track == 8){
					Info.info8(WarningMain.this);
				}
				if(track == 9){
					Info.info9(WarningMain.this);
				}
				if(track == 10){
					Info.info10(WarningMain.this);
				}
				if(track == 11){
					Info.info11(WarningMain.this);
				}
				if(track == 12){
					Info.info12(WarningMain.this);
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
			String current = "Warning";
			ab.setTitle(current);
			tv1.setText(R.string.warning);
			analytics(current);
		}
		if(track == 2){
			String current = "Blood, Sex and Booze";
			ab.setTitle(current);
			tv1.setText(R.string.bloodsex);
			analytics(current);
		}
		if(track == 3){
			String current = "Church On Sunday";
			ab.setTitle(current);
			tv1.setText(R.string.church);
			analytics(current);
		}
		if(track == 4){
			String current = "Fashion Victim";
			ab.setTitle(current);
			tv1.setText(R.string.fashion);
			analytics(current);
		}
		if(track == 5){
			String current = "Castaway";
			ab.setTitle(current);
			tv1.setText(R.string.castaway);
			analytics(current);
		}
		if(track == 6){
			String current = "Misery";
			ab.setTitle(current);
			tv1.setText(R.string.misery);
			analytics(current);
		}
		if(track == 7){
			String current = "Deadbeat Holiday";
			ab.setTitle(current);
			tv1.setText(R.string.deadbeat);
			analytics(current);
		}
		if(track == 8){
			String current = "Hold On";
			ab.setTitle(current);
			tv1.setText(R.string.holdon);
			analytics(current);
		}
		if(track == 9){
			String current = "Jackass";
			ab.setTitle(current);
			tv1.setText(R.string.jackass);
			analytics(current);
		}
		if(track == 10){
			String current = "Waiting";
			ab.setTitle(current);
			tv1.setText(R.string.waiting);
			analytics(current);
		}
		if(track == 11){
			String current = "Minority";
			ab.setTitle(current);
			tv1.setText(R.string.minority);
			analytics(current);
		}
		if(track == 12){
			String current = "Macy's Day Parade";
			ab.setTitle(current);
			tv1.setText(R.string.macy);
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
	        findViewById(R.id.warning_layout).getBackground().setAlpha(alpha);
	        
	        //PoppyView
	        int poppy_def_color=Color.parseColor("#40222222");
			int poppy_color=PreferenceManager.getDefaultSharedPreferences(this).getInt("poppy_theme", poppy_def_color);
			poppyview.setBackgroundColor(poppy_color);
		}
}