package com.greenday.americanidiot;

import com.greenday.lyrics.R;
import de.keyboardsurfer.android.widget.crouton.Crouton;
import de.keyboardsurfer.android.widget.crouton.Style;

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
import android.app.AlertDialog;
import android.app.Fragment;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;

public class AmericanIdiotFragment extends Fragment{
	
	public AmericanIdiotFragment(){}
    
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_americanidiot, container, false);
		//getActivity().getWindow().setBackgroundDrawableResource(R.drawable.americanidiot_cover2);
		
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
		        		getString(R.string.americanidiot_album_release) +
		        		getString(R.string.length) +
		        		"<font color='#006500'><i>57:12</font></i><br><br>" +
		        		getString(R.string.track_list) +
		        		"<font color='#006500'>1. American Idiot <i>(2:54)</i><br>" +
		        		"2. Jesus of Suburbia <i>(9:08)</font></i><br>" +
		        		    "\t\t<font color='#00900e'><i>I. Jesus of Suburbia<br>" +
							"\t\tII. City of the Damned<br>" +
							"\t\tIII. I Don't Care<br>" +
							"\t\tIV. Dearly Beloved<br>" +
							"\t\tV. Tales of Another Broken Home</font></i><br>" +
		        		"<font color='#006500'>3. Holiday <i>(3:52)</i><br>" +
		        		"4. Boulevard of Broken Dreams <i>(4:20)</i><br>" +
		        		"5. Are We the Waiting <i>(2:42)</i><br>" +
		        		"6. St. Jimmy <i>(2:56)</i><br>" +
		        		"7. Give Me Novacaine <i>(3:25)</i><br>" +
		        		"8. She's a Rebel <i>(2:00)</i><br>" +
		        		"9. Extraordinary Girl <i>(3:33)</i><br>" +
		        		"10. Letterbomb <i>(4:05)</i><br>" +
		        		"11. Wake Me Up When September Ends <i>(4:45)</i><br>" +
		        		"12. Homecoming <i>(9:18)</font></i><br>" +
			        		"\t\t<font color='#00900e'><i>I. The Death of St. Jimmy<br>" +
							"\t\tII. East 12th St.<br>" +
							"\t\tIII. Nobody Likes You (by Mike Dirnt)<br>" +
							"\t\tIV. Rock and Roll Girlfriend (by Tré Cool)<br>" +
							"\t\tV. We're Coming Home Again</font></i><br>" +
		        		"<font color='#006500'>13. Whatsername <i>(4:14)</i><br></font>"))
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
        
        String[] values = new String[] {"American Idiot",
        		"Jesus Of Suburbia",
        		"Holiday",
        		"Boulevard of Broken Dreams",
        		"Are We The Waiting",
        		"St. Jimmy",
        		"Give Me Novacaine",
        		"She's A Rebel",
        		"Extraordinary Girl",
        		"Letterbomb",
        		"Wake Me Up When September Ends",
        		"Homecoming",
        		"Whatsername"};
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
                 case 0:  //American Idiot
                	 Intent newActivity = new Intent(getActivity(), AmericanIdiotMain.class);     
	                 newActivity.putExtra("track", 1);
	                 startActivity(newActivity);
                     break;
                 case 1:  //Jesus Of Suburbia
                	 Intent newActivity1 = new Intent(getActivity(), AmericanIdiotMain.class);     
	                 newActivity1.putExtra("track", 2);
	                 startActivity(newActivity1);
                     break;
                 case 2:  //Holiday
                	 Intent newActivity2 = new Intent(getActivity(), AmericanIdiotMain.class);     
	                 newActivity2.putExtra("track", 3);
	                 startActivity(newActivity2);
			         break;
                 case 3:  //Boulevard of Broken Dreams
                	 Intent newActivity3 = new Intent(getActivity(), AmericanIdiotMain.class);     
	                 newActivity3.putExtra("track", 4);
	                 startActivity(newActivity3);
	              	 break;
                 case 4:  //Are We The Waiting
                	 Intent newActivity4 = new Intent(getActivity(), AmericanIdiotMain.class);   
                	 newActivity4.putExtra("track", 5);
	                 startActivity(newActivity4);
		         	 break;
                 case 5:  //St. Jimmy
                	 Intent newActivity5 = new Intent(getActivity(), AmericanIdiotMain.class);     
	                 newActivity5.putExtra("track", 6);
	                 startActivity(newActivity5);
		        	 break;
                 case 6:  //Give Me Novacaine
                	 Intent newActivity6 = new Intent(getActivity(), AmericanIdiotMain.class);     
	                 newActivity6.putExtra("track", 7);
	                 startActivity(newActivity6);
			       	 break;
                 case 7:  //She's A Rebel
                	 Intent newActivity7 = new Intent(getActivity(), AmericanIdiotMain.class);     
	                 newActivity7.putExtra("track", 8);
	                 startActivity(newActivity7);
			       	 break;
                 case 8:  //Extraordinary Girl
                	 Intent newActivity8 = new Intent(getActivity(), AmericanIdiotMain.class);     
	                 newActivity8.putExtra("track", 9);
	                 startActivity(newActivity8);
			       	 break; 
                 case 9:  //Letterbomb
                	 Intent newActivity9 = new Intent(getActivity(), AmericanIdiotMain.class);     
	                 newActivity9.putExtra("track", 10);
	                 startActivity(newActivity9);
			       	 break; 
                 case 10: //Wake Me Up When September Ends
                	 Intent newActivity10 = new Intent(getActivity(), AmericanIdiotMain.class);     
	                 newActivity10.putExtra("track", 11);
	                 startActivity(newActivity10);
			       	 break;
                 case 11: //Homecoming
                	 Intent newActivity11 = new Intent(getActivity(), AmericanIdiotMain.class);     
	                 newActivity11.putExtra("track", 12);
	                 startActivity(newActivity11);
			       	 break;
                 case 12: //Whatshername
                	 Intent newActivity12 = new Intent(getActivity(), AmericanIdiotMain.class);     
	                 newActivity12.putExtra("track", 13);
	                 startActivity(newActivity12);
			       	 break; 
                 }
        	 }
         });
         return rootView;
    }   
}