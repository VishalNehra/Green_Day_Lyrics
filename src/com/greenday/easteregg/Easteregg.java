package com.greenday.easteregg;

import com.greenday.lyrics.R;
import com.greenday.lyrics.R.id;
import com.greenday.lyrics.R.layout;
import com.nineoldandroids.animation.AnimatorSet;
import com.nineoldandroids.animation.ObjectAnimator;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Toast;

public class Easteregg extends Activity {
	
	FlakeView flakeView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		setContentView(R.layout.easteregg);
		Toast.makeText(Easteregg.this, "Hint : Press back button to exit this screen", Toast.LENGTH_LONG).show();
		/**/
		flakeView = new FlakeView(this);
        LinearLayout container = (LinearLayout) findViewById(R.id.container);
        container.addView(flakeView);
        getWindow().setBackgroundDrawable(new ColorDrawable(Color.BLACK));
        
        Button more = (Button) findViewById(R.id.more);
        more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flakeView.addFlakes(flakeView.getNumFlakes());
            }
        });
        Button less = (Button) findViewById(R.id.less);
        less.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flakeView.subtractFlakes(flakeView.getNumFlakes() / 2);
            }
        });
        super.onCreate(savedInstanceState);
	}

    @Override
    protected void onPause() {
        super.onPause();
        flakeView.pause();
    }

    @Override
    protected void onResume() {
        super.onResume();
        flakeView.resume();
    }
}
