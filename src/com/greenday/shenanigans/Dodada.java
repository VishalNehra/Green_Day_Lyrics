package com.greenday.shenanigans;

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

public class Dodada extends Activity {
	
	TextView tv1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.shenanigans_dodada);
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
			    Logger log = LoggerFactory.getLogger(Dodada.class);
			    log.info("Shenanigans/DO DA DA");
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
				AlertDialog builder = new AlertDialog.Builder(Dodada.this)
		        .setMessage(Html.fromHtml("<font color='#524ef8'><b><u>INFORMATION</font></b></u><br>" +
		        		"<font color='#006500'>From <i>'Brain Stew/Jaded', 1996</i></font><br><br>" +
		        		getString(R.string.album)+
		        		getString(R.string.shenanigans_album) +
		        		getString(R.string.track_length) +
		        		"<font color='#006500'><i>1:30</font></i><br><br>" + 
		        		getString(R.string.writers) +
		        		"<font color='#006500'>Michael Pritchard, Billie Joe Armstrong, Frank E. Iii Wright, Mike Pritchard</font><br><br>" +
		        		getString(R.string.copyright) +
		        		getString(R.string.copyright1)))
		        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
		            public void onClick(DialogInterface dialog, int which) {
		                closeContextMenu();
		            }
		        })
		        .setNegativeButton("Go To Originals", new DialogInterface.OnClickListener() {
		            public void onClick(DialogInterface dialog, int which) {
		            	AlertDialog builder2 = new AlertDialog.Builder(Dodada.this)
				        
				        .setNeutralButton("Brain Stew", new DialogInterface.OnClickListener() {
				            public void onClick(DialogInterface dialog, int which) {
				            	Intent intent=new Intent(Dodada.this, com.greenday.insomniac.Brainstew.class);
				                startActivity(intent);
				            }
				        })
				        .setNegativeButton("Jaded", new DialogInterface.OnClickListener() {
				            public void onClick(DialogInterface dialog, int which) {
				                Intent intent=new Intent(Dodada.this, com.greenday.insomniac.Jaded.class);
				                startActivity(intent);
				            }
				        })
				        .setPositiveButton("Close", new DialogInterface.OnClickListener() {
				            public void onClick(DialogInterface dialog, int which) {
				                closeContextMenu();
				            }
				        })
				        .show();    
		            }
		        })
		        .show();    
			}
		            return super.onOptionsItemSelected(item);
			
		}
		
	}
