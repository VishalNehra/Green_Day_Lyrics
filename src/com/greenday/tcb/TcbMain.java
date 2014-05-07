package com.greenday.tcb;

import com.fourmob.poppyview.PoppyViewHelper;
import com.fourmob.poppyview.PoppyViewHelper.PoppyViewPosition;
import com.greenday.lyrics.Allsongs;
import com.greenday.lyrics.ReportSong;
import com.greenday.lyrics.Settings;
import com.greenday.lyrics.R;
import com.greenday.tcb.Info;

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

public class TcbMain extends Activity {
	
	private PoppyViewHelper mPoppyViewHelper;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tcb);
		
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
				Intent intent = new Intent(TcbMain.this, Allsongs.class);
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
				Intent intent = new Intent(TcbMain.this, ReportSong.class);
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
		});
		ImageButton label=(ImageButton) poppyview.findViewById(R.id.imageButton3);
		label.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				int track = getIntent().getExtras().getInt("track");
				if(track == 1){
					Info.info1(TcbMain.this);
				}
				if(track == 2){
					Info.info2(TcbMain.this);
				}
				if(track == 3){
					Info.info3(TcbMain.this);
				}
				if(track == 4){
					Info.info4(TcbMain.this);
				}
				if(track == 5){
					Info.info5(TcbMain.this);
				}
				if(track == 6){
					Info.info6(TcbMain.this);
				}
				if(track == 7){
					Info.info7(TcbMain.this);
				}
				if(track == 8){
					Info.info8(TcbMain.this);
				}
				if(track == 9){
					Info.info9(TcbMain.this);
				}
				if(track == 10){
					Info.info10(TcbMain.this);
				}
				if(track == 11){
					Info.info11(TcbMain.this);
				}
				if(track == 12){
					Info.info12(TcbMain.this);
				}
				if(track == 13){
					Info.info13(TcbMain.this);
				}
				if(track == 14){
					Info.info14(TcbMain.this);
				}
				if(track == 15){
					Info.info15(TcbMain.this);
				}
				if(track == 16){
					Info.info16(TcbMain.this);
				}
				if(track == 17){
					Info.info17(TcbMain.this);
				}
				if(track == 18){
					Info.info18(TcbMain.this);
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