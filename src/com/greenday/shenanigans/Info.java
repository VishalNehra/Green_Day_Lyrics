package com.greenday.shenanigans;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.text.Html;

import com.greenday.dookie.Longview;
import com.greenday.lyrics.R;
import com.greenday.warning.WarningMain;

public class Info {
	
	public static void info1(final Context c)
	{
		//Suffocate
		new AlertDialog.Builder(c)
        .setMessage(Html.fromHtml("<font color='#524ef8'><b><u>INFORMATION</font></b></u><br>" +
        		"<font color='#006500'>Outtake from <i>'Nimrod', 1997</i></font><br><br>" +
        		c.getString(R.string.album)+
        		c.getString(R.string.shenanigans_album) +
        		c.getString(R.string.track_length) +
        		"<font color='#006500'><i>2:54</font></i><br><br>" + 
        		c.getString(R.string.writers) +
        		"<font color='#006500'>Billie Joe Armstrong, Frank E. Iii Wright, Michael Pritchard</font><br><br>" +
        		c.getString(R.string.copyright) +
        		c.getString(R.string.copyright1)))
        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        })
        .show();      
	}
	
	public static void info2(final Context c)
	{
		//Desensitized
		new AlertDialog.Builder(c)
        .setMessage(Html.fromHtml("<font color='#524ef8'><b><u>INFORMATION</font></b></u><br>" +
        		"<font color='#006500'>From <i>'Good Riddance', 1997</i>. Also a single in the Green Day Singles Box.]</font><br><br>" +
        		c.getString(R.string.album)+
        		c.getString(R.string.shenanigans_album) +
        		c.getString(R.string.track_length) +
        		"<font color='#006500'><i>2:47</font></i><br><br>" + 
        		c.getString(R.string.writers) +
        		"<font color='#006500'>Michael Pritchard, Billie Joe Armstrong, Frank E. Iii Wright</font><br><br>" +
        		c.getString(R.string.copyright) +
        		c.getString(R.string.copyright1)))
        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        })
        .setNegativeButton("Go To Original", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                Intent intent=new Intent(c, com.greenday.nimrod.Goodriddance.class);
                c.startActivity(intent);
            }
        })
        .show();   
	}
	
	public static void info3(final Context c)
	{
		//You Lied
		new AlertDialog.Builder(c)
        .setMessage(Html.fromHtml("<font color='#524ef8'><b><u>INFORMATION</font></b></u><br>" +
        		"<font color='#006500'>From <i>'Good Riddance', 1997</i></font><br><br>" +
        		c.getString(R.string.album)+
        		c.getString(R.string.shenanigans_album) +
        		c.getString(R.string.track_length) +
        		"<font color='#006500'><i>2:26</font></i><br><br>" + 
        		c.getString(R.string.writers) +
        		"<font color='#006500'>Michael Pritchard, Billie Joe Armstrong, Frank E. Iii Wright</font><br><br>" +
        		c.getString(R.string.copyright) +
        		c.getString(R.string.copyright1)))
        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        })
        .setNegativeButton("Go To Original", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                Intent intent=new Intent(c, com.greenday.nimrod.Goodriddance.class);
                c.startActivity(intent);
            }
        })
        .show();     
	}
	
	public static void info4(final Context c)
	{
		//Outsider
		new AlertDialog.Builder(c)
        .setMessage(Html.fromHtml("<font color='#524ef8'><b><u>INFORMATION</font></b></u><br>" +
        		"<font color='#006500'>Originally performed by the Ramones; from <i>'Warning', 2000</i></font><br><br>" +
        		c.getString(R.string.album)+
        		c.getString(R.string.shenanigans_album) +
        		c.getString(R.string.track_length) +
        		"<font color='#006500'><i>2:17</font></i><br><br>" + 
        		c.getString(R.string.writers) +
        		"<font color='#006500'>Joey Ramone, Dee Dee Ramone, Johnny Ramone</font><br><br>" +
        		c.getString(R.string.copyright) +
        		"<font color='#006500'>Taco Tunes</font>"))
        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        })
        .setNegativeButton("Go To Original", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
            	  Intent newActivity = new Intent(c, WarningMain.class);     
                  newActivity.putExtra("track", 1);
                  c.startActivity(newActivity);
            }
        })
        .show();    
	}
	
	public static void info5(final Context c)
	{
		//Don't Wanna Fall In Love
		new AlertDialog.Builder(c)
        .setMessage(Html.fromHtml("<font color='#524ef8'><b><u>INFORMATION</font></b></u><br>" +
        		"<font color='#006500'>From <i>'Geek Stink Breath', 1995</i></font><br><br>" +
        		c.getString(R.string.album)+
        		c.getString(R.string.shenanigans_album) +
        		c.getString(R.string.track_length) +
        		"<font color='#006500'><i>1:38</font></i><br><br>" +
        		c.getString(R.string.writers) +
        		"<font color='#006500'>Billie Joe Armstrong, Frank E. Iii Wright, Michael Pritchard</font><br><br>" +
        		c.getString(R.string.copyright) +
        		c.getString(R.string.copyright1)))
        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        })
        .setNegativeButton("Go To Original", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                Intent intent=new Intent(c, com.greenday.insomniac.Geekstink.class);
                c.startActivity(intent);
            }
        })
        .show();   
	}
	
	public static void info6(final Context c)
	{
		//Espionage
		new AlertDialog.Builder(c)
        .setMessage(Html.fromHtml("<font color='#524ef8'><b><u>INFORMATION</font></b></u><br>" +
        		"<font color='#006500'>From <i>'Hitchin' a Ride', 1997</i></font><br><br>" +
        		c.getString(R.string.album)+
        		c.getString(R.string.shenanigans_album) +
        		c.getString(R.string.track_length) +
        		"<font color='#006500'><i>3:23</font></i>"))
        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        })
        .setNegativeButton("Go To Original", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                Intent intent=new Intent(c, com.greenday.nimrod.Hitchinaride.class);
                c.startActivity(intent);
            }
        })
        .show();   
	}
	
	public static void info7(final Context c)
	{
		//I Wanna Be On T.V.
		new AlertDialog.Builder(c)
        .setMessage(Html.fromHtml("<font color='#524ef8'><b><u>INFORMATION</font></b></u><br>" +
        		"<font color='#006500'>Originally performed by Fang; from <i>'Geek Stink Breath', 1995</i></font><br><br>" +
        		c.getString(R.string.album)+
        		c.getString(R.string.shenanigans_album) +
        		c.getString(R.string.track_length) +
        		"<font color='#006500'><i>1:17</font></i><br><br>" + 
        		c.getString(R.string.writers) +
        		"<font color='#006500'>Sam McBride, Tom Flynn</font><br><br>" +
        		c.getString(R.string.copyright) +
        		c.getString(R.string.copyright1)))
        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        })
        .setNegativeButton("Go To Original", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                Intent intent=new Intent(c, com.greenday.insomniac.Geekstink.class);
                c.startActivity(intent);
            }
        })
        .show();    
	}
	
	public static void info8(final Context c)
	{
		//Scumbag
		new AlertDialog.Builder(c)
        .setMessage(Html.fromHtml("<font color='#524ef8'><b><u>INFORMATION</font></b></u><br>" +
        		"<font color='#006500'>From <i>'Warning', 2000</i></font><br><br>" +
        		c.getString(R.string.album)+
        		c.getString(R.string.shenanigans_album) +
        		c.getString(R.string.track_length) +
        		"<font color='#006500'><i>1:46</font></i><br><br>" + 
        		c.getString(R.string.writers) +
        		"<font color='#006500'>Billie Joe Armstrong, Mike Dirnt, Frank E. Iii Wright, Michael Pritchard</font><br><br>" +
        		c.getString(R.string.copyright) +
        		c.getString(R.string.copyright1)))
        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        })
        .setNegativeButton("Go To Original", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
            	Intent newActivity = new Intent(c, WarningMain.class);     
                newActivity.putExtra("track", 1);
                c.startActivity(newActivity);
            }
        })
        .show();    
	}
	
	public static void info9(final Context c)
	{
		//Tired Of Waiting For You
		new AlertDialog.Builder(c)
        .setMessage(Html.fromHtml("<font color='#524ef8'><b><u>INFORMATION</font></b></u><br>" +
        		"<font color='#006500'>Originally performed by The Kinks; from <i>'Basket Case', 1994</i></font><br><br>" +
        		c.getString(R.string.album)+
        		c.getString(R.string.shenanigans_album) +
        		c.getString(R.string.track_length) +
        		"<font color='#006500'><i>2:34</font></i><br><br>" + 
        		c.getString(R.string.writers) +
        		"<font color='#006500'>Ray Davies</font><br><br>" +
        		c.getString(R.string.copyright) +
        		"<font color='#006500'>Jayboy Music Corp.</font>"))
        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        })
        .setNegativeButton("Go To Original", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                Intent intent=new Intent(c, com.greenday.dookie.Basketcase.class);
                c.startActivity(intent);
            }
        })
        .show(); 
	}
	
	public static void info10(final Context c)
	{
		//Sick Of Me
		new AlertDialog.Builder(c)
        .setMessage(Html.fromHtml("<font color='#524ef8'><b><u>INFORMATION</font></b></u><br>" +
        		"<font color='#006500'>From <i>'Hitchin' a Ride', 1997</i></font><br><br>" +
        		c.getString(R.string.album)+
        		c.getString(R.string.shenanigans_album) +
        		c.getString(R.string.track_length) +
        		"<font color='#006500'><i>2:07</font></i><br><br>" + 
        		c.getString(R.string.writers) +
        		"<font color='#006500'>Billie Joe Armstrong, Frank E. Iii Wright, Michael Pritchard</font><br><br>" +
        		c.getString(R.string.copyright) +
        		c.getString(R.string.copyright1)))
        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        })
        .setNegativeButton("Go To Original", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                Intent intent=new Intent(c, com.greenday.nimrod.Hitchinaride.class);
                c.startActivity(intent);
            }
        })
        .show();    
	}
	
	public static void info11(final Context c)
	{
		//Rotting
		new AlertDialog.Builder(c)
        .setMessage(Html.fromHtml("<font color='#524ef8'><b><u>INFORMATION</font></b></u><br>" +
        		"<font color='#006500'>From <i>'Good Riddance', 1997</i></font><br><br>" +
        		c.getString(R.string.album)+
        		c.getString(R.string.shenanigans_album) +
        		c.getString(R.string.track_length) +
        		"<font color='#006500'><i>2:52</font></i><br><br>" + 
        		c.getString(R.string.writers) +
        		"<font color='#006500'>Billie Joe Armstrong, Frank E. Iii Wright, Michael Pritchard</font><br><br>" +
        		c.getString(R.string.copyright) +
        		c.getString(R.string.copyright1)))
        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        })
        .setNegativeButton("Go To Original", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                Intent intent=new Intent(c, com.greenday.nimrod.Goodriddance.class);
                c.startActivity(intent);
            }
        })
        .show();    
	}
	
	public static void info12(final Context c)
	{
		//Do Da Da
		new AlertDialog.Builder(c)
        .setMessage(Html.fromHtml("<font color='#524ef8'><b><u>INFORMATION</font></b></u><br>" +
        		"<font color='#006500'>From <i>'Brain Stew/Jaded', 1996</i></font><br><br>" +
        		c.getString(R.string.album)+
        		c.getString(R.string.shenanigans_album) +
        		c.getString(R.string.track_length) +
        		"<font color='#006500'><i>1:30</font></i><br><br>" + 
        		c.getString(R.string.writers) +
        		"<font color='#006500'>Michael Pritchard, Billie Joe Armstrong, Frank E. Iii Wright, Mike Pritchard</font><br><br>" +
        		c.getString(R.string.copyright) +
        		c.getString(R.string.copyright1)))
        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        })
        .setNegativeButton("Go To Originals", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
            	new AlertDialog.Builder(c)
		        
		        .setNeutralButton("Brain Stew", new DialogInterface.OnClickListener() {
		            public void onClick(DialogInterface dialog, int which) {
		            	Intent intent=new Intent(c, com.greenday.insomniac.Brainstew.class);
		                c.startActivity(intent);
		            }
		        })
		        .setNegativeButton("Jaded", new DialogInterface.OnClickListener() {
		            public void onClick(DialogInterface dialog, int which) {
		                Intent intent=new Intent(c, com.greenday.insomniac.Jaded.class);
		                c.startActivity(intent);
		            }
		        })
		        .setPositiveButton("Close", new DialogInterface.OnClickListener() {
		            public void onClick(DialogInterface dialog, int which) {
		                dialog.cancel();
		            }
		        })
		        .show();    
            }
        })
        .show();    
	} 
	
	public static void info13(final Context c)
	{
		//On The Wagon
		new AlertDialog.Builder(c)
        .setMessage(Html.fromHtml("<font color='#524ef8'><b><u>INFORMATION</font></b></u><br>" +
        		"<font color='#006500'>From <i>'Longview', 1994</i></font><br><br>" +
        		c.getString(R.string.album)+
        		c.getString(R.string.shenanigans_album) +
        		c.getString(R.string.track_length) +
        		"<font color='#006500'><i>2:48</font></i><br><br>" + 
        		c.getString(R.string.writers) +
        		"<font color='#006500'>Billie Joe Armstrong, Frank E. Iii Wright, Michael Pritchard</font><br><br>" +
        		c.getString(R.string.copyright) +
        		c.getString(R.string.copyright1)))
        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        })
        .setNegativeButton("Go To Original", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                c.startActivity(new Intent(c, Longview.class));
            }
        })
        .show();    
	}
	
	public static void info14(final Context c)
	{
		//Ha Ha You're Dead
		new AlertDialog.Builder(c)
        .setMessage(Html.fromHtml(c.getString(R.string.album)+
        		c.getString(R.string.shenanigans_album) +
        		c.getString(R.string.track_length) +
        		"<font color='#006500'><i>3:07</font></i><br><br>" + 
        		c.getString(R.string.writers) +
        		"<font color='#006500'>Billie Joe Armstrong, Mike Dirnt, Frank E. Iii Wright, Michael Pritchard</font><br><br>" +
        		c.getString(R.string.copyright) +
        		c.getString(R.string.copyright1)))
        .setNegativeButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        })
        .show();    
	}
	
}
