package com.greenday.unreleased;

import com.greenday.lyrics.MainActivity;
import com.greenday.lyrics.R;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.text.Html;

public class Info extends Activity{
	
	public static void info17(final Context context)
	{
		new AlertDialog.Builder(context)
        .setMessage(Html.fromHtml(context.getString(R.string.album)+
        		context.getString(R.string.kerplunk_album) +
        		context.getString(R.string.track_length) +
        		"<font color='#006500'><i>2:03</i></font><br><br>" + 
        		context.getString(R.string.writers) +
        		"<font color='#006500'>Billie Joe Armstrong, Mike Dirnt, Mike Pritchard, John Kiffmeyer, Michael Pritchard</font><br><br>" +
        		context.getString(R.string.copyright) +
        		"<font color='#006500'>Green Daze Music</font>"))
        .setNeutralButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        })
        .setPositiveButton("Testing", new OnClickListener() {
			
			@Override
			public void onClick(DialogInterface arg0, int arg1) {
				// TODO Auto-generated method stub
				context.startActivity(new Intent(context, MainActivity.class));
			}
		})
        .show();  
	}

}
