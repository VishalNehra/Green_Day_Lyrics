package com.greenday.kerplunk;

import com.fourmob.poppyview.PoppyViewHelper;
import com.fourmob.poppyview.PoppyViewHelper.PoppyViewPosition;
import com.greenday.lyrics.Allsongs;
import com.greenday.lyrics.ReportSong;
import com.greenday.lyrics.Settings;
import com.greenday.lyrics.R;
import com.greenday.kerplunk.Info;

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

public class Kerplunk extends Activity {
	
	private PoppyViewHelper mPoppyViewHelper;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.kerplunk);
		
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
		int text_def_color= Color.parseColor("#222222");
        int text_color=PreferenceManager.getDefaultSharedPreferences(this).getInt("text_theme", text_def_color);
        tv1.setTextColor(text_color);
		
		//Poppyview
		mPoppyViewHelper=new PoppyViewHelper(this, PoppyViewPosition.BOTTOM);
		View poppyview = mPoppyViewHelper.createPoppyViewOnScrollView(R.id.scrollView, R.layout.poppyview);
		int poppy_def_color=Color.parseColor("#222222");
		int poppy_color=PreferenceManager.getDefaultSharedPreferences(this).getInt("poppy_theme", poppy_def_color);
		poppyview.setBackgroundColor(poppy_color);
		
		ImageButton search = (ImageButton) poppyview.findViewById(R.id.imageButton1);
		search.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				// Search action | Add as new task
				Intent intent = new Intent(Kerplunk.this, Allsongs.class);
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
				Intent intent = new Intent(Kerplunk.this, ReportSong.class);
				if(track == 1){
					intent.putExtra("report_sub", "2000 Light Years Away");
					startActivity(intent);
					}
				if(track == 2){
					intent.putExtra("report_sub", "One For The Razorbacks");
					startActivity(intent);
					}
				if(track == 3){
					intent.putExtra("report_sub", "Welcome To Paradise");
					startActivity(intent);
					}
				if(track == 4){
					intent.putExtra("report_sub", "Christie Road");
					startActivity(intent);
					}
				if(track == 5){
					intent.putExtra("report_sub", "Private Ale");
					startActivity(intent);
					}
				if(track == 6){
					intent.putExtra("report_sub", "Dominated Love Slave");
					startActivity(intent);
					}
				if(track == 7){
					intent.putExtra("report_sub", "One Of My Lies");
					startActivity(intent);
					}
				if(track == 8){
					intent.putExtra("report_sub", "80");
					startActivity(intent);
					}
				if(track == 9){
					intent.putExtra("report_sub", "Android");
					startActivity(intent);
					}
				if(track == 10){
					intent.putExtra("report_sub", "No One Knows");
					startActivity(intent);
					}
				if(track == 11){
					intent.putExtra("report_sub", "Who Wrote Holden Caulfield?");
					startActivity(intent);
					}
				if(track == 12){
					intent.putExtra("report_sub", "Words I Might Have Ate");
					startActivity(intent);
					}
				if(track == 13){
					intent.putExtra("report_sub", "Sweet Children");
					startActivity(intent);
					}
				if(track == 14){
					intent.putExtra("report_sub", "Best Thing In Town");
					startActivity(intent);
					}
				if(track == 15){
					intent.putExtra("report_sub", "Strangeland");
					startActivity(intent);
					}
				if(track == 16){
					intent.putExtra("report_sub", "My Generation");
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
					Info.info1(Kerplunk.this);
				}
				if(track == 2){
					Info.info2(Kerplunk.this);
				}
				if(track == 3){
					Info.info3(Kerplunk.this);
				}
				if(track == 4){
					Info.info4(Kerplunk.this);
				}
				if(track == 5){
					Info.info5(Kerplunk.this);
				}
				if(track == 6){
					Info.info6(Kerplunk.this);
				}
				if(track == 7){
					Info.info7(Kerplunk.this);
				}
				if(track == 8){
					Info.info8(Kerplunk.this);
				}
				if(track == 9){
					Info.info9(Kerplunk.this);
				}
				if(track == 10){
					Info.info10(Kerplunk.this);
				}
				if(track == 11){
					Info.info11(Kerplunk.this);
				}
				if(track == 12){
					Info.info12(Kerplunk.this);
				}
				if(track == 13){
					Info.info13(Kerplunk.this);
				}
				if(track == 14){
					Info.info14(Kerplunk.this);
				}
				if(track == 15){
					Info.info15(Kerplunk.this);
				}
				if(track == 16){
					Info.info16(Kerplunk.this);
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
			ab.setTitle("2000 Light Years Away");
			tv1.setText(R.string.lightyears);
		}
		if(track == 2){
			ab.setTitle("One For The Razorbacks");
			tv1.setText(R.string.razorbacks);
		}
		if(track == 3){
			ab.setTitle("Welcome To Paradise");
			tv1.setText(R.string.welcometoparadise);
		}
		if(track == 4){
			ab.setTitle("Christie Road");
			tv1.setText(R.string.christieroad);
		}
		if(track == 5){
			ab.setTitle("Private Ale");
			tv1.setText(R.string.privateale);
		}
		if(track == 6){
			ab.setTitle("Dominated Love Slave");
			tv1.setText(R.string.dominatedloveslave);
		}
		if(track == 7){
			ab.setTitle("One Of My Lies");
			tv1.setText(R.string.oneoflies);
		}
		if(track == 8){
			ab.setTitle("80");
			tv1.setText(R.string.eighty);
		}
		if(track == 9){
			ab.setTitle("Android");
			tv1.setText(R.string.android);
		}
		if(track == 10){
			ab.setTitle("No One Knows");
			tv1.setText(R.string.nooneknows);
		}
		if(track == 11){
			ab.setTitle("Who Wrote Holden Caulfield?");
			tv1.setText(R.string.whowrote);
		}
		if(track == 12){
			ab.setTitle("Words I Might Have Ate");
			tv1.setText(R.string.wordsmightate);
		}
		if(track == 13){
			ab.setTitle("Sweet Children");
			tv1.setText(R.string.sweetchildren);
		}
		if(track == 14){
			ab.setTitle("Best Thing In Town");
			tv1.setText(R.string.bestthing);
		}
		if(track == 15){
			ab.setTitle("Strangeland");
			tv1.setText(R.string.strangeland);
		}
		if(track == 16){
			ab.setTitle("My Generation");
			tv1.setText(R.string.mygeneration);
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