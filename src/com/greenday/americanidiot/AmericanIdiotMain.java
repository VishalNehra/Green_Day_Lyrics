package com.greenday.americanidiot;

import com.greenday.lyrics.Allsongs;
import com.greenday.lyrics.ReportSong;
import com.greenday.lyrics.Settings;
import com.greenday.lyrics.Util;
import com.greenday.lyrics.R;
import com.greenday.americanidiot.Info;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class AmericanIdiotMain extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		//Set theme must be used before super.oncreate or any other layout declaration
		Util.setAppTheme(this);
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.americanidiot);
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
			ab.setTitle("American Idiot");
			tv1.setText(R.string.americanidiot);
		}
		if(track == 2){
			ab.setTitle("Jesus Of Suburbia");
			tv1.setText(R.string.jos);
		}
		if(track == 3){
			ab.setTitle("Holiday");
			tv1.setText(R.string.holiday);
		}
		if(track == 4){
			ab.setTitle("Boulevard of Broken Dreams");
			tv1.setText(R.string.boulevards);
		}
		if(track == 5){
			ab.setTitle("Are We The Waiting");
			tv1.setText(R.string.arewethewaiting);
		}
		if(track == 6){
			ab.setTitle("St. Jimmy");
			tv1.setText(R.string.stjimmy);
		}
		if(track == 7){
			ab.setTitle("Give Me Novacaine");
			tv1.setText(R.string.givemenov);
		}
		if(track == 8){
			ab.setTitle("She's A Rebel");
			tv1.setText(R.string.shesarebel);
		}
		if(track == 9){
			ab.setTitle("Extraordinary Girl");
			tv1.setText(R.string.extordgirl);
		}
		if(track == 10){
			ab.setTitle("Letterbomb");
			tv1.setText(R.string.letterbomb);
		}
		if(track == 11){
			ab.setTitle("Wake Me Up When September Ends");
			tv1.setText(R.string.wakemeup);
		}
		if(track == 12){
			ab.setTitle("Homecoming");
			tv1.setText(R.string.homecoming);
		}
		if(track == 13){
			ab.setTitle("Whatshername");
			tv1.setText(R.string.whatshername);
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
			}
		            return super.onOptionsItemSelected(item);
		}
}