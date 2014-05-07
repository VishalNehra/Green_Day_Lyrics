package com.greenday.ins;

import com.greenday.lyrics.R;
import de.keyboardsurfer.android.widget.crouton.Crouton;
import de.keyboardsurfer.android.widget.crouton.Style;

import android.os.Bundle;
import android.app.AlertDialog;
import android.app.Fragment;
import android.content.Context;
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
		//getActivity().getWindow().setBackgroundDrawableResource(R.drawable.ins_cover2);
        
		getActivity();
		//Boot_pref
        boolean firstboot = getActivity().getSharedPreferences("BOOT_PREF", Context.MODE_PRIVATE).getBoolean("firstboot_detail", true);

        if (firstboot){
		 
        	Crouton.makeText(getActivity(), "Press on the circular album art icon...", Style.INFO).show();
        	Crouton.makeText(getActivity(), "to see more info about the album.", Style.INFO).show();
        	Crouton.makeText(getActivity(), "Similar feature is available for the tracks too!", Style.CONFIRM).show();
        	
        getActivity();
		getActivity().getSharedPreferences("BOOT_PREF", Context.MODE_PRIVATE)
         .edit()
         .putBoolean("firstboot_detail", false)
         .commit();
        }
		//Boot_pref ends
		
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
                		 switch(position)
                         {
                         case 0:  //Maria
                        	 Intent newActivity = new Intent(getActivity(), Ins.class);     
			                 newActivity.putExtra("track", 1);
			                 startActivity(newActivity);
                             break;
                         case 1:  //Poprocks And Coke
                        	 Intent newActivity1 = new Intent(getActivity(), Ins.class);     
			                 newActivity1.putExtra("track", 2);
			                 startActivity(newActivity1);
                             break;
                         case 2:  //Longview
                        	 Intent newActivity2 = new Intent(getActivity(), Ins.class);     
			                 newActivity2.putExtra("track", 3);
			                 startActivity(newActivity2);
        			         break;
                         case 3:  //Welcome To Paradise
                        	 Intent newActivity3 = new Intent(getActivity(), Ins.class);     
			                 newActivity3.putExtra("track", 4);
			                 startActivity(newActivity3);
        	              	 break;
                         case 4:  //Basket Case
                        	 Intent newActivity4 = new Intent(getActivity(), Ins.class);   
                        	 newActivity4.putExtra("track", 5);
			                 startActivity(newActivity4);
        		         	 break;
                         case 5:  //When I Come Around
                        	 Intent newActivity5 = new Intent(getActivity(), Ins.class);     
			                 newActivity5.putExtra("track", 6);
			                 startActivity(newActivity5);
        		        	 break;
                         case 6:  //She
                        	 Intent newActivity6 = new Intent(getActivity(), Ins.class);     
			                 newActivity6.putExtra("track", 7);
			                 startActivity(newActivity6);
        			       	 break;
                         case 7:  //J.A.R. (Jason Andrew Relva)
                        	 Intent newActivity7 = new Intent(getActivity(), Ins.class);     
			                 newActivity7.putExtra("track", 8);
			                 startActivity(newActivity7);
        			       	 break;
                         case 8:  //Geek Stink Breath
                        	 Intent newActivity8 = new Intent(getActivity(), Ins.class);     
			                 newActivity8.putExtra("track", 9);
			                 startActivity(newActivity8);
        			       	 break; 
                         case 9:  //Brain Stew
                        	 Intent newActivity9 = new Intent(getActivity(), Ins.class);     
			                 newActivity9.putExtra("track", 10);
			                 startActivity(newActivity9);
        			       	 break; 
                         case 10: //Jaded
                        	 Intent newActivity10 = new Intent(getActivity(), Ins.class);     
			                 newActivity10.putExtra("track", 11);
			                 startActivity(newActivity10);
        			       	 break;
                         case 11: //Walking Contradiction
                        	 Intent newActivity11 = new Intent(getActivity(), Ins.class);     
			                 newActivity11.putExtra("track", 12);
			                 startActivity(newActivity11);
        			       	 break;
                         case 12: //Stuck With Me
                        	 Intent newActivity12 = new Intent(getActivity(), Ins.class);     
			                 newActivity12.putExtra("track", 13);
			                 startActivity(newActivity12);
        			       	 break;
                         case 13: //Hitchin' A Ride
                        	 Intent newActivity13 = new Intent(getActivity(), Ins.class);     
			                 newActivity13.putExtra("track", 14);
			                 startActivity(newActivity13);
        			       	 break;
                         case 14: //Good Riddance (Time Of Your Life)
                        	 Intent newActivity14 = new Intent(getActivity(), Ins.class);     
			                 newActivity14.putExtra("track", 15);
			                 startActivity(newActivity14);
        			       	 break;
                         case 15: //Redundant
                        	 Intent newActivity15 = new Intent(getActivity(), Ins.class);     
			                 newActivity15.putExtra("track", 16);
			                 startActivity(newActivity15);
        			       	 break;
                         case 16: //Nice Guys Finish Last
                        	 Intent newActivity16 = new Intent(getActivity(), Ins.class);     
			                 newActivity16.putExtra("track", 17);
			                 startActivity(newActivity16);
        			       	 break;
                         case 17: //Minority
                        	 Intent newActivity17 = new Intent(getActivity(), Ins.class);     
			                 newActivity17.putExtra("track", 18);
			                 startActivity(newActivity17);
        			       	 break; 
                         case 18: //Warning
                        	 Intent newActivity18 = new Intent(getActivity(), Ins.class);     
			                 newActivity18.putExtra("track", 19);
			                 startActivity(newActivity18);
        			       	 break;
                         case 19: //Waiting
                        	 Intent newActivity19 = new Intent(getActivity(), Ins.class);     
			                 newActivity19.putExtra("track", 20);
			                 startActivity(newActivity19);
        			       	 break;
                         case 20: //Macy's Day Parade
                        	 Intent newActivity20 = new Intent(getActivity(), Ins.class);     
			                 newActivity20.putExtra("track", 21);
			                 startActivity(newActivity20);
        			       	 break; 
                         }
                	 }
                 });
                 return rootView;
    }   
}