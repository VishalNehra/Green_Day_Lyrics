package com.greenday.lyrics;

import com.greenday.shenanigans.Desensitized;
import com.greenday.shenanigans.Dodada;
import com.greenday.shenanigans.Espionage;
import com.greenday.shenanigans.Fallinlove;
import com.greenday.shenanigans.Onwagon;
import com.greenday.shenanigans.Outsider;
import com.greenday.shenanigans.Rotting;
import com.greenday.shenanigans.Scumbag;
import com.greenday.shenanigans.Sickofme;
import com.greenday.shenanigans.Suffocate;
import com.greenday.shenanigans.Tiredofwaiting;
import com.greenday.shenanigans.WannabeonTV;
import com.greenday.shenanigans.Youlied;
import com.greenday.shenanigans.Yourdead;
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


public class ShenanigansFragment extends Fragment {
	
public ShenanigansFragment(){}
    
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
  
        View rootView = inflater.inflate(R.layout.fragment_shenanigans, container, false);
		getActivity().getWindow().setBackgroundDrawableResource(R.drawable.shenanigans_cover2);
        
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
		        		getString(R.string.shenanigans_album_release) +
		        		getString(R.string.length) +
		        		"<font color='#006500'><i>33:23</i></font><br><br>" +
		        		getString(R.string.track_list) +
		        		"<font color='#006500'>1. Suffocate <i>(2:54)</i><br>" +
		        		"2. Desensitized <i>(2:47)</i><br>" +
		        		"3. You Lied <i>(2:26)</i><br>" +
		        		"4. Outsider <i>(2:17)</i><br>" +
		        		"5. Don't Wanna Fall in Love <i>(1:38)</i><br>" +
		        		"6. Espionage <i>(3:23)</i><br>" +
		        		"7. I Want to Be on T.V. <i>(1:17)</i><br>" +
		        		"8. Scumbag <i>(1:46)</i><br>" +
		        		"9. Tired of Waiting for You <i>(2:34)</i><br>" +
		        		"10. Sick of Me <i>(2:07)</i><br>" +
		        		"11. Rotting <i>(2:52)</i><br>" +
		        		"12. Do Da Da <i>(1:30)</i><br>" +
		        		"13. On the Wagon <i>(2:48)</i><br>" +
		        		"14. Ha Ha You're Dead <i>(3:07)</i></font>"))
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
        String[] values = new String[] {"Suffocate",
        		"Desensitized",
        		"You Lied",
        		"Outsider",
        		"Don't Wanna Fall In Love",
        		"Espionage",
        		"I Want To Be On T.V.",
        		"Scumbag",
        		"Tired Of Waiting For You",
        		"Sick Of Me",
        		"Rotting",
        		"Do Da Da",
        		"On The Wagon",
        		"Ha Ha You're Dead"};
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
                         case 0:  Intent newActivity = new Intent(getActivity(), Suffocate.class);     
                         		  startActivityForResult(newActivity, 0);
                                  break;
                         case 1:  Intent newActivity1 = new Intent(getActivity(), Desensitized.class);     
                                  startActivityForResult(newActivity1, 1);
                                  break;
                         case 2:  Intent newActivity2 = new Intent(getActivity(), Youlied.class);     
        			              startActivityForResult(newActivity2, 1);
        			              break;
                         case 3:  Intent newActivity3 = new Intent(getActivity(), Outsider.class);     
        	              		  startActivityForResult(newActivity3, 1);
        	              		  break;
                         case 4:  Intent newActivity4 = new Intent(getActivity(), Fallinlove.class);     
        		         		  startActivityForResult(newActivity4, 1);
        		         		  break;
                         case 5:  Intent newActivity5 = new Intent(getActivity(), Espionage.class);     
        		        		  startActivityForResult(newActivity5, 1);
        		        		  break;
                         case 6:  Intent newActivity6 = new Intent(getActivity(), WannabeonTV.class);     
        			       		  startActivityForResult(newActivity6, 1);
        			       		  break;
                         case 7:  Intent newActivity7 = new Intent(getActivity(), Scumbag.class);     
        			       		  startActivityForResult(newActivity7, 1);
        			       		  break;
                         case 8:  Intent newActivity8 = new Intent(getActivity(), Tiredofwaiting.class);     
        			       		  startActivityForResult(newActivity8, 1);
        			       		  break;
                         case 9:  Intent newActivity9 = new Intent(getActivity(), Sickofme.class);     
        			       		  startActivityForResult(newActivity9, 1);
        			       		  break; 
                         case 10: Intent newActivity10 = new Intent(getActivity(), Rotting.class);     
        			       		  startActivityForResult(newActivity10, 1);
        			       		  break; 
                         case 11: Intent newActivity11 = new Intent(getActivity(), Dodada.class);     
        			       		  startActivityForResult(newActivity11, 1);
        			       		  break;
                         case 12: Intent newActivity12 = new Intent(getActivity(), Onwagon.class);     
        			       		  startActivityForResult(newActivity12, 1);
        			       		  break;
                         case 13: Intent newActivity13 = new Intent(getActivity(), Yourdead.class);     
					       		  startActivityForResult(newActivity13, 1);
					       		  break;  		  
                      }
                	 }
                });
                return rootView;
            }
           
        }
