package com.greenday.lyrics;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

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
IntentFilter iF = new IntentFilter();
iF.addAction("com.android.music.metachanged");
iF.addAction("com.android.music.playstatechanged");
iF.addAction("com.android.music.playbackcomplete");
iF.addAction("com.android.music.queuechanged");

registerReceiver(mReceiver, iF);
}

private BroadcastReceiver mReceiver = new BroadcastReceiver() {

@Override
public void onReceive(Context context, Intent intent)
{
String action = intent.getAction();
String cmd = intent.getStringExtra("command");
Log.d("mIntentReceiver.onReceive ", action + " / " + cmd);
String artist = intent.getStringExtra("artist");
final String album = intent.getStringExtra("album");
final String track = intent.getStringExtra("track");
Log.d("Music",artist+":"+album+":"+track);
Button b=(Button) findViewById(R.id.button1);
b.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		Intent intent = new Intent(Nowplaying.this, Allsongs.class);
    	intent.putExtra("track", track.toString());
    	startActivity(intent);
		return ;
	}
});
}
};
}