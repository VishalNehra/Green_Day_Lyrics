package com.greenday.lyrics;

import com.greenday.tcb.Americaneulogy;
import com.greenday.tcb.Eastjesus;
import com.greenday.tcb.Guns;
import com.greenday.tcb.Horseshoes;
import com.greenday.tcb.Inferno;
import com.greenday.tcb.Knowyourenemy;
import com.greenday.tcb.Lastamerican;
import com.greenday.tcb.Lastnight;
import com.greenday.tcb.Lobotomy;
import com.greenday.tcb.Murdercity;
import com.greenday.tcb.Peacemaker;
import com.greenday.tcb.Restlessheart;
import com.greenday.tcb.Seethelight;
import com.greenday.tcb.Songofcentuary;
import com.greenday.tcb.Staticage;
import com.greenday.tcb.Tcb;
import com.greenday.tcb.Vivalagloria;
import com.greenday.tcb.Vivalagloria2;

import android.os.Bundle;
import android.app.AlertDialog;
import android.app.Fragment;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.text.Html;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
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
		getActivity().getWindow().setBackgroundDrawableResource(R.drawable.tcb_cover2);
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
                		 Fragment fragment = null;
                		 switch(position)
                         {
                         case 0:  Intent newActivity = new Intent(getActivity(), Songofcentuary.class);     
                         		  startActivityForResult(newActivity, 0);
                                  break;
                         case 1:  Intent newActivity1 = new Intent(getActivity(), Tcb.class);     
                                  startActivityForResult(newActivity1, 1);
                                  break;
                         case 2:  Intent newActivity2 = new Intent(getActivity(), Knowyourenemy.class);     
        			              startActivityForResult(newActivity2, 1);
        			              break;
                         case 3:  Intent newActivity3 = new Intent(getActivity(), Vivalagloria.class);     
        	              		  startActivityForResult(newActivity3, 1);
        	              		  break;
                         case 4:  Intent newActivity4 = new Intent(getActivity(), Lobotomy.class);     
        		         		  startActivityForResult(newActivity4, 1);
        		         		  break;
                         case 5:  Intent newActivity5 = new Intent(getActivity(), Inferno.class);     
        		        		  startActivityForResult(newActivity5, 1);
        		        		  break;
                         case 6:  Intent newActivity6 = new Intent(getActivity(), Lastnight.class);     
        			       		  startActivityForResult(newActivity6, 1);
        			       		  break;
                         case 7:  Intent newActivity7 = new Intent(getActivity(), Eastjesus.class);     
        			       		  startActivityForResult(newActivity7, 1);
        			       		  break;
                         case 8:  Intent newActivity8 = new Intent(getActivity(), Peacemaker.class);     
        			       		  startActivityForResult(newActivity8, 1);
        			       		  break;
                         case 9:  Intent newActivity9 = new Intent(getActivity(), Lastamerican.class);     
        			       		  startActivityForResult(newActivity9, 1);
        			       		  break; 
                         case 10: Intent newActivity10 = new Intent(getActivity(), Murdercity.class);     
        			       		  startActivityForResult(newActivity10, 1);
        			       		  break; 
                         case 11: Intent newActivity11 = new Intent(getActivity(), Vivalagloria2.class);     
        			       		  startActivityForResult(newActivity11, 1);
        			       		  break;
                         case 12: Intent newActivity12 = new Intent(getActivity(), Restlessheart.class);     
        			       		  startActivityForResult(newActivity12, 1);
        			       		  break;
                         case 13: Intent newActivity13 = new Intent(getActivity(), Horseshoes.class);     
					       		  startActivityForResult(newActivity13, 1);
					       		  break;  		  
                         case 14: Intent newActivity14 = new Intent(getActivity(), Staticage.class);     
					       		  startActivityForResult(newActivity14, 1);
					       		  break;
                         case 15: Intent newActivity15 = new Intent(getActivity(), Guns.class);     
					       		  startActivityForResult(newActivity15, 1);
					       		  break;
                         case 16: Intent newActivity16 = new Intent(getActivity(), Americaneulogy.class);     
					       		  startActivityForResult(newActivity16, 1);
					       		  break;
                         case 17: Intent newActivity17 = new Intent(getActivity(), Seethelight.class);     
					       		  startActivityForResult(newActivity17, 1);
					       		  break;  		  
                      }
                	 }
                });
                return rootView;
            }
           
        }