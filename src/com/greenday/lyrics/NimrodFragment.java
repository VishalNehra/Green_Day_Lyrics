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
import com.greenday.nimrod.Allthetime;
import com.greenday.nimrod.Goodriddance;
import com.greenday.nimrod.Grouch;
import com.greenday.nimrod.Haushinka;
import com.greenday.nimrod.Hitchinaride;
import com.greenday.nimrod.Jinx;
import com.greenday.nimrod.Kingforaday;
import com.greenday.nimrod.Lastridein;
import com.greenday.nimrod.Niceguys;
import com.greenday.nimrod.Platypus;
import com.greenday.nimrod.Prosthetichead;
import com.greenday.nimrod.Redundant;
import com.greenday.nimrod.Reject;
import com.greenday.nimrod.Scattered;
import com.greenday.nimrod.Takeback;
import com.greenday.nimrod.Uptight;
import com.greenday.nimrod.Walkingalone;
import com.greenday.nimrod.Worryrock;

import android.os.Bundle;
import android.app.Fragment;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class NimrodFragment extends Fragment {
	
	public NimrodFragment(){}
    
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
  
        View rootView = inflater.inflate(R.layout.fragment_nimrod, container, false);
          
        ListView listview = (ListView) rootView.findViewById(R.id.listView1);

        //EDITED Code 
        String[] values = new String[] {"\t\t\t\t\tNice Guys Finish Last",
        		"\t\t\t\t\tHitchin' A Ride",
        		"\t\t\t\t\tThe Grouch",
        		"\t\t\t\t\tRedundant",
        		"\t\t\t\t\tScattered",
        		"\t\t\t\t\tAll The Time",
        		"\t\t\t\t\tWorry Rock",
        		"\t\t\t\t\tPlatypus (I Hate You)",
        		"\t\t\t\t\tUptight",
        		"\t\t\t\t\tLast Ride In",
        		"\t\t\t\t\tJinx",
        		"\t\t\t\t\tHaushinka",
        		"\t\t\t\t\tWalking Alone",
        		"\t\t\t\t\tReject",
        		"\t\t\t\t\tTake Back",
        		"\t\t\t\t\tKing For A Day",
        		"\t\t\t\t\tGood Riddance (Time Of Your Life)",
        		"\t\t\t\t\tProsthetic Head"};
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
                         case 0:  Intent newActivity = new Intent(getActivity(), Niceguys.class);     
                         		  startActivityForResult(newActivity, 0);
                                  break;
                         case 1:  Intent newActivity1 = new Intent(getActivity(), Hitchinaride.class);     
                                  startActivityForResult(newActivity1, 1);
                                  break;
                         case 2:  Intent newActivity2 = new Intent(getActivity(), Grouch.class);     
        			              startActivityForResult(newActivity2, 1);
        			              break;
                         case 3:  Intent newActivity3 = new Intent(getActivity(), Redundant.class);     
        	              		  startActivityForResult(newActivity3, 1);
        	              		  break;
                         case 4:  Intent newActivity4 = new Intent(getActivity(), Scattered.class);     
        		         		  startActivityForResult(newActivity4, 1);
        		         		  break;
                         case 5:  Intent newActivity5 = new Intent(getActivity(), Allthetime.class);     
        		        		  startActivityForResult(newActivity5, 1);
        		        		  break;
                         case 6:  Intent newActivity6 = new Intent(getActivity(), Worryrock.class);     
        			       		  startActivityForResult(newActivity6, 1);
        			       		  break;
                         case 7:  Intent newActivity7 = new Intent(getActivity(), Platypus.class);     
        			       		  startActivityForResult(newActivity7, 1);
        			       		  break;
                         case 8:  Intent newActivity8 = new Intent(getActivity(), Uptight.class);     
        			       		  startActivityForResult(newActivity8, 1);
        			       		  break;
                         case 9:  Intent newActivity9 = new Intent(getActivity(), Lastridein.class);     
        			       		  startActivityForResult(newActivity9, 1);
        			       		  break; 
                         case 10: Intent newActivity10 = new Intent(getActivity(), Jinx.class);     
        			       		  startActivityForResult(newActivity10, 1);
        			       		  break; 
                         case 11: Intent newActivity11 = new Intent(getActivity(), Haushinka.class);     
        			       		  startActivityForResult(newActivity11, 1);
        			       		  break;
                         case 12: Intent newActivity12 = new Intent(getActivity(), Walkingalone.class);     
        			       		  startActivityForResult(newActivity12, 1);
        			       		  break;
                         case 13: Intent newActivity13 = new Intent(getActivity(), Reject.class);     
					       		  startActivityForResult(newActivity13, 1);
					       		  break;
                         case 14: Intent newActivity14 = new Intent(getActivity(), Takeback.class);     
					       		  startActivityForResult(newActivity14, 1);
					       		  break; 
                         case 15: Intent newActivity15 = new Intent(getActivity(), Kingforaday.class);     
					       		  startActivityForResult(newActivity15, 1);
					       		  break; 
                         case 16: Intent newActivity16 = new Intent(getActivity(), Goodriddance.class);     
					       		  startActivityForResult(newActivity16, 1);
					       		  break;  		  
                         case 17: Intent newActivity17 = new Intent(getActivity(), Prosthetichead.class);     
					       		  startActivityForResult(newActivity17, 1);
					       		  break;  		  
                  
                      }
                	 }
                });
                return rootView;
            }
           
        }