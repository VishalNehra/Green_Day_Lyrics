package com.greenday.americanidiot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.espian.showcaseview.ShowcaseView;
import com.greenday.lyrics.Allsongs;
import com.greenday.lyrics.MainActivity;
import com.greenday.lyrics.Nowplaying;
import com.greenday.lyrics.R;
import com.greenday.lyrics.Reportsong;
import com.greenday.lyrics.Settings;

import de.keyboardsurfer.android.widget.crouton.Crouton;
import de.keyboardsurfer.android.widget.crouton.Style;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.TextView;

public class Americanidiot extends Activity {
	TextView tv1;
	ShowcaseView sv;
	@Override
	protected void onCreate(Bundle savedInstanceState) {

		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.americanidiot_americanidiot);
		tv1 = (TextView)findViewById(R.id.textView1);
		getWindow().setBackgroundDrawableResource(R.drawable.americanidiot_cover2);
		getActionBar().setDisplayHomeAsUpEnabled(true);
		ImageButton b=(ImageButton) findViewById(R.id.imageButton1);
		b.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				@SuppressWarnings("unused")
				AlertDialog builder = new AlertDialog.Builder(Americanidiot.this, android.R.style.Theme_DeviceDefault_Light_Dialog_MinWidth)
		        .setMessage(Html.fromHtml(getString(R.string.album)+
		        		getString(R.string.americanidiot_album) +
		        		getString(R.string.track_length) +
		        		"<font color='#006500'><i>2:54</font></i><br><br>" + 
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
		    Logger log = LoggerFactory.getLogger(Americanidiot.class);
		    log.info("American Idiot/American Idiot");
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
			startActivity(new Intent(Americanidiot.this, Nowplaying.class));
            return true;
		}
	            return super.onOptionsItemSelected(item);
		
	}
}
