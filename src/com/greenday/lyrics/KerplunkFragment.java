package com.greenday.lyrics;

import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class KerplunkFragment extends Fragment {
	
	public KerplunkFragment(){}
    
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
  
        View rootView = inflater.inflate(R.layout.fragment_kerplunk, container, false);
        
        ListView listview = (ListView) rootView.findViewById(R.id.listView1);

        //EDITED Code 
        String[] items = new String[] {"\t\t\t\t\t2000 Light Years Away",
        		"\t\t\t\t\tOne For The Razorbacks",
        		"\t\t\t\t\tWelcome To Paradise",
        		"\t\t\t\t\tChristie Road",
        		"\t\t\t\t\tPrivate Ale",
        		"\t\t\t\t\tOominated Love Slave",
        		"\t\t\t\t\tOne Of My Lies",
        		"\t\t\t\t\t80",
        		"\t\t\t\t\tAndroid",
        		"\t\t\t\t\tNo One Knows",
        		"\t\t\t\t\tWho Wrote Holden Caulfield?",
        		"\t\t\t\t\tWords I Might Have Ate",
        		"\t\t\t\t\tSweet Children",
        		"\t\t\t\t\tBest Thing In Town",
        		"\t\t\t\t\tStrangeland",
        		"\t\t\t\t\tMy Generation"};
        ArrayAdapter<String> adapter =
        new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, items); 

         listview.setAdapter(adapter);  

         //To have custom list view use this : you must define CustomeAdapter class
         // listview.setadapter(new CustomeAdapter(getActivity()));
        //getActivty is used instead of Context
          
        return rootView;
    }

}
