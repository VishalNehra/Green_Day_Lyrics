package com.greenday.lyrics;

import java.util.List;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class Recents extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.recents);
		ActivityManager am = (ActivityManager) this.getSystemService(ACTIVITY_SERVICE);
		
		 
		
		     // get the info from the currently running task
		
		     List< ActivityManager.RunningTaskInfo > taskInfo = am.getRunningTasks(1);
		
		 
		
		     Log.d("topActivity", "CURRENT Activity ::"
		    		 
		    		              + taskInfo.get(0).baseActivity.getClassName());
		    		 
		    		  
		    		 
		    		      ComponentName componentInfo = taskInfo.get(0).baseActivity;
		    		 
		    		    componentInfo.getPackageName();

	}
	
}
