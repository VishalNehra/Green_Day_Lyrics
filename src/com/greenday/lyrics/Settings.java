package com.greenday.lyrics;

import java.io.File;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.preference.ListPreference;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceClickListener;
import android.preference.PreferenceActivity;
import android.text.Html;
import android.view.Menu;
import android.view.MenuItem;
import com.greenday.lyrics.R;

import de.keyboardsurfer.android.widget.crouton.Crouton;
import de.keyboardsurfer.android.widget.crouton.Style;

public class Settings extends PreferenceActivity {

	@SuppressWarnings("deprecation")
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		ListPreference mthemeChooser;
		Preference mCache, mchangeLog, mHints, mDisclaimer, mLicense;
		
		getActionBar().setDisplayHomeAsUpEnabled(true);
		addPreferencesFromResource(R.xml.preferences);
		/*For extending settings as listview
		this.setContentView(R.layout.pref_act);
		ListView lv=(ListView) findViewById(R.id.listView1);
		*/
		
		//Theme chooser
		mthemeChooser = (ListPreference)findPreference("themechooser");
		mthemeChooser.setEnabled(false);
		
		//Cache
		mCache = (Preference)findPreference("cache");
		mCache.setEnabled(true);
		mCache.setOnPreferenceClickListener(new OnPreferenceClickListener() {
			
			@Override
			public boolean onPreferenceClick(Preference preference) {
				// TODO Auto-generated method stub
				AlertDialog cache_alert = new AlertDialog.Builder(Settings.this)
				.setTitle("Are you sure?")
				.setMessage("This might decrease the app performance")
				.setNegativeButton("No", new DialogInterface.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface dialog, int which) {
						// TODO Auto-generated method stub
						closeContextMenu();
					}
				})
				.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface dialog, int which) {
						// TODO Auto-generated method stub
						
						Crouton.makeText(Settings.this, "Cleared", Style.CONFIRM).show();
						//Click listener to clear cache
					           File dir = Settings.this.getCacheDir();
					           if (dir != null && dir.isDirectory()) {
					              deleteDir(dir);
					           }
					     }
					    
					     public boolean deleteDir(File dir) {
					        if (dir != null && dir.isDirectory()) {
					           String[] children = dir.list();
					           for (int i = 0; i < children.length; i++) {
					              boolean success = deleteDir(new File(dir, children[i]));
					              if (!success) {
					                 return false;
					              }
					           }
					        }

					        // The directory is now empty so delete it
					        return dir.delete();
					        
					        /*For deleting cache on exit, override ondestroy;
					         * @Override
							   protected void onStop(){
							      super.onStop();
							   }
							
							   //Fires after the OnStop() state
							   @Override
							   protected void onDestroy() {
							      super.onDestroy();
							      try {
							         trimCache(this);
							      } catch (Exception e) {
							         // TODO Auto-generated catch block
							         e.printStackTrace();
							      }
							   }
							
							   public static void trimCache(Context context) {
							      try {
							         File dir = context.getCacheDir();
							         if (dir != null && dir.isDirectory()) {
							            deleteDir(dir);
							         }
							      } catch (Exception e) {
							         // TODO: handle exception
							      }
							   }
							
							   public static boolean deleteDir(File dir) {
							      if (dir != null && dir.isDirectory()) {
							         String[] children = dir.list();
							         for (int i = 0; i < children.length; i++) {
							            boolean success = deleteDir(new File(dir, children[i]));
							            if (!success) {
							               return false;
							            }
							         }
							      }
							
							      // The directory is now empty so delete it
							      return dir.delete();
							   }
							
							}*/
					        
					}
				}).show();
				return false;
			}
		});
		
		//Shared Preferences
		mHints=(Preference)findPreference("hints");
		mHints.setOnPreferenceClickListener(new OnPreferenceClickListener() {
			
			@Override
			public boolean onPreferenceClick(Preference arg0) {
				// TODO Auto-generated method stub
				AlertDialog hints_alert = new AlertDialog.Builder(Settings.this)
				.setTitle("Are you sure?")
				.setMessage("You will face all the startup instructions once again!")
				.setNegativeButton("No", new DialogInterface.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface dialog, int which) {
						// TODO Auto-generated method stub
						closeContextMenu();
					}
				})
				.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
					
					@SuppressLint("NewApi")
					@Override
					public void onClick(DialogInterface dialog, int which) {
						// TODO Auto-generated method stub
						//To clear shared preferences
						SharedPreferences settings = Settings.this.getSharedPreferences("BOOT_PREF", Context.MODE_PRIVATE); 
				        settings.edit().clear().commit();
				        Logger log = LoggerFactory.getLogger(Settings.class);
					    log.info("Settings/ERASED_PREFERENCES");
				        navigateUpTo(new Intent(Settings.this, MainActivity.class));
				        System.exit(0);
					    }
					
				}).show();
				return false;
			}
		});
		
		//Changelog
		mchangeLog = (Preference)findPreference("changelog");
		mchangeLog.setOnPreferenceClickListener(new OnPreferenceClickListener() {
			
			@Override
			public boolean onPreferenceClick(Preference arg0) {
				// TODO Auto-generated method stub
				AlertDialog changelog_alert=new AlertDialog.Builder(Settings.this)
				.setTitle("Changelog")
				.setMessage(Html.fromHtml(getString(R.string.changelog_version) + 
						getString(R.string.changelog_change)))
				.setNegativeButton("Full Changelog", new OnClickListener() {
					
					@Override
					public void onClick(DialogInterface dialog, int which) {
						// TODO Auto-generated method stub
						Intent i = new Intent(Intent.ACTION_VIEW, 
							       Uri.parse("https://github.com/vishal0071/Green_Day_Lyrics/commits/master"));
							startActivity(i);
						//Intent to github commits
					}
				})
				.setPositiveButton("OK", new OnClickListener() {
					
					@Override
					public void onClick(DialogInterface dialog, int which) {
						// TODO Auto-generated method stub
						closeContextMenu();
					}
				}).show();	
				return false;
			}
		});
		
		
		//Disclaimer
		mDisclaimer = (Preference)findPreference("disclaimer");
		mDisclaimer.setOnPreferenceClickListener(new OnPreferenceClickListener() {
			
			@Override
			public boolean onPreferenceClick(Preference arg0) {
				// TODO Auto-generated method stub
				AlertDialog disclaimer_alert=new AlertDialog.Builder(Settings.this)
				.setTitle("Disclaimer")
				.setMessage(Html.fromHtml("* All the lyrics provided in this app belongs to their respective owners/artists.<br>" +
						"* I <b>DO NOT</b> own any of the lyrics provided in this app.<br>" +
						"* I will not be liable for any errors or omissions in any kind of information provided in this app.<br>" +
						"* This app is purely made for entertainment purpose only."
				))
				.setPositiveButton("Close", new OnClickListener() {
					
					@Override
					public void onClick(DialogInterface dialog, int which) {
						// TODO Auto-generated method stub
						closeContextMenu();
					}
				}).show();	
				return false;
			}
		});
		
		//Licenses
		mLicense = (Preference)findPreference("license");
		mLicense.setOnPreferenceClickListener(new OnPreferenceClickListener() {
			
			@Override
			public boolean onPreferenceClick(Preference arg0) {
				// TODO Auto-generated method stub
				AlertDialog disclaimer_alert=new AlertDialog.Builder(Settings.this)
				.setTitle("Open Source Licenses")
				.setMessage(Html.fromHtml("* This app is in compliance with open source licenses used by libraries in this app.<br>" +
						"* You can find the source code at Github."))
				.setPositiveButton("Close", new OnClickListener() {
					
					@Override
					public void onClick(DialogInterface dialog, int which) {
						// TODO Auto-generated method stub
						closeContextMenu();
					}
				}).show();	
				return false;
			}
		});
		
	}
	
	//Actionbar code

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		return super.onCreateOptionsMenu(menu);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {

		case android.R.id.home:
			onBackPressed();
			break;

		default:

		}
		;

		return super.onOptionsItemSelected(item);
	
	}
	
	@Override
    protected void onDestroy() {
        super.onDestroy();
      }
    
}