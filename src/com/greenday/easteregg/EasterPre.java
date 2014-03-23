package com.greenday.easteregg;

import com.greenday.lyrics.R;
import com.nineoldandroids.animation.AnimatorSet;
import com.nineoldandroids.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
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
				
				set1.setDuration(1 * 350).start();
				
				ib.setOnClickListener(new OnClickListener() {
					
					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
						final AnimatorSet set2 = new AnimatorSet();
						set2.playTogether(
							    ObjectAnimator.ofFloat(ib, "rotation", 0, -360)
							);
						
						set2.setDuration(1 * 350).start();
						
						ib.setOnClickListener(new OnClickListener() {
							
							@Override
							public void onClick(View v) {
								// TODO Auto-generated method stub
								final AnimatorSet set3 = new AnimatorSet();
								
								set3.playTogether(
									    ObjectAnimator.ofFloat(ib, "rotation", 0, -360)
									);
								set3.setDuration(1 * 350).start();
								
								ib.setOnClickListener(new OnClickListener() {
									
									@Override
									public void onClick(View v) {
										// TODO Auto-generated method stub
										final AnimatorSet set4 = new AnimatorSet();
										
										set4.playTogether(
											    ObjectAnimator.ofFloat(ib, "rotation", 0, 360)
											);
										
										set4.setDuration(1 * 350).start();
										                                                  
										ib.setOnClickListener(new OnClickListener() {
											
											@Override
											public void onClick(View v) {
												// TODO Auto-generated method stub
												animate(ib).setDuration(1000).rotationYBy(720);
												
												ib.setOnClickListener(new OnClickListener() {
													
													@Override
													public void onClick(View arg0) {
														// TODO Auto-generated method stub
														Intent intent = new Intent(EasterPre.this, Beanbag.class);
														startActivity(intent);
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
			}
		});
		super.onCreate(savedInstanceState);
	}
}
