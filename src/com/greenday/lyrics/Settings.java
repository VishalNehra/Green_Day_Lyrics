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
import android.preference.PreferenceManager;
import android.text.Html;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.greenday.easteregg.EasterPre;
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
		Preference mCache, mchangeLog, mHints, mDisclaimer, mLicense, mTheme;
		final Preference mVersion;
		final CheckBoxPreference mDisplay;
		getActionBar().setDisplayHomeAsUpEnabled(true);
		addPreferencesFromResource(R.xml.preferences);
		
		/*To extend settings as listview*/
		//this.setContentView(R.layout.pref_act);
		//ListView lv=(ListView) findViewById(R.id.listView1);
		
		//Theme
		mTheme=findPreference("theme");
		mTheme.setOnPreferenceClickListener(new OnPreferenceClickListener() {
			
			@Override
			public boolean onPreferenceClick(Preference arg0) {
				new AlertDialog.Builder(Settings.this)
				.setTitle(R.string.themechooser_dialog)
				.setNegativeButton("Cancel", new OnClickListener() {
					
					@Override
					public void onClick(DialogInterface arg0, int arg1) {
						// TODO Auto-generated method stub
						closeContextMenu();
					}
				})
				.setSingleChoiceItems(R.array.themes_list, 0, new DialogInterface.OnClickListener() {
	                public void onClick(DialogInterface dialog, int item) {
	                    switch(item)
	                    {
	                        case 0:
	                                SharedPreferences tc1=PreferenceManager.getDefaultSharedPreferences(Settings.this);
	                                tc1.edit().putString("themechooser", "0").commit();
	                                System.exit(0);
	                                break;
	                        case 1:
		                        	SharedPreferences tc2=PreferenceManager.getDefaultSharedPreferences(Settings.this);
	                                tc2.edit().putString("themechooser", "1").commit();
	                                System.exit(0);
	                                break;
	                        case 2:
		                        	SharedPreferences tc3=PreferenceManager.getDefaultSharedPreferences(Settings.this);
	                                tc3.edit().putString("themechooser", "2").commit();
	                                System.exit(0);
	                                break;
	                        case 3:
		                        	SharedPreferences tc4=PreferenceManager.getDefaultSharedPreferences(Settings.this);
	                                tc4.edit().putString("themechooser", "3").commit();
	                                System.exit(0);
	                                break;
	                        case 4:
		                        	SharedPreferences tc5=PreferenceManager.getDefaultSharedPreferences(Settings.this);
	                                tc5.edit().putString("themechooser", "4").commit();
	                                System.exit(0);
                                	break;
	                        case 5:
		                        	SharedPreferences tc6=PreferenceManager.getDefaultSharedPreferences(Settings.this);
	                                tc6.edit().putString("themechooser", "5").commit();
	                                System.exit(0);
	                                break;
	                        case 6:
		                        	SharedPreferences tc7=PreferenceManager.getDefaultSharedPreferences(Settings.this);
	                                tc7.edit().putString("themechooser", "6").commit();
	                                System.exit(0);
	                                break;
	                        case 7:
		                        	SharedPreferences tc8=PreferenceManager.getDefaultSharedPreferences(Settings.this);
	                                tc8.edit().putString("themechooser", "7").commit();  
	                                System.exit(0);
	                                break;
	                        case 8:
		                        	SharedPreferences tc9=PreferenceManager.getDefaultSharedPreferences(Settings.this);
	                                tc9.edit().putString("themechooser", "8").commit();  
	                                System.exit(0);
	                                break;
	                    }
	                }
	           })
	           .show();
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
				.setMessage(Html.fromHtml("� All the lyrics provided in this app belongs to their respective owners/artists.<br><br>" +
						"� I <b>DO NOT</b> own any of the lyrics provided in this app.<br><br>" +
						"� I will not be liable for any errors or omissions in any kind of information provided in this app.<br><br>" +
						"� This app is purely made for entertainment purpose only."
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
				.setMessage(Html.fromHtml("� This app is in compliance with open source licenses used by libraries in this app.<br><br>" +
						"� You can find the source code at Github."))
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
		
		//Display
		mDisplay =(CheckBoxPreference) findPreference("display");
		mDisplay.setOnPreferenceClickListener(new OnPreferenceClickListener() {
			
			@Override
			public boolean onPreferenceClick(Preference arg0) {
				// TODO Auto-generated method stub
				if(mDisplay.isChecked())
				{
					new AlertDialog.Builder(Settings.this)
					.setTitle(Html.fromHtml("<font color='#ff0000'>Warning</font>"))
			        .setMessage(Html.fromHtml("Your screen won't turn off automatically.\n Are you sure?"))
			        .setNeutralButton("No", new DialogInterface.OnClickListener() {
			            public void onClick(DialogInterface dialog, int which) {
			                mDisplay.setChecked(false);
			            }
			        })
			        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
			            public void onClick(DialogInterface dialog, int which) {
			                mDisplay.setChecked(true);
			                SharedPreferences sp1 = PreferenceManager.getDefaultSharedPreferences(Settings.this);
			                sp1.edit().putBoolean("display", true).commit();
			            }
			        }).show();    
				}
				else
				{
					SharedPreferences sp2 = PreferenceManager.getDefaultSharedPreferences(Settings.this);
	                sp2.edit().putBoolean("display", false).commit();
				}
				return false;
			}
		});
		mDisplay.setEnabled(true);
		
		//Build Version
		//Easter Egg :D
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
																final Toast t3 = Toast.makeText(Settings.this, "You are now 1 step away from becoming Green Day Super Fan", Toast.LENGTH_SHORT);
																t3.show();
																mVersion.setOnPreferenceClickListener(new OnPreferenceClickListener() {
																	
																@Override
																public boolean onPreferenceClick(Preference preference) {
																	// TODO Auto-generated method stub
																		t3.cancel();
																		Toast.makeText(Settings.this, "HINT : Press back to exit", Toast.LENGTH_LONG).show();
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
