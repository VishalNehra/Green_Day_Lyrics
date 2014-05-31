package com.greenday.database;

import java.util.ArrayList;
import java.util.List;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase.CursorFactory;

public class DBHandler extends SQLiteOpenHelper {
	
	private static final int DATABASE_VERSION = 1;
	private static final String DATABASE_NAME = "favorites.db";
	private static final String TABLE_FAVORITES = "favorites";
	
	public static final String COLUMN_ID = "id";
	public static final String COLUMN_TRACKNAME = "trackname";
	public static final String COLUMN_NUMBER = "number";
	
	public DBHandler(Context context, String name,
			CursorFactory factory, int version) {
		super(context, DATABASE_NAME, factory, DATABASE_VERSION);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		String CREATE_FAVORITES_TABLE = "CREATE TABLE " + 
			TABLE_FAVORITES + "("
			+ COLUMN_ID + " INTEGER PRIMARY KEY," + COLUMN_TRACKNAME + " TEXT," 
			+ COLUMN_NUMBER + " INTEGER" + ")";
		db.execSQL(CREATE_FAVORITES_TABLE);
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
		db.execSQL("DROP TABLE IF EXISTS " + TABLE_FAVORITES);
		onCreate(db);
	}
	
	/*
	 * CRUD Operations
	 */
	
	public void addTrack(Track track) {
		
		ContentValues values = new ContentValues();
		values.put(COLUMN_TRACKNAME, track.getTrackName());
		values.put(COLUMN_NUMBER, track.getNumber());
		
		SQLiteDatabase db = this.getWritableDatabase();
		db.insert(TABLE_FAVORITES, null, values);
		db.close();
	}
	
	public Track findTrack(String trackname) {
		
		String query = "Select * FROM " + TABLE_FAVORITES + " WHERE " + COLUMN_TRACKNAME + " =  \"" + trackname + "\"";
		
		SQLiteDatabase db = this.getWritableDatabase();
		
		Cursor cursor = db.rawQuery(query, null);
		
		Track track = new Track();
		
		if(cursor.moveToFirst()) {
			cursor.moveToFirst();
			track.setID(Integer.parseInt(cursor.getString(0)));
			track.setTrackName(cursor.getString(1));
			track.setNumber(Integer.parseInt(cursor.getString(2)));
			cursor.close();
		} else {
			track = null;
		}
		db.close();
		
		return track;
	}
	
	public boolean deleteTrack(String trackname) {
		
		boolean result = false;
		
		String query = "Select * FROM " + TABLE_FAVORITES + " WHERE " + COLUMN_TRACKNAME + " =  \"" + trackname + "\"";

		SQLiteDatabase db = this.getReadableDatabase();
		
		Cursor cursor = db.rawQuery(query, null);
		
		Track track = new Track();
		
		if(cursor.moveToFirst()) {
			track.setID(Integer.parseInt(cursor.getString(0)));
			db.delete(TABLE_FAVORITES, COLUMN_ID + " = ?",
		            new String[] { String.valueOf(track.getID()) });
			cursor.close();
			result = true;
		}
		db.close();
		return result;
	}
	
	public List<Track> getAllTracks() {
		List<Track> trackList = new ArrayList<Track>();
		//Select all query
		String query = "Select * FROM " + TABLE_FAVORITES;
		
		SQLiteDatabase db = this.getWritableDatabase();
		Cursor cursor = db.rawQuery(query, null);
		
		//looping through all rows and adding to list
		if(cursor.moveToFirst()) {
			do {
				Track track = new Track();
				track.setID(Integer.parseInt(cursor.getString(0)));
				track.setTrackName(cursor.getString(1));
				track.setNumber(Integer.parseInt(cursor.getString(2)));
				//Adding to list
				trackList.add(track);
			} while(cursor.moveToNext());
		}
		
		return trackList;
	}
	
	public int getTracksCount() {
		String countquery = "Select * FROM " + TABLE_FAVORITES;
		SQLiteDatabase db = this.getWritableDatabase();
		Cursor cursor = db.rawQuery(countquery, null);
		int count = cursor.getCount();
		cursor.close();
		
		return count;
	}

}