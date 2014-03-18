package com.greenday.lyrics;

import org.acra.*;
import org.acra.annotation.*;

import android.annotation.SuppressLint;
import android.app.Application;

@SuppressLint("SdCardPath")
@ReportsCrashes(
		formKey="",
				formUri = "https://vishal007.cloudant.com/acra-greenday/",
						formUriBasicAuthLogin = "thallyindshareaseriblyst", // optional
		                formUriBasicAuthPassword = "FYS5kV5cL5nR4IHFUHWRdO3j", // optional
		                		reportType = org.acra.sender.HttpSender.Type.JSON,
							    httpMethod = org.acra.sender.HttpSender.Method.PUT,
							    		customReportContent = {
											ReportField.APP_VERSION_CODE,
											ReportField.APP_VERSION_NAME,
											ReportField.ANDROID_VERSION,
											ReportField.PACKAGE_NAME,
											ReportField.REPORT_ID,
											ReportField.BUILD,
											ReportField.STACK_TRACE,
											ReportField.APPLICATION_LOG
								 },
		 		mode = ReportingInteractionMode.TOAST,
                forceCloseDialogAfterToast = false, // optional, default false
                resToastText = R.string.crash_toast_text,
                applicationLogFile = "/data/data/com.greenday.lyrics/files/log/extra.log"
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