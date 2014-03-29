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
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class ReportSong extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		//Set theme must be used before super.oncreate or any other layout declaration
		Util.setAppTheme(this);
		
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.reportsong);
		getActionBar().setDisplayHomeAsUpEnabled(true);
		ActionBar ab = getActionBar();
		ab.setSubtitle(getIntent().getExtras().getString("report_sub"));
		
		//Submit classs name for report
		Logger log = LoggerFactory.getLogger(ReportSong.class);
		log.info(getIntent().getExtras().getString("report_sub"));
		
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
		tv.setText("Your feedback, system information and email address \nwill be sent to the database.\n" +
		"Your private information will not be used/distributed \nanywhere else.");
		
	}
	
	//Actionbar code
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

}
