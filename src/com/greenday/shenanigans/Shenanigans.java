package com.greenday.shenanigans;

import com.fourmob.poppyview.PoppyViewHelper;
import com.fourmob.poppyview.PoppyViewHelper.PoppyViewPosition;
import com.greenday.lyrics.Allsongs;
import com.greenday.lyrics.ReportSong;
import com.greenday.lyrics.Settings;
import com.greenday.lyrics.Util;
import com.greenday.lyrics.R;
import com.greenday.shenanigans.Info;

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

public class Shenanigans extends Activity {
	
	private PoppyViewHelper mPoppyViewHelper;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		//Set theme must be used before super.oncreate or any other layout declaration
		Util.setAppTheme(this);
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.shenanigans);
		
		//Poppyview
		mPoppyViewHelper=new PoppyViewHelper(this, PoppyViewPosition.BOTTOM);
		View poppyview = mPoppyViewHelper.createPoppyViewOnScrollView(R.id.scrollView, R.layout.poppyview);
		
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
		ImageButton label=(ImageButton) poppyview.findViewById(R.id.imageButton3);
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