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
					"Angel and the Jerk",
					"Another State Of Mind",
					"Billie Joe's Mom",
					"Boys in the Bathroom Stall",
					"Can't Make Love",
					"Chocolate Rain",
					"Cigarettes And Valentines",
					"D.U.I.",
					"Depression Times",
					"Don't Want to Know If You Are Lonely",
					"Dream Catcher",
					"Favourite Son",
					"Food Around the Corner",
					"Governator",
					"Hearts Collide",
					"Hybrid Moments",
					"I Fought The Law",
					"I Run NY",
					"Jennifer",
					"Lights Out",
					"Like A Rolling Stone",
					"Like a Rat Does Cheese",
					"Look For Love",
					"Maybe Forever",
					"Mechanical Man",
					"Midwest Medley",
					"Minnesota Girl",
					"Oh Girl",
					"Olivia",
					"Private Hell",
					"Radio",
					"Second Time Around",
					"Shoplifter",
					"Shout",
					"State of Shock",
					"Supermarket",
					"Teenage Lobotomy",
					"That's All Right",
					"The Ballad of Wilhelm Fink",
					"The Saints Are Coming",
					"The Simpsons Theme",
					"The Things I Heard Today",
					"Too Much, Too Soon",
					"Walking the Dog",
					"We Are The Champions",
					"What About Today?",
					"When It's Time",
					"When Will I Be Loved",
					"Why Does It Always Rain on Me?",
					"Working Class Hero",
					"World Vs. World",
					"You Can't Fool Me"
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
                         		  break;
                         case 18: Intent newActivity18 = new Intent(getActivity(), Unreleased.class);
		                		  newActivity18.putExtra("track", 19);
		                		  startActivityForResult(newActivity18, 1);	
		                		  break;
                         case 19: Intent newActivity19 = new Intent(getActivity(), Unreleased.class);
		                		  newActivity19.putExtra("track", 20);
		                		  startActivityForResult(newActivity19, 1);
		                		  break;
                         case 20: Intent newActivity20 = new Intent(getActivity(), Unreleased.class);
		                		  newActivity20.putExtra("track", 21);
		                		  startActivityForResult(newActivity20, 1);
		                		  break;
                         case 21: Intent newActivity21 = new Intent(getActivity(), Unreleased.class);
		                		  newActivity21.putExtra("track", 22);
		                		  startActivityForResult(newActivity21, 1);
		                		  break;
                         case 22: Intent newActivity22 = new Intent(getActivity(), Unreleased.class);
		                		  newActivity22.putExtra("track", 23);
		                		  startActivityForResult(newActivity22, 1);
		                		  break;
                         case 23: Intent newActivity23 = new Intent(getActivity(), Unreleased.class);
		                		  newActivity23.putExtra("track", 24);
		                		  startActivityForResult(newActivity23, 1);
		                		  break;
                         case 24: Intent newActivity24 = new Intent(getActivity(), Unreleased.class);
		                		  newActivity24.putExtra("track", 25);
		                		  startActivityForResult(newActivity24, 1);
		                		  break;
                         case 25: Intent newActivity25 = new Intent(getActivity(), Unreleased.class);
		                		  newActivity25.putExtra("track", 26);
		                		  startActivityForResult(newActivity25, 1);
		                		  break;
                         case 26: Intent newActivity26 = new Intent(getActivity(), Unreleased.class);
		                		  newActivity26.putExtra("track", 27);
		                		  startActivityForResult(newActivity26, 1);
		                		  break;
                         case 27: Intent newActivity27 = new Intent(getActivity(), Unreleased.class);
		                		  newActivity27.putExtra("track", 28);
		                		  startActivityForResult(newActivity27, 1);
		                		  break;
                         case 28: Intent newActivity28 = new Intent(getActivity(), Unreleased.class);
		                		  newActivity28.putExtra("track", 29);
		                		  startActivityForResult(newActivity28, 1);
		                		  break;
                         case 29: Intent newActivity29 = new Intent(getActivity(), Unreleased.class);
		                		  newActivity29.putExtra("track", 30);
		                		  startActivityForResult(newActivity29, 1);
		                		  break;
                         case 30: Intent newActivity30 = new Intent(getActivity(), Unreleased.class);
		                		  newActivity30.putExtra("track", 31);
		                		  startActivityForResult(newActivity30, 1);
		                		  break;
                         case 31: Intent newActivity31 = new Intent(getActivity(), Unreleased.class);
		                		  newActivity31.putExtra("track", 32);
		                		  startActivityForResult(newActivity31, 1);
		                		  break;
                         case 32: Intent newActivity32 = new Intent(getActivity(), Unreleased.class);
		                		  newActivity32.putExtra("track", 33);
		                		  startActivityForResult(newActivity32, 1);
		                		  break;
                         case 33: Intent newActivity33 = new Intent(getActivity(), Unreleased.class);
		                		  newActivity33.putExtra("track", 34);
		                		  startActivityForResult(newActivity33, 1);
		                		  break;
                         case 34: Intent newActivity34 = new Intent(getActivity(), Unreleased.class);
		                		  newActivity34.putExtra("track", 35);
		                		  startActivityForResult(newActivity34, 1);
		                		  break;
                         case 35: Intent newActivity35 = new Intent(getActivity(), Unreleased.class);
		                		  newActivity35.putExtra("track", 36);
		                		  startActivityForResult(newActivity35, 1);
		                		  break;
                         case 36: Intent newActivity36 = new Intent(getActivity(), Unreleased.class);
		                		  newActivity36.putExtra("track", 37);
		                		  startActivityForResult(newActivity36, 1);
		                		  break;
                         case 37: Intent newActivity37 = new Intent(getActivity(), Unreleased.class);
		                		  newActivity37.putExtra("track", 38);
		                		  startActivityForResult(newActivity37, 1);
		                		  break;
                         case 38: Intent newActivity38 = new Intent(getActivity(), Unreleased.class);
		                		  newActivity38.putExtra("track", 39);
		                		  startActivityForResult(newActivity38, 1);
		                		  break;
                         case 39: Intent newActivity39 = new Intent(getActivity(), Unreleased.class);
		                		  newActivity39.putExtra("track", 40);
		                		  startActivityForResult(newActivity39, 1);
		                		  break;
                         case 40: Intent newActivity40 = new Intent(getActivity(), Unreleased.class);
		                		  newActivity40.putExtra("track", 41);
		                		  startActivityForResult(newActivity40, 1);
		                		  break;
                         case 41: Intent newActivity41 = new Intent(getActivity(), Unreleased.class);
		                		  newActivity41.putExtra("track", 42);
		                		  startActivityForResult(newActivity41, 1);
		                		  break;
                         case 42: Intent newActivity42 = new Intent(getActivity(), Unreleased.class);
		                		  newActivity42.putExtra("track", 43);
		                		  startActivityForResult(newActivity42, 1);
		                		  break;
                         case 43: Intent newActivity43 = new Intent(getActivity(), Unreleased.class);
		                		  newActivity43.putExtra("track", 44);
		                		  startActivityForResult(newActivity43, 1);
		                		  break;
                         case 44: Intent newActivity44 = new Intent(getActivity(), Unreleased.class);
		                		  newActivity44.putExtra("track", 45);
		                		  startActivityForResult(newActivity44, 1);
		                		  break;
                         case 45: Intent newActivity45 = new Intent(getActivity(), Unreleased.class);
		                		  newActivity45.putExtra("track", 46);
		                		  startActivityForResult(newActivity45, 1);
		                		  break;
                         case 46: Intent newActivity46 = new Intent(getActivity(), Unreleased.class);
		                		  newActivity46.putExtra("track", 47);
		                		  startActivityForResult(newActivity46, 1);
		                		  break;
                         case 47: Intent newActivity47 = new Intent(getActivity(), Unreleased.class);
		                		  newActivity47.putExtra("track", 48);
		                		  startActivityForResult(newActivity47, 1);
		                		  break;
                         case 48: Intent newActivity48 = new Intent(getActivity(), Unreleased.class);
		                		  newActivity48.putExtra("track", 49);
		                		  startActivityForResult(newActivity48, 1);
		                		  break;
                         case 49: Intent newActivity49 = new Intent(getActivity(), Unreleased.class);
		                		  newActivity49.putExtra("track", 50);
		                		  startActivityForResult(newActivity49, 1);
		                		  break;
                         case 50: Intent newActivity50 = new Intent(getActivity(), Unreleased.class);
		                		  newActivity50.putExtra("track", 51);
		                		  startActivityForResult(newActivity50, 1);
		                		  break;
                         case 51: Intent newActivity51 = new Intent(getActivity(), Unreleased.class);
		                		  newActivity51.putExtra("track", 52);
		                		  startActivityForResult(newActivity51, 1);
		                		  break;
                         case 52: Intent newActivity52 = new Intent(getActivity(), Unreleased.class);
		                		  newActivity52.putExtra("track", 53);
		                		  startActivityForResult(newActivity52, 1);
		                		  break;
                  
                         }
                	 }
                });
                return rootView;
            }
           
        }