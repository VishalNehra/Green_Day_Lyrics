package com.greenday.easteregg;

import com.google.android.gms.analytics.GoogleAnalytics;
import com.greenday.lyrics.Frontend;
import com.greenday.lyrics.R;
import com.nineoldandroids.animation.AnimatorSet;
import com.nineoldandroids.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
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
		
		//Testing Google Analytics
		//Get a Tracker (should auto-report)
		((Frontend) getApplication()).getTracker(Frontend.TrackerName.APP_TRACKER);
		
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
														if(Build.VERSION.SDK_INT >= 16)
														{
														Intent intent = new Intent(EasterPre.this, Beanbag.class);
														startActivity(intent);
														}
														else
														{
															Toast.makeText(EasterPre.this, "You are now Green Day Super Fan!", Toast.LENGTH_LONG).show();
														}
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
	
	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		//Get an Analytics tracker to report app starts & uncaught exceptions etc.
		GoogleAnalytics.getInstance(this).reportActivityStart(this);
		super.onStart();
	}
	
	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		//Stop the analytics tracking
		GoogleAnalytics.getInstance(this).reportActivityStop(this);
		super.onStop();
	}
}
