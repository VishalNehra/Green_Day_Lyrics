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
import android.content.res.Resources;
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
import android.webkit.WebView;
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
	private ActionBar ab;
	private Preference mCache, mchangeLog, mHints, mDisclaimer, mTranslate, 
	mLicense, mText, mABTheme, mPoppyTheme, mTextTheme, mNavTheme, mAlpha, mNavWidth, mWallpaper, mVersion, mHomeTheme;
	private CheckBoxPreference mDisplay;

	@SuppressWarnings("deprecation")
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		getActionBar().setDisplayHomeAsUpEnabled(true);
		addPreferencesFromResource(R.xml.preferences);

        ab =getActionBar();
        
        //Loading Preferences
        getPref();
		
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
		mHomeTheme = findPreference("home_theme");
		mHomeTheme.setOnPreferenceClickListener(new OnPreferenceClickListener() {
			
			String[] home_theme_list = new String[] {
				"¡Uno!",
				"¡Dos!",
				"¡Tré!"
			};
			
			@Override
			public boolean onPreferenceClick(Preference preference) {
				// TODO Auto-generated method stub
				final SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(Settings.this);
				int i = sp.getInt("home_theme", 0);
				new AlertDialog.Builder(Settings.this)
				.setTitle("Choose your favorite album")
				.setSingleChoiceItems(home_theme_list, i, new OnClickListener() {
					
					@Override
					public void onClick(DialogInterface arg0, int pos) {
						// TODO Auto-generated method stub
						sp.edit().putInt("home_theme", pos).commit();
						Toast.makeText(Settings.this, "Applied", Toast.LENGTH_LONG).show();
						arg0.cancel();
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
				.setMessage(Html.fromHtml(getString(R.string.changelog_version_6) + 
								getString(R.string.changelog_change_6) + 
								getString(R.string.changelog_version_5) + 
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
		
		//Translate
		mTranslate = findPreference("translate");
		mTranslate.setOnPreferenceClickListener(new OnPreferenceClickListener() {
			
			@Override
			public boolean onPreferenceClick(Preference arg0) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Settings.this, ReportSong.class);
				intent.putExtra("translate", true);
				startActivity(intent);
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
		//Defining dialog layout
		final Dialog dialog = new Dialog(this, android.R.style.Theme_Holo_Light_DialogWhenLarge_NoActionBar);
		//dialog.setTitle("Open-Source Licenses");
		LayoutInflater inflater = (LayoutInflater) this.getSystemService(LAYOUT_INFLATER_SERVICE);
		final View dialog_view = inflater.inflate(R.layout.open_source_licenses, null);
		dialog.setContentView(dialog_view);
		
		mLicense.setOnPreferenceClickListener(new OnPreferenceClickListener() {
			
			@Override
			public boolean onPreferenceClick(Preference arg0) {
				String oss_dialog = "<html><body>" +
						"<h3>Notices for files:</h3> " +
						"<ul><li>logback-android-1.0.10-2.jar</ul></li>" +	//logback
						"<p style = 'background-color:#eeeeee;padding-left:1em'><code>" +
						"<br>/*<br>" +
						"&nbsp;* Copyright (C) 1999-2014, QOS.ch. All rights reserved.<br>" +
						"&nbsp;*<br>" +
						"&nbsp;* This program and the accompanying materials are dual-licensed under<br>" +
						"&nbsp;* either the terms of the Eclipse Public License v1.0 as published by<br>" +
						"&nbsp;* the Eclipse Foundation<br>" +
						"&nbsp;* &nbsp;&nbsp;&nbsp;or (per the licensee\'s choosing)<br>" +
						"&nbsp;* under the terms of the GNU Lesser General Public License version 2.1<br>" +
						"&nbsp;* as published by the Free Software Foundation." +
						"<br>&nbsp;*/ " +
						"<br><br></code></p>" +
						"<h3>Notices for files:</h3>" +
						"<ul><li>slf4j-api-1.7.5.jar</ul></li>" +	//slf4j (for logback)
						"<p style = 'background-color:#eeeeee;padding-left:1em'><code>" +
						"<br>" +
						"Copyright (c) 2004-2013 QOS.ch<br>" +
						"All rights reserved.<br><br>" +
						
						"Permission is hereby granted, free  of charge, to any person obtaining<br>" +
						"a  copy  of this  software  and  associated  documentation files  (the<br>" +
						"\"Software\"), to  deal in  the Software without  restriction, including<br>" +
						"without limitation  the rights to  use, copy, modify,  merge, publish,<br>" +
						"distribute,  sublicense, and/or sell  copies of  the Software,  and to<br>" +
						"permit persons to whom the Software  is furnished to do so, subject to<br>" +
						"the following conditions:<br><br>" +
						 
						"The  above  copyright  notice  and  this permission  notice  shall  be<br>" +
						"included in all copies or substantial portions of the Software.<br><br>" +
						 
						"THE  SOFTWARE IS  PROVIDED  \"AS  IS\", WITHOUT  WARRANTY  OF ANY  KIND,<br>" +
						"EXPRESS OR  IMPLIED, INCLUDING  BUT NOT LIMITED  TO THE  WARRANTIES OF<br>" +
						"MERCHANTABILITY,    FITNESS    FOR    A   PARTICULAR    PURPOSE    AND<br>" +
						"NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE<br>" +
						"LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION<br>" +
						"OF CONTRACT, TORT OR OTHERWISE,  ARISING FROM, OUT OF OR IN CONNECTION<br>" +
						"WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.<br><br></p></code>" +
						"<h3>Notices for files:</h3>" +
						"<ul><li>nineoldandroids-2.4.0.jar</ul></li>" +	//nineoldandroids
						"<p style = 'background-color:#eeeeee;padding-left:1em'><code>" +
						"<br>/*<br>" +
						"&nbsp;* Copyright 2012 Jake Wharton<br>" +
						"&nbsp;* <br>" +
						"&nbsp;* Licensed under the Apache License, Version 2.0 (the \"License\");<br>" +
						"&nbsp;* you may not use this file except in compliance with the License.<br>" +
						"&nbsp;* You may obtain a copy of the License at<br>" +
						"&nbsp;* <br>" +
						"&nbsp;* &nbsp;&nbsp;&nbsp;http://www.apache.org/licenses/LICENSE-2.0<br>" +
						"&nbsp;* <br>" +
						"&nbsp;* Unless required by applicable law or agreed to in writing, software<br>" +
						"&nbsp;* distributed under the License is distributed on an \"AS IS\" BASIS,<br>" +
						"&nbsp;* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.<br>" +
						"&nbsp;* See the License for the specific language governing permissions and<br>" +
						"&nbsp;* limitations under the License.<br>" +
						"&nbsp;*/ " +
						"<br><br></code></p>" +
						"<h3>Notices for files:</h3>" +
						"<ul><li>acra-4.5.0.jar</ul></li>" +	//acra
						"<p style = 'background-color:#eeeeee;padding-left:1em'><code>" +
						"<br>/*<br>" +
						"&nbsp;* Copyright [yyyy] [name of copyright owner]<br>" +
						"&nbsp;* <br>" +
						"&nbsp;* Licensed under the Apache License, Version 2.0 (the \"License\");<br>" +
						"&nbsp;* you may not use this file except in compliance with the License.<br>" +
						"&nbsp;* You may obtain a copy of the License at<br>" +
						"&nbsp;* <br>" +
						"&nbsp;* &nbsp;&nbsp;&nbsp;http://www.apache.org/licenses/LICENSE-2.0<br>" +
						"&nbsp;* <br>" +
						"&nbsp;* Unless required by applicable law or agreed to in writing, software<br>" +
						"&nbsp;* distributed under the License is distributed on an \"AS IS\" BASIS,<br>" +
						"&nbsp;* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.<br>" +
						"&nbsp;* See the License for the specific language governing permissions and<br>" +
						"&nbsp;* limitations under the License.<br>" +
						"&nbsp;*/ " +
						"<br><br></code></p>" +
						"<h3>Notices for files:</h3>" +
						"<ul><li>crouton-1.8.2.jar</ul></li>" +	//crouton
						"<p style = 'background-color:#eeeeee;padding-left:1em' align='center'><code>" +
						"<br>" +
						"Apache License<br>" +
                        "Version 2.0, January 2004<br>" +
                        "http://www.apache.org/licenses/<br><br></code></p>" +
                        "<h3>Notices for libraries:</h3>" +
						"<ul><li>PoppyView</ul></li>" +	//Poppyview
						"<p style = 'background-color:#eeeeee;padding-left:1em'><code>" +
						"<br>/*<br>" +
						"&nbsp;* Copyright 2013 Flavien Laurent<br>" +
						"&nbsp;* <br>" +
						"&nbsp;* Licensed under the Apache License, Version 2.0 (the \"License\");<br>" +
						"&nbsp;* you may not use this file except in compliance with the License.<br>" +
						"&nbsp;* You may obtain a copy of the License at<br>" +
						"&nbsp;* <br>" +
						"&nbsp;* &nbsp;&nbsp;&nbsp;http://www.apache.org/licenses/LICENSE-2.0<br>" +
						"&nbsp;* <br>" +
						"&nbsp;* Unless required by applicable law or agreed to in writing, software<br>" +
						"&nbsp;* distributed under the License is distributed on an \"AS IS\" BASIS,<br>" +
						"&nbsp;* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.<br>" +
						"&nbsp;* See the License for the specific language governing permissions and<br>" +
						"&nbsp;* limitations under the License.<br>" +
						"&nbsp;*/ " +
						"<br><br></code></p>" +
                        "<h3>Notices for libraries:</h3>" +
						"<ul><li>Android Holo ColorPicker</ul></li>" +	//Holocolor picker
						"<p style = 'background-color:#eeeeee;padding-left:1em'><code>" +
						"<br>/*<br>" +
						"&nbsp;* Copyright 2012 Lars Werkman<br>" +
						"&nbsp;* <br>" +
						"&nbsp;* Licensed under the Apache License, Version 2.0 (the \"License\");<br>" +
						"&nbsp;* you may not use this file except in compliance with the License.<br>" +
						"&nbsp;* You may obtain a copy of the License at<br>" +
						"&nbsp;* <br>" +
						"&nbsp;* &nbsp;&nbsp;&nbsp;http://www.apache.org/licenses/LICENSE-2.0<br>" +
						"&nbsp;* <br>" +
						"&nbsp;* Unless required by applicable law or agreed to in writing, software<br>" +
						"&nbsp;* distributed under the License is distributed on an \"AS IS\" BASIS,<br>" +
						"&nbsp;* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.<br>" +
						"&nbsp;* See the License for the specific language governing permissions and<br>" +
						"&nbsp;* limitations under the License.<br>" +
						"&nbsp;*/ " +
						"<br><br></code></p>" +
                        "<h3>Notices for libraries:</h3>" +
						"<ul><li>EnhancedListView</ul></li>" +	//Enhanced Listview
						"<p style = 'background-color:#eeeeee;padding-left:1em'><code>" +
						"<br>/*<br>" +
						"&nbsp;* Copyright 2013 Tim Roes<br>" +
						"&nbsp;* <br>" +
						"&nbsp;* Licensed under the Apache License, Version 2.0 (the \"License\");<br>" +
						"&nbsp;* you may not use this file except in compliance with the License.<br>" +
						"&nbsp;* You may obtain a copy of the License at<br>" +
						"&nbsp;* <br>" +
						"&nbsp;* &nbsp;&nbsp;&nbsp;http://www.apache.org/licenses/LICENSE-2.0<br>" +
						"&nbsp;* <br>" +
						"&nbsp;* Unless required by applicable law or agreed to in writing, software<br>" +
						"&nbsp;* distributed under the License is distributed on an \"AS IS\" BASIS,<br>" +
						"&nbsp;* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.<br>" +
						"&nbsp;* See the License for the specific language governing permissions and<br>" +
						"&nbsp;* limitations under the License.<br>" +
						"&nbsp;*/ " +
						"<br><br></code></p>" +
                        "<h3>Notices for libraries:</h3>" +
						"<ul><li>ShowcaseView</ul></li>" +	//ShowcaseView
						"<p style = 'background-color:#eeeeee;padding-left:1em' align='center'><code>" +
						"<br>" +
						"Apache License<br>" +
                        "Version 2.0, January 2004<br>" +
                        "http://www.apache.org/licenses/<br><br></code></p>" +
						"</body></html>";
				WebView wv = (WebView) dialog_view.findViewById(R.id.webView1);
				wv.loadData(oss_dialog, "text/html", null);
				dialog.show();
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
			                //System.exit(0);
			            }
			        })
			        .setCancelable(false)
			        .show();    
				}
				else
				{
					SharedPreferences sp2 = PreferenceManager.getDefaultSharedPreferences(Settings.this);
	                sp2.edit().putBoolean("display", false).commit();
	                //System.exit(0);
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
						int px = (int) (240 * Resources.getSystem().getDisplayMetrics().density);
						if(cb.isChecked()){
							sp.edit().putBoolean("nav_def_checkbox", true).commit();
							sp.edit().putInt("nav_width", px).commit();
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
		
		//Wallpaper
		mWallpaper = findPreference("wallpaper");
		mWallpaper.setOnPreferenceClickListener(new OnPreferenceClickListener() {
			
			@Override
			public boolean onPreferenceClick(Preference arg0) {
				// TODO Auto-generated method stub
				startActivity(new Intent(Settings.this, Wallpaper.class));
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
	
	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		getPref();
		super.onResume();
	}
	
	private void getPref() {

		//Action bar color
        int ab_def_color= Color.parseColor("#222222");
        int ab_color=PreferenceManager.getDefaultSharedPreferences(this).getInt("ab_theme", ab_def_color);
        ab.setBackgroundDrawable(new ColorDrawable(ab_color));
	}
}