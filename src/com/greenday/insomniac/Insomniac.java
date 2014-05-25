package com.greenday.insomniac;

import com.fourmob.poppyview.PoppyViewHelper;
import com.fourmob.poppyview.PoppyViewHelper.PoppyViewPosition;
import com.greenday.lyrics.Allsongs;
import com.greenday.lyrics.ReportSong;
import com.greenday.lyrics.Settings;
import com.greenday.lyrics.R;
import com.greenday.insomniac.Info;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.TextView;

public class Insomniac extends Activity {
	
	private PoppyViewHelper mPoppyViewHelper;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.insomniac);
		
		//Action bar color
        int ab_def_color= Color.parseColor("#222222");
        int ab_color=PreferenceManager.getDefaultSharedPreferences(this).getInt("ab_theme", ab_def_color);
        ActionBar ab =getActionBar();
        ab.setBackgroundDrawable(new ColorDrawable(ab_color));
        
        //Text Size
		TextView tv1 = (TextView)findViewById(R.id.textView1);
		int text_size = PreferenceManager.getDefaultSharedPreferences(this).getInt("text", 18);
		tv1.setTextSize(text_size);
		
		//Text Color
		int text_def_color= Color.parseColor("#000000");
        int text_color=PreferenceManager.getDefaultSharedPreferences(this).getInt("text_theme", text_def_color);
        tv1.setTextColor(text_color);
        
        //Background transparency
        int def_alpha = 150;
        int alpha = PreferenceManager.getDefaultSharedPreferences(this).getInt("alpha", def_alpha);
        findViewById(R.id.insomniac_layout).getBackground().setAlpha(alpha);
		
		//Poppyview
		mPoppyViewHelper=new PoppyViewHelper(this, PoppyViewPosition.BOTTOM);
		View poppyview = mPoppyViewHelper.createPoppyViewOnScrollView(R.id.scrollView, R.layout.poppyview);
		int poppy_def_color=Color.parseColor("#40222222");
		int poppy_color=PreferenceManager.getDefaultSharedPreferences(this).getInt("poppy_theme", poppy_def_color);
		poppyview.setBackgroundColor(poppy_color);
		
		ImageButton search = (ImageButton) poppyview.findViewById(R.id.imageButton1);
		search.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				// Search action | Add as new task
				Intent intent = new Intent(Insomniac.this, Allsongs.class);
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
				Intent intent = new Intent(Insomniac.this, ReportSong.class);
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
		});
		ImageButton label=(ImageButton) poppyview.findViewById(R.id.imageButton3);
		label.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				int track = getIntent().getExtras().getInt("track");
				if(track == 1){
					Info.info1(Insomniac.this);
				}
				if(track == 2){
					Info.info2(Insomniac.this);
				}
				if(track == 3){
					Info.info3(Insomniac.this);
				}
				if(track == 4){
					Info.info4(Insomniac.this);
				}
				if(track == 5){
					Info.info5(Insomniac.this);
				}
				if(track == 6){
					Info.info6(Insomniac.this);
				}
				if(track == 7){
					Info.info7(Insomniac.this);
				}
				if(track == 8){
					Info.info8(Insomniac.this);
				}
				if(track == 9){
					Info.info9(Insomniac.this);
				}
				if(track == 10){
					Info.info10(Insomniac.this);
				}
				if(track == 11){
					Info.info11(Insomniac.this);
				}
				if(track == 12){
					Info.info12(Insomniac.this);
				}
				if(track == 13){
					Info.info13(Insomniac.this);
				}
				if(track == 14){
					Info.info14(Insomniac.this);
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
		
		//Lyrics
		int track = getIntent().getExtras().getInt("track");
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