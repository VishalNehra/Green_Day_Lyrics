package com.greenday.lyrics;

import java.util.ArrayList;
import java.util.List;

import com.greenday.database.DBHandler;
import com.greenday.database.Track;

import de.timroes.android.listview.EnhancedListView;
import de.timroes.android.listview.EnhancedListView.OnDismissCallback;
import de.timroes.android.listview.EnhancedListView.Undoable;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class Favorites extends Activity {
	
	//CardArrayAdapter mCardArrayAdapter;
	ArrayAdapter<String> adapter;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.favorites);
		EnhancedListView lv = (EnhancedListView) findViewById(R.id.listView1);
		
		//Getting list from database
		final DBHandler db = new DBHandler(this, null, null, 1);
		List<Track> track = db.getAllTracks();
		final ArrayList<String> list = new ArrayList<String>();
		
		for(Track t : track) {
			list.add(t.getTrackName());
		}
		
		adapter = new ArrayAdapter<String>(Favorites.this, android.R.layout.simple_list_item_1, list);
		lv.setAdapter(adapter);
		
		lv.setDismissCallback(new OnDismissCallback() {
			
			@Override
			public Undoable onDismiss(EnhancedListView listView, final int position) {
				// TODO Auto-generated method stub
				final String item = adapter.getItem(position);
			    // Remove the item from the adapter
			    adapter.remove(item);
			    // return an Undoable
			    return new EnhancedListView.Undoable() {
				      // Reinsert the item to the adapter
				      @Override 
				      public void undo() {
				    	  adapter.insert(item, position);
				      }

				      // Return a string for your item
				      @Override 
				      public String getTitle() {
				    	  return "Removed " + "\"" + item + "\""; // Undo text
				      }

				      // Delete item completely from your persistent storage
				      @Override 
				      public void discard() {
				    	  db.deleteTrack(item);
				      }
			    };

			}
		});
		//Enabling swipe to dismiss
		lv.enableSwipeToDismiss();
		//Disable touch check for undo
		lv.setRequireTouchBeforeDismiss(false);
	}
}