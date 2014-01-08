package com.greenday.lyrics;
	
	import android.app.Fragment;
	import android.os.Bundle;
	import android.view.LayoutInflater;
	import android.view.View;
	import android.view.ViewGroup;
	 
	public class DookieFragment extends Fragment {
	     
	    public DookieFragment(){}
	     
	    @Override
	    public View onCreateView(LayoutInflater inflater, ViewGroup container,
	            Bundle savedInstanceState) {
	  
	        View rootView = inflater.inflate(R.layout.fragment_dookie, container, false);
	          
	        return rootView;
	    }
	}


