package com.greenday.tre;

import com.fourmob.poppyview.PoppyViewHelper;
import com.fourmob.poppyview.PoppyViewHelper.PoppyViewPosition;
import com.greenday.lyrics.Allsongs;
import com.greenday.lyrics.ReportSong;
import com.greenday.lyrics.Settings;
import com.greenday.lyrics.R;
import com.greenday.tre.Info;

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

public class Tre extends Activity {
	
	private PoppyViewHelper mPoppyViewHelper;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tre);
		
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
				Intent intent = new Intent(Tre.this, Allsongs.class);
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
				Intent intent = new Intent(Tre.this, ReportSong.class);
				if(track == 1){
					intent.putExtra("report_sub", "Brutal Love");
					startActivity(intent);
					}
				if(track == 2){
					intent.putExtra("report_sub", "Missing You");
					startActivity(intent);
					}
				if(track == 3){
					intent.putExtra("report_sub", "8th Avenue Serenade");
					startActivity(intent);
					}
				if(track == 4){
					intent.putExtra("report_sub", "Drama Queen");
					startActivity(intent);
					}
				if(track == 5){
					intent.putExtra("report_sub", "X-Kid");
					startActivity(intent);
					}
				if(track == 6){
					intent.putExtra("report_sub", "Sex, Drugs & Violence");
					startActivity(intent);
					}
				if(track == 7){
					intent.putExtra("report_sub", "Little Boy Named Train");
					startActivity(intent);
					}
				if(track == 8){
					intent.putExtra("report_sub", "Amanda");
					startActivity(intent);
					}
				if(track == 9){
					intent.putExtra("report_sub", "Walk Away");
					startActivity(intent);
					}
				if(track == 10){
					intent.putExtra("report_sub", "Dirty Rotten Bastards");
					startActivity(intent);
					}
				if(track == 11){
					intent.putExtra("report_sub", "99 Revolutions");
					startActivity(intent);
					}
				if(track == 12){
					intent.putExtra("report_sub", "The Forgotten");
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
					Info.info1(Tre.this);
				}
				if(track == 2){
					Info.info2(Tre.this);
				}
				if(track == 3){
					Info.info3(Tre.this);
				}
				if(track == 4){
					Info.info4(Tre.this);
				}
				if(track == 5){
					Info.info5(Tre.this);
				}
				if(track == 6){
					Info.info6(Tre.this);
				}
				if(track == 7){
					Info.info7(Tre.this);
				}
				if(track == 8){
					Info.info8(Tre.this);
				}
				if(track == 9){
					Info.info9(Tre.this);
				}
				if(track == 10){
					Info.info10(Tre.this);
				}
				if(track == 11){
					Info.info11(Tre.this);
				}
				if(track == 12){
					Info.info12(Tre.this);
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
			ab.setTitle("Brutal Love");
			tv1.setText(R.string.brutallove);
		}
		if(track == 2){
			ab.setTitle("Missing You");
			tv1.setText(R.string.missingyou);
		}
		if(track == 3){
			ab.setTitle("8th Avenue Serenade");
			tv1.setText(R.string.avesrnde);
		}
		if(track == 4){
			ab.setTitle("Drama Queen");
			tv1.setText(R.string.dramaqueen);
		}
		if(track == 5){
			ab.setTitle("X-Kid");
			tv1.setText(R.string.kid);
		}
		if(track == 6){
			ab.setTitle("Sex, Drugs & Violence");
			tv1.setText(R.string.sexdrugs);
		}
		if(track == 7){
			ab.setTitle("Little Boy Named Train");
			tv1.setText(R.string.littleboytrain);
		}
		if(track == 8){
			ab.setTitle("Amanda");
			tv1.setText(R.string.amanda);
		}
		if(track == 9){
			ab.setTitle("Walk Away");
			tv1.setText(R.string.walkaway);
		}
		if(track == 10){
			ab.setTitle("Dirty Rotten Bastards");
			tv1.setText(R.string.dirtybastards);
		}
		if(track == 11){
			ab.setTitle("99 Revolutions");
			tv1.setText(R.string.ninetyninerev);
		}
		if(track == 12){
			ab.setTitle("The Forgotten");
			tv1.setText(R.string.theforgotten);
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