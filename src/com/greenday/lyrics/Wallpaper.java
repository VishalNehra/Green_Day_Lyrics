package com.greenday.lyrics;

import java.io.IOException;

import com.google.android.gms.analytics.GoogleAnalytics;
import de.keyboardsurfer.android.widget.crouton.Crouton;
import de.keyboardsurfer.android.widget.crouton.Style;
import android.app.ActionBar;
import android.app.Activity;
import android.app.WallpaperManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class Wallpaper extends Activity {
	private ArrayAdapter<String> adapter;
	private String[] items;
	private ImageView iv;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.wallpaper);
		
		//Action bar color
        int ab_def_color= Color.parseColor("#222222");
        int ab_color=PreferenceManager.getDefaultSharedPreferences(this).getInt("ab_theme", ab_def_color);
        ActionBar ab =getActionBar();
        ab.setBackgroundDrawable(new ColorDrawable(ab_color));
		ab.setDisplayHomeAsUpEnabled(true);
		
		//Testing Google Analytics
		//Get a Tracker (should auto-report)
		((Frontend) getApplication()).getTracker(Frontend.TrackerName.APP_TRACKER);
		
		ListView lv = (ListView) findViewById(R.id.listView1);
		
		//Albums
		items = new String[] {
			"1039/Smoothed Out Slappy Hours",
			"Kerplunk",
			"Dookie",
			"Insomniac",
			"Nimrod",
			"Warning",
			"International Superhits!",
			"Shenanigans",
			"American Idiot",
			"21st Century Breakdown",
			"¡Uno!",
			"¡Dos!",
			"¡Tré!",
			"Demolicious",
			"Billie ?"
		};
		
		//setting adapter
		adapter = new WallpaperArrayAdapter(Wallpaper.this, android.R.layout.simple_list_item_1, items);
		lv.setAdapter(adapter);
		
	}
	
	private class WallpaperArrayAdapter extends ArrayAdapter<String> {

		public WallpaperArrayAdapter(Context context, int resource,
				String[] items) {
			super(context, resource, items);
			// TODO Auto-generated constructor stub
		}
		
		@Override
		public View getView(final int position, View convertView, ViewGroup parent) {
			// TODO Auto-generated method stub
			LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			View row = inflater.inflate(R.layout.wallpaper_list, parent, false);
			
			TextView tv = (TextView) row.findViewById(R.id.textView1);
			tv.setText(items[position]);
			
			iv = (ImageView) row.findViewById(R.id.imageView1);
			if(position == 0) {
				Drawable d = getResources().getDrawable(R.drawable.tns_cover);
				setWallpaper(R.drawable.tns_cover, position, d);
			}
			else if(position == 1) {
				Drawable d = getResources().getDrawable(R.drawable.kerplunk_cover);
				setWallpaper(R.drawable.kerplunk_cover, position, d);
			}
			else if(position == 2) {
				Drawable d = getResources().getDrawable(R.drawable.dookie_cover);
				setWallpaper(R.drawable.dookie_cover, position, d);
			}
			else if(position == 3) {
				Drawable d = getResources().getDrawable(R.drawable.insomniac_cover);
				setWallpaper(R.drawable.insomniac_cover, position, d);
			}
			else if(position == 4) {
				Drawable d = getResources().getDrawable(R.drawable.nimrod_cover);
				setWallpaper(R.drawable.nimrod_cover, position, d);
			}
			else if(position == 5) {
				Drawable d = getResources().getDrawable(R.drawable.warning_cover);
				setWallpaper(R.drawable.warning_cover, position, d);
			}
			else if(position == 6) {
				Drawable d = getResources().getDrawable(R.drawable.ins_cover);
				setWallpaper(R.drawable.ins_cover, position, d);
			}
			else if(position == 7) {
				Drawable d = getResources().getDrawable(R.drawable.shenanigans_cover);
				setWallpaper(R.drawable.shenanigans_cover, position, d);
			}
			else if(position == 8) {
				Drawable d = getResources().getDrawable(R.drawable.americanidiot_cover);
				setWallpaper(R.drawable.americanidiot_cover, position, d);
			}
			else if(position == 9) {
				Drawable d = getResources().getDrawable(R.drawable.tcb_cover);
				setWallpaper(R.drawable.tcb_cover, position, d);
			}
			else if(position == 10) {
				Drawable d = getResources().getDrawable(R.drawable.uno_cover);
				setWallpaper(R.drawable.uno_cover, position, d);
			}
			else if(position == 11) {
				Drawable d = getResources().getDrawable(R.drawable.dos_cover);
				setWallpaper(R.drawable.dos_cover, position, d);
			}
			else if(position == 12) {
				Drawable d = getResources().getDrawable(R.drawable.tre_cover);
				setWallpaper(R.drawable.tre_cover, position, d);
			}
			else if(position == 13) {
				Drawable d = getResources().getDrawable(R.drawable.demolicious_cover);
				setWallpaper(R.drawable.demolicious_cover, position, d);
			}
			else if(position == 14) {
				Drawable d = getResources().getDrawable(R.drawable.unreleased_cover);
				setWallpaper(R.drawable.unreleased_cover, position, d);
			}
			return row;
		}
	}
	
	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
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
	protected void onStart() {
		// TODO Auto-generated method stub
		//Get an Analytics tracker to report app starts & uncaught exceptions etc.
		GoogleAnalytics.getInstance(this).reportActivityStart(this);
		super.onStart();
	}
	
	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		//Stop the analytics tracking
		GoogleAnalytics.getInstance(this).reportActivityStop(this);
		super.onStop();
	}
	
	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
    	//Protect crouton
        Crouton.clearCroutonsForActivity(this);
		super.onDestroy();
	}
	
	//Setting wallpaper
	public void setWallpaper(int i, final int position, final Drawable d) {
		iv.setImageResource(i);
		iv.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				WallpaperManager wm = WallpaperManager.getInstance(Wallpaper.this);
				Bitmap b = ((BitmapDrawable) d).getBitmap();
				try {
					wm.setBitmap(b);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Crouton.makeText(Wallpaper.this, items[position] + " album art set as wallpaper", Style.INFO).show();
			}
		});
	}
}