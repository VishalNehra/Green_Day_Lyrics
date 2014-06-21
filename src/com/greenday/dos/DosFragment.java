package com.greenday.dos;

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

public class DosFragment extends Fragment {
	private View rootView;
    
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
    	
        rootView = inflater.inflate(R.layout.fragment_dos, container, false);
        
		//Loading Preferences
        getPref();
        
        ImageButton b=(ImageButton) rootView.findViewById(R.id.imageButton1);
		b.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				@SuppressWarnings("unused")
				AlertDialog builder = new AlertDialog.Builder(getActivity())
		        .setMessage(Html.fromHtml(getString(R.string.album)+
		        		getString(R.string.dos_album_release) +
		        		"<font color='#00900e'><i>[My B'Day :D]</i></font><br><br>" +
		        		getString(R.string.length) +
		        		"<font color='#006500'><i>39:21</font></i><br><br>" +
		        		getString(R.string.track_list) +
		        		"<font color='#006500'>1. See You Tonight <i>(1:06)</i><br>" +
		        		"2. Fuck Time <i>(2:45)</i><br>" +
		        		"3. Stop When the Red Lights Flash <i>(2:26)</i><br>" +
		        		"4. Lazy Bones <i>(3:34)</i><br>" +
		        		"5. Wild One <i>(4:19)</i><br>" +
		        		"6. Makeout Party <i>(3:14)</i><br>" +
		        		"7. Stray Heart <i>(3:44)</i><br>" +
		        		"8. Ashley <i>(2:50)</i><br>" +
		        		"9. Baby Eyes <i>(2:22)</i><br>" +
		        		"10. Lady Cobra <i>(2:05)</i><br>" +
		        		"11. Nightlife <i>(3:04)</i><br>" +
		        		"12. Wow! That's Loud <i>(4:27)</i><br>" +
		        		"13. Amy <i>(3:25)</i></font>"))
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
        		"See You Tonight",
        		"Fuck Time",
        		"Stop When Red Lights Flash",
        		"Lazy Bones",
        		"Wild One",
        		"Makeout Party",
        		"Stray Heart",
        		"Ashley",
        		"Baby Eyes",
        		"Lady Cobra",
        		"Nightlife",
        		"WOW! That's Loud",
        		"Amy"};
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
                         case 0:  //See You Tonight
                        	 Intent newActivity = new Intent(getActivity(), Dos.class);     
			                 newActivity.putExtra("track", 1);
			                 startActivity(newActivity);
                             break;
                         case 1:  //Fuck Time
                        	 Intent newActivity1 = new Intent(getActivity(), Dos.class);     
			                 newActivity1.putExtra("track", 2);
			                 startActivity(newActivity1);
                             break;
                         case 2:  //Stop When Red Lights Flash
                        	 Intent newActivity2 = new Intent(getActivity(), Dos.class);     
			                 newActivity2.putExtra("track", 3);
			                 startActivity(newActivity2);
        			         break;
                         case 3:  //Lazy Bones
                        	 Intent newActivity3 = new Intent(getActivity(), Dos.class);     
			                 newActivity3.putExtra("track", 4);
			                 startActivity(newActivity3);
        	              	 break;
                         case 4:  //Wild One
                        	 Intent newActivity4 = new Intent(getActivity(), Dos.class);   
                        	 newActivity4.putExtra("track", 5);
			                 startActivity(newActivity4);
        		         	 break;
                         case 5:  //Makeout Party
                        	 Intent newActivity5 = new Intent(getActivity(), Dos.class);     
			                 newActivity5.putExtra("track", 6);
			                 startActivity(newActivity5);
        		        	 break;
                         case 6:  //Stray Heart
                        	 Intent newActivity6 = new Intent(getActivity(), Dos.class);     
			                 newActivity6.putExtra("track", 7);
			                 startActivity(newActivity6);
        			       	 break;
                         case 7:  //Ashley
                        	 Intent newActivity7 = new Intent(getActivity(), Dos.class);     
			                 newActivity7.putExtra("track", 8);
			                 startActivity(newActivity7);
        			       	 break;
                         case 8:  //Baby Eyes
                        	 Intent newActivity8 = new Intent(getActivity(), Dos.class);     
			                 newActivity8.putExtra("track", 9);
			                 startActivity(newActivity8);
        			       	 break; 
                         case 9:  //Lady Cobra
                        	 Intent newActivity9 = new Intent(getActivity(), Dos.class);     
			                 newActivity9.putExtra("track", 10);
			                 startActivity(newActivity9);
        			       	 break; 
                         case 10: //Nightlife
                        	 Intent newActivity10 = new Intent(getActivity(), Dos.class);     
			                 newActivity10.putExtra("track", 11);
			                 startActivity(newActivity10);
        			       	 break;
                         case 11: //Wow! That's Loud
                        	 Intent newActivity11 = new Intent(getActivity(), Dos.class);     
			                 newActivity11.putExtra("track", 12);
			                 startActivity(newActivity11);
        			       	 break;
                         case 12: //Amy
                        	 Intent newActivity12 = new Intent(getActivity(), Dos.class);     
			                 newActivity12.putExtra("track", 13);
			                 startActivity(newActivity12);
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
        rootView.findViewById(R.id.dos_layout).getBackground().setAlpha(alpha);
    }
}