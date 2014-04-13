package com.greenday.insomniac;

import com.greenday.lyrics.Allsongs;
import com.greenday.lyrics.ReportSong;
import com.greenday.lyrics.Settings;
import com.greenday.lyrics.Util;
import com.greenday.lyrics.R;
import com.greenday.insomniac.Info;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class Insomniac extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		//Set theme must be used before super.oncreate or any other layout declaration
		Util.setAppTheme(this);
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.insomniac);
		TextView tv1 = (TextView)findViewById(R.id.textView1);
		int text = PreferenceManager.getDefaultSharedPreferences(this).getInt("text", 18);
		tv1.setTextSize(text);

		//Text theme
		int themetext = Integer.parseInt(PreferenceManager.getDefaultSharedPreferences(this).getString("themechooser", null));
		boolean themetextb = PreferenceManager.getDefaultSharedPreferences(this).getBoolean("themetext", true);
		if(themetextb){
			if(themetext==0){
				//Black
				tv1.setTextColor(Color.parseColor("#000000"));
			}
			else if(themetext==1){
				//Grey
				tv1.setTextColor(Color.parseColor("#A4A4A4"));
			}
			else if(themetext==2){
				//Lime
				tv1.setTextColor(Color.parseColor("#669002"));
			}
			else if(themetext==3){
				//Dark Sky
				tv1.setTextColor(Color.parseColor("#464ea3"));
			}
			else if(themetext==4){
				//Rose
				tv1.setTextColor(Color.parseColor("#cf2a9b"));
			}
			else if(themetext==5){
				//Mojo
				tv1.setTextColor(Color.parseColor("#c84741"));
			}
			else if(themetext==6){
				//Saffron
				tv1.setTextColor(Color.parseColor("#f48935"));
			}
			else if(themetext==7){
				//Frooti
				tv1.setTextColor(Color.parseColor("#E4A803"));
			}
			else if(themetext==8){
				//Lavender
				tv1.setTextColor(Color.parseColor("#92278f"));
			}
		}
		else{
			//Black
			tv1.setTextColor(Color.parseColor("#000000"));
		}
		
		int track = getIntent().getExtras().getInt("track");
		ActionBar ab=getActionBar();
		if(track == 1){
			ab.setTitle("Armatage Shanks");
			tv1.setText(R.string.armatage);
		}
		if(track == 2){
			ab.setTitle("Brat");
			tv1.setText(R.string.brat);
		}
		if(track == 3){
			ab.setTitle("Stuck With Me");
			tv1.setText(R.string.stuckwithme);
		}
		if(track == 4){
			ab.setTitle("Geek Stink Breath");
			tv1.setText(R.string.geekstink);
		}
		if(track == 5){
			ab.setTitle("No Pride");
			tv1.setText(R.string.nopride);
		}
		if(track == 6){
			ab.setTitle("Bab's Uvula Who!");
			tv1.setText(R.string.babuvula);
		}
		if(track == 7){
			ab.setTitle("86");
			tv1.setText(R.string.eightysix);
		}
		if(track == 8){
			ab.setTitle("Panic Song");
			tv1.setText(R.string.panicsong);
		}
		if(track == 9){
			ab.setTitle("Stuart And The Ave.");
			tv1.setText(R.string.stuartave);
		}
		if(track == 10){
			ab.setTitle("Brain Stew");
			tv1.setText(R.string.brainstew);
		}
		if(track == 11){
			ab.setTitle("Jaded");
			tv1.setText(R.string.jaded);
		}
		if(track == 12){
			ab.setTitle("Westbound Sign");
			tv1.setText(R.string.westbound);
		}
		if(track == 13){
			ab.setTitle("Tight Wad Hill");
			tv1.setText(R.string.tightwad);
		}
		if(track == 14){
			ab.setTitle("Walking Contradiction");
			tv1.setText(R.string.walking);
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
					intent.putExtra("report_sub", "Armatage Shanks");
					startActivity(intent);
					}
				if(track == 2){
					intent.putExtra("report_sub", "Brat");
					startActivity(intent);
					}
				if(track == 3){
					intent.putExtra("report_sub", "Stuck With Me");
					startActivity(intent);
					}
				if(track == 4){
					intent.putExtra("report_sub", "Geek Stink Breath");
					startActivity(intent);
					}
				if(track == 5){
					intent.putExtra("report_sub", "No Pride");
					startActivity(intent);
					}
				if(track == 6){
					intent.putExtra("report_sub", "Bab's Uvula Who!");
					startActivity(intent);
					}
				if(track == 7){
					intent.putExtra("report_sub", "86");
					startActivity(intent);
					}
				if(track == 8){
					intent.putExtra("report_sub", "Panic Song");
					startActivity(intent);
					}
				if(track == 9){
					intent.putExtra("report_sub", "Stuart And The Ave.");
					startActivity(intent);
					}
				if(track == 10){
					intent.putExtra("report_sub", "Brain Stew");
					startActivity(intent);
					}
				if(track == 11){
					intent.putExtra("report_sub", "Jaded");
					startActivity(intent);
					}
				if(track == 12){
					intent.putExtra("report_sub", "Westbound Sign");
					startActivity(intent);
					}
				if(track == 13){
					intent.putExtra("report_sub", "Tight Wad Hill");
					startActivity(intent);
					}
				if(track == 14){
					intent.putExtra("report_sub", "Walking Contradiction");
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
				if(track == 13){
					Info.info13(this);
				}
				if(track == 14){
					Info.info14(this);
				}
			}
		            return super.onOptionsItemSelected(item);
		}
}