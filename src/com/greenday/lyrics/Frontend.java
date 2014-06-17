package com.greenday.lyrics;

import java.util.HashMap;

import org.acra.*;
import org.acra.annotation.*;

import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.analytics.Tracker;

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
public class Frontend extends Application {
	
	private static final String PROPERTY_ID = "UA-50377504-1";
	//Logging TAG
	private static final String TAG = "Green Day Lyrics";
	public static int GENERAL_TRACKER = 0;
	
	public enum TrackerName {
		APP_TRACKER, // Tracker used only in this app.
		GLOBAL_TRACKER, // Tracker used by all the apps from a company. eg: roll-up tracking.
		ECOMMERCE_TRACKER, // Tracker used by all ecommerce transactions from a company.
		}
	
	HashMap<TrackerName, Tracker> mTrackers = new HashMap<TrackerName, Tracker>();
	
	public Frontend() {
		super();
		}
	
	public synchronized Tracker getTracker(TrackerName trackerId) {
		if (!mTrackers.containsKey(trackerId)) {
			
			GoogleAnalytics analytics = GoogleAnalytics.getInstance(this);
			Tracker t = (trackerId == TrackerName.APP_TRACKER) ? analytics.newTracker(R.xml.app_tracker)
			: (trackerId == TrackerName.GLOBAL_TRACKER) ? analytics.newTracker(PROPERTY_ID)
			: analytics.newTracker(R.xml.global_tracker);
			mTrackers.put(trackerId, t);
	
			}
			return mTrackers.get(trackerId);
		}
	
	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		super.onCreate();
		// The following line triggers the initialization of ACRA
        ACRA.init(this);
        
	}
}