package com.greenday.shenanigans;

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

public class ShenanigansFragment extends Fragment {
	private View rootView;
    
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
  
        rootView = inflater.inflate(R.layout.fragment_shenanigans, container, false);
        
        //Loading Preferences
        getPref();
        
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
        
        String[] values = new String[] {
        		"Suffocate",
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
                 
                /*
                 * Adding individual onclicklistener commands below;  
                 */
                 
                 listview.setOnItemClickListener(new AdapterView.OnItemClickListener() 
                 { 
                	 public void onItemClick(AdapterView<?> p, View view, int position, long id)
                	 
                	 { 
                		 switch(position)
                         {
                         case 0:  //Suffocate
                        	 Intent newActivity = new Intent(getActivity(), Shenanigans.class);     
			                 newActivity.putExtra("track", 1);
			                 startActivity(newActivity);
                             break;
                         case 1:  //Desensitized
                        	 Intent newActivity1 = new Intent(getActivity(), Shenanigans.class);     
			                 newActivity1.putExtra("track", 2);
			                 startActivity(newActivity1);
                             break;
                         case 2:  //You Lied
                        	 Intent newActivity2 = new Intent(getActivity(), Shenanigans.class);     
			                 newActivity2.putExtra("track", 3);
			                 startActivity(newActivity2);
        			         break;
                         case 3:  //Outsider
                        	 Intent newActivity3 = new Intent(getActivity(), Shenanigans.class);     
			                 newActivity3.putExtra("track", 4);
			                 startActivity(newActivity3);
        	              	 break;
                         case 4:  //Don't Wanna Fall In Love
                        	 Intent newActivity4 = new Intent(getActivity(), Shenanigans.class);   
                        	 newActivity4.putExtra("track", 5);
			                 startActivity(newActivity4);
        		         	 break;
                         case 5:  //Espionage
                        	 Intent newActivity5 = new Intent(getActivity(), Shenanigans.class);     
			                 newActivity5.putExtra("track", 6);
			                 startActivity(newActivity5);
        		        	 break;
                         case 6:  //I Wanna Be On T.V.
                        	 Intent newActivity6 = new Intent(getActivity(), Shenanigans.class);     
			                 newActivity6.putExtra("track", 7);
			                 startActivity(newActivity6);
        			       	 break;
                         case 7:  //Scumbag
                        	 Intent newActivity7 = new Intent(getActivity(), Shenanigans.class);     
			                 newActivity7.putExtra("track", 8);
			                 startActivity(newActivity7);
        			       	 break;
                         case 8:  //Tired Of Waiting For You
                        	 Intent newActivity8 = new Intent(getActivity(), Shenanigans.class);     
			                 newActivity8.putExtra("track", 9);
			                 startActivity(newActivity8);
        			       	 break; 
                         case 9:  //Sick Of Me
                        	 Intent newActivity9 = new Intent(getActivity(), Shenanigans.class);     
			                 newActivity9.putExtra("track", 10);
			                 startActivity(newActivity9);
        			       	 break; 
                         case 10: //Rotting
                        	 Intent newActivity10 = new Intent(getActivity(), Shenanigans.class);     
			                 newActivity10.putExtra("track", 11);
			                 startActivity(newActivity10);
        			       	 break;
                         case 11: //Do Da Da
                        	 Intent newActivity11 = new Intent(getActivity(), Shenanigans.class);     
			                 newActivity11.putExtra("track", 12);
			                 startActivity(newActivity11);
        			       	 break;
                         case 12: //On The Wagon
                        	 Intent newActivity12 = new Intent(getActivity(), Shenanigans.class);     
			                 newActivity12.putExtra("track", 13);
			                 startActivity(newActivity12);
        			       	 break;
                         case 13: //Ha Ha You're Dead
                        	 Intent newActivity13 = new Intent(getActivity(), Shenanigans.class);     
			                 newActivity13.putExtra("track", 14);
			                 startActivity(newActivity13);
        			       	 break;  
                         }
                	 }
                 });
                 return rootView;
    }   
    
    @Override
    public void onResume() {
    	// TODO Auto-generated method stub
    	getPref();
    	super.onResume();
    }
    
    private void getPref() {

		//Boot_pref
        boolean firstboot = getActivity().getSharedPreferences("BOOT_PREF", Context.MODE_PRIVATE).getBoolean("firstboot_detail", true);

        if (firstboot){
		 
        	Crouton.makeText(getActivity(), "Press on the circular album art icon...", Style.INFO).show();
        	Crouton.makeText(getActivity(), "to see more info about the album.", Style.INFO).show();
        	Crouton.makeText(getActivity(), "Similar feature is available for the tracks too!", Style.CONFIRM).show();
        	
		getActivity().getSharedPreferences("BOOT_PREF", Context.MODE_PRIVATE)
         .edit()
         .putBoolean("firstboot_detail", false)
         .commit();
        }
		//Boot_pref ends

        //Background transparency
        int def_alpha = 70;
        int alpha = PreferenceManager.getDefaultSharedPreferences(getActivity()).getInt("alpha", def_alpha);
        rootView.findViewById(R.id.shenanigans_layout).getBackground().setAlpha(alpha);
    }
}