package com.greenday.americanidiot;

import com.fourmob.poppyview.PoppyViewHelper;
import com.fourmob.poppyview.PoppyViewHelper.PoppyViewPosition;
import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.analytics.HitBuilders;
import com.google.android.gms.analytics.Tracker;
import com.greenday.lyrics.Allsongs;
import com.greenday.lyrics.Favorites;
import com.greenday.lyrics.Frontend;
import com.greenday.lyrics.Frontend.TrackerName;
import com.greenday.lyrics.ReportSong;
import com.greenday.lyrics.Settings;
import com.greenday.lyrics.R;
import com.greenday.americanidiot.Info;
import com.greenday.database.DBHandler;
import com.greenday.database.Track;

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

public class AmericanIdiotMain extends Activity {
	
	private PoppyViewHelper mPoppyViewHelper;
	private Tracker t;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.americanidiot);
		findViewById(R.id.american_idiot_layout).getBackground().setAlpha(22);
		
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
        int def_alpha = 150;
        int alpha = PreferenceManager.getDefaultSharedPreferences(this).getInt("alpha", def_alpha);
        findViewById(R.id.american_idiot_layout).getBackground().setAlpha(alpha);
		
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
				Intent intent = new Intent(AmericanIdiotMain.this, Allsongs.class);
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
				Intent intent = new Intent(AmericanIdiotMain.this, ReportSong.class);
				if(track == 1){
					intent.putExtra("report_sub", "American Idiot");
					startActivity(intent);
					}
				if(track == 2){
					intent.putExtra("report_sub", "Jesus Of Suburbia");
					startActivity(intent);
					}
				if(track == 3){
					intent.putExtra("report_sub", "Holiday");
					startActivity(intent);
					}
				if(track == 4){
					intent.putExtra("report_sub", "Boulevard of Broken Dreams");
					startActivity(intent);
					}
				if(track == 5){
					intent.putExtra("report_sub", "Are We The Waiting");
					startActivity(intent);
					}
				if(track == 6){
					intent.putExtra("report_sub", "St. Jimmy");
					startActivity(intent);
					}
				if(track == 7){
					intent.putExtra("report_sub", "Give Me Novacaine");
					startActivity(intent);
					}
				if(track == 8){
					intent.putExtra("report_sub", "She's A Rebel");
					startActivity(intent);
					}
				if(track == 9){
					intent.putExtra("report_sub", "Extraordinary Girl");
					startActivity(intent);
					}
				if(track == 10){
					intent.putExtra("report_sub", "Letterbomb");
					startActivity(intent);
					}
				if(track == 11){
					intent.putExtra("report_sub", "Wake Me Up When September Ends");
					startActivity(intent);
					}
				if(track == 12){
					intent.putExtra("report_sub", "Homecoming");
					startActivity(intent);
					}
				if(track == 13){
					intent.putExtra("report_sub", "Whatshername");
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
					lookupTrack("American Idiot", track);
					}
				if(track == 2){
					lookupTrack("Jesus Of Suburbia", track);
					}
				if(track == 3){
					lookupTrack("Holiday", track);
					}
				if(track == 4){
					lookupTrack("Boulevard Of Broken Dreams", track);
					}
				if(track == 5){
					lookupTrack("Are We The Waiting", track);
					}
				if(track == 6){
					lookupTrack("St. Jimmy", track);
					}
				if(track == 7){
					lookupTrack("Give Me Novacaine", track);
					}
				if(track == 8){
					lookupTrack("She's A Rebel", track);
					}
				if(track == 9){
					lookupTrack("Extraordinary Girl", track);
					}
				if(track == 10){
					lookupTrack("Letterbomb", track);
					}
				if(track == 11){
					lookupTrack("Wake Me Up When September Ends", track);
					}
				if(track == 12){
					lookupTrack("Homecoming", track);
					}
				if(track == 13){
					lookupTrack("Whatshername", track);
					}
			}
		});
		favourite.setOnLongClickListener(new OnLongClickListener() {
			
			Intent intent = new Intent(AmericanIdiotMain.this, Favorites.class);
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
					Info.info1(AmericanIdiotMain.this);
				}
				if(track == 2){
					Info.info2(AmericanIdiotMain.this);
				}
				if(track == 3){
					Info.info3(AmericanIdiotMain.this);
				}
				if(track == 4){
					Info.info4(AmericanIdiotMain.this);
				}
				if(track == 5){
					Info.info5(AmericanIdiotMain.this);
				}
				if(track == 6){
					Info.info6(AmericanIdiotMain.this);
				}
				if(track == 7){
					Info.info7(AmericanIdiotMain.this);
				}
				if(track == 8){
					Info.info8(AmericanIdiotMain.this);
				}
				if(track == 9){
					Info.info9(AmericanIdiotMain.this);
				}
				if(track == 10){
					Info.info10(AmericanIdiotMain.this);
				}
				if(track == 11){
					Info.info11(AmericanIdiotMain.this);
				}
				if(track == 12){
					Info.info12(AmericanIdiotMain.this);
				}
				if(track == 13){
					Info.info13(AmericanIdiotMain.this);
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
			String current = "American Idiot";
			ab.setTitle(current);
			tv1.setText(R.string.americanidiot);
			analytics(current);
		}
		if(track == 2){
			String current = "Jesus Of Suburbia";
			ab.setTitle(current);
			tv1.setText(R.string.jos);
			analytics(current);
		}
		if(track == 3){
			String current = "Holiday";
			ab.setTitle(current);
			tv1.setText(R.string.holiday);
			analytics(current);
		}
		if(track == 4){
			String current = "Boulevard of Broken Dreams";
			ab.setTitle(current);
			tv1.setText(R.string.boulevards);
			analytics(current);
		}
		if(track == 5){
			String current = "Are We The Waiting";
			ab.setTitle(current);
			tv1.setText(R.string.arewethewaiting);
			analytics(current);
		}
		if(track == 6){
			String current = "St. Jimmy";
			ab.setTitle(current);
			tv1.setText(R.string.stjimmy);
			analytics(current);
		}
		if(track == 7){
			String current = "Give Me Novacaine";
			ab.setTitle(current);
			tv1.setText(R.string.givemenov);
			analytics(current);
		}
		if(track == 8){
			String current = "She's A Rebel";
			ab.setTitle(current);
			tv1.setText(R.string.shesarebel);
			analytics(current);
		}
		if(track == 9){
			String current = "Extraordinary Girl";
			ab.setTitle(current);
			tv1.setText(R.string.extordgirl);
			analytics(current);
		}
		if(track == 10){
			String current = "Letterbomb";
			ab.setTitle(current);
			tv1.setText(R.string.letterbomb);
			analytics(current);
		}
		if(track == 11){
			String current = "Wake Me Up When September Ends";
			ab.setTitle(current);
			tv1.setText(R.string.wakemeup);
			analytics(current);
		}
		if(track == 12){
			String current = "Homecoming";
			ab.setTitle(current);
			tv1.setText(R.string.homecoming);
			analytics(current);
		}
		if(track == 13){
			String current = "Whatshername";
			ab.setTitle(current);
			tv1.setText(R.string.whatshername);
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
	        //getMenuInflater().inflate(R.menu.main_song, menu);
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