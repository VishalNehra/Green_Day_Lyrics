package com.greenday.lyrics;

import org.acra.ACRA;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Reportproblem extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.reportproblem);
		TextView tv=(TextView) findViewById(R.id.textView1);
		final EditText et=(EditText) findViewById(R.id.editText1);
		Button b2= (Button) findViewById(R.id.button2);
		b2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				finish();
			}
		});
		Button b=(Button) findViewById(R.id.button1);
		b.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				//Lib used to submit edittext to log
				Logger log = LoggerFactory.getLogger(Reportsong.class);
				log.info(et.getText().toString());
				//Exception to start ACRA without any crash!!
				Throwable caughtException=null;
				ACRA.getErrorReporter().handleException(caughtException);
				finish();
			}
		});

	}
}


