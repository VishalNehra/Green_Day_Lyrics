package com.greenday.lyrics;
	
	

import android.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.webkit.WebView.FindListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
	 
	public class DookieFragment extends Fragment{
	    
	    @Override
	    public View onCreateView(LayoutInflater inflater, ViewGroup container,
	    		
	            Bundle savedInstanceState) {
	  
	        View rootView = inflater.inflate(R.layout.fragment_dookie, container, false);
	        
	        ListView listview = (ListView) rootView.findViewById(R.id.listView1);

	        //EDITED Code 
	        String[] items = new String[] {"\t\t\t\t\tBurnout",
	        		"\t\t\t\t\tHaving A Blast",
	        		"\t\t\t\t\tChump",
	        		"\t\t\t\t\tLong View",
	        		"\t\t\t\t\tWelcome To Paradise",
	        		"\t\t\t\t\tPulling Teeth",
	        		"\t\t\t\t\tBasket Case",
	        		"\t\t\t\t\tShe",
	        		"\t\t\t\t\tSassafras Roots",
	        		"\t\t\t\t\tWhen I Come Around",
	        		"\t\t\t\t\tComing Clean",
	        		"\t\t\t\t\tEmenius Sleepus",
	        		"\t\t\t\t\tIn The End",
	        		"\t\t\t\t\tF.O.D."};
	        ArrayAdapter<String> adapter =
	        new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, items); 

	         listview.setAdapter(adapter);  

	         //To have custom list view use this : you must define CustomeAdapter class
	         // listview.setadapter(new CustomeAdapter(getActivity()));
	        //getActivty is used instead of Context
	        
	        return rootView;
	        
	        
	    }
	    
	   
	    
	}


