package com.greenday.unreleased;

import com.greenday.lyrics.Allsongs;
import com.greenday.lyrics.R;
import com.greenday.lyrics.ReportSong;
import com.greenday.lyrics.Settings;
import com.greenday.lyrics.Util;
import de.keyboardsurfer.android.widget.crouton.Crouton;
import de.keyboardsurfer.android.widget.crouton.Style;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class Unreleased extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		//Set theme must be used before super.oncreate or any other layout declaration
		Util.setAppTheme(this);
				
		super.onCreate(savedInstanceState);
		setContentView(R.layout.unreleased);
		
		TextView tv1 = (TextView)findViewById(R.id.textView1);
		int track = getIntent().getExtras().getInt("track");
		if(track == 1){
			ActionBar ab=getActionBar();
			ab.setTitle("A Quick One While He's Away");
			tv1.setText(R.string.quickone);
		}
		if(track == 2){
			ActionBar ab=getActionBar();
			ab.setTitle("Angel and the Jerk");
			tv1.setText(R.string.angelandjerk);
		}
		if(track == 3){
			ActionBar ab=getActionBar();
			ab.setTitle("Another State Of Mind");
			tv1.setText(R.string.cigarettes);
		}
		if(track == 4){
			ActionBar ab=getActionBar();
			ab.setTitle("Billie Joe's Mom");
			tv1.setText(R.string.billiesmom);
		}
		if(track == 5){
			ActionBar ab=getActionBar();
			ab.setTitle("Boys in the Bathroom Stall");
			tv1.setText(R.string.boysinstall);
		}
		if(track == 6){
			ActionBar ab=getActionBar();
			ab.setTitle("Can't Make Love");
			tv1.setText(R.string.cantmakelove);
		}
		if(track == 7){
			ActionBar ab=getActionBar();
			ab.setTitle("Chocolate Rain");
			tv1.setText(R.string.chocolaterain);
		}
		if(track == 8){
			ActionBar ab=getActionBar();
			ab.setTitle("Cigarettes And Valentines");
			ab.setSubtitle("21st Centuary Breakdown");
			tv1.setText(R.string.cigarettes);
		}
		if(track == 9){
			ActionBar ab=getActionBar();
			ab.setTitle("D.U.I.");
			tv1.setText(R.string.dui);
		}
		if(track == 10){
			ActionBar ab=getActionBar();
			ab.setTitle("Depression Times");
			tv1.setText(R.string.depressiontimes);
		}
		if(track == 11){
			ActionBar ab=getActionBar();
			ab.setTitle("Don't Want to Know If You Are Lonely");
			tv1.setText(R.string.dontwannaknow);
		}
		if(track == 12){
			ActionBar ab=getActionBar();
			ab.setTitle("Dream Catcher");
			tv1.setText(R.string.dreamcatcher);
		}
		if(track == 13){
			ActionBar ab=getActionBar();
			ab.setTitle("Favourite Son");
			ab.setSubtitle("American Idiot");
			tv1.setText(R.string.favouriteson);
		}
		if(track == 14){
			ActionBar ab=getActionBar();
			ab.setTitle("Food Around the Corner");
			tv1.setText(R.string.foodaround);
		}
		if(track == 15){
			ActionBar ab=getActionBar();
			ab.setTitle("Governator");
			tv1.setText(R.string.governator);
		}
		if(track == 16){
			ActionBar ab=getActionBar();
			ab.setTitle("Hearts Collide");
			tv1.setText(R.string.heartscollide);
		}
		if(track == 17){
			ActionBar ab=getActionBar();
			ab.setTitle("Hybrid Moments");
			tv1.setText(R.string.hybridmoments);
		}
		if(track == 18){
			ActionBar ab=getActionBar();
			ab.setTitle("I Fought The Law");
			tv1.setText(R.string.foughtlaw);
		}
		if(track == 19){
			ActionBar ab=getActionBar();
			ab.setTitle("I Run NY");
			tv1.setText(R.string.irunny);
		}
		if(track == 20){
			ActionBar ab=getActionBar();
			ab.setTitle("Jennifer");
			tv1.setText(R.string.jennifer);
		}
		if(track == 21){
			ActionBar ab=getActionBar();
			ab.setTitle("Lights Out");
			ab.setSubtitle("21st Centuary Breakdown");
			tv1.setText(R.string.lightsout);
		}
		if(track == 22){
			ActionBar ab=getActionBar();
			ab.setTitle("Like A Rolling Stone");
			tv1.setText(R.string.likeastone);
		}
		if(track == 23){
			ActionBar ab=getActionBar();
			ab.setTitle("Like a Rat Does Cheese");
			tv1.setText(R.string.likearat);
		}
		if(track == 24){
			ActionBar ab=getActionBar();
			ab.setTitle("Look For Love");
			tv1.setText(R.string.lookforlove);
		}
		if(track == 25){
			ActionBar ab=getActionBar();
			ab.setTitle("Maybe Forever");
			tv1.setText(R.string.maybeforever);
		}
		if(track == 26){
			ActionBar ab=getActionBar();
			ab.setTitle("Mechanical Man");
			tv1.setText(R.string.mechanicalman);
		}
		if(track == 27){
			ActionBar ab=getActionBar();
			ab.setTitle("Midwest Medley");
			tv1.setText(R.string.midwestmedley);
		}
		if(track == 28){
			ActionBar ab=getActionBar();
			ab.setTitle("Minnesota Girl");
			tv1.setText(R.string.minnesotagirl);
		}
		if(track == 29){
			ActionBar ab=getActionBar();
			ab.setTitle("Oh Girl");
			tv1.setText(R.string.ohgirl);
		}
		if(track == 30){
			ActionBar ab=getActionBar();
			ab.setTitle("Olivia");
			tv1.setText(R.string.olivia);
		}
		if(track == 31){
			ActionBar ab=getActionBar();
			ab.setTitle("Private Hell");
			tv1.setText(R.string.privatehell);
		}
		if(track == 32){
			ActionBar ab=getActionBar();
			ab.setTitle("Radio");
			tv1.setText(R.string.radio);
		}
		if(track == 33){
			ActionBar ab=getActionBar();
			ab.setTitle("Second Time Around");
			tv1.setText(R.string.secondtime);
		}
		if(track == 34){
			ActionBar ab=getActionBar();
			ab.setTitle("Shoplifter");
			tv1.setText(R.string.shoplifter);
		}
		if(track == 35){
			ActionBar ab=getActionBar();
			ab.setTitle("Shout");
			tv1.setText(R.string.shout);
		}
		if(track == 36){
			ActionBar ab=getActionBar();
			ab.setTitle("State of Shock");
			tv1.setText(R.string.stateofshock);
		}
		if(track == 37){
			ActionBar ab=getActionBar();
			ab.setTitle("Supermarket");
			tv1.setText(R.string.supermarket);
		}
		if(track == 38){
			ActionBar ab=getActionBar();
			ab.setTitle("Teenage Lobotomy");
			tv1.setText(R.string.teenage);
		}
		if(track == 39){
			ActionBar ab=getActionBar();
			ab.setTitle("That's All Right");
			tv1.setText(R.string.thatsallright);
		}
		if(track == 40){
			ActionBar ab=getActionBar();
			ab.setTitle("The Ballad of Wilhelm Fink");
			tv1.setText(R.string.ballad);
		}
		if(track == 41){
			ActionBar ab=getActionBar();
			ab.setTitle("The Saints Are Coming");
			tv1.setText(R.string.saintsarecoming);
		}
		if(track == 42){
			ActionBar ab=getActionBar();
			ab.setTitle("The Simpsons Theme");
			tv1.setText(R.string.simpsons);
		}
		if(track == 43){
			ActionBar ab=getActionBar();
			ab.setTitle("The Things I Heard Today");
			tv1.setText(R.string.thingsheard);
		}
		if(track == 44){
			ActionBar ab=getActionBar();
			ab.setTitle("Too Much, Too Soon");
			tv1.setText(R.string.toomuch);
		}
		if(track == 45){
			ActionBar ab=getActionBar();
			ab.setTitle("Walking the Dog");
			tv1.setText(R.string.walkingdog);
		}
		if(track == 46){
			ActionBar ab=getActionBar();
			ab.setTitle("We Are The Champions");
			tv1.setText(R.string.wearechampions);
		}
		if(track == 47){
			ActionBar ab=getActionBar();
			ab.setTitle("What About Today?");
			tv1.setText(R.string.whattoday);
		}
		if(track == 48){
			ActionBar ab=getActionBar();
			ab.setTitle("When It's Time");
			tv1.setText(R.string.whenitstime);
		}
		if(track == 49){
			ActionBar ab=getActionBar();
			ab.setTitle("When Will I Be Loved");
			tv1.setText(R.string.whenwillloved);
		}
		if(track == 50){
			ActionBar ab=getActionBar();
			ab.setTitle("Why Does It Always Rain on Me?");
			tv1.setText(R.string.whydoesitrain);
		}
		if(track == 51){
			ActionBar ab=getActionBar();
			ab.setTitle("Working Class Hero");
			tv1.setText(R.string.workingclasshero);
		}
		if(track == 52){
			ActionBar ab=getActionBar();
			ab.setTitle("World Vs. World");
			tv1.setText(R.string.worldvsworld);
		}
		if(track == 53){
			ActionBar ab=getActionBar();
			ab.setTitle("You Can't Fool Me");
			tv1.setText(R.string.youcantfool);
		}
		
		getActionBar().setDisplayHomeAsUpEnabled(true);
		
		//Display
		boolean display = PreferenceManager.getDefaultSharedPreferences(this).getBoolean("display", false);
		if(display)
		{
			tv1.setKeepScreenOn(true);
		}
	}
	
	//Action bar code below
	
	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_song, menu);
        return true;
    }
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {

		case android.R.id.home:
			onBackPressed();
			break;

		default:

		};
		if(item.getItemId()==R.id.settings)
		{
			startActivity(new Intent(getApplicationContext(), Settings.class));
		}
		if(item.getItemId()==R.id.reportsong)
		{
			int track = getIntent().getExtras().getInt("track");
			if(track == 1){
				Intent intent = new Intent(this, ReportSong.class);
				intent.putExtra("report_sub", "A Quick One While He's Away");
				startActivity(intent);
				}
			if(track == 2){
				Intent intent = new Intent(this, ReportSong.class);
				intent.putExtra("report_sub", "Angel and the Jerk");
				startActivity(intent);
				}
			if(track == 3){
				Intent intent = new Intent(this, ReportSong.class);
				intent.putExtra("report_sub", "Another State Of Mind");
				startActivity(intent);
				}
			if(track == 4){
				Intent intent = new Intent(this, ReportSong.class);
				intent.putExtra("report_sub", "Billie Joe's Mom");
				startActivity(intent);
				}
			if(track == 5){
				Intent intent = new Intent(this, ReportSong.class);
				intent.putExtra("report_sub", "Boys in the Bathroom Stall");
				startActivity(intent);
				}
			if(track == 6){
				Intent intent = new Intent(this, ReportSong.class);
				intent.putExtra("report_sub", "Can't Make Love");
				startActivity(intent);
				}
			if(track == 7){
				Intent intent = new Intent(this, ReportSong.class);
				intent.putExtra("report_sub", "Chocolate Rain");
				startActivity(intent);
				}
			if(track == 8){
				Intent intent = new Intent(this, ReportSong.class);
				intent.putExtra("report_sub", "Cigarettes And Valentines");
				startActivity(intent);
				}
			if(track == 9){
				Intent intent = new Intent(this, ReportSong.class);
				intent.putExtra("report_sub", "D.U.I.");
				startActivity(intent);
				}
			if(track == 10){
				Intent intent = new Intent(this, ReportSong.class);
				intent.putExtra("report_sub", "Depression Times");
				startActivity(intent);
				}
			if(track == 11){
				Intent intent = new Intent(this, ReportSong.class);
				intent.putExtra("report_sub", "Don't Want to Know If You Are Lonely");
				startActivity(intent);
				}
			if(track == 12){
				Intent intent = new Intent(this, ReportSong.class);
				intent.putExtra("report_sub", "Dream Catcher");
				startActivity(intent);
				}
			if(track == 13){
				Intent intent = new Intent(this, ReportSong.class);
				intent.putExtra("report_sub", "Favourite Son");
				startActivity(intent);
				}
			if(track == 14){
				Intent intent = new Intent(this, ReportSong.class);
				intent.putExtra("report_sub", "Food Around the Corner");
				startActivity(intent);
				}
			if(track == 15){
				Intent intent = new Intent(this, ReportSong.class);
				intent.putExtra("report_sub", "Governator");
				startActivity(intent);
				}
			if(track == 16){
				Intent intent = new Intent(this, ReportSong.class);
				intent.putExtra("report_sub", "Hearts Collide");
				startActivity(intent);
				}
			if(track == 17){
				Intent intent = new Intent(this, ReportSong.class);
				intent.putExtra("report_sub", "Hybrid Moments");
				startActivity(intent);
			}
			if(track == 18){
				Intent intent = new Intent(this, ReportSong.class);
				intent.putExtra("report_sub", "I Fought The Law");
				startActivity(intent);
			}
			if(track == 19){
				Intent intent = new Intent(this, ReportSong.class);
				intent.putExtra("report_sub", "I Run NY");
				startActivity(intent);
				}
			if(track == 20){
				Intent intent = new Intent(this, ReportSong.class);
				intent.putExtra("report_sub", "Jennifer");
				startActivity(intent);
				}
			if(track == 21){
				Intent intent = new Intent(this, ReportSong.class);
				intent.putExtra("report_sub", "Lights Out");
				startActivity(intent);
				}
			if(track == 22){
				Intent intent = new Intent(this, ReportSong.class);
				intent.putExtra("report_sub", "Like A Rolling Stone");
				startActivity(intent);
				}
			if(track == 23){
				Intent intent = new Intent(this, ReportSong.class);
				intent.putExtra("report_sub", "Like a Rat Does Cheese");
				startActivity(intent);
				}
			if(track == 24){
				Intent intent = new Intent(this, ReportSong.class);
				intent.putExtra("report_sub", "Look For Love");
				startActivity(intent);
				}
			if(track == 25){
				Intent intent = new Intent(this, ReportSong.class);
				intent.putExtra("report_sub", "Maybe Forever");
				startActivity(intent);
				}
			if(track == 26){
				Intent intent = new Intent(this, ReportSong.class);
				intent.putExtra("report_sub", "Mechanical Man");
				startActivity(intent);
				}
			if(track == 27){
				Intent intent = new Intent(this, ReportSong.class);
				intent.putExtra("report_sub", "Midwest Medley");
				startActivity(intent);
				}
			if(track == 28){
				Intent intent = new Intent(this, ReportSong.class);
				intent.putExtra("report_sub", "Minnesota Girl");
				startActivity(intent);
				}
			if(track == 29){
				Intent intent = new Intent(this, ReportSong.class);
				intent.putExtra("report_sub", "Oh Girl");
				startActivity(intent);
				}
			if(track == 30){
				Intent intent = new Intent(this, ReportSong.class);
				intent.putExtra("report_sub", "Olivia");
				startActivity(intent);
				}
			if(track == 31){
				Intent intent = new Intent(this, ReportSong.class);
				intent.putExtra("report_sub", "Private Hell");
				startActivity(intent);
				}
			if(track == 32){
				Intent intent = new Intent(this, ReportSong.class);
				intent.putExtra("report_sub", "Radio");
				startActivity(intent);
				}
			if(track == 33){
				Intent intent = new Intent(this, ReportSong.class);
				intent.putExtra("report_sub", "Second Time Around");
				startActivity(intent);
				}
			if(track == 34){
				Intent intent = new Intent(this, ReportSong.class);
				intent.putExtra("report_sub", "Shoplifter");
				startActivity(intent);
				}
			if(track == 35){
				Intent intent = new Intent(this, ReportSong.class);
				intent.putExtra("report_sub", "Shout");
				startActivity(intent);
			}
			if(track == 36){
				Intent intent = new Intent(this, ReportSong.class);
				intent.putExtra("report_sub", "State of Shock");
				startActivity(intent);
			}
			if(track == 37){
				Intent intent = new Intent(this, ReportSong.class);
				intent.putExtra("report_sub", "Supermarket");
				startActivity(intent);
				}
			if(track == 38){
				Intent intent = new Intent(this, ReportSong.class);
				intent.putExtra("report_sub", "Teenage Lobotomy");
				startActivity(intent);
				}
			if(track == 39){
				Intent intent = new Intent(this, ReportSong.class);
				intent.putExtra("report_sub", "That's All Right");
				startActivity(intent);
				}
			if(track == 40){
				Intent intent = new Intent(this, ReportSong.class);
				intent.putExtra("report_sub", "The Ballad of Wilhelm Fink");
				startActivity(intent);
				}
			if(track == 41){
				Intent intent = new Intent(this, ReportSong.class);
				intent.putExtra("report_sub", "The Saints Are Coming");
				startActivity(intent);
				}
			if(track == 42){
				Intent intent = new Intent(this, ReportSong.class);
				intent.putExtra("report_sub", "The Simpsons Theme");
				startActivity(intent);
				}
			if(track == 43){
				Intent intent = new Intent(this, ReportSong.class);
				intent.putExtra("report_sub", "The Things I Heard Today");
				startActivity(intent);
				}
			if(track == 44){
				Intent intent = new Intent(this, ReportSong.class);
				intent.putExtra("report_sub", "Too Much, Too Soon");
				startActivity(intent);
				}
			if(track == 45){
				Intent intent = new Intent(this, ReportSong.class);
				intent.putExtra("report_sub", "Walking the Dog");
				startActivity(intent);
				}
			if(track == 46){
				Intent intent = new Intent(this, ReportSong.class);
				intent.putExtra("report_sub", "We Are The Champions");
				startActivity(intent);
				}
			if(track == 47){
				Intent intent = new Intent(this, ReportSong.class);
				intent.putExtra("report_sub", "What About Today?");
				startActivity(intent);
				}
			if(track == 48){
				Intent intent = new Intent(this, ReportSong.class);
				intent.putExtra("report_sub", "When It's Time");
				startActivity(intent);
				}
			if(track == 49){
				Intent intent = new Intent(this, ReportSong.class);
				intent.putExtra("report_sub", "When Will I Be Loved");
				startActivity(intent);
				}
			if(track == 50){
				Intent intent = new Intent(this, ReportSong.class);
				intent.putExtra("report_sub", "Why Does It Always Rain on Me?");
				startActivity(intent);
				}
			if(track == 51){
				Intent intent = new Intent(this, ReportSong.class);
				intent.putExtra("report_sub", "Working Class Hero");
				startActivity(intent);
				}
			if(track == 52){
				Intent intent = new Intent(this, ReportSong.class);
				intent.putExtra("report_sub", "World Vs. World");
				startActivity(intent);
			}
			if(track == 53){
				Intent intent = new Intent(this, ReportSong.class);
				intent.putExtra("report_sub", "You Can't Fool Me");
				startActivity(intent);
			}
		}
		if(item.getItemId()==R.id.action_search)
		{
			// Search action | Add as new task
			Intent intent = new Intent(this, Allsongs.class);
			intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP); 
			intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
			intent.putExtra("Search", true);
			startActivity(intent);
			return true;
		}
		if(item.getItemId()==R.id.action_label)
		{
			int track = getIntent().getExtras().getInt("track");
			if(track == 18){
				Info.info17(this);
			}
			else{
				Crouton.makeText(this, "Info. not available ATM", Style.ALERT).show();
			}
		}
	            return super.onOptionsItemSelected(item);
	}
}
