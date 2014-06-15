package com.greenday.lyrics;

import java.io.IOException;

import de.keyboardsurfer.android.widget.crouton.Crouton;
import de.keyboardsurfer.android.widget.crouton.Style;
import android.app.Activity;
import android.app.WallpaperManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
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
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.wallpaper);
		getActionBar().setDisplayHomeAsUpEnabled(true);
		
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
			"UNO",
			"DOS",
			"TRE",
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
			
			ImageView iv = (ImageView) row.findViewById(R.id.imageView1);
			if(position == 0) {
				iv.setImageResource(R.drawable.tns_cover);
				iv.setOnClickListener(new OnClickListener() {
					
					@Override
					public void onClick(View arg0) {
						// TODO Auto-generated method stub
						WallpaperManager wm = WallpaperManager.getInstance(Wallpaper.this);
						Drawable d = getResources().getDrawable(R.drawable.tns_cover);
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
			else if(position == 1) {
				iv.setImageResource(R.drawable.kerplunk_cover);
				iv.setOnClickListener(new OnClickListener() {
					
					@Override
					public void onClick(View arg0) {
						// TODO Auto-generated method stub
						WallpaperManager wm = WallpaperManager.getInstance(Wallpaper.this);
						Drawable d = getResources().getDrawable(R.drawable.kerplunk_cover);
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
			else if(position == 2) {
				iv.setImageResource(R.drawable.dookie_cover);
				iv.setOnClickListener(new OnClickListener() {
					
					@Override
					public void onClick(View arg0) {
						// TODO Auto-generated method stub
						WallpaperManager wm = WallpaperManager.getInstance(Wallpaper.this);
						Drawable d = getResources().getDrawable(R.drawable.dookie_cover);
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
			else if(position == 3) {
				iv.setImageResource(R.drawable.insomniac_cover);
				iv.setOnClickListener(new OnClickListener() {
					
					@Override
					public void onClick(View arg0) {
						// TODO Auto-generated method stub
						WallpaperManager wm = WallpaperManager.getInstance(Wallpaper.this);
						Drawable d = getResources().getDrawable(R.drawable.insomniac_cover);
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
			else if(position == 4) {
				iv.setImageResource(R.drawable.nimrod_cover);
				iv.setOnClickListener(new OnClickListener() {
					
					@Override
					public void onClick(View arg0) {
						// TODO Auto-generated method stub
						WallpaperManager wm = WallpaperManager.getInstance(Wallpaper.this);
						Drawable d = getResources().getDrawable(R.drawable.nimrod_cover);
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
			else if(position == 5) {
				iv.setImageResource(R.drawable.warning_cover);
				iv.setOnClickListener(new OnClickListener() {
					
					@Override
					public void onClick(View arg0) {
						// TODO Auto-generated method stub
						WallpaperManager wm = WallpaperManager.getInstance(Wallpaper.this);
						Drawable d = getResources().getDrawable(R.drawable.warning_cover);
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
			else if(position == 6) {
				iv.setImageResource(R.drawable.ins_cover);
				iv.setOnClickListener(new OnClickListener() {
					
					@Override
					public void onClick(View arg0) {
						// TODO Auto-generated method stub
						WallpaperManager wm = WallpaperManager.getInstance(Wallpaper.this);
						Drawable d = getResources().getDrawable(R.drawable.ins_cover);
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
			else if(position == 7) {
				iv.setImageResource(R.drawable.shenanigans_cover);
				iv.setOnClickListener(new OnClickListener() {
					
					@Override
					public void onClick(View arg0) {
						// TODO Auto-generated method stub
						WallpaperManager wm = WallpaperManager.getInstance(Wallpaper.this);
						Drawable d = getResources().getDrawable(R.drawable.shenanigans_cover);
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
			else if(position == 8) {
				iv.setImageResource(R.drawable.americanidiot_cover);
				iv.setOnClickListener(new OnClickListener() {
					
					@Override
					public void onClick(View arg0) {
						// TODO Auto-generated method stub
						WallpaperManager wm = WallpaperManager.getInstance(Wallpaper.this);
						Drawable d = getResources().getDrawable(R.drawable.americanidiot_cover);
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
			else if(position == 9) {
				iv.setImageResource(R.drawable.tcb_cover);
				iv.setOnClickListener(new OnClickListener() {
					
					@Override
					public void onClick(View arg0) {
						// TODO Auto-generated method stub
						WallpaperManager wm = WallpaperManager.getInstance(Wallpaper.this);
						Drawable d = getResources().getDrawable(R.drawable.tcb_cover);
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
			else if(position == 10) {
				iv.setImageResource(R.drawable.uno_cover);
				iv.setOnClickListener(new OnClickListener() {
					
					@Override
					public void onClick(View arg0) {
						// TODO Auto-generated method stub
						WallpaperManager wm = WallpaperManager.getInstance(Wallpaper.this);
						Drawable d = getResources().getDrawable(R.drawable.uno_cover);
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
			else if(position == 11) {
				iv.setImageResource(R.drawable.dos_cover);
				iv.setOnClickListener(new OnClickListener() {
					
					@Override
					public void onClick(View arg0) {
						// TODO Auto-generated method stub
						WallpaperManager wm = WallpaperManager.getInstance(Wallpaper.this);
						Drawable d = getResources().getDrawable(R.drawable.dos_cover);
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
			else if(position == 12) {
				iv.setImageResource(R.drawable.tre_cover);
				iv.setOnClickListener(new OnClickListener() {
					
					@Override
					public void onClick(View arg0) {
						// TODO Auto-generated method stub
						WallpaperManager wm = WallpaperManager.getInstance(Wallpaper.this);
						Drawable d = getResources().getDrawable(R.drawable.tre_cover);
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
			else if(position == 13) {
				iv.setImageResource(R.drawable.demolicious_cover);
				iv.setOnClickListener(new OnClickListener() {
					
					@Override
					public void onClick(View arg0) {
						// TODO Auto-generated method stub
						WallpaperManager wm = WallpaperManager.getInstance(Wallpaper.this);
						Drawable d = getResources().getDrawable(R.drawable.demolicious_cover);
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
			else if(position == 14) {
				iv.setImageResource(R.drawable.unreleased_cover);
				iv.setOnClickListener(new OnClickListener() {
					
					@Override
					public void onClick(View arg0) {
						// TODO Auto-generated method stub
						WallpaperManager wm = WallpaperManager.getInstance(Wallpaper.this);
						Drawable d = getResources().getDrawable(R.drawable.unreleased_cover);
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
}