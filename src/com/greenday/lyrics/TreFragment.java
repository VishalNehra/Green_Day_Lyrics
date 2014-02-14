package com.greenday.lyrics;

import com.greenday.dos.Amy;
import com.greenday.dos.Ashley;
import com.greenday.dos.Babyeyes;
import com.greenday.dos.Cutonight;
import com.greenday.dos.Fucktime;
import com.greenday.dos.Ladycobra;
import com.greenday.dos.Lazybones;
import com.greenday.dos.Makeoutparty;
import com.greenday.dos.Nightlife;
import com.greenday.dos.Stopredflash;
import com.greenday.dos.Strayheart;
import com.greenday.dos.Wildone;
import com.greenday.dos.Wowthatsloud;
import com.greenday.tre.Amanda;
import com.greenday.tre.Avesrnde;
import com.greenday.tre.Brutallove;
import com.greenday.tre.Dirtybastards;
import com.greenday.tre.Dramaqueen;
import com.greenday.tre.Kid;
import com.greenday.tre.Littleboytrain;
import com.greenday.tre.Missingyou;
import com.greenday.tre.Ninetyninerev;
import com.greenday.tre.Sexdrugs;
import com.greenday.tre.Theforgotten;
import com.greenday.tre.Walkaway;

import android.os.Bundle;
import android.app.AlertDialog;
import android.app.Fragment;
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
	
	public TreFragment(){}
    
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
  
        View rootView = inflater.inflate(R.layout.fragment_tre, container, false);
		getActivity().getWindow().setBackgroundDrawableResource(R.drawable.tre_cover2);
		
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

        //EDITED Code 
        String[] values = new String[] {"Brutal Love",
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
                         case 0:  Intent newActivity = new Intent(getActivity(), Brutallove.class);     
                         		  startActivityForResult(newActivity, 0);
                                  break;
                         case 1:  Intent newActivity1 = new Intent(getActivity(), Missingyou.class);     
                                  startActivityForResult(newActivity1, 1);
                                  break;
                         case 2:  Intent newActivity2 = new Intent(getActivity(), Avesrnde.class);     
        			              startActivityForResult(newActivity2, 1);
        			              break;
                         case 3:  Intent newActivity3 = new Intent(getActivity(), Dramaqueen.class);     
        	              		  startActivityForResult(newActivity3, 1);
        	              		  break;
                         case 4:  Intent newActivity4 = new Intent(getActivity(), Kid.class);     
        		         		  startActivityForResult(newActivity4, 1);
        		         		  break;
                         case 5:  Intent newActivity5 = new Intent(getActivity(), Sexdrugs.class);     
        		        		  startActivityForResult(newActivity5, 1);
        		        		  break;
                         case 6:  Intent newActivity6 = new Intent(getActivity(), Littleboytrain.class);     
        			       		  startActivityForResult(newActivity6, 1);
        			       		  break;
                         case 7:  Intent newActivity7 = new Intent(getActivity(), Amanda.class);     
        			       		  startActivityForResult(newActivity7, 1);
        			       		  break;
                         case 8:  Intent newActivity8 = new Intent(getActivity(), Walkaway.class);     
        			       		  startActivityForResult(newActivity8, 1);
        			       		  break;
                         case 9:  Intent newActivity9 = new Intent(getActivity(), Dirtybastards.class);     
        			       		  startActivityForResult(newActivity9, 1);
        			       		  break; 
                         case 10: Intent newActivity10 = new Intent(getActivity(), Ninetyninerev.class);     
        			       		  startActivityForResult(newActivity10, 1);
        			       		  break; 
                         case 11: Intent newActivity11 = new Intent(getActivity(), Theforgotten.class);     
        			       		  startActivityForResult(newActivity11, 1);
        			       		  break; 		  
                      }
                	 }
                });
                return rootView;
            }
           
        }