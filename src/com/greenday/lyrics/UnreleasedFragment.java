package com.greenday.lyrics;

import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class UnreleasedFragment extends Fragment {
	
	public UnreleasedFragment(){}
    
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
  
        View rootView = inflater.inflate(R.layout.fragment_unreleased, container, false);
        
        ListView listview = (ListView) rootView.findViewById(R.id.listView1);

        //EDITED Code 
        String[] items = new String[] {"\t\t\t\t\tA Quick One While He's Away",
        		"\t\t\t\t\tAnother State Of Mind",
        		"\t\t\t\t\tBlitzkrieg Bop",
        		"\t\t\t\t\tBlack Sabbath (Iron Man)",
        		"\t\t\t\t\tBrown Eyed Girl",
        		"\t\t\t\t\tChocolate Rain",
        		"\t\t\t\t\tClosing Time",
        		"\t\t\t\t\tDon't Want To Know If You Are Lonely",
        		"\t\t\t\t\tEye Of The Tiger",
        		"\t\t\t\t\tGet Over It",
        		"\t\t\t\t\tHearts Collide",
        		"\t\t\t\t\tHighway To Hell",
        		"\t\t\t\t\tI Fought The Law",
        		"\t\t\t\t\tI Saw My Parents Kissing Santa Claus",
        		"\t\t\t\t\tJohnny Be Good",
        		"\t\t\t\t\tLife During Wartime",
        		"\t\t\t\t\tLights Out",
        		"\t\t\t\t\tLike A Rat Does Cheese",
        		"\t\t\t\t\tLike A Rolling Stone",
        		"\t\t\t\t\tMechanical Man",
        		"\t\t\t\t\tMinnesota Girl",
        		"\t\t\t\t\tNumb",
        		"\t\t\t\t\tShoplifter",
        		"\t\t\t\t\tShout",
        		"\t\t\t\t\tThat's All Right",
        		"\t\t\t\t\tThe Angel And The Jerk",
        		"\t\t\t\t\tThe Ballad Of Wilhelm Fink",
        		"\t\t\t\t\tThe Kids Are Alright",
        		"\t\t\t\t\tThe Saints Are Coming",
        		"\t\t\t\t\tThings I Heard Today",
        		"\t\t\t\t\tTired Of Waiting For You",
        		"\t\t\t\t\tToo Much Too Soon",
        		"\t\t\t\t\tWe Are The Champions",
        		"\t\t\t\t\tWhen It's Time",
        		"\t\t\t\t\tWhy Does It Always Rain On Me",
        		"\t\t\t\t\tWorking Class Hero"};
        ArrayAdapter<String> adapter =
        new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, items); 

         listview.setAdapter(adapter);  

         //To have custom list view use this : you must define CustomeAdapter class
         // listview.setadapter(new CustomeAdapter(getActivity()));
        //getActivty is used instead of Context
          
        return rootView;
    }

}
