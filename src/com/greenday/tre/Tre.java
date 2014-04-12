package com.greenday.tre;

import com.greenday.lyrics.Allsongs;
import com.greenday.lyrics.ReportSong;
import com.greenday.lyrics.Settings;
import com.greenday.lyrics.Util;
import com.greenday.lyrics.R;
import com.greenday.tre.Info;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class Tre extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		//Setting theme
		Util.setAppTheme(this);
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.tre);
		TextView tv1 = (TextView)findViewById(R.id.textView1);
		int text = PreferenceManager.getDefaultSharedPreferences(this).getInt("text", 18);
		tv1.setTextSize(text);
		
		int track = getIntent().getExtras().getInt("track");
		ActionBar ab=getActionBar();
		if(track == 1){
			ab.setTitle("Brutal Love");
			tv1.setText(R.string.brutallove);
		}
		if(track == 2){
			ab.setTitle("Missing You");
			tv1.setText(R.string.missingyou);
		}
		if(track == 3){
			ab.setTitle("8th Avenue Serenade");
			tv1.setText(R.string.avesrnde);
		}
		if(track == 4){
			ab.setTitle("Drama Queen");
			tv1.setText(R.string.dramaqueen);
		}
		if(track == 5){
			ab.setTitle("X-Kid");
			tv1.setText(R.string.kid);
		}
		if(track == 6){
			ab.setTitle("Sex, Drugs & Violence");
			tv1.setText(R.string.sexdrugs);
		}
		if(track == 7){
			ab.setTitle("Little Boy Named Train");
			tv1.setText(R.string.littleboytrain);
		}
		if(track == 8){
			ab.setTitle("Amanda");
			tv1.setText(R.string.amanda);
		}
		if(track == 9){
			ab.setTitle("Walk Away");
			tv1.setText(R.string.walkaway);
		}
		if(track == 10){
			ab.setTitle("Dirty Rotten Bastards");
			tv1.setText(R.string.dirtybastards);
		}
		if(track == 11){
			ab.setTitle("99 Revolutions");
			tv1.setText(R.string.ninetyninerev);
		}
		if(track == 12){
			ab.setTitle("The Forgotten");
			tv1.setText(R.string.theforgotten);
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
