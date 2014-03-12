package com.greenday.easteregg;

import com.greenday.lyrics.Allsongs;
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
import static com.nineoldandroids.view.ViewPropertyAnimator.animate;

public class EasterPre extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		setContentView(R.layout.easterpre);
		final ImageButton ib=(ImageButton) findViewById(R.id.imageButton1);
		ib.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				//animate(ib).setDuration(2000).rotationYBy(720);
				final AnimatorSet set1 = new AnimatorSet();
				set1.playTogether(
					    //ObjectAnimator.ofFloat(ib, "rotationX", 0, 360)
					    //ObjectAnimator.ofFloat(ib, "rotationY", 0, 180)
					    ObjectAnimator.ofFloat(ib, "rotation", 0, 360)
					    //ObjectAnimator.ofFloat(ib, "translationX", 0, 90),
					    //ObjectAnimator.ofFloat(ib, "translationY", 0, 90),
					    //ObjectAnimator.ofFloat(ib, "scaleX", 1, 1.5f),
					    //ObjectAnimator.ofFloat(ib, "scaleY", 1, 0.5f),
					    //ObjectAnimator.ofFloat(ib, "alpha", 1, 0.25f, 1)
					);
				
				set1.setDuration(2 * 500).start();
				
				ib.setOnClickListener(new OnClickListener() {
					
					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
						final AnimatorSet set2 = new AnimatorSet();
						set2.playTogether(
							    ObjectAnimator.ofFloat(ib, "rotation", 0, -360)
							);
						
						set2.setDuration(2 * 500).start();
						
						ib.setOnClickListener(new OnClickListener() {
							
							@Override
							public void onClick(View v) {
								// TODO Auto-generated method stub
								final AnimatorSet set3 = new AnimatorSet();
								
								set3.playTogether(
									    ObjectAnimator.ofFloat(ib, "rotation", 0, -360)
									);
								set3.setDuration(2 * 500).start();
								
								ib.setOnClickListener(new OnClickListener() {
									
									@Override
									public void onClick(View v) {
										// TODO Auto-generated method stub
										final AnimatorSet set4 = new AnimatorSet();
										
										set4.playTogether(
											    ObjectAnimator.ofFloat(ib, "rotation", 0, 360)
											);
										
										set4.setDuration(2 * 500).start();
										                                                  
										ib.setOnClickListener(new OnClickListener() {
											
											@Override
											public void onClick(View v) {
												// TODO Auto-generated method stub
												final AnimatorSet set5 = new AnimatorSet();
												
												set5.playTogether(
													    ObjectAnimator.ofFloat(ib, "rotation", 0, 360),
													    ObjectAnimator.ofFloat(ib, "scaleX", 1, 0.0f),
													    ObjectAnimator.ofFloat(ib, "scaleY", 1, 0.0f)
													);
												new CountDownTimer(1200, 1200) {          
													
													 public void onTick(long millisUntilFinished) {             
															//set5.setDuration(2 * 450);
														 final ImageButton ib=(ImageButton) findViewById(R.id.imageButton1);
														 animate(ib).setDuration(500).rotationYBy(720)/*.x(100).y(100)*/;
													 }          

													 public void onFinish() {  
														 Toast.makeText(EasterPre.this, "You are now Green Day Super fan!", Toast.LENGTH_LONG).show();
														 
														 startActivity(new Intent(EasterPre.this, Beanbag.class));
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
