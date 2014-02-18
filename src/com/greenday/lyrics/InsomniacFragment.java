package com.greenday.lyrics;

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
import android.text.Html;
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
		        		getString(R.string.insomniac_album_release) +
		        		getString(R.string.length) +
		        		"<font color='#006500'><i>32:49</font></i><br><br>" +
		        		getString(R.string.track_list) +
		        		"<font color='#006500'>1. Armatage Shanks <i>(2:17)</i><br>" +
		        		"2. Brat <i>(1:43)</i><br>" +
		        		"3. Stuck with Me <i>(2:16)</i><br>" +
		        		"4. Geek Stink Breath <i>(2:15)</i><br>" +
		        		"5. No Pride <i>(2:19)</i><br>" +
		        		"6. Bab's Uvula Who? <i>(2:08)</i><br>" +
		        		"7. 86 <i>(2:47)</i><br>" +
		        		"8. Panic Song <i>(3:35)</i><br>" +
		        		"9. Stuart and the Ave. <i>(2:03)</i><br>" +
		        		"10. Brain Stew <i>(3:13)</i><br>" +
		        		"11. Jaded <i>(1:30)</i><br>" +
		        		"12. Westbound Sign <i>(2:12)</i><br>" +
		        		"13. Tight Wad Hill <i>(2:01)</i><br>" +
		        		"14. Walking Contradiction <i>(2:31)</i></font>"))
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