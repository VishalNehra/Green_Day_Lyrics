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
import com.greenday.insomniac.Armatage;
import com.greenday.insomniac.Babuvula;
import com.greenday.insomniac.Brainstew;
import com.greenday.insomniac.Brat;
import com.greenday.insomniac.Eightysix;
import com.greenday.insomniac.Geekstink;
import com.greenday.insomniac.Jaded;
import com.greenday.insomniac.Nopride;
import com.greenday.insomniac.Panicsong;
import com.greenday.insomniac.Stuartave;
import com.greenday.insomniac.Stuckwithme;
import com.greenday.insomniac.Tightwad;
import com.greenday.insomniac.Walking;
import com.greenday.insomniac.Westbound;

import de.keyboardsurfer.android.widget.crouton.Crouton;
import de.keyboardsurfer.android.widget.crouton.Style;

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

public class InsomniacFragment extends Fragment {
	
	public InsomniacFragment(){}
    
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
  
        View rootView = inflater.inflate(R.layout.fragment_insomniac, container, false);
		getActivity().getWindow().setBackgroundDrawableResource(R.drawable.insomniac_cover2);
		
		ImageButton b=(ImageButton) rootView.findViewById(R.id.imageButton1);
		b.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				@SuppressWarnings("unused")
				AlertDialog builder = new AlertDialog.Builder(getActivity())
		        .setMessage("Album:\n" +
		        		"Insomniac (October 10, 1995)\n\n" +
		        		"Length:\n" +
		        		"32:49\n\n" +
		        		"Track List:\n" +
		        		"1. Armatage Shanks (2:17)\n" +
		        		"2. Brat (1:43)\n" +
		        		"3. Stuck with Me (2:16)\n" +
		        		"4. Geek Stink Breath (2:15)\n" +
		        		"5. No Pride (2:19)\n" +
		        		"6. Bab's Uvula Who? (2:08)\n" +
		        		"7. 86 (2:47)\n" +
		        		"8. Panic Song (3:35)\n" +
		        		"9. Stuart and the Ave. (2:03)\n" +
		        		"10. Brain Stew (3:13)\n" +
		        		"11. Jaded (1:30)\n" +
		        		"12. Westbound Sign (2:12)\n" +
		        		"13. Tight Wad Hill (2:01)\n" +
		        		"14. Walking Contradiction (2:31)")
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
        String[] values = new String[] {"Armatage Shanks",
        		"Brat",
        		"Stuck With Me",
        		"Geek Stink Breath",
        		"No Pride",
        		"Bab's Uvula Who!",
        		"86",
        		"Panic Song",
        		"Stuart And The Ave.",
        		"Brain Stew",
        		"Jaded",
        		"Westbound Sign",
        		"Tight Wad Hill",
        		"Walking Contradiction"};
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
                         case 0:  Intent newActivity = new Intent(getActivity(), Armatage.class);     
                         		  startActivityForResult(newActivity, 0);
                                  break;
                         case 1:  Intent newActivity1 = new Intent(getActivity(), Brat.class);     
                                  startActivityForResult(newActivity1, 1);
                                  break;
                         case 2:  Intent newActivity2 = new Intent(getActivity(), Stuckwithme.class);     
        			              startActivityForResult(newActivity2, 1);
        			              break;
                         case 3:  Intent newActivity3 = new Intent(getActivity(), Geekstink.class);     
        	              		  startActivityForResult(newActivity3, 1);
        	              		  break;
                         case 4:  Intent newActivity4 = new Intent(getActivity(), Nopride.class);     
        		         		  startActivityForResult(newActivity4, 1);
        		         		  break;
                         case 5:  Intent newActivity5 = new Intent(getActivity(), Babuvula.class);     
        		        		  startActivityForResult(newActivity5, 1);
        		        		  break;
                         case 6:  Intent newActivity6 = new Intent(getActivity(), Eightysix.class);     
        			       		  startActivityForResult(newActivity6, 1);
        			       		  break;
                         case 7:  Intent newActivity7 = new Intent(getActivity(), Panicsong.class);     
        			       		  startActivityForResult(newActivity7, 1);
        			       		  break;
                         case 8:  Intent newActivity8 = new Intent(getActivity(), Stuartave.class);     
        			       		  startActivityForResult(newActivity8, 1);
        			       		  break;
                         case 9:  Intent newActivity9 = new Intent(getActivity(), Brainstew.class);     
        			       		  startActivityForResult(newActivity9, 1);
        			       		  break; 
                         case 10: Intent newActivity10 = new Intent(getActivity(), Jaded.class);     
        			       		  startActivityForResult(newActivity10, 1);
        			       		  break; 
                         case 11: Intent newActivity11 = new Intent(getActivity(), Westbound.class);     
        			       		  startActivityForResult(newActivity11, 1);
        			       		  break;
                         case 12: Intent newActivity12 = new Intent(getActivity(), Tightwad.class);     
        			       		  startActivityForResult(newActivity12, 1);
        			       		  break;
                         case 13: Intent newActivity13 = new Intent(getActivity(), Walking.class);     
					       		  startActivityForResult(newActivity13, 1);
					       		  break;
                  
                      }
                	 }
                });
                return rootView;
            }
           
        }