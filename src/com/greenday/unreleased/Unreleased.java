package com.greenday.unreleased;

import com.fourmob.poppyview.PoppyViewHelper;
import com.fourmob.poppyview.PoppyViewHelper.PoppyViewPosition;
import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.analytics.HitBuilders;
import com.google.android.gms.analytics.Tracker;
import com.greenday.database.DBHandler;
import com.greenday.database.Track;
import com.greenday.lyrics.Allsongs;
import com.greenday.lyrics.Favorites;
import com.greenday.lyrics.Frontend;
import com.greenday.lyrics.R;
import com.greenday.lyrics.ReportSong;
import com.greenday.lyrics.Settings;
import com.greenday.lyrics.Frontend.TrackerName;
import com.greenday.unreleased.Info;

import de.keyboardsurfer.android.widget.crouton.Crouton;
import de.keyboardsurfer.android.widget.crouton.Style;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.ImageButton;
import android.widget.TextView;

public class Unreleased extends Activity {
	private PoppyViewHelper mPoppyViewHelper;
	private Tracker t;
	private View poppyview;
	private TextView tv1;
	private ActionBar ab;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.unreleased);
		
        ab =getActionBar();
		tv1 = (TextView)findViewById(R.id.textView1);
		
		//Poppyview 
		mPoppyViewHelper=new PoppyViewHelper(this, PoppyViewPosition.BOTTOM);
		poppyview = mPoppyViewHelper.createPoppyViewOnScrollView(R.id.scrollView, R.layout.poppyview);
				
        //Loading Preferences
        getPref();
		
		//Google Analytics
		((Frontend) getApplication()).getTracker(Frontend.TrackerName.APP_TRACKER);
		t = ((Frontend) this.getApplication()).getTracker(
	            TrackerName.APP_TRACKER);
		
		//PoppyView
		ImageButton search = (ImageButton) poppyview.findViewById(R.id.imageButton1);
		search.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				// Search action | Add as new task
				Intent intent = new Intent(Unreleased.this, Allsongs.class);
				intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP); 
				intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
				intent.putExtra("Search", true);
				startActivity(intent);
			}
		});
		ImageButton report = (ImageButton) poppyview.findViewById(R.id.imageButton2);
		report.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				int track = getIntent().getExtras().getInt("track");
				Intent intent = new Intent(Unreleased.this, ReportSong.class);
				if(track == 1){
					intent.putExtra("report_sub", "A Quick One While He's Away");
					startActivity(intent);
					}
				if(track == 2){
					intent.putExtra("report_sub", "Angel and the Jerk");
					startActivity(intent);
					}
				if(track == 3){
					intent.putExtra("report_sub", "Another State Of Mind");
					startActivity(intent);
					}
				if(track == 4){
					intent.putExtra("report_sub", "Billie Joe's Mom");
					startActivity(intent);
					}
				if(track == 5){
					intent.putExtra("report_sub", "Boys in the Bathroom Stall");
					startActivity(intent);
					}
				if(track == 6){
					intent.putExtra("report_sub", "Can't Make Love");
					startActivity(intent);
					}
				if(track == 7){
					intent.putExtra("report_sub", "Chocolate Rain");
					startActivity(intent);
					}
				if(track == 8){
					intent.putExtra("report_sub", "Cigarettes And Valentines");
					startActivity(intent);
					}
				if(track == 9){
					intent.putExtra("report_sub", "D.U.I.");
					startActivity(intent);
					}
				if(track == 10){
					intent.putExtra("report_sub", "Depression Times");
					startActivity(intent);
					}
				if(track == 11){
					intent.putExtra("report_sub", "Don't Want to Know If You Are Lonely");
					startActivity(intent);
					}
				if(track == 12){
					intent.putExtra("report_sub", "Dream Catcher");
					startActivity(intent);
					}
				if(track == 13){
					intent.putExtra("report_sub", "Favourite Son");
					startActivity(intent);
					}
				if(track == 14){
					intent.putExtra("report_sub", "Food Around the Corner");
					startActivity(intent);
					}
				if(track == 15){
					intent.putExtra("report_sub", "Governator");
					startActivity(intent);
					}
				if(track == 16){
					intent.putExtra("report_sub", "Hearts Collide");
					startActivity(intent);
					}
				if(track == 17){
					intent.putExtra("report_sub", "Hybrid Moments");
					startActivity(intent);
				}
				if(track == 18){
					intent.putExtra("report_sub", "I Fought The Law");
					startActivity(intent);
				}
				if(track == 19){
					intent.putExtra("report_sub", "I Run NY");
					startActivity(intent);
					}
				if(track == 20){
					intent.putExtra("report_sub", "Jennifer");
					startActivity(intent);
					}
				if(track == 21){
					intent.putExtra("report_sub", "Lights Out");
					startActivity(intent);
					}
				if(track == 22){
					intent.putExtra("report_sub", "Like A Rolling Stone");
					startActivity(intent);
					}
				if(track == 23){
					intent.putExtra("report_sub", "Like a Rat Does Cheese");
					startActivity(intent);
					}
				if(track == 24){
					intent.putExtra("report_sub", "Look For Love");
					startActivity(intent);
					}
				if(track == 25){
					intent.putExtra("report_sub", "Maybe Forever");
					startActivity(intent);
					}
				if(track == 26){
					intent.putExtra("report_sub", "Mechanical Man");
					startActivity(intent);
					}
				if(track == 27){
					intent.putExtra("report_sub", "Midwest Medley");
					startActivity(intent);
					}
				if(track == 28){
					intent.putExtra("report_sub", "Minnesota Girl");
					startActivity(intent);
					}
				if(track == 29){
					intent.putExtra("report_sub", "Oh Girl");
					startActivity(intent);
					}
				if(track == 30){
					intent.putExtra("report_sub", "Olivia");
					startActivity(intent);
					}
				if(track == 31){
					intent.putExtra("report_sub", "Private Hell");
					startActivity(intent);
					}
				if(track == 32){
					intent.putExtra("report_sub", "Radio");
					startActivity(intent);
					}
				if(track == 33){
					intent.putExtra("report_sub", "Second Time Around");
					startActivity(intent);
					}
				if(track == 34){
					intent.putExtra("report_sub", "Shoplifter");
					startActivity(intent);
					}
				if(track == 35){
					intent.putExtra("report_sub", "Shout");
					startActivity(intent);
				}
				if(track == 36){
					intent.putExtra("report_sub", "Supermarket");
					startActivity(intent);
					}
				if(track == 37){
					intent.putExtra("report_sub", "Teenage Lobotomy");
					startActivity(intent);
					}
				if(track == 38){
					intent.putExtra("report_sub", "That's All Right");
					startActivity(intent);
					}
				if(track == 39){
					intent.putExtra("report_sub", "The Ballad of Wilhelm Fink");
					startActivity(intent);
					}
				if(track == 40){
					intent.putExtra("report_sub", "The Saints Are Coming");
					startActivity(intent);
					}
				if(track == 41){
					intent.putExtra("report_sub", "The Simpsons Theme");
					startActivity(intent);
					}
				if(track == 42){
					intent.putExtra("report_sub", "The Things I Heard Today");
					startActivity(intent);
					}
				if(track == 43){
					intent.putExtra("report_sub", "Too Much, Too Soon");
					startActivity(intent);
					}
				if(track == 44){
					intent.putExtra("report_sub", "Walking the Dog");
					startActivity(intent);
					}
				if(track == 45){
					intent.putExtra("report_sub", "We Are The Champions");
					startActivity(intent);
					}
				if(track == 46){
					intent.putExtra("report_sub", "What About Today?");
					startActivity(intent);
					}
				if(track == 47){
					intent.putExtra("report_sub", "When It's Time");
					startActivity(intent);
					}
				if(track == 48){
					intent.putExtra("report_sub", "When Will I Be Loved");
					startActivity(intent);
					}
				if(track == 49){
					intent.putExtra("report_sub", "Why Does It Always Rain on Me?");
					startActivity(intent);
					}
				if(track == 50){
					intent.putExtra("report_sub", "Working Class Hero");
					startActivity(intent);
					}
				if(track == 51){
					intent.putExtra("report_sub", "World Vs. World");
					startActivity(intent);
				}
				if(track == 52){
					intent.putExtra("report_sub", "You Can't Fool Me");
					startActivity(intent);
				}
			}
		});
		
		ImageButton favourite = (ImageButton) poppyview.findViewById(R.id.imageButton3);
		favourite.setOnClickListener(new OnClickListener() {

			int track = getIntent().getExtras().getInt("track");
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if(track == 1){
					lookupTrack("A Quick One While He's Away", track);
					}
				if(track == 2){
					lookupTrack("Angel and the Jerk", track);
					}
				if(track == 3){
					lookupTrack("Another State Of Mind", track);
					}
				if(track == 4){
					lookupTrack("Billie Joe's Mom", track);
					}
				if(track == 5){
					lookupTrack("Boys in the Bathroom Stall", track);
					}
				if(track == 6){
					lookupTrack("Can't Make Love", track);
					}
				if(track == 7){
					lookupTrack("Chocolate Rain", track);
					}
				if(track == 8){
					lookupTrack("Cigarettes And Valentines", track);
					}
				if(track == 9){
					lookupTrack("D.U.I.", track);
					}
				if(track == 10){
					lookupTrack("Depression Times", track);
					}
				if(track == 11){
					lookupTrack("Don't Want to Know If You Are Lonely", track);
					}
				if(track == 12){
					lookupTrack("Dream Catcher", track);
					}
				if(track == 13){
					lookupTrack("Favourite Son", track);
					}
				if(track == 14){
					lookupTrack("Food Around the Corner", track);
					}
				if(track == 15){
					lookupTrack("Governator", track);
					}
				if(track == 16){
					lookupTrack("Hearts Collide", track);
					}
				if(track == 17){
					lookupTrack("Hybrid Moments", track);
					}
				if(track == 18){
					lookupTrack("I Fought The Law", track);
					}
				if(track == 19){
					lookupTrack("I Run NY", track);
					}
				if(track == 20){
					lookupTrack("Jennifer", track);
					}
				if(track == 21){
					lookupTrack("Lights Out", track);
					}
				if(track == 22){
					lookupTrack("Like A Rolling Stone", track);
					}
				if(track == 23){
					lookupTrack("Like a Rat Does Cheese", track);
					}
				if(track == 24){
					lookupTrack("Look For Love", track);
					}
				if(track == 25){
					lookupTrack("Maybe Forever", track);
					}
				if(track == 26){
					lookupTrack("Mechanical Man", track);
					}
				if(track == 27){
					lookupTrack("Midwest Medley", track);
					}
				if(track == 28){
					lookupTrack("Minnesota Girl", track);
					}
				if(track == 29){
					lookupTrack("Oh Girl", track);
					}
				if(track == 30){
					lookupTrack("Olivia", track);
					}
				if(track == 31){
					lookupTrack("Private Hell", track);
					}
				if(track == 32){
					lookupTrack("Radio", track);
					}
				if(track == 33){
					lookupTrack("Second Time Around", track);
					}
				if(track == 34){
					lookupTrack("Shoplifter", track);
					}
				if(track == 35){
					lookupTrack("Shout", track);
					}
				if(track == 36){
					lookupTrack("Supermarket", track);
					}
				if(track == 37){
					lookupTrack("Teenage Lobotomy", track);
					}
				if(track == 38){
					lookupTrack("That's All Right", track);
					}
				if(track == 39){
					lookupTrack("The Ballad of Wilhelm Fink", track);
					}
				if(track == 40){
					lookupTrack("The Saints Are Coming", track);
					}
				if(track == 41){
					lookupTrack("The Simpsons Theme", track);
					}
				if(track == 42){
					lookupTrack("The Things I Heard Today", track);
					}
				if(track == 43){
					lookupTrack("Too Much, Too Soon", track);
					}
				if(track == 44){
					lookupTrack("Walking the Dog", track);
					}
				if(track == 45){
					lookupTrack("We Are The Champions", track);
					}
				if(track == 46){
					lookupTrack("What About Today?", track);
					}
				if(track == 47){
					lookupTrack("When It's Time", track);
					}
				if(track == 48){
					lookupTrack("When Will I Be Loved", track);
					}
				if(track == 49){
					lookupTrack("Why Does It Always Rain on Me?", track);
					}
				if(track == 50){
					lookupTrack("Working Class Hero", track);
					}
				if(track == 51){
					lookupTrack("World Vs. World", track);
					}
				if(track == 52){
					lookupTrack("You Can't Fool Me", track);
					}
			}
		});
		favourite.setOnLongClickListener(new OnLongClickListener() {
			
			Intent intent = new Intent(Unreleased.this, Favorites.class);
			@Override
			public boolean onLongClick(View arg0) {
				// TODO Auto-generated method stub
				intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP); 
				intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
				startActivity(intent);
				return false;
			}
		});
		
		ImageButton label=(ImageButton) poppyview.findViewById(R.id.imageButton4);
		label.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				int track = getIntent().getExtras().getInt("track");
				if(track == 1){
					Info.info1(Unreleased.this);
				}
				if(track == 2){
					Info.info2(Unreleased.this);
				}
				if(track == 3){
					Crouton.makeText(Unreleased.this, "Info. not available.", Style.ALERT).show();
				}
				if(track == 4){
					Info.info4(Unreleased.this);
				}
				if(track == 5){
					Info.info5(Unreleased.this);
				}
				if(track == 6){
					Info.info6(Unreleased.this);
				}
				if(track == 7){
					Info.info7(Unreleased.this);
				}
				if(track == 8){
					Info.info8(Unreleased.this);
				}
				if(track == 9){
					Info.info9(Unreleased.this);
				}
				if(track == 10){
					Info.info10(Unreleased.this);
				}
				if(track == 11){
					Info.info11(Unreleased.this);
				}
				if(track == 12){
					Info.info12(Unreleased.this);
				}
				if(track == 13){
					Info.info13(Unreleased.this);
				}
				if(track == 14){
					Info.info14(Unreleased.this);
				}
				if(track == 15){
					Info.info15(Unreleased.this);
				}
				if(track == 16){
					Info.info16(Unreleased.this);
				}
				if(track == 17){
					Info.info17(Unreleased.this);
				}
				if(track == 18){
					Info.info18(Unreleased.this);
				}
				if(track == 19){
					Info.info19(Unreleased.this);
				}
				if(track == 20){
					Crouton.makeText(Unreleased.this, "Info. not available.", Style.ALERT).show();
				}
				if(track == 21){
					Info.info21(Unreleased.this);
				}
				if(track == 22){
					Info.info22(Unreleased.this);
				}
				if(track == 23){
					Info.info23(Unreleased.this);
				}
				if(track == 24){
					Info.info24(Unreleased.this);
				}
				if(track == 25){
					Info.info25(Unreleased.this);
				}
				if(track == 26){
					Info.info26(Unreleased.this);
				}
				if(track == 27){
					Info.info27(Unreleased.this);
				}
				if(track == 28){
					Info.info28(Unreleased.this);
				}
				if(track == 29){
					Info.info29(Unreleased.this);
				}
				if(track == 30){
					Info.info30(Unreleased.this);
				}
				if(track == 31){
					Info.info31(Unreleased.this);
				}
				if(track == 32){
					Info.info32(Unreleased.this);
				}
				if(track == 33){
					Crouton.makeText(Unreleased.this, "Info. not available.", Style.ALERT).show();
				}
				if(track == 34){
					Info.info34(Unreleased.this);
				}
				if(track == 35){
					Info.info35(Unreleased.this);
				}
				if(track == 36){
					Info.info36(Unreleased.this);
				}
				if(track == 37){
					Info.info37(Unreleased.this);
				}
				if(track == 38){
					Info.info38(Unreleased.this);
				}
				if(track == 39){
					Info.info39(Unreleased.this);
				}
				if(track == 40){
					Info.info40(Unreleased.this);
				}
				if(track == 41){
					Crouton.makeText(Unreleased.this, "Info. not available.", Style.ALERT).show();
				}
				if(track == 42){
					Info.info42(Unreleased.this);
				}
				if(track == 43){
					Info.info43(Unreleased.this);
				}
				if(track == 44){
					Info.info44(Unreleased.this);
				}
				if(track == 45){
					Info.info45(Unreleased.this);
				}
				if(track == 46){
					Crouton.makeText(Unreleased.this, "Info. not available.", Style.ALERT).show();
				}
				if(track == 47){
					Info.info47(Unreleased.this);
				}
				if(track == 48){
					Info.info48(Unreleased.this);
				}
				if(track == 49){
					Info.info49(Unreleased.this);
				}
				if(track == 50){
					Info.info50(Unreleased.this);
				}
				if(track == 51){
					Info.info51(Unreleased.this);
				}
				if(track == 52){
					Info.info52(Unreleased.this);
				}
			}
		});
		ImageButton settings=(ImageButton) poppyview.findViewById(R.id.imageButton5);
		settings.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent(getApplicationContext(), Settings.class));
			}
		});
		//Poppyview

		//Lyrics
		int track = getIntent().getExtras().getInt("track");
		if(track == 1){
			String current = "A Quick One While He's Away";
			ab.setTitle(current);
			tv1.setText(R.string.quickone);
			analytics(current);
		}
		if(track == 2){
			String current = "Angel and the Jerk";
			ab.setTitle(current);
			tv1.setText(R.string.angelandjerk);
			analytics(current);
		}
		if(track == 3){
			String current = "Another State Of Mind";
			ab.setTitle(current);
			tv1.setText(R.string.anotherstate);
			analytics(current);
		}
		if(track == 4){
			String current = "Billie Joe's Mom";
			ab.setTitle(current);
			tv1.setText(R.string.billiesmom);
			analytics(current);
		}
		if(track == 5){
			String current = "Boys in the Bathroom Stall";
			ab.setTitle(current);
			tv1.setText(R.string.boysinstall);
			analytics(current);
		}
		if(track == 6){
			String current = "Can't Make Love";
			ab.setTitle(current);
			tv1.setText(R.string.cantmakelove);
			analytics(current);
		}
		if(track == 7){
			String current = "Chocolate Rain";
			ab.setTitle(current);
			tv1.setText(R.string.chocolaterain);
			analytics(current);
		}
		if(track == 8){
			String current = "Cigarettes And Valentines";
			ab.setTitle(current);
			tv1.setText(R.string.cigarettes);
			analytics(current);
		}
		if(track == 9){
			String current = "D.U.I.";
			ab.setTitle(current);
			tv1.setText(R.string.dui);
			analytics(current);
		}
		if(track == 10){
			String current = "Depression Times";
			ab.setTitle(current);
			tv1.setText(R.string.depressiontimes);
			analytics(current);
		}
		if(track == 11){
			String current = "Don't Want to Know If You Are Lonely";
			ab.setTitle(current);
			tv1.setText(R.string.dontwannaknow);
			analytics(current);
		}
		if(track == 12){
			String current = "Dream Catcher";
			ab.setTitle(current);
			tv1.setText(R.string.dreamcatcher);
			analytics(current);
		}
		if(track == 13){
			String current = "Favourite Son";
			ab.setTitle(current);
			tv1.setText(R.string.favouriteson);
			analytics(current);
		}
		if(track == 14){
			String current = "Food Around the Corner";
			ab.setTitle(current);
			tv1.setText(R.string.foodaround);
			analytics(current);
		}
		if(track == 15){
			String current = "Governator";
			ab.setTitle(current);
			tv1.setText(R.string.governator);
			analytics(current);
		}
		if(track == 16){
			String current = "Hearts Collide";
			ab.setTitle(current);
			tv1.setText(R.string.heartscollide);
			analytics(current);
		}
		if(track == 17){
			String current = "Hybrid Moments";
			ab.setTitle(current);
			tv1.setText(R.string.hybridmoments);
			analytics(current);
		}
		if(track == 18){
			String current = "I Fought The Law";
			ab.setTitle(current);
			tv1.setText(R.string.foughtlaw);
			analytics(current);
		}
		if(track == 19){
			String current = "I Run NY";
			ab.setTitle(current);
			tv1.setText(R.string.irunny);
			analytics(current);
		}
		if(track == 20){
			String current = "Jennifer";
			ab.setTitle(current);
			tv1.setText(R.string.jennifer);
			analytics(current);
		}
		if(track == 21){
			String current = "Lights Out";
			ab.setTitle(current);
			tv1.setText(R.string.lightsout);
			analytics(current);
		}
		if(track == 22){
			String current = "Like A Rolling Stone";
			ab.setTitle(current);
			tv1.setText(R.string.likeastone);
			analytics(current);
		}
		if(track == 23){
			String current = "Like a Rat Does Cheese";
			ab.setTitle(current);
			tv1.setText(R.string.likearat);
			analytics(current);
		}
		if(track == 24){
			String current = "Look For Love";
			ab.setTitle(current);
			tv1.setText(R.string.lookforlove);
			analytics(current);
		}
		if(track == 25){
			String current = "Maybe Forever";
			ab.setTitle(current);
			tv1.setText(R.string.maybeforever);
			analytics(current);
		}
		if(track == 26){
			String current = "Mechanical Man";
			ab.setTitle(current);
			tv1.setText(R.string.mechanicalman);
			analytics(current);
		}
		if(track == 27){
			String current = "Midwest Medley";
			ab.setTitle(current);
			tv1.setText(R.string.midwestmedley);
			analytics(current);
		}
		if(track == 28){
			String current = "Minnesota Girl";
			ab.setTitle(current);
			tv1.setText(R.string.minnesotagirl);
			analytics(current);
		}
		if(track == 29){
			String current = "Oh Girl";
			ab.setTitle(current);
			tv1.setText(R.string.ohgirl);
			analytics(current);
		}
		if(track == 30){
			String current = "Olivia";
			ab.setTitle(current);
			tv1.setText(R.string.olivia);
			analytics(current);
		}
		if(track == 31){
			String current = "Private Hell";
			ab.setTitle(current);
			tv1.setText(R.string.privatehell);
			analytics(current);
		}
		if(track == 32){
			String current = "Radio";
			ab.setTitle(current);
			tv1.setText(R.string.radio);
			analytics(current);
		}
		if(track == 33){
			String current = "Second Time Around";
			ab.setTitle(current);
			tv1.setText(R.string.secondtime);
			analytics(current);
		}
		if(track == 34){
			String current = "Shoplifter";
			ab.setTitle(current);
			tv1.setText(R.string.shoplifter);
			analytics(current);
		}
		if(track == 35){
			String current = "Shout";
			ab.setTitle(current);
			tv1.setText(R.string.shout);
			analytics(current);
		}
		if(track == 36){
			String current = "Supermarket";
			ab.setTitle(current);
			tv1.setText(R.string.supermarket);
			analytics(current);
		}
		if(track == 37){
			String current = "Teenage Lobotomy";
			ab.setTitle(current);
			tv1.setText(R.string.teenage);
			analytics(current);
		}
		if(track == 38){
			String current = "That's All Right";
			ab.setTitle(current);
			tv1.setText(R.string.thatsallright);
			analytics(current);
		}
		if(track == 39){
			String current = "The Ballad of Wilhelm Fink";
			ab.setTitle(current);
			tv1.setText(R.string.ballad);
			analytics(current);
		}
		if(track == 40){
			String current = "The Saints Are Coming";
			ab.setTitle(current);
			tv1.setText(R.string.saintsarecoming);
			analytics(current);
		}
		if(track == 41){
			String current = "The Simpsons Theme";
			ab.setTitle(current);
			tv1.setText(R.string.simpsons);
			analytics(current);
		}
		if(track == 42){
			String current = "The Things I Heard Today";
			ab.setTitle(current);
			tv1.setText(R.string.thingsheard);
			analytics(current);
		}
		if(track == 43){
			String current = "Too Much, Too Soon";
			ab.setTitle(current);
			tv1.setText(R.string.toomuch);
			analytics(current);
		}
		if(track == 44){
			String current = "Walking the Dog";
			ab.setTitle(current);
			tv1.setText(R.string.walkingdog);
			analytics(current);
		}
		if(track == 45){
			String current = "We Are The Champions";
			ab.setTitle(current);
			tv1.setText(R.string.wearechampions);
			analytics(current);
		}
		if(track == 46){
			String current = "What About Today?";
			ab.setTitle(current);
			tv1.setText(R.string.whattoday);
			analytics(current);
		}
		if(track == 47){
			String current = "When It's Time";
			ab.setTitle(current);
			tv1.setText(R.string.whenitstime);
			analytics(current);
		}
		if(track == 48){
			String current = "When Will I Be Loved";
			ab.setTitle(current);
			tv1.setText(R.string.whenwillloved);
			analytics(current);
		}
		if(track == 49){
			String current = "Why Does It Always Rain on Me?";
			ab.setTitle(current);
			tv1.setText(R.string.whydoesitrain);
			analytics(current);
		}
		if(track == 50){
			String current = "Working Class Hero";
			ab.setTitle(current);
			tv1.setText(R.string.workingclasshero);
			analytics(current);
		}
		if(track == 51){
			String current = "World Vs. World";
			ab.setTitle(current);
			tv1.setText(R.string.worldvsworld);
			analytics(current);
		}
		if(track == 52){
			String current = "You Can't Fool Me";
			ab.setTitle(current);
			tv1.setText(R.string.youcantfool);
			analytics(current);
		}
		
		getActionBar().setDisplayHomeAsUpEnabled(true);
		
		//Display
		boolean display = PreferenceManager.getDefaultSharedPreferences(this).getBoolean("display", false);
		if(display)
		{
			tv1.setKeepScreenOn(true);
		}
	}
	
	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
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
	            return super.onOptionsItemSelected(item);
	}

	//Checking and adding to database
	public void lookupTrack(String name, int i) {
		DBHandler db = new DBHandler(this, null, null, 1);
		Track findtrack = db.findTrack(name);
		
		if(findtrack != null) {
			Crouton.makeText(this, "Already in favorites", Style.ALERT).show();
		} else {
			db.addTrack(new Track(name, i));
			Crouton.makeText(this, "Added to favorites", Style.INFO).show();
		}
	}
	
	//Analytics
	public void analytics(String s) {
		//Google Analytics
		// Set screen name.
        t.setScreenName(s);
        // Send a screen view.
        t.send(new HitBuilders.AppViewBuilder().build());
	}
	
	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		//Get an Analytics tracker to report app starts & uncaught exceptions etc.
		GoogleAnalytics.getInstance(this).reportActivityStart(this);
		super.onStart();
	}
	
	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		//Stop the analytics tracking
		GoogleAnalytics.getInstance(this).reportActivityStop(this);
		super.onStop();
	}
	
	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
    	//Protect crouton
        Crouton.clearCroutonsForActivity(this);
		super.onDestroy();
	}
	
	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		getPref();
		super.onResume();
	}
	
	private void getPref() {
		
		//Action bar color
        int ab_def_color= Color.parseColor("#222222");
        int ab_color=PreferenceManager.getDefaultSharedPreferences(this).getInt("ab_theme", ab_def_color);
        ab.setBackgroundDrawable(new ColorDrawable(ab_color));
        
        //Text Size
		int text_size = PreferenceManager.getDefaultSharedPreferences(this).getInt("text", 18);
		tv1.setTextSize(text_size);
		
		//Text Color
		int text_def_color= Color.parseColor("#000000");
        int text_color=PreferenceManager.getDefaultSharedPreferences(this).getInt("text_theme", text_def_color);
        tv1.setTextColor(text_color);
        
        //Background transparency
        int def_alpha = 70;
        int alpha = PreferenceManager.getDefaultSharedPreferences(this).getInt("alpha", def_alpha);
        findViewById(R.id.unreleased_layout).getBackground().setAlpha(alpha);
        
        //PoppyView
        int poppy_def_color=Color.parseColor("#40222222");
		int poppy_color=PreferenceManager.getDefaultSharedPreferences(this).getInt("poppy_theme", poppy_def_color);
		poppyview.setBackgroundColor(poppy_color);
	}
}