package com.greenday.insomniac;

import com.greenday.lyrics.R;
import de.keyboardsurfer.android.widget.crouton.Crouton;
import de.keyboardsurfer.android.widget.crouton.Style;

import android.os.Bundle;
import android.preference.PreferenceManager;
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

public class InsomniacFragment extends Fragment {
	
	public InsomniacFragment(){}
    
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
  
        View rootView = inflater.inflate(R.layout.fragment_insomniac, container, false);
		//getActivity().getWindow().setBackgroundDrawableResource(R.drawable.insomniac_cover2);
		
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

        //Background transparency
        int def_alpha = 70;
        int alpha = PreferenceManager.getDefaultSharedPreferences(getActivity()).getInt("alpha", def_alpha);
        rootView.findViewById(R.id.insomniac_layout).getBackground().setAlpha(alpha);
        
		ImageButton b=(ImageButton) rootView.findViewById(R.id.imageButton1);
		b.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				@SuppressWarnings("unused")
				AlertDialog builder = new AlertDialog.Builder(getActivity())
		        .setMessage(Html.fromHtml(getString(R.string.album) +
		        		getString(R.string.insomniac_album_release) +
		        		getString(R.string.length) +
		        		"<font color='#006500'><i>32:49</font></i><br><br>" +
		        		getString(R.string.track_list) +
		        		"<font color='#006500'>1. Armatage Shanks <i>(2:17)</i><br>" +
		        		"2. Brat <i>(1:43)</i><br>" +
		        		"3. Stuck with Me <i>(2:16)</i><br>" +
		        		"4. Geek Stink Breath <i>(2:15)</i><br>" +
		        		"5. No Pride <i>(2:19)</i><br>" +
		        		"6. Bab's Uvula Who? <i>(2:08)</i><br>" +
		        		"7. 86 <i>(2:47)</i><br>" +
		        		"8. Panic Song <i>(3:35)</i><br>" +
		        		"9. Stuart and the Ave. <i>(2:03)</i><br>" +
		        		"10. Brain Stew <i>(3:13)</i><br>" +
		        		"11. Jaded <i>(1:30)</i><br>" +
		        		"12. Westbound Sign <i>(2:12)</i><br>" +
		        		"13. Tight Wad Hill <i>(2:01)</i><br>" +
		        		"14. Walking Contradiction <i>(2:31)</i></font>"))
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
        String[] values = new String[] {"Armatage Shanks",
        		"Brat",
        		"Stuck With Me",
        		"Geek Stink Breath",
        		"No Pride",
        		"Bab's Uvula Who!",
        		"86",
        		"Panic Song",
        		"Stuart And The Ave.",
        		"Brain Stew",
        		"Jaded",
        		"Westbound Sign",
        		"Tight Wad Hill",
        		"Walking Contradiction"};
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
                         case 0:  //Armatage Shanks
                        	 Intent newActivity = new Intent(getActivity(), Insomniac.class);     
			                 newActivity.putExtra("track", 1);
			                 startActivity(newActivity);
                             break;
                         case 1:  //Brat
                        	 Intent newActivity1 = new Intent(getActivity(), Insomniac.class);     
			                 newActivity1.putExtra("track", 2);
			                 startActivity(newActivity1);
                             break;
                         case 2:  //Stuck With Me
                        	 Intent newActivity2 = new Intent(getActivity(), Insomniac.class);     
			                 newActivity2.putExtra("track", 3);
			                 startActivity(newActivity2);
        			         break;
                         case 3:  //Geek Stink Breath
                        	 Intent newActivity3 = new Intent(getActivity(), Insomniac.class);     
			                 newActivity3.putExtra("track", 4);
			                 startActivity(newActivity3);
        	              	 break;
                         case 4:  //No Pride
                        	 Intent newActivity4 = new Intent(getActivity(), Insomniac.class);   
                        	 newActivity4.putExtra("track", 5);
			                 startActivity(newActivity4);
        		         	 break;
                         case 5:  //Bab's Uvula Who!
                        	 Intent newActivity5 = new Intent(getActivity(), Insomniac.class);     
			                 newActivity5.putExtra("track", 6);
			                 startActivity(newActivity5);
        		        	 break;
                         case 6:  //86
                        	 Intent newActivity6 = new Intent(getActivity(), Insomniac.class);     
			                 newActivity6.putExtra("track", 7);
			                 startActivity(newActivity6);
        			       	 break;
                         case 7:  //Panic Song
                        	 Intent newActivity7 = new Intent(getActivity(), Insomniac.class);     
			                 newActivity7.putExtra("track", 8);
			                 startActivity(newActivity7);
        			       	 break;
                         case 8:  //Stuart And The Ave.
                        	 Intent newActivity8 = new Intent(getActivity(), Insomniac.class);     
			                 newActivity8.putExtra("track", 9);
			                 startActivity(newActivity8);
        			       	 break; 
                         case 9:  //Brain Stew
                        	 Intent newActivity9 = new Intent(getActivity(), Insomniac.class);     
			                 newActivity9.putExtra("track", 10);
			                 startActivity(newActivity9);
        			       	 break; 
                         case 10: //Jaded
                        	 Intent newActivity10 = new Intent(getActivity(), Insomniac.class);     
			                 newActivity10.putExtra("track", 11);
			                 startActivity(newActivity10);
        			       	 break;
                         case 11: //Westbound Sign
                        	 Intent newActivity11 = new Intent(getActivity(), Insomniac.class);     
			                 newActivity11.putExtra("track", 12);
			                 startActivity(newActivity11);
        			       	 break;
                         case 12: //Tight Wad Hill
                        	 Intent newActivity12 = new Intent(getActivity(), Insomniac.class);     
			                 newActivity12.putExtra("track", 13);
			                 startActivity(newActivity12);
        			       	 break;
                         case 13: //Walking Contradiction
                        	 Intent newActivity13 = new Intent(getActivity(), Insomniac.class);     
			                 newActivity13.putExtra("track", 14);
			                 startActivity(newActivity13);
        			       	 break;  
                  
                         }
                	 }
                 });
                 return rootView;
    }   
}