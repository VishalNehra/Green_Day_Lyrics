package com.greenday.lyrics;

import org.acra.ACRA;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.keyboardsurfer.android.widget.crouton.Crouton;
import de.keyboardsurfer.android.widget.crouton.Style;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class ReportSong extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.reportsong);
		
		//Action bar color
        int ab_def_color= Color.parseColor("#222222");
        int ab_color=PreferenceManager.getDefaultSharedPreferences(this).getInt("ab_theme", ab_def_color);
        ActionBar ab =getActionBar();
        ab.setBackgroundDrawable(new ColorDrawable(ab_color));
        
		getActionBar().setDisplayHomeAsUpEnabled(true);
		ab.setSubtitle(getIntent().getExtras().getString("report_sub"));
		
		//Submit class name for report
		Logger log = LoggerFactory.getLogger(ReportSong.class);
		log.info(getIntent().getExtras().getString("report_sub"));
		
		ConnectivityManager connMgr = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
		NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();
		if (networkInfo != null && networkInfo.isConnected()) 
		{
			//No action
		}
		else
		{
			Toast.makeText(this, "Internet connection not available", Toast.LENGTH_LONG).show();
		}
		
		SharedPreferences prefs = this.getSharedPreferences(
			      "EXTRA_PREF", Context.MODE_PRIVATE);
		final String account = prefs.getString("account", "Green Day Fan");
		Spinner spinner = (Spinner) findViewById(R.id.spinner1);
		
		String[] values = new String []
				{
				" From: Anonymous",
				" From: " + account
				};
				
		final ArrayAdapter<String> spinnerAdapter = new ArrayAdapter<String>(this,
	    		 R.layout.spinnerlayout, values);
		spinner.setAdapter(spinnerAdapter);
		spinner.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int position, long arg3) {
				// TODO Auto-generated method stub
				String values = spinnerAdapter.getItem(position);
				if(values.equals(" From: Anonymous"))
				{
					Logger log = LoggerFactory.getLogger(ReportSong.class);
					log.info("User -> Anonymous");
				}
				if(values.equals(" From: " + account))
				{
					Logger log = LoggerFactory.getLogger(ReportSong.class);
					log.info("User -> " + account);
				}
				
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub
				
			}
		});
	    
		EditText et = (EditText) findViewById(R.id.editText1);
		et.setHint("Write your feedback");
		
		TextView tv = (TextView) findViewById(R.id.textView1);
		tv.setText("Your feedback, system information and email address will be sent to the database.\n" +
		"Your private information will not be used/distributed anywhere else.");
		
	}
	
	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_report, menu);
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
		if(item.getItemId()==R.id.action_report)
		{
			ConnectivityManager connMgr = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
			NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();
			if (networkInfo != null && networkInfo.isConnected()) 
			{
				EditText et = (EditText) findViewById(R.id.editText1);
				//Lib used to submit edittext to log
				Logger log = LoggerFactory.getLogger(ReportSong.class);
				log.info(et.getText().toString());
				//Exception to start ACRA without any crash
				Throwable caughtException=null;
				ACRA.getErrorReporter().handleException(caughtException);
				onBackPressed();
			}
			else
			{
				Crouton.makeText(this, "Unable to connect to Internet", Style.ALERT).show();
			}
		}
		return super.onOptionsItemSelected(item);
	}
	
	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		Crouton.clearCroutonsForActivity(this);
		super.onDestroy();
	}
}
