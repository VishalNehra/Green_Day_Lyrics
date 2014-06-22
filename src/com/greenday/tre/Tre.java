package com.greenday.tre;

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
import com.greenday.tre.Info;

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

public class Tre extends Activity {
	private PoppyViewHelper mPoppyViewHelper;
	private Tracker t;
	private View poppyview;
	private TextView tv1;
	private ActionBar ab;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tre);
		
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
				Intent intent = new Intent(Tre.this, Allsongs.class);
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
				Intent intent = new Intent(Tre.this, ReportSong.class);
				if(track == 1){
					intent.putExtra("report_sub", "Brutal Love");
					startActivity(intent);
					}
				if(track == 2){
					intent.putExtra("report_sub", "Missing You");
					startActivity(intent);
					}
				if(track == 3){
					intent.putExtra("report_sub", "8th Avenue Serenade");
					startActivity(intent);
					}
				if(track == 4){
					intent.putExtra("report_sub", "Drama Queen");
					startActivity(intent);
					}
				if(track == 5){
					intent.putExtra("report_sub", "X-Kid");
					startActivity(intent);
					}
				if(track == 6){
					intent.putExtra("report_sub", "Sex, Drugs & Violence");
					startActivity(intent);
					}
				if(track == 7){
					intent.putExtra("report_sub", "Little Boy Named Train");
					startActivity(intent);
					}
				if(track == 8){
					intent.putExtra("report_sub", "Amanda");
					startActivity(intent);
					}
				if(track == 9){
					intent.putExtra("report_sub", "Walk Away");
					startActivity(intent);
					}
				if(track == 10){
					intent.putExtra("report_sub", "Dirty Rotten Bastards");
					startActivity(intent);
					}
				if(track == 11){
					intent.putExtra("report_sub", "99 Revolutions");
					startActivity(intent);
					}
				if(track == 12){
					intent.putExtra("report_sub", "The Forgotten");
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
					lookupTrack("Brutal Love", track);
					}
				if(track == 2){
					lookupTrack("Missing You", track);
					}
				if(track == 3){
					lookupTrack("8th Avenue Serenade", track);
					}
				if(track == 4){
					lookupTrack("Drama Queen", track);
					}
				if(track == 5){
					lookupTrack("X-Kid", track);
					}
				if(track == 6){
					lookupTrack("Sex, Drugs & Violence", track);
					}
				if(track == 7){
					lookupTrack("Little Boy Named Train", track);
					}
				if(track == 8){
					lookupTrack("Amanda", track);
					}
				if(track == 9){
					lookupTrack("Walk Away", track);
					}
				if(track == 10){
					lookupTrack("Dirty Rotten Bastards", track);
					}
				if(track == 11){
					lookupTrack("99 Revolutions", track);
					}
				if(track == 12){
					lookupTrack("The Forgotten", track);
					}
			}
		});
		favourite.setOnLongClickListener(new OnLongClickListener() {
			
			Intent intent = new Intent(Tre.this, Favorites.class);
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
					Info.info1(Tre.this);
				}
				if(track == 2){
					Info.info2(Tre.this);
				}
				if(track == 3){
					Info.info3(Tre.this);
				}
				if(track == 4){
					Info.info4(Tre.this);
				}
				if(track == 5){
					Info.info5(Tre.this);
				}
				if(track == 6){
					Info.info6(Tre.this);
				}
				if(track == 7){
					Info.info7(Tre.this);
				}
				if(track == 8){
					Info.info8(Tre.this);
				}
				if(track == 9){
					Info.info9(Tre.this);
				}
				if(track == 10){
					Info.info10(Tre.this);
				}
				if(track == 11){
					Info.info11(Tre.this);
				}
				if(track == 12){
					Info.info12(Tre.this);
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
			String current = "Brutal Love";
			ab.setTitle(current);
			tv1.setText(R.string.brutallove);
			analytics(current);
		}
		if(track == 2){
			String current = "Missing You";
			ab.setTitle(current);
			tv1.setText(R.string.missingyou);
			analytics(current);
		}
		if(track == 3){
			String current = "8th Avenue Serenade";
			ab.setTitle(current);
			tv1.setText(R.string.avesrnde);
			analytics(current);
		}
		if(track == 4){
			String current = "Drama Queen";
			ab.setTitle(current);
			tv1.setText(R.string.dramaqueen);
			analytics(current);
		}
		if(track == 5){
			String current = "X-Kid";
			ab.setTitle(current);
			tv1.setText(R.string.kid);
			analytics(current);
		}
		if(track == 6){
			String current = "Sex, Drugs & Violence";
			ab.setTitle(current);
			tv1.setText(R.string.sexdrugs);
			analytics(current);
		}
		if(track == 7){
			String current = "Little Boy Named Train";
			ab.setTitle(current);
			tv1.setText(R.string.littleboytrain);
			analytics(current);
		}
		if(track == 8){
			String current = "Amanda";
			ab.setTitle(current);
			tv1.setText(R.string.amanda);
			analytics(current);
		}
		if(track == 9){
			String current = "Walk Away";
			ab.setTitle(current);
			tv1.setText(R.string.walkaway);
			analytics(current);
		}
		if(track == 10){
			String current = "Dirty Rotten Bastards";
			ab.setTitle(current);
			tv1.setText(R.string.dirtybastards);
			analytics(current);
		}
		if(track == 11){
			String current = "99 Revolutions";
			ab.setTitle(current);
			tv1.setText(R.string.ninetyninerev);
			analytics(current);
		}
		if(track == 12){
			String current = "The Forgotten";
			ab.setTitle(current);
			tv1.setText(R.string.theforgotten);
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
	        findViewById(R.id.tre_layout).getBackground().setAlpha(alpha);
	        
	        //PoppyView
	        int poppy_def_color=Color.parseColor("#40222222");
			int poppy_color=PreferenceManager.getDefaultSharedPreferences(this).getInt("poppy_theme", poppy_def_color);
			poppyview.setBackgroundColor(poppy_color);
		}
}