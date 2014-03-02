package com.greenday.shenanigans;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.greenday.lyrics.Allsongs;
import com.greenday.lyrics.R;
import com.greenday.lyrics.Reportsong;
import com.greenday.lyrics.Settings;
import com.greenday.lyrics.Util;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class Onwagon extends Activity {
	
	TextView tv1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
    	
		//Set theme must be used before super.oncreate or any other layout declaration
		Util.setAppTheme(this);

		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.shenanigans_onwagon);
		tv1 = (TextView)findViewById(R.id.textView1);
		getActionBar().setDisplayHomeAsUpEnabled(true);
		getWindow().setBackgroundDrawableResource(R.drawable.shenanigans_cover2);
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
			    Logger log = LoggerFactory.getLogger(Onwagon.class);
			    log.info("Shenanigans/On The Wagon");
				startActivity(new Intent(getApplicationContext(), Reportsong.class));
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
				//Info
				new AlertDialog.Builder(this)
		        .setMessage(Html.fromHtml("<font color='#524ef8'><b><u>INFORMATION</font></b></u><br>" +
		        		"<font color='#006500'>From <i>'Longview', 1994</i></font><br><br>" +
		        		getString(R.string.album)+
		        		getString(R.string.shenanigans_album) +
		        		getString(R.string.track_length) +
		        		"<font color='#006500'><i>2:48</font></i><br><br>" + 
		        		getString(R.string.writers) +
		        		"<font color='#006500'>Billie Joe Armstrong, Frank E. Iii Wright, Michael Pritchard</font><br><br>" +
		        		getString(R.string.copyright) +
		        		getString(R.string.copyright1)))
		        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
		            public void onClick(DialogInterface dialog, int which) {
		                closeContextMenu();
		            }
		        })
		        .setNegativeButton("Go To Original", new DialogInterface.OnClickListener() {
		            public void onClick(DialogInterface dialog, int which) {
		                Intent intent=new Intent(Onwagon.this, com.greenday.dookie.Longview.class);
		                startActivity(intent);
		            }
		        })
		        .show();    
			}
		            return super.onOptionsItemSelected(item);
			
		}
		
	}
