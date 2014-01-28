package com.greenday.lyrics;

import com.greenday.dookie.Basketcase;
import com.greenday.dookie.Burnout;
import com.greenday.dookie.Chump;
import com.greenday.dookie.Comingclean;
import com.greenday.dookie.Emeniussleepus;
import com.greenday.dookie.FOD;
import com.greenday.dookie.Havingblast;
import com.greenday.dookie.Intheend;
import com.greenday.dookie.Longview;
import com.greenday.dookie.Pullingteeth;
import com.greenday.dookie.Sassafrasroots;
import com.greenday.dookie.She;
import com.greenday.dookie.Welcomeparadise;
import com.greenday.dookie.Whencomearound;
import com.greenday.kerplunk.Android;
import com.greenday.kerplunk.Bestthing;
import com.greenday.kerplunk.Christie;
import com.greenday.kerplunk.Eighty;
import com.greenday.kerplunk.Lightyears;
import com.greenday.kerplunk.Mygeneration;
import com.greenday.kerplunk.Nooneknows;
import com.greenday.kerplunk.Oneoflies;
import com.greenday.kerplunk.Oominated;
import com.greenday.kerplunk.Privateale;
import com.greenday.kerplunk.Razorbacks;
import com.greenday.kerplunk.Strangeland;
import com.greenday.kerplunk.Sweetchildren;
import com.greenday.kerplunk.Welcome;
import com.greenday.kerplunk.Whowrote;
import com.greenday.kerplunk.Wordsmightate;

import android.os.Bundle;
import android.app.Fragment;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class KerplunkFragment extends Fragment {
	
	public KerplunkFragment(){}
    
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
  
        View rootView = inflater.inflate(R.layout.fragment_kerplunk, container, false);
        
        ListView listview = (ListView) rootView.findViewById(R.id.listView1);

        //EDITED Code 
        String[] values = new String[] {"2000 Light Years Away",
        		"One For The Razorbacks",
        		"Welcome To Paradise",
        		"Christie Road",
        		"Private Ale",
        		"Oominated Love Slave",
        		"One Of My Lies",
        		"80",
        		"Android",
        		"No One Knows",
        		"Who Wrote Holden Caulfield?",
        		"Words I Might Have Ate",
        		"Sweet Children",
        		"Best Thing In Town",
        		"Strangeland",
        		"My Generation"};
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
                         case 0:  Intent newActivity = new Intent(getActivity(), Lightyears.class);     
                         		  startActivityForResult(newActivity, 0);
                                  break;
                         case 1:  Intent newActivity1 = new Intent(getActivity(), Razorbacks.class);     
                                  startActivityForResult(newActivity1, 1);
                                  break;
                         case 2:  Intent newActivity2 = new Intent(getActivity(), Welcome.class);     
        			              startActivityForResult(newActivity2, 1);
        			              break;
                         case 3:  Intent newActivity3 = new Intent(getActivity(), Christie.class);     
        	              		  startActivityForResult(newActivity3, 1);
        	              		  break;
                         case 4:  Intent newActivity4 = new Intent(getActivity(), Privateale.class);     
        		         		  startActivityForResult(newActivity4, 1);
        		         		  break;
                         case 5:  Intent newActivity5 = new Intent(getActivity(), Oominated.class);     
        		        		  startActivityForResult(newActivity5, 1);
        		        		  break;
                         case 6:  Intent newActivity6 = new Intent(getActivity(), Oneoflies.class);     
        			       		  startActivityForResult(newActivity6, 1);
        			       		  break;
                         case 7:  Intent newActivity7 = new Intent(getActivity(), Eighty.class);     
        			       		  startActivityForResult(newActivity7, 1);
        			       		  break;
                         case 8:  Intent newActivity8 = new Intent(getActivity(), Android.class);     
        			       		  startActivityForResult(newActivity8, 1);
        			       		  break;
                         case 9:  Intent newActivity9 = new Intent(getActivity(), Nooneknows.class);     
        			       		  startActivityForResult(newActivity9, 1);
        			       		  break; 
                         case 10: Intent newActivity10 = new Intent(getActivity(), Whowrote.class);     
        			       		  startActivityForResult(newActivity10, 1);
        			       		  break; 
                         case 11: Intent newActivity11 = new Intent(getActivity(), Wordsmightate.class);     
        			       		  startActivityForResult(newActivity11, 1);
        			       		  break;
                         case 12: Intent newActivity12 = new Intent(getActivity(), Sweetchildren.class);     
        			       		  startActivityForResult(newActivity12, 1);
        			       		  break;
                         case 13: Intent newActivity13 = new Intent(getActivity(), Bestthing.class);     
					       		  startActivityForResult(newActivity13, 1);
					       		  break;
                         case 14: Intent newActivity14 = new Intent(getActivity(), Strangeland.class);     
					       		  startActivityForResult(newActivity14, 1);
					       		  break;
                         case 15: Intent newActivity15 = new Intent(getActivity(), Mygeneration.class);     
					       		  startActivityForResult(newActivity15, 1);
					       		  break;
                  
                      }
                	 }
                });
                return rootView;
            }
           
        }