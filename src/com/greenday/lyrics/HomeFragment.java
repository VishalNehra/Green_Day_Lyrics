package com.greenday.lyrics;
	
	import de.keyboardsurfer.android.widget.crouton.Crouton;
import de.keyboardsurfer.android.widget.crouton.Style;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;
	 	
	public class HomeFragment extends Fragment {
	    public HomeFragment(){}
	    @Override
	    public View onCreateView(LayoutInflater inflater, ViewGroup container,
	            Bundle savedInstanceState) {
	  
	        View rootView = inflater.inflate(R.layout.fragment_home, container, false);
	        
	        //Testings
	        Button b=(Button) rootView.findViewById(R.id.button1);
	        b.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent intent = new Intent(getActivity(), Nowplaying.class);
					startActivity(intent);
				}
			});
	        
	        
	        ImageButton image = (ImageButton) rootView.findViewById(R.id.imageView1);
	        image.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Crouton.makeText(getActivity(), "Stop Poking Me!!", Style.ALERT).show();
					Crouton.makeText(getActivity(), "Writer names are in the respective song's lyrics.", Style.INFO).show();
				}
			});
	        ImageButton ib = (ImageButton) rootView.findViewById(R.id.imageButton1);
	        ib.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					startActivity(new Intent(arg0.getContext(),Allsongs.class));
				}
			});
	        ImageButton ib2 = (ImageButton) rootView.findViewById(R.id.imageButton2);
	        ib2.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Crouton.makeText(getActivity(), "Feature yet to be implemented.", Style.INFO).show();				}
			});
	        return rootView;
	    }
	    
	    public void onDestroy() {
	        Crouton.clearCroutonsForActivity(getActivity());
	        super.onDestroy();
	      }
	    
	
}


