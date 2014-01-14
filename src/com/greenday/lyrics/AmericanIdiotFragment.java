package com.greenday.lyrics;

import com.greenday.albums.Whatshername;
import com.greenday.albums.Americanidiot;
import com.greenday.albums.Arewethewaiting;
import com.greenday.albums.Boulevardofbd;
import com.greenday.albums.Extraordgirl;
import com.greenday.albums.Givemenov;
import com.greenday.albums.Holiday;
import com.greenday.albums.Homecoming;
import com.greenday.albums.Jesusofsuburb;
import com.greenday.albums.Letterbomb;
import com.greenday.albums.Shesarebel;
import com.greenday.albums.Stjimmy;
import com.greenday.albums.Wakemeup;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.app.Fragment;
import android.content.Intent;

public class AmericanIdiotFragment extends Fragment{
	
	public AmericanIdiotFragment(){}
    
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
    	
    	
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
         * Adding individual onclicklistener commands below;  
         */
         
         listview.setOnItemClickListener(new AdapterView.OnItemClickListener() 
         { 
        	 public void onItemClick(AdapterView<?> p, View view, int position, long id)
        	 
        	 { 
        		 Fragment fragment = null;
        		 switch(position)
                 {
                 case 0:  Intent newActivity = new Intent(getActivity(), Americanidiot.class);     
                 		  startActivityForResult(newActivity, 0);
                          break;
                 case 1:  Intent newActivity1 = new Intent(getActivity(), Jesusofsuburb.class);     
                          startActivityForResult(newActivity1, 1);
                          break;
                 case 2:  Intent newActivity2 = new Intent(getActivity(), Holiday.class);     
			              startActivityForResult(newActivity2, 1);
			              break;
                 case 3:  Intent newActivity3 = new Intent(getActivity(), Boulevardofbd.class);     
	              		  startActivityForResult(newActivity3, 1);
	              		  break;
                 case 4:  Intent newActivity4 = new Intent(getActivity(), Arewethewaiting.class);     
		         		  startActivityForResult(newActivity4, 1);
		         		  break;
                 case 5:  Intent newActivity5 = new Intent(getActivity(), Stjimmy.class);     
		        		  startActivityForResult(newActivity5, 1);
		        		  break;
                 case 6:  Intent newActivity6 = new Intent(getActivity(), Givemenov.class);     
			       		  startActivityForResult(newActivity6, 1);
			       		  break;
                 case 7:  Intent newActivity7 = new Intent(getActivity(), Shesarebel.class);     
			       		  startActivityForResult(newActivity7, 1);
			       		  break;
                 case 8:  Intent newActivity8 = new Intent(getActivity(), Extraordgirl.class);     
			       		  startActivityForResult(newActivity8, 1);
			       		  break;
                 case 9:  Intent newActivity9 = new Intent(getActivity(), Letterbomb.class);     
			       		  startActivityForResult(newActivity9, 1);
			       		  break; 
                 case 10: Intent newActivity10 = new Intent(getActivity(), Wakemeup.class);     
			       		  startActivityForResult(newActivity10, 1);
			       		  break; 
                 case 11: Intent newActivity11 = new Intent(getActivity(), Homecoming.class);     
			       		  startActivityForResult(newActivity11, 1);
			       		  break;
                 case 12: Intent newActivity12 = new Intent(getActivity(), Whatshername.class);     
			       		  startActivityForResult(newActivity12, 1);
			       		  break;
                 case 13: Intent newActivity13 = new Intent(getActivity(), Whatshername.class);     
			       		  startActivityForResult(newActivity13, 1);
			       		  break;  		  
          
              }
        	 }
        });
        return rootView;
    }
   
}
            
            	
            



