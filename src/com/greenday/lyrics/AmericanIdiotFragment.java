package com.greenday.lyrics;

import com.greenday.americanidiot.Americanidiot;
import com.greenday.americanidiot.Arewethewaiting;
import com.greenday.americanidiot.Boulevardofbd;
import com.greenday.americanidiot.Extraordgirl;
import com.greenday.americanidiot.Givemenov;
import com.greenday.americanidiot.Holiday;
import com.greenday.americanidiot.Homecoming;
import com.greenday.americanidiot.Jesusofsuburb;
import com.greenday.americanidiot.Letterbomb;
import com.greenday.americanidiot.Shesarebel;
import com.greenday.americanidiot.Stjimmy;
import com.greenday.americanidiot.Wakemeup;
import com.greenday.americanidiot.Whatshername;

import android.os.Bundle;
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
import android.content.DialogInterface;
import android.content.Intent;

public class AmericanIdiotFragment extends Fragment{
	
	public AmericanIdiotFragment(){}
    
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_americanidiot, container, false);
        ImageButton b=(ImageButton) rootView.findViewById(R.id.imageButton1);
		b.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				@SuppressWarnings("unused")
				AlertDialog builder = new AlertDialog.Builder(getActivity())
		        .setMessage("Album:\n" +
		        		"American Idiot (September 20, 2004)\n\n" +
		        		"Length:\n" +
		        		"57:12\n\n" +
		        		"Track List:\n" +
		        		"1. American Idiot (2:54)\n" +
		        		"2. Jesus of Suburbia (9:08)\n" +
		        		    "\t\tI. Jesus of Suburbia\n" +
							"\t\tII. City of the Damned\n" +
							"\t\tIII. I Don't Care\n" +
							"\t\tIV. Dearly Beloved\n" +
							"\t\tV. Tales of Another Broken Home\n" +
		        		"3. Holiday (3:52)\n" +
		        		"4. Boulevard of Broken Dreams (4:20)\n" +
		        		"5. Are We the Waiting (2:42)\n" +
		        		"6. St. Jimmy (2:56)\n" +
		        		"7. Give Me Novacaine (3:25)\n" +
		        		"8. She's a Rebel (2:00)\n" +
		        		"9. Extraordinary Girl (3:33)\n" +
		        		"10. Letterbomb (4:05)\n" +
		        		"11. Wake Me Up When September Ends (4:45)\n" +
		        		"12. Homecoming (9:18)\n" +
			        		"\t\tI. The Death of St. Jimmy\n" +
							"\t\tII. East 12th St.\n" +
							"\t\tIII. Nobody Likes You (by Mike Dirnt)\n" +
							"\t\tIV. Rock and Roll Girlfriend (by Tré Cool)\n" +
							"\t\tV. We're Coming Home Again\n" +
		        		"13. Whatsername (4:14)\n")
		        .setNegativeButton("OK", new DialogInterface.OnClickListener() {
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
        		 Fragment fragment = null;
        		 switch(position)
                 {
                 case 0:  Intent newActivity = new Intent(getActivity(), Americanidiot.class);     
                 		  startActivityForResult(newActivity, 0);
                          break;
                 case 1:  Intent newActivity1 = new Intent(getActivity(), Jesusofsuburb.class);     
                          startActivityForResult(newActivity1, 1);
                          break;
                 case 2:  Intent newActivity2 = new Intent(getActivity(), Holiday.class);     
			              startActivityForResult(newActivity2, 1);
			              break;
                 case 3:  Intent newActivity3 = new Intent(getActivity(), Boulevardofbd.class);     
	              		  startActivityForResult(newActivity3, 1);
	              		  break;
                 case 4:  Intent newActivity4 = new Intent(getActivity(), Arewethewaiting.class);     
		         		  startActivityForResult(newActivity4, 1);
		         		  break;
                 case 5:  Intent newActivity5 = new Intent(getActivity(), Stjimmy.class);     
		        		  startActivityForResult(newActivity5, 1);
		        		  break;
                 case 6:  Intent newActivity6 = new Intent(getActivity(), Givemenov.class);     
			       		  startActivityForResult(newActivity6, 1);
			       		  break;
                 case 7:  Intent newActivity7 = new Intent(getActivity(), Shesarebel.class);     
			       		  startActivityForResult(newActivity7, 1);
			       		  break;
                 case 8:  Intent newActivity8 = new Intent(getActivity(), Extraordgirl.class);     
			       		  startActivityForResult(newActivity8, 1);
			       		  break;
                 case 9:  Intent newActivity9 = new Intent(getActivity(), Letterbomb.class);     
			       		  startActivityForResult(newActivity9, 1);
			       		  break; 
                 case 10: Intent newActivity10 = new Intent(getActivity(), Wakemeup.class);     
			       		  startActivityForResult(newActivity10, 1);
			       		  break; 
                 case 11: Intent newActivity11 = new Intent(getActivity(), Homecoming.class);     
			       		  startActivityForResult(newActivity11, 1);
			       		  break;
                 case 12: Intent newActivity12 = new Intent(getActivity(), Whatshername.class);     
			       		  startActivityForResult(newActivity12, 1);
			       		  break; 		  
          
              }
        	 }
        });
        return rootView;
    }
}