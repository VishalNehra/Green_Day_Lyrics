package com.greenday.uno;

import com.greenday.lyrics.R;
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

public class UnoFragment extends Fragment {
	
	public UnoFragment(){}
    
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
  
        View rootView = inflater.inflate(R.layout.fragment_uno, container, false);
		//getActivity().getWindow().setBackgroundDrawableResource(R.drawable.uno_cover2);
        
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
		        		getString(R.string.uno_album_release) +
		        		getString(R.string.length) +
		        		"<font color='#006500'><i>41:44</font></i><br><br>" +
		        		getString(R.string.track_list) +
		        		"<font color='#006500'>1. Nuclear Family <i>(3:03)</i><br>" +
		        		"2. Stay the Night <i>(4:36)</i><br>" +
		        		"3. Carpe Diem <i>(3:25)</i><br>" +
		        		"4. Let Yourself Go <i>(2:57)</i><br>" +
		        		"5. Kill the DJ <i>(3:41)</i><br>" +
		        		"6. Fell for You <i>(3:08)</i><br>" +
		        		"7. Loss of Control <i>(3:07)</i><br>" +
		        		"8. Troublemaker <i>(2:45)</i><br>" +
		        		"9. Angel Blue <i>(2:46)</i><br>" +
		        		"10. Sweet 16 <i>(3:03)</i><br>" +
		        		"11. Rusty James <i>(4:09)</i><br>" +
		        		"12. Oh Love <i>(5:03)</i>"))
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
        String[] values = new String[] {"Nuclear Family",
        		"Stay The Night",
        		"Carpe Diem",
        		"Let Yourself Go",
        		"Kill The DJ",
        		"Fell For You",
        		"Loss Of Control",
        		"Troublemaker",
        		"Angel Blue",
        		"Sweet 16",
        		"Rusty James",
        		"Oh Love"};
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
                         case 0:  //Nuclear Family
                        	 Intent newActivity = new Intent(getActivity(), Uno.class);     
			                 newActivity.putExtra("track", 1);
			                 startActivityForResult(newActivity, 0);
                             break;
                         case 1:  //Stay The Night
                        	 Intent newActivity1 = new Intent(getActivity(), Uno.class);     
			                 newActivity1.putExtra("track", 2);
			                 startActivityForResult(newActivity1, 1);
                             break;
                         case 2:  //Carpe Diem
                        	 Intent newActivity2 = new Intent(getActivity(), Uno.class);     
			                 newActivity2.putExtra("track", 3);
			                 startActivityForResult(newActivity2, 1);
        			         break;
                         case 3:  //Let Yourself Go
                        	 Intent newActivity3 = new Intent(getActivity(), Uno.class);     
			                 newActivity3.putExtra("track", 4);
			                 startActivityForResult(newActivity3, 1);
        	              	 break;
                         case 4:  //Kill The DJ
                        	 Intent newActivity4 = new Intent(getActivity(), Uno.class);   
                        	 newActivity4.putExtra("track", 5);
			                 startActivityForResult(newActivity4, 1);
        		         	 break;
                         case 5:  //Fell For You
                        	 Intent newActivity5 = new Intent(getActivity(), Uno.class);     
			                 newActivity5.putExtra("track", 6);
			                 startActivityForResult(newActivity5, 1);
        		        	 break;
                         case 6:  //Loss Of Control
                        	 Intent newActivity6 = new Intent(getActivity(), Uno.class);     
			                 newActivity6.putExtra("track", 7);
			                 startActivityForResult(newActivity6, 1);
        			       	 break;
                         case 7:  //Troublemaker
                        	 Intent newActivity7 = new Intent(getActivity(), Uno.class);     
			                 newActivity7.putExtra("track", 8);
			                 startActivityForResult(newActivity7, 1);
        			       	 break;
                         case 8:  //Angel Blue
                        	 Intent newActivity8 = new Intent(getActivity(), Uno.class);     
			                 newActivity8.putExtra("track", 9);
			                 startActivityForResult(newActivity8, 1);
        			       	 break; 
                         case 9:  //Sweet 16
                        	 Intent newActivity9 = new Intent(getActivity(), Uno.class);     
			                 newActivity9.putExtra("track", 10);
			                 startActivityForResult(newActivity9, 1);
        			       	 break; 
                         case 10: //Rusty James
                        	 Intent newActivity10 = new Intent(getActivity(), Uno.class);     
			                 newActivity10.putExtra("track", 11);
			                 startActivityForResult(newActivity10, 1);
        			       	 break;
                         case 11: //Oh Love
                        	 Intent newActivity11 = new Intent(getActivity(), Uno.class);     
			                 newActivity11.putExtra("track", 12);
			                 startActivityForResult(newActivity11, 1);
        			       	 break;
                         }
                	 }
                });
                return rootView;
            }
           
        }