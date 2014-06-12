package com.greenday.lyrics;

import java.util.ArrayList;
import java.util.zip.Inflater;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;

public class Wallpaper extends Activity {
	private ArrayAdapter<Pair<String, Integer>> adapter;
	private ArrayList<Pair<String, Integer>> images;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.wallpaper);
		
		ListView lv = (ListView) findViewById(R.id.listView1);
		LayoutInflater inflater = (LayoutInflater)this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		
		//adding images to array
		images.add(Pair.create("American Idiot", R.drawable.americanidiot_cover));
		images.add(Pair.create("UNO", R.drawable.uno_cover));
		
		/*public View getView(int position, View convertView, ViewGroup container) {
			View vi = convertView;
			if(convertView == null) {
				vi = inflater.inflate(R.layout.wallpaper_image, null);
				ImageView iv = (ImageView) vi.findViewById(R.id.imageView1);
				
			}
			return vi;
		}*/
		
		//setting adapter
		adapter = new ArrayAdapter<Pair<String, Integer>>(Wallpaper.this, android.R.layout.simple_list_item_1, images);
		lv.setAdapter(adapter);
		
	}

}
