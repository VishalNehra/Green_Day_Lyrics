package com.greenday.uno;

import com.greenday.lyrics.Allsongs;
import com.greenday.lyrics.ReportSong;
import com.greenday.lyrics.Settings;
import com.greenday.lyrics.Util;
import com.greenday.lyrics.R;
import com.greenday.uno.Info;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class Uno extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		//Declare theme before super.oncreate or setcontentview
		Util.setAppTheme(this);
		
		setContentView(R.layout.uno);
		
		super.onCreate(savedInstanceState);
		TextView tv1 = (TextView)findViewById(R.id.textView1);
		int text = PreferenceManager.getDefaultSharedPreferences(this).getInt("text", 18);
		tv1.setTextSize(text);
		
		int track = getIntent().getExtras().getInt("track");
		ActionBar ab=getActionBar();
		if(track == 1){
			ab.setTitle("Nuclear Family");
			tv1.setText(R.string.nuclearfamily);
		}
		if(track == 2){
			ab.setTitle("Stay The Night");
			tv1.setText(R.string.staynight);
		}
		if(track == 3){
			ab.setTitle("Carpe Diem");
			tv1.setText(R.string.carpediem);
		}
		if(track == 4){
			ab.setTitle("Let Yourself Go");
			tv1.setText(R.string.letgo);
		}
		if(track == 5){
			ab.setTitle("Kill The DJ");
			tv1.setText(R.string.killthedj);
		}
		if(track == 6){
			ab.setTitle("Fell For You");
			tv1.setText(R.string.fellforyou);
		}
		if(track == 7){
			ab.setTitle("Loss Of Control");
			tv1.setText(R.string.lossofcontrol);
		}
		if(track == 8){
			ab.setTitle("Troublemaker");
			tv1.setText(R.string.troublemaker);
		}
		if(track == 9){
			ab.setTitle("Angel Blue");
			tv1.setText(R.string.angelblue);
		}
		if(track == 10){
			ab.setTitle("Sweet 16");
			tv1.setText(R.string.sweetsixt);
		}
		if(track == 11){
			ab.setTitle("Rusty James");
			tv1.setText(R.string.rustyjames);
		}
		if(track == 12){
			ab.setTitle("Oh Love");
			tv1.setText(R.string.ohlove);
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
	        getMenuInflater().inflate(R.menu.main_song, menu);
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
			if(item.getItemId()==R.id.settings)
			{
				startActivity(new Intent(getApplicationContext(), Settings.class));
			}
			if(item.getItemId()==R.id.reportsong)
			{
				int track = getIntent().getExtras().getInt("track");
				Intent intent = new Intent(this, ReportSong.class);
				if(track == 1){
					intent.putExtra("report_sub", "Nuclear Family");
					startActivity(intent);
					}
				if(track == 2){
					intent.putExtra("report_sub", "Stay The Night");
					startActivity(intent);
					}
				if(track == 3){
					intent.putExtra("report_sub", "Carpe Diem");
					startActivity(intent);
					}
				if(track == 4){
					intent.putExtra("report_sub", "Let Yourself Go");
					startActivity(intent);
					}
				if(track == 5){
					intent.putExtra("report_sub", "Kill The DJ");
					startActivity(intent);
					}
				if(track == 6){
					intent.putExtra("report_sub", "Fell For You");
					startActivity(intent);
					}
				if(track == 7){
					intent.putExtra("report_sub", "Loss Of Control");
					startActivity(intent);
					}
				if(track == 8){
					intent.putExtra("report_sub", "Troublemaker");
					startActivity(intent);
					}
				if(track == 9){
					intent.putExtra("report_sub", "Angel Blue");
					startActivity(intent);
					}
				if(track == 10){
					intent.putExtra("report_sub", "Sweet 16");
					startActivity(intent);
					}
				if(track == 11){
					intent.putExtra("report_sub", "Rusty James");
					startActivity(intent);
					}
				if(track == 12){
					intent.putExtra("report_sub", "Oh Love");
					startActivity(intent);
					}
			}
			if(item.getItemId()==R.id.action_search)
			{
				// Search action | Add as new task
				Intent intent = new Intent(this, Allsongs.class);
				intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP); 
				intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
				intent.putExtra("Search", true);
				startActivity(intent);
				return true;
			}
			if(item.getItemId()==R.id.action_label)
			{
				int track = getIntent().getExtras().getInt("track");
				if(track == 1){
					Info.info1(this);
				}
				if(track == 2){
					Info.info2(this);
				}
				if(track == 3){
					Info.info3(this);
				}
				if(track == 4){
					Info.info4(this);
				}
				if(track == 5){
					Info.info5(this);
				}
				if(track == 6){
					Info.info6(this);
				}
				if(track == 7){
					Info.info7(this);
				}
				if(track == 8){
					Info.info8(this);
				}
				if(track == 9){
					Info.info9(this);
				}
				if(track == 10){
					Info.info10(this);
				}
				if(track == 11){
					Info.info11(this);
				}
				if(track == 12){
					Info.info12(this);
				}
			}
		            return super.onOptionsItemSelected(item);
		}
}