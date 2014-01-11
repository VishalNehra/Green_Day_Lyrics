package com.greenday.lyrics;

import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class TnsFragment extends Fragment {
	
	public TnsFragment(){}
    
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
  
        View rootView = inflater.inflate(R.layout.fragment_tns, container, false);
        
        ListView listview = (ListView) rootView.findViewById(R.id.listView1);

        //EDITED Code 
        String[] items = new String[] {"\t\t\t\t\t1000 Hours",
        		"\t\t\t\t\t16",
        		"\t\t\t\t\t409 In Your Coffeemaker",
        		"\t\t\t\t\tAt The Library",
        		"\t\t\t\t\tDissappering Boy",
        		"\t\t\t\t\tDon't Leave Me",
        		"\t\t\t\t\tDry Ice",
        		"\t\t\t\t\tGoing To Pasalacqua",
        		"\t\t\t\t\tGreen Day",
        		"\t\t\t\t\tI Want To Be Alone",
        		"\t\t\t\t\tI Was There",
        		"\t\t\t\t\tKnowledge",
        		"\t\t\t\t\tOnly Of You",
        		"\t\t\t\t\tPaper Lanterns",
        		"\t\t\t\t\tRest",
        		"\t\t\t\t\tRoad To Accptance",
        		"\t\t\t\t\tThe Judge's Daughter",
        		"\t\t\t\t\tThe One I Want",
        		"\t\t\t\t\tWhy Do You Want Him?"};
        ArrayAdapter<String> adapter =
        new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, items); 

         listview.setAdapter(adapter);  

         //To have custom list view use this : you must define CustomeAdapter class
         // listview.setadapter(new CustomeAdapter(getActivity()));
        //getActivty is used instead of Context
          
        return rootView;
    }

}
