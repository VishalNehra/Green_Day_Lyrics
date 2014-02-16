package com.greenday.lyrics;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.preference.CheckBoxPreference;
import android.preference.ListPreference;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceClickListener;
import android.preference.PreferenceActivity;
import android.text.Html;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CheckBox;
import android.widget.ListView;

import com.greenday.lyrics.R;

import de.keyboardsurfer.android.widget.crouton.Crouton;
import de.keyboardsurfer.android.widget.crouton.Style;

public class Settings extends PreferenceActivity {

	@SuppressWarnings("deprecation")
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		ListPreference mthemeChooser;
		Preference mCache, mchangeLog;
		
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
						AlertDialog cache_alert2 = new AlertDialog.Builder(Settings.this)
						.setMessage("Not programmed")
						.setNeutralButton("Duh!", new DialogInterface.OnClickListener() {
							
							@Override
							public void onClick(DialogInterface dialog, int which) {
								// TODO Auto-generated method stub
								closeContextMenu();
							}
						}).show();
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
						closeContextMenu();
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
}