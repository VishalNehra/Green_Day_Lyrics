package com.greenday.uno;

import com.fourmob.poppyview.PoppyViewHelper;
import com.fourmob.poppyview.PoppyViewHelper.PoppyViewPosition;
import com.greenday.lyrics.Allsongs;
import com.greenday.lyrics.ReportSong;
import com.greenday.lyrics.Settings;
import com.greenday.lyrics.Util;
import com.greenday.lyrics.R;
import com.greenday.uno.Info;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.TextView;

public class Uno extends Activity {
	
	private PoppyViewHelper mPoppyViewHelper;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		//Declare theme before super.oncreate or setcontentview
		Util.setAppTheme(this);
		
		setContentView(R.layout.uno);
		super.onCreate(savedInstanceState);
		
		//Poppyview
		mPoppyViewHelper=new PoppyViewHelper(this, PoppyViewPosition.BOTTOM);
		View poppyview = mPoppyViewHelper.createPoppyViewOnScrollView(R.id.scrollView, R.layout.poppyview);
		
		ImageButton search = (ImageButton) poppyview.findViewById(R.id.imageButton1);
		search.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				// Search action | Add as new task
				Intent intent = new Intent(Uno.this, Allsongs.class);
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
				Intent intent = new Intent(Uno.this, ReportSong.class);
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
		});
		ImageButton label=(ImageButton) poppyview.findViewById(R.id.imageButton3);
		label.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				int track = getIntent().getExtras().getInt("track");
				if(track == 1){
					Info.info1(Uno.this);
				}
				if(track == 2){
					Info.info2(Uno.this);
				}
				if(track == 3){
					Info.info3(Uno.this);
				}
				if(track == 4){
					Info.info4(Uno.this);
				}
				if(track == 5){
					Info.info5(Uno.this);
				}
				if(track == 6){
					Info.info6(Uno.this);
				}
				if(track == 7){
					Info.info7(Uno.this);
				}
				if(track == 8){
					Info.info8(Uno.this);
				}
				if(track == 9){
					Info.info9(Uno.this);
				}
				if(track == 10){
					Info.info10(Uno.this);
				}
				if(track == 11){
					Info.info11(Uno.this);
				}
				if(track == 12){
					Info.info12(Uno.this);
				}
			}
		});
		ImageButton settings=(ImageButton) poppyview.findViewById(R.id.imageButton4);
		settings.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent(getApplicationContext(), Settings.class));
			}
		});
		//Poppyview
		
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
}