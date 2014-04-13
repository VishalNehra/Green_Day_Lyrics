package com.greenday.dookie;

import com.greenday.lyrics.Allsongs;
import com.greenday.lyrics.ReportSong;
import com.greenday.lyrics.Settings;
import com.greenday.lyrics.Util;
import com.greenday.lyrics.R;
import com.greenday.dookie.Info;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class Dookie extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		//Set theme must be used before super.oncreate or any other layout declaration
		Util.setAppTheme(this);
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.dookie);
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
			ab.setTitle("All By Myself");
			tv1.setText(R.string.allbymyself);
		}
		if(track == 2){
			ab.setTitle("Burnout");
			tv1.setText(R.string.burnout);
		}
		if(track == 3){
			ab.setTitle("Having A Blast");
			tv1.setText(R.string.havingblast);
		}
		if(track == 4){
			ab.setTitle("Chump");
			tv1.setText(R.string.chump);
		}
		if(track == 5){
			ab.setTitle("Longview");
			tv1.setText(R.string.longview);
		}
		if(track == 6){
			ab.setTitle("Welcome To Paradise");
			tv1.setText(R.string.welcometoparadise);
		}
		if(track == 7){
			ab.setTitle("Pulling Teeth");
			tv1.setText(R.string.pullingteeth);
		}
		if(track == 8){
			ab.setTitle("Basket Case");
			tv1.setText(R.string.basketcase);
		}
		if(track == 9){
			ab.setTitle("She");
			tv1.setText(R.string.she);
		}
		if(track == 10){
			ab.setTitle("Sassafras Roots");
			tv1.setText(R.string.sassafrasroots);
		}
		if(track == 11){
			ab.setTitle("When I Come Around");
			tv1.setText(R.string.whencomearound);
		}
		if(track == 12){
			ab.setTitle("Coming Clean");
			tv1.setText(R.string.comingclean);
		}
		if(track == 13){
			ab.setTitle("Emenius Sleepus");
			tv1.setText(R.string.emeniussleepus);
		}
		if(track == 14){
			ab.setTitle("In The End");
			tv1.setText(R.string.intheend);
		}
		if(track == 15){
			ab.setTitle("F.O.D.");
			tv1.setText(R.string.fod);
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
					intent.putExtra("report_sub", "All By Myself");
					startActivity(intent);
					}
				if(track == 2){
					intent.putExtra("report_sub", "Burnout");
					startActivity(intent);
					}
				if(track == 3){
					intent.putExtra("report_sub", "Having A Blast");
					startActivity(intent);
					}
				if(track == 4){
					intent.putExtra("report_sub", "Chump");
					startActivity(intent);
					}
				if(track == 5){
					intent.putExtra("report_sub", "Longview");
					startActivity(intent);
					}
				if(track == 6){
					intent.putExtra("report_sub", "Welcome To Paradise");
					startActivity(intent);
					}
				if(track == 7){
					intent.putExtra("report_sub", "Pulling Teeth");
					startActivity(intent);
					}
				if(track == 8){
					intent.putExtra("report_sub", "Basket Case");
					startActivity(intent);
					}
				if(track == 9){
					intent.putExtra("report_sub", "She");
					startActivity(intent);
					}
				if(track == 10){
					intent.putExtra("report_sub", "Sassafras Roots");
					startActivity(intent);
					}
				if(track == 11){
					intent.putExtra("report_sub", "When I Come Around");
					startActivity(intent);
					}
				if(track == 12){
					intent.putExtra("report_sub", "Coming Clean");
					startActivity(intent);
					}
				if(track == 13){
					intent.putExtra("report_sub", "Emenius Sleepus");
					startActivity(intent);
					}

				if(track == 14){
					intent.putExtra("report_sub", "In The End");
					startActivity(intent);
					}

				if(track == 15){
					intent.putExtra("report_sub", "F.O.D.");
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
			}
		            return super.onOptionsItemSelected(item);
		}
}
