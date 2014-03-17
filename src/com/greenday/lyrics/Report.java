package com.greenday.lyrics;

import org.acra.ACRA;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.PowerManager;
import android.text.Html;
import android.view.WindowManager;
import android.widget.EditText;

public class Report {

	//Report song
	public static void report1(final Context context)
	{       
		final AlertDialog.Builder report = new AlertDialog.Builder(context);
	    final EditText input = new EditText(context);
	    input.setHint("Tap to type a message...");
	    report.setView(input);
	    report.setTitle("Report incorrect lyrics");
	    //report.setIcon(R.drawable.ic_launcher);
	    report.setMessage(Html.fromHtml("<font color='#524ef8' size = '14'><b>Hint:</b></font>" +
	    		"<br>• No need to type name of track.<br>" +
	    		"<br><font color='#D3D3D3'><i>Data usage hardly in KB's</font></i>"));
	    report.setPositiveButton("Submit", new DialogInterface.OnClickListener() {
	        public void onClick(DialogInterface dialog, int whichButton) {
	            //Lib used to submit edittext to log
				Logger log = LoggerFactory.getLogger(Report.class);
				log.info(input.getText().toString());
				
				//Exception to start ACRA without any crash
				Throwable caughtException=null;
				ACRA.getErrorReporter().handleException(caughtException);
	        }
	    });

	    report.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
	        public void onClick(DialogInterface dialog, int whichButton) {
	            //closeContextMenu();
	        }
	    });
	    report.show(); 
		return;
	}
	
	//Feedback
	public static void report2(final Context context)
	{       
		final AlertDialog.Builder report = new AlertDialog.Builder(context);
	    final EditText input = new EditText(context);
	    input.setHint("Tap to type a message...");
	    report.setView(input);
	    report.setTitle("Feedback");
	    //report.setIcon(R.drawable.ic_launcher);
	    report.setMessage(Html.fromHtml("<font color='#524ef8' size = '14'><b>Hint:</b></font>" +
	    		"<br>• Give any feedback/suggestion.<br>" +
	    		"• In case of any layout problem, provide a link to the screenshot.<br>" +
	    		"<br><font color='#D3D3D3'><i>Data usage hardly in KB's</font></i>"));
	    report.setPositiveButton("Submit", new DialogInterface.OnClickListener() {
	        public void onClick(DialogInterface dialog, int whichButton) {
	            //Lib used to submit edittext to log
				Logger log = LoggerFactory.getLogger(Report.class);
				log.info(input.getText().toString());
				
				//Exception to start ACRA without any crash
				Throwable caughtException=null;
				ACRA.getErrorReporter().handleException(caughtException);
	        }
	    });

	    report.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
	        public void onClick(DialogInterface dialog, int whichButton) {
	            //closeContextMenu();
	        }
	    });
	    report.show(); 
		return;
	}
	
	//Warning_Display
		public static void warning(final Context context)
		{       
			final AlertDialog.Builder report = new AlertDialog.Builder(context);
			report.setTitle("Warning");
		    report.setMessage(Html.fromHtml("<font color='#524ef8' size = '14'><b>Hint:</b></font>" +
		    		"<br>• Give any feedback/suggestion.<br>" +
		    		"• In case of any layout problem, provide a link to the screenshot.<br>" +
		    		"<br><font color='#D3D3D3'><i>Data usage hardly in KB's</font></i>"));
		    report.setPositiveButton("Submit", new DialogInterface.OnClickListener() {
		        public void onClick(DialogInterface dialog, int whichButton) {
		        	
		        }
		    });

		    report.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
		        public void onClick(DialogInterface dialog, int whichButton) {
		            //closeContextMenu();
		        }
		    });
		    report.show(); 
			return;
		}
}
