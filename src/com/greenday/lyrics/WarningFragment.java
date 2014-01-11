package com.greenday.lyrics;

import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class WarningFragment extends Fragment {
	
	public WarningFragment(){}
    
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
  
        View rootView = inflater.inflate(R.layout.fragment_warning, container, false);
        
        ListView listview = (ListView) rootView.findViewById(R.id.listView1);

        //EDITED Code 
        String[] items = new String[] {"\t\t\t\t\tBlood, Sex and Booze",
        		"\t\t\t\t\tCastaway",
        		"\t\t\t\t\tChurch On Sunday",
        		"\t\t\t\t\tDeadbeat Holiday",
        		"\t\t\t\t\tFashion Victim",
        		"\t\t\t\t\tHold On",
        		"\t\t\t\t\tJackass",
        		"\t\t\t\t\tMacy's Day Parade",
        		"\t\t\t\t\tMinority",
        		"\t\t\t\t\tMisery",
        		"\t\t\t\t\tWaiting",
        		"\t\t\t\t\tWarning"};
        ArrayAdapter<String> adapter =
        new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, items); 

         listview.setAdapter(adapter);  

         //To have custom list view use this : you must define CustomeAdapter class
         // listview.setadapter(new CustomeAdapter(getActivity()));
        //getActivty is used instead of Context
          
        return rootView;
    }

}
