package com.greenday.lyrics;

import com.greenday.tns.Atlibrary;
import com.greenday.tns.Coffeemaker;
import com.greenday.tns.Disappearingboy;
import com.greenday.tns.Dontleaveme;
import com.greenday.tns.Dryice;
import com.greenday.tns.Goingpasalacqua;
import com.greenday.tns.Greenday;
import com.greenday.tns.Iwasthere;
import com.greenday.tns.Judgedaughter;
import com.greenday.tns.Knowledge;
import com.greenday.tns.Oneiwant;
import com.greenday.tns.Onlyofyou;
import com.greenday.tns.Paperlanterns;
import com.greenday.tns.Rest;
import com.greenday.tns.Roadtoacceptance;
import com.greenday.tns.Sixteen;
import com.greenday.tns.Thousandhours;
import com.greenday.tns.Wantbealone;
import com.greenday.tns.Whyyouwanthim;

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

public class TnsFragment extends Fragment {
	
	public TnsFragment(){}
    
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
  
        View rootView = inflater.inflate(R.layout.fragment_tns, container, false);
		getActivity().getWindow().setBackgroundDrawableResource(R.drawable.tns_cover2);
        
		getActivity();
		//Boot_pref
        boolean firstboot = getActivity().getSharedPreferences("BOOT_PREF", Context.MODE_PRIVATE).getBoolean("firstboot_detail", true);

        if (firstboot){
		 
        	Crouton.makeText(getActivity(), "If you press on the album icon at corner right", Style.INFO).show();
        	Crouton.makeText(getActivity(), "You can see some details about the current album.", Style.INFO).show();
        	Crouton.makeText(getActivity(), "Similar feature is available for tracks too!", Style.CONFIRM).show();
        	
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
			        		getString(R.string.tns_album_release) +
			        		getString(R.string.length) +
			        		"<font color='#006500'><i>56:15</font></i><br><br>" +
			        		getString(R.string.track_list) +
			        		"<font color='#006500'>1. At the Library <i>(2:26)</i><br>" +
			        		"2. Don't Leave Me <i>(2:37)</i><br>" +
			        		"3. I Was There <i>(3:36)</i><br>" +
			        		"4. Disappearing Boy <i>(2:52)</i><br>" +
			        		"5. Green Day <i>(3:29)</i><br>" +
			        		"6. Going to Pasalacqua <i>(3:30)</i><br>" +
			        		"7. 16 <i>(3:24)</i><br>" +
			        		"8. Road to Acceptance <i>(3:35)</i><br>" +
			        		"9. Rest <i>(3:05)</i><br>" +
			        		"10. The Judge's Daughter <i>(2:34)</i><br>" +
			        		"11. Paper Lanterns <i>(2:23)</i><br>" +
			        		"12. Why Do You Want Him? <i>(2:31)</i><br>" +
			        		"13. 409 in Your Coffeemaker <i>(2:52)</i><br>" +
			        		"14. Knowledge <i>(2:19)</i><br>" +
			        		"15. 1,000 Hours <i>(2:25)</i><br>" +
			        		"16. Dry Ice <i>(3:45)</i><br>" +
			        		"17. Only of You <i>(2:47)</i><br>" +
			        		"18. The One I Want <i>(3:01)</i><br>" +
			        		"19. I Want to Be Alone <i>(3:09)</i></font>"))
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
        String[] values = new String[] {"At the Library",
        		"Don't Leave Me",
        		"I Was There",
        		"Disappearing Boy",
        		"Green Day",
        		"Going to Pasalacqua",
        		"16",
        		"Road to Acceptance",
        		"Rest",
        		"The Judge's Daughter",
        		"Paper Lanterns",
        		"Why Do You Want Him?",
        		"409 in Your Coffeemaker",
        		"Knowledge",
        		"1,000 Hours",
        		"Dry Ice",
        		"Only of You",
        		"The One I Want",
        		"I Want to Be Alone"};
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
                         case 0:  Intent newActivity = new Intent(getActivity(), Atlibrary.class);     
                         		  startActivityForResult(newActivity, 0);
                                  break;
                         case 1:  Intent newActivity1 = new Intent(getActivity(), Dontleaveme.class);     
                                  startActivityForResult(newActivity1, 1);
                                  break;
                         case 2:  Intent newActivity2 = new Intent(getActivity(), Iwasthere.class);     
        			              startActivityForResult(newActivity2, 1);
        			              break;
                         case 3:  Intent newActivity3 = new Intent(getActivity(), Disappearingboy.class);     
        	              		  startActivityForResult(newActivity3, 1);
        	              		  break;
                         case 4:  Intent newActivity4 = new Intent(getActivity(), Greenday.class);     
        		         		  startActivityForResult(newActivity4, 1);
        		         		  break;
                         case 5:  Intent newActivity5 = new Intent(getActivity(), Goingpasalacqua.class);     
        		        		  startActivityForResult(newActivity5, 1);
        		        		  break;
                         case 6:  Intent newActivity6 = new Intent(getActivity(), Sixteen.class);     
        			       		  startActivityForResult(newActivity6, 1);
        			       		  break;
                         case 7:  Intent newActivity7 = new Intent(getActivity(), Roadtoacceptance.class);     
        			       		  startActivityForResult(newActivity7, 1);
        			       		  break;
                         case 8:  Intent newActivity8 = new Intent(getActivity(), Rest.class);     
        			       		  startActivityForResult(newActivity8, 1);
        			       		  break;
                         case 9:  Intent newActivity9 = new Intent(getActivity(), Judgedaughter.class);     
        			       		  startActivityForResult(newActivity9, 1);
        			       		  break; 
                         case 10: Intent newActivity10 = new Intent(getActivity(), Paperlanterns.class);     
        			       		  startActivityForResult(newActivity10, 1);
        			       		  break; 
                         case 11: Intent newActivity11 = new Intent(getActivity(), Whyyouwanthim.class);     
        			       		  startActivityForResult(newActivity11, 1);
        			       		  break;
                         case 12: Intent newActivity12 = new Intent(getActivity(), Coffeemaker.class);     
        			       		  startActivityForResult(newActivity12, 1);
        			       		  break;
                         case 13: Intent newActivity13 = new Intent(getActivity(), Knowledge.class);     
					       		  startActivityForResult(newActivity13, 1);
					       		  break;
                         case 14: Intent newActivity14 = new Intent(getActivity(), Thousandhours.class);     
					       		  startActivityForResult(newActivity14, 1);
					       		  break;
                         case 15: Intent newActivity15 = new Intent(getActivity(), Dryice.class);     
					       		  startActivityForResult(newActivity15, 1);
					       		  break;
                         case 16: Intent newActivity16 = new Intent(getActivity(), Onlyofyou.class);     
					       		  startActivityForResult(newActivity16, 1);
					       		  break;
                         case 17: Intent newActivity17 = new Intent(getActivity(), Oneiwant.class);     
					       		  startActivityForResult(newActivity17, 1);
					       		  break;
                         case 18: Intent newActivity18 = new Intent(getActivity(), Wantbealone.class);     
					       		  startActivityForResult(newActivity18, 1);
					       		  break;
                  
                      }
                	 }
                });
                return rootView;
            }
           
        }