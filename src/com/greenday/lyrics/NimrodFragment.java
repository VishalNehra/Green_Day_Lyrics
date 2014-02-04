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
import android.app.AlertDialog;
import android.app.Fragment;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;

public class NimrodFragment extends Fragment {
	
	public NimrodFragment(){}
    
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
  
        View rootView = inflater.inflate(R.layout.fragment_nimrod, container, false);
		getActivity().getWindow().setBackgroundDrawableResource(R.drawable.nimrod_cover2);
          
		ImageButton b=(ImageButton) rootView.findViewById(R.id.imageButton1);
		b.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				@SuppressWarnings("unused")
				AlertDialog builder = new AlertDialog.Builder(getActivity())
		        .setMessage("Album:\n" +
		        		"Nimrod (October 14, 1997)\n\n" +
		        		"Length:\n" +
		        		"49:09\n\n" +
		        		"Track List:\n" +
		        		"1. Nice Guys Finish Last (2:49)\n" +
		        		"2. Hitchin' a Ride (2:51)\n" +
		        		"3. The Grouch (2:12)\n" +
		        		"4. Redundant (3:17)\n" +
		        		"5. Scattered (3:02)\n" +
		        		"6. All the Time (2:10)\n" +
		        		"7. Worry Rock (2:27)\n" +
		        		"8. Platypus (I Hate You) (2:21)\n" +
		        		"9. Uptight (3:04)\n" +
		        		"10. Last Ride In (3:47)\n" +
		        		"11. Jinx (2:12)\n" +
		        		"12. Haushinka (3:25)\n" +
		        		"13. Walking Alone (2:45)\n" +
		        		"14. Reject (2:05)\n" +
		        		"15. Take Back (1:09)\n" +
		        		"16. King for a Day (3:13)\n" +
		        		"17. Good Riddance (Time of Your Life) (2:34)\n" +
		        		"18. Prosthetic Head (3:38)\n")
		        .setNegativeButton("OK", new DialogInterface.OnClickListener() {
		            public void onClick(DialogInterface dialog, int which) {
		                getActivity().closeContextMenu();
		            }
		        })
		        .show();    
			}
		});
		
        ListView listview = (ListView) rootView.findViewById(R.id.listView1);

        //EDITED Code 
        String[] values = new String[] {"Nice Guys Finish Last",
        		"Hitchin' A Ride",
        		"The Grouch",
        		"Redundant",
        		"Scattered",
        		"All The Time",
        		"Worry Rock",
        		"Platypus (I Hate You)",
        		"Uptight",
        		"Last Ride In",
        		"Jinx",
        		"Haushinka",
        		"Walking Alone",
        		"Reject",
        		"Take Back",
        		"King For A Day",
        		"Good Riddance (Time Of Your Life)",
        		"Prosthetic Head"};
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