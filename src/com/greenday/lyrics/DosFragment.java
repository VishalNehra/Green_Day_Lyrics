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
import com.greenday.uno.Angelblue;
import com.greenday.uno.Carpediem;
import com.greenday.uno.Fellforyou;
import com.greenday.uno.Killthedj;
import com.greenday.uno.Letyourselfgo;
import com.greenday.uno.Lossofcontrol;
import com.greenday.uno.Nuclearfamily;
import com.greenday.uno.Ohlove;
import com.greenday.uno.Rustyjames;
import com.greenday.uno.Staythenight;
import com.greenday.uno.Sweetsixt;
import com.greenday.uno.Troublemaker;

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

public class DosFragment extends Fragment {
	
	public DosFragment(){}
    
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
  
        View rootView = inflater.inflate(R.layout.fragment_dos, container, false);
		getActivity().getWindow().setBackgroundDrawableResource(R.drawable.dos_cover2);
        ImageButton b=(ImageButton) rootView.findViewById(R.id.imageButton1);
		b.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				@SuppressWarnings("unused")
				AlertDialog builder = new AlertDialog.Builder(getActivity())
		        .setMessage(Html.fromHtml("<b><u><font color='#524ef8'>Album</u></font></b><br>" +
		        		"<font color='#006500'>¡Dos! <i>(November 9, 2012)</font></i>" +
		        		"<font color='#00900e'><i><br>[My B'Day :D]</i></font><br><br>" +
		        		"<b><u><font color='#524ef8'>Length</font></u></b><br>" +
		        		"<font color='#006500'><i>39:21</font></i><br><br>" +
		        		"<b><u><font color='#524ef8'>Track List</font></u></b><br>" +
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

        //EDITED Code 
        String[] values = new String[] {"See You Tonight",
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
                         case 0:  Intent newActivity = new Intent(getActivity(), Cutonight.class);     
                         		  startActivityForResult(newActivity, 0);
                                  break;
                         case 1:  Intent newActivity1 = new Intent(getActivity(), Fucktime.class);     
                                  startActivityForResult(newActivity1, 1);
                                  break;
                         case 2:  Intent newActivity2 = new Intent(getActivity(), Stopredflash.class);     
        			              startActivityForResult(newActivity2, 1);
        			              break;
                         case 3:  Intent newActivity3 = new Intent(getActivity(), Lazybones.class);     
        	              		  startActivityForResult(newActivity3, 1);
        	              		  break;
                         case 4:  Intent newActivity4 = new Intent(getActivity(), Wildone.class);     
        		         		  startActivityForResult(newActivity4, 1);
        		         		  break;
                         case 5:  Intent newActivity5 = new Intent(getActivity(), Makeoutparty.class);     
        		        		  startActivityForResult(newActivity5, 1);
        		        		  break;
                         case 6:  Intent newActivity6 = new Intent(getActivity(), Strayheart.class);     
        			       		  startActivityForResult(newActivity6, 1);
        			       		  break;
                         case 7:  Intent newActivity7 = new Intent(getActivity(), Ashley.class);     
        			       		  startActivityForResult(newActivity7, 1);
        			       		  break;
                         case 8:  Intent newActivity8 = new Intent(getActivity(), Babyeyes.class);     
        			       		  startActivityForResult(newActivity8, 1);
        			       		  break;
                         case 9:  Intent newActivity9 = new Intent(getActivity(), Ladycobra.class);     
        			       		  startActivityForResult(newActivity9, 1);
        			       		  break; 
                         case 10: Intent newActivity10 = new Intent(getActivity(), Nightlife.class);     
        			       		  startActivityForResult(newActivity10, 1);
        			       		  break; 
                         case 11: Intent newActivity11 = new Intent(getActivity(), Wowthatsloud.class);     
        			       		  startActivityForResult(newActivity11, 1);
        			       		  break;
                         case 12: Intent newActivity12 = new Intent(getActivity(), Amy.class);     
					       		  startActivityForResult(newActivity12, 1);
					       		  break;  		  
                      }
                	 }
                });
                return rootView;
            }
           
        }