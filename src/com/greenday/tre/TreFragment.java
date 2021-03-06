package com.greenday.tre;

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

public class TreFragment extends Fragment {
	private View rootView;
    
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
  
        rootView = inflater.inflate(R.layout.fragment_tre, container, false);
        
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
		        		getString(R.string.tre_album_release) +
		        		getString(R.string.length) +
		        		"<font color='#006500'><i>46:35</font></i><br><br>" +
		        		getString(R.string.track_list) +
		        		"<font color='#006500'>1. Brutal Love <i>(4:54)</i><br>" +
		        		"2. Missing You <i>(3:43)</i><br>" +
		        		"3. 8th Avenue Serenade <i>(2:36)</i><br>" +
		        		"4. Drama Queen <i>(3:07)</i><br>" +
		        		"5. X-Kid <i>(3:41)</i><br>" +
		        		"6. Sex, Drugs & Violence <i>(3:31)</i><br>" +
		        		"7. A Little Boy Named Train <i>(3:37)</i><br>" +
		        		"8. Amanda <i>(2:28)</i><br>" +
		        		"9. Walk Away <i>(3:45)</i><br>" +
		        		"10. Dirty Rotten Bastards <i>(6:26)</i><br>" +
		        		"11. 99 Revolutions <i>(3:49)</i><br>" +
		        		"12. The Forgotten <i>(4:59)</i><br>"))
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
        		"Brutal Love",
        		"Missing You",
        		"8th Avenue Serenade",
        		"Drama Queen",
        		"X-Kid",
        		"Sex, Drugs & Violence",
        		"Little Boy Named Train",
        		"Amanda",
        		"Walk Away",
        		"Dirty Rotten Bastards",
        		"99 Revolutions",
        		"The Forgotten"};
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
                         case 0:  //Brutal Love
                        	 Intent newActivity = new Intent(getActivity(), Tre.class);     
			                 newActivity.putExtra("track", 1);
			                 startActivity(newActivity);
                             break;
                         case 1:  //Missing You
                        	 Intent newActivity1 = new Intent(getActivity(), Tre.class);     
			                 newActivity1.putExtra("track", 2);
			                 startActivity(newActivity1);
                             break;
                         case 2:  //8th Avenue Serenade
                        	 Intent newActivity2 = new Intent(getActivity(), Tre.class);     
			                 newActivity2.putExtra("track", 3);
			                 startActivity(newActivity2);
        			         break;
                         case 3:  //Drama Queen
                        	 Intent newActivity3 = new Intent(getActivity(), Tre.class);     
			                 newActivity3.putExtra("track", 4);
			                 startActivity(newActivity3);
        	              	 break;
                         case 4:  //X-Kid
                        	 Intent newActivity4 = new Intent(getActivity(), Tre.class);   
                        	 newActivity4.putExtra("track", 5);
			                 startActivity(newActivity4);
        		         	 break;
                         case 5:  //Sex, Drugs & Violence
                        	 Intent newActivity5 = new Intent(getActivity(), Tre.class);     
			                 newActivity5.putExtra("track", 6);
			                 startActivity(newActivity5);
        		        	 break;
                         case 6:  //Little Boy Named Train
                        	 Intent newActivity6 = new Intent(getActivity(), Tre.class);     
			                 newActivity6.putExtra("track", 7);
			                 startActivity(newActivity6);
        			       	 break;
                         case 7:  //Amanda
                        	 Intent newActivity7 = new Intent(getActivity(), Tre.class);     
			                 newActivity7.putExtra("track", 8);
			                 startActivity(newActivity7);
        			       	 break;
                         case 8:  //Walk Away
                        	 Intent newActivity8 = new Intent(getActivity(), Tre.class);     
			                 newActivity8.putExtra("track", 9);
			                 startActivity(newActivity8);
        			       	 break; 
                         case 9:  //Dirty Rotten Bastards
                        	 Intent newActivity9 = new Intent(getActivity(), Tre.class);     
			                 newActivity9.putExtra("track", 10);
			                 startActivity(newActivity9);
        			       	 break; 
                         case 10: //99 Revolutions
                        	 Intent newActivity10 = new Intent(getActivity(), Tre.class);     
			                 newActivity10.putExtra("track", 11);
			                 startActivity(newActivity10);
        			       	 break;
                         case 11: //The Forgotten
                        	 Intent newActivity11 = new Intent(getActivity(), Tre.class);     
			                 newActivity11.putExtra("track", 12);
			                 startActivity(newActivity11);
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
        rootView.findViewById(R.id.tre_layout).getBackground().setAlpha(alpha);
    }
}