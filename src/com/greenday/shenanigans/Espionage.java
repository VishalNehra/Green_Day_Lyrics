package com.greenday.shenanigans;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.greenday.americanidiot.Americanidiot;
import com.greenday.dookie.Basketcase;
import com.greenday.lyrics.Allsongs;
import com.greenday.lyrics.R;
import com.greenday.lyrics.Reportproblem;
import com.greenday.lyrics.Reportsong;
import com.greenday.lyrics.Settings;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.TextView;

public class Espionage extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.shenanigans_espionage);
		getActionBar().setDisplayHomeAsUpEnabled(true);
		getWindow().setBackgroundDrawableResource(R.drawable.shenanigans_cover2);
		ImageButton b=(ImageButton) findViewById(R.id.imageButton1);
		b.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				AlertDialog builder = new AlertDialog.Builder(Espionage.this)
		        .setMessage("[from 'Hitchin' a Ride', 1997\n\n]" +
		        		"Instrumental\n\n" +
		        		"Album:\n" +
		        		"Shenanigans (2002)\n\n" +
		        		"Track Length:\n" +
		        		"3:23")
		        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
		            public void onClick(DialogInterface dialog, int which) {
		                closeContextMenu();
		            }
		        })
		        .setNegativeButton("Go To Original", new DialogInterface.OnClickListener() {
		            public void onClick(DialogInterface dialog, int which) {
		                Intent intent=new Intent(Espionage.this, com.greenday.nimrod.Hitchinaride.class);
		                startActivity(intent);
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
			    Logger log = LoggerFactory.getLogger(Espionage.class);
			    log.info("Shenanigans/Espionage");
				startActivity(new Intent(getApplicationContext(), Reportsong.class));
			}
			if(item.getItemId()==R.id.action_search)
			{
				// search action
	        	Intent intent = new Intent(this, Allsongs.class);
	        	intent.putExtra("Search", true);
	        	startActivity(intent);
				return true;
			}
		            return super.onOptionsItemSelected(item);
			
		}
		
	}
