package com.greenday.demolicious;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.text.Html;

import com.greenday.dos.Dos;
import com.greenday.lyrics.R;
import com.greenday.tre.Tre;
import com.greenday.uno.Uno;

public class Info {
	
	public static void info1(final Context c)
	{
		//99 Revolutions (Demo)
		new AlertDialog.Builder(c)
        .setMessage(Html.fromHtml(c.getString(R.string.album)+
        		c.getString(R.string.demolicious_album) +
        		c.getString(R.string.track_length) +
        		"<font color='#006500'><i>4:06</font></i><br><br>" + 
        		c.getString(R.string.writers) +
        		"<font color='#006500'>Billie Joe Armstrong, Frank E. Iii Wright, Michael Pritchard</font>"))
        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        })
        .setNegativeButton("Go To Original", new OnClickListener() {
			
			@Override
			public void onClick(DialogInterface arg0, int arg1) {
				// TODO Auto-generated method stub
				Intent newActivity = new Intent(c, Tre.class);     
                newActivity.putExtra("track", 11);
                c.startActivity(newActivity);
			}
		})
        .show();  
	}
	
	public static void info2(final Context c)
	{
		//Angel Blue (Demo)
		new AlertDialog.Builder(c)
        .setMessage(Html.fromHtml(c.getString(R.string.album)+
        		c.getString(R.string.demolicious_album) +
        		c.getString(R.string.track_length) +
        		"<font color='#006500'><i>2:55</font></i><br><br>" + 
        		c.getString(R.string.writers) +
        		"<font color='#006500'>Billie Joe Armstrong, Frank E. Iii Wright, Mike Pritchard, Michael Pritchard</font>"))
        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        })
        .setNegativeButton("Go To Original", new OnClickListener() {
			
			@Override
			public void onClick(DialogInterface arg0, int arg1) {
				// TODO Auto-generated method stub
				Intent newActivity = new Intent(c, Uno.class);     
                newActivity.putExtra("track", 9);
                c.startActivity(newActivity);
			}
		})
        .show();    
	}
	
	public static void info3(final Context c)
	{
		//Carpe Diem (Demo)
		new AlertDialog.Builder(c)
        .setMessage(Html.fromHtml(c.getString(R.string.album)+
        		c.getString(R.string.demolicious_album) +
        		c.getString(R.string.track_length) +
        		"<font color='#006500'><i>3:39</font></i><br><br>" + 
        		c.getString(R.string.writers) +
        		"<font color='#006500'>Billie Joe Armstrong, Frank E. Iii Wright, Mike Pritchard, Michael Pritchard</font>"))
        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        })
        .setNegativeButton("Go To Original", new OnClickListener() {
			
			@Override
			public void onClick(DialogInterface arg0, int arg1) {
				// TODO Auto-generated method stub
				Intent newActivity = new Intent(c, Uno.class);     
                newActivity.putExtra("track", 3);
                c.startActivity(newActivity);
			}
		})
        .show();    
	}
	
	public static void info4(final Context c)
	{
		//State Of Shock
		new AlertDialog.Builder(c)
        .setMessage(Html.fromHtml(c.getString(R.string.album)+
        		c.getString(R.string.demolicious_album) +
        		c.getString(R.string.track_length) +
        		"<font color='#006500'><i>2:28</font></i>"))
        .setNeutralButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        })
        .show();    
	}
	
	public static void info5(final Context c)
	{
		//Let Yourself Go (Demo)
		new AlertDialog.Builder(c)
        .setMessage(Html.fromHtml(c.getString(R.string.album)+
        		c.getString(R.string.demolicious_album) +
        		c.getString(R.string.track_length) +
        		"<font color='#006500'><i>3:00</font></i><br><br>" + 
        		c.getString(R.string.writers) +
        		"<font color='#006500'>Michael Pritchard, Billie Joe Armstrong, Frank E. Iii Wright, Mike Pritchard</font>"))
        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        })
        .setNegativeButton("Go To Original", new OnClickListener() {
			
			@Override
			public void onClick(DialogInterface arg0, int arg1) {
				// TODO Auto-generated method stub
				Intent newActivity = new Intent(c, Uno.class);     
                newActivity.putExtra("track", 4);
                c.startActivity(newActivity);
			}
		})
        .show();   
	}
	
	public static void info6(final Context c)
	{
		//Sex, Drugs And Violence (Demo)
		new AlertDialog.Builder(c)
        .setMessage(Html.fromHtml(c.getString(R.string.album)+
        		c.getString(R.string.demolicious_album) +
        		c.getString(R.string.track_length) +
        		"<font color='#006500'><i>3:25</font></i><br><br>" + 
        		c.getString(R.string.writers) +
        		"<font color='#006500'>Billie Joe Armstrong, Tré Cool, Mike Dirnt</font>"))
        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        })
        .setNegativeButton("Go To Original", new OnClickListener() {
			
			@Override
			public void onClick(DialogInterface arg0, int arg1) {
				// TODO Auto-generated method stub
				Intent newActivity = new Intent(c, Tre.class);     
                newActivity.putExtra("track", 6);
                c.startActivity(newActivity);
			}
		})
        .show();    
	}
	
	public static void info7(final Context c)
	{
		//Ashley (Demo)
		new AlertDialog.Builder(c)
        .setMessage(Html.fromHtml(c.getString(R.string.album)+
        		c.getString(R.string.demolicious_album) +
        		c.getString(R.string.track_length) +
        		"<font color='#006500'><i>2:47</font></i><br><br>" + 
        		c.getString(R.string.writers) +
        		"<font color='#006500'>Billie Joe Armstrong, Tré Cool, Mike Dirnt</font>"))
        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        })
        .setNegativeButton("Go To Original", new OnClickListener() {
			
			@Override
			public void onClick(DialogInterface arg0, int arg1) {
				// TODO Auto-generated method stub
				Intent newActivity = new Intent(c, Dos.class);     
                newActivity.putExtra("track", 8);
                c.startActivity(newActivity);
			}
		})
        .show();    
	}
	
	public static void info8(final Context c)
	{
		//Fell For You (Demo)
		new AlertDialog.Builder(c)
        .setMessage(Html.fromHtml(c.getString(R.string.album)+
        		c.getString(R.string.demolicious_album) +
        		c.getString(R.string.track_length) +
        		"<font color='#006500'><i>3:12</font></i><br><br>" + 
        		c.getString(R.string.writers) +
        		"<font color='#006500'>Billie Joe Armstrong, Frank E. Iii Wright, Mike Pritchard, Michael Pritchard</font>"))
        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        })
        .setNegativeButton("Go To Original", new OnClickListener() {
			
			@Override
			public void onClick(DialogInterface arg0, int arg1) {
				// TODO Auto-generated method stub
				Intent newActivity = new Intent(c, Uno.class);     
                newActivity.putExtra("track", 6);
                c.startActivity(newActivity);
			}
		})
        .show();    
	}
	
	public static void info9(final Context c)
	{
		//Stay The Night (Demo)
		new AlertDialog.Builder(c)
        .setMessage(Html.fromHtml(c.getString(R.string.album)+
        		c.getString(R.string.demolicious_album) +
        		c.getString(R.string.track_length) +
        		"<font color='#006500'><i>4:40</font></i><br><br>" + 
        		c.getString(R.string.writers) +
        		"<font color='#006500'>Billie Joe Armstrong, Frank E. Iii Wright, Mike Pritchard, Michael Pritchard</font>"))
        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        })
        .setNegativeButton("Go To Original", new OnClickListener() {
			
			@Override
			public void onClick(DialogInterface arg0, int arg1) {
				// TODO Auto-generated method stub
				Intent newActivity = new Intent(c, Uno.class);     
                newActivity.putExtra("track", 2);
                c.startActivity(newActivity);
			}
		})
        .show();    
	}
	
	public static void info10(final Context c)
	{
		//Nuclear Family (Demo)
		new AlertDialog.Builder(c)
        .setMessage(Html.fromHtml(c.getString(R.string.album)+
        		c.getString(R.string.demolicious_album) +
        		c.getString(R.string.track_length) +
        		"<font color='#006500'><i>3:03</i></font><br><br>" + 
        		c.getString(R.string.writers) +
        		"<font color='#006500'>Billie Joe Armstrong, Frank E. Iii Wright, Mike Pritchard, Michael Pritchard</font>"))
        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        })
        .setNegativeButton("Go To Original", new OnClickListener() {
			
			@Override
			public void onClick(DialogInterface arg0, int arg1) {
				// TODO Auto-generated method stub
				Intent newActivity = new Intent(c, Uno.class);     
                newActivity.putExtra("track", 1);
                c.startActivity(newActivity);
			}
		})
        .show();    
	}
	
	public static void info11(final Context c)
	{
		//Stray Heart (Demo)
		new AlertDialog.Builder(c)
        .setMessage(Html.fromHtml(c.getString(R.string.album)+
        		c.getString(R.string.demolicious_album) +
        		c.getString(R.string.track_length) +
        		"<font color='#006500'><i>3:50</font></i><br><br>" + 
        		c.getString(R.string.writers) +
        		"<font color='#006500'>Billie Joe Armstrong, Tré Cool, Mike Dirnt</font>"))
        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        })
        .setNegativeButton("Go To Original", new OnClickListener() {
			
			@Override
			public void onClick(DialogInterface arg0, int arg1) {
				// TODO Auto-generated method stub
				Intent newActivity = new Intent(c, Dos.class);     
                newActivity.putExtra("track", 7);
                c.startActivity(newActivity);
			}
		})
        .show();  
	}
	
	public static void info12(final Context c)
	{
		//Rusty James (Demo)
		new AlertDialog.Builder(c)
        .setMessage(Html.fromHtml(c.getString(R.string.album)+
        		c.getString(R.string.demolicious_album) +
        		c.getString(R.string.track_length) +
        		"<font color='#006500'><i>4:15</font></i><br><br>" + 
        		c.getString(R.string.writers) +
        		"<font color='#006500'>Billie Joe Armstrong, Tré Cool, Michael Pritchard, Mike Dirnt</font>"))
        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        })
        .setNegativeButton("Go To Original", new OnClickListener() {
			
			@Override
			public void onClick(DialogInterface arg0, int arg1) {
				// TODO Auto-generated method stub
				Intent newActivity = new Intent(c, Uno.class);     
                newActivity.putExtra("track", 11);
                c.startActivity(newActivity);
			}
		})
        .show();    
	} 
	
	public static void info13(final Context c)
	{
		//A Little Boy Named Train (Demo)
		new AlertDialog.Builder(c)
        .setMessage(Html.fromHtml(c.getString(R.string.album)+
        		c.getString(R.string.demolicious_album) +
        		c.getString(R.string.track_length) +
        		"<font color='#006500'><i>3:57</font></i><br><br>" + 
        		c.getString(R.string.writers) +
        		"<font color='#006500'>Billie Joe Armstrong, Tré Cool, Mike Dirnt</font>"))
        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        })
        .setNegativeButton("Go To Original", new OnClickListener() {
			
			@Override
			public void onClick(DialogInterface arg0, int arg1) {
				// TODO Auto-generated method stub
				Intent newActivity = new Intent(c, Tre.class);     
                newActivity.putExtra("track", 7);
                c.startActivity(newActivity);
			}
		})
        .show();    
	}
	
	public static void info14(final Context c)
	{
		//Baby Eyes (Demo)
		new AlertDialog.Builder(c)
        .setMessage(Html.fromHtml(c.getString(R.string.album)+
        		c.getString(R.string.demolicious_album) +
        		c.getString(R.string.track_length) +
        		"<font color='#006500'><i>2:15</font></i><br><br>" + 
        		c.getString(R.string.writers) +
        		"<font color='#006500'>Billie Joe Armstrong, Tré Cool, Mike Dirnt</font>"))
        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        })
        .setNegativeButton("Go To Original", new OnClickListener() {
			
			@Override
			public void onClick(DialogInterface arg0, int arg1) {
				// TODO Auto-generated method stub
				Intent newActivity = new Intent(c, Dos.class);     
                newActivity.putExtra("track", 9);
                c.startActivity(newActivity);
			}
		})
        .show();  
	}
	
	public static void info15(final Context c)
	{
		//Makeout Party (Demo)
		new AlertDialog.Builder(c)
        .setMessage(Html.fromHtml(c.getString(R.string.album)+
        		c.getString(R.string.demolicious_album) +
        		c.getString(R.string.track_length) +
        		"<font color='#006500'><i>3:12</font></i><br><br>" + 
        		c.getString(R.string.writers) +
        		"<font color='#006500'>Billie Joe Armstrong, Tré Cool, Mike Dirnt</font>"))
        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        })
        .setNegativeButton("Go To Original", new OnClickListener() {
			
			@Override
			public void onClick(DialogInterface arg0, int arg1) {
				// TODO Auto-generated method stub
				Intent newActivity = new Intent(c, Dos.class);     
                newActivity.putExtra("track", 6);
                c.startActivity(newActivity);
			}
		})
        .show();  
	}
	
	public static void info16(final Context c)
	{
		//Oh Love (Demo)
		new AlertDialog.Builder(c)
        .setMessage(Html.fromHtml(c.getString(R.string.album)+
        		c.getString(R.string.demolicious_album) +
        		c.getString(R.string.track_length) +
        		"<font color='#006500'><i>5:13</font></i><br><br>" + 
        		c.getString(R.string.writers) +
        		"<font color='#006500'>Billie Joe Armstrong, Frank E. Iii Wright, Mike Pritchard, Michael Pritchard</font>"))
        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        })
        .setNegativeButton("Go To Original", new OnClickListener() {
			
			@Override
			public void onClick(DialogInterface arg0, int arg1) {
				// TODO Auto-generated method stub
				Intent newActivity = new Intent(c, Uno.class);     
                newActivity.putExtra("track", 12);
                c.startActivity(newActivity);
			}
		})
        .show();    
	}
	
	
	public static void info17(final Context c)
	{
		//Missing You (Demo)
		new AlertDialog.Builder(c)
        .setMessage(Html.fromHtml(c.getString(R.string.album)+
        		c.getString(R.string.demolicious_album) +
        		c.getString(R.string.track_length) +
        		"<font color='#006500'><i>3:41</font></i><br><br>" + 
        		c.getString(R.string.writers) +
        		"<font color='#006500'>Tré Cool, Billie Joe Armstrong, Mike Dirnt, joe L. Thomas, Dallas Austin</font>"))
        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        })
        .setNegativeButton("Go To Original", new OnClickListener() {
			
			@Override
			public void onClick(DialogInterface arg0, int arg1) {
				// TODO Auto-generated method stub
				Intent newActivity = new Intent(c, Tre.class);     
                newActivity.putExtra("track", 2);
                c.startActivity(newActivity);
			}
		})
        .show();    
	}
	
	public static void info18(final Context c)
	{
		//Stay The Night (Acoustic)
		new AlertDialog.Builder(c)
        .setMessage(Html.fromHtml(c.getString(R.string.album)+
        		c.getString(R.string.demolicious_album) +
        		c.getString(R.string.track_length) +
        		"<font color='#006500'><i>3:09</font></i><br><br>" + 
        		c.getString(R.string.writers) +
        		"<font color='#006500'>Billie Joe Armstrong, Frank E. Iii Wright, Mike Pritchard, Michael Pritchard</font>"))
        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        })
        .setNegativeButton("Go To Original", new OnClickListener() {
			
			@Override
			public void onClick(DialogInterface arg0, int arg1) {
				// TODO Auto-generated method stub
				Intent newActivity = new Intent(c, Uno.class);     
                newActivity.putExtra("track", 2);
                c.startActivity(newActivity);
			}
		})
        .show();  
	}
	
}