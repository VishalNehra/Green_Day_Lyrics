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
import android.preference.CheckBoxPreference;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceClickListener;
import android.preference.PreferenceActivity;
import android.preference.SwitchPreference;
import android.text.Html;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.greenday.easteregg.EasterPre;
import com.greenday.easteregg.Easteregg;
import com.greenday.lyrics.R;
import de.keyboardsurfer.android.widget.crouton.Crouton;
import de.keyboardsurfer.android.widget.crouton.Style;

public class Settings extends PreferenceActivity {

	@SuppressWarnings("deprecation")
	@Override
	public void onCreate(Bundle savedInstanceState) {
		
		//Set theme must be used before super.oncreate or any other layout declaration
		Util.setAppTheme(this);
		
		super.onCreate(savedInstanceState);
		Preference mCache, mchangeLog, mHints, mDisclaimer, mLicense, mApplyTheme;
		final Preference mVersion;
		Preference mDonate;
		SwitchPreference mScroll, mDisplay;
		CheckBoxPreference mTouch;
		getActionBar().setDisplayHomeAsUpEnabled(true);
		addPreferencesFromResource(R.xml.preferences);
		/*To extend settings as listview
		this.setContentView(R.layout.pref_act);
		ListView lv=(ListView) findViewById(R.id.listView1);
		*/
		
		//Theme
		mApplyTheme = (Preference)findPreference("apply_theme");
		mApplyTheme.setOnPreferenceClickListener(new OnPreferenceClickListener() {
			
			@Override
			public boolean onPreferenceClick(Preference arg0) {
				// TODO Auto-generated method stub
				new AlertDialog.Builder(Settings.this)
				.setMessage("Are you sure")
				.setNegativeButton("No", new OnClickListener() {
					
					@Override
					public void onClick(DialogInterface arg0, int arg1) {
						// TODO Auto-generated method stub
						closeContextMenu();
					}
				})
				.setPositiveButton("Yes", new OnClickListener() {
					
					@Override
					public void onClick(DialogInterface dialog, int which) {
						// TODO Auto-generated method stub
						System.exit(0);
					}
				}).show();
				return false;
			}
		});
		
		//Cache
		mCache = (Preference)findPreference("cache");
		mCache.setEnabled(true);
		mCache.setOnPreferenceClickListener(new OnPreferenceClickListener() {
			
			@Override
			public boolean onPreferenceClick(Preference preference) {
				// TODO Auto-generated method stub
				/*AlertDialog cache_alert = */new AlertDialog.Builder(Settings.this)
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
					        
					}
				}).show();
				return false;
			}
		});
		
		//Clear Shared Preferences
		mHints=(Preference)findPreference("hints");
		mHints.setOnPreferenceClickListener(new OnPreferenceClickListener() {
			
			@Override
			public boolean onPreferenceClick(Preference arg0) {
				new AlertDialog.Builder(Settings.this)
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
				new AlertDialog.Builder(Settings.this)
				.setTitle("Changelog")
				.setMessage(Html.fromHtml(getString(R.string.changelog_version_2) + 
						getString(R.string.changelog_change_2) + 
								getString(R.string.changelog_version_1) + 
								getString(R.string.changelog_change_1)
								))
				.setNegativeButton("Full Changelog", new OnClickListener() {
					
					@Override
					public void onClick(DialogInterface dialog, int which) {

						Intent i = new Intent(Intent.ACTION_VIEW, 
							       Uri.parse("https://github.com/vishal0071/Green_Day_Lyrics/commits/master"));
							startActivity(i);
						//Intent to github commits
					}
				})
				.setPositiveButton("OK", new OnClickListener() {
					
					@Override
					public void onClick(DialogInterface dialog, int which) {

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
				new AlertDialog.Builder(Settings.this)
				.setTitle("Disclaimer")
				.setMessage(Html.fromHtml("• All the lyrics provided in this app belongs to their respective owners/artists.<br><br>" +
						"• I <b>DO NOT</b> own any of the lyrics provided in this app.<br><br>" +
						"• I will not be liable for any errors or omissions in any kind of information provided in this app.<br><br>" +
						"• This app is purely made for entertainment purpose only."
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
				new AlertDialog.Builder(Settings.this)
				.setTitle("Open-Source Licenses")
				.setMessage(Html.fromHtml("• This app is in compliance with open source licenses used by libraries in this app.<br><br>" +
						"• You can find the source code at Github."))
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
		
		//Scroll
		mScroll = (SwitchPreference) findPreference("scroll");
		mScroll.setEnabled(true);
		
		//Display
		mDisplay =(SwitchPreference) findPreference("display");
		mDisplay.setEnabled(false);
		
		//Touch
		mTouch = (CheckBoxPreference) findPreference("touch");
		mTouch.setEnabled(false);
		
		//Build Version
		//Ester Egg :D
		mVersion = findPreference("version");
		mVersion.setOnPreferenceClickListener(new OnPreferenceClickListener() {

			@Override
			public boolean onPreferenceClick(Preference preference) {
				// TODO Auto-generated method stub
					mVersion.setOnPreferenceClickListener(new OnPreferenceClickListener() {
						
						@Override
						public boolean onPreferenceClick(Preference arg0) {
							// TODO Auto-generated method stub
								mVersion.setOnPreferenceClickListener(new OnPreferenceClickListener() {
									
									@Override
									public boolean onPreferenceClick(Preference arg0) {
										// TODO Auto-generated method stub
											final Toast t1 = Toast.makeText(Settings.this, "You are now 3 steps away from becoming Green Day Super Fan", Toast.LENGTH_SHORT);
											t1.show();
											mVersion.setOnPreferenceClickListener(new OnPreferenceClickListener() {
												
												@Override
												public boolean onPreferenceClick(Preference preference) {
													// TODO Auto-generated method stub
														t1.cancel();
														final Toast t2 = Toast.makeText(Settings.this, "You are now 2 steps away from becoming Green Day Super Fan", Toast.LENGTH_SHORT);
														t2.show();
														mVersion.setOnPreferenceClickListener(new OnPreferenceClickListener() {
															
														@Override
														public boolean onPreferenceClick(Preference preference) {
															// TODO Auto-generated method stub
																t2.cancel();
																final Toast t3 = Toast.makeText(Settings.this, "You are now 1 steps away from becoming Green Day Super Fan", Toast.LENGTH_SHORT);
																t3.show();
																mVersion.setOnPreferenceClickListener(new OnPreferenceClickListener() {
																	
																@Override
																public boolean onPreferenceClick(Preference preference) {
																	// TODO Auto-generated method stub
																		t3.cancel();
																		Toast.makeText(Settings.this, "You are now Green Day Super fan!", Toast.LENGTH_SHORT).show();
																		startActivity(new Intent(Settings.this, EasterPre.class));
														return false;
													}
												});
												return false;
											}
										});
										return false;
									}
								});
								return false;
							}
						});
						return false;
					}
				});
				return false;
			}
		});
		
		//Donate
		mDonate = findPreference("donate");
		mDonate.setEnabled(false);
		
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

		};

		return super.onOptionsItemSelected(item);
	
	}
	
	@Override
    protected void onDestroy() {
        super.onDestroy();
      }
    
}
