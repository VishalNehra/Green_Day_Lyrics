package com.greenday.lyrics;

import org.acra.*;
import org.acra.annotation.*;

import android.app.Application;

@ReportsCrashes(
		formKey="",
				formUri = "http://www.bugsense.com/api/acra?api_key=dd38484a",
		mode = ReportingInteractionMode.TOAST,
        resToastText = R.string.crash_toast_text
        
		)
public class MyApplication extends Application {
	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		super.onCreate();
		// The following line triggers the initialization of ACRA
        ACRA.init(this);
	}
}