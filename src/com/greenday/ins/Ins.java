package com.greenday.ins;

import com.fourmob.poppyview.PoppyViewHelper;
import com.fourmob.poppyview.PoppyViewHelper.PoppyViewPosition;
import com.greenday.lyrics.Allsongs;
import com.greenday.lyrics.R;
import com.greenday.lyrics.ReportSong;
import com.greenday.lyrics.Settings;
import com.greenday.ins.Info;
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

public class Ins extends Activity {
	
	private PoppyViewHelper mPoppyViewHelper;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ins);
		
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
        findViewById(R.id.ins_layout).getBackground().setAlpha(alpha);
		
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
				Intent intent = new Intent(Ins.this, Allsongs.class);
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
				Intent intent = new Intent(Ins.this, ReportSong.class);
				if(track == 1){
					intent.putExtra("report_sub", "Maria");
					startActivity(intent);
					}
				if(track == 2){
					intent.putExtra("report_sub", "Poprocks And Coke");
					startActivity(intent);
					}
				if(track == 3){
					intent.putExtra("report_sub", "Longview");
					startActivity(intent);
					}
				if(track == 4){
					intent.putExtra("report_sub", "Welcome To Paradise");
					startActivity(intent);
					}
				if(track == 5){
					intent.putExtra("report_sub", "Basket Case");
					startActivity(intent);
					}
				if(track == 6){
					intent.putExtra("report_sub", "When I Come Around");
					startActivity(intent);
					}
				if(track == 7){
					intent.putExtra("report_sub", "She");
					startActivity(intent);
					}
				if(track == 8){
					intent.putExtra("report_sub", "J.A.R. (Jason Andrew Relva)");
					startActivity(intent);
					}
				if(track == 9){
					intent.putExtra("report_sub", "Geek Stink Breath");
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
					intent.putExtra("report_sub", "Walking Contradiction");
					startActivity(intent);
					}
				if(track == 13){
					intent.putExtra("report_sub", "Walking Contradiction");
					startActivity(intent);
					}
				if(track == 14){
					intent.putExtra("report_sub", "Hitchin' A Ride");
					startActivity(intent);
					}
				if(track == 15){
					intent.putExtra("report_sub", "Good Riddance (Time Of Your Life)");
					startActivity(intent);
					}
				if(track == 16){
					intent.putExtra("report_sub", "Redundant");
					startActivity(intent);
					}
				if(track == 17){
					intent.putExtra("report_sub", "Nice Guys Finish Last");
					startActivity(intent);
				}
				if(track == 18){
					intent.putExtra("report_sub", "Minority");
					startActivity(intent);
				}
				if(track == 19){
					intent.putExtra("report_sub", "Warning");
					startActivity(intent);
					}
				if(track == 20){
					intent.putExtra("report_sub", "Waiting");
					startActivity(intent);
					}
				if(track == 21){
					intent.putExtra("report_sub", "Macy's Day Parade");
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
					Info.info1(Ins.this);
				}
				if(track == 2){
					Info.info2(Ins.this);
				}
				if(track == 3){
					Info.info3(Ins.this);
				}
				if(track == 4){
					Info.info4(Ins.this);
				}
				if(track == 5){
					Info.info5(Ins.this);
				}
				if(track == 6){
					Info.info6(Ins.this);
				}
				if(track == 7){
					Info.info7(Ins.this);
				}
				if(track == 8){
					Info.info8(Ins.this);
				}
				if(track == 9){
					Info.info9(Ins.this);
				}
				if(track == 10){
					Info.info10(Ins.this);
				}
				if(track == 11){
					Info.info11(Ins.this);
				}
				if(track == 12){
					Info.info12(Ins.this);
				}
				if(track == 13){
					Info.info13(Ins.this);
				}
				if(track == 14){
					Info.info14(Ins.this);
				}
				if(track == 15){
					Info.info15(Ins.this);
				}
				if(track == 16){
					Info.info16(Ins.this);
				}
				if(track == 17){
					Info.info17(Ins.this);
				}
				if(track == 18){
					Info.info18(Ins.this);
				}
				if(track == 19){
					Info.info19(Ins.this);
				}
				if(track == 20){
					Info.info20(Ins.this);
				}
				if(track == 21){
					Info.info21(Ins.this);
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
			ab.setTitle("Maria");
			tv1.setText(R.string.maria);
		}
		if(track == 2){
			ab.setTitle("Poprocks And Coke");
			tv1.setText(R.string.poprocks);
		}
		if(track == 3){
			ab.setTitle("Longview");
			tv1.setText(R.string.longview);
		}
		if(track == 4){
			ab.setTitle("Welcome To Paradise");
			tv1.setText(R.string.welcometoparadise);
		}
		if(track == 5){
			ab.setTitle("Basket Case");
			tv1.setText(R.string.basketcase);
		}
		if(track == 6){
			ab.setTitle("When I Come Around");
			tv1.setText(R.string.whencomearound);
		}
		if(track == 7){
			ab.setTitle("She");
			tv1.setText(R.string.she);
		}
		if(track == 8){
			ab.setTitle("J.A.R. (Jason Andrew Relva)");
			tv1.setText(R.string.jar);
		}
		if(track == 9){
			ab.setTitle("Geek Stink Breath");
			tv1.setText(R.string.geekstink);
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
			ab.setTitle("Walking Contradiction");
			tv1.setText(R.string.walking);
		}
		if(track == 13){
			ab.setTitle("Stuck With Me");
			tv1.setText(R.string.stuckwithme);
		}
		if(track == 14){
			ab.setTitle("Hitchin' A Ride");
			tv1.setText(R.string.hitchinaride);
		}
		if(track == 15){
			ab.setTitle("Good Riddance (Time Of Your Life)");
			tv1.setText(R.string.goodriddance);
		}
		if(track == 16){
			ab.setTitle("Redundant");
			tv1.setText(R.string.redundant);
		}
		if(track == 17){
			ab.setTitle("Nice Guys Finish Last");
			tv1.setText(R.string.niceguys);
		}
		if(track == 18){
			ab.setTitle("Minority");
			tv1.setText(R.string.minority);
		}
		if(track == 19){
			ab.setTitle("Warning");
			tv1.setText(R.string.warning);
		}
		if(track == 20){
			ab.setTitle("Waiting");
			tv1.setText(R.string.waiting);
		}
		if(track == 21){
			ab.setTitle("Macy's Day Parade");
			tv1.setText(R.string.macy);
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