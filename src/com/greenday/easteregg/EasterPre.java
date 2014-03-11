package com.greenday.easteregg;

import com.greenday.lyrics.R;
import com.nineoldandroids.animation.AnimatorSet;
import com.nineoldandroids.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.Toast;

public class EasterPre extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		setContentView(R.layout.easterpre);
		final ImageButton ib=(ImageButton) findViewById(R.id.imageButton1);
		final AnimatorSet set = new AnimatorSet();
		final AnimatorSet set2 = new AnimatorSet();
		set.playTogether(
		    //ObjectAnimator.ofFloat(ib, "rotationX", 0, 360)
		    //ObjectAnimator.ofFloat(ib, "rotationY", 0, 180)
		    ObjectAnimator.ofFloat(ib, "rotation", 0, 360)
		    //ObjectAnimator.ofFloat(ib, "translationX", 0, 90),
		    //ObjectAnimator.ofFloat(ib, "translationY", 0, 90),
		    //ObjectAnimator.ofFloat(ib, "scaleX", 1, 1.5f),
		    //ObjectAnimator.ofFloat(ib, "scaleY", 1, 0.5f),
		    //ObjectAnimator.ofFloat(ib, "alpha", 1, 0.25f, 1)
		);
		ib.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				//animate(ib).setDuration(2000).rotationYBy(720);
				set.setDuration(2 * 500).start();
				
				ib.setOnClickListener(new OnClickListener() {
					
					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
						set.setDuration(2 * 500).start();
						
						ib.setOnClickListener(new OnClickListener() {
							
							@Override
							public void onClick(View v) {
								// TODO Auto-generated method stub
								set.setDuration(2 * 500).start();
								
								ib.setOnClickListener(new OnClickListener() {
									
									@Override
									public void onClick(View v) {
										// TODO Auto-generated method stub
										set.setDuration(2 * 500).start();
										
										ib.setOnClickListener(new OnClickListener() {
											
											@Override
											public void onClick(View v) {
												// TODO Auto-generated method stub
												set2.playTogether(
													    //ObjectAnimator.ofFloat(ib, "rotationX", 0, 360)
													    //ObjectAnimator.ofFloat(ib, "rotationY", 0, 180)
													    ObjectAnimator.ofFloat(ib, "rotation", 0, 360),
													    //ObjectAnimator.ofFloat(ib, "translationX", 0, 90)
													    //ObjectAnimator.ofFloat(ib, "translationY", 0, 90),
													    ObjectAnimator.ofFloat(ib, "scaleX", 1, 0.0f),
													    ObjectAnimator.ofFloat(ib, "scaleY", 1, 0.0f)
													    //ObjectAnimator.ofFloat(ib, "alpha", 1, 0.25f, 1)
													);
												new CountDownTimer(1200, 1200) {          
													
													 public void onTick(long millisUntilFinished) {             
															set2.setDuration(2 * 450).start();   
													 }          

													 public void onFinish() {  
														 Toast.makeText(EasterPre.this, "You are now Green Day Super fan!", Toast.LENGTH_LONG).show();
														 startActivity(new Intent(EasterPre.this, Beanbag.class));
														 //.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK
										                   //         | Intent.FLAG_ACTIVITY_CLEAR_TASK
										                     //       | Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS);
													 }      
													}.start();
											}
										});
									}
								});
							}
						});
					}
				});
			}
		});
		super.onCreate(savedInstanceState);
	}
}
