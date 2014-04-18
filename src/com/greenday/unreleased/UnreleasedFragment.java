package com.greenday.unreleased;

import com.greenday.lyrics.R;
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
		 
        	Crouton.makeText(getActivity(), "The content in this part might be incorrect.", Style.ALERT).show();
        	
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
					"Angel and the Jerk (Penelope Houston + Billie Joe)",
					"Another State Of Mind",
					"Billie Joe's Mom",
					"Boys in the Bathroom Stall",
					"Can't Make Love (Pansy Division + Tré Cool)",
					"Chocolate Rain (Tré Cool)",
					"Cigarettes And Valentines",
					"D.U.I.",
					"Depression Times (Jesse Malin + Green Day)",
					"Don't Want to Know If You Are Lonely",
					"Dream Catcher",
					"Favourite Son",
					"Food Around the Corner",
					"Governator",
					"Hearts Collide",
					"Hybrid Moments",
					"I Fought The Law",
					"I Run NY (The Lonely Island + Billie Joe)",
					"Jennifer",
					"Lights Out",
					"Like A Rolling Stone",
					"Like a Rat Does Cheese",
					"Look For Love (Billie Joe)",
					"Maybe Forever",
					"Mechanical Man",
					"Midwest Medley",
					"Minnesota Girl",
					"Oh Girl",
					"Olivia",
					"Private Hell (Iggy Pop + Green Day)",
					"Radio (Billie Joe and Rancid)",
					"Second Time Around",
					"Shoplifter",
					"Shout",
					"State of Shock",
					"Supermarket (Iggy Pop + Green Day)",
					"Teenage Lobotomy",
					"That's All Right",
					"The Ballad of Wilhelm Fink (Billie Joe)",
					"The Saints Are Coming (U2 + Green Day)",
					"The Simpsons Theme",
					"The Things I Heard Today",
					"Too Much, Too Soon",
					"Walking the Dog",
					"We Are The Champions",
					"What About Today?",
					"When It's Time",
					"When Will I Be Loved (Miranda Lambert + Billie Joe)",
					"Why Does It Always Rain on Me?",
					"Working Class Hero",
					"World Vs. World (What You Say)",
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
			                      startActivity(newActivity);
                                  break;
                         case 1:  Intent newActivity1 = new Intent(getActivity(), Unreleased.class);     
			                      newActivity1.putExtra("track", 2);
			                      startActivity(newActivity1);
                                  break;
                         case 2:  Intent newActivity2 = new Intent(getActivity(), Unreleased.class);     
			                      newActivity2.putExtra("track", 3);
			                      startActivity(newActivity2);
        			              break;
                         case 3:  Intent newActivity3 = new Intent(getActivity(), Unreleased.class);     
			                      newActivity3.putExtra("track", 4);
			                      startActivity(newActivity3);
        	              		  break;
                         case 4:  Intent newActivity4 = new Intent(getActivity(), Unreleased.class);     
			                      newActivity4.putExtra("track", 5);
			                      startActivity(newActivity4);
        		         		  break;
                         case 5:  Intent newActivity5 = new Intent(getActivity(), Unreleased.class);     
			                      newActivity5.putExtra("track", 6);
			                      startActivity(newActivity5);
        		        		  break;
                         case 6:  Intent newActivity6 = new Intent(getActivity(), Unreleased.class);     
			                      newActivity6.putExtra("track", 7);
			                      startActivity(newActivity6);
        			       		  break;
                         case 7:  Intent newActivity7 = new Intent(getActivity(), Unreleased.class);     
			                      newActivity7.putExtra("track", 8);
			                      startActivity(newActivity7);
        			       		  break;
                         case 8:  Intent newActivity8 = new Intent(getActivity(), Unreleased.class);     
			                      newActivity8.putExtra("track", 9);
			                      startActivity(newActivity8);
        			       		  break; 
                         case 9: Intent newActivity9 = new Intent(getActivity(), Unreleased.class);     
			                      newActivity9.putExtra("track", 10);
			                      startActivity(newActivity9);
        			       		  break; 
                         case 10: Intent newActivity10 = new Intent(getActivity(), Unreleased.class);     
			                      newActivity10.putExtra("track", 11);
			                      startActivity(newActivity10);
        			       		  break;
                         case 11: Intent newActivity11 = new Intent(getActivity(), Unreleased.class);     
			                      newActivity11.putExtra("track", 12);
			                      startActivity(newActivity11);
        			       		  break;
                         case 12: Intent newActivity12 = new Intent(getActivity(), Unreleased.class);     
			                      newActivity12.putExtra("track", 13);
			                      startActivity(newActivity12);
					       		  break;
                         case 13: Intent newActivity13 = new Intent(getActivity(), Unreleased.class);     
			                      newActivity13.putExtra("track", 14);
			                      startActivity(newActivity13);
					       		  break;
                         case 14: Intent newActivity14 = new Intent(getActivity(), Unreleased.class);     
			                      newActivity14.putExtra("track", 15);
			                      startActivity(newActivity14);
					       		  break;
                         case 15: Intent newActivity15 = new Intent(getActivity(), Unreleased.class);     
			                      newActivity15.putExtra("track", 16);
			                      startActivity(newActivity15);
					       		  break;
                         case 16: Intent newActivity16 = new Intent(getActivity(), Unreleased.class);
                         		  newActivity16.putExtra("track", 17);
					       		  startActivity(newActivity16);
					       		  break;
                         case 17: Intent newActivity17 = new Intent(getActivity(), Unreleased.class);
                         		  newActivity17.putExtra("track", 18);
                         		  startActivity(newActivity17);
                         		  break;
                         case 18: Intent newActivity18 = new Intent(getActivity(), Unreleased.class);
		                		  newActivity18.putExtra("track", 19);
		                		  startActivity(newActivity18);	
		                		  break;
                         case 19: Intent newActivity19 = new Intent(getActivity(), Unreleased.class);
		                		  newActivity19.putExtra("track", 20);
		                		  startActivity(newActivity19);
		                		  break;
                         case 20: Intent newActivity20 = new Intent(getActivity(), Unreleased.class);
		                		  newActivity20.putExtra("track", 21);
		                		  startActivity(newActivity20);
		                		  break;
                         case 21: Intent newActivity21 = new Intent(getActivity(), Unreleased.class);
		                		  newActivity21.putExtra("track", 22);
		                		  startActivity(newActivity21);
		                		  break;
                         case 22: Intent newActivity22 = new Intent(getActivity(), Unreleased.class);
		                		  newActivity22.putExtra("track", 23);
		                		  startActivity(newActivity22);
		                		  break;
                         case 23: Intent newActivity23 = new Intent(getActivity(), Unreleased.class);
		                		  newActivity23.putExtra("track", 24);
		                		  startActivity(newActivity23);
		                		  break;
                         case 24: Intent newActivity24 = new Intent(getActivity(), Unreleased.class);
		                		  newActivity24.putExtra("track", 25);
		                		  startActivity(newActivity24);
		                		  break;
                         case 25: Intent newActivity25 = new Intent(getActivity(), Unreleased.class);
		                		  newActivity25.putExtra("track", 26);
		                		  startActivity(newActivity25);
		                		  break;
                         case 26: Intent newActivity26 = new Intent(getActivity(), Unreleased.class);
		                		  newActivity26.putExtra("track", 27);
		                		  startActivity(newActivity26);
		                		  break;
                         case 27: Intent newActivity27 = new Intent(getActivity(), Unreleased.class);
		                		  newActivity27.putExtra("track", 28);
		                		  startActivity(newActivity27);
		                		  break;
                         case 28: Intent newActivity28 = new Intent(getActivity(), Unreleased.class);
		                		  newActivity28.putExtra("track", 29);
		                		  startActivity(newActivity28);
		                		  break;
                         case 29: Intent newActivity29 = new Intent(getActivity(), Unreleased.class);
		                		  newActivity29.putExtra("track", 30);
		                		  startActivity(newActivity29);
		                		  break;
                         case 30: Intent newActivity30 = new Intent(getActivity(), Unreleased.class);
		                		  newActivity30.putExtra("track", 31);
		                		  startActivity(newActivity30);
		                		  break;
                         case 31: Intent newActivity31 = new Intent(getActivity(), Unreleased.class);
		                		  newActivity31.putExtra("track", 32);
		                		  startActivity(newActivity31);
		                		  break;
                         case 32: Intent newActivity32 = new Intent(getActivity(), Unreleased.class);
		                		  newActivity32.putExtra("track", 33);
		                		  startActivity(newActivity32);
		                		  break;
                         case 33: Intent newActivity33 = new Intent(getActivity(), Unreleased.class);
		                		  newActivity33.putExtra("track", 34);
		                		  startActivity(newActivity33);
		                		  break;
                         case 34: Intent newActivity34 = new Intent(getActivity(), Unreleased.class);
		                		  newActivity34.putExtra("track", 35);
		                		  startActivity(newActivity34);
		                		  break;
                         case 35: Intent newActivity35 = new Intent(getActivity(), Unreleased.class);
		                		  newActivity35.putExtra("track", 36);
		                		  startActivity(newActivity35);
		                		  break;
                         case 36: Intent newActivity36 = new Intent(getActivity(), Unreleased.class);
		                		  newActivity36.putExtra("track", 37);
		                		  startActivity(newActivity36);
		                		  break;
                         case 37: Intent newActivity37 = new Intent(getActivity(), Unreleased.class);
		                		  newActivity37.putExtra("track", 38);
		                		  startActivity(newActivity37);
		                		  break;
                         case 38: Intent newActivity38 = new Intent(getActivity(), Unreleased.class);
		                		  newActivity38.putExtra("track", 39);
		                		  startActivity(newActivity38);
		                		  break;
                         case 39: Intent newActivity39 = new Intent(getActivity(), Unreleased.class);
		                		  newActivity39.putExtra("track", 40);
		                		  startActivity(newActivity39);
		                		  break;
                         case 40: Intent newActivity40 = new Intent(getActivity(), Unreleased.class);
		                		  newActivity40.putExtra("track", 41);
		                		  startActivity(newActivity40);
		                		  break;
                         case 41: Intent newActivity41 = new Intent(getActivity(), Unreleased.class);
		                		  newActivity41.putExtra("track", 42);
		                		  startActivity(newActivity41);
		                		  break;
                         case 42: Intent newActivity42 = new Intent(getActivity(), Unreleased.class);
		                		  newActivity42.putExtra("track", 43);
		                		  startActivity(newActivity42);
		                		  break;
                         case 43: Intent newActivity43 = new Intent(getActivity(), Unreleased.class);
		                		  newActivity43.putExtra("track", 44);
		                		  startActivity(newActivity43);
		                		  break;
                         case 44: Intent newActivity44 = new Intent(getActivity(), Unreleased.class);
		                		  newActivity44.putExtra("track", 45);
		                		  startActivity(newActivity44);
		                		  break;
                         case 45: Intent newActivity45 = new Intent(getActivity(), Unreleased.class);
		                		  newActivity45.putExtra("track", 46);
		                		  startActivity(newActivity45);
		                		  break;
                         case 46: Intent newActivity46 = new Intent(getActivity(), Unreleased.class);
		                		  newActivity46.putExtra("track", 47);
		                		  startActivity(newActivity46);
		                		  break;
                         case 47: Intent newActivity47 = new Intent(getActivity(), Unreleased.class);
		                		  newActivity47.putExtra("track", 48);
		                		  startActivity(newActivity47);
		                		  break;
                         case 48: Intent newActivity48 = new Intent(getActivity(), Unreleased.class);
		                		  newActivity48.putExtra("track", 49);
		                		  startActivity(newActivity48);
		                		  break;
                         case 49: Intent newActivity49 = new Intent(getActivity(), Unreleased.class);
		                		  newActivity49.putExtra("track", 50);
		                		  startActivity(newActivity49);
		                		  break;
                         case 50: Intent newActivity50 = new Intent(getActivity(), Unreleased.class);
		                		  newActivity50.putExtra("track", 51);
		                		  startActivity(newActivity50);
		                		  break;
                         case 51: Intent newActivity51 = new Intent(getActivity(), Unreleased.class);
		                		  newActivity51.putExtra("track", 52);
		                		  startActivity(newActivity51);
		                		  break;
                         case 52: Intent newActivity52 = new Intent(getActivity(), Unreleased.class);
		                		  newActivity52.putExtra("track", 53);
		                		  startActivity(newActivity52);
		                		  break;
                         }
                	 }
                 });
                 return rootView;
    }   
}