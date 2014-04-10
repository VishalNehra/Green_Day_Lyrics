package com.greenday.ins;

import com.greenday.lyrics.Allsongs;
import com.greenday.lyrics.R;
import com.greenday.lyrics.ReportSong;
import com.greenday.lyrics.Settings;
import com.greenday.lyrics.Util;
import com.greenday.ins.Info;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class Ins extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		//Set theme must be used before super.oncreate or any other layout declaration
		Util.setAppTheme(this);
				
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ins);
		
		TextView tv1 = (TextView)findViewById(R.id.textView1);
		int track = getIntent().getExtras().getInt("track");
		ActionBar ab=getActionBar();
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
			if(track == 19){
				Info.info19(this);
			}
			if(track == 20){
				Info.info20(this);
			}
			if(track == 21){
				Info.info21(this);
			}
		}
	            return super.onOptionsItemSelected(item);
	}
}
