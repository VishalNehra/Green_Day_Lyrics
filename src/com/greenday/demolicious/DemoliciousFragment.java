package com.greenday.demolicious;

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
	 
	public class DemoliciousFragment extends Fragment{
	    
	    @Override
	    public View onCreateView(LayoutInflater inflater, ViewGroup container,
	    		
	            Bundle savedInstanceState) {
	  
	        View rootView = inflater.inflate(R.layout.fragment_demolicious, container, false);
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
			        		getString(R.string.demolicious_album_release) +
			        		getString(R.string.length) +
			        		"<font color='#006500'><i>62:44</font></i><br><br>" +
			        		getString(R.string.track_list) +
			        		"<font color='#006500'>1. 99 Revolutions (Demo) <i>(4:06)</i><br>" +
			        		"2. Angel Blue (Demo) <i>(2:55)</i><br>" +
			        		"3. Carpe Diem (Demo) <i>(3:39)</i><br>" +
			        		"4. State of Shock <i>(2:28)</i><br>" +
			        		"5. Let Yourself Go (Demo) <i>(3:00)</i><br>" +
			        		"6. Sex, Drugs & Violence (Demo) <i>(3:25)</i><br>" +
			        		"7. Ashley (Demo) <i>(2:47)</i><br>" +
			        		"8. Fell for You (Demo) <i>(3:12)</i><br>" +
			        		"9. Stay the Night (Demo) <i>(4:40)</i><br>" +
			        		"10. Nuclear Family (Demo) <i>(3:03)</i><br>" +
			        		"11. Stray Heart (Demo) <i>(3:50)</i><br>" +
			        		"12. Rusty James (Demo) <i>(4:15)</i><br>" +
			        		"13. A Little Boy Named Train (Demo) <i>(3:57)</i><br>" +
			        		"14. Baby Eyes (Demo) <i>(2:15)</i><br>" +
			        		"15. Makeout Party (Demo) <i>(3:12)</i><br>" +
			        		"16. Oh Love (Demo) <i>(5:13)</i><br>" +
			        		"17. Missing You (Demo) <i>(3:41)</i><br>" +
			        		"18. Stay the Night (Acoustic) <i>(3:09)</i></font>"))
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
	        String[] values = new String[] {"99 Revolutions (Demo)",
	        		"Angel Blue (Demo)",
	        		"Carpe Diem (Demo)",
	        		"State of Shock",
	        		"Let Yourself Go (Demo)",
	        		"Sex, Drugs & Violence (Demo)",
	        		"Ashley (Demo)",
	        		"Fell for You (Demo)",
	        		"Stay the Night (Demo)",
	        		"Nuclear Family (Demo)",
	        		"Stray Heart (Demo)",
	        		"Rusty James (Demo)",
	        		"A Little Boy Named Train (Demo)",
	        		"Baby Eyes (Demo)",
	        		"Makeout Party (Demo)",
			        "Oh Love (Demo)",
			        "Missing You (Demo)",
	        		"Stay the Night (Acoustic)"};
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
	                         case 0:  //99 Revolutions (Demo)
	                        	 Intent newActivity = new Intent(getActivity(), Demolicious.class);     
				                 newActivity.putExtra("track", 1);
				                 startActivity(newActivity);
	                             break;
	                         case 1:  //Angel Blue (Demo)
	                        	 Intent newActivity1 = new Intent(getActivity(), Demolicious.class);     
				                 newActivity1.putExtra("track", 2);
				                 startActivity(newActivity1);
	                             break;
	                         case 2:  //Carpe Diem (Demo)
	                        	 Intent newActivity2 = new Intent(getActivity(), Demolicious.class);     
				                 newActivity2.putExtra("track", 3);
				                 startActivity(newActivity2);
	        			         break;
	                         case 3:  //State of Shock
	                        	 Intent newActivity3 = new Intent(getActivity(), Demolicious.class);     
				                 newActivity3.putExtra("track", 4);
				                 startActivity(newActivity3);
	        	              	 break;
	                         case 4:  //Let Yourself Go (Demo)
	                        	 Intent newActivity4 = new Intent(getActivity(), Demolicious.class);   
	                        	 newActivity4.putExtra("track", 5);
				                 startActivity(newActivity4);
	        		         	 break;
	                         case 5:  //Sex, Drugs & Violence (Demo)
	                        	 Intent newActivity5 = new Intent(getActivity(), Demolicious.class);     
				                 newActivity5.putExtra("track", 6);
				                 startActivity(newActivity5);
	        		        	 break;
	                         case 6:  //Ashley (Demo)
	                        	 Intent newActivity6 = new Intent(getActivity(), Demolicious.class);     
				                 newActivity6.putExtra("track", 7);
				                 startActivity(newActivity6);
	        			       	 break;
	                         case 7:  //Fell for You (Demo)
	                        	 Intent newActivity7 = new Intent(getActivity(), Demolicious.class);     
				                 newActivity7.putExtra("track", 8);
				                 startActivity(newActivity7);
	        			       	 break;
	                         case 8:  //Stay the Night (Demo)
	                        	 Intent newActivity8 = new Intent(getActivity(), Demolicious.class);     
				                 newActivity8.putExtra("track", 9);
				                 startActivity(newActivity8);
	        			       	 break; 
	                         case 9:  //Nuclear Family (Demo)
	                        	 Intent newActivity9 = new Intent(getActivity(), Demolicious.class);     
				                 newActivity9.putExtra("track", 10);
				                 startActivity(newActivity9);
	        			       	 break; 
	                         case 10: //Stray Heart (Demo)
	                        	 Intent newActivity10 = new Intent(getActivity(), Demolicious.class);     
				                 newActivity10.putExtra("track", 11);
				                 startActivity(newActivity10);
	        			       	 break;
	                         case 11: //Rusty James (Demo)
	                        	 Intent newActivity11 = new Intent(getActivity(), Demolicious.class);     
				                 newActivity11.putExtra("track", 12);
				                 startActivity(newActivity11);
	        			       	 break;
	                         case 12: //A Little Boy Named Train (Demo)
	                        	 Intent newActivity12 = new Intent(getActivity(), Demolicious.class);     
				                 newActivity12.putExtra("track", 13);
				                 startActivity(newActivity12);
	        			       	 break;
	                         case 13: //Baby Eyes (Demo)
	                        	 Intent newActivity13 = new Intent(getActivity(), Demolicious.class);     
				                 newActivity13.putExtra("track", 14);
				                 startActivity(newActivity13);
	        			       	 break;
	                         case 14: //Makeout Party (Demo)
	                        	 Intent newActivity14 = new Intent(getActivity(), Demolicious.class);     
				                 newActivity14.putExtra("track", 15);
				                 startActivity(newActivity14);
	        			       	 break;
	                         case 15: //Oh Love (Demo)
	                        	 Intent newActivity15 = new Intent(getActivity(), Demolicious.class);     
				                 newActivity15.putExtra("track", 16);
				                 startActivity(newActivity15);
	        			       	 break;
	                         case 16: //Missing You (Demo)
	                        	 Intent newActivity16 = new Intent(getActivity(), Demolicious.class);     
				                 newActivity16.putExtra("track", 17);
				                 startActivity(newActivity16);
	        			       	 break;
	                         case 17: //Stay the Night (acoustic)
	                        	 Intent newActivity17 = new Intent(getActivity(), Demolicious.class);     
				                 newActivity17.putExtra("track", 18);
				                 startActivity(newActivity17);
	        			       	 break;
	                         }
	                	 }
	                 });
	                 return rootView;
	    }   
}