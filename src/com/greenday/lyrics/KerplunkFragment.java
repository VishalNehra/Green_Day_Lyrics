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

import de.keyboardsurfer.android.widget.crouton.Crouton;
import de.keyboardsurfer.android.widget.crouton.Style;

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

public class KerplunkFragment extends Fragment {
	
	public KerplunkFragment(){}
    
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
  
        View rootView = inflater.inflate(R.layout.fragment_kerplunk, container, false);
		getActivity().getWindow().setBackgroundDrawableResource(R.drawable.kerplunk_cover2);
        
		//Boot_pref
        boolean firstboot = getActivity().getSharedPreferences("BOOT_PREF", getActivity().MODE_PRIVATE).getBoolean("firstboot_detail", true);

        if (firstboot){
		 
        	Crouton.makeText(getActivity(), "If you press on the album icon at corner right", Style.INFO).show();
        	Crouton.makeText(getActivity(), "You can see some details about the current album.", Style.INFO).show();
        	Crouton.makeText(getActivity(), "Similar feature is available for tracks too!", Style.CONFIRM).show();
        	
         getActivity().getSharedPreferences("BOOT_PREF", getActivity().MODE_PRIVATE)
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
		        		getString(R.string.kerplunk_album_release) +
		        		getString(R.string.length) +
		        		"<font color='#006500'><i>33:58</i> (Vinyl Version)<br>" +
		        		"<i>42:09</i> (CD & Cassette Version)</font><br><br>" +
		        		getString(R.string.track_list) +
		        		"<font color='#006500'>1. 2000 Light Years Away <i>(2:24)</i><br>" +
		        		"2. One for the Razorbacks <i>(2:30)</i><br>" +
		        		"3. Welcome to Paradise <i>(3:30)</i><br>" +
		        		"4. Christie Road <i>(3:33)</i><br>" +
		        		"5. Private Ale <i>(2:26)</i><br>" +
		        		"6. Dominated Love Slave <i>(1:42)</i><br>" +
		        		"7. One of My Lies <i>(2:19)</i><br>" +
		        		"8. 80 <i>(3:39)</i><br>" +
		        		"9. Android <i>(3:00)</i><br>" +
		        		"10. No One Knows <i>(3:39)</i><br>" +
		        		"11. Who Wrote Holden Caulfield? <i>(2:44)</i><br>" +
		        		"12. Words I Might Have Ate <i>(2:32)</i><br>" +
		        		"13. Sweet Children <i>[CD] (1:41)</i><br>" +
		        		"14. Best Thing in Town <i>[CD] (2:03)</i><br>" +
		        		"15. Strangeland <i>[CD] (2:08)</i><br>" +
		        		"16. My Generation <i>[CD] (2:19)</i></font>"))
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