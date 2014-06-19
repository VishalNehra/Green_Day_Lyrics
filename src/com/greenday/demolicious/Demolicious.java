package com.greenday.demolicious;

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
import com.greenday.demolicious.Info;

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

public class Demolicious extends Activity {
	
	private PoppyViewHelper mPoppyViewHelper;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.demolicious);
		
		//Google Analytics
		((Frontend) getApplication()).getTracker(Frontend.TrackerName.APP_TRACKER);
		Tracker t = ((Frontend) this.getApplication()).getTracker(
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
        findViewById(R.id.demolicious_layout).getBackground().setAlpha(alpha);
		
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
				Intent intent = new Intent(Demolicious.this, Allsongs.class);
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
				Intent intent = new Intent(Demolicious.this, ReportSong.class);
				if(track == 1){
					intent.putExtra("report_sub", "99 Revolutions (Demo)");
					startActivity(intent);
					}
				if(track == 2){
					intent.putExtra("report_sub", "Angel Blue (Demo)");
					startActivity(intent);
					}
				if(track == 3){
					intent.putExtra("report_sub", "Carpe Diem (Demo)");
					startActivity(intent);
					}
				if(track == 4){
					intent.putExtra("report_sub", "State Of Shock");
					startActivity(intent);
					}
				if(track == 5){
					intent.putExtra("report_sub", "Let Yourself Go (Demo)");
					startActivity(intent);
					}
				if(track == 6){
					intent.putExtra("report_sub", "Sex, Drugs And Violence (Demo)");
					startActivity(intent);
					}
				if(track == 7){
					intent.putExtra("report_sub", "Ashley (Demo)");
					startActivity(intent);
					}
				if(track == 8){
					intent.putExtra("report_sub", "Fell For You (Demo)");
					startActivity(intent);
					}
				if(track == 9){
					intent.putExtra("report_sub", "Stay The Night (Demo)");
					startActivity(intent);
					}
				if(track == 10){
					intent.putExtra("report_sub", "Nuclear Family (Demo)");
					startActivity(intent);
					}
				if(track == 11){
					intent.putExtra("report_sub", "Stray Heart (Demo)");
					startActivity(intent);
					}
				if(track == 12){
					intent.putExtra("report_sub", "Rusty James (Demo)");
					startActivity(intent);
					}
				if(track == 13){
					intent.putExtra("report_sub", "A Little Boy Named Train (Demo)");
					startActivity(intent);
					}
				if(track == 14){
					intent.putExtra("report_sub", "Baby Eyes (Demo)");
					startActivity(intent);
					}
				if(track == 15){
					intent.putExtra("report_sub", "Makeout Party (Demo)");
					startActivity(intent);
					}
				if(track == 16){
					intent.putExtra("report_sub", "Oh Love (Demo)");
					startActivity(intent);
					}
				if(track == 17){
					intent.putExtra("report_sub", "Missing You (Demo)");
					startActivity(intent);
					}
				if(track == 18){
					intent.putExtra("report_sub", "Stay The Night (Acoustic)");
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
					lookupTrack("99 Revolutions (Demo)", track);
					}
				if(track == 2){
					lookupTrack("Angel Blue (Demo)", track);
					}
				if(track == 3){
					lookupTrack("Carpe Diem (Demo)", track);
					}
				if(track == 4){
					lookupTrack("State Of Shock", track);
					}
				if(track == 5){
					lookupTrack("Let Yourself Go (Demo)", track);
					}
				if(track == 6){
					lookupTrack("Sex, Drugs And Violence (Demo)", track);
					}
				if(track == 7){
					lookupTrack("Ashley (Demo)", track);
					}
				if(track == 8){
					lookupTrack("Fell For You (Demo)", track);
					}
				if(track == 9){
					lookupTrack("Stay The Night (Demo)", track);
					}
				if(track == 10){
					lookupTrack("Nuclear Family (Demo)", track);
					}
				if(track == 11){
					lookupTrack("Stray Heart (Demo)", track);
					}
				if(track == 12){
					lookupTrack("Rusty James (Demo)", track);
					}
				if(track == 13){
					lookupTrack("A Little Boy Named Train (Demo)", track);
					}
				if(track == 14){
					lookupTrack("Baby Eyes (Demo)", track);
					}
				if(track == 15){
					lookupTrack("Makeout Party (Demo)", track);
					}
				if(track == 16){
					lookupTrack("Oh Love (Demo)", track);
					}
				if(track == 17){
					lookupTrack("Missing You (Demo)", track);
					}
				if(track == 18){
					lookupTrack("Stay The Night (Acoustic)", track);
					}
			}
		});
		favourite.setOnLongClickListener(new OnLongClickListener() {
			
			Intent intent = new Intent(Demolicious.this, Favorites.class);
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
					Info.info1(Demolicious.this);
				}
				if(track == 2){
					Info.info2(Demolicious.this);
				}
				if(track == 3){
					Info.info3(Demolicious.this);
				}
				if(track == 4){
					Info.info4(Demolicious.this);
				}
				if(track == 5){
					Info.info5(Demolicious.this);
				}
				if(track == 6){
					Info.info6(Demolicious.this);
				}
				if(track == 7){
					Info.info7(Demolicious.this);
				}
				if(track == 8){
					Info.info8(Demolicious.this);
				}
				if(track == 9){
					Info.info9(Demolicious.this);
				}
				if(track == 10){
					Info.info10(Demolicious.this);
				}
				if(track == 11){
					Info.info11(Demolicious.this);
				}
				if(track == 12){
					Info.info12(Demolicious.this);
				}
				if(track == 13){
					Info.info13(Demolicious.this);
				}
				if(track == 14){
					Info.info14(Demolicious.this);
				}
				if(track == 15){
					Info.info15(Demolicious.this);
				}
				if(track == 16){
					Info.info16(Demolicious.this);
				}
				if(track == 17){
					Info.info17(Demolicious.this);
				}
				if(track == 18){
					Info.info18(Demolicious.this);
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
			String current = "99 Revolutions (Demo)";
			ab.setTitle(current);
			tv1.setText(R.string.ninetyrevdemo);
			
			//Google Analytics
			// Set screen name.
	        t.setScreenName(current);
	        // Send a screen view.
	        t.send(new HitBuilders.AppViewBuilder().build());
		}
		if(track == 2){
			String current = "Angel Blue (Demo)";
			ab.setTitle(current);
			tv1.setText(R.string.angelbluedemo);
			
	        t.setScreenName(current);
	        t.send(new HitBuilders.AppViewBuilder().build());
		}
		if(track == 3){
			String current = "Carpe Diem (Demo)";
			ab.setTitle(current);
			tv1.setText(R.string.carpediemdemo);
			
	        t.setScreenName(current);
	        t.send(new HitBuilders.AppViewBuilder().build());
		}
		if(track == 4){
			String current = "State Of Shock";
			ab.setTitle(current);
			tv1.setText(R.string.stateofshock);
			
	        t.setScreenName(current);
	        t.send(new HitBuilders.AppViewBuilder().build());
		}
		if(track == 5){
			String current = "Let Yourself Go (Demo)";
			ab.setTitle(current);
			tv1.setText(R.string.letgodemo);
			
	        t.setScreenName(current);
	        t.send(new HitBuilders.AppViewBuilder().build());
		}
		if(track == 6){
			String current = "Sex, Drugs And Violence (Demo)";
			ab.setTitle(current);
			tv1.setText(R.string.sexviolencedemo);
			
	        t.setScreenName(current);
	        t.send(new HitBuilders.AppViewBuilder().build());
		}
		if(track == 7){
			String current = "Ashley (Demo)";
			ab.setTitle(current);
			tv1.setText(R.string.ashleydemo);
			
	        t.setScreenName(current);
	        t.send(new HitBuilders.AppViewBuilder().build());
		}
		if(track == 8){
			String current = "Fell For You (Demo)";
			ab.setTitle(current);
			tv1.setText(R.string.fellforyoudemo);
			
	        t.setScreenName(current);
	        t.send(new HitBuilders.AppViewBuilder().build());
		}
		if(track == 9){
			String current = "Stay The Night (Demo)";
			ab.setTitle(current);
			tv1.setText(R.string.staynightdemo);
			
	        t.setScreenName(current);
	        t.send(new HitBuilders.AppViewBuilder().build());
		}
		if(track == 10){
			String current = "Nuclear Family (Demo)";
			ab.setTitle(current);
			tv1.setText(R.string.nucleardemo);
			
	        t.setScreenName(current);
	        t.send(new HitBuilders.AppViewBuilder().build());
		}
		if(track == 11){
			String current = "Stray Heart (Demo)";
			ab.setTitle(current);
			tv1.setText(R.string.strayheartdemo);
			
	        t.setScreenName(current);
	        t.send(new HitBuilders.AppViewBuilder().build());
		}
		if(track == 12){
			String current = "Rusty James (Demo)";
			ab.setTitle(current);
			tv1.setText(R.string.rustyjamesdemo);
			
	        t.setScreenName(current);
	        t.send(new HitBuilders.AppViewBuilder().build());
		}
		if(track == 13){
			String current = "A Little Boy Named Train (Demo)";
			ab.setTitle(current);
			tv1.setText(R.string.littleboydemo);
			
	        t.setScreenName(current);
	        t.send(new HitBuilders.AppViewBuilder().build());
		}
		if(track == 14){
			String current = "Baby Eyes (Demo)";
			ab.setTitle(current);
			tv1.setText(R.string.babyeyesdemo);
			
	        t.setScreenName(current);
	        t.send(new HitBuilders.AppViewBuilder().build());
		}
		if(track == 15){
			String current = "Makeout Party (Demo)";
			ab.setTitle(current);
			tv1.setText(R.string.makeoutdemo);
			
	        t.setScreenName(current);
	        t.send(new HitBuilders.AppViewBuilder().build());
		}
		if(track == 16){
			String current = "Oh Love (Demo)";
			ab.setTitle(current);
			tv1.setText(R.string.ohlovedemo);
			
	        t.setScreenName(current);
	        t.send(new HitBuilders.AppViewBuilder().build());
		}
		if(track == 17){
			String current = "Missing You (Demo)";
			ab.setTitle(current);
			tv1.setText(R.string.missingyoudemo);
			
	        t.setScreenName(current);
	        t.send(new HitBuilders.AppViewBuilder().build());
		}
		if(track == 18){
			String current = "Stay The Night (Acoustic)";
			ab.setTitle(current);
			tv1.setText(R.string.staynightacoustic);
			
	        t.setScreenName(current);
	        t.send(new HitBuilders.AppViewBuilder().build());
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