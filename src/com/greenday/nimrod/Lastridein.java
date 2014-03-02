package com.greenday.nimrod;

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

public class Lastridein extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
    	
		//Set theme must be used before super.oncreate or any other layout declaration
		Util.setAppTheme(this);

		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.nimrod_lastridein);
		getActionBar().setDisplayHomeAsUpEnabled(true);
		getWindow().setBackgroundDrawableResource(R.drawable.nimrod_cover2);
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
		    Logger log = LoggerFactory.getLogger(Lastridein.class);
		    log.info("Nimrod/Last Ride In");
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
			//Info
			new AlertDialog.Builder(this)
	        .setMessage(Html.fromHtml(getString(R.string.album)+
	        		getString(R.string.nimrod_album) +
	        		getString(R.string.track_length) +
	        		"<font color='#006500'><i>3:47</i></font>"))
	        .setNeutralButton("OK", new DialogInterface.OnClickListener() {
	            public void onClick(DialogInterface dialog, int which) {
	                closeContextMenu();
	            }
	        })
	        .show();    
		}
	            return super.onOptionsItemSelected(item);
		
	}
	
}
