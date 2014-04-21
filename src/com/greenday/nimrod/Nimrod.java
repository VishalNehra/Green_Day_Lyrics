package com.greenday.nimrod;

import com.greenday.lyrics.Allsongs;
import com.greenday.lyrics.ReportSong;
import com.greenday.lyrics.Settings;
import com.greenday.lyrics.Util;
import com.greenday.lyrics.R;
import com.greenday.nimrod.Info;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class Nimrod extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		//Set theme must be used before super.oncreate or any other layout declaration
		Util.setAppTheme(this);
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.nimrod);
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
				tv1.setTextColor(Color.parseColor("#424242"));
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
				if(track == 15){
					Info.info15(this);
				}
				if(track == 16){
					Info.info16(this);
				}
				if(track == 17){
					Info.info17(this);
				}
				if(track == 18){
					Info.info18(this);
				}
			}
		            return super.onOptionsItemSelected(item);
		}
}