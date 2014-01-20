package com.greenday.americanidiot;

import org.acra.ACRA;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.greenday.lyrics.R;
import com.greenday.lyrics.Reportproblem;
import com.greenday.lyrics.Settings;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class Americanidiot extends Activity {
	
	TextView tv1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		ACRA.getErrorReporter().putCustomData("myKey", "asdfasdfasfas");
		setContentView(R.layout.americanidiot_americanidiot);
		tv1 = (TextView)findViewById(R.id.textView1);
		getActionBar().setDisplayHomeAsUpEnabled(true);
		
		// SLF4J
	    Logger log = LoggerFactory.getLogger(Americanidiot.class);
	    log.info("hello world");
	    
	    
	}

	
	//Action bar code below
	
	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
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
		if(item.getItemId()==R.id.item1)
		{
			Log.d("Option", "Option 1 was clicked");
			startActivity(new Intent(getApplicationContext(), Settings.class));
		}
		if(item.getItemId()==R.id.item2)
		{
			Log.d("Option", "Option 2 was clicked");
			startActivity(new Intent(getApplicationContext(), Reportproblem.class));
		}
	            return super.onOptionsItemSelected(item);
		
	}
	
}
