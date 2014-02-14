package com.greenday.ins;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.greenday.americanidiot.Arewethewaiting;
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
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.TextView;

public class Hitchinaride extends Activity {
	
	TextView tv1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ins_hitchinaride);
		tv1 = (TextView)findViewById(R.id.textView1);
		getActionBar().setDisplayHomeAsUpEnabled(true);
		getWindow().setBackgroundDrawableResource(R.drawable.ins_cover2);
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
				    Logger log = LoggerFactory.getLogger(Hitchinaride.class);
				    log.info("International Superhits/Hitchin' A Ride");
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
					AlertDialog builder = new AlertDialog.Builder(Hitchinaride.this)
			        .setMessage(Html.fromHtml("<font color='#524ef8'><b><u>From</font></b></u><br>" +
			        		"<font color='#006500'>Nimrod, <i>1997</i></font>"))
			        .setNeutralButton("OK", new DialogInterface.OnClickListener() {
			            public void onClick(DialogInterface dialog, int which) {
			                closeContextMenu();
			            }
			        })
			        .setNegativeButton("Go To Original", new DialogInterface.OnClickListener() {
			            public void onClick(DialogInterface dialog, int which) {
			                Intent intent=new Intent(Hitchinaride.this, com.greenday.nimrod.Hitchinaride.class);
			                startActivity(intent);
			            }
			        })
			        .show();  
				}
			            return super.onOptionsItemSelected(item);
				
			}
			
		}
