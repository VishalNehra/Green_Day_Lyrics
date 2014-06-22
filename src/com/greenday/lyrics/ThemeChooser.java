package com.greenday.lyrics;

import com.google.android.gms.analytics.GoogleAnalytics;
import com.larswerkman.holocolorpicker.ColorPicker;
import com.larswerkman.holocolorpicker.ColorPicker.OnColorChangedListener;
import com.larswerkman.holocolorpicker.OpacityBar;
import com.larswerkman.holocolorpicker.SVBar;

import de.keyboardsurfer.android.widget.crouton.Crouton;

import android.app.ActionBar;
import android.app.Activity;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class ThemeChooser extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.themechooser);
		
		//Google Analytics
		//Get a Tracker (should auto-report)
		((Frontend) getApplication()).getTracker(Frontend.TrackerName.APP_TRACKER);
		
		int int_color = Color.parseColor("#222222");
		int ab_theme = PreferenceManager.getDefaultSharedPreferences(this).getInt("ab_theme", int_color);
		ActionBar ab = getActionBar();
		ab.setSubtitle("Theme Chooser");
		ab.setBackgroundDrawable(new ColorDrawable(ab_theme));
		ab.setDisplayHomeAsUpEnabled(true);
		
		final TextView tv1=(TextView) findViewById(R.id.textView1);
		tv1.setText("Sample");
		tv1.setTextSize(50);
		
		final ColorPicker picker = (ColorPicker) findViewById(R.id.picker);
		SVBar svBar = (SVBar) findViewById(R.id.svbar);
		OpacityBar opacityBar = (OpacityBar) findViewById(R.id.opacitybar);
		
		picker.addSVBar(svBar);
		picker.addOpacityBar(opacityBar);
		
		//To get color
		picker.getColor();
		
		//To apply previously selected color
		picker.setShowOldCenterColor(true);
		
		//Intent listener
		final boolean ab_intent = getIntent().getExtras().getBoolean("ab_theme");
		final boolean text_intent = getIntent().getExtras().getBoolean("text_theme");
		final boolean poppy_intent = getIntent().getExtras().getBoolean("poppy_theme");
		final boolean nav_intent = getIntent().getExtras().getBoolean("nav_theme");
		
		//Applying previously selected color
		//Action bar
		if(ab_intent){
			ab.setTitle("Action Bar");
			int ab_def_color= Color.parseColor("#222222");
	        int ab_color=PreferenceManager.getDefaultSharedPreferences(this).getInt("ab_theme", ab_def_color);
	        picker.setOldCenterColor(ab_color);
	        picker.setColor(ab_color);
	        tv1.setTextColor(ab_color);
		}
		//Poppy bar
		if(poppy_intent){
			ab.setTitle("Poppy Bar");
			int poppy_def_color= Color.parseColor("#222222");
	        int poppy_color=PreferenceManager.getDefaultSharedPreferences(this).getInt("poppy_theme", poppy_def_color);
	        picker.setOldCenterColor(poppy_color);
	        picker.setColor(poppy_color);
	        tv1.setTextColor(poppy_color);
		}
		//Text color
		if(text_intent){
			ab.setTitle("Lyrics Text");
			int text_def_color= Color.parseColor("#222222");
	        int text_color=PreferenceManager.getDefaultSharedPreferences(this).getInt("text_theme", text_def_color);
	        picker.setOldCenterColor(text_color);
	        picker.setColor(text_color);
	        tv1.setTextColor(text_color);
		}
		//Navigation drawer
		if(nav_intent){
			ab.setTitle("Navigation Drawer");
			int nav_def_color= Color.parseColor("#222222");
	        int nav_color=PreferenceManager.getDefaultSharedPreferences(this).getInt("nav_theme", nav_def_color);
	        picker.setOldCenterColor(nav_color);
	        picker.setColor(nav_color);
	        tv1.setTextColor(nav_color);
		}
		
		//Hint colors
		ImageButton ib1=(ImageButton) findViewById(R.id.imageButton1);
		ImageButton ib2=(ImageButton) findViewById(R.id.imageButton2);
		ImageButton ib3=(ImageButton) findViewById(R.id.imageButton3);
		ImageButton ib4=(ImageButton) findViewById(R.id.imageButton4);
		ImageButton ib5=(ImageButton) findViewById(R.id.imageButton5);
		//Hint color click listeners
		ib1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				//int darksky = Color.parseColor("#464ea3");
				picker.setColor(-12165121);
			}
		});
		ib2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				int frooti = Color.parseColor("#fbba00");
				picker.setColor(frooti);
			}
		});
		ib3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				int lavender = Color.parseColor("#92278f");
				picker.setColor(lavender);
			}
		});
		ib4.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				int lime = Color.parseColor("#669002");
				picker.setColor(lime);
			}
		});
		ib5.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				//int mojo = Color.parseColor("#c84741");
				picker.setColor(-42415);
			}
		});
		
		picker.setOnColorChangedListener(new OnColorChangedListener() {
			
			@Override
			public void onColorChanged(final int color) {
				// TODO Auto-generated method stub
				tv1.setTextColor(color);
				
				Button b= (Button) findViewById(R.id.button1);
				b.setOnClickListener(new OnClickListener() {
					
					@Override
					public void onClick(View arg0) {
						// TODO Auto-generated method stub
						if(ab_intent){
							SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(ThemeChooser.this);
							sp.edit().putInt("ab_theme", color).commit();
							Toast.makeText(ThemeChooser.this, "Applied", Toast.LENGTH_LONG).show();
							//System.exit(0);
							onBackPressed();
						}
						
						if(text_intent){
							SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(ThemeChooser.this);
							sp.edit().putInt("text_theme", color).commit();
							Toast.makeText(ThemeChooser.this, "Applied", Toast.LENGTH_LONG).show();
							//System.exit(0);
							onBackPressed();
						}
						
						if(poppy_intent){
							SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(ThemeChooser.this);
							sp.edit().putInt("poppy_theme", color).commit();
							Toast.makeText(ThemeChooser.this, "Applied", Toast.LENGTH_LONG).show();
							//System.exit(0);
							onBackPressed();
						}
						
						if(nav_intent){
							SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(ThemeChooser.this);
							sp.edit().putInt("nav_theme", color).commit();
							Toast.makeText(ThemeChooser.this, "Applied", Toast.LENGTH_LONG).show();
							//System.exit(0);
							onBackPressed();
						}
					}
				});
			}
		});
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// TODO Auto-generated method stub
		return super.onCreateOptionsMenu(menu);
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		switch(item.getItemId()){
			case android.R.id.home:
				onBackPressed();
				break;
		}
		return super.onOptionsItemSelected(item);
	}
	
	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		//Get an Analytics tracker to report app starts & uncaught exceptions etc.
		GoogleAnalytics.getInstance(this).reportActivityStart(this);
		super.onStart();
	}
	
	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		//Stop the analytics tracking
		GoogleAnalytics.getInstance(this).reportActivityStop(this);
		super.onStop();
	}
	
	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
    	//Protect crouton
        Crouton.clearCroutonsForActivity(this);
		super.onDestroy();
	}
}