package com.greenday.unreleased;

import com.greenday.lyrics.R;
import com.greenday.lyrics.R.id;
import com.greenday.lyrics.R.layout;

import de.keyboardsurfer.android.widget.crouton.Crouton;
import de.keyboardsurfer.android.widget.crouton.Style;

import android.os.Bundle;
import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class UnreleasedFragment extends Fragment {
	
	public UnreleasedFragment(){}
    
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
  
        View rootView = inflater.inflate(R.layout.fragment_unreleased, container, false);
		//getActivity().getWindow().setBackgroundDrawableResource(R.drawable.unreleased_cover2);
        
		getActivity();
		//Boot_pref
        boolean firstboot = getActivity().getSharedPreferences("BOOT_PREF", Context.MODE_PRIVATE).getBoolean("firstboot_unreleased", true);

        if (firstboot){
		 
        	Crouton.makeText(getActivity(), "More lyrics will be added here in future.", Style.INFO).show();
        	
         getActivity();
		getActivity().getSharedPreferences("BOOT_PREF", Context.MODE_PRIVATE)
         .edit()
         .putBoolean("firstboot_unreleased", false)
         .commit();
        }
		//Boot_pref ends
		
        ListView listview = (ListView) rootView.findViewById(R.id.listView1);

        //EDITED Code 
        String[] values = new String[] {"A Quick One While He's Away",
        		"Another State Of Mind",
        		"Cigarettes And Valentines",
        		"Favourite Son",
        		"Governator",
        		"Hearts Collide",
        		"I Fought The Law",
        		"Lights Out",
        		"Like A Rolling Stone",
        		"Mechanical Man",
        		"Minnesota Girl",
        		"Shoplifter",
        		"Shout",
        		"Teenage Lobotomy",
        		"That's All Right",
        		"Too Much, Too Soon",
        		"We Are The Champions",
        		"Working Class Hero"
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
                         case 0:  Intent newActivity = new Intent(getActivity(), Unreleased.class);     
			                         newActivity.putExtra("track", 1);
			                         startActivityForResult(newActivity, 0);
                                  break;
                         case 1:  Intent newActivity1 = new Intent(getActivity(), Unreleased.class);     
			                         newActivity1.putExtra("track", 2);
			                         startActivityForResult(newActivity1, 1);
                                  break;
                         case 2:  Intent newActivity2 = new Intent(getActivity(), Unreleased.class);     
			                         newActivity2.putExtra("track", 3);
			                         startActivityForResult(newActivity2, 1);
        			              break;
                         case 3:  Intent newActivity3 = new Intent(getActivity(), Unreleased.class);     
			                         newActivity3.putExtra("track", 4);
			                         startActivityForResult(newActivity3, 1);
        	              		  break;
                         case 4:  Intent newActivity4 = new Intent(getActivity(), Unreleased.class);     
			                         newActivity4.putExtra("track", 5);
			                         startActivityForResult(newActivity4, 1);
        		         		  break;
                         case 5:  Intent newActivity5 = new Intent(getActivity(), Unreleased.class);     
			                         newActivity5.putExtra("track", 6);
			                         startActivityForResult(newActivity5, 1);
        		        		  break;
                         case 6:  Intent newActivity6 = new Intent(getActivity(), Unreleased.class);     
			                         newActivity6.putExtra("track", 7);
			                         startActivityForResult(newActivity6, 1);
        			       		  break;
                         case 7:  Intent newActivity7 = new Intent(getActivity(), Unreleased.class);     
			                         newActivity7.putExtra("track", 8);
			                         startActivityForResult(newActivity7, 1);
        			       		  break;
                         case 8:  Intent newActivity8 = new Intent(getActivity(), Unreleased.class);     
			                         newActivity8.putExtra("track", 9);
			                         startActivityForResult(newActivity8, 1);
        			       		  break; 
                         case 9: Intent newActivity9 = new Intent(getActivity(), Unreleased.class);     
			                         newActivity9.putExtra("track", 10);
			                         startActivityForResult(newActivity9, 1);
        			       		  break; 
                         case 10: Intent newActivity10 = new Intent(getActivity(), Unreleased.class);     
			                         newActivity10.putExtra("track", 11);
			                         startActivityForResult(newActivity10, 1);
        			       		  break;
                         case 11: Intent newActivity11 = new Intent(getActivity(), Unreleased.class);     
			                         newActivity11.putExtra("track", 12);
			                         startActivityForResult(newActivity11, 1);
        			       		  break;
                         case 12: Intent newActivity12 = new Intent(getActivity(), Unreleased.class);     
			                         newActivity12.putExtra("track", 13);
			                         startActivityForResult(newActivity12, 1);
					       		  break;
                         case 13: Intent newActivity13 = new Intent(getActivity(), Unreleased.class);     
			                         newActivity13.putExtra("track", 14);
			                         startActivityForResult(newActivity13, 1);
					       		  break;
                         case 14: Intent newActivity14 = new Intent(getActivity(), Unreleased.class);     
			                         newActivity14.putExtra("track", 15);
			                         startActivityForResult(newActivity14, 1);
					       		  break;
                         case 15: Intent newActivity15 = new Intent(getActivity(), Unreleased.class);     
			                         newActivity15.putExtra("track", 16);
			                         startActivityForResult(newActivity15, 1);
					       		  break;
                         case 16: Intent newActivity16 = new Intent(getActivity(), Unreleased.class);
                         		  newActivity16.putExtra("track", 17);
					       		  startActivityForResult(newActivity16, 1);
					       		  break;
                         case 17: Intent newActivity17 = new Intent(getActivity(), Unreleased.class);
                         		  newActivity17.putExtra("track", 18);
                         		  startActivityForResult(newActivity17, 1);
                  
                      }
                	 }
                });
                return rootView;
            }
           
        }