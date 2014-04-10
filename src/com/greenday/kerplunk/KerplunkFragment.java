package com.greenday.kerplunk;

import com.greenday.lyrics.R;
import com.greenday.lyrics.R.id;
import com.greenday.lyrics.R.layout;
import com.greenday.lyrics.R.string;
import com.greenday.nimrod.Nimrod;

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

public class KerplunkFragment extends Fragment {
	
	public KerplunkFragment(){}
    
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
  
        View rootView = inflater.inflate(R.layout.fragment_kerplunk, container, false);
		//getActivity().getWindow().setBackgroundDrawableResource(R.drawable.kerplunk_cover2);
        
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
                		 switch(position)
                         {
                         case 0:  //2000 Light Years Away
                        	 Intent newActivity = new Intent(getActivity(), Kerplunk.class);     
			                 newActivity.putExtra("track", 1);
			                 startActivity(newActivity);
                             break;
                         case 1:  //One For The Razorbacks
                        	 Intent newActivity1 = new Intent(getActivity(), Kerplunk.class);     
			                 newActivity1.putExtra("track", 2);
			                 startActivity(newActivity1);
                             break;
                         case 2:  //Welcome To Paradise
                        	 Intent newActivity2 = new Intent(getActivity(), Kerplunk.class);     
			                 newActivity2.putExtra("track", 3);
			                 startActivity(newActivity2);
        			         break;
                         case 3:  //Christie Road
                        	 Intent newActivity3 = new Intent(getActivity(), Kerplunk.class);     
			                 newActivity3.putExtra("track", 4);
			                 startActivity(newActivity3);
        	              	 break;
                         case 4:  //Private Ale
                        	 Intent newActivity4 = new Intent(getActivity(), Kerplunk.class);   
                        	 newActivity4.putExtra("track", 5);
			                 startActivity(newActivity4);
        		         	 break;
                         case 5:  //Dominated Love Slave
                        	 Intent newActivity5 = new Intent(getActivity(), Kerplunk.class);     
			                 newActivity5.putExtra("track", 6);
			                 startActivity(newActivity5);
        		        	 break;
                         case 6:  //One Of My Lies
                        	 Intent newActivity6 = new Intent(getActivity(), Kerplunk.class);     
			                 newActivity6.putExtra("track", 7);
			                 startActivity(newActivity6);
        			       	 break;
                         case 7:  //80
                        	 Intent newActivity7 = new Intent(getActivity(), Kerplunk.class);     
			                 newActivity7.putExtra("track", 8);
			                 startActivity(newActivity7);
        			       	 break;
                         case 8:  //Android
                        	 Intent newActivity8 = new Intent(getActivity(), Kerplunk.class);     
			                 newActivity8.putExtra("track", 9);
			                 startActivity(newActivity8);
        			       	 break; 
                         case 9:  //No One Knows
                        	 Intent newActivity9 = new Intent(getActivity(), Kerplunk.class);     
			                 newActivity9.putExtra("track", 10);
			                 startActivity(newActivity9);
        			       	 break; 
                         case 10: //Who Wrote Holden Caulfield?
                        	 Intent newActivity10 = new Intent(getActivity(), Kerplunk.class);     
			                 newActivity10.putExtra("track", 11);
			                 startActivity(newActivity10);
        			       	 break;
                         case 11: //Words I Might Have Ate
                        	 Intent newActivity11 = new Intent(getActivity(), Kerplunk.class);     
			                 newActivity11.putExtra("track", 12);
			                 startActivity(newActivity11);
        			       	 break;
                         case 12: //Sweet Children
                        	 Intent newActivity12 = new Intent(getActivity(), Kerplunk.class);     
			                 newActivity12.putExtra("track", 13);
			                 startActivity(newActivity12);
        			       	 break;
                         case 13: //Best Thing In Town
                        	 Intent newActivity13 = new Intent(getActivity(), Kerplunk.class);     
			                 newActivity13.putExtra("track", 14);
			                 startActivity(newActivity13);
        			       	 break;  
                         case 14: //Strangeland
                        	 Intent newActivity14 = new Intent(getActivity(), Kerplunk.class);     
			                 newActivity14.putExtra("track", 15);
			                 startActivity(newActivity14);
        			       	 break;  
                         case 15: //My Generation
                        	 Intent newActivity15 = new Intent(getActivity(), Kerplunk.class);     
			                 newActivity15.putExtra("track", 16);
			                 startActivity(newActivity15);
        			       	 break;  
                  
                      }
                	 }
                });
                return rootView;
            }
           
        }