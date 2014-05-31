package com.greenday.nimrod;

import com.fourmob.poppyview.PoppyViewHelper;
import com.fourmob.poppyview.PoppyViewHelper.PoppyViewPosition;
import com.greenday.database.DBHandler;
import com.greenday.database.Track;
import com.greenday.lyrics.Allsongs;
import com.greenday.lyrics.Favorites;
import com.greenday.lyrics.ReportSong;
import com.greenday.lyrics.Settings;
import com.greenday.lyrics.R;
import com.greenday.nimrod.Info;

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

public class Nimrod extends Activity {
	
	private PoppyViewHelper mPoppyViewHelper;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.nimrod);
		
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
        findViewById(R.id.nimrod_layout).getBackground().setAlpha(alpha);
		
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
				Intent intent = new Intent(Nimrod.this, Allsongs.class);
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
				Intent intent = new Intent(Nimrod.this, ReportSong.class);
				if(track == 1){
					intent.putExtra("report_sub", "Nice Guys Finish Last");
					startActivity(intent);
					}
				if(track == 2){
					intent.putExtra("report_sub", "Hitchin' A Ride");
					startActivity(intent);
					}
				if(track == 3){
					intent.putExtra("report_sub", "The Grouch");
					startActivity(intent);
					}
				if(track == 4){
					intent.putExtra("report_sub", "Redundant");
					startActivity(intent);
					}
				if(track == 5){
					intent.putExtra("report_sub", "Scattered");
					startActivity(intent);
					}
				if(track == 6){
					intent.putExtra("report_sub", "All The Time");
					startActivity(intent);
					}
				if(track == 7){
					intent.putExtra("report_sub", "Worry Rock");
					startActivity(intent);
					}
				if(track == 8){
					intent.putExtra("report_sub", "Platypus (I Hate You)");
					startActivity(intent);
					}
				if(track == 9){
					intent.putExtra("report_sub", "Uptight");
					startActivity(intent);
					}
				if(track == 10){
					intent.putExtra("report_sub", "Last Ride In");
					startActivity(intent);
					}
				if(track == 11){
					intent.putExtra("report_sub", "Jinx");
					startActivity(intent);
					}
				if(track == 12){
					intent.putExtra("report_sub", "Haushinka");
					startActivity(intent);
					}
				if(track == 13){
					intent.putExtra("report_sub", "Walking Alone");
					startActivity(intent);
					}
				if(track == 14){
					intent.putExtra("report_sub", "Reject");
					startActivity(intent);
					}
				if(track == 15){
					intent.putExtra("report_sub", "Take Back");
					startActivity(intent);
					}
				if(track == 16){
					intent.putExtra("report_sub", "King For A Day");
					startActivity(intent);
					}
				if(track == 17){
					intent.putExtra("report_sub", "Good Riddance (Time Of Your Life)");
					startActivity(intent);
					}
				if(track == 18){
					intent.putExtra("report_sub", "Prosthetic Head");
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
					lookupTrack("Nice Guys Finish Last", track);
					}
				if(track == 2){
					lookupTrack("Hitchin' A Ride", track);
					}
				if(track == 3){
					lookupTrack("The Grouch", track);
					}
				if(track == 4){
					lookupTrack("Redundant", track);
					}
				if(track == 5){
					lookupTrack("Scattered", track);
					}
				if(track == 6){
					lookupTrack("All The Time", track);
					}
				if(track == 7){
					lookupTrack("Worry Rock", track);
					}
				if(track == 8){
					lookupTrack("Platypus (I Hate You)", track);
					}
				if(track == 9){
					lookupTrack("Uptight", track);
					}
				if(track == 10){
					lookupTrack("Last Ride In", track);
					}
				if(track == 11){
					lookupTrack("Jinx", track);
					}
				if(track == 12){
					lookupTrack("Haushinka", track);
					}
				if(track == 13){
					lookupTrack("Walking Alone", track);
					}
				if(track == 14){
					lookupTrack("Reject", track);
					}
				if(track == 15){
					lookupTrack("Take Back", track);
					}
				if(track == 16){
					lookupTrack("King For A Day", track);
					}
				if(track == 17){
					lookupTrack("Good Riddance (Time Of Your Life)", track);
					}
				if(track == 18){
					lookupTrack("Prosthetic Head", track);
					}
			}
		});
		favourite.setOnLongClickListener(new OnLongClickListener() {
			
			Intent intent = new Intent(Nimrod.this, Favorites.class);
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
					Info.info1(Nimrod.this);
				}
				if(track == 2){
					Info.info2(Nimrod.this);
				}
				if(track == 3){
					Info.info3(Nimrod.this);
				}
				if(track == 4){
					Info.info4(Nimrod.this);
				}
				if(track == 5){
					Info.info5(Nimrod.this);
				}
				if(track == 6){
					Info.info6(Nimrod.this);
				}
				if(track == 7){
					Info.info7(Nimrod.this);
				}
				if(track == 8){
					Info.info8(Nimrod.this);
				}
				if(track == 9){
					Info.info9(Nimrod.this);
				}
				if(track == 10){
					Info.info10(Nimrod.this);
				}
				if(track == 11){
					Info.info11(Nimrod.this);
				}
				if(track == 12){
					Info.info12(Nimrod.this);
				}
				if(track == 13){
					Info.info13(Nimrod.this);
				}
				if(track == 14){
					Info.info14(Nimrod.this);
				}
				if(track == 15){
					Info.info15(Nimrod.this);
				}
				if(track == 16){
					Info.info16(Nimrod.this);
				}
				if(track == 17){
					Info.info17(Nimrod.this);
				}
				if(track == 18){
					Info.info18(Nimrod.this);
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
			ab.setTitle("Nice Guys Finish Last");
			tv1.setText(R.string.niceguys);
		}
		if(track == 2){
			ab.setTitle("Hitchin' A Ride");
			tv1.setText(R.string.hitchinaride);
		}
		if(track == 3){
			ab.setTitle("The Grouch");
			tv1.setText(R.string.grouch);
		}
		if(track == 4){
			ab.setTitle("Redundant");
			tv1.setText(R.string.redundant);
		}
		if(track == 5){
			ab.setTitle("Scattered");
			tv1.setText(R.string.scattered);
		}
		if(track == 6){
			ab.setTitle("All The Time");
			tv1.setText(R.string.allthetime);
		}
		if(track == 7){
			ab.setTitle("Worry Rock");
			tv1.setText(R.string.worryrock);
		}
		if(track == 8){
			ab.setTitle("Platypus (I Hate You)");
			tv1.setText(R.string.platypus);
		}
		if(track == 9){
			ab.setTitle("Uptight");
			tv1.setText(R.string.uptight);
		}
		if(track == 10){
			ab.setTitle("Last Ride In");
			tv1.setText(R.string.lastridein);
		}
		if(track == 11){
			ab.setTitle("Jinx");
			tv1.setText(R.string.jinx);
		}
		if(track == 12){
			ab.setTitle("Haushinka");
			tv1.setText(R.string.haushinka);
		}
		if(track == 13){
			ab.setTitle("Walking Alone");
			tv1.setText(R.string.walkingalone);
		}
		if(track == 14){
			ab.setTitle("Reject");
			tv1.setText(R.string.reject);
		}
		if(track == 15){
			ab.setTitle("Take Back");
			tv1.setText(R.string.takeback);
		}
		if(track == 16){
			ab.setTitle("King For A Day");
			tv1.setText(R.string.kingforaday);
		}
		if(track == 17){
			ab.setTitle("Good Riddance (Time Of Your Life)");
			tv1.setText(R.string.goodriddance);
		}
		if(track == 18){
			ab.setTitle("Prosthetic Head");
			tv1.setText(R.string.prosthetichead);
		}
		
		getActionBar().setDisplayHomeAsUpEnabled(true);
		
		//Display
		boolean display = PreferenceManager.getDefaultSharedPreferences(this).getBoolean("display", false);
		if(display)
		{
			tv1.setKeepScreenOn(true);
		}
	}
	
	//Action bar code below
	
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
				Crouton.makeText(this, "Press and hold on favorites icon to view it", Style.INFO).show();
			} else {
				db.addTrack(new Track(name, i));
				Crouton.makeText(this, "Added to favorites", Style.INFO).show();
			}
		}
}