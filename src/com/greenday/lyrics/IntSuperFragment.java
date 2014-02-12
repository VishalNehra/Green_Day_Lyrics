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

import android.os.Bundle;
import android.app.AlertDialog;
import android.app.Fragment;
import android.content.DialogInterface;
import android.content.Intent;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;

public class IntSuperFragment extends Fragment {
	
	public IntSuperFragment(){}
    
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
  
        View rootView = inflater.inflate(R.layout.fragment_intsuper, container, false);
		getActivity().getWindow().setBackgroundDrawableResource(R.drawable.ins_cover2);
        
		ImageButton b=(ImageButton) rootView.findViewById(R.id.imageButton1);
		b.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				@SuppressWarnings("unused")
				AlertDialog builder = new AlertDialog.Builder(getActivity())
		        .setMessage(Html.fromHtml(getString(R.string.album) +
		        		"<font color='#006500'>International Superhits! <i>(November 13, 2001)</font></i><br><br>" +
		        		getString(R.string.length) +
		        		"<font color='#006500'><i>60:44</font></i><br><br>" +
		        		getString(R.string.track_list) +
		        		"<font color='#006500'>1. Maria <i>(2:47)</i><br>" +
		        		"2. Poprocks & Coke <i>(2:38)</i><br>" +
		        		"3. Longview <i>(3:53)</i><br>" +
		        		"4. Welcome to Paradise <i>(3:44)</i><br>" +
		        		"5. Basket Case <i>(3:01)</i><br>" +
		        		"6. When I Come Around <i>(2:58)</i><br>" +
		        		"7. She <i>(2:14)</i><br>" +
		        		"8. J.A.R. (Jason Andrew Relva) <i>(2:51)</i><br>" +
		        		"9. Geek Stink Breath <i>(2:15)</i><br>" +
		        		"10. Brain Stew <i>(3:13)</i><br>" +
		        		"11. Jaded <i>(1:30)</i><br>" +
		        		"12. Walking Contradiction <i>(2:31)</i><br>" +
		        		"13. Stuck with Me <i>(2:15)</i><br>" +
		        		"14. Hitchin' a Ride <i>(2:51)</i><br>" +
		        		"15. Good Riddance (Time of Your Life) <i>(2:33)</i><br>" +
		        		"16. Redundant <i>(3:18)</i><br>" +
		        		"17. Nice Guys Finish Last <i>(2:49)</i><br>" +
		        		"18. Minority <i>(2:47)</i><br>" +
		        		"19. Warning <i>(3:41)</i><br>" +
		        		"20. Waiting <i>(3:11)</i><br>" +
		        		"21. Macy's Day Parade <i>(3:33)</i></font>"))
		        .setNeutralButton("OK", new DialogInterface.OnClickListener() {
		            public void onClick(DialogInterface dialog, int which) {
		                getActivity().closeContextMenu();
		            }
		        })
		        .show();    
			}
		});
        
        ListView listview = (ListView) rootView.findViewById(R.id.listView1);

        //EDITED Code 
        String[] values = new String[] {"Maria",
        		"Poprocks and Coke",
        		"Long View",
        		"Welcome To Paradise",
        		"Basket Case",
        		"When I Come Around",
        		"She",
        		"J.A.R. (Jason Andrew Relva)",
        		"Geek Stink Breath",
        		"Brain Stew",
        		"Jaded",
        		"Walking Contradiction",
        		"Stuck With Me",
        		"Hitchin' a Ride",
        		"Good Riddance (Time of Your Life)",
        		"Redundant",
        		"Nice Guys Finish Last",
        		"Minority",
        		"Warning",
        		"Waiting",
        		"Macy's Day Parade"};
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
                         case 0:  Intent newActivity = new Intent(getActivity(), Maria.class);     
                         		  startActivityForResult(newActivity, 0);
                                  break;
                         case 1:  Intent newActivity1 = new Intent(getActivity(), Poprocks.class);     
                                  startActivityForResult(newActivity1, 1);
                                  break;
                         case 2:  Intent newActivity2 = new Intent(getActivity(), Longview.class);     
        			              startActivityForResult(newActivity2, 1);
        			              break;
                         case 3:  Intent newActivity3 = new Intent(getActivity(), Welcomeparadise.class);     
        	              		  startActivityForResult(newActivity3, 1);
        	              		  break;
                         case 4:  Intent newActivity4 = new Intent(getActivity(), Basketcase.class);     
        		         		  startActivityForResult(newActivity4, 1);
        		         		  break;
                         case 5:  Intent newActivity5 = new Intent(getActivity(), Whencomearound.class);     
        		        		  startActivityForResult(newActivity5, 1);
        		        		  break;
                         case 6:  Intent newActivity6 = new Intent(getActivity(), She.class);     
        			       		  startActivityForResult(newActivity6, 1);
        			       		  break;
                         case 7:  Intent newActivity7 = new Intent(getActivity(), JAR.class);     
        			       		  startActivityForResult(newActivity7, 1);
        			       		  break;
                         case 8:  Intent newActivity8 = new Intent(getActivity(), Geekstink.class);     
        			       		  startActivityForResult(newActivity8, 1);
        			       		  break;
                         case 9:  Intent newActivity9 = new Intent(getActivity(), Brainstew.class);     
        			       		  startActivityForResult(newActivity9, 1);
        			       		  break; 
                         case 10: Intent newActivity10 = new Intent(getActivity(), Jaded.class);     
        			       		  startActivityForResult(newActivity10, 1);
        			       		  break; 
                         case 11: Intent newActivity11 = new Intent(getActivity(), Walking.class);     
        			       		  startActivityForResult(newActivity11, 1);
        			       		  break;
                         case 12: Intent newActivity12 = new Intent(getActivity(), Stuckwithme.class);     
        			       		  startActivityForResult(newActivity12, 1);
        			       		  break;
                         case 13: Intent newActivity13 = new Intent(getActivity(), Hitchinaride.class);     
					       		  startActivityForResult(newActivity13, 1);
					       		  break;
                         case 14: Intent newActivity14 = new Intent(getActivity(), Goodriddance.class);     
					       		  startActivityForResult(newActivity14, 1);
					       		  break;
                         case 15: Intent newActivity15 = new Intent(getActivity(), Redundant.class);     
					       		  startActivityForResult(newActivity15, 1);
					       		  break;
                         case 16: Intent newActivity16 = new Intent(getActivity(), Niceguys.class);     
					       		  startActivityForResult(newActivity16, 1);
					       		  break;
                         case 17: Intent newActivity17 = new Intent(getActivity(), Minority.class);     
					       		  startActivityForResult(newActivity17, 1);
					       		  break;
                         case 18: Intent newActivity18 = new Intent(getActivity(), Warning.class);     
					       		  startActivityForResult(newActivity18, 1);
					       		  break;
                         case 19: Intent newActivity19 = new Intent(getActivity(), Waiting.class);     
					       		  startActivityForResult(newActivity19, 1);
					       		  break;
                         case 20: Intent newActivity20 = new Intent(getActivity(), Macy.class);     
					       		  startActivityForResult(newActivity20, 1);
					       		  break;
                  
                      }
                	 }
                });
                return rootView;
            }
           
        }