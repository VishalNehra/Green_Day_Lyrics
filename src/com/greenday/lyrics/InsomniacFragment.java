package com.greenday.lyrics;

import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class InsomniacFragment extends Fragment {
	
	public InsomniacFragment(){}
    
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
  
        View rootView = inflater.inflate(R.layout.fragment_insomniac, container, false);
        
        ListView listview = (ListView) rootView.findViewById(R.id.listView1);

        //EDITED Code 
        String[] items = new String[] {"\t\t\t\t\tArmatage Shanks",
        		"\t\t\t\t\tBrat",
        		"\t\t\t\t\tStuck With Me",
        		"\t\t\t\t\tGeek Stink Breath",
        		"\t\t\t\t\tNo Pride",
        		"\t\t\t\t\tBab's Uvula Who!",
        		"\t\t\t\t\t86",
        		"\t\t\t\t\tPanic Song",
        		"\t\t\t\t\tStuart And The Ave.",
        		"\t\t\t\t\tBrain Stew",
        		"\t\t\t\t\tJaded",
        		"\t\t\t\t\tWestbound Sign",
        		"\t\t\t\t\tTight Wad Hill",
        		"\t\t\t\t\tWalking Contradiction"};
        ArrayAdapter<String> adapter =
        new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, items); 

         listview.setAdapter(adapter);  

         //To have custom list view use this : you must define CustomeAdapter class
         // listview.setadapter(new CustomeAdapter(getActivity()));
        //getActivty is used instead of Context
          
        return rootView;
    }

}
