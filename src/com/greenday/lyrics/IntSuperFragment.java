package com.greenday.lyrics;

import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class IntSuperFragment extends Fragment {
	
	public IntSuperFragment(){}
    
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
  
        View rootView = inflater.inflate(R.layout.fragment_intsuper, container, false);
        
        ListView listview = (ListView) rootView.findViewById(R.id.listView1);

        //EDITED Code 
        String[] items = new String[] {"\t\t\t\t\tMaria",
        		"\t\t\t\t\tPoprocks and Coke",
        		"\t\t\t\t\tLong View",
        		"\t\t\t\t\tWelcome To Paradise",
        		"\t\t\t\t\tBasket Case",
        		"\t\t\t\t\tWhen I Come Around",
        		"\t\t\t\t\tShe",
        		"\t\t\t\t\tJ.A.R. (Jason Andrew Relva)",
        		"\t\t\t\t\tGeek Stink Breath",
        		"\t\t\t\t\tBrain Stew",
        		"\t\t\t\t\tJaded",
        		"\t\t\t\t\tWalking Contradiction",
        		"\t\t\t\t\tStuck With Me",
        		"\t\t\t\t\tHitchin' a Ride",
        		"\t\t\t\t\tGood Riddance (Time of Your Life)",
        		"\t\t\t\t\tRedundant",
        		"\t\t\t\t\tNice Guys Finish Last",
        		"\t\t\t\t\tMinority",
        		"\t\t\t\t\tWarning",
        		"\t\t\t\t\tWaiting",
        		"\t\t\t\t\tMacy's Day Parade"};
        ArrayAdapter<String> adapter =
        new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, items); 

         listview.setAdapter(adapter);  

         //To have custom list view use this : you must define CustomeAdapter class
         // listview.setadapter(new CustomeAdapter(getActivity()));
        //getActivty is used instead of Context
          
        return rootView;
    }

}
