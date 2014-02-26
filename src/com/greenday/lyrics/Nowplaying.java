package com.greenday.lyrics;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.keyboardsurfer.android.widget.crouton.Crouton;
import de.keyboardsurfer.android.widget.crouton.Style;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.Html;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.TextView;

public class Nowplaying extends Activity {

public static final String SERVICECMD = "com.android.music.musicservicecommand";
public static final String CMDNAME = "command";
public static final String CMDTOGGLEPAUSE = "togglepause";
public static final String CMDSTOP = "stop";
public static final String CMDPAUSE = "pause";
public static final String CMDPREVIOUS = "previous";
public static final String CMDNEXT = "next";
/** Called when the activity is first created. */
@Override
public void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.nowplaying);
getActionBar().setDisplayHomeAsUpEnabled(true);
//moveTaskToBack(true);
IntentFilter iF = new IntentFilter();
getWindow().setBackgroundDrawableResource(R.drawable.allsongs_bg);

TextView tv=(TextView) findViewById(R.id.textView1);
tv.setText(Html.fromHtml("<br>1. Open <b><font color='#464ea3'>'Now Playing'</font></b> either from HOME or anywhere in app using Action Bar Icon.<br><br>" +
            			"2. Press on <b><font color='#464ea3'>'Search'</font></b> button in the 'Now Playing' screen <i>(below)</i>.<br><br>" +
            			"3. After that press on the <b><font color='#464ea3'>'Play'</font></b> icon in search bar of 'All Songs' in the next screen. <br><br>" +
            			"And then you will see name of your current playing song!<br>" +
            			"When you change the song, come back to <b><font color='#464ea3'>'Now Playing'</font></b> and repeat the same steps.<br>" +
            			"This feature has been successfully tested using Play Music and Apollo Music Player.<br>" +
            			"<br><br><i><u><b><font color='#e02923'>Warning!</font></b></i></u><br>" +
            			"Do Not press on play button without playing any song in media player."));

iF.addAction("com.android.music.metachanged");

registerReceiver(mReceiver, iF);
}

private BroadcastReceiver mReceiver = new BroadcastReceiver() {

@SuppressWarnings("unused")
@Override
public void onReceive(Context context, Intent intent)
{
String action = intent.getAction();
String artist = intent.getStringExtra("artist");
final String album = intent.getStringExtra("album");
final String track = intent.getStringExtra("track");
Log.d("Music",artist+":"+album+":"+track);
SharedPreferences prefs = context.getSharedPreferences(
	      "PLAYING_PREF", Context.MODE_PRIVATE);
prefs.edit().putString("song", track).commit();
finish();
ImageButton b=(ImageButton) findViewById(R.id.imageButton3);
b.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		Intent intent = new Intent(Nowplaying.this, Allsongs.class);
    	
		intent.putExtra("track", track);
    	startActivity(intent);
		return;
	}
});
}
};
//Action bar code below

@Override
public boolean onCreateOptionsMenu(Menu menu) {
    getMenuInflater().inflate(R.menu.main, menu);
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
	if(item.getItemId()==R.id.item1)
	{
		startActivity(new Intent(getApplicationContext(), Settings.class));
	}
	if(item.getItemId()==R.id.item2)
	{
		//Log report
	    Logger log = LoggerFactory.getLogger(Nowplaying.class);
	    log.info("Now Playing");
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
		Crouton.makeText(Nowplaying.this, "You are already here!", Style.INFO).show();
		Crouton.makeText(Nowplaying.this, "Follow instructions given below before using this feature", Style.ALERT).show();
	}
            return super.onOptionsItemSelected(item);
	
}

@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		unregisterReceiver(mReceiver);
		super.onDestroy();
	}

}