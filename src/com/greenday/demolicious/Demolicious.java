package com.greenday.demolicious;

import com.greenday.lyrics.Allsongs;
import com.greenday.lyrics.ReportSong;
import com.greenday.lyrics.Settings;
import com.greenday.lyrics.Util;
import com.greenday.lyrics.R;
import com.greenday.demolicious.Info;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class Demolicious extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		//Set theme must be used before super.oncreate or any other layout declaration
		Util.setAppTheme(this);
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.demolicious);
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
			ab.setTitle("99 Revolutions (Demo)");
			tv1.setText(R.string.ninetyrevdemo);
		}
		if(track == 2){
			ab.setTitle("Angel Blue (Demo)");
			tv1.setText(R.string.angelbluedemo);
		}
		if(track == 3){
			ab.setTitle("Carpe Diem (Demo)");
			tv1.setText(R.string.carpediemdemo);
		}
		if(track == 4){
			ab.setTitle("State Of Shock");
			tv1.setText(R.string.stateofshock);
		}
		if(track == 5){
			ab.setTitle("Let Yourself Go (Demo)");
			tv1.setText(R.string.letgodemo);
		}
		if(track == 6){
			ab.setTitle("Sex, Drugs And Violence (Demo)");
			tv1.setText(R.string.sexviolencedemo);
		}
		if(track == 7){
			ab.setTitle("Ashley (Demo)");
			tv1.setText(R.string.ashleydemo);
		}
		if(track == 8){
			ab.setTitle("Fell For You (Demo)");
			tv1.setText(R.string.fellforyoudemo);
		}
		if(track == 9){
			ab.setTitle("Stay The Night (Demo)");
			tv1.setText(R.string.staynightdemo);
		}
		if(track == 10){
			ab.setTitle("Nuclear Family (Demo)");
			tv1.setText(R.string.nucleardemo);
		}
		if(track == 11){
			ab.setTitle("Stray Heart (Demo)");
			tv1.setText(R.string.strayheartdemo);
		}
		if(track == 12){
			ab.setTitle("Rusty James (Demo)");
			tv1.setText(R.string.rustyjamesdemo);
		}
		if(track == 13){
			ab.setTitle("A Little Boy Named Train (Demo)");
			tv1.setText(R.string.littleboydemo);
		}
		if(track == 14){
			ab.setTitle("Baby Eyes (Demo)");
			tv1.setText(R.string.babyeyesdemo);
		}
		if(track == 15){
			ab.setTitle("Makeout Party (Demo)");
			tv1.setText(R.string.makeoutdemo);
		}
		if(track == 16){
			ab.setTitle("Oh Love (Demo)");
			tv1.setText(R.string.ohlovedemo);
		}
		if(track == 17){
			ab.setTitle("Missing You (Demo)");
			tv1.setText(R.string.missingyoudemo);
		}
		if(track == 18){
			ab.setTitle("Stay The Night (Acoustic)");
			tv1.setText(R.string.staynightacoustic);
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