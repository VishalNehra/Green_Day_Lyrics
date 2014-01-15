package com.greenday.tcb;

import android.app.Application;
import android.R;
import org.acra.*;
import org.acra.annotation.*;

@ReportsCrashes(formKey = "", // will not be used
mailTo = "vishalmeham2@gmail.com"
)

public class Acra extends Application {
	
	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		super.onCreate();
	}

}
