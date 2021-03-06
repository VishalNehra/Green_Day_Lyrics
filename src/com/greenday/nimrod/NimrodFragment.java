package com.greenday.nimrod;

import com.greenday.lyrics.R;
import de.keyboardsurfer.android.widget.crouton.Crouton;
import de.keyboardsurfer.android.widget.crouton.Style;

import android.os.Bundle;
import android.preference.PreferenceManager;
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

public class NimrodFragment extends Fragment {
	private View rootView;
    
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
  
        rootView = inflater.inflate(R.layout.fragment_nimrod, container, false);
        
        //Loading Preferences
        getPref();
        
		ImageButton b=(ImageButton) rootView.findViewById(R.id.imageButton1);
		b.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				@SuppressWarnings("unused")
				AlertDialog builder = new AlertDialog.Builder(getActivity())
		        .setMessage(Html.fromHtml(getString(R.string.album) +
		        		getString(R.string.nimrod_album_release) +
		        		getString(R.string.length) +
		        		"<font color='#006500'><i>49:09</i></font><br><br>" +
		        		getString(R.string.track_list) +
		        		"<font color='#006500'>1. Nice Guys Finish Last <i>(2:49)</i><br>" +
		        		"2. Hitchin' a Ride <i>(2:51)</i><br>" +
		        		"3. The Grouch <i>(2:12)</i><br>" +
		        		"4. Redundant <i>(3:17)</i><br>" +
		        		"5. Scattered <i>(3:02)</i><br>" +
		        		"6. All the Time <i>(2:10)</i><br>" +
		        		"7. Worry Rock <i>(2:27)</i><br>" +
		        		"8. Platypus (I Hate You) <i>(2:21)</i><br>" +
		        		"9. Uptight <i>(3:04)</i><br>" +
		        		"10. Last Ride In <i>(3:47)</i><br>" +
		        		"11. Jinx <i>(2:12)</i><br>" +
		        		"12. Haushinka <i>(3:25)</i><br>" +
		        		"13. Walking Alone <i>(2:45)</i><br>" +
		        		"14. Reject <i>(2:05)</i><br>" +
		        		"15. Take Back <i>(1:09)</i><br>" +
		        		"16. King for a Day <i>(3:13)</i><br>" +
		        		"17. Good Riddance (Time of Your Life) <i>(2:34)</i><br>" +
		        		"18. Prosthetic Head <i>(3:38)</i></font>"))
		        .setNeutralButton("OK", new DialogInterface.OnClickListener() {
		            public void onClick(DialogInterface dialog, int which) {
		                getActivity().closeContextMenu();
		            }
		        })
		        .show();    
			}
		});
		
        ListView listview = (ListView) rootView.findViewById(R.id.listView1);

        String[] values = new String[] {
        		"Nice Guys Finish Last",
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

                /*
                 * Adding individual onclicklistener commands below;  
                 */
                 
                 listview.setOnItemClickListener(new AdapterView.OnItemClickListener() 
                 { 
                	 public void onItemClick(AdapterView<?> p, View view, int position, long id)
                	 
                	 { 
                		 switch(position)
                         {
                         case 0:  //Nice Guys Finish Last
                        	 Intent newActivity = new Intent(getActivity(), Nimrod.class);     
			                 newActivity.putExtra("track", 1);
			                 startActivity(newActivity);
                             break;
                         case 1:  //Hitchin' A Ride
                        	 Intent newActivity1 = new Intent(getActivity(), Nimrod.class);     
			                 newActivity1.putExtra("track", 2);
			                 startActivity(newActivity1);
                             break;
                         case 2:  //The Grouch
                        	 Intent newActivity2 = new Intent(getActivity(), Nimrod.class);     
			                 newActivity2.putExtra("track", 3);
			                 startActivity(newActivity2);
        			         break;
                         case 3:  //Redundant
                        	 Intent newActivity3 = new Intent(getActivity(), Nimrod.class);     
			                 newActivity3.putExtra("track", 4);
			                 startActivity(newActivity3);
        	              	 break;
                         case 4:  //Scattered
                        	 Intent newActivity4 = new Intent(getActivity(), Nimrod.class);   
                        	 newActivity4.putExtra("track", 5);
			                 startActivity(newActivity4);
        		         	 break;
                         case 5:  //All The Time
                        	 Intent newActivity5 = new Intent(getActivity(), Nimrod.class);     
			                 newActivity5.putExtra("track", 6);
			                 startActivity(newActivity5);
        		        	 break;
                         case 6:  //Worry Rock
                        	 Intent newActivity6 = new Intent(getActivity(), Nimrod.class);     
			                 newActivity6.putExtra("track", 7);
			                 startActivity(newActivity6);
        			       	 break;
                         case 7:  //Platypus (I Hate You)
                        	 Intent newActivity7 = new Intent(getActivity(), Nimrod.class);     
			                 newActivity7.putExtra("track", 8);
			                 startActivity(newActivity7);
        			       	 break;
                         case 8:  //Uptight
                        	 Intent newActivity8 = new Intent(getActivity(), Nimrod.class);     
			                 newActivity8.putExtra("track", 9);
			                 startActivity(newActivity8);
        			       	 break; 
                         case 9:  //Last Ride In
                        	 Intent newActivity9 = new Intent(getActivity(), Nimrod.class);     
			                 newActivity9.putExtra("track", 10);
			                 startActivity(newActivity9);
        			       	 break; 
                         case 10: //Jinx
                        	 Intent newActivity10 = new Intent(getActivity(), Nimrod.class);     
			                 newActivity10.putExtra("track", 11);
			                 startActivity(newActivity10);
        			       	 break;
                         case 11: //Haushinka
                        	 Intent newActivity11 = new Intent(getActivity(), Nimrod.class);     
			                 newActivity11.putExtra("track", 12);
			                 startActivity(newActivity11);
        			       	 break;
                         case 12: //Walking Alone
                        	 Intent newActivity12 = new Intent(getActivity(), Nimrod.class);     
			                 newActivity12.putExtra("track", 13);
			                 startActivity(newActivity12);
        			       	 break;
                         case 13: //Reject
                        	 Intent newActivity13 = new Intent(getActivity(), Nimrod.class);     
			                 newActivity13.putExtra("track", 14);
			                 startActivity(newActivity13);
        			       	 break;  
                         case 14: //Take Back
                        	 Intent newActivity14 = new Intent(getActivity(), Nimrod.class);     
			                 newActivity14.putExtra("track", 15);
			                 startActivity(newActivity14);
        			       	 break;  
                         case 15: //King For A Day
                        	 Intent newActivity15 = new Intent(getActivity(), Nimrod.class);     
			                 newActivity15.putExtra("track", 16);
			                 startActivity(newActivity15);
        			       	 break;  
                         case 16: //Good Riddance (Time Of Your Life)
                        	 Intent newActivity16 = new Intent(getActivity(), Nimrod.class);     
			                 newActivity16.putExtra("track", 17);
			                 startActivity(newActivity16);
        			       	 break;  
                         case 17: //Prosthetic Head
                        	 Intent newActivity17 = new Intent(getActivity(), Nimrod.class);     
			                 newActivity17.putExtra("track", 18);
			                 startActivity(newActivity17);
        			       	 break;  
                         }
                	 }
                 });
                 return rootView;
    }   
    
    @Override
    public void onResume() {
    	// TODO Auto-generated method stub
    	getPref();
    	super.onResume();
    }
    
    private void getPref() {

		//Boot_pref
        boolean firstboot = getActivity().getSharedPreferences("BOOT_PREF", Context.MODE_PRIVATE).getBoolean("firstboot_detail", true);

        if (firstboot){
		 
        	Crouton.makeText(getActivity(), "Press on the circular album art icon...", Style.INFO).show();
        	Crouton.makeText(getActivity(), "to see more info about the album.", Style.INFO).show();
        	Crouton.makeText(getActivity(), "Similar feature is available for tracks too!", Style.CONFIRM).show();
        	
		getActivity().getSharedPreferences("BOOT_PREF", Context.MODE_PRIVATE)
         .edit()
         .putBoolean("firstboot_report", false)
         .commit();
        }
		//Boot_pref ends

        //Background transparency
        int def_alpha = 70;
        int alpha = PreferenceManager.getDefaultSharedPreferences(getActivity()).getInt("alpha", def_alpha);
        rootView.findViewById(R.id.nimrod_layout).getBackground().setAlpha(alpha);
    }
}