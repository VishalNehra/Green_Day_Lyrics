package com.greenday.tns;

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
        		c.getString(R.string.tns_album) +
        		c.getString(R.string.track_length) +
        		"<font color='#006500'><i>2:26</font></i><br><br>" + 
        		c.getString(R.string.writers) +
        		"<font color='#006500'>Billie Joe Armstrong, Frank E. Iii Wright, John Kiffmeyer</font><br><br>" +
        		c.getString(R.string.copyright) +
        		c.getString(R.string.copyright2)))
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
        		c.getString(R.string.tns_album) +
        		c.getString(R.string.track_length) +
        		"<font color='#006500'><i>2:37</font></i><br><br>" + 
        		c.getString(R.string.writers) +
        		"<font color='#006500'>John Kiffmeyer, Billie Joe Armstrong, Bela Bartok, Frank E. Iii Wright</font><br><br>" +
        		c.getString(R.string.copyright) +
        		"<font color='#006500'>Green Daze Music, Boosey & Hawkes Music Publishers Ltd.</font>"))
        .setNeutralButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        })
        .show();    
	}
	
	public static void info3(final Context c)
	{
		//I Was There
		new AlertDialog.Builder(c)			        
        .setMessage(Html.fromHtml(c.getString(R.string.album)+
        		c.getString(R.string.tns_album) +
        		c.getString(R.string.track_length) +
        		"<font color='#006500'><i>3:36</font></i><br><br>" + 
        		c.getString(R.string.writers) +
        		"<font color='#006500'>Billie Joe Armstrong, Frank E. Iii Wright, John Kiffmeyer</font><br><br>" +
        		c.getString(R.string.copyright) +
        		c.getString(R.string.copyright2)))
        .setNeutralButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        })
        .show();    
	}
	
	public static void info4(final Context c)
	{
		//Disappearing Boy
		new AlertDialog.Builder(c)			        
        .setMessage(Html.fromHtml(c.getString(R.string.album)+
        		c.getString(R.string.tns_album) +
        		c.getString(R.string.track_length) +
        		"<font color='#006500'><i>2:52</font></i><br><br>" + 
        		c.getString(R.string.writers) +
        		"<font color='#006500'>Billie Joe Armstrong, Frank E. Iii Wright, John Kiffmeyer</font><br><br>" +
        		c.getString(R.string.copyright) +
        		c.getString(R.string.copyright2)))
        .setNeutralButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        })
        .show();    
	}
	
	public static void info5(final Context c)
	{
		//Green Day
		new AlertDialog.Builder(c)			        
        .setMessage(Html.fromHtml(c.getString(R.string.album)+
        		c.getString(R.string.tns_album) +
        		c.getString(R.string.track_length) +
        		"<font color='#006500'><i>3:29</font></i><br><br>" + 
        		c.getString(R.string.writers) +
        		"<font color='#006500'>Michael Pritchard, Billie Joe Armstrong, Frank E. Iii Wright, Mike Pritchard</font><br><br>" +
        		c.getString(R.string.copyright) +
        		c.getString(R.string.copyright2)))
        .setNeutralButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        })
        .show();      
	}
	
	public static void info6(final Context c)
	{
		//Going To Pasalacqua
		new AlertDialog.Builder(c)			        
        .setMessage(Html.fromHtml(c.getString(R.string.album)+
        		c.getString(R.string.tns_album) +
        		c.getString(R.string.track_length) +
        		"<font color='#006500'><i>3:30</font></i><br><br>" + 
        		c.getString(R.string.writers) +
        		"<font color='#006500'>Billie Joe Armstrong, Frank E. Iii Wright, John Kiffmeyer</font><br><br>" +
        		c.getString(R.string.copyright) +
        		c.getString(R.string.copyright2)))
        .setNeutralButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        })
        .show();   
	}
	
	public static void info7(final Context c)
	{
		//16
		new AlertDialog.Builder(c)			        
        .setMessage(Html.fromHtml(c.getString(R.string.album)+
        		c.getString(R.string.tns_album) +
        		c.getString(R.string.track_length) +
        		"<font color='#006500'><i>3:24</font></i><br><br>" + 
        		c.getString(R.string.writers) +
        		"<font color='#006500'>Billie Joe Armstrong, Frank E. Iii Wright, John Kiffmeyer</font><br><br>" +
        		c.getString(R.string.copyright) +
        		c.getString(R.string.copyright2)))
        .setNeutralButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        })
        .show();    
	}
	
	public static void info8(final Context c)
	{
		//Road To Acceptance
		new AlertDialog.Builder(c)			        
        .setMessage(Html.fromHtml(c.getString(R.string.album)+
        		c.getString(R.string.tns_album) +
        		c.getString(R.string.track_length) +
        		"<font color='#006500'><i>3:35</font></i><br><br>" + 
        		c.getString(R.string.writers) +
        		"<font color='#006500'>Billie Joe Armstrong, Frank E. Iii Wright, John Kiffmeyer</font><br><br>" +
        		c.getString(R.string.copyright) +
        		c.getString(R.string.copyright2)))
        .setNeutralButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        })
        .show();     
	}
	
	public static void info9(final Context c)
	{
		//Rest
		new AlertDialog.Builder(c)			        
        .setMessage(Html.fromHtml(c.getString(R.string.album)+
        		c.getString(R.string.tns_album) +
        		c.getString(R.string.track_length) +
        		"<font color='#006500'><i>3:05</font></i><br><br>" + 
        		c.getString(R.string.writers) +
        		"<font color='#006500'>Billie Joe Armstrong, Frank E. Iii Wright, John Kiffmeyer</font><br><br>" +
        		c.getString(R.string.copyright) +
        		c.getString(R.string.copyright2)))
        .setNeutralButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        })
        .show();    
	}
	
	public static void info10(final Context c)
	{
		//The Judge's Daughter
		new AlertDialog.Builder(c)			        
        .setMessage(Html.fromHtml(c.getString(R.string.album)+
        		c.getString(R.string.tns_album) +
        		c.getString(R.string.track_length) +
        		"<font color='#006500'><i>3:36</font></i><br><br>" + 
        		c.getString(R.string.writers) +
        		"<font color='#006500'>Billie Joe Armstrong, Frank E. Iii Wright, John Kiffmeyer</font><br><br>" +
        		c.getString(R.string.copyright) +
        		c.getString(R.string.copyright2)))
        .setNeutralButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        })
        .show();    
	}
	
	public static void info11(final Context c)
	{
		//Paper Lanterns
		new AlertDialog.Builder(c)			        
        .setMessage(Html.fromHtml(c.getString(R.string.album)+
        		c.getString(R.string.tns_album) +
        		c.getString(R.string.track_length) +
        		"<font color='#006500'><i>2:23</font></i><br><br>" + 
        		c.getString(R.string.writers) +
        		"<font color='#006500'>Billie Joe Armstrong, Frank E. Iii Wright, John Kiffmeyer</font><br><br>" +
        		c.getString(R.string.copyright) +
        		c.getString(R.string.copyright2)))
        .setNeutralButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        })
        .show();    
	}
	
	public static void info12(final Context c)
	{
		//Why Do You Want Him?
		new AlertDialog.Builder(c)			        
        .setMessage(Html.fromHtml(c.getString(R.string.album)+
        		c.getString(R.string.tns_album) +
        		c.getString(R.string.track_length) +
        		"<font color='#006500'><i>3:09</font></i><br><br>" + 
        		c.getString(R.string.writers) +
        		"<font color='#006500'>Billie Joe Armstrong, Frank E. Iii Wright, John Kiffmeyer</font><br><br>" +
        		c.getString(R.string.copyright) +
        		c.getString(R.string.copyright2)))
        .setNeutralButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        })
        .show();    
	}
	
	public static void info13(final Context c)
	{
		//409 In Your Coffeemaker
		new AlertDialog.Builder(c)			        
        .setMessage(Html.fromHtml(c.getString(R.string.album)+
        		c.getString(R.string.tns_album) +
        		c.getString(R.string.track_length) +
        		"<font color='#006500'><i>2:52</font></i><br><br>" + 
        		c.getString(R.string.writers) +
        		"<font color='#006500'>John Kiffmeyer, Billie Joe Armstrong, Frank E. Iii Wright</font><br><br>" +
        		c.getString(R.string.copyright) +
        		c.getString(R.string.copyright2)))
        .setNeutralButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        })
        .show();     
	}
	
	public static void info14(final Context c)
	{
		//Knowledge
		new AlertDialog.Builder(c)			        
        .setMessage(Html.fromHtml(c.getString(R.string.album)+
        		c.getString(R.string.tns_album) +
        		c.getString(R.string.track_length) +
        		"<font color='#006500'><i>2:19</font></i><br><br>" + 
        		c.getString(R.string.writers) +
        		"<font color='#006500'>Operation Ivy</font><br><br>" +
        		"<font color='#524ef8'><b><u>Label</b></u></font><br>" +
        		"<font color='#006500'>Lookout!</font>"))
        .setNeutralButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        })
        .show();    
	}
	
	public static void info15(final Context c)
	{
		//1,000 Hours
		new AlertDialog.Builder(c)			        
        .setMessage(Html.fromHtml(c.getString(R.string.album)+
        		c.getString(R.string.tns_album) +
        		c.getString(R.string.track_length) +
        		"<font color='#006500'><i>2:25</font></i><br><br>" + 
        		c.getString(R.string.writers) +
        		"<font color='#006500'>John Kiffmeyer, Billie Joe Armstrong, Frank E. Iii Wright</font><br><br>" +
        		c.getString(R.string.copyright) +
        		c.getString(R.string.copyright2)))
        .setNeutralButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        })
        .show();    
	}
	
	public static void info16(final Context c)
	{
		//Dry Ice
		new AlertDialog.Builder(c)			        
        .setMessage(Html.fromHtml(c.getString(R.string.album)+
        		c.getString(R.string.tns_album) +
        		c.getString(R.string.track_length) +
        		"<font color='#006500'><i>3:45</font></i><br><br>" + 
        		c.getString(R.string.writers) +
        		"<font color='#006500'>Billie Joe Armstrong, Frank E. Iii Wright, John Kiffmeyer</font><br><br>" +
        		c.getString(R.string.copyright) +
        		c.getString(R.string.copyright2)))
        .setNeutralButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        })
        .show();    
	}
	
	public static void info17(final Context c)
	{
		//Only Of You
		new AlertDialog.Builder(c)			        
        .setMessage(Html.fromHtml(c.getString(R.string.album)+
        		c.getString(R.string.tns_album) +
        		c.getString(R.string.track_length) +
        		"<font color='#006500'><i>2:47</font></i><br><br>" + 
        		c.getString(R.string.writers) +
        		"<font color='#006500'>Billie Joe Armstrong, Frank E. Iii Wright, John Kiffmeyer</font><br><br>" +
        		c.getString(R.string.copyright) +
        		c.getString(R.string.copyright2)))
        .setNeutralButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        })
        .show();       
	}
	
	public static void info18(final Context c)
	{
		//The One I Want
		new AlertDialog.Builder(c)			        
        .setMessage(Html.fromHtml(c.getString(R.string.album)+
        		c.getString(R.string.tns_album) +
        		c.getString(R.string.track_length) +
        		"<font color='#006500'><i>3:01</font></i><br><br>" + 
        		c.getString(R.string.writers) +
        		"<font color='#006500'>Billie Joe Armstrong, Mike Dirnt, Frank E. Iii Wright, John Kiffmeyer</font><br><br>" +
        		c.getString(R.string.copyright) +
        		c.getString(R.string.copyright2)))
        .setNeutralButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        })
        .show();    
	}
	
	public static void info19(final Context c)
	{
		//I Want To Be Alone
		new AlertDialog.Builder(c)			        
        .setMessage(Html.fromHtml(c.getString(R.string.album)+
        		c.getString(R.string.tns_album) +
        		c.getString(R.string.track_length) +
        		"<font color='#006500'><i>3:09</font></i><br><br>" + 
        		c.getString(R.string.writers) +
        		"<font color='#006500'>Billie Joe Armstrong, Frank E. Iii Wright, John Kiffmeyer</font><br><br>" +
        		c.getString(R.string.copyright) +
        		c.getString(R.string.copyright2)))
        .setNeutralButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        })
        .show();    
	}

}
