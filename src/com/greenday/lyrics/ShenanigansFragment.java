package com.greenday.lyrics;

import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class ShenanigansFragment extends Fragment {
	
public ShenanigansFragment(){}
    
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
  
        View rootView = inflater.inflate(R.layout.fragment_shenanigans, container, false);
        
        ListView listview = (ListView) rootView.findViewById(R.id.listView1);

        //EDITED Code 
        String[] items = new String[] {"\t\t\t\t\tSuffocate",
        		"\t\t\t\t\tDesensitized",
        		"\t\t\t\t\tYou Lied",
        		"\t\t\t\t\tOutsider",
        		"\t\t\t\t\tDon't Wanna Fall In Love",
        		"\t\t\t\t\tEspionage",
        		"\t\t\t\t\tI Want To Be On T.V.",
        		"\t\t\t\t\tScumbag",
        		"\t\t\t\t\tTired Of Waiting For You",
        		"\t\t\t\t\tSick Of Me",
        		"\t\t\t\t\tRotting",
        		"\t\t\t\t\tDo Da Da",
        		"\t\t\t\t\tOn The Wagon",
        		"\t\t\t\t\tHa Ha You're Dead"};
        ArrayAdapter<String> adapter =
        new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, items); 

         listview.setAdapter(adapter);  

         //To have custom list view use this : you must define CustomeAdapter class
         // listview.setadapter(new CustomeAdapter(getActivity()));
        //getActivty is used instead of Context
          
        return rootView;
    }

}
