package com.greenday.warning;

import com.greenday.lyrics.Allsongs;
import com.greenday.lyrics.ReportSong;
import com.greenday.lyrics.Settings;
import com.greenday.lyrics.Util;
import com.greenday.lyrics.R;
import com.greenday.warning.Info;

import de.keyboardsurfer.android.widget.crouton.Crouton;
import de.keyboardsurfer.android.widget.crouton.Style;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class WarningMain extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		//Set theme must be used before super.oncreate or any other layout declaration
		Util.setAppTheme(this);
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.warning);
		TextView tv1 = (TextView)findViewById(R.id.textView1);
		int track = getIntent().getExtras().getInt("track");
		ActionBar ab=getActionBar();
		
		if(track == 1){
			ab.setTitle("Warning");
			tv1.setText(R.string.warning);
		}
		if(track == 2){
			ab.setTitle("Blood, Sex and Booze");
			tv1.setText(R.string.bloodsex);
		}
		if(track == 3){
			ab.setTitle("Church On Sunday");
			tv1.setText(R.string.church);
		}
		if(track == 4){
			ab.setTitle("Fashion Victim");
			tv1.setText(R.string.fashion);
		}
		if(track == 5){
			ab.setTitle("Castaway");
			tv1.setText(R.string.castaway);
		}
		if(track == 6){
			ab.setTitle("Misery");
			tv1.setText(R.string.misery);
		}
		if(track == 7){
			ab.setTitle("Deadbeat Holiday");
			tv1.setText(R.string.deadbeat);
		}
		if(track == 8){
			ab.setTitle("Hold On");
			tv1.setText(R.string.holdon);
		}
		if(track == 9){
			ab.setTitle("Jackass");
			tv1.setText(R.string.jackass);
		}
		if(track == 10){
			ab.setTitle("Waiting");
			tv1.setText(R.string.waiting);
		}
		if(track == 11){
			ab.setTitle("Minority");
			tv1.setText(R.string.minority);
		}
		if(track == 12){
			ab.setTitle("Macy's Day Parade");
			tv1.setText(R.string.macy);
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
