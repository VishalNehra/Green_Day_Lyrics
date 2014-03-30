package com.greenday.unreleased;

import com.greenday.lyrics.Allsongs;
import com.greenday.lyrics.R;
import com.greenday.lyrics.ReportSong;
import com.greenday.lyrics.Settings;
import com.greenday.lyrics.Util;
import de.keyboardsurfer.android.widget.crouton.Crouton;
import de.keyboardsurfer.android.widget.crouton.Style;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class Unreleased extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		//Set theme must be used before super.oncreate or any other layout declaration
		Util.setAppTheme(this);
				
		super.onCreate(savedInstanceState);
		setContentView(R.layout.unreleased);
		
		TextView tv1 = (TextView)findViewById(R.id.textView1);
		int track = getIntent().getExtras().getInt("track");
		if(track == 1){
			ActionBar ab=getActionBar();
			ab.setTitle("A Quick One While He's Away");
			tv1.setText(R.string.quickone);
		}
		if(track == 2){
			ActionBar ab=getActionBar();
			ab.setTitle("Another State Of Mind");
			tv1.setText(R.string.stateofmind);
		}
		if(track == 3){
			ActionBar ab=getActionBar();
			ab.setTitle("Cigarettes And Valentines");
			ab.setSubtitle("21st Centuary Breakdown");
			tv1.setText(R.string.cigarettes);
		}
		if(track == 4){
			ActionBar ab=getActionBar();
			ab.setTitle("Favourite Son");
			ab.setSubtitle("American Idiot");
			tv1.setText(R.string.favouriteson);
		}
		if(track == 5){
			ActionBar ab=getActionBar();
			ab.setTitle("Governator");
			tv1.setText(R.string.governator);
		}
		if(track == 6){
			ActionBar ab=getActionBar();
			ab.setTitle("Hearts Collide");
			ab.setSubtitle("21st Centuary Breakdown");
			tv1.setText(R.string.heartscollide);
		}
		if(track == 7){
			ActionBar ab=getActionBar();
			ab.setTitle("I Fought The Law");
			tv1.setText(R.string.foughtlaw);
		}
		if(track == 8){
			ActionBar ab=getActionBar();
			ab.setTitle("Lights Out");
			ab.setSubtitle("21st Centuary Breakdown");
			tv1.setText(R.string.lightsout);
		}
		if(track == 9){
			ActionBar ab=getActionBar();
			ab.setTitle("Like A Rolling Stone");
			tv1.setText(R.string.likeastone);
		}
		if(track == 10){
			ActionBar ab=getActionBar();
			ab.setTitle("Mechanical Man");
			tv1.setText(R.string.mechanicalman);
		}
		if(track == 11){
			ActionBar ab=getActionBar();
			ab.setTitle("Minnesota Girl");
			tv1.setText(R.string.minnesotagirl);
		}
		if(track == 12){
			ActionBar ab=getActionBar();
			ab.setTitle("Shoplifter");
			tv1.setText(R.string.shoplifter);
		}
		if(track == 13){
			ActionBar ab=getActionBar();
			ab.setTitle("Shout");
			tv1.setText(R.string.shout);
		}
		if(track == 14){
			ActionBar ab=getActionBar();
			ab.setTitle("Teenage Lobotomy");
			tv1.setText(R.string.teenage);
		}
		if(track == 15){
			ActionBar ab=getActionBar();
			ab.setTitle("That's All Right");
			tv1.setText(R.string.thatsallright);
		}
		if(track == 16){
			ActionBar ab=getActionBar();
			ab.setTitle("Too Much, Too Soon");
			tv1.setText(R.string.toomuch);
		}
		if(track == 17){
			ActionBar ab=getActionBar();
			ab.setTitle("We Are The Champions");
			tv1.setText(R.string.wearechampions);
		}
		if(track == 18){
			ActionBar ab=getActionBar();
			ab.setTitle("Working Class Hero");
			tv1.setText(R.string.workingclasshero);
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
			if(track == 1){
				Intent intent = new Intent(this, ReportSong.class);
				intent.putExtra("report_sub", "A Quick One While He's Away");
				startActivity(intent);
				}
			if(track == 2){
				Intent intent = new Intent(this, ReportSong.class);
				intent.putExtra("report_sub", "Another State Of Mind");
				startActivity(intent);
				}
			if(track == 3){
				Intent intent = new Intent(this, ReportSong.class);
				intent.putExtra("report_sub", "Cigarettes And Valentines");
				startActivity(intent);
				}
			if(track == 4){
				Intent intent = new Intent(this, ReportSong.class);
				intent.putExtra("report_sub", "Favourite Son");
				startActivity(intent);
				}
			if(track == 5){
				Intent intent = new Intent(this, ReportSong.class);
				intent.putExtra("report_sub", "Governator");
				startActivity(intent);
				}
			if(track == 6){
				Intent intent = new Intent(this, ReportSong.class);
				intent.putExtra("report_sub", "Hearts Collide");
				startActivity(intent);
				}
			if(track == 7){
				Intent intent = new Intent(this, ReportSong.class);
				intent.putExtra("report_sub", "I Fought The Law");
				startActivity(intent);
				}
			if(track == 8){
				Intent intent = new Intent(this, ReportSong.class);
				intent.putExtra("report_sub", "Lights Out");
				startActivity(intent);
				}
			if(track == 9){
				Intent intent = new Intent(this, ReportSong.class);
				intent.putExtra("report_sub", "Like A Rolling Stone");
				startActivity(intent);
				}
			if(track == 10){
				Intent intent = new Intent(this, ReportSong.class);
				intent.putExtra("report_sub", "Mechanical Man");
				startActivity(intent);
				}
			if(track == 11){
				Intent intent = new Intent(this, ReportSong.class);
				intent.putExtra("report_sub", "Minnesota Girl");
				startActivity(intent);
				}
			if(track == 12){
				Intent intent = new Intent(this, ReportSong.class);
				intent.putExtra("report_sub", "Shoplifter");
				startActivity(intent);
				}
			if(track == 13){
				Intent intent = new Intent(this, ReportSong.class);
				intent.putExtra("report_sub", "Shout");
				startActivity(intent);
				}
			if(track == 14){
				Intent intent = new Intent(this, ReportSong.class);
				intent.putExtra("report_sub", "Teenage Lobotomy");
				startActivity(intent);
				}
			if(track == 15){
				Intent intent = new Intent(this, ReportSong.class);
				intent.putExtra("report_sub", "That's All Right");
				startActivity(intent);
				}
			if(track == 16){
				Intent intent = new Intent(this, ReportSong.class);
				intent.putExtra("report_sub", "Too Much, Too Soon");
				startActivity(intent);
				}
			if(track == 17){
				Intent intent = new Intent(this, ReportSong.class);
				intent.putExtra("report_sub", "We Are The Champions");
				startActivity(intent);
			}
			if(track == 18){
				Intent intent = new Intent(this, ReportSong.class);
				intent.putExtra("report_sub", "Working Class Hero");
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
			if(track == 18){
				Info.info17(this);
			}
			else{
				Crouton.makeText(this, "Info. not available ATM", Style.ALERT).show();
			}
		}
	            return super.onOptionsItemSelected(item);
	}
}
