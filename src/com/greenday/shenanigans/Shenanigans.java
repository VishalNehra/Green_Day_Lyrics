package com.greenday.shenanigans;

import com.fourmob.poppyview.PoppyViewHelper;
import com.fourmob.poppyview.PoppyViewHelper.PoppyViewPosition;
import com.greenday.database.DBHandler;
import com.greenday.database.Track;
import com.greenday.lyrics.Allsongs;
import com.greenday.lyrics.Favorites;
import com.greenday.lyrics.ReportSong;
import com.greenday.lyrics.Settings;
import com.greenday.lyrics.R;
import com.greenday.shenanigans.Info;

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

public class Shenanigans extends Activity {
	
	private PoppyViewHelper mPoppyViewHelper;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.shenanigans);
		
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
        findViewById(R.id.shenanigans_layout).getBackground().setAlpha(alpha);
		
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
				Intent intent = new Intent(Shenanigans.this, Allsongs.class);
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
				Intent intent = new Intent(Shenanigans.this, ReportSong.class);
				if(track == 1){
					intent.putExtra("report_sub", "Suffocate");
					startActivity(intent);
					}
				if(track == 2){
					intent.putExtra("report_sub", "Desensitized");
					startActivity(intent);
					}
				if(track == 3){
					intent.putExtra("report_sub", "You Lied");
					startActivity(intent);
					}
				if(track == 4){
					intent.putExtra("report_sub", "Outsider");
					startActivity(intent);
					}
				if(track == 5){
					intent.putExtra("report_sub", "Don't Wanna Fall In Love");
					startActivity(intent);
					}
				if(track == 6){
					intent.putExtra("report_sub", "Espionage");
					startActivity(intent);
					}
				if(track == 7){
					intent.putExtra("report_sub", "I Wanna Be On T.V.");
					startActivity(intent);
					}
				if(track == 8){
					intent.putExtra("report_sub", "Scumbag");
					startActivity(intent);
					}
				if(track == 9){
					intent.putExtra("report_sub", "Tired Of Waiting For You");
					startActivity(intent);
					}
				if(track == 10){
					intent.putExtra("report_sub", "Sick Of Me");
					startActivity(intent);
					}
				if(track == 11){
					intent.putExtra("report_sub", "Rotting");
					startActivity(intent);
					}
				if(track == 12){
					intent.putExtra("report_sub", "Do Da Da");
					startActivity(intent);
					}
				if(track == 13){
					intent.putExtra("report_sub", "On The Wagon");
					startActivity(intent);
					}
				if(track == 14){
					intent.putExtra("report_sub", "Ha Ha You're Dead");
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
					lookupTrack("Suffocate", track);
					}
				if(track == 2){
					lookupTrack("Desensitized", track);
					}
				if(track == 3){
					lookupTrack("You Lied", track);
					}
				if(track == 4){
					lookupTrack("Outsider", track);
					}
				if(track == 5){
					lookupTrack("Don't Wanna Fall In Love", track);
					}
				if(track == 6){
					lookupTrack("Espionage", track);
					}
				if(track == 7){
					lookupTrack("I Wanna Be On T.V.", track);
					}
				if(track == 8){
					lookupTrack("Scumbag", track);
					}
				if(track == 9){
					lookupTrack("Tired Of Waiting For You", track);
					}
				if(track == 10){
					lookupTrack("Sick Of Me", track);
					}
				if(track == 11){
					lookupTrack("Rotting", track);
					}
				if(track == 12){
					lookupTrack("Do Da Da", track);
					}
				if(track == 13){
					lookupTrack("On The Wagon", track);
					}
				if(track == 14){
					lookupTrack("Ha Ha You're Dead", track);
					}
			}
		});
		favourite.setOnLongClickListener(new OnLongClickListener() {
			
			Intent intent = new Intent(Shenanigans.this, Favorites.class);
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
					Info.info1(Shenanigans.this);
				}
				if(track == 2){
					Info.info2(Shenanigans.this);
				}
				if(track == 3){
					Info.info3(Shenanigans.this);
				}
				if(track == 4){
					Info.info4(Shenanigans.this);
				}
				if(track == 5){
					Info.info5(Shenanigans.this);
				}
				if(track == 6){
					Info.info6(Shenanigans.this);
				}
				if(track == 7){
					Info.info7(Shenanigans.this);
				}
				if(track == 8){
					Info.info8(Shenanigans.this);
				}
				if(track == 9){
					Info.info9(Shenanigans.this);
				}
				if(track == 10){
					Info.info10(Shenanigans.this);
				}
				if(track == 11){
					Info.info11(Shenanigans.this);
				}
				if(track == 12){
					Info.info12(Shenanigans.this);
				}
				if(track == 13){
					Info.info13(Shenanigans.this);
				}
				if(track == 14){
					Info.info14(Shenanigans.this);
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
			ab.setTitle("Suffocate");
			tv1.setText(R.string.suffocate);
		}
		if(track == 2){
			ab.setTitle("Desensitized");
			tv1.setText(R.string.desensitized);
		}
		if(track == 3){
			ab.setTitle("You Lied");
			tv1.setText(R.string.youlied);
		}
		if(track == 4){
			ab.setTitle("Outsider");
			tv1.setText(R.string.outsider);
		}
		if(track == 5){
			ab.setTitle("Don't Wanna Fall In Love");
			tv1.setText(R.string.fallinlove);
		}
		if(track == 6){
			ab.setTitle("Espionage");
			tv1.setText(R.string.espionage);
		}
		if(track == 7){
			ab.setTitle("I Wanna Be On T.V.");
			tv1.setText(R.string.wannabeontv);
		}
		if(track == 8){
			ab.setTitle("Scumbag");
			tv1.setText(R.string.scumbag);
		}
		if(track == 9){
			ab.setTitle("Tired Of Waiting For You");
			tv1.setText(R.string.tiredofwaiting);
		}
		if(track == 10){
			ab.setTitle("Sick Of Me");
			tv1.setText(R.string.sickofme);
		}
		if(track == 11){
			ab.setTitle("Rotting");
			tv1.setText(R.string.rotting);
		}
		if(track == 12){
			ab.setTitle("Do Da Da");
			tv1.setText(R.string.dodada);
		}
		if(track == 13){
			ab.setTitle("On The Wagon");
			tv1.setText(R.string.onwagon);
		}
		if(track == 14){
			ab.setTitle("Ha Ha You're Dead");
			tv1.setText(R.string.youredead);
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
}