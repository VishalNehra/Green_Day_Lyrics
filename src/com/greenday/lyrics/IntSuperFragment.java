package com.greenday.lyrics;

import com.greenday.americanidiot.Americanidiot;
import com.greenday.americanidiot.Arewethewaiting;
import com.greenday.americanidiot.Boulevardofbd;
import com.greenday.americanidiot.Extraordgirl;
import com.greenday.americanidiot.Givemenov;
import com.greenday.americanidiot.Holiday;
import com.greenday.americanidiot.Homecoming;
import com.greenday.americanidiot.Jesusofsuburb;
import com.greenday.americanidiot.Letterbomb;
import com.greenday.americanidiot.Shesarebel;
import com.greenday.americanidiot.Stjimmy;
import com.greenday.americanidiot.Wakemeup;
import com.greenday.americanidiot.Whatshername;

import android.os.Bundle;
import android.app.Fragment;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class IntSuperFragment extends Fragment {
	
	public IntSuperFragment(){}
    
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
  
        View rootView = inflater.inflate(R.layout.fragment_intsuper, container, false);
        
        ListView listview = (ListView) rootView.findViewById(R.id.listView1);

        //EDITED Code 
        String[] values = new String[] {"\t\t\t\t\tMaria",
        		"\t\t\t\t\tPoprocks and Coke",
        		"\t\t\t\t\tLong View",
        		"\t\t\t\t\tWelcome To Paradise",
        		"\t\t\t\t\tBasket Case",
        		"\t\t\t\t\tWhen I Come Around",
        		"\t\t\t\t\tShe",
        		"\t\t\t\t\tJ.A.R. (Jason Andrew Relva)",
        		"\t\t\t\t\tGeek Stink Breath",
        		"\t\t\t\t\tBrain Stew",
        		"\t\t\t\t\tJaded",
        		"\t\t\t\t\tWalking Contradiction",
        		"\t\t\t\t\tStuck With Me",
        		"\t\t\t\t\tHitchin' a Ride",
        		"\t\t\t\t\tGood Riddance (Time of Your Life)",
        		"\t\t\t\t\tRedundant",
        		"\t\t\t\t\tNice Guys Finish Last",
        		"\t\t\t\t\tMinority",
        		"\t\t\t\t\tWarning",
        		"\t\t\t\t\tWaiting",
        		"\t\t\t\t\tMacy's Day Parade"};
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
                  
                      }
                	 }
                });
                return rootView;
            }
           
        }