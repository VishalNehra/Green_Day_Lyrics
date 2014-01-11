package com.greenday.lyrics;

import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class UnoFragment extends Fragment {
	
	public UnoFragment(){}
    
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
  
        View rootView = inflater.inflate(R.layout.fragment_uno, container, false);
        
        ListView listview = (ListView) rootView.findViewById(R.id.listView1);

        //EDITED Code 
        String[] items = new String[] {"\t\t\t\t\tNuclear Family",
        		"\t\t\t\t\tStay The Night",
        		"\t\t\t\t\tCarpe Diem",
        		"\t\t\t\t\tLet Yourself Go",
        		"\t\t\t\t\tKill The DJ",
        		"\t\t\t\t\tFell For You",
        		"\t\t\t\t\tLoss Of Control",
        		"\t\t\t\t\tTroublemaker",
        		"\t\t\t\t\tAngel Blue",
        		"\t\t\t\t\tSweet 16",
        		"\t\t\t\t\tRusty James",
        		"\t\t\t\t\tOh Love"};
        ArrayAdapter<String> adapter =
        new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, items); 

         listview.setAdapter(adapter);  

         //To have custom list view use this : you must define CustomeAdapter class
         // listview.setadapter(new CustomeAdapter(getActivity()));
        //getActivty is used instead of Context
          
        return rootView;
    }

}
