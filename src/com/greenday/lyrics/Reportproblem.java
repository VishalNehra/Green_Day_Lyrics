package com.greenday.lyrics;

import org.acra.ACRA;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.greenday.americanidiot.Americanidiot;
import com.greenday.americanidiot.Wakemeup;
import com.greenday.nimrod.Niceguys;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Reportproblem extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.reportproblem);
		TextView tv=(TextView) findViewById(R.id.textView1);
		final EditText et=(EditText) findViewById(R.id.editText1);
		TextView tv2=(TextView) findViewById(R.id.textView2);
		final EditText et2=(EditText) findViewById(R.id.editText2);
		final TextView tv3=(TextView) findViewById(R.id.textView3);
		final EditText et3=(EditText) findViewById(R.id.editText3);
		final EditText et4=(EditText) findViewById(R.id.editText4);
		Button b=(Button) findViewById(R.id.button1);
		b.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Logger log = LoggerFactory.getLogger(Reportproblem.class);
				log.info(et.getText().toString());
				log.info(et2.getText().toString());
				log.info(et3.getText().toString());
				log.info(et4.getText().toString());
				Throwable caughtException=null;
				ACRA.getErrorReporter().handleException(caughtException);	
			}
		});

	}
}


