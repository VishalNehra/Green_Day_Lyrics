package com.greenday.americanidiot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import uk.co.senab.actionbarpulltorefresh.library.ActionBarPullToRefresh;
import uk.co.senab.actionbarpulltorefresh.library.PullToRefreshLayout;
import uk.co.senab.actionbarpulltorefresh.library.listeners.OnRefreshListener;

import com.espian.showcaseview.ShowcaseView;
import com.greenday.lyrics.Allsongs;
import com.greenday.lyrics.Nowplaying;
import com.greenday.lyrics.R;
import com.greenday.lyrics.Reportsong;
import com.greenday.lyrics.Settings;

import de.keyboardsurfer.android.widget.crouton.Crouton;
import de.keyboardsurfer.android.widget.crouton.Style;

import android.R.string;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.FragmentManager.BackStackEntry;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.preference.PreferenceManager;
import android.text.Html;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ScrollView;
import android.widget.TextView;

public class Americanidiot extends Activity {
	private PullToRefreshLayout mPullToRefreshLayout;
	TextView tv1;
	ShowcaseView sv;
	@Override
	protected void onCreate(Bundle savedInstanceState) {

		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.americanidiot_americanidiot);
		tv1 = (TextView)findViewById(R.id.textView1);
		mPullToRefreshLayout = (PullToRefreshLayout) findViewById(R.id.ptr_layout);
		ActionBarPullToRefresh.from(this)
		.allChildrenArePullable()
		.listener((OnRefreshListener) this)
		.setup(mPullToRefreshLayout);
		getWindow().setBackgroundDrawableResource(R.drawable.americanidiot_cover2);
		getActionBar().setDisplayHomeAsUpEnabled(true);
        //getActionBar().setHomeButtonEnabled(true);
		//Automatically scroll view
		/*SharedPreferences prefs = */
		boolean scroll = /*getSharedPreferences("SETTINGS_PREF", MODE_PRIVATE)*/
				PreferenceManager.getDefaultSharedPreferences(this).getBoolean("scroll", false);
		if(scroll)
		{
			final ScrollView sv = (ScrollView) findViewById(R.id.sv);
			new CountDownTimer(174000, 250) {          
	
				 public void onTick(long millisUntilFinished) {             
				   sv.scrollBy(0, 1);         
				 }          
	
				 public void onFinish() {  
					 Crouton.makeText(Americanidiot.this, "Finished", Style.INFO).show();
				 }      
				 
				}.start();
				
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
			tv1.setOnDragListener(null);
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
		if(item.getItemId()==R.id.action_label)
		{
			//Info
			/*AlertDialog builder = */new AlertDialog.Builder(Americanidiot.this)
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
	            return super.onOptionsItemSelected(item);
		
	}
	
	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		getCurrentFocus().findFocus().computeScroll();
		super.onStop();
	}
	
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		getCurrentFocus().findFocus().computeScroll();
		super.onPause();
	}
	
	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		getCurrentFocus().findFocus().computeScroll();
		super.onDestroy();
	}
}
