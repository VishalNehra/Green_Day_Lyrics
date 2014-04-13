package com.greenday.tcb;

import com.greenday.lyrics.Allsongs;
import com.greenday.lyrics.ReportSong;
import com.greenday.lyrics.Settings;
import com.greenday.lyrics.Util;
import com.greenday.lyrics.R;
import com.greenday.tcb.Info;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class TcbMain extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		//Set theme must be used before super.oncreate or any other layout declaration
		Util.setAppTheme(this);
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tcb);
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
			ab.setTitle("Song Of The Centuary");
			tv1.setText(R.string.songofcentuary);
		}
		if(track == 2){
			ab.setTitle("21st Centuary Breakdown");
			tv1.setText(R.string.tcb);
		}
		if(track == 3){
			ab.setTitle("Know Your Enemy");
			tv1.setText(R.string.knowyourenemy);
		}
		if(track == 4){
			ab.setTitle("¡Viva La Gloria!");
			tv1.setText(R.string.vivalagloria);
		}
		if(track == 5){
			ab.setTitle("Before The Lobotomy");
			tv1.setText(R.string.lobotomy);
		}
		if(track == 6){
			ab.setTitle("Christian's Inferno");
			tv1.setText(R.string.inferno);
		}
		if(track == 7){
			ab.setTitle("Last Night On Earth");
			tv1.setText(R.string.lastnight);
		}
		if(track == 8){
			ab.setTitle("East Jesus Nowhere");
			tv1.setText(R.string.eastjesus);
		}
		if(track == 9){
			ab.setTitle("Peacemaker");
			tv1.setText(R.string.peacemaker);
		}
		if(track == 10){
			ab.setTitle("Last Of American Girls");
			tv1.setText(R.string.lastamerican);
		}
		if(track == 11){
			ab.setTitle("Murder City");
			tv1.setText(R.string.murdercity);
		}
		if(track == 12){
			ab.setTitle("¿Viva La Gloria? (Little Girl)");
			tv1.setText(R.string.vivalagloria2);
		}
		if(track == 13){
			ab.setTitle("Restless Heart Syndrome");
			tv1.setText(R.string.restless);
		}
		if(track == 14){
			ab.setTitle("Horseshoes And Handgranades");
			tv1.setText(R.string.horseshoes);
		}
		if(track == 15){
			ab.setTitle("The Static Age");
			tv1.setText(R.string.staticage);
		}
		if(track == 16){
			ab.setTitle("21 Guns");
			tv1.setText(R.string.guns);
		}
		if(track == 17){
			ab.setTitle("American Eulogy");
			tv1.setText(R.string.americaneulogy);
		}
		if(track == 18){
			ab.setTitle("See The Light");
			tv1.setText(R.string.seethelight);
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
					intent.putExtra("report_sub", "Song Of The Centuary");
					startActivity(intent);
					}
				if(track == 2){
					intent.putExtra("report_sub", "21st Centuary Breakdown");
					startActivity(intent);
					}
				if(track == 3){
					intent.putExtra("report_sub", "Know Your Enemy");
					startActivity(intent);
					}
				if(track == 4){
					intent.putExtra("report_sub", "¡Viva La Gloria!");
					startActivity(intent);
					}
				if(track == 5){
					intent.putExtra("report_sub", "Before The Lobotomy");
					startActivity(intent);
					}
				if(track == 6){
					intent.putExtra("report_sub", "Christian's Inferno");
					startActivity(intent);
					}
				if(track == 7){
					intent.putExtra("report_sub", "Last Night On Earth");
					startActivity(intent);
					}
				if(track == 8){
					intent.putExtra("report_sub", "East Jesus Nowhere");
					startActivity(intent);
					}
				if(track == 9){
					intent.putExtra("report_sub", "Peacemaker");
					startActivity(intent);
					}
				if(track == 10){
					intent.putExtra("report_sub", "Last Of American Girls");
					startActivity(intent);
					}
				if(track == 11){
					intent.putExtra("report_sub", "Murder City");
					startActivity(intent);
					}
				if(track == 12){
					intent.putExtra("report_sub", "¿Viva La Gloria? (Little Girl)");
					startActivity(intent);
					}
				if(track == 13){
					intent.putExtra("report_sub", "Restless Heart Syndrome");
					startActivity(intent);
					}
				if(track == 14){
					intent.putExtra("report_sub", "Horseshoes And Handgranades");
					startActivity(intent);
					}
				if(track == 15){
					intent.putExtra("report_sub", "The Static Age");
					startActivity(intent);
					}
				if(track == 16){
					intent.putExtra("report_sub", "21 Guns");
					startActivity(intent);
					}
				if(track == 17){
					intent.putExtra("report_sub", "American Eulogy");
					startActivity(intent);
					}
				if(track == 18){
					intent.putExtra("report_sub", "See The Light");
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
			}
		            return super.onOptionsItemSelected(item);
		}
}
