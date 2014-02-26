package com.greenday.tcb;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.greenday.lyrics.Allsongs;
import com.greenday.lyrics.Nowplaying;
import com.greenday.lyrics.R;
import com.greenday.lyrics.Reportsong;
import com.greenday.lyrics.Settings;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class Lastamerican extends Activity {
	
	TextView tv1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tcb_lastamerican);
		tv1 = (TextView)findViewById(R.id.textView1);
		getActionBar().setDisplayHomeAsUpEnabled(true);
		getWindow().setBackgroundDrawableResource(R.drawable.tcb_cover2);
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
		    Logger log = LoggerFactory.getLogger(Lastamerican.class);
		    log.info("21st Centuary Breakdown/Last Of The American Girls");
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
		if(item.getItemId()==R.id.action_play)
		{
			// now playing
			startActivity(new Intent(this, Nowplaying.class));
            return true;
		}
		if(item.getItemId()==R.id.action_label)
		{
			//Info
			new AlertDialog.Builder(this)
	        .setMessage(Html.fromHtml(getString(R.string.album)+
	        		getString(R.string.tcb_album) +
	        		getString(R.string.track_length) +
	        		"<font color='#006500'><i>3:51</font></i><br><br>" + 
	        		getString(R.string.writers) +
	        		"<font color='#006500'>Michael Pritchard, Billie Joe Armstrong, Frank E. Iii Wright</font><br><br>" +
	        		getString(R.string.copyright) +
	        		getString(R.string.copyright1)))
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
