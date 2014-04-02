package com.greenday.tre;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.Html;

import com.greenday.lyrics.R;

public class Info {
	
	public static void info1(final Context c)
	{
		//Brutal Love
		new AlertDialog.Builder(c)
        .setMessage(Html.fromHtml(c.getString(R.string.album)+
        		c.getString(R.string.tre_album) +
        		c.getString(R.string.track_length) +
        		"<font color='#006500'><i>4:54</font></i><br><br>" + 
        		c.getString(R.string.writers) +
        		"<font color='#006500'>Billie Joe Armstrong, Sam Cooke, Tré Cool, Mike Dirnt</font><br><br>" +
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
		//Missing You
		new AlertDialog.Builder(c)
        .setMessage(Html.fromHtml(c.getString(R.string.album)+
        		c.getString(R.string.tre_album) +
        		c.getString(R.string.track_length) +
        		"<font color='#006500'><i>3:43</font></i><br><br>" + 
        		c.getString(R.string.writers) +
        		"<font color='#006500'>Tré Cool, Billie Joe Armstrong, Mike Dirnt, joe L. Thomas, Dallas Austin</font><br><br>" +
        		c.getString(R.string.copyright) +
        		"<font color='#006500'>Universal Music - Z Tunes LLC, Emi Blackwood Music Inc., 563 Music Publishing, Green Daze Music, WB Music Corp.</font>"))
        .setNeutralButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        })
        .show();    
	}
	
	public static void info3(final Context c)
	{
		//8th Avenue Serenade
		new AlertDialog.Builder(c)
        .setMessage(Html.fromHtml(c.getString(R.string.album)+
        		c.getString(R.string.tre_album) +
        		c.getString(R.string.track_length) +
        		"<font color='#006500'><i>2:36</font></i><br><br>" + 
        		c.getString(R.string.writers) +
        		"<font color='#006500'>Billie Joe Armstrong, Tré Cool, Mike Dirnt</font><br><br>" +
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
		//Drama Queen
		new AlertDialog.Builder(c)
        .setMessage(Html.fromHtml(c.getString(R.string.album)+
        		c.getString(R.string.tre_album) +
        		c.getString(R.string.track_length) +
        		"<font color='#006500'><i>3:07</font></i><br><br>" + 
        		c.getString(R.string.writers) +
        		"<font color='#006500'>Billie Joe Armstrong, Tré Cool, Mike Dirnt</font><br><br>" +
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
		//X-Kid
		new AlertDialog.Builder(c)
        .setMessage(Html.fromHtml(c.getString(R.string.album)+
        		c.getString(R.string.tre_album) +
        		c.getString(R.string.track_length) +
        		"<font color='#006500'><i>3:41</font></i><br><br>" + 
        		c.getString(R.string.writers) +
        		"<font color='#006500'>Billie Joe Armstrong, Tré Cool, Mike Dirnt</font><br><br>" +
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
		//Sex, Drugs & Violence
		new AlertDialog.Builder(c)
        .setMessage(Html.fromHtml(c.getString(R.string.album)+
        		c.getString(R.string.tre_album) +
        		c.getString(R.string.track_length) +
        		"<font color='#006500'><i>3:31</font></i><br><br>" + 
        		c.getString(R.string.writers) +
        		"<font color='#006500'>Billie Joe Armstrong, Tré Cool, Mike Dirnt</font><br><br>" +
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
		//Little Boy Named Train
		new AlertDialog.Builder(c)
        .setMessage(Html.fromHtml(c.getString(R.string.album)+
        		c.getString(R.string.tre_album) +
        		c.getString(R.string.track_length) +
        		"<font color='#006500'><i>3:37</font></i><br><br>" + 
        		c.getString(R.string.writers) +
        		"<font color='#006500'>Billie Joe Armstrong, Tré Cool, Mike Dirnt</font><br><br>" +
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
		//Amanda
		new AlertDialog.Builder(c)
        .setMessage(Html.fromHtml(c.getString(R.string.album)+
        		c.getString(R.string.tre_album) +
        		c.getString(R.string.track_length) +
        		"<font color='#006500'><i>2:28</font></i><br><br>" + 
        		c.getString(R.string.writers) +
        		"<font color='#006500'>Billie Joe Armstrong, Tré Cool, Mike Dirnt</font><br><br>" +
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
		//Walk Away
		new AlertDialog.Builder(c)
        .setMessage(Html.fromHtml(c.getString(R.string.album)+
        		c.getString(R.string.tre_album) +
        		c.getString(R.string.track_length) +
        		"<font color='#006500'><i>3:45</font></i><br><br>" + 
        		c.getString(R.string.writers) +
        		"<font color='#006500'>Tré Cool, Billie Joe Armstrong, Mike Dirnt</font><br><br>" +
        		c.getString(R.string.copyright) +
        		"<font color='#006500'>Curb Congregation Songs, Green Daze Music, WB Music Corp.</font>"))
        .setNeutralButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        })
        .show();    
	}
	
	public static void info10(final Context c)
	{
		//Dirty Rotten Bastards
		new AlertDialog.Builder(c)
        .setMessage(Html.fromHtml(c.getString(R.string.album)+
        		c.getString(R.string.tre_album) +
        		c.getString(R.string.track_length) +
        		"<font color='#006500'><i>6:26</font></i><br><br>" + 
        		c.getString(R.string.writers) +
        		"<font color='#006500'>Billie Joe Armstrong, Tré Cool, Mike Dirnt</font><br><br>" +
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
		//99 Revolutions
		new AlertDialog.Builder(c)
        .setMessage(Html.fromHtml(c.getString(R.string.album)+
        		c.getString(R.string.tre_album) +
        		c.getString(R.string.track_length) +
        		"<font color='#006500'><i>3:49</font></i><br><br>" + 
        		c.getString(R.string.writers) +
        		"<font color='#006500'>Billie Joe Armstrong, Frank E. Iii Wright, Mike Pritchard</font><br><br>" +
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
		//The Forgotten
		new AlertDialog.Builder(c)
        .setMessage(Html.fromHtml(c.getString(R.string.album)+
        		c.getString(R.string.tre_album) +
        		c.getString(R.string.track_length) +
        		"<font color='#006500'><i>4:59</font></i><br><br>" + 
        		c.getString(R.string.writers) +
        		"<font color='#006500'>Billie Joe Armstrong, Tré Cool, Mike Dirnt</font><br><br>" +
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
