package com.greenday.dos;

import com.fourmob.poppyview.PoppyViewHelper;
import com.fourmob.poppyview.PoppyViewHelper.PoppyViewPosition;
import com.greenday.lyrics.Allsongs;
import com.greenday.lyrics.ReportSong;
import com.greenday.lyrics.Settings;
import com.greenday.lyrics.R;
import com.greenday.dos.Info;

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

public class Dos extends Activity {
	
	private PoppyViewHelper mPoppyViewHelper;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.dos);
		
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
				Intent intent = new Intent(Dos.this, Allsongs.class);
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
				Intent intent = new Intent(Dos.this, ReportSong.class);
				if(track == 1){
					intent.putExtra("report_sub", "See You Tonight");
					startActivity(intent);
					}
				if(track == 2){
					intent.putExtra("report_sub", "Fuck Time");
					startActivity(intent);
					}
				if(track == 3){
					intent.putExtra("report_sub", "Stop When Red Lights Flash");
					startActivity(intent);
					}
				if(track == 4){
					intent.putExtra("report_sub", "Lazy Bones");
					startActivity(intent);
					}
				if(track == 5){
					intent.putExtra("report_sub", "Wild One");
					startActivity(intent);
					}
				if(track == 6){
					intent.putExtra("report_sub", "Makeout Party");
					startActivity(intent);
					}
				if(track == 7){
					intent.putExtra("report_sub", "Stray Heart");
					startActivity(intent);
					}
				if(track == 8){
					intent.putExtra("report_sub", "Ashley");
					startActivity(intent);
					}
				if(track == 9){
					intent.putExtra("report_sub", "Baby Eyes");
					startActivity(intent);
					}
				if(track == 10){
					intent.putExtra("report_sub", "Lady Cobra");
					startActivity(intent);
					}
				if(track == 11){
					intent.putExtra("report_sub", "Nightlife");
					startActivity(intent);
					}
				if(track == 12){
					intent.putExtra("report_sub", "Wow! That's Loud");
					startActivity(intent);
					}
				if(track == 13){
					intent.putExtra("report_sub", "Amy");
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
					Info.info1(Dos.this);
				}
				if(track == 2){
					Info.info2(Dos.this);
				}
				if(track == 3){
					Info.info3(Dos.this);
				}
				if(track == 4){
					Info.info4(Dos.this);
				}
				if(track == 5){
					Info.info5(Dos.this);
				}
				if(track == 6){
					Info.info6(Dos.this);
				}
				if(track == 7){
					Info.info7(Dos.this);
				}
				if(track == 8){
					Info.info8(Dos.this);
				}
				if(track == 9){
					Info.info9(Dos.this);
				}
				if(track == 10){
					Info.info10(Dos.this);
				}
				if(track == 11){
					Info.info11(Dos.this);
				}
				if(track == 12){
					Info.info12(Dos.this);
				}
				if(track == 13){
					Info.info13(Dos.this);
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
			ab.setTitle("See You Tonight");
			tv1.setText(R.string.cutonight);
		}
		if(track == 2){
			ab.setTitle("Fuck Time");
			tv1.setText(R.string.fucktime);
		}
		if(track == 3){
			ab.setTitle("Stop When Red Lights Flash");
			tv1.setText(R.string.stopwhenflash);
		}
		if(track == 4){
			ab.setTitle("Lazy Bones");
			tv1.setText(R.string.lazybones);
		}
		if(track == 5){
			ab.setTitle("Wild One");
			tv1.setText(R.string.wildone);
		}
		if(track == 6){
			ab.setTitle("Makeout Party");
			tv1.setText(R.string.makeoutparty);
		}
		if(track == 7){
			ab.setTitle("Stray Heart");
			tv1.setText(R.string.strayheart);
		}
		if(track == 8){
			ab.setTitle("Ashley");
			tv1.setText(R.string.ashley);
		}
		if(track == 9){
			ab.setTitle("Baby Eyes");
			tv1.setText(R.string.babyeyes);
		}
		if(track == 10){
			ab.setTitle("Lady Cobra");
			tv1.setText(R.string.ladycobra);
		}
		if(track == 11){
			ab.setTitle("Nightlife");
			tv1.setText(R.string.nightlife);
		}
		if(track == 12){
			ab.setTitle("Wow! That's Loud");
			tv1.setText(R.string.wowthatsloud);
		}
		if(track == 13){
			ab.setTitle("Amy");
			tv1.setText(R.string.amy);
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