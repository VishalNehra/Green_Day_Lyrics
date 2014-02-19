package com.greenday.lyrics;
	
	import de.keyboardsurfer.android.widget.crouton.Crouton;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageButton;
	 	
	public class HomeFragment extends Fragment {
	    public HomeFragment(){}
	    @Override
	    public View onCreateView(LayoutInflater inflater, ViewGroup container,
	            Bundle savedInstanceState) {
	  
	        View rootView = inflater.inflate(R.layout.fragment_home, container, false);
	        
	        //Now playing
	        ImageButton b=(ImageButton) rootView.findViewById(R.id.imageButton3);
	        b.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent intent = new Intent(getActivity(), Nowplaying.class);
					startActivity(intent);
				}
			});
	        
	        ImageButton ib = (ImageButton) rootView.findViewById(R.id.imageButton1);
	        ib.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent intent = new Intent(getActivity(), Allsongs.class);
					intent.putExtra("fix", true);
					startActivity(intent);
				}
			});
	        /*Recents
	         * ImageButton ib2 = (ImageButton) rootView.findViewById(R.id.imageButton2);
	         
	        ib2.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent intent = new Intent(getActivity(), Recents.class);
					startActivity(intent);				
					}
			});*/
	        return rootView;
	    }
	    
	    public void onDestroy() {
	        Crouton.clearCroutonsForActivity(getActivity());
	        super.onDestroy();
	      }
	    
	
}


