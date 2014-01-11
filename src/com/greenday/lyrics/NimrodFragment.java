package com.greenday.lyrics;

import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class NimrodFragment extends Fragment {
	
	public NimrodFragment(){}
    
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
  
        View rootView = inflater.inflate(R.layout.fragment_nimrod, container, false);
          
        ListView listview = (ListView) rootView.findViewById(R.id.listView1);

        //EDITED Code 
        String[] items = new String[] {"\t\t\t\t\tAll The Time",
        		"\t\t\t\t\tGood Riddance (Time Of Your Life)",
        		"\t\t\t\t\tHaushinka",
        		"\t\t\t\t\tHitchin' a Ride",
        		"\t\t\t\t\tJinx",
        		"\t\t\t\t\tKing For A Day",
        		"\t\t\t\t\tLast Ride In",
        		"\t\t\t\t\tNice Guys Finish Last",
        		"\t\t\t\t\tPlatypus (I Hate You)",
        		"\t\t\t\t\tProsthetic Head",
        		"\t\t\t\t\tRedundant",
        		"\t\t\t\t\tReject",
        		"\t\t\t\t\tScattered",
        		"\t\t\t\t\tTake Back",
        		"\t\t\t\t\tThe Grouch",
        		"\t\t\t\t\tUptight",
        		"\t\t\t\t\tWalking Alone",
        		"\t\t\t\t\tWorry Rock"};
        ArrayAdapter<String> adapter =
        new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, items); 

         listview.setAdapter(adapter);  

         //To have custom list view use this : you must define CustomeAdapter class
         // listview.setadapter(new CustomeAdapter(getActivity()));
        //getActivty is used instead of Context
        
        return rootView;
    }

}
