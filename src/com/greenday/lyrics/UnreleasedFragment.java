package com.greenday.lyrics;

import com.greenday.ins.Basketcase;
import com.greenday.ins.Brainstew;
import com.greenday.ins.Geekstink;
import com.greenday.ins.Goodriddance;
import com.greenday.ins.Hitchinaride;
import com.greenday.ins.JAR;
import com.greenday.ins.Jaded;
import com.greenday.ins.Longview;
import com.greenday.ins.Macy;
import com.greenday.ins.Maria;
import com.greenday.ins.Minority;
import com.greenday.ins.Niceguys;
import com.greenday.ins.Poprocks;
import com.greenday.ins.Redundant;
import com.greenday.ins.She;
import com.greenday.ins.Stuckwithme;
import com.greenday.ins.Waiting;
import com.greenday.ins.Walking;
import com.greenday.ins.Warning;
import com.greenday.ins.Welcomeparadise;
import com.greenday.ins.Whencomearound;
import com.greenday.unreleased.Cigarettes;
import com.greenday.unreleased.Favouriteson;
import com.greenday.unreleased.Foughtlaw;
import com.greenday.unreleased.Governator;
import com.greenday.unreleased.Heartscollide;
import com.greenday.unreleased.Kissingsanta;
import com.greenday.unreleased.Likeastone;
import com.greenday.unreleased.Mechanicalman;
import com.greenday.unreleased.Minnesotagirl;
import com.greenday.unreleased.Quickone;
import com.greenday.unreleased.Shoplifter;
import com.greenday.unreleased.Shout;
import com.greenday.unreleased.Stateofmind;
import com.greenday.unreleased.Teenage;
import com.greenday.unreleased.Thatsallright;
import com.greenday.unreleased.Toomuch;
import com.greenday.unreleased.Wearechampions;
import com.greenday.unreleased.Workingclasshero;

import android.os.Bundle;
import android.app.Fragment;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class UnreleasedFragment extends Fragment {
	
	public UnreleasedFragment(){}
    
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
  
        View rootView = inflater.inflate(R.layout.fragment_unreleased, container, false);
        
        ListView listview = (ListView) rootView.findViewById(R.id.listView1);

        //EDITED Code 
        String[] values = new String[] {"\t\t\t\t\tA Quick One While He's Away",
        		"\t\t\t\t\tAnother State Of Mind",
        		"\t\t\t\t\tCigarettes And Valentines",
        		"\t\t\t\t\tFavourite Son",
        		"\t\t\t\t\tGovernator",
        		"\t\t\t\t\tHearts Collide",
        		"\t\t\t\t\tI Fought The Law",
        		"\t\t\t\t\tI Saw My Parents Kissing Santa Claws",
        		"\t\t\t\t\tLike A Rolling Stone",
        		"\t\t\t\t\tMechanical Man",
        		"\t\t\t\t\tMinnesota Girl",
        		"\t\t\t\t\tShoplifter",
        		"\t\t\t\t\tShout",
        		"\t\t\t\t\tTeenage Lobotomy",
        		"\t\t\t\t\tThat's All Right",
        		"\t\t\t\t\tToo Much, Too Soon",
        		"\t\t\t\t\tWe Are The Champions",
        		"\t\t\t\t\tWorking Class Hero"
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
                         case 0:  Intent newActivity = new Intent(getActivity(), Quickone.class);     
                         		  startActivityForResult(newActivity, 0);
                                  break;
                         case 1:  Intent newActivity1 = new Intent(getActivity(), Stateofmind.class);     
                                  startActivityForResult(newActivity1, 1);
                                  break;
                         case 2:  Intent newActivity2 = new Intent(getActivity(), Cigarettes.class);     
        			              startActivityForResult(newActivity2, 1);
        			              break;
                         case 3:  Intent newActivity3 = new Intent(getActivity(), Favouriteson.class);     
        	              		  startActivityForResult(newActivity3, 1);
        	              		  break;
                         case 4:  Intent newActivity4 = new Intent(getActivity(), Governator.class);     
        		         		  startActivityForResult(newActivity4, 1);
        		         		  break;
                         case 5:  Intent newActivity5 = new Intent(getActivity(), Heartscollide.class);     
        		        		  startActivityForResult(newActivity5, 1);
        		        		  break;
                         case 6:  Intent newActivity6 = new Intent(getActivity(), Foughtlaw.class);     
        			       		  startActivityForResult(newActivity6, 1);
        			       		  break;
                         case 7:  Intent newActivity7 = new Intent(getActivity(), Kissingsanta.class);     
        			       		  startActivityForResult(newActivity7, 1);
        			       		  break;
                         case 8:  Intent newActivity8 = new Intent(getActivity(), Likeastone.class);     
        			       		  startActivityForResult(newActivity8, 1);
        			       		  break;
                         case 9:  Intent newActivity9 = new Intent(getActivity(), Mechanicalman.class);     
        			       		  startActivityForResult(newActivity9, 1);
        			       		  break; 
                         case 10: Intent newActivity10 = new Intent(getActivity(), Minnesotagirl.class);     
        			       		  startActivityForResult(newActivity10, 1);
        			       		  break; 
                         case 11: Intent newActivity11 = new Intent(getActivity(), Shoplifter.class);     
        			       		  startActivityForResult(newActivity11, 1);
        			       		  break;
                         case 12: Intent newActivity12 = new Intent(getActivity(), Shout.class);     
        			       		  startActivityForResult(newActivity12, 1);
        			       		  break;
                         case 13: Intent newActivity13 = new Intent(getActivity(), Teenage.class);     
					       		  startActivityForResult(newActivity13, 1);
					       		  break;
                         case 14: Intent newActivity14 = new Intent(getActivity(), Thatsallright.class);     
					       		  startActivityForResult(newActivity14, 1);
					       		  break;
                         case 15: Intent newActivity15 = new Intent(getActivity(), Toomuch.class);     
					       		  startActivityForResult(newActivity15, 1);
					       		  break;
                         case 16: Intent newActivity16 = new Intent(getActivity(), Wearechampions.class);     
					       		  startActivityForResult(newActivity16, 1);
					       		  break;
                         case 17: Intent newActivity17 = new Intent(getActivity(), Workingclasshero.class);     
					       		  startActivityForResult(newActivity17, 1);
					       		  break;
                  
                      }
                	 }
                });
                return rootView;
            }
           
        }