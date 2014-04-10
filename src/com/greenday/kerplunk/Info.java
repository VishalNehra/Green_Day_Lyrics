package com.greenday.kerplunk;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.Html;

import com.greenday.lyrics.R;

public class Info {
	
	public static void info1(final Context c)
	{
		//2000 Light Years Away
		new AlertDialog.Builder(c)			        
        .setMessage(Html.fromHtml(c.getString(R.string.album)+
        		c.getString(R.string.kerplunk_album) +
        		c.getString(R.string.track_length) +
        		"<font color='#006500'><i>2:24</i><br><br></font>" + 
        		c.getString(R.string.writers) +
        		"<font color='#006500'>Michael Pritchard, Billie Joe Armstrong, Frank E. Iii Wright, Mike Pritchard, Jesse Michaels, Pete Rypins and Dave 'E.C.' Henwood</font><br><br>" +
        		c.getString(R.string.copyright) +
        		"<font color='#006500'>Green Daze Music</font>"))
        .setNeutralButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        })
        .show();    
	}
	
	public static void info2(final Context c)
	{
		//One For The Razorbacks
		new AlertDialog.Builder(c)			        
        .setMessage(Html.fromHtml(c.getString(R.string.album)+
        		c.getString(R.string.kerplunk_album) +
        		c.getString(R.string.track_length) +
        		"<font color='#006500'><i>2:30</i><br><br></font>" + 
        		c.getString(R.string.writers) +
        		"<font color='#006500'>Billie Joe Armstrong, Frank E. Iii Wright, Mike Pritchard, Michael Pritchard</font><br><br>" +
        		c.getString(R.string.copyright) +
        		"<font color='#006500'>Green Daze Music</font>"))
        .setNeutralButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        })
        .show(); 
	}
	
	public static void info3(final Context c)
	{
		//Welcome To Paradise
		new AlertDialog.Builder(c)			        
        .setMessage(Html.fromHtml(c.getString(R.string.album)+
        		c.getString(R.string.kerplunk_album) +
        		c.getString(R.string.track_length) +
        		"<font color='#006500'><i>3:30</i><br><br></font>" + 
        		c.getString(R.string.writers) +
        		"<font color='#006500'>Michael Pritchard, Billie Joe Armstrong, Frank E. Iii Wright</font><br><br>" +
        		c.getString(R.string.copyright) +
        		"<font color='#006500'>Green Daze Music</font>"))
        .setNeutralButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        })
        .show();    
	}
	
	public static void info4(final Context c)
	{
		//Christie Road
		new AlertDialog.Builder(c)			        
        .setMessage(Html.fromHtml(c.getString(R.string.album)+
        		c.getString(R.string.kerplunk_album) +
        		c.getString(R.string.track_length) +
        		"<font color='#006500'><i>3:33</i></font><br><br>" + 
        		c.getString(R.string.writers) +
        		"<font color='#006500'>Billie Joe Armstrong, Frank E. Iii Wright, Michael Pritchard</font><br><br>" +
        		c.getString(R.string.copyright) +
        		"<font color='#006500'>Green Daze Music</font>"))
        .setNeutralButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        })
        .show();    
	}
	
	public static void info5(final Context c)
	{
		//Private Ale
		new AlertDialog.Builder(c)			        
        .setMessage(Html.fromHtml(c.getString(R.string.album)+
        		c.getString(R.string.kerplunk_album) +
        		c.getString(R.string.track_length) +
        		"<font color='#006500'><i>2:26</i><br><br></font>" + 
        		c.getString(R.string.writers) +
        		"<font color='#006500'>Michael Pritchard, Billie Joe Armstrong, Frank E. Iii Wright, Mike Pritchard</font><br><br>" +
        		c.getString(R.string.copyright) +
        		"<font color='#006500'>Green Daze Music</font>"))
        .setNeutralButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        })
        .show();   
	}
	
	public static void info6(final Context c)
	{
		//Dominated Love Slave
		new AlertDialog.Builder(c)			        
        .setMessage(Html.fromHtml(c.getString(R.string.album)+
        		c.getString(R.string.kerplunk_album) +
        		c.getString(R.string.track_length) +
        		"<font color='#006500'><i>1:42</i><br><br></font>" + 
        		c.getString(R.string.writers) +
        		"<font color='#006500'>Billie Joe Armstrong, Tré Cool, Frank E. Iii Wright, Mike Pritchard, Michael Pritchard</font><br><br>" +
        		c.getString(R.string.copyright) +
        		"<font color='#006500'>Green Daze Music</font>"))
        .setNeutralButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        })
        .show();    
	}
	
	public static void info7(final Context c)
	{
		//One Of My Lies
		new AlertDialog.Builder(c)			        
        .setMessage(Html.fromHtml(c.getString(R.string.album)+
        		c.getString(R.string.kerplunk_album) +
        		c.getString(R.string.track_length) +
        		"<font color='#006500'><i>2:19</i><br><br></font>" + 
        		c.getString(R.string.writers) +
        		"<font color='#006500'>Billie Joe Armstrong, Frank E. Iii Wright, Mike Pritchard, Michael Pritchard</font><br><br>" +
        		c.getString(R.string.copyright) +
        		"<font color='#006500'>Green Daze Music</font>"))
        .setNeutralButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        })
        .show();    
	}
	
	public static void info8(final Context c)
	{
		//80
		new AlertDialog.Builder(c)			        
        .setMessage(Html.fromHtml(c.getString(R.string.album)+
        		c.getString(R.string.kerplunk_album) +
        		c.getString(R.string.track_length) +
        		"<font color='#006500'><i>3:39</i></font><br><br>" + 
        		c.getString(R.string.writers) +
        		"<font color='#006500'>Billie Joe Armstrong, Frank E. Iii Wright, Mike Pritchard, Michael Pritchard</font><br><br>" +
        		c.getString(R.string.copyright) +
        		"<font color='#006500'>Green Daze Music</font>"))
        .setNeutralButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        })
        .show();    
	}
	
	public static void info9(final Context c)
	{
		//Android
		new AlertDialog.Builder(c)
        .setMessage(Html.fromHtml(c.getString(R.string.album)+
        		c.getString(R.string.kerplunk_album) +
        		c.getString(R.string.track_length) +
        		"<font color='#006500'><i>3:00</font></i><br><br>" + 
        		c.getString(R.string.writers) +
        		"<font color='#006500'>Billie Joe Armstrong, Frank E. Iii Wright, Mike Pritchard, Michael Pritchard</font><br><br>" +
        		c.getString(R.string.copyright) +
        		"<font color='#006500'>Green Daze Music</font>"))
        .setNeutralButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        })
        .show();  
	}
	
	public static void info10(final Context c)
	{
		//No One Knows
		new AlertDialog.Builder(c)			        
        .setMessage(Html.fromHtml(c.getString(R.string.album)+
        		c.getString(R.string.kerplunk_album) +
        		c.getString(R.string.track_length) +
        		"<font color='#006500'><i>3:39</i><br><br></font>" + 
        		c.getString(R.string.writers) +
        		"<font color='#006500'>Billie Joe Armstrong, Frank E. Iii Wright, Mike Pritchard, Michael Pritchard</font><br><br>" +
        		c.getString(R.string.copyright) +
        		"<font color='#006500'>Green Daze Music</font>"))
        .setNeutralButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        })
        .show();    
	}
	
	public static void info11(final Context c)
	{
		//Who Wrote Holden Caulfield?
		new AlertDialog.Builder(c)			        
        .setMessage(Html.fromHtml(c.getString(R.string.album)+
        		c.getString(R.string.kerplunk_album) +
        		c.getString(R.string.track_length) +
        		"<font color='#006500'><i>2:44</i><br><br></font>" + 
        		c.getString(R.string.writers) +
        		"<font color='#006500'>Billie Joe Armstrong, Frank E. Iii Wright, Mike Pritchard, Michael Pritchard</font><br><br>" +
        		c.getString(R.string.copyright) +
        		"<font color='#006500'>Green Daze Music</font>"))
        .setNeutralButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        })
        .show();    
	}
	
	public static void info12(final Context c)
	{
		//Words I Might Have Ate
		new AlertDialog.Builder(c)			        
        .setMessage(Html.fromHtml(c.getString(R.string.album)+
        		c.getString(R.string.kerplunk_album) +
        		c.getString(R.string.track_length) +
        		"<font color='#006500'><i>2:32</i><br><br></font>" + 
        		c.getString(R.string.writers) +
        		"<font color='#006500'>Billie Joe Armstrong, Frank E. Iii Wright, Mike Pritchard, Michael Pritchard</font><br><br>" +
        		c.getString(R.string.copyright) +
        		"<font color='#006500'>Green Daze Music</font>"))
        .setNeutralButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        })
        .show();    
	} 
	
	public static void info13(final Context c)
	{
		//Sweet Children
		new AlertDialog.Builder(c)			        
        .setMessage(Html.fromHtml(c.getString(R.string.album)+
        		c.getString(R.string.kerplunk_album) +
        		c.getString(R.string.track_length) +
        		"<font color='#006500'><i>1:41</i><br><br></font>" + 
        		c.getString(R.string.writers) +
        		"<font color='#006500'>Billie Joe Armstrong, Mike Pritchard, John Kiffmeyer, Michael Pritchard</font><br><br>" +
        		c.getString(R.string.copyright) +
        		"<font color='#006500'>Green Daze Music</font>"))
        .setNeutralButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        })
        .show();    
	}
	
	public static void info14(final Context c)
	{
		//Best Thing In Town
		new AlertDialog.Builder(c)
        .setMessage(Html.fromHtml(c.getString(R.string.album)+
        		c.getString(R.string.kerplunk_album) +
        		c.getString(R.string.track_length) +
        		"<font color='#006500'><i>2:03</i></font><br><br>" + 
        		c.getString(R.string.writers) +
        		"<font color='#006500'>Billie Joe Armstrong, Mike Dirnt, Mike Pritchard, John Kiffmeyer, Michael Pritchard</font><br><br>" +
        		c.getString(R.string.copyright) +
        		"<font color='#006500'>Green Daze Music</font>"))
        .setNeutralButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        })
        .show();    
	}
	
	public static void info15(final Context c)
	{
		//Strangeland
		new AlertDialog.Builder(c)			        
        .setMessage(Html.fromHtml(c.getString(R.string.album)+
        		c.getString(R.string.kerplunk_album) +
        		c.getString(R.string.track_length) +
        		"<font color='#006500'><i>2:08</i><br><br></font>" + 
        		c.getString(R.string.writers) +
        		"<font color='#006500'>Billie Joe Armstrong, Mike Pritchard, John Kiffmeyer, Michael Pritchard</font><br><br>" +
        		c.getString(R.string.copyright) +
        		"<font color='#006500'>Green Daze Music</font>"))
        .setNeutralButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        })
        .show();  
	}
	
	public static void info16(final Context c)
	{
		//My Generation
		new AlertDialog.Builder(c)			        
        .setMessage(Html.fromHtml(c.getString(R.string.album)+
        		c.getString(R.string.kerplunk_album) +
        		c.getString(R.string.track_length) +
        		"<font color='#006500'><i>2:19</i></font><br><br>" + 
        		c.getString(R.string.writers) +
        		"<font color='#006500'>Pete Townshend<br><br></font>" +
        		"<font color='#524ef8'><b><u>Label</b></u><br></font>"+
        		"<font color='#006500'>Brunswick 05944 (UK)<br>" +
        		"Decca 31877 (US)</font>"))
        .setNeutralButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        })
        .show();    
	}
}