package com.greenday.lyrics;

import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class DosFragment extends Fragment {
	
	public DosFragment(){}
    
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
  
        View rootView = inflater.inflate(R.layout.fragment_dos, container, false);
        
        ListView listview = (ListView) rootView.findViewById(R.id.listView1);

        //EDITED Code 
        String[] items = new String[] {"\t\t\t\t\tSee You Tonight",
        		"\t\t\t\t\tFuck Time",
        		"\t\t\t\t\tStop When Red Lights Flash",
        		"\t\t\t\t\tLazy Bones",
        		"\t\t\t\t\tWild One",
        		"\t\t\t\t\tMakeout Party",
        		"\t\t\t\t\tStray Heart",
        		"\t\t\t\t\tAshley",
        		"\t\t\t\t\tBaby Eyes",
        		"\t\t\t\t\tLady Cobra",
        		"\t\t\t\t\tNightlife",
        		"\t\t\t\t\tWOW! That's Loud",
        		"\t\t\t\t\tAmy"};
        ArrayAdapter<String> adapter =
        new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, items); 

         listview.setAdapter(adapter);  

         //To have custom list view use this : you must define CustomeAdapter class
         // listview.setadapter(new CustomeAdapter(getActivity()));
        //getActivty is used instead of Context
          
        return rootView;
    }

}
