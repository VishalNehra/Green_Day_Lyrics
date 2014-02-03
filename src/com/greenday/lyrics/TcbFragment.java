package com.greenday.lyrics;

import com.greenday.tcb.Americaneulogy;
import com.greenday.tcb.Eastjesus;
import com.greenday.tcb.Guns;
import com.greenday.tcb.Horseshoes;
import com.greenday.tcb.Inferno;
import com.greenday.tcb.Knowyourenemy;
import com.greenday.tcb.Lastamerican;
import com.greenday.tcb.Lastnight;
import com.greenday.tcb.Lobotomy;
import com.greenday.tcb.Murdercity;
import com.greenday.tcb.Peacemaker;
import com.greenday.tcb.Restlessheart;
import com.greenday.tcb.Seethelight;
import com.greenday.tcb.Songofcentuary;
import com.greenday.tcb.Staticage;
import com.greenday.tcb.Tcb;
import com.greenday.tcb.Vivalagloria;
import com.greenday.tcb.Vivalagloria2;

import android.os.Bundle;
import android.app.Fragment;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class TcbFragment extends Fragment {
	
	public TcbFragment(){}
    
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
  
        View rootView = inflater.inflate(R.layout.fragment_tcb, container, false);
		getActivity().getWindow().setBackgroundDrawableResource(R.drawable.tcb_cover2);
        
        ListView listview = (ListView) rootView.findViewById(R.id.listView1);

        //EDITED Code 
        String[] values = new String[] {"Song Of The Centuary",
        		"21st Century Breakdown",
        		"Know Your Enemy",
        		"¡Viva La Gloria!",
        		"Before The Lobotomy",
        		"Christian's Inferno",
        		"Last Night On Earth",
        		"East Jesus Nowhere",
        		"Peacemaker",
        		"Last Of American Girls",
        		"Murder City",
        		"¿Viva La Gloria? (Little Girl)",
        		"Restless Heart Syndrome",
        		"Horseshoes And Handgranades",
        		"The Static Age",
        		"21 Guns",
        		"American Eulogy\n(Mass Hysteria / Modern World)",
        		"See The Light"};
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
                         case 0:  Intent newActivity = new Intent(getActivity(), Songofcentuary.class);     
                         		  startActivityForResult(newActivity, 0);
                                  break;
                         case 1:  Intent newActivity1 = new Intent(getActivity(), Tcb.class);     
                                  startActivityForResult(newActivity1, 1);
                                  break;
                         case 2:  Intent newActivity2 = new Intent(getActivity(), Knowyourenemy.class);     
        			              startActivityForResult(newActivity2, 1);
        			              break;
                         case 3:  Intent newActivity3 = new Intent(getActivity(), Vivalagloria.class);     
        	              		  startActivityForResult(newActivity3, 1);
        	              		  break;
                         case 4:  Intent newActivity4 = new Intent(getActivity(), Lobotomy.class);     
        		         		  startActivityForResult(newActivity4, 1);
        		         		  break;
                         case 5:  Intent newActivity5 = new Intent(getActivity(), Inferno.class);     
        		        		  startActivityForResult(newActivity5, 1);
        		        		  break;
                         case 6:  Intent newActivity6 = new Intent(getActivity(), Lastnight.class);     
        			       		  startActivityForResult(newActivity6, 1);
        			       		  break;
                         case 7:  Intent newActivity7 = new Intent(getActivity(), Eastjesus.class);     
        			       		  startActivityForResult(newActivity7, 1);
        			       		  break;
                         case 8:  Intent newActivity8 = new Intent(getActivity(), Peacemaker.class);     
        			       		  startActivityForResult(newActivity8, 1);
        			       		  break;
                         case 9:  Intent newActivity9 = new Intent(getActivity(), Lastamerican.class);     
        			       		  startActivityForResult(newActivity9, 1);
        			       		  break; 
                         case 10: Intent newActivity10 = new Intent(getActivity(), Murdercity.class);     
        			       		  startActivityForResult(newActivity10, 1);
        			       		  break; 
                         case 11: Intent newActivity11 = new Intent(getActivity(), Vivalagloria2.class);     
        			       		  startActivityForResult(newActivity11, 1);
        			       		  break;
                         case 12: Intent newActivity12 = new Intent(getActivity(), Restlessheart.class);     
        			       		  startActivityForResult(newActivity12, 1);
        			       		  break;
                         case 13: Intent newActivity13 = new Intent(getActivity(), Horseshoes.class);     
					       		  startActivityForResult(newActivity13, 1);
					       		  break;  		  
                         case 14: Intent newActivity14 = new Intent(getActivity(), Staticage.class);     
					       		  startActivityForResult(newActivity14, 1);
					       		  break;
                         case 15: Intent newActivity15 = new Intent(getActivity(), Guns.class);     
					       		  startActivityForResult(newActivity15, 1);
					       		  break;
                         case 16: Intent newActivity16 = new Intent(getActivity(), Americaneulogy.class);     
					       		  startActivityForResult(newActivity16, 1);
					       		  break;
                         case 17: Intent newActivity17 = new Intent(getActivity(), Seethelight.class);     
					       		  startActivityForResult(newActivity17, 1);
					       		  break;  		  
                      }
                	 }
                });
                return rootView;
            }
           
        }