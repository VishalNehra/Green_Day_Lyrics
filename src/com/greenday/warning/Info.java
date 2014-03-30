package com.greenday.warning;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.DialogInterface.OnClickListener;
import android.text.Html;

import com.greenday.lyrics.MainActivity;
import com.greenday.lyrics.R;

public class Info {
	
	public static void info1(final Context context)
	{
		//Warning
		new AlertDialog.Builder(context)
        .setMessage(Html.fromHtml(context.getString(R.string.album)+
        		context.getString(R.string.warning_album) +
        		context.getString(R.string.track_length) +
        		"<font color='#006500'><i>3:42</font></i><br><br>" + 
        		context.getString(R.string.writers) +
        		"<font color='#006500'>Billie Joe Armstrong, Frank E. Iii Wright, Michael Pritchard</font><br><br>" +
        		context.getString(R.string.copyright) +
        		context.getString(R.string.copyright1)))
        .setNeutralButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        })
        .show();    
	}
	
	public static void info2(final Context context)
	{
		//Blood, Sex & Booze
		new AlertDialog.Builder(context)
        .setMessage(Html.fromHtml(context.getString(R.string.album)+
        		context.getString(R.string.warning_album) +
        		context.getString(R.string.track_length) +
        		"<font color='#006500'><i>3:33</font></i><br><br>" + 
        		context.getString(R.string.writers) +
        		"<font color='#006500'>Billie Joe Armstrong, Frank E. Iii Wright, Michael Pritchard</font><br><br>" +
        		context.getString(R.string.copyright) +
        		context.getString(R.string.copyright1)))
        .setNeutralButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        })
        .show();    
	}
	
	public static void info3(final Context context)
	{
		//Church on Sunday
		new AlertDialog.Builder(context)
        .setMessage(Html.fromHtml(context.getString(R.string.album)+
        		context.getString(R.string.warning_album) +
        		context.getString(R.string.track_length) +
        		"<font color='#006500'><i>3:18</font></i><br><br>" + 
        		context.getString(R.string.writers) +
        		"<font color='#006500'>Billie Joe Armstrong, Frank E. Iii Wright, Michael Pritchard</font><br><br>" +
        		context.getString(R.string.copyright) +
        		context.getString(R.string.copyright1)))
        .setNeutralButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        })
        .show();    
	}
	
	public static void info4(final Context context)
	{
		//Fashion Victim
		new AlertDialog.Builder(context)
        .setMessage(Html.fromHtml(context.getString(R.string.album)+
        		context.getString(R.string.warning_album) +
        		context.getString(R.string.track_length) +
        		"<font color='#006500'><i>2:48</font></i><br><br>" + 
        		context.getString(R.string.writers) +
        		"<font color='#006500'>Billie Joe Armstrong, Frank E. Iii Wright, Michael Pritchard</font><br><br>" +
        		context.getString(R.string.copyright) +
        		context.getString(R.string.copyright1)))
        .setNeutralButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        })
        .show();    
	}
	
	public static void info5(final Context context)
	{
		//Castaway
		new AlertDialog.Builder(context)
        .setMessage(Html.fromHtml(context.getString(R.string.album)+
        		context.getString(R.string.warning_album) +
        		context.getString(R.string.track_length) +
        		"<font color='#006500'><i>3:52</font></i><br><br>" + 
        		context.getString(R.string.writers) +
        		"<font color='#006500'>Billie Joe Armstrong, Frank E. Iii Wright, Michael Pritchard</font><br><br>" +
        		context.getString(R.string.copyright) +
        		context.getString(R.string.copyright1)))
        .setNeutralButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        })
        .show();     
	}
	
	public static void info6(final Context context)
	{
		//Misery
		new AlertDialog.Builder(context)
        .setMessage(Html.fromHtml(context.getString(R.string.album)+
        		context.getString(R.string.warning_album) +
        		context.getString(R.string.track_length) +
        		"<font color='#006500'><i>5:05</font></i><br><br>" + 
        		context.getString(R.string.writers) +
        		"<font color='#006500'>Billie Joe Armstrong, Frank E. Iii Wright, Michael Pritchard</font><br><br>" +
        		context.getString(R.string.copyright) +
        		context.getString(R.string.copyright1)))
        .setNeutralButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        })
        .show();    
	}
	
	public static void info7(final Context context)
	{
		//Deadbeat Holiday
		new AlertDialog.Builder(context)
        .setMessage(Html.fromHtml(context.getString(R.string.album)+
        		context.getString(R.string.warning_album) +
        		context.getString(R.string.track_length) +
        		"<font color='#006500'><i>3:35</font></i><br><br>" + 
        		context.getString(R.string.writers) +
        		"<font color='#006500'>Billie Joe Armstrong, Frank E. Iii Wright, Michael Pritchard</font><br><br>" +
        		context.getString(R.string.copyright) +
        		context.getString(R.string.copyright1)))
        .setNeutralButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        })
        .show();    
	}
	
	public static void info8(final Context context)
	{
		//Hold On
		new AlertDialog.Builder(context)
        .setMessage(Html.fromHtml(context.getString(R.string.album)+
        		context.getString(R.string.warning_album) +
        		context.getString(R.string.track_length) +
        		"<font color='#006500'><i>2:56</font></i><br><br>" + 
        		context.getString(R.string.writers) +
        		"<font color='#006500'>Billie Joe Armstrong, Frank E. Iii Wright, Michael Pritchard</font><br><br>" +
        		context.getString(R.string.copyright) +
        		context.getString(R.string.copyright1)))
        .setNeutralButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        })
        .show();   
	}
	
	public static void info9(final Context context)
	{
		//Jackass
		new AlertDialog.Builder(context)
        .setMessage(Html.fromHtml(context.getString(R.string.album)+
        		context.getString(R.string.warning_album) +
        		context.getString(R.string.track_length) +
        		"<font color='#006500'><i>2:43</font></i><br><br>" + 
        		context.getString(R.string.writers) +
        		"<font color='#006500'>Billie Joe Armstrong, Frank E. Iii Wright, Michael Pritchard</font><br><br>" +
        		context.getString(R.string.copyright) +
        		context.getString(R.string.copyright1)))
        .setNeutralButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        })
        .show();    
	}
	
	public static void info10(final Context context)
	{
		//Waiting
		new AlertDialog.Builder(context)
        .setMessage(Html.fromHtml(context.getString(R.string.album)+
        		context.getString(R.string.warning_album) +
        		context.getString(R.string.track_length) +
        		"<font color='#006500'><i>3:13</font></i><br><br>" + 
        		context.getString(R.string.writers) +
        		"<font color='#006500'>Billy Armstrong, Frank Wright Iii, Billie Joe Armstrong, Walter Gil Fuller, Tony Hatch, Michael Pritchard, Dizzy Gillespie, Frank E. Iii Wright</font><br><br>" +
        		context.getString(R.string.copyright) +
        		"<font color='#006500'>Warner Chappell Music Ltd., Sony/ATV Music Publishing (Uk) Limited, Welbeck Music Ltd., Green Daze Music, Consolidated Music Publishers A Div Of Music Sales Corp., WB Music Corp.</font>"))
        .setNeutralButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
            	dialog.cancel();
            }
        })
        .show();     
	}
	
	public static void info11(final Context context)
	{
		//Minority
		new AlertDialog.Builder(context)
        .setMessage(Html.fromHtml(context.getString(R.string.album)+
        		context.getString(R.string.warning_album) +
        		context.getString(R.string.track_length) +
        		"<font color='#006500'><i>2:49</font></i><br><br>" + 
        		context.getString(R.string.writers) +
        		"<font color='#006500'>Billie Joe Armstrong, Frank E. Iii Wright, Michael Pritchard</font><br><br>" +
        		context.getString(R.string.copyright) +
        		context.getString(R.string.copyright1)))
        .setNeutralButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        })
        .show();    
	}
	
	public static void info12(final Context context)
	{
		//Macy's Day Parade
		new AlertDialog.Builder(context)
        .setMessage(Html.fromHtml(context.getString(R.string.album)+
        		context.getString(R.string.warning_album) +
        		context.getString(R.string.track_length) +
        		"<font color='#006500'><i>3:34</font></i><br><br>" + 
        		context.getString(R.string.writers) +
        		"<font color='#006500'>Billie Joe Armstrong, Frank E. Iii Wright, Michael Pritchard</font><br><br>" +
        		context.getString(R.string.copyright) +
        		context.getString(R.string.copyright1)))
        .setNeutralButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        })
        .show();    
	}
}
