package com.greenday.unreleased;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.greenday.lyrics.Allsongs;
import com.greenday.lyrics.R;
import com.greenday.lyrics.Reportsong;
import com.greenday.lyrics.Settings;

import de.keyboardsurfer.android.widget.crouton.Crouton;
import de.keyboardsurfer.android.widget.crouton.Style;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class Mechanicalman extends Activity {
	
	TextView tv1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.unreleased_mechanicalman);
		tv1 = (TextView)findViewById(R.id.textView1);
		getActionBar().setDisplayHomeAsUpEnabled(true);
		
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
			    Logger log = LoggerFactory.getLogger(Mechanicalman.class);
			    log.info("Unreleased/Mechanical Man");
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
			if(item.getItemId()==R.id.action_label)
			{
				Crouton.makeText(this, "Info. not available at the moment.", Style.ALERT).show();
			}
		            return super.onOptionsItemSelected(item);
			
		}
		
	}
