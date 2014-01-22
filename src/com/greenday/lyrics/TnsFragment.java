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
import com.greenday.tns.Atlibrary;
import com.greenday.tns.Coffeemaker;
import com.greenday.tns.Disappearingboy;
import com.greenday.tns.Dontleaveme;
import com.greenday.tns.Dryice;
import com.greenday.tns.Goingpasalacqua;
import com.greenday.tns.Greenday;
import com.greenday.tns.Iwasthere;
import com.greenday.tns.Judgedaughter;
import com.greenday.tns.Knowledge;
import com.greenday.tns.Oneiwant;
import com.greenday.tns.Onlyofyou;
import com.greenday.tns.Paperlanterns;
import com.greenday.tns.Rest;
import com.greenday.tns.Roadtoacceptance;
import com.greenday.tns.Sixteen;
import com.greenday.tns.Thousandhours;
import com.greenday.tns.Wantbealone;
import com.greenday.tns.Whyyouwanthim;

import android.os.Bundle;
import android.app.Fragment;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
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
        String[] values = new String[] {"\t\t\t\t\t1000 Hours",
        		"\t\t\t\t\t16",
        		"\t\t\t\t\t409 In Your Coffeemaker",
        		"\t\t\t\t\tAt The Library",
        		"\t\t\t\t\tDisappering Boy",
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
                         case 0:  Intent newActivity = new Intent(getActivity(), Thousandhours.class);     
                         		  startActivityForResult(newActivity, 0);
                                  break;
                         case 1:  Intent newActivity1 = new Intent(getActivity(), Sixteen.class);     
                                  startActivityForResult(newActivity1, 1);
                                  break;
                         case 2:  Intent newActivity2 = new Intent(getActivity(), Coffeemaker.class);     
        			              startActivityForResult(newActivity2, 1);
        			              break;
                         case 3:  Intent newActivity3 = new Intent(getActivity(), Atlibrary.class);     
        	              		  startActivityForResult(newActivity3, 1);
        	              		  break;
                         case 4:  Intent newActivity4 = new Intent(getActivity(), Disappearingboy.class);     
        		         		  startActivityForResult(newActivity4, 1);
        		         		  break;
                         case 5:  Intent newActivity5 = new Intent(getActivity(), Dontleaveme.class);     
        		        		  startActivityForResult(newActivity5, 1);
        		        		  break;
                         case 6:  Intent newActivity6 = new Intent(getActivity(), Dryice.class);     
        			       		  startActivityForResult(newActivity6, 1);
        			       		  break;
                         case 7:  Intent newActivity7 = new Intent(getActivity(), Goingpasalacqua.class);     
        			       		  startActivityForResult(newActivity7, 1);
        			       		  break;
                         case 8:  Intent newActivity8 = new Intent(getActivity(), Greenday.class);     
        			       		  startActivityForResult(newActivity8, 1);
        			       		  break;
                         case 9:  Intent newActivity9 = new Intent(getActivity(), Wantbealone.class);     
        			       		  startActivityForResult(newActivity9, 1);
        			       		  break; 
                         case 10: Intent newActivity10 = new Intent(getActivity(), Iwasthere.class);     
        			       		  startActivityForResult(newActivity10, 1);
        			       		  break; 
                         case 11: Intent newActivity11 = new Intent(getActivity(), Knowledge.class);     
        			       		  startActivityForResult(newActivity11, 1);
        			       		  break;
                         case 12: Intent newActivity12 = new Intent(getActivity(), Onlyofyou.class);     
        			       		  startActivityForResult(newActivity12, 1);
        			       		  break;
                         case 13: Intent newActivity13 = new Intent(getActivity(), Paperlanterns.class);     
					       		  startActivityForResult(newActivity13, 1);
					       		  break;
                         case 14: Intent newActivity14 = new Intent(getActivity(), Rest.class);     
					       		  startActivityForResult(newActivity14, 1);
					       		  break;
                         case 15: Intent newActivity15 = new Intent(getActivity(), Roadtoacceptance.class);     
					       		  startActivityForResult(newActivity15, 1);
					       		  break;
                         case 16: Intent newActivity16 = new Intent(getActivity(), Judgedaughter.class);     
					       		  startActivityForResult(newActivity16, 1);
					       		  break;
                         case 17: Intent newActivity17 = new Intent(getActivity(), Oneiwant.class);     
					       		  startActivityForResult(newActivity17, 1);
					       		  break;
                         case 18: Intent newActivity18 = new Intent(getActivity(), Whyyouwanthim.class);     
					       		  startActivityForResult(newActivity18, 1);
					       		  break;
                  
                      }
                	 }
                });
                return rootView;
            }
           
        }