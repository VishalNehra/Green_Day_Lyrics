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
import de.keyboardsurfer.android.widget.crouton.Crouton;
import de.keyboardsurfer.android.widget.crouton.Style;

import android.app.AlertDialog;
import android.app.Fragment;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;
	 
	public class DookieFragment extends Fragment{
	    
	    @Override
	    public View onCreateView(LayoutInflater inflater, ViewGroup container,
	    		
	            Bundle savedInstanceState) {
	  
	        View rootView = inflater.inflate(R.layout.fragment_dookie, container, false);
			getActivity().getWindow().setBackgroundDrawableResource(R.drawable.dookie_cover2);
			
			getActivity();
			//Boot_pref
	        boolean firstboot = getActivity().getSharedPreferences("BOOT_PREF", Context.MODE_PRIVATE).getBoolean("firstboot_detail", true);

	        if (firstboot){
			 
	        	Crouton.makeText(getActivity(), "If you press on the album icon at corner right", Style.INFO).show();
	        	Crouton.makeText(getActivity(), "You can see some details about the current album.", Style.INFO).show();
	        	Crouton.makeText(getActivity(), "Similar feature is available for tracks too!", Style.CONFIRM).show();
	        	
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
			        		getString(R.string.dookie_album_release) +
			        		getString(R.string.length) +
			        		"<font color='#006500'><i>39:38</font></i><br><br>" +
			        		getString(R.string.track_list) +
			        		"<font color='#006500'>1. Burnout <i>(2:07)</i><br>" +
			        		"2. Having A Blast <i>(2:44)</i><br>" +
			        		"3. Chump <i>(2:54)</i><br>" +
			        		"4. Longview <i>(3:59)</i><br>" +
			        		"5. Welcome to Paradise <i>(3:44)</i><br>" +
			        		"6. Pulling Teeth <i>(2:31)</i><br>" +
			        		"7. Basket Case <i>(3:01)</i><br>" +
			        		"8. She <i>(2:14)</i><br>" +
			        		"9. Sassafras Roots <i>(2:37)</i><br>" +
			        		"10. When I Come Around <i>(2:58)</i><br>" +
			        		"11. Coming Clean <i>(1:34)</i><br>" +
			        		"12. Emenius Sleepus <i>(1:43)</i><br>" +
			        		"13. In The End <i>(1:46)</i><br>" +
			        		"14. F.O.D. <i>(5:46)</i></font>"))
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
	        String[] values = new String[] {"Burnout",
	        		"Having A Blast",
	        		"Chump",
	        		"Longview",
	        		"Welcome To Paradise",
	        		"Pulling Teeth",
	        		"Basket Case",
	        		"She",
	        		"Sassafras Roots",
	        		"When I Come Around",
	        		"Coming Clean",
	        		"Emenius Sleepus",
	        		"In The End",
	        		"F.O.D."};
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
	                         case 0:  Intent newActivity = new Intent(getActivity(), Burnout.class);     
	                         		  startActivityForResult(newActivity, 0);
	                                  break;
	                         case 1:  Intent newActivity1 = new Intent(getActivity(), Havingblast.class);     
	                                  startActivityForResult(newActivity1, 1);
	                                  break;
	                         case 2:  Intent newActivity2 = new Intent(getActivity(), Chump.class);     
	        			              startActivityForResult(newActivity2, 1);
	        			              break;
	                         case 3:  Intent newActivity3 = new Intent(getActivity(), Longview.class);     
	        	              		  startActivityForResult(newActivity3, 1);
	        	              		  break;
	                         case 4:  Intent newActivity4 = new Intent(getActivity(), Welcomeparadise.class);     
	        		         		  startActivityForResult(newActivity4, 1);
	        		         		  break;
	                         case 5:  Intent newActivity5 = new Intent(getActivity(), Pullingteeth.class);     
	        		        		  startActivityForResult(newActivity5, 1);
	        		        		  break;
	                         case 6:  Intent newActivity6 = new Intent(getActivity(), Basketcase.class);     
	        			       		  startActivityForResult(newActivity6, 1);
	        			       		  break;
	                         case 7:  Intent newActivity7 = new Intent(getActivity(), She.class);     
	        			       		  startActivityForResult(newActivity7, 1);
	        			       		  break;
	                         case 8:  Intent newActivity8 = new Intent(getActivity(), Sassafrasroots.class);     
	        			       		  startActivityForResult(newActivity8, 1);
	        			       		  break;
	                         case 9:  Intent newActivity9 = new Intent(getActivity(), Whencomearound.class);     
	        			       		  startActivityForResult(newActivity9, 1);
	        			       		  break; 
	                         case 10: Intent newActivity10 = new Intent(getActivity(), Comingclean.class);     
	        			       		  startActivityForResult(newActivity10, 1);
	        			       		  break; 
	                         case 11: Intent newActivity11 = new Intent(getActivity(), Emeniussleepus.class);     
	        			       		  startActivityForResult(newActivity11, 1);
	        			       		  break;
	                         case 12: Intent newActivity12 = new Intent(getActivity(), Intheend.class);     
	        			       		  startActivityForResult(newActivity12, 1);
	        			       		  break;
	                         case 13: Intent newActivity13 = new Intent(getActivity(), FOD.class);     
						       		  startActivityForResult(newActivity13, 1);
						       		  break;
	                  
	                      }
	                	 }
	                });
	                return rootView;
	            }
	           
	        }