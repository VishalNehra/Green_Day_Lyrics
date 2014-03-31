package com.greenday.uno;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.Html;

import com.greenday.lyrics.R;

public class Info {
	
	public static void info1(final Context c)
	{
		//Nuclear Family
		new AlertDialog.Builder(c)
        .setMessage(Html.fromHtml(c.getString(R.string.album)+
        		c.getString(R.string.uno_album) +
        		c.getString(R.string.track_length) +
        		"<font color='#006500'><i>3:03</font></i><br><br>" + 
        		c.getString(R.string.writers) +
        		"<font color='#006500'>Billie Joe Armstrong, Frank E. Iii Wright, Mike Pritchard, Michael Pritchard</font><br><br>" +
        		c.getString(R.string.copyright) +
        		c.getString(R.string.copyright1)))
        .setNeutralButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        })
        .show(); 
	}
	
	public static void info2(final Context c)
	{
		//Stay The Night
		new AlertDialog.Builder(c)
        .setMessage(Html.fromHtml(c.getString(R.string.album)+
        		c.getString(R.string.uno_album) +
        		c.getString(R.string.track_length) +
        		"<font color='#006500'><i>4:36</font></i><br><br>" + 
        		c.getString(R.string.writers) +
        		"<font color='#006500'>Billie Joe Armstrong, Frank E. Iii Wright, Mike Pritchard, Michael Pritchard</font><br><br>" +
        		c.getString(R.string.copyright) +
        		c.getString(R.string.copyright1)))
        .setNegativeButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        })
        .show();    
	}
	
	public static void info3(final Context c)
	{
		//Carpe Diem
		new AlertDialog.Builder(c)
        .setMessage(Html.fromHtml(c.getString(R.string.album)+
        		c.getString(R.string.uno_album) +
        		c.getString(R.string.track_length) +
        		"<font color='#006500'><i>3:25</font></i><br><br>" + 
        		c.getString(R.string.writers) +
        		"<font color='#006500'>Billie Joe Armstrong, Frank E. Iii Wright, Mike Pritchard, Michael Pritchard</font><br><br>" +
        		c.getString(R.string.copyright) +
        		c.getString(R.string.copyright1)))
        .setNeutralButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        })
        .show();    
	}
	
	public static void info4(final Context c)
	{
		//Let Yourself Go
		new AlertDialog.Builder(c)
        .setMessage(Html.fromHtml(c.getString(R.string.album)+
        		c.getString(R.string.uno_album) +
        		c.getString(R.string.track_length) +
        		"<font color='#006500'><i>2:57</font></i><br><br>" + 
        		c.getString(R.string.writers) +
        		"<font color='#006500'>Michael Pritchard, Billie Joe Armstrong, Frank E. Iii Wright, Mike Pritchard</font><br><br>" +
        		c.getString(R.string.copyright) +
        		c.getString(R.string.copyright1)))
        .setNeutralButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        })
        .show();    
	}
	
	public static void info5(final Context c)
	{
		//Kill The DJ
		new AlertDialog.Builder(c)
        .setMessage(Html.fromHtml(c.getString(R.string.album)+
        		c.getString(R.string.uno_album) +
        		c.getString(R.string.track_length) +
        		"<font color='#006500'><i>3:41</font></i><br><br>" + 
        		c.getString(R.string.writers) +
        		"<font color='#006500'>Billie Joe Armstrong, Tré Cool, Michael Pritchard, Mike Dirnt</font><br><br>" +
        		c.getString(R.string.copyright) +
        		c.getString(R.string.copyright1)))
        .setNeutralButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        })
        .show();     
	}
	
	public static void info6(final Context c)
	{
		//Fell For You
		new AlertDialog.Builder(c)
        .setMessage(Html.fromHtml(c.getString(R.string.album)+
        		c.getString(R.string.uno_album) +
        		c.getString(R.string.track_length) +
        		"<font color='#006500'><i>3:08</font></i><br><br>" + 
        		c.getString(R.string.writers) +
        		"<font color='#006500'>Billie Joe Armstrong, Frank E. Iii Wright, Mike Pritchard, Michael Pritchard</font><br><br>" +
        		c.getString(R.string.copyright) +
        		c.getString(R.string.copyright1)))
        .setNeutralButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        })
        .show();    
	}
	
	public static void info7(final Context c)
	{
		//Loss Of Control
		new AlertDialog.Builder(c)
        .setMessage(Html.fromHtml(c.getString(R.string.album)+
        		c.getString(R.string.uno_album) +
        		c.getString(R.string.track_length) +
        		"<font color='#006500'><i>3:07</font></i><br><br>" + 
        		c.getString(R.string.writers) +
        		"<font color='#006500'>Michael Pritchard, Billie Joe Armstrong, Frank E. Iii Wright, Mike Pritchard</font><br><br>" +
        		c.getString(R.string.copyright) +
        		c.getString(R.string.copyright1)))
        .setNeutralButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        })
        .show();    
	}
	
	public static void info8(final Context c)
	{
		//Troublemaker
		new AlertDialog.Builder(c)
        .setMessage(Html.fromHtml(c.getString(R.string.album)+
        		c.getString(R.string.uno_album) +
        		c.getString(R.string.track_length) +
        		"<font color='#006500'><i>2:45</font></i><br><br>" + 
        		c.getString(R.string.writers) +
        		"<font color='#006500'>Billie Joe Armstrong, Frank E. Iii Wright, Mike Pritchard, Michael Pritchard</font><br><br>" +
        		c.getString(R.string.copyright) +
        		c.getString(R.string.copyright1)))
        .setNeutralButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        })
        .show();        
	}
	
	public static void info9(final Context c)
	{
		//Angel Blue
		new AlertDialog.Builder(c)
        .setMessage(Html.fromHtml(c.getString(R.string.album)+
        		c.getString(R.string.uno_album) +
        		c.getString(R.string.track_length) +
        		"<font color='#006500'><i>2:46</font></i><br><br>" + 
        		c.getString(R.string.writers) +
        		"<font color='#006500'>Billie Joe Armstrong, Frank E. Iii Wright, Mike Pritchard, Michael Pritchard</font><br><br>" +
        		c.getString(R.string.copyright) +
        		c.getString(R.string.copyright1)))
        .setNeutralButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        })
        .show();    
	}
	
	public static void info10(final Context c)
	{
		//Sweet 16
		new AlertDialog.Builder(c)
        .setMessage(Html.fromHtml(c.getString(R.string.album)+
        		c.getString(R.string.uno_album) +
        		c.getString(R.string.track_length) +
        		"<font color='#006500'><i>3:03</font></i><br><br>" + 
        		c.getString(R.string.writers) +
        		"<font color='#006500'>Billie Joe Armstrong, Frank E. Iii Wright, Mike Pritchard, Michael Pritchard</font><br><br>" +
        		c.getString(R.string.copyright) +
        		c.getString(R.string.copyright1)))
        .setNeutralButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        })
        .show();    
	}
	
	public static void info11(final Context c)
	{
		//Rusty James
		new AlertDialog.Builder(c)
        .setMessage(Html.fromHtml(c.getString(R.string.album)+
        		c.getString(R.string.uno_album) +
        		c.getString(R.string.track_length) +
        		"<font color='#006500'><i>4:09</font></i><br><br>" + 
        		c.getString(R.string.writers) +
        		"<font color='#006500'>Billie Joe Armstrong, Tré Cool, Michael Pritchard, Mike Dirnt</font><br><br>" +
        		c.getString(R.string.copyright) +
        		c.getString(R.string.copyright1)))
        .setNeutralButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        })
        .show();     
	}
	
	public static void info12(final Context c)
	{
		//Oh Love
		new AlertDialog.Builder(c)
        .setMessage(Html.fromHtml(c.getString(R.string.album)+
        		c.getString(R.string.uno_album) +
        		c.getString(R.string.track_length) +
        		"<font color='#006500'><i>5:03</font></i><br><br>" + 
        		c.getString(R.string.writers) +
        		"<font color='#006500'>Billie Joe Armstrong, Frank E. Iii Wright, Mike Pritchard, Michael Pritchard</font><br><br>" +
        		c.getString(R.string.copyright) +
        		c.getString(R.string.copyright1)))
        .setNeutralButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        })
        .show();    
	}

}
