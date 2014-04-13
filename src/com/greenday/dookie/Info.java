package com.greenday.dookie;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.Html;

import com.greenday.lyrics.R;

public class Info {
	
	public static void info1(final Context c)
	{
		//All By Myself
		new AlertDialog.Builder(c)
        .setMessage(Html.fromHtml(c.getString(R.string.album)+
        		c.getString(R.string.dookie_album) +
        		c.getString(R.string.track_length) +
        		"<font color='#006500'><i>1:35</i></font><br><br>" + 
        		c.getString(R.string.writers) +
        		"<font color='#006500'>Billie Joe Armstrong, Frank E. Iii Wright, Michael Pritchard</font><br><br>" +
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
		//Burnout
		new AlertDialog.Builder(c)
        .setMessage(Html.fromHtml(c.getString(R.string.album)+
        		c.getString(R.string.dookie_album) +
        		c.getString(R.string.track_length) +
        		"<font color='#006500'><i>2:07</font></i><br><br>" + 
        		c.getString(R.string.writers) +
        		"<font color='#006500'>Michael Pritchard, Conrad Shafie, Billie Joe Armstrong, Frank E. Iii Wright</font><br><br>" +
        		c.getString(R.string.copyright) +
        		"<font color='#006500'>Emi Music Publishing Ltd., Green Daze Music, WB Music Corp.</font>"))
        .setNeutralButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        })
        .show();  
	}
	
	public static void info3(final Context c)
	{
		//Having A Blast
		new AlertDialog.Builder(c)
        .setMessage(Html.fromHtml(c.getString(R.string.album)+
        		c.getString(R.string.dookie_album) +
        		c.getString(R.string.track_length) +
        		"<font color='#006500'><i>2:44</font></i><br><br>" + 
        		c.getString(R.string.writers) +
        		"<font color='#006500'>Michael Pritchard, Billie Joe Armstrong, Frank E. Iii Wright</font><br><br>" +
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
		//Chump
		new AlertDialog.Builder(c)
        .setMessage(Html.fromHtml(c.getString(R.string.album)+
        		c.getString(R.string.dookie_album) +
        		c.getString(R.string.track_length) +
        		"<font color='#006500'><i>2:54</font></i><br><br>" + 
        		c.getString(R.string.writers) +
        		"<font color='#006500'>Michael Pritchard, Billie Joe Armstrong, Frank E. Iii Wright</font><br><br>" +
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
		//Longview
		new AlertDialog.Builder(c)
        .setMessage(Html.fromHtml(c.getString(R.string.album)+
        		c.getString(R.string.dookie_album) +
        		c.getString(R.string.track_length) +
        		"<font color='#006500'><i>3:59</font></i><br><br>" + 
        		c.getString(R.string.writers) +
        		"<font color='#006500'>Michael Pritchard, Billie Joe Armstrong, Frank E. Iii Wright</font><br><br>" +
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
		//Welcome To Paradise
		new AlertDialog.Builder(c)
        .setMessage(Html.fromHtml("<font color='#524ef8'><b><u>INFORMATION</font></b></u><br>" +
        		"<font color='#006500'><i>Re-recorded version from Kerplunk</font></i><br><br>" + 
        		c.getString(R.string.album)+
        		c.getString(R.string.dookie_album) +
        		c.getString(R.string.track_length) +
        		"<font color='#006500'><i>3:44</font></i><br><br>" + 
        		c.getString(R.string.writers) +
        		"<font color='#006500'>Billie Joe Armstrong, Frank E. Iii Wright, Michael Pritchard</font><br><br>" +
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
		//Pulling Teeth
		new AlertDialog.Builder(c)
        .setMessage(Html.fromHtml(c.getString(R.string.album)+
        		c.getString(R.string.dookie_album) +
        		c.getString(R.string.track_length) +
        		"<font color='#006500'><i>2:31</font></i><br><br>" + 
        		c.getString(R.string.writers) +
        		"<font color='#006500'>Michael Pritchard, Billie Joe Armstrong, Frank E. Iii Wright</font><br><br>" +
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
		//Basket Case
		new AlertDialog.Builder(c)
        .setMessage(Html.fromHtml(c.getString(R.string.album)+
        		c.getString(R.string.dookie_album) +
        		c.getString(R.string.track_length) +
        		"<font color='#006500'><i>3:01</font></i><br><br>" + 
        		c.getString(R.string.writers) +
        		"<font color='#006500'>Michael Pritchard, Billie Joe Armstrong, Frank E. Iii Wright</font><br><br>" +
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
		//She
		new AlertDialog.Builder(c)
        .setMessage(Html.fromHtml(c.getString(R.string.album)+
        		c.getString(R.string.dookie_album) +
        		c.getString(R.string.track_length) +
        		"<font color='#006500'><i>2:14</font></i><br><br>" + 
        		c.getString(R.string.writers) +
        		"<font color='#006500'>Michael Pritchard, Al Schnier, Rob Derhak, Billie Joe Armstrong, Chuck Garvey, Frank E. Iii Wright</font><br><br>" +
        		c.getString(R.string.copyright) +
        		"<font color='#006500'>Green Daze Music, Spaz Medicine Music Inc., WB Music Corp.</font>"))
        .setNeutralButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        })
        .show();    
	}
	
	public static void info10(final Context c)
	{
		//Sassafras Roots
		new AlertDialog.Builder(c)
        .setMessage(Html.fromHtml(c.getString(R.string.album)+
        		c.getString(R.string.dookie_album) +
        		c.getString(R.string.track_length) +
        		"<font color='#006500'><i>2:37</font></i><br><br>" + 
        		c.getString(R.string.writers) +
        		"<font color='#006500'>Michael Pritchard, Billie Joe Armstrong, Frank E. Iii Wright</font><br><br>" +
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
		//When I Come Around
		new AlertDialog.Builder(c)
        .setMessage(Html.fromHtml(c.getString(R.string.album)+
        		c.getString(R.string.dookie_album) +
        		c.getString(R.string.track_length) +
        		"<font color='#006500'><i>2:58</font></i><br><br>" + 
        		c.getString(R.string.writers) +
        		"<font color='#006500'>Billie Joe Armstrong, Frank E. Iii Wright, Michael Pritchard</font><br><br>" +
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
		//Coming Clean
		new AlertDialog.Builder(c)
        .setMessage(Html.fromHtml(c.getString(R.string.album)+
        		c.getString(R.string.dookie_album) +
        		c.getString(R.string.track_length) +
        		"<font color='#006500'><i>1:34</font></i><br><br>" + 
        		c.getString(R.string.writers) +
        		"<font color='#006500'>Michael Pritchard, Billie Joe Armstrong, Frank E. Iii Wright</font><br><br>" +
        		c.getString(R.string.copyright) +
        		c.getString(R.string.copyright1)))
        .setNeutralButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        })
        .show();  
	}
	
	public static void info13(final Context c)
	{
		//Emenius Sleepus
		new AlertDialog.Builder(c)
        .setMessage(Html.fromHtml(c.getString(R.string.album)+
        		c.getString(R.string.dookie_album) +
        		c.getString(R.string.track_length) +
        		"<font color='#006500'><i>1:43</font></i><br><br>" + 
        		c.getString(R.string.writers) +
        		"<font color='#006500'>Mike Dirnt, Michael Pritchard, Billie Joe Armstrong, Frank E. Iii Wright</font><br><br>" +
        		c.getString(R.string.copyright) +
        		c.getString(R.string.copyright1)))
        .setNeutralButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        })
        .show();
	}
	
	public static void info14(final Context c)
	{
		//In The End
		new AlertDialog.Builder(c)
        .setMessage(Html.fromHtml(c.getString(R.string.album)+
        		c.getString(R.string.dookie_album) +
        		c.getString(R.string.track_length) +
        		"<font color='#006500'><i>1:46</font></i><br><br>" + 
        		c.getString(R.string.writers) +
        		"<font color='#006500'>Michael Pritchard, Billie Joe Armstrong, Frank E. Iii Wright</font><br><br>" +
        		c.getString(R.string.copyright) +
        		c.getString(R.string.copyright1)))
        .setNeutralButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        })
        .show();   
	}
	
	public static void info15(final Context c)
	{
		//FOD
		new AlertDialog.Builder(c)
        .setMessage(Html.fromHtml("<font color='#524ef8'><b><u>INFORMATION</font></u></b><br>" +
        		"<font color='#006500'><i>Song ends at 2:50, followed by hidden track 'All by Myself' performed by Tré Cool, which starts at 4:07</font></i><br><br>" +
        		c.getString(R.string.album)+
        		c.getString(R.string.dookie_album) +
        		c.getString(R.string.track_length) +
        		"<font color='#006500'><i>5:46</font></i></b><br><br>" + 
        		c.getString(R.string.writers) +
        		"<font color='#006500'>Michael Pritchard, Billie Joe Armstrong, Frank E. Iii Wright</font><br><br>" +
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