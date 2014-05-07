package com.greenday.tcb;

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

public class TcbFragment extends Fragment {
	
	public TcbFragment(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
  
        View rootView = inflater.inflate(R.layout.fragment_tcb, container, false);
		//getActivity().getWindow().setBackgroundDrawableResource(R.drawable.tcb_cover2);
		
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
		        		getString(R.string.tcb_album_release) +
		        		getString(R.string.length) +
		        		"<font color='#006500'><i>69:16</i></font><br><br>" +
		        		getString(R.string.track_list) +
		        		"<font color='#00900e'>1. Song of the Century <i>(0:57)</i></font><br><br>" +
		        		"<font color='#006500'><b>Act I: Heroes and Cons</b></font><br><br>" +
		        		"<font color='#00900e'>2. 21st Century Breakdown <i>(5:09)</i><br>" +
		        		"3. Know Your Enemy <i>(3:11)</i><br>" +
		        		"4. ¡Viva la Gloria! <i>(3:31)</i><br>" +
		        		"5. Before the Lobotomy <i>(4:37)</i><br>" +
		        		"6. Christian's Inferno <i>(3:07)</i><br>" +
		        		"7. Last Night on Earth <i>(3:57)</i><br><br></font>" +
		        		"<font color='#006500'><b>Act II: Charlatans and Saints</b></font><br><br>" +
		        		"<font color='#00900e'>8. East Jesus Nowhere <i>(4:35)</i><br>" +
		        		"9. Peacemaker <i>(3:24)</i><br>" +
		        		"10. Last of the American Girls <i>(3:51)</i><br>" +
		        		"11. Murder City <i>(2:54)</i><br>" +
		        		"12. ¿Viva la Gloria? (Little Girl) <i>(3:48)</i><br>" +
		        		"13. Restless Heart Syndrome <i>(4:21)</i><br><br></font>" +
		        		"<font color='#006500'><b>Act III: Horseshoes and Handgrenades</b></font><br><br>" +
		        		"<font color='#00900e'>14. Horseshoes and Handgrenades <i>(3:14)</i><br>" +
		        		"15. The Static Age <i>(4:17)</i><br>" +
		        		"16. 21 Guns <i>(5:21)</i><br>" +
		        		"17. American Eulogy <i>(4:26)</i><br>" +
		        		"18. See the Light <i>(4:36)</i></font>"))
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
                		 switch(position)
                         {
                         case 0:  //Song Of The Centuary
                        	 Intent newActivity = new Intent(getActivity(), TcbMain.class);     
			                 newActivity.putExtra("track", 1);
			                 startActivity(newActivity);
                             break;
                         case 1:  //21st Centuary Breakdown
                        	 Intent newActivity1 = new Intent(getActivity(), TcbMain.class);     
			                 newActivity1.putExtra("track", 2);
			                 startActivity(newActivity1);
                             break;
                         case 2:  //Know Your Enemy
                        	 Intent newActivity2 = new Intent(getActivity(), TcbMain.class);     
			                 newActivity2.putExtra("track", 3);
			                 startActivity(newActivity2);
        			         break;
                         case 3:  //¡Viva La Gloria!
                        	 Intent newActivity3 = new Intent(getActivity(), TcbMain.class);     
			                 newActivity3.putExtra("track", 4);
			                 startActivity(newActivity3);
        	              	 break;
                         case 4:  //Before The Lobotomy
                        	 Intent newActivity4 = new Intent(getActivity(), TcbMain.class);   
                        	 newActivity4.putExtra("track", 5);
			                 startActivity(newActivity4);
        		         	 break;
                         case 5:  //Christian's Inferno
                        	 Intent newActivity5 = new Intent(getActivity(), TcbMain.class);     
			                 newActivity5.putExtra("track", 6);
			                 startActivity(newActivity5);
        		        	 break;
                         case 6:  //Last Night On Earth
                        	 Intent newActivity6 = new Intent(getActivity(), TcbMain.class);     
			                 newActivity6.putExtra("track", 7);
			                 startActivity(newActivity6);
        			       	 break;
                         case 7:  //East Jesus Nowhere
                        	 Intent newActivity7 = new Intent(getActivity(), TcbMain.class);     
			                 newActivity7.putExtra("track", 8);
			                 startActivity(newActivity7);
        			       	 break;
                         case 8:  //Peacemaker
                        	 Intent newActivity8 = new Intent(getActivity(), TcbMain.class);     
			                 newActivity8.putExtra("track", 9);
			                 startActivity(newActivity8);
        			       	 break; 
                         case 9:  //Last Of American Girls
                        	 Intent newActivity9 = new Intent(getActivity(), TcbMain.class);     
			                 newActivity9.putExtra("track", 10);
			                 startActivity(newActivity9);
        			       	 break; 
                         case 10: //Murder City
                        	 Intent newActivity10 = new Intent(getActivity(), TcbMain.class);     
			                 newActivity10.putExtra("track", 11);
			                 startActivity(newActivity10);
        			       	 break;
                         case 11: //¿Viva La Gloria? (Little Girl)
                        	 Intent newActivity11 = new Intent(getActivity(), TcbMain.class);     
			                 newActivity11.putExtra("track", 12);
			                 startActivity(newActivity11);
        			       	 break;
                         case 12: //Restless Heart Syndrome
                        	 Intent newActivity12 = new Intent(getActivity(), TcbMain.class);     
			                 newActivity12.putExtra("track", 13);
			                 startActivity(newActivity12);
        			       	 break;
                         case 13: //Horseshoes And Handgranades
                        	 Intent newActivity13 = new Intent(getActivity(), TcbMain.class);     
			                 newActivity13.putExtra("track", 14);
			                 startActivity(newActivity13);
        			       	 break;
                         case 14: //The Static Age
                        	 Intent newActivity14 = new Intent(getActivity(), TcbMain.class);     
			                 newActivity14.putExtra("track", 15);
			                 startActivity(newActivity14);
        			       	 break;
                         case 15: //21 Guns
                        	 Intent newActivity15 = new Intent(getActivity(), TcbMain.class);     
			                 newActivity15.putExtra("track", 16);
			                 startActivity(newActivity15);
        			       	 break;
                         case 16: //American Eulogy
                        	 Intent newActivity16 = new Intent(getActivity(), TcbMain.class);     
			                 newActivity16.putExtra("track", 17);
			                 startActivity(newActivity16);
        			       	 break;
                         case 17: //See The Light
                        	 Intent newActivity17 = new Intent(getActivity(), TcbMain.class);     
			                 newActivity17.putExtra("track", 18);
			                 startActivity(newActivity17);
        			       	 break; 
                         }
                	 }
                 });
                 return rootView;
    }   
}