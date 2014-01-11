package com.greenday.lyrics;

import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class TreFragment extends Fragment {
	
	public TreFragment(){}
    
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
  
        View rootView = inflater.inflate(R.layout.fragment_tre, container, false);
        
        ListView listview = (ListView) rootView.findViewById(R.id.listView1);

        //EDITED Code 
        String[] items = new String[] {"\t\t\t\t\tBrutal Love",
        		"\t\t\t\t\tMissing You",
        		"\t\t\t\t\t8th Avenue Serenade",
        		"\t\t\t\t\tDrama Queen",
        		"\t\t\t\t\tKid",
        		"\t\t\t\t\tSex, Drugs & Violence",
        		"\t\t\t\t\tLittle Boy Named Train",
        		"\t\t\t\t\tAmanda",
        		"\t\t\t\t\tWalk Away",
        		"\t\t\t\t\tDirty Rotten Bastards",
        		"\t\t\t\t\t99 Revolutions",
        		"\t\t\t\t\tHomecoming",
        		"\t\t\t\t\tThe Forgotten"};
        ArrayAdapter<String> adapter =
        new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, items); 

         listview.setAdapter(adapter);  

         //To have custom list view use this : you must define CustomeAdapter class
         // listview.setadapter(new CustomeAdapter(getActivity()));
        //getActivty is used instead of Context
          
        return rootView;
    }

}
