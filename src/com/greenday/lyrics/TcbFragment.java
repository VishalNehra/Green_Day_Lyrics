package com.greenday.lyrics;

import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class TcbFragment extends Fragment {
	
	public TcbFragment(){}
    
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
  
        View rootView = inflater.inflate(R.layout.fragment_tcb, container, false);
        
        ListView listview = (ListView) rootView.findViewById(R.id.listView1);

        //EDITED Code 
        String[] items = new String[] {"\t\t\t\t\tSong Of The Centuary",
        		"\t\t\t\t\t21st Centuary Breakdown",
        		"\t\t\t\t\tKnow Your Enemy",
        		"\t\t\t\t\t¡Viva La Gloria!",
        		"\t\t\t\t\tBefore The Lobotomy",
        		"\t\t\t\t\tChristian's Inferno",
        		"\t\t\t\t\tLast Night On Earth",
        		"\t\t\t\t\tEast Jesus Nowhere",
        		"\t\t\t\t\tPeacemaker",
        		"\t\t\t\t\tLast Of American Girls",
        		"\t\t\t\t\tMurder City",
        		"\t\t\t\t\t¡Viva La Gloria? (Little Girl)",
        		"\t\t\t\t\tRestless Heart Syndrome",
        		"\t\t\t\t\tHorseshoes And Handgranades",
        		"\t\t\t\t\tThe Static Age",
        		"\t\t\t\t\t21 Guns",
        		"\t\t\t\t\tAmerican Eulogy\n(Mass Hysteria / Modern World)",
        		"\t\t\t\t\tSee The Light"};
        ArrayAdapter<String> adapter =
        new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, items); 

         listview.setAdapter(adapter);  

         //To have custom list view use this : you must define CustomeAdapter class
         // listview.setadapter(new CustomeAdapter(getActivity()));
        //getActivty is used instead of Context
          
        return rootView;
    }

}
