package com.greenday.warning;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.greenday.americanidiot.Americanidiot;
import com.greenday.lyrics.R;
import com.greenday.lyrics.Reportproblem;
import com.greenday.lyrics.Reportsong;
import com.greenday.lyrics.Settings;
import com.greenday.nimrod.Kingforaday;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.TextView;

public class Holdon extends Activity {
	
	TextView tv1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.warning_holdon);
		tv1 = (TextView)findViewById(R.id.textView1);
		getActionBar().setDisplayHomeAsUpEnabled(true);
		ImageButton b=(ImageButton) findViewById(R.id.imageButton1);
		b.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				AlertDialog builder = new AlertDialog.Builder(Holdon.this)
		        .setMessage("Writers:\n" +
		        		"Billie Joe Armstrong, Frank E. Iii Wright, Michael Pritchard\n\n" +
		        		"Copyright:\n" +
		        		"Green Daze Music, WB Music Corp.")
		        .setNegativeButton("OK", new DialogInterface.OnClickListener() {
		            public void onClick(DialogInterface dialog, int which) {
		                closeContextMenu();
		            }
		        })
		        .show();    
			}
		});
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
			//Log report
		    Logger log = LoggerFactory.getLogger(Holdon.class);
		    log.info("Warning/Hold On");
			startActivity(new Intent(getApplicationContext(), Reportsong.class));
		}
	            return super.onOptionsItemSelected(item);
		
	}
	
}
