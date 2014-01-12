package com.greenday.lyrics;

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
		EditText et=(EditText) findViewById(R.id.editText1);
		TextView tv2=(TextView) findViewById(R.id.textView2);
		EditText et2=(EditText) findViewById(R.id.editText2);
		TextView tv3=(TextView) findViewById(R.id.textView3);
		EditText et3=(EditText) findViewById(R.id.editText3);
		Button b=(Button) findViewById(R.id.button1);
	}
				public void btnsubmit(View v) {
			         final Intent _Intent = new Intent(android.content.Intent.ACTION_SEND);
			         _Intent.setType("text/html");
			         _Intent.putExtra(android.content.Intent.EXTRA_EMAIL, new String[]{ getString(R.string.mail_feedback_email) });
			         _Intent.putExtra(android.content.Intent.EXTRA_SUBJECT, getString(R.id.editText1));
			         _Intent.putExtra(android.content.Intent.EXTRA_TEXT, getString(R.id.editText3));
			         startActivity(Intent.createChooser(_Intent, getString(R.id.editText2)));
			    }   
				
				
				
		

}


