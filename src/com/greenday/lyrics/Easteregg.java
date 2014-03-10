package com.greenday.lyrics;

import com.nineoldandroids.animation.AnimatorSet;
import com.nineoldandroids.animation.ObjectAnimator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.Toast;

public class Easteregg extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		setContentView(R.layout.easteregg);
		Toast.makeText(Easteregg.this, "Hint : Press back button to exit this screen", Toast.LENGTH_SHORT).show();
		final ImageButton ib=(ImageButton) findViewById(R.id.imageButton1);
		final AnimatorSet set = new AnimatorSet();
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
			}
		});
		super.onCreate(savedInstanceState);
	}

}
