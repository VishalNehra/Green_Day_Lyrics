package com.greenday.lyrics;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.widget.EditText;

public class Report {

	public static void report(Context context)
	{       
		final AlertDialog.Builder report = new AlertDialog.Builder(context);
	    final EditText input = new EditText(context);
	    report.setView(input);
	    report.setMessage("Testing message");
	    report.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
	        public void onClick(DialogInterface dialog, int whichButton) {
	            //String value = input.getText().toString();
	            //Toast.makeText(getApplicationContext(), value, Toast.LENGTH_SHORT).show();
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
