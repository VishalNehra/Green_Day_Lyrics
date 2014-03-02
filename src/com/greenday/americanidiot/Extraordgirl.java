package com.greenday.americanidiot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import uk.co.senab.actionbarpulltorefresh.library.ActionBarPullToRefresh;
import uk.co.senab.actionbarpulltorefresh.library.PullToRefreshLayout;
import uk.co.senab.actionbarpulltorefresh.library.listeners.OnRefreshListener;

import com.greenday.lyrics.Allsongs;
import com.greenday.lyrics.R;
import com.greenday.lyrics.Reportsong;
import com.greenday.lyrics.Settings;
import com.greenday.lyrics.Util;

import de.keyboardsurfer.android.widget.crouton.Crouton;
import de.keyboardsurfer.android.widget.crouton.Style;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.preference.PreferenceManager;
import android.text.Html;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;

public class Extraordgirl extends Activity implements OnRefreshListener{
	private PullToRefreshLayout mPullToRefreshLayout;		
	TextView tv1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
    	
		//Set theme must be used before super.oncreate or any other layout declaration!
		Util.setAppTheme(this);

		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.americanidiot_extordgirl);
		mPullToRefreshLayout = (PullToRefreshLayout) findViewById(R.id.ptr_layout);
		tv1 = (TextView)findViewById(R.id.textView1);
		getWindow().setBackgroundDrawableResource(R.drawable.americanidiot_cover2);
		getActionBar().setDisplayHomeAsUpEnabled(true);
		
		//Automatically scroll view
				boolean scroll = PreferenceManager.getDefaultSharedPreferences(this).getBoolean("scroll", false);
				if(scroll)
				{
					//Pull to refresh
					ActionBarPullToRefresh.from(this)
					.allChildrenArePullable()
					.listener(this)
					.setup(mPullToRefreshLayout);
				}

				//Display
				boolean display = PreferenceManager.getDefaultSharedPreferences(this).getBoolean("display", false);
				if(display)
				{
					tv1.setKeepScreenOn(true);
				}
				
				//Touch
				boolean touch = PreferenceManager.getDefaultSharedPreferences(this).getBoolean("touch", false);
				if(touch)
				{
					
				}
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
			    Logger log = LoggerFactory.getLogger(Extraordgirl.class);
			    log.info("American Idiot/Extraordinary Girl");
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
		        		getString(R.string.americanidiot_album) +
		        		getString(R.string.track_length) +
		        		"<font color='#006500'><i>3:33</i></font><br><br>" + 
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
		
		//Pull to refresh listener
				@Override
				public void onRefreshStarted(View view) {
					// TODO Auto-generated method stub
						new CountDownTimer(213000, 250) {          
							final ScrollView sv = (ScrollView) findViewById(R.id.sv);
							 public void onTick(long millisUntilFinished) {             
							   sv.scrollBy(0, 1);         
							 }          
				
							 public void onFinish() {  
								 Crouton.makeText(Extraordgirl.this, "Finished", Style.CONFIRM).show();
								 mPullToRefreshLayout.setRefreshComplete();
							 }      
							}.start();
				}
	}
