package com.greenday.lyrics;

import java.io.File;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.preference.CheckBoxPreference;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceClickListener;
import android.preference.PreferenceActivity;
import android.preference.PreferenceManager;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.Toast;

import com.greenday.easteregg.EasterPre;
import com.greenday.lyrics.R;
import de.keyboardsurfer.android.widget.crouton.Crouton;
import de.keyboardsurfer.android.widget.crouton.Style;

public class Settings extends PreferenceActivity {

	@SuppressWarnings("deprecation")
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		Preference mCache, mchangeLog, mHints, mDisclaimer, mLicense, mText, mABTheme, mPoppyTheme, mTextTheme, mNavTheme, mAlpha, mNavWidth;
		final Preference mVersion;
		final CheckBoxPreference mDisplay;
		getActionBar().setDisplayHomeAsUpEnabled(true);
		addPreferencesFromResource(R.xml.preferences);
		
		//Action bar color
        int ab_def_color= Color.parseColor("#222222");
        int ab_color=PreferenceManager.getDefaultSharedPreferences(this).getInt("ab_theme", ab_def_color);
        ActionBar ab =getActionBar();
        ab.setBackgroundDrawable(new ColorDrawable(ab_color));
		
		/*To change settings layout as listview*/
		//this.setContentView(R.layout.pref_act);
		//ListView lv=(ListView) findViewById(R.id.listView1);
		
		//Theme
		mABTheme = findPreference("ab_theme");
		mABTheme.setOnPreferenceClickListener(new OnPreferenceClickListener() {
			
			@Override
			public boolean onPreferenceClick(Preference preference) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Settings.this, ThemeChooser.class);
				intent.putExtra("ab_theme", true);
				startActivity(intent);
				return false;
			}
		});
		mPoppyTheme=findPreference("poppy_theme");
		mPoppyTheme.setOnPreferenceClickListener(new OnPreferenceClickListener() {
			
			@Override
			public boolean onPreferenceClick(Preference preference) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Settings.this, ThemeChooser.class);
				intent.putExtra("poppy_theme", true);
				startActivity(intent);
				return false;
			}
		});
		mTextTheme=findPreference("text_theme");
		mTextTheme.setOnPreferenceClickListener(new OnPreferenceClickListener() {
			
			@Override
			public boolean onPreferenceClick(Preference preference) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Settings.this, ThemeChooser.class);
				intent.putExtra("text_theme", true);
				startActivity(intent);
				return false;
			}
		});
		mNavTheme=findPreference("nav_theme");
		mNavTheme.setOnPreferenceClickListener(new OnPreferenceClickListener() {
			
			@Override
			public boolean onPreferenceClick(Preference preference) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Settings.this, ThemeChooser.class);
				intent.putExtra("nav_theme", true);
				startActivity(intent);
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
						dialog.cancel();
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
		
		//Clear Default Shared Preferences
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
						dialog.cancel();
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
					    log.info("Settings/ERASED_DEFAULT_PREFERENCES");
					    if(Build.VERSION.SDK_INT <= 15){
					    	startActivity(new Intent(Settings.this, MainActivity.class));
					    }
					    else{
					    	navigateUpTo(new Intent(Settings.this, MainActivity.class));
					    }
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
				.setMessage(Html.fromHtml(getString(R.string.changelog_version_5) + 
								getString(R.string.changelog_change_5) + 
								getString(R.string.changelog_version_4) + 
								getString(R.string.changelog_change_4) + 
								getString(R.string.changelog_version_3) + 
								getString(R.string.changelog_change_3) + 
								getString(R.string.changelog_version_2) + 
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

						dialog.cancel();
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
						dialog.cancel();
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
				.setTitle("Open Source Licenses")
				.setMessage(Html.fromHtml("• This app is in compliance with open source licenses used by libraries in this app.<br><br>" +
						"• For more info. go to github page of this app."))
				.setPositiveButton("Close", new OnClickListener() {
					
					@Override
					public void onClick(DialogInterface dialog, int which) {
						// TODO Auto-generated method stub
						dialog.cancel();
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
			        .setNegativeButton("No", new DialogInterface.OnClickListener() {
			            public void onClick(DialogInterface dialog, int which) {
			                mDisplay.setChecked(false);
			            }
			        })
			        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
			            public void onClick(DialogInterface dialog, int which) {
			                mDisplay.setChecked(true);
			                SharedPreferences sp1 = PreferenceManager.getDefaultSharedPreferences(Settings.this);
			                sp1.edit().putBoolean("display", true).commit();
			                System.exit(0);
			            }
			        })
			        .setCancelable(false)
			        .show();    
				}
				else
				{
					SharedPreferences sp2 = PreferenceManager.getDefaultSharedPreferences(Settings.this);
	                sp2.edit().putBoolean("display", false).commit();
	                System.exit(0);
				}
				return false;
			}
		});
		mDisplay.setEnabled(true);
		
		//Text Size
		mText = findPreference("text");
		mText.setOnPreferenceClickListener(new OnPreferenceClickListener() {
			
			@Override
			public boolean onPreferenceClick(Preference arg0) {
				// TODO Auto-generated method stub
				Dialog dialog = new Dialog(Settings.this, android.R.style.Theme_Holo_Light_Dialog_NoActionBar);
				LayoutInflater inflater = (LayoutInflater) Settings.this.getSystemService(LAYOUT_INFLATER_SERVICE);
				final View layout = inflater.inflate(R.layout.seekbar_text, (ViewGroup) findViewById(R.id.seekbar));
				dialog.setContentView(layout);
				dialog.show();
				
				//Seekbar
				final SeekBar sk = (SeekBar) layout.findViewById(R.id.textseekbar);
				sk.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
					
					@Override
					public void onStopTrackingTouch(SeekBar arg0) {
						// TODO Auto-generated method stub
					}
					
					@Override
					public void onStartTrackingTouch(SeekBar arg0) {
						// TODO Auto-generated method stub
					}
					
					@Override
					public void onProgressChanged(SeekBar arg0, int progress, boolean arg2) {
						// TODO Auto-generated method stub
						TextView tv = (TextView) layout.findViewById(R.id.textView1);		//Sample text
						tv.setTextSize((float) ((progress/5.55)+9));
						TextView tv2= (TextView) layout.findViewById(R.id.textView2);		//Sample Percentage
						tv2.setText((progress)+ 50 + " %");
						tv2.setTextSize((float) ((progress/5.55)+9));
						SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(Settings.this);
						sp.edit().putInt("text", (int) ((progress/5.55)+9)).commit();
						sp.edit().putInt("def_text_seek", progress).commit();
					}
				});
				
				//Default size Checkbox
				final CheckBox cb = (CheckBox) layout.findViewById(R.id.checkBox1);
				
				//Initial
				//Seekbar
				int text_init_seekbar = PreferenceManager.getDefaultSharedPreferences(Settings.this).getInt("def_text_seek", 18);
				sk.setProgress(text_init_seekbar);
				//Text View
				final TextView tv = (TextView) layout.findViewById(R.id.textView1);		//Sample Text
				final TextView tv2 = (TextView) layout.findViewById(R.id.textView2);		//Sample Percentage
				int text_init_sample = PreferenceManager.getDefaultSharedPreferences(Settings.this).getInt("text", 18);
				tv.setTextSize(text_init_sample);
				tv2.setTextSize(text_init_sample);
				tv2.setText(text_init_seekbar + 50 + "%");
				//Checkbox
				boolean def_text = PreferenceManager.getDefaultSharedPreferences(Settings.this).getBoolean("def_text", true);
				if(def_text){
					cb.setChecked(true);
					sk.setEnabled(false);
					
					//Text Color
					tv.setTextColor(Color.parseColor("#A4A4A4"));
					tv2.setTextColor(Color.parseColor("#A4A4A4"));
				}
				else{
					cb.setChecked(false);
					sk.setEnabled(true);
					//Text Color
					tv.setTextColor(Color.parseColor("#000000"));
					tv2.setTextColor(Color.parseColor("#000000"));
				}
				
				cb.setOnCheckedChangeListener(new OnCheckedChangeListener() {
					
					@Override
					public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
						// TODO Auto-generated method stub
						SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(Settings.this);
						if(cb.isChecked()){
							sk.setEnabled(false);
							sp.edit().putBoolean("def_text", true).commit();
							sp.edit().putInt("text", 18).commit();
							//Text Color
							tv.setTextColor(Color.parseColor("#A4A4A4"));
							tv2.setTextColor(Color.parseColor("#A4A4A4"));
						}
						else{
							sp.edit().putBoolean("def_text", false).commit();
							sk.setEnabled(true);
							//Text Color
							tv.setTextColor(Color.parseColor("#000000"));
							tv2.setTextColor(Color.parseColor("#000000"));
						}
					}
				});
				
				return false;
			}
		});
		
		//Image Alpha
		mAlpha=findPreference("alpha");
		mAlpha.setOnPreferenceClickListener(new OnPreferenceClickListener() {
			
			@Override
			public boolean onPreferenceClick(Preference arg0) {
				// TODO Auto-generated method stub
				Dialog dialog=new Dialog(Settings.this, android.R.style.Theme_Holo_Light_Dialog_NoActionBar);
				LayoutInflater inflater = (LayoutInflater) Settings.this.getSystemService(LAYOUT_INFLATER_SERVICE);
				final View layout = inflater.inflate(R.layout.seekbar_image, (ViewGroup) findViewById(R.id.seekbar));
				dialog.setContentView(layout);
				dialog.show();
				
				//Seekbar
				final SeekBar sb = (SeekBar) layout.findViewById(R.id.imageSeekbar);

				//Sample image
				final ImageView iv = (ImageView) layout.findViewById(R.id.imageView1);
				
				//Default Checkbox
				final CheckBox cb = (CheckBox) layout.findViewById(R.id.checkBox1);
				
				//Seekbar listener
				sb.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
					
					@Override
					public void onStopTrackingTouch(SeekBar arg0) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void onStartTrackingTouch(SeekBar arg0) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void onProgressChanged(SeekBar arg0, int progress, boolean arg2) {
						// TODO Auto-generated method stub
						//Setting sample image transparency
						int extended_progress=(int) (progress*2.55);	//Alpha is from 0 to 255
						iv.setAlpha(extended_progress);
						
						//Saving value to shared preferences
						//Image alpha
						SharedPreferences sp=PreferenceManager.getDefaultSharedPreferences(Settings.this);
						sp.edit().putInt("alpha", extended_progress).commit();
						//Seekbar progress
						sp.edit().putInt("alpha_seekbar", progress).commit();
					}
				});
				
				//Setting initial dialog values
				//Seekbar
				int def_alpha_seekbar = 58;		//Default checkbox checked, def value is 150 (for seekbar, 150/2.55)
				int init_alpha_seekbar = PreferenceManager.getDefaultSharedPreferences(Settings.this).getInt("alpha_seekbar", def_alpha_seekbar);
				sb.setProgress(init_alpha_seekbar);
				//Sample Image
				int def_alpha_sampleImage=150;		//Default alpha value, when checkbox is checked
				int init_alpha_sampleImage = PreferenceManager.getDefaultSharedPreferences(Settings.this).getInt("alpha", def_alpha_sampleImage);
				iv.setAlpha(init_alpha_sampleImage);
				//Checkbox
				boolean def_checkbox = PreferenceManager.getDefaultSharedPreferences(Settings.this).getBoolean("alpha_def_checkbox", true);
				if(def_checkbox){
					cb.setChecked(true);
					sb.setEnabled(false);
				}
				else{
					cb.setChecked(false);
					sb.setEnabled(true);
				}
				
				//Default checkbox bahaviour
				cb.setOnCheckedChangeListener(new OnCheckedChangeListener() {
					
					@Override
					public void onCheckedChanged(CompoundButton arg0, boolean arg1) {
						// TODO Auto-generated method stub
						SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(Settings.this);
						if(cb.isChecked()){
							sp.edit().putBoolean("alpha_def_checkbox", true).commit();
							sp.edit().putInt("alpha", 70).commit();
							sb.setEnabled(false);
						}
						else{
							sp.edit().putBoolean("alpha_def_checkbox", false).commit();
							sb.setEnabled(true);
						}
					}
				});
				return false;
			}
		});
		
		//Navigation Drawer Width
		mNavWidth=findPreference("nav_width");
		mNavWidth.setOnPreferenceClickListener(new OnPreferenceClickListener() {
			
			@Override
			public boolean onPreferenceClick(Preference arg0) {
				// TODO Auto-generated method stub
				Dialog dialog=new Dialog(Settings.this, android.R.style.Theme_Holo_Light_Dialog_NoActionBar);
				LayoutInflater inflater = (LayoutInflater) Settings.this.getSystemService(LAYOUT_INFLATER_SERVICE);
				final View layout = inflater.inflate(R.layout.seekbar_nav, (ViewGroup) findViewById(R.id.seekbar));
				dialog.setContentView(layout);
				dialog.show();
				
				//Seekbar
				final SeekBar sb = (SeekBar) layout.findViewById(R.id.navSeekbar);

				//Sample text
				final TextView tv = (TextView) layout.findViewById(R.id.textView1);
				
				//Default Checkbox
				final CheckBox cb = (CheckBox) layout.findViewById(R.id.checkBox1);
				
				//Seekbar listener
				sb.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
					
					@Override
					public void onStopTrackingTouch(SeekBar arg0) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void onStartTrackingTouch(SeekBar arg0) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void onProgressChanged(SeekBar arg0, int progress, boolean arg2) {
						// TODO Auto-generated method stub
						//Setting sample image transparency
						int extended_progress = (int) ((getResources().getDisplayMetrics().widthPixels/2)+(progress*0.005*getResources().getDisplayMetrics().widthPixels));		//Setting progress from half width to full screen width
						tv.setText((50+(progress/2)) + "%\n" + "of the screen width");
						
						//Saving value to shared preferences
						//Nav width
						SharedPreferences sp=PreferenceManager.getDefaultSharedPreferences(Settings.this);
						sp.edit().putInt("nav_width", extended_progress).commit();
						//Seekbar progress
						sp.edit().putInt("nav_width_seekbar", progress).commit();
					}
				});
				
				//Setting initial dialog values
				//Seekbar
				int def_nav_seekbar = 0;		//Default checkbox checked, def value is 0 (for seekbar, 0)
				int init_nav_seekbar = PreferenceManager.getDefaultSharedPreferences(Settings.this).getInt("nav_width_seekbar", def_nav_seekbar);
				sb.setProgress(init_nav_seekbar);
				//Sample text
				int def_nav_sampleText=50;		//Default nav value, when checkbox is checked
				int init_nav_sampleText = PreferenceManager.getDefaultSharedPreferences(Settings.this).getInt("nav_width_seekbar", def_nav_sampleText);
				tv.setText((50+(init_nav_sampleText/2)) + "%\n" + "of the screen width");
				//Checkbox
				boolean def_checkbox = PreferenceManager.getDefaultSharedPreferences(Settings.this).getBoolean("nav_def_checkbox", true);
				if(def_checkbox){
					cb.setChecked(true);
					sb.setEnabled(false);
				}
				else{
					cb.setChecked(false);
					sb.setEnabled(true);
				}
				
				//Default checkbox bahaviour
				cb.setOnCheckedChangeListener(new OnCheckedChangeListener() {
					
					@Override
					public void onCheckedChanged(CompoundButton arg0, boolean arg1) {
						// TODO Auto-generated method stub
						SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(Settings.this);
						if(cb.isChecked()){
							sp.edit().putBoolean("nav_def_checkbox", true).commit();
							sp.edit().putInt("nav_width", getResources().getDisplayMetrics().widthPixels/2).commit();
							sb.setEnabled(false);
						}
						else{
							sp.edit().putBoolean("nav_def_checkbox", false).commit();
							sb.setEnabled(true);
						}
					}
				});
				return false;
			}
		});
		
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