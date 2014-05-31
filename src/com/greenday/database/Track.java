package com.greenday.database;

public class Track {
	
	private int _id;
	private String _trackname;
	private int _number;
	
	public Track() {
		
	}
	
	public Track(int id, String trackname, int number) {
		this._id = id;
		this._trackname = trackname;
		this._number = number;
	}
	
	public Track(String trackname, int number) {
		this._trackname = trackname;
		this._number = number;
	}
	
	public Track(int id) {
		this._id = id;
	}
	
	public void setID(int id) {
		this._id = id;
	}
	
	public int getID() {
		return this._id;
	}
	
	public void setTrackName(String trackname) {
		this._trackname = trackname;
	}
	
	public String getTrackName() {
		return this._trackname;
	}
	
	public void setNumber(int number) {
		this._number = number;
	}
	
	public int getNumber() {
		return this._number;
	}
	
}