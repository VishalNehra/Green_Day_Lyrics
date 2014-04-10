package com.greenday.warning;

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

public class WarningFragment extends Fragment {
	
	public WarningFragment(){}
    
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
  
        View rootView = inflater.inflate(R.layout.fragment_warning, container, false);
		//getActivity().getWindow().setBackgroundDrawableResource(R.drawable.warning_cover2);
        
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
		        		getString(R.string.warning_album_release) +
		        		getString(R.string.length) +
		        		"<font color='#006500'><i>41:14</font></i><br><br>" +
		        		getString(R.string.track_list) +
		        		"<font color='#006500'>1. Warning <i>(3:42)</i><br>" +
		        		"2. Blood, Sex and Booze <i>(3:33)</i><br>" +
		        		"3. Church on Sunday <i>(3:18)</i><br>" +
		        		"4. Fashion Victim <i>(2:48)</i><br>" +
		        		"5. Castaway <i>(3:52)</i><br>" +
		        		"6. Misery <i>(5:05)</i><br>" +
		        		"7. Deadbeat Holiday <i>(3:35)</i><br>" +
		        		"8. Hold On <i>(2:56)</i><br>" +
		        		"9. Jackass <i>(2:43)</i><br>" +
		        		"10. Waiting <i>(3:13)</i><br>" +
		        		"11. Minority <i>(2:49)</i><br>" +
		        		"12. Macy's Day Parade <i>(3:34)</i><br>"))
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
        String[] values = new String[] {"Warning",
        		"Blood, Sex and Booze",
        		"Church On Sunday",
        		"Fashion Victim",
        		"Castaway",
        		"Misery",
        		"Deadbeat Holiday",
        		"Hold On",
        		"Jackass",
        		"Waiting",
        		"Minority",
        		"Macy's Day Parade"
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
                		 switch(position)
                         {
                         case 0:  //Warning
                        	 Intent newActivity = new Intent(getActivity(), WarningMain.class);     
			                 newActivity.putExtra("track", 1);
			                 startActivity(newActivity);
                             break;
                         case 1:  //Blood, Sex & Booze
                        	 Intent newActivity1 = new Intent(getActivity(), WarningMain.class);     
			                 newActivity1.putExtra("track", 2);
			                 startActivity(newActivity1);
                             break;
                         case 2:  //Church on Sunday
                        	 Intent newActivity2 = new Intent(getActivity(), WarningMain.class);     
			                 newActivity2.putExtra("track", 3);
			                 startActivity(newActivity2);
        			         break;
                         case 3:  //Fashion Victim
                        	 Intent newActivity3 = new Intent(getActivity(), WarningMain.class);     
			                 newActivity3.putExtra("track", 4);
			                 startActivity(newActivity3);
        	              	 break;
                         case 4:  //Castaway
                        	 Intent newActivity4 = new Intent(getActivity(), WarningMain.class);   
                        	 newActivity4.putExtra("track", 5);
			                 startActivity(newActivity4);
        		         	 break;
                         case 5:  //Misery
                        	 Intent newActivity5 = new Intent(getActivity(), WarningMain.class);     
			                 newActivity5.putExtra("track", 6);
			                 startActivity(newActivity5);
        		        	 break;
                         case 6:  //Deadbeat Holiday
                        	 Intent newActivity6 = new Intent(getActivity(), WarningMain.class);     
			                 newActivity6.putExtra("track", 7);
			                 startActivity(newActivity6);
        			       	 break;
                         case 7:  //Hold On
                        	 Intent newActivity7 = new Intent(getActivity(), WarningMain.class);     
			                 newActivity7.putExtra("track", 8);
			                 startActivity(newActivity7);
        			       	 break;
                         case 8:  //Jackass
                        	 Intent newActivity8 = new Intent(getActivity(), WarningMain.class);     
			                 newActivity8.putExtra("track", 9);
			                 startActivity(newActivity8);
        			       	 break; 
                         case 9:  //Waiting
                        	 Intent newActivity9 = new Intent(getActivity(), WarningMain.class);     
			                 newActivity9.putExtra("track", 10);
			                 startActivity(newActivity9);
        			       	 break; 
                         case 10: //Minority
                        	 Intent newActivity10 = new Intent(getActivity(), WarningMain.class);     
			                 newActivity10.putExtra("track", 11);
			                 startActivity(newActivity10);
        			       	 break;
                         case 11: //Macy's Day Parade
                        	 Intent newActivity11 = new Intent(getActivity(), WarningMain.class);     
			                 newActivity11.putExtra("track", 12);
			                 startActivity(newActivity11);
        			       	 break;
                      }
                	 }
                });
                return rootView;
            }
           
        }