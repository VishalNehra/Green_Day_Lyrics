package com.greenday.lyrics;

import android.app.Activity;
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
		b.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Toast.makeText(getApplicationContext(),

                        getString(R.string.ui_profile_toast_save_text),

                        Toast.LENGTH_SHORT).show();
				finish();
				
			}
		});

}
}

