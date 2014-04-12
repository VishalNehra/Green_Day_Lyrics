package com.greenday.unreleased;

import android.R.style;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.Html;

import com.greenday.lyrics.R;
import com.greenday.lyrics.R.string;

import de.keyboardsurfer.android.widget.crouton.Crouton;
import de.keyboardsurfer.android.widget.crouton.Style;

public class Info {
	
	public static void info1(final Context c)
	{
		//A Quick One While He's Away
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
		//Angel and the Jerk
		new AlertDialog.Builder(c)			        
        .setMessage(Html.fromHtml(c.getString(R.string.album)+
        		c.getString(R.string.friendsagain_extras_album) +
        		c.getString(R.string.track_length) +
        		"<font color='#006500'><i>1:50</font></i><br><br>" + 
        		c.getString(R.string.writers) +
        		"<font color='#006500'>Billie Joe Armstrong and Penelope Houston</font>"))
        .setNeutralButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        })
        .show();    
	}
	
	public static void info3(final Context c)
	{
		//Another State Of Mind
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
		//Billie Joe's Mom
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
		//Boys in the Bathroom Stall
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
		//Can't Make Love
		new AlertDialog.Builder(c)			        
        .setMessage(Html.fromHtml(c.getString(R.string.album)+
        		c.getString(R.string.generations_extras_album) +
        		c.getString(R.string.track_length) +
        		"<font color='#006500'><i>2:06</font></i><br><br>" + 
        		c.getString(R.string.writers) +
        		"<font color='#006500'>Pansy Division</font>"))
        .setNeutralButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        })
        .show();   
	}
	
	public static void info7(final Context c)
	{
		//Chocolate Rain
		new AlertDialog.Builder(c)			        
        .setMessage(Html.fromHtml(c.getString(R.string.album)+
        		c.getString(R.string.unreleased_extras_album) +
        		c.getString(R.string.track_length) +
        		"<font color='#006500'><i>3:10</font></i><br><br>" + 
        		c.getString(R.string.writers) +
        		"<font color='#006500'>Tay Zonday</font><br><br>" +
        		c.getString(R.string.fact_extras) +
        		"<font color='#006500'>At the end, Tré begins to sing Another State of Mind, which Green Day recorded during that time" +
        		"<br><br>At the end Tre says 'You're doing it fucking wrong', which was also said at the beginning of Highway 1</font>"))
        .setNeutralButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        })
        .show();    
	}
	
	public static void info8(final Context c)
	{
		//Cigarettes And Valentines
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
		//D.U.I.
		new AlertDialog.Builder(c)			        
        .setMessage(Html.fromHtml(c.getString(R.string.album)+
        		c.getString(R.string.shenanigans_extras_album) +
        		c.getString(R.string.track_length) +
        		"<font color='#006500'><i>1:51</font></i><br><br>" + 
        		c.getString(R.string.writers) +
        		"<font color='#006500'>Tré Cool</font>"))
        .setNeutralButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        })
        .show();    
	}
	
	public static void info10(final Context c)
	{
		//Depression Times
	}
	
	public static void info11(final Context c)
	{
		//Don't Want to Know If You Are Lonely
		new AlertDialog.Builder(c)			        
        .setMessage(Html.fromHtml(c.getString(R.string.album)+
        		c.getString(R.string.warning_extras_album) +
        		c.getString(R.string.track_length) +
        		"<font color='#006500'><i>3:08</font></i><br><br>" + 
        		c.getString(R.string.writers) +
        		"<font color='#006500'>Grant Hart</font>"))
        .setNeutralButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        })
        .show();    
	}
	
	public static void info12(final Context c)
	{
		//Dream Catcher
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
		//Favourite Son
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
		//Food Around the Corner
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
		//Governator
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
		//Hearts Collide
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
		//Hybrid Moments
		new AlertDialog.Builder(c)			        
        .setMessage(Html.fromHtml(c.getString(R.string.album)+
        		c.getString(R.string.unreleased_extras_album) +
        		c.getString(R.string.track_length) +
        		"<font color='#006500'><i>2:23</font></i><br><br>" + 
        		c.getString(R.string.writers) +
        		"<font color='#006500'>Glenn Danzig</font>"))
        .setNeutralButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        })
        .show();       
	}
	
	public static void info18(final Context c)
	{
		//I Fought The Law
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
		//I Run NY
		new AlertDialog.Builder(c)			        
        .setMessage(Html.fromHtml(c.getString(R.string.album)+
        		c.getString(R.string.wack_extras_album) +
        		c.getString(R.string.track_length) +
        		"<font color='#006500'><i>3:05</font></i><br><br>" + 
        		c.getString(R.string.writers) +
        		"<font color='#006500'>Scott Jung</font>"))
        .setNeutralButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        })
        .show();    
	}
	
	public static void info20(final Context c)
	{
		//Jennifer
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
	
	public static void info21(final Context c)
	{
		//Lights Out
		new AlertDialog.Builder(c)			        
        .setMessage(Html.fromHtml(c.getString(R.string.album)+
        		c.getString(R.string.knowyourenemy_extras_album) +
        		c.getString(R.string.track_length) +
        		"<font color='#006500'><i>2:17</font></i><br><br>" + 
        		c.getString(R.string.writers) +
        		"<font color='#006500'>Billie Joe Armstrong, Michael Pritchard, Frank Wright</font>"))
        .setNeutralButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        })
        .show();    
	}
	
	public static void info22(final Context c)
	{
		//Like A Rolling Stone
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
	
	public static void info23(final Context c)
	{
		//Like a Rat Does Cheese
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
	
	public static void info24(final Context c)
	{
		//Look For Love
		new AlertDialog.Builder(c)			        
        .setMessage(Html.fromHtml(c.getString(R.string.album)+
        		c.getString(R.string.lookforlove_extras_album) +
        		c.getString(R.string.track_length) +
        		"<font color='#006500'><i>2:12</font></i><br><br>" + 
        		c.getString(R.string.writers) +
        		"<font color='#006500'>James and Marie Fiatarone</font>"))
        .setNeutralButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        })
        .show();      
	}
	
	public static void info25(final Context c)
	{
		//Maybe Forever
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
	
	public static void info26(final Context c)
	{
		//Mechanical Man
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
	
	public static void info27(final Context c)
	{
		//Midwest Medley
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
	
	public static void info28(final Context c)
	{
		//Minnesota Girl
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
	
	public static void info29(final Context c)
	{
		//Oh Girl
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
	
	public static void info30(final Context c)
	{
		//Olivia
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
	
	public static void info31(final Context c)
	{
		//Private Hell
		new AlertDialog.Builder(c)			        
        .setMessage(Html.fromHtml(c.getString(R.string.album)+
        		c.getString(R.string.skull_extras_album) +
        		c.getString(R.string.track_length) +
        		"<font color='#006500'><i>2:50</font></i><br><br>" + 
        		c.getString(R.string.writers) +
        		"<font color='#006500'>Iggy Pop</font>"))
        .setNeutralButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        })
        .show();    
	}
	
	public static void info32(final Context c)
	{
		//Radio
		new AlertDialog.Builder(c)			        
        .setMessage(Html.fromHtml(c.getString(R.string.album)+
        		c.getString(R.string.letsgo_extras_album) +
        		c.getString(R.string.track_length) +
        		"<font color='#006500'><i>2:51</font></i><br><br>" + 
        		c.getString(R.string.writers) +
        		"<font color='#006500'>Billie Joe Armstrong, Matt Freeman, and Tim Armstrong</font>"))
        .setNeutralButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        })
        .show();     
	}
	
	public static void info33(final Context c)
	{
		//Second Time Around
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
	
	public static void info34(final Context c)
	{
		//Shoplifter
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
	
	public static void info35(final Context c)
	{
		//Shout
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
	
	public static void info36(final Context c)
	{
		//State of Shock
	}
	
	public static void info37(final Context c)
	{
		//Supermarket
		new AlertDialog.Builder(c)			        
        .setMessage(Html.fromHtml(c.getString(R.string.album)+
        		c.getString(R.string.skull_extras_album) +
        		c.getString(R.string.track_length) +
        		"<font color='#006500'><i>3:02</font></i><br><br>" + 
        		c.getString(R.string.writers) +
        		"<font color='#006500'>Iggy Pop</font>"))
        .setNeutralButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        })
        .show();    
	}
	
	public static void info38(final Context c)
	{
		//Teenage Lobotomy
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
	
	public static void info39(final Context c)
	{
		//That's All Right
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
	
	public static void info40(final Context c)
	{
		//The Ballad of Wilhelm Fink
		new AlertDialog.Builder(c)			        
        .setMessage(Html.fromHtml(c.getString(R.string.album)+
        		c.getString(R.string.shortmusic_extras_album) +
        		c.getString(R.string.track_length) +
        		"<font color='#006500'><i>0:32</font></i><br><br>" + 
        		c.getString(R.string.writers) +
        		"<font color='#006500'>Billie Joe Armstrong</font>"))
        .setNeutralButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        })
        .show();    
	}
	
	public static void info41(final Context c)
	{
		//The Saints Are Coming
		new AlertDialog.Builder(c)			        
        .setMessage(Html.fromHtml(c.getString(R.string.album)+
        		c.getString(R.string.saints_extras_album) +
        		c.getString(R.string.track_length) +
        		"<font color='#006500'><i>3:24</font></i><br><br>" + 
        		c.getString(R.string.writers) +
        		"<font color='#006500'>Richard Jobson and Stuart Adamson</font>"))
        .setNeutralButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        })
        .show();    
	}
	
	public static void info42(final Context c)
	{
		//The Simpsons Theme
	}
	
	public static void info43(final Context c)
	{
		//The Things I Heard Today
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
	
	public static void info44(final Context c)
	{
		//Too Much, Too Soon
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
	
	public static void info45(final Context c)
	{
		//Walking the Dog
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
	
	public static void info46(final Context c)
	{
		//We Are The Champions
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
	
	public static void info47(final Context c)
	{
		//What About Today?
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
	
	public static void info48(final Context c)
	{
		//When It's Time
		new AlertDialog.Builder(c)			        
        .setMessage(Html.fromHtml(c.getString(R.string.album)+
        		c.getString(R.string.americanidiot_extras_album) +
        		c.getString(R.string.track_length) +
        		"<font color='#006500'><i>3:24</font></i><br><br>" + 
        		c.getString(R.string.writers) +
        		"<font color='#006500'>Billie Joe Armstrong, Michael Pritchard, Frank Wright</font><br><br>" +
        		c.getString(R.string.fact_extras) +
        		"<font color='#006500'>Billie wrote this song in 1994 for Adrienne</font>"))
        .setNeutralButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        })
        .show();    
	}
	
	public static void info49(final Context c)
	{
		//When Will I Be Loved
		new AlertDialog.Builder(c)			        
        .setMessage(Html.fromHtml(c.getString(R.string.album)+
        		c.getString(R.string.unreleased2_extras_album) +
        		c.getString(R.string.track_length) +
        		"<font color='#006500'><i>2:05</font></i><br><br>" + 
        		c.getString(R.string.writers) +
        		"<font color='#006500'>Phil Everly</font>"))
        .setNeutralButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        })
        .show();    
	}
	
	public static void info50(final Context c)
	{
		//Why Does It Always Rain on Me?
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
	
	public static void info51(final Context c)
	{
		//Working Class Hero
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
	
	public static void info52(final Context c)
	{
		//World Vs. World
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
	
	public static void info53(final Context c)
	{
		//You Can't Fool Me
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

}
