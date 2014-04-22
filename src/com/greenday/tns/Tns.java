package com.greenday.tns;

import com.fourmob.poppyview.PoppyViewHelper;
import com.fourmob.poppyview.PoppyViewHelper.PoppyViewPosition;
import com.greenday.lyrics.Allsongs;
import com.greenday.lyrics.ReportSong;
import com.greenday.lyrics.Settings;
import com.greenday.lyrics.Util;
import com.greenday.lyrics.R;
import com.greenday.tns.Info;

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

public class Tns extends Activity {
	
	private PoppyViewHelper mPoppyViewHelper;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		//Set theme must be used before super.oncreate or any other layout declaration
		Util.setAppTheme(this);
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tns);
		
		//Poppyview
		mPoppyViewHelper=new PoppyViewHelper(this, PoppyViewPosition.BOTTOM);
		View poppyview = mPoppyViewHelper.createPoppyViewOnScrollView(R.id.scrollView, R.layout.poppyview);
		
		ImageButton search = (ImageButton) poppyview.findViewById(R.id.imageButton1);
		search.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				// Search action | Add as new task
				Intent intent = new Intent(Tns.this, Allsongs.class);
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
				Intent intent = new Intent(Tns.this, ReportSong.class);
				if(track == 1){
					intent.putExtra("report_sub", "At The Library");
					startActivity(intent);
					}
				if(track == 2){
					intent.putExtra("report_sub", "Don't Leave Me");
					startActivity(intent);
					}
				if(track == 3){
					intent.putExtra("report_sub", "I Was There");
					startActivity(intent);
					}
				if(track == 4){
					intent.putExtra("report_sub", "Disappearing Boy");
					startActivity(intent);
					}
				if(track == 5){
					intent.putExtra("report_sub", "Green Day");
					startActivity(intent);
					}
				if(track == 6){
					intent.putExtra("report_sub", "Going To Pasalacqua");
					startActivity(intent);
					}
				if(track == 7){
					intent.putExtra("report_sub", "16");
					startActivity(intent);
					}
				if(track == 8){
					intent.putExtra("report_sub", "Road To Acceptance");
					startActivity(intent);
					}
				if(track == 9){
					intent.putExtra("report_sub", "Rest");
					startActivity(intent);
					}
				if(track == 10){
					intent.putExtra("report_sub", "The Judge's Daughter");
					startActivity(intent);
					}
				if(track == 11){
					intent.putExtra("report_sub", "Paper Lanterns");
					startActivity(intent);
					}
				if(track == 12){
					intent.putExtra("report_sub", "Why Do You Want Him?");
					startActivity(intent);
					}
				if(track == 13){
					intent.putExtra("report_sub", "409 In Your Coffeemaker");
					startActivity(intent);
					}
				if(track == 14){
					intent.putExtra("report_sub", "Knowledge");
					startActivity(intent);
					}
				if(track == 15){
					intent.putExtra("report_sub", "1,000 Hours");
					startActivity(intent);
					}
				if(track == 16){
					intent.putExtra("report_sub", "Dry Ice");
					startActivity(intent);
					}
				if(track == 17){
					intent.putExtra("report_sub", "Only Of You");
					startActivity(intent);
					}
				if(track == 18){
					intent.putExtra("report_sub", "The One I Want");
					startActivity(intent);
					}
				if(track == 19){
					intent.putExtra("report_sub", "I Want To Be Alone");
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
					Info.info1(Tns.this);
				}
				if(track == 2){
					Info.info2(Tns.this);
				}
				if(track == 3){
					Info.info3(Tns.this);
				}
				if(track == 4){
					Info.info4(Tns.this);
				}
				if(track == 5){
					Info.info5(Tns.this);
				}
				if(track == 6){
					Info.info6(Tns.this);
				}
				if(track == 7){
					Info.info7(Tns.this);
				}
				if(track == 8){
					Info.info8(Tns.this);
				}
				if(track == 9){
					Info.info9(Tns.this);
				}
				if(track == 10){
					Info.info10(Tns.this);
				}
				if(track == 11){
					Info.info11(Tns.this);
				}
				if(track == 12){
					Info.info12(Tns.this);
				}
				if(track == 13){
					Info.info13(Tns.this);
				}
				if(track == 14){
					Info.info14(Tns.this);
				}
				if(track == 15){
					Info.info15(Tns.this);
				}
				if(track == 16){
					Info.info16(Tns.this);
				}
				if(track == 17){
					Info.info17(Tns.this);
				}
				if(track == 18){
					Info.info18(Tns.this);
				}
				if(track == 19){
					Info.info19(Tns.this);
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
			ab.setTitle("At The Library");
			tv1.setText(R.string.atlibrary);
		}
		if(track == 2){
			ab.setTitle("Don't Leave Me");
			tv1.setText(R.string.dontleaveme);
		}
		if(track == 3){
			ab.setTitle("I Was There");
			tv1.setText(R.string.iwasthere);
		}
		if(track == 4){
			ab.setTitle("Disappearing Boy");
			tv1.setText(R.string.disappearingboy);
		}
		if(track == 5){
			ab.setTitle("Green Day");
			tv1.setText(R.string.greenday);
		}
		if(track == 6){
			ab.setTitle("Going To Pasalacqua");
			tv1.setText(R.string.goingtopasalacqua);
		}
		if(track == 7){
			ab.setTitle("16");
			tv1.setText(R.string.sixteen);
		}
		if(track == 8){
			ab.setTitle("Road To Acceptance");
			tv1.setText(R.string.roadtoacceptance);
		}
		if(track == 9){
			ab.setTitle("Rest");
			tv1.setText(R.string.rest);
		}
		if(track == 10){
			ab.setTitle("The Judge's Daughter");
			tv1.setText(R.string.judgesdaughter);
		}
		if(track == 11){
			ab.setTitle("Paper Lanterns");
			tv1.setText(R.string.paperlanterns);
		}
		if(track == 12){
			ab.setTitle("Why Do You Want Him?");
			tv1.setText(R.string.whyyouwanthim);
		}
		if(track == 13){
			ab.setTitle("409 In Your Coffeemaker");
			tv1.setText(R.string.coffeemaker);
		}
		if(track == 14){
			ab.setTitle("Knowledge");
			tv1.setText(R.string.knowledge);
		}
		if(track == 15){
			ab.setTitle("1,000 Hours");
			tv1.setText(R.string.thousandhours);
		}
		if(track == 16){
			ab.setTitle("Dry Ice");
			tv1.setText(R.string.dryice);
		}
		if(track == 17){
			ab.setTitle("Only Of You");
			tv1.setText(R.string.onlyofyou);
		}
		if(track == 18){
			ab.setTitle("The One I Want");
			tv1.setText(R.string.oneiwant);
		}
		if(track == 19){
			ab.setTitle("I Want To Be Alone");
			tv1.setText(R.string.wanttobealone);
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
