package com.greenday.dookie;

import com.fourmob.poppyview.PoppyViewHelper;
import com.fourmob.poppyview.PoppyViewHelper.PoppyViewPosition;
import com.greenday.lyrics.Allsongs;
import com.greenday.lyrics.ReportSong;
import com.greenday.lyrics.Settings;
import com.greenday.lyrics.R;
import com.greenday.dookie.Info;

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

public class Dookie extends Activity {
	
	private PoppyViewHelper mPoppyViewHelper;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.dookie);
		
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
				Intent intent = new Intent(Dookie.this, Allsongs.class);
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
				Intent intent = new Intent(Dookie.this, ReportSong.class);
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
		});
		ImageButton label=(ImageButton) poppyview.findViewById(R.id.imageButton3);
		label.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				int track = getIntent().getExtras().getInt("track");
				if(track == 1){
					Info.info1(Dookie.this);
				}
				if(track == 2){
					Info.info2(Dookie.this);
				}
				if(track == 3){
					Info.info3(Dookie.this);
				}
				if(track == 4){
					Info.info4(Dookie.this);
				}
				if(track == 5){
					Info.info5(Dookie.this);
				}
				if(track == 6){
					Info.info6(Dookie.this);
				}
				if(track == 7){
					Info.info7(Dookie.this);
				}
				if(track == 8){
					Info.info8(Dookie.this);
				}
				if(track == 9){
					Info.info9(Dookie.this);
				}
				if(track == 10){
					Info.info10(Dookie.this);
				}
				if(track == 11){
					Info.info11(Dookie.this);
				}
				if(track == 12){
					Info.info12(Dookie.this);
				}
				if(track == 13){
					Info.info13(Dookie.this);
				}
				if(track == 14){
					Info.info14(Dookie.this);
				}
				if(track == 15){
					Info.info15(Dookie.this);
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