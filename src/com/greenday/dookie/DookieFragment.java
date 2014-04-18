package com.greenday.dookie;

import com.greenday.lyrics.R;
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
			//getActivity().getWindow().setBackgroundDrawableResource(R.drawable.dookie_cover2);
			
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
			        		getString(R.string.dookie_album_release) +
			        		getString(R.string.length) +
			        		"<font color='#006500'><i>39:38</font></i><br><br>" +
			        		getString(R.string.track_list) +
			        		"<font color='#006500'>1. All By Myself <i>(1:35)</i><br>" +
			        		"2. Burnout <i>(2:07)</i><br>" +
			        		"3. Having A Blast <i>(2:44)</i><br>" +
			        		"4. Chump <i>(2:54)</i><br>" +
			        		"5. Longview <i>(3:59)</i><br>" +
			        		"6. Welcome to Paradise <i>(3:44)</i><br>" +
			        		"7. Pulling Teeth <i>(2:31)</i><br>" +
			        		"8. Basket Case <i>(3:01)</i><br>" +
			        		"9. She <i>(2:14)</i><br>" +
			        		"10. Sassafras Roots <i>(2:37)</i><br>" +
			        		"11. When I Come Around <i>(2:58)</i><br>" +
			        		"12. Coming Clean <i>(1:34)</i><br>" +
			        		"13. Emenius Sleepus <i>(1:43)</i><br>" +
			        		"14. In The End <i>(1:46)</i><br>" +
			        		"15. F.O.D. <i>(5:46)</i></font>"))
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
	        String[] values = new String[] {"All By Myself",
	        		"Burnout",
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
	                         case 0:  //All By Myself
	                        	 Intent newActivity = new Intent(getActivity(), Dookie.class);     
				                 newActivity.putExtra("track", 1);
				                 startActivity(newActivity);
	                             break;
	                         case 1:  //Burnout
	                        	 Intent newActivity1 = new Intent(getActivity(), Dookie.class);     
				                 newActivity1.putExtra("track", 2);
				                 startActivity(newActivity1);
	                             break;
	                         case 2:  //Having A Blast
	                        	 Intent newActivity2 = new Intent(getActivity(), Dookie.class);     
				                 newActivity2.putExtra("track", 3);
				                 startActivity(newActivity2);
	        			         break;
	                         case 3:  //Chump
	                        	 Intent newActivity3 = new Intent(getActivity(), Dookie.class);     
				                 newActivity3.putExtra("track", 4);
				                 startActivity(newActivity3);
	        	              	 break;
	                         case 4:  //Longview
	                        	 Intent newActivity4 = new Intent(getActivity(), Dookie.class);   
	                        	 newActivity4.putExtra("track", 5);
				                 startActivity(newActivity4);
	        		         	 break;
	                         case 5:  //Welcome To Paradise
	                        	 Intent newActivity5 = new Intent(getActivity(), Dookie.class);     
				                 newActivity5.putExtra("track", 6);
				                 startActivity(newActivity5);
	        		        	 break;
	                         case 6:  //Pulling Teeth
	                        	 Intent newActivity6 = new Intent(getActivity(), Dookie.class);     
				                 newActivity6.putExtra("track", 7);
				                 startActivity(newActivity6);
	        			       	 break;
	                         case 7:  //Basket Case
	                        	 Intent newActivity7 = new Intent(getActivity(), Dookie.class);     
				                 newActivity7.putExtra("track", 8);
				                 startActivity(newActivity7);
	        			       	 break;
	                         case 8:  //She
	                        	 Intent newActivity8 = new Intent(getActivity(), Dookie.class);     
				                 newActivity8.putExtra("track", 9);
				                 startActivity(newActivity8);
	        			       	 break; 
	                         case 9:  //Sassafras Roots
	                        	 Intent newActivity9 = new Intent(getActivity(), Dookie.class);     
				                 newActivity9.putExtra("track", 10);
				                 startActivity(newActivity9);
	        			       	 break; 
	                         case 10: //When I Come Around
	                        	 Intent newActivity10 = new Intent(getActivity(), Dookie.class);     
				                 newActivity10.putExtra("track", 11);
				                 startActivity(newActivity10);
	        			       	 break;
	                         case 11: //Coming Clean
	                        	 Intent newActivity11 = new Intent(getActivity(), Dookie.class);     
				                 newActivity11.putExtra("track", 12);
				                 startActivity(newActivity11);
	        			       	 break;
	                         case 12: //Emenius Sleepus
	                        	 Intent newActivity12 = new Intent(getActivity(), Dookie.class);     
				                 newActivity12.putExtra("track", 13);
				                 startActivity(newActivity12);
	        			       	 break;
	                         case 13: //In The End
	                        	 Intent newActivity13 = new Intent(getActivity(), Dookie.class);     
				                 newActivity13.putExtra("track", 14);
				                 startActivity(newActivity13);
	        			       	 break;
	                         case 14: //F.O.D.
	                        	 Intent newActivity14 = new Intent(getActivity(), Dookie.class);     
				                 newActivity14.putExtra("track", 15);
				                 startActivity(newActivity14);
	        			       	 break;
	                         }
	                	 }
	                 });
	                 return rootView;
	    }   
}