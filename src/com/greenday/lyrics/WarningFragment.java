package com.greenday.lyrics;

import com.greenday.warning.Bloodsex;
import com.greenday.warning.Castaway;
import com.greenday.warning.Church;
import com.greenday.warning.Deadbeat;
import com.greenday.warning.Fashion;
import com.greenday.warning.Holdon;
import com.greenday.warning.Jackass;
import com.greenday.warning.Macy;
import com.greenday.warning.Minority;
import com.greenday.warning.Misery;
import com.greenday.warning.Waiting;
import com.greenday.warning.Warning;

import android.os.Bundle;
import android.app.Fragment;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
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
        String[] values = new String[] {"\t\t\t\t\tWarning",
        		"\t\t\t\t\tBlood, Sex and Booze",
        		"\t\t\t\t\tChurch On Sunday",
        		"\t\t\t\t\tFashion Victim",
        		"\t\t\t\t\tCastaway",
        		"\t\t\t\t\tMisery",
        		"\t\t\t\t\tDeadbeat Holiday",
        		"\t\t\t\t\tHold On",
        		"\t\t\t\t\tJackass",
        		"\t\t\t\t\tWaiting",
        		"\t\t\t\t\tMinority",
        		"\t\t\t\t\tMacy's Day Parade"
        		};
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
                         case 0:  Intent newActivity = new Intent(getActivity(), Warning.class);     
                         		  startActivityForResult(newActivity, 0);
                                  break;
                         case 1:  Intent newActivity1 = new Intent(getActivity(), Bloodsex.class);     
                                  startActivityForResult(newActivity1, 1);
                                  break;
                         case 2:  Intent newActivity2 = new Intent(getActivity(), Church.class);     
        			              startActivityForResult(newActivity2, 1);
        			              break;
                         case 3:  Intent newActivity3 = new Intent(getActivity(), Fashion.class);     
        	              		  startActivityForResult(newActivity3, 1);
        	              		  break;
                         case 4:  Intent newActivity4 = new Intent(getActivity(), Castaway.class);     
        		         		  startActivityForResult(newActivity4, 1);
        		         		  break;
                         case 5:  Intent newActivity5 = new Intent(getActivity(), Misery.class);     
        		        		  startActivityForResult(newActivity5, 1);
        		        		  break;
                         case 6:  Intent newActivity6 = new Intent(getActivity(), Deadbeat.class);     
        			       		  startActivityForResult(newActivity6, 1);
        			       		  break;
                         case 7:  Intent newActivity7 = new Intent(getActivity(), Holdon.class);     
        			       		  startActivityForResult(newActivity7, 1);
        			       		  break;
                         case 8:  Intent newActivity8 = new Intent(getActivity(), Jackass.class);     
        			       		  startActivityForResult(newActivity8, 1);
        			       		  break;
                         case 9:  Intent newActivity9 = new Intent(getActivity(), Waiting.class);     
        			       		  startActivityForResult(newActivity9, 1);
        			       		  break; 
                         case 10: Intent newActivity10 = new Intent(getActivity(), Minority.class);     
        			       		  startActivityForResult(newActivity10, 1);
        			       		  break; 
                         case 11: Intent newActivity11 = new Intent(getActivity(), Macy.class);     
        			       		  startActivityForResult(newActivity11, 1);
        			       		  break;
                      }
                	 }
                });
                return rootView;
            }
           
        }