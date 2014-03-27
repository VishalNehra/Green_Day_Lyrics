package com.greenday.lyrics;

import com.greenday.warning.Bloodsex;
import com.greenday.warning.Castaway;
import com.greenday.warning.Church;
import com.greenday.warning.Deadbeat;
import com.greenday.warning.Fashion;
import com.greenday.warning.Holdon;
import com.greenday.warning.Jackass;
import com.greenday.warning.Macy;
import com.greenday.warning.Minority;
import com.greenday.warning.Misery;
import com.greenday.warning.Waiting;
import com.greenday.warning.Warning;

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
                         case 0:  Intent newActivity = new Intent(getActivity(), Warning.class);     
                         		  startActivityForResult(newActivity, 0);
                                  break;
                         case 1:  Intent newActivity1 = new Intent(getActivity(), Bloodsex.class);     
                                  startActivityForResult(newActivity1, 1);
                                  break;
                         case 2:  Intent newActivity2 = new Intent(getActivity(), Church.class);     
        			              startActivityForResult(newActivity2, 1);
        			              break;
                         case 3:  Intent newActivity3 = new Intent(getActivity(), Fashion.class);     
        	              		  startActivityForResult(newActivity3, 1);
        	              		  break;
                         case 4:  Intent newActivity4 = new Intent(getActivity(), Castaway.class);     
        		         		  startActivityForResult(newActivity4, 1);
        		         		  break;
                         case 5:  Intent newActivity5 = new Intent(getActivity(), Misery.class);     
        		        		  startActivityForResult(newActivity5, 1);
        		        		  break;
                         case 6:  Intent newActivity6 = new Intent(getActivity(), Deadbeat.class);     
        			       		  startActivityForResult(newActivity6, 1);
        			       		  break;
                         case 7:  Intent newActivity7 = new Intent(getActivity(), Holdon.class);     
        			       		  startActivityForResult(newActivity7, 1);
        			       		  break;
                         case 8:  Intent newActivity8 = new Intent(getActivity(), Jackass.class);     
        			       		  startActivityForResult(newActivity8, 1);
        			       		  break;
                         case 9:  Intent newActivity9 = new Intent(getActivity(), Waiting.class);     
        			       		  startActivityForResult(newActivity9, 1);
        			       		  break; 
                         case 10: Intent newActivity10 = new Intent(getActivity(), Minority.class);     
        			       		  startActivityForResult(newActivity10, 1);
        			       		  break; 
                         case 11: Intent newActivity11 = new Intent(getActivity(), Macy.class);     
        			       		  startActivityForResult(newActivity11, 1);
        			       		  break;
                      }
                	 }
                });
                return rootView;
            }
           
        }