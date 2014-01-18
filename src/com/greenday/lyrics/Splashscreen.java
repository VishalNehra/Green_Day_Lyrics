package com.greenday.lyrics;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Splashscreen extends Activity {

private static final int SPLASH_DISPLAY_TIME = 3000; /* 3 seconds */

public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.splash);

    new Handler().postDelayed(new Runnable() {

        public void run() {

            Intent mainIntent = new Intent(Splashscreen.this,
                    MainActivity.class);
            Splashscreen.this.startActivity(mainIntent);

            Splashscreen.this.finish();
            overridePendingTransition(R.anim.mainfadein,
                    R.anim.splashfadeout);
        }
    }, SPLASH_DISPLAY_TIME);
}
}