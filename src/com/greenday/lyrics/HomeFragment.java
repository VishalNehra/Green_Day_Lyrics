package com.greenday.lyrics;
	
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
	 	
	public class HomeFragment extends Fragment {
	    public HomeFragment(){}
	    private View rootView;
	    
	    @Override
	    public View onCreateView(LayoutInflater inflater, ViewGroup container,
	            Bundle savedInstanceState) {
	  
	        rootView = inflater.inflate(R.layout.fragment_home, container, false);
	        
	        //Home theme
	        getPrefs();
	        
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
	        
	        ImageButton ib2 = (ImageButton) rootView.findViewById(R.id.imageButton2);
	        ib2.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					startActivity(new Intent(getActivity(), Favorites.class));
				}
			});
	        return rootView;
	    }
	    
	    public void onDestroy() {
	        super.onDestroy();
	      }	
	    
	    @Override
	    public void onResume() {
	    	// TODO Auto-generated method stub
	    	getPrefs();
	    	super.onResume();
	    }
	    
	    private void getPrefs() {
	    	//Home theme
	        RelativeLayout rl = (RelativeLayout) rootView.findViewById(R.id.fragment_home_layout);
	        int sp = PreferenceManager.getDefaultSharedPreferences(getActivity()).getInt("home_theme", 0);
	        if(sp==0) {
	        	//getActivity().getWindow().setBackgroundDrawableResource(R.drawable.home_cover);
	        	rl.setBackgroundResource(R.drawable.home_cover);
	        }
	        else if(sp==1) {
	        	//getActivity().getWindow().setBackgroundDrawableResource(R.drawable.home_cover2);
	        	rl.setBackgroundResource(R.drawable.home_cover2);
	        }
	        else if(sp==2) {
	        	//getActivity().getWindow().setBackgroundDrawableResource(R.drawable.home_cover3);
	        	rl.setBackgroundResource(R.drawable.home_cover3);
	        }
	    }
}