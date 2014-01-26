package com.greenday.lyrics;
	
	import com.espian.showcaseview.ShowcaseView;

import de.keyboardsurfer.android.widget.crouton.Crouton;
import de.keyboardsurfer.android.widget.crouton.Style;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
	 	
	public class HomeFragment extends Fragment {
	    public HomeFragment(){}
	    @Override
	    public View onCreateView(LayoutInflater inflater, ViewGroup container,
	            Bundle savedInstanceState) {
	  
	        View rootView = inflater.inflate(R.layout.fragment_home, container, false);
	        
	        return rootView;
	    }
	
}


