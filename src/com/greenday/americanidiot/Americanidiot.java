package com.greenday.americanidiot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.greenday.lyrics.Allsongs;
import com.greenday.lyrics.R;
import com.greenday.lyrics.Report;
import com.greenday.lyrics.Settings;
import com.greenday.lyrics.Util;

import de.keyboardsurfer.android.widget.crouton.Crouton;
import de.keyboardsurfer.android.widget.crouton.Style;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.Html;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class Americanidiot extends Activity {
	//private PullToRefreshLayout mPullToRefreshLayout;
	TextView tv1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
    	
		//Set theme must be used before super.oncreate or any other layout declaration
		Util.setAppTheme(this);

		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.americanidiot_americanidiot);
		tv1 = (TextView)findViewById(R.id.textView1);
		//mPullToRefreshLayout = (PullToRefreshLayout) findViewById(R.id.ptr_layout);
		findViewById(R.id.sv);
		getWindow().setBackgroundDrawableResource(R.drawable.americanidiot_cover2);
		getActionBar().setDisplayHomeAsUpEnabled(true);
        //getActionBar().setHomeButtonEnabled(true);
		
		//Automatically scroll view
		/*SharedPreferences prefs = 
		boolean scroll = getSharedPreferences("SETTINGS_PREF", MODE_PRIVATE)
				PreferenceManager.getDefaultSharedPreferences(this).getBoolean("scroll", false);
		if(scroll)
		{
			//Pull to refresh
			ActionBarPullToRefresh.from(this)
			.allChildrenArePullable()
			.listener(this)
			.setup(mPullToRefreshLayout);
		}*/

		//Display
		boolean display = PreferenceManager.getDefaultSharedPreferences(this).getBoolean("display", false);
		if(display)
		{
			Report.warning(this);
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
			ConnectivityManager connMgr = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
			NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();
			if (networkInfo != null && networkInfo.isConnected()) 
			{
			Logger log = LoggerFactory.getLogger(Americanidiot.class);
			log.info("American Idiot/American Idiot");
			Report.report1(this);
			}
			else
			{
				Crouton.makeText(this, "Unable to report while offline", Style.ALERT).show();
			}
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
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
	}

	/*Pull to refresh listener
	@Override
	public void onRefreshStarted(View view) {
		// TODO Auto-generated method stub
			final ScrollView sv = (ScrollView) findViewById(R.id.sv);
			new CountDownTimer(174000, 250) {          
				
				 public void onTick(long millisUntilFinished) {             
				   sv.scrollBy(0, 1);         
				 }          
	
				 public void onFinish() {  
					 Crouton.makeText(Americanidiot.this, "Finished", Style.CONFIRM).show();
					 mPullToRefreshLayout.setRefreshComplete();
				 }      
				}.start();
	}*/
}
