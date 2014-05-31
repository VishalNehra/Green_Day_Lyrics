package com.greenday.lyrics;
	
	import com.greenday.database.DatabaseActivity;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
	 	
	public class HomeFragment extends Fragment {
	    public HomeFragment(){}
	    
	    @Override
	    public View onCreateView(LayoutInflater inflater, ViewGroup container,
	            Bundle savedInstanceState) {
	  
	        View rootView = inflater.inflate(R.layout.fragment_home, container, false);
	        
	        ImageButton ib = (ImageButton) rootView.findViewById(R.id.imageButton1);
	        ib.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent intent = new Intent(getActivity(), Allsongs.class);
					//intent.putExtra("fix", true);
					startActivity(intent);
				}
			});
	        
	        Button b = (Button) rootView.findViewById(R.id.button1);
	        b.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					startActivity(new Intent(getActivity(), DatabaseActivity.class));
				}
			});
	        return rootView;
	    }
	    
	    public void onDestroy() {
	        super.onDestroy();
	      }	
}