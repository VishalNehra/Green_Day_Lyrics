package com.greenday.lyrics;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.app.Fragment;

public class AmericanIdiotFragment extends Fragment {
	
	public AmericanIdiotFragment(){}
    
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
  
        View rootView = inflater.inflate(R.layout.fragment_americanidiot, container, false);
          
        return rootView;
    }

}
