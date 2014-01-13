package com.greenday.lyrics;

import com.greenday.albums.song_americanidiot;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.app.Fragment;
import android.content.Context;
import android.content.Intent;

public class AmericanIdiotFragment extends Fragment{
	
	public AmericanIdiotFragment(){}
    
	Context context;
	
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
    	context = getActivity();
    	
        View rootView = inflater.inflate(R.layout.fragment_americanidiot, container, false);
        ListView listview = (ListView) rootView.findViewById(R.id.listView1);

        //EDITED Code
        
        String[] values = new String[] {"\t\t\t\t\tAmerican Idiot",
        		"\t\t\t\t\tJesus Of Suburbia",
        		"\t\t\t\t\tHoliday",
        		"\t\t\t\t\tBoulevard of Broken Dreams",
        		"\t\t\t\t\tAre We The Waiting",
        		"\t\t\t\t\tSt. Jimmy",
        		"\t\t\t\t\tGive Me Novacaine",
        		"\t\t\t\t\tShe's A Rebel",
        		"\t\t\t\t\tExtraordinary Girl",
        		"\t\t\t\t\tLetterbomb",
        		"\t\t\t\t\tWake Me Up When September Ends",
        		"\t\t\t\t\tHomecoming",
        		"\t\t\t\t\tWhatsername",
        		"\t\t\t\t\tFavorite Son (Bonus Track)"};
        ArrayAdapter<String> adapter =
        new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, values); 
        super.onActivityCreated(savedInstanceState);
         listview.setAdapter(adapter);  

         //To have custom list view use this : you must define CustomeAdapter class
         // listview.setadapter(new CustomeAdapter(getActivity()));
        //getActivty is used instead of Context
        /*
         * Adding extra command below;  
         */
         
         listview.setOnItemClickListener(new AdapterView.OnItemClickListener() 
         { 
        	 public void onItemClick(AdapterView<?> p, View view, int position, long id)
        	 
        	 { 
        		 Fragment fragment = null;
        		 switch(position)
                 {
                 case 0:  Intent newActivity = new Intent(getActivity(), song_americanidiot.class);     
                 		  startActivityForResult(newActivity, 0);
                          Log.d("Option", "Option 1  was clicked!!");
                          break;
                 case 1:  Intent newActivity1 = new Intent(getActivity(), Settings.class);     
                          startActivityForResult(newActivity1, 1);
                          break;
          
              }
        	 }
        });
        return rootView;
    }
   
}
            
            	
            



