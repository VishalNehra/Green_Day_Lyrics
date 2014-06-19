package com.greenday.tcb;

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
import com.greenday.tcb.Info;

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

public class TcbMain extends Activity {
	
	private PoppyViewHelper mPoppyViewHelper;
	private Tracker t;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tcb);
		
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
        findViewById(R.id.tcb_layout).getBackground().setAlpha(alpha);
		
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
				Intent intent = new Intent(TcbMain.this, Allsongs.class);
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
				Intent intent = new Intent(TcbMain.this, ReportSong.class);
				if(track == 1){
					intent.putExtra("report_sub", "Song Of The Centuary");
					startActivity(intent);
					}
				if(track == 2){
					intent.putExtra("report_sub", "21st Century Breakdown");
					startActivity(intent);
					}
				if(track == 3){
					intent.putExtra("report_sub", "Know Your Enemy");
					startActivity(intent);
					}
				if(track == 4){
					intent.putExtra("report_sub", "¡Viva La Gloria!");
					startActivity(intent);
					}
				if(track == 5){
					intent.putExtra("report_sub", "Before The Lobotomy");
					startActivity(intent);
					}
				if(track == 6){
					intent.putExtra("report_sub", "Christian's Inferno");
					startActivity(intent);
					}
				if(track == 7){
					intent.putExtra("report_sub", "Last Night On Earth");
					startActivity(intent);
					}
				if(track == 8){
					intent.putExtra("report_sub", "East Jesus Nowhere");
					startActivity(intent);
					}
				if(track == 9){
					intent.putExtra("report_sub", "Peacemaker");
					startActivity(intent);
					}
				if(track == 10){
					intent.putExtra("report_sub", "Last Of American Girls");
					startActivity(intent);
					}
				if(track == 11){
					intent.putExtra("report_sub", "Murder City");
					startActivity(intent);
					}
				if(track == 12){
					intent.putExtra("report_sub", "¿Viva La Gloria? (Little Girl)");
					startActivity(intent);
					}
				if(track == 13){
					intent.putExtra("report_sub", "Restless Heart Syndrome");
					startActivity(intent);
					}
				if(track == 14){
					intent.putExtra("report_sub", "Horseshoes And Handgranades");
					startActivity(intent);
					}
				if(track == 15){
					intent.putExtra("report_sub", "The Static Age");
					startActivity(intent);
					}
				if(track == 16){
					intent.putExtra("report_sub", "21 Guns");
					startActivity(intent);
					}
				if(track == 17){
					intent.putExtra("report_sub", "American Eulogy");
					startActivity(intent);
					}
				if(track == 18){
					intent.putExtra("report_sub", "See The Light");
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
					lookupTrack("Song Of The Centuary", track);
					}
				if(track == 2){
					lookupTrack("21st Century Breakdown", track);
					}
				if(track == 3){
					lookupTrack("Know Your Enemy", track);
					}
				if(track == 4){
					lookupTrack("¡Viva La Gloria!", track);
					}
				if(track == 5){
					lookupTrack("Before The Lobotomy", track);
					}
				if(track == 6){
					lookupTrack("Christian's Inferno", track);
					}
				if(track == 7){
					lookupTrack("Last Night On Earth", track);
					}
				if(track == 8){
					lookupTrack("East Jesus Nowhere", track);
					}
				if(track == 9){
					lookupTrack("Peacemaker", track);
					}
				if(track == 10){
					lookupTrack("Last Of American Girls", track);
					}
				if(track == 11){
					lookupTrack("Murder City", track);
					}
				if(track == 12){
					lookupTrack("¿Viva La Gloria? (Little Girl)", track);
					}
				if(track == 13){
					lookupTrack("Restless Heart Syndrome", track);
					}
				if(track == 14){
					lookupTrack("Horseshoes And Handgranades", track);
					}
				if(track == 15){
					lookupTrack("The Static Age", track);
					}
				if(track == 16){
					lookupTrack("21 Guns", track);
					}
				if(track == 17){
					lookupTrack("American Eulogy", track);
					}
				if(track == 18){
					lookupTrack("See The Light", track);
					}
			}
		});
		favourite.setOnLongClickListener(new OnLongClickListener() {
			
			Intent intent = new Intent(TcbMain.this, Favorites.class);
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
					Info.info1(TcbMain.this);
				}
				if(track == 2){
					Info.info2(TcbMain.this);
				}
				if(track == 3){
					Info.info3(TcbMain.this);
				}
				if(track == 4){
					Info.info4(TcbMain.this);
				}
				if(track == 5){
					Info.info5(TcbMain.this);
				}
				if(track == 6){
					Info.info6(TcbMain.this);
				}
				if(track == 7){
					Info.info7(TcbMain.this);
				}
				if(track == 8){
					Info.info8(TcbMain.this);
				}
				if(track == 9){
					Info.info9(TcbMain.this);
				}
				if(track == 10){
					Info.info10(TcbMain.this);
				}
				if(track == 11){
					Info.info11(TcbMain.this);
				}
				if(track == 12){
					Info.info12(TcbMain.this);
				}
				if(track == 13){
					Info.info13(TcbMain.this);
				}
				if(track == 14){
					Info.info14(TcbMain.this);
				}
				if(track == 15){
					Info.info15(TcbMain.this);
				}
				if(track == 16){
					Info.info16(TcbMain.this);
				}
				if(track == 17){
					Info.info17(TcbMain.this);
				}
				if(track == 18){
					Info.info18(TcbMain.this);
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
			String current = "Song Of The Centuary";
			ab.setTitle(current);
			tv1.setText(R.string.songofcentuary);
			analytics(current);
		}
		if(track == 2){
			String current = "21st Century Breakdown";
			ab.setTitle(current);
			tv1.setText(R.string.tcb);
			analytics(current);
		}
		if(track == 3){
			String current = "Know Your Enemy";
			ab.setTitle(current);
			tv1.setText(R.string.knowyourenemy);
			analytics(current);
		}
		if(track == 4){
			String current = "¡Viva La Gloria!";
			ab.setTitle(current);
			tv1.setText(R.string.vivalagloria);
			analytics(current);
		}
		if(track == 5){
			String current = "Before The Lobotomy";
			ab.setTitle(current);
			tv1.setText(R.string.lobotomy);
			analytics(current);
		}
		if(track == 6){
			String current = "Christian's Inferno";
			ab.setTitle(current);
			tv1.setText(R.string.inferno);
			analytics(current);
		}
		if(track == 7){
			String current = "Last Night On Earth";
			ab.setTitle(current);
			tv1.setText(R.string.lastnight);
			analytics(current);
		}
		if(track == 8){
			String current = "East Jesus Nowhere";
			ab.setTitle(current);
			tv1.setText(R.string.eastjesus);
			analytics(current);
		}
		if(track == 9){
			String current = "Peacemaker";
			ab.setTitle(current);
			tv1.setText(R.string.peacemaker);
			analytics(current);
		}
		if(track == 10){
			String current = "Last Of American Girls";
			ab.setTitle(current);
			tv1.setText(R.string.lastamerican);
			analytics(current);
		}
		if(track == 11){
			String current = "Murder City";
			ab.setTitle(current);
			tv1.setText(R.string.murdercity);
			analytics(current);
		}
		if(track == 12){
			String current = "¿Viva La Gloria? (Little Girl)";
			ab.setTitle(current);
			tv1.setText(R.string.vivalagloria2);
			analytics(current);
		}
		if(track == 13){
			String current = "Restless Heart Syndrome";
			ab.setTitle(current);
			tv1.setText(R.string.restless);
			analytics(current);
		}
		if(track == 14){
			String current = "Horseshoes And Handgranades";
			ab.setTitle(current);
			tv1.setText(R.string.horseshoes);
			analytics(current);
		}
		if(track == 15){
			String current = "The Static Age";
			ab.setTitle(current);
			tv1.setText(R.string.staticage);
			analytics(current);
		}
		if(track == 16){
			String current = "21 Guns";
			ab.setTitle(current);
			tv1.setText(R.string.guns);
			analytics(current);
		}
		if(track == 17){
			String current = "American Eulogy";
			ab.setTitle(current);
			tv1.setText(R.string.americaneulogy);
			analytics(current);
		}
		if(track == 18){
			String current = "See The Light";
			ab.setTitle(current);
			tv1.setText(R.string.seethelight);
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