package com.greenday.ins;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.text.Html;

import com.greenday.kerplunk.Kerplunk;
import com.greenday.lyrics.R;
import com.greenday.nimrod.Nimrod;
import com.greenday.warning.WarningMain;

public class Info {
	
	public static void info1(final Context c)
	{
		//Maria
		new AlertDialog.Builder(c)
        .setMessage(Html.fromHtml(c.getString(R.string.album)+
        		"<font color='#006500'>International Superhits! <i>(2001)</i><br><br></font>" +
        		c.getString(R.string.track_length) +
        		"<font color='#006500'><i>2:47</i></font><br><br>" + 
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
		//Poprocks and Coke
		new AlertDialog.Builder(c)
        .setMessage(Html.fromHtml(c.getString(R.string.album)+
        		"<font color='#006500'>International Superhits! <i>(2001)</i></font><br><br>" +
        		c.getString(R.string.track_length) +
        		"<font color='#006500'><i>2:38</i></font><br><br>" + 
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
	
	public static void info3(final Context c)
	{
		//Longview
		new AlertDialog.Builder(c)
        .setMessage(Html.fromHtml("<font color='#524ef8'><b><u>From</font></b></u><br>" +
        		"<font color='#006500'>Dookie <i>1994</i></font>"))
        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        })
        .setNegativeButton("Go To Original", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                Intent intent=new Intent(c, com.greenday.dookie.Longview.class);
                c.startActivity(intent);
            }
        })
        .show();  
	}
	
	public static void info4(final Context c)
	{
		//Welcome To Paradise
		new AlertDialog.Builder(c)
        .setMessage(Html.fromHtml("<font color='#524ef8'><b><u>From</font></b></u><br>" +
        		"<font color='#006500'>Dookie, <i>1994</i></font>"))
        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        })
        .setNegativeButton("Go To Original", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                Intent intent=new Intent(c, com.greenday.dookie.Welcomeparadise.class);
                c.startActivity(intent);
            }
        })
        .show();    
	}
	
	public static void info5(final Context c)
	{
		//Basket Case
		new AlertDialog.Builder(c)
        .setMessage(Html.fromHtml("<font color='#524ef8'><b><u>From</font></b></u><br>" +
        		"<font color='#006500'>Dookie, <i>1994</i></font>"))
        .setNeutralButton("OK", new DialogInterface.OnClickListener() {
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
	
	public static void info6(final Context c)
	{
		//When I Come Around
		new AlertDialog.Builder(c)
        .setMessage(Html.fromHtml("<font color='#524ef8'><b><u>From</font></b></u><br>" +
        		"<font color='#006500'>Dookie, <i>1994</i></font>"))
        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        })
        .setNegativeButton("Go To Original", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                Intent intent=new Intent(c, com.greenday.dookie.Whencomearound.class);
                c.startActivity(intent);
            }
        })
        .show();    
	}
	
	public static void info7(final Context c)
	{
		//She
		new AlertDialog.Builder(c)
        .setMessage(Html.fromHtml("<font color='#524ef8'><b><u>From</font></b></u><br>" +
        		"<font color='#006500'>Dookie, <i>1994</i></font>"))
        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        })
        .setNegativeButton("Go To Original", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                Intent intent=new Intent(c, com.greenday.dookie.She.class);
                c.startActivity(intent);
            }
        })
        .show();    
	}
	
	public static void info8(final Context c)
	{
		//J.A.R.
		new AlertDialog.Builder(c)
        .setMessage(Html.fromHtml(c.getString(R.string.album)+
        		"<font color='#006500'>International Superhits! <i>(2001)<br><br></i></font>" +
        		c.getString(R.string.track_length) +
        		"<font color='#006500'><i>2:51</i></font><br><br>" + 
        		c.getString(R.string.writers) +
        		"<font color='#006500'>Mike Dirnt; from the Angus soundtrack, 1995\nBillie Joe Armstrong, Frank E. Iii Wright, Michael Pritchard</font><br><br>" +
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
		//Geek Stink Breath
		new AlertDialog.Builder(c)
        .setMessage(Html.fromHtml("<font color='#524ef8'><b><u>From</b></font></u><br>" +
        		"<font color='#006500'>Insomniac, <i>1995</i></font>"))
        .setNeutralButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        })
        .setNegativeButton("Go To Original", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
            	Intent newActivity3 = new Intent(c, Kerplunk.class);     
                newActivity3.putExtra("track", 4);
                c.startActivity(newActivity3);
            }
        })
        .show();    
	}
	
	public static void info10(final Context c)
	{
		//Brain Stew
		new AlertDialog.Builder(c)
        .setMessage(Html.fromHtml("<font color='#524ef8'><b><u>From</b></font></u><br>" +
        		"<font color='#006500'>Insomniac, <i>1994</i></font>"))
        .setNeutralButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        })
        .setNegativeButton("Go To Original", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
            	Intent newActivity9 = new Intent(c, Kerplunk.class);     
                newActivity9.putExtra("track", 10);
                c.startActivity(newActivity9);
            }
        })
        .show();    
	}
	
	public static void info11(final Context c)
	{
		//Jaded
		new AlertDialog.Builder(c)
        .setMessage(Html.fromHtml("<font color='#524ef8'><b><u>From</font></b></u><br>" +
        		"<font color='#006500'>Insomniac, <i>1995</i></font>"))
        .setNeutralButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        })
        .setNegativeButton("Go To Original", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
            	Intent newActivity10 = new Intent(c, Kerplunk.class);     
                newActivity10.putExtra("track", 11);
                c.startActivity(newActivity10);
            }
        })
        .show(); 
	}
	
	public static void info12(final Context c)
	{
		//Walking Contradiction
		new AlertDialog.Builder(c)
        .setMessage(Html.fromHtml("<font color='#524ef8'><b><u>From</font></b></u><br>" +
        		"<font color='#006500'>Insomniac, <i>1995</i></font>"))
        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        })
        .setNegativeButton("Go To Original", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
            	Intent newActivity13 = new Intent(c, Kerplunk.class);     
                newActivity13.putExtra("track", 14);
                c.startActivity(newActivity13);
            }
        })
        .show(); 
	} 
	
	public static void info13(final Context c)
	{
		//Stuck With Me
		new AlertDialog.Builder(c)
        .setMessage(Html.fromHtml("<font color='#524ef8'><b><u>From</font></b></u><br>" +
        		"<font color='#006500'>Insomniac, <i>1995</i></font>"))
        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        })
        .setNegativeButton("Go To Original", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
            	Intent newActivity2 = new Intent(c, Kerplunk.class);     
                newActivity2.putExtra("track", 3);
                c.startActivity(newActivity2);
            }
        })
        .show();     
	}
	
	public static void info14(final Context c)
	{
		//Hitchin' A Ride
		new AlertDialog.Builder(c)
        .setMessage(Html.fromHtml("<font color='#524ef8'><b><u>From</font></b></u><br>" +
        		"<font color='#006500'>Nimrod, <i>1997</i></font>"))
        .setNeutralButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        })
        .setNegativeButton("Go To Original", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
            	Intent newActivity1 = new Intent(c, Nimrod.class);     
                newActivity1.putExtra("track", 2);
                c.startActivity(newActivity1);
            }
        })
        .show();  
	}
	
	public static void info15(final Context c)
	{
		//Good Riddance
		new AlertDialog.Builder(c)
        .setMessage(Html.fromHtml("<font color='#524ef8'><b><u>From</b></font></u><br>" +
        		"<font color='#006500'>Nimrod, <i>1997</i></font>"))
        .setNeutralButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        })
        .setNegativeButton("Go To Original", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
            	Intent newActivity16 = new Intent(c, Nimrod.class);     
                newActivity16.putExtra("track", 17);
                c.startActivity(newActivity16);
            }
        })
        .show();    
	}
	
	public static void info16(final Context c)
	{
		//Redundant
		new AlertDialog.Builder(c)
        .setMessage(Html.fromHtml("<font color='#524ef8'><b><u>From</font></b></u><br>" +
        		"<font color='#006500'>Nimrod, <i>1997</i></font>"))
        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        })
        .setNegativeButton("Go To Original", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
            	Intent newActivity3 = new Intent(c, Nimrod.class);     
                newActivity3.putExtra("track", 4);
                c.startActivity(newActivity3);
            }
        })
        .show();    
	}
	
	public static void info17(final Context c)
	{
		//Nice Guys Finish Last
		new AlertDialog.Builder(c)
        .setMessage(Html.fromHtml("<font color='#524ef8'><b><u>From</font></b></u><br>" +
        		"<font color='#006500'>Nimrod, <i>1997</i></font>"))
        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        })
        .setNegativeButton("Go To Original", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
            	Intent newActivity = new Intent(c, Nimrod.class);     
                newActivity.putExtra("track", 1);
                c.startActivity(newActivity);
            }
        })
        .show();
	}
	
	public static void info18(final Context c)
	{
		//Minority
		new AlertDialog.Builder(c)
        .setMessage(Html.fromHtml("<font color='#524ef8'><b><u>From</font></b></u><br>" +
        		"<font color='#006500'>Warning, <i>2000</i></font>"))
        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        })
        .setNegativeButton("Go To Original", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
            	Intent newActivity10 = new Intent(c, WarningMain.class);     
                 newActivity10.putExtra("track", 11);
                 c.startActivity(newActivity10);
            }
        })
        .show();  
	}
	
	public static void info19(final Context c)
	{
		//Warning
		new AlertDialog.Builder(c)
        .setMessage(Html.fromHtml("<font color='#524ef8'><b><u>From</font></b></u><br>" +
        		"<font color='#006500'>Warning, <i>2000</i></font>"))
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
	
	public static void info20(final Context c)
	{
		//Waiting
		new AlertDialog.Builder(c)
        .setMessage(Html.fromHtml("<font color='#524ef8'><b><u>From</font></b></u><br>" +
        		"<font color='#006500'>Warning, <i>2000</i></font>"))
        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        })
        .setNegativeButton("Go To Original", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
            	Intent newActivity9 = new Intent(c, WarningMain.class);     
                 newActivity9.putExtra("track", 10);
                 c.startActivity(newActivity9);
            }
        })
        .show();  
	}
	
	public static void info21(final Context c)
	{
		//Macy's Day Parade
		new AlertDialog.Builder(c)
        .setMessage(Html.fromHtml("<font color='#524ef8'><b><u>From</font></b></u><br>" +
        		"<font color='#006500'>Warning, <i>2000</i></font>"))
        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        })
        .setNegativeButton("Go To Original", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
            	Intent newActivity11 = new Intent(c, WarningMain.class);     
                 newActivity11.putExtra("track", 12);
                 c.startActivity(newActivity11);
            }
        })
        .show();  
	}
}