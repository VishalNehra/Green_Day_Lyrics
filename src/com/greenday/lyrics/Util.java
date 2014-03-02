package com.greenday.lyrics;

import android.app.Activity;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class Util extends Activity {

public static void setAppTheme(Activity a) {
	
    SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(a);
    int mTheme = Integer.parseInt(sp.getString("themechooser", ""));
    
    if(mTheme==0)
    {
    	a.setTheme(R.style.Theme_Default);
    }
    if(mTheme==1)
    {
    	a.setTheme(R.style.Theme_Dark);
    }
    if(mTheme==2)
    {
    	a.setTheme(R.style.Theme_Light);
    }
    if(mTheme==3)
    {
    	a.setTheme(R.style.Theme_Lime);
    }
    if(mTheme==4)
    {
    	a.setTheme(R.style.Theme_Rose);
    }
    if(mTheme==5)
    {
    	a.setTheme(R.style.Theme_Mojo);
    }
    if(mTheme==6)
    {
    	a.setTheme(R.style.Theme_Saffron);
    }
    if(mTheme==7)
    {
    	a.setTheme(R.style.Theme_Frooti);
    }
    if(mTheme==8)
    {
    	a.setTheme(R.style.Theme_Lavender);
    }
}
}


