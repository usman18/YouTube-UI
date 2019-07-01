package com.uk.youtube_ui.Activities;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatDelegate;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.uk.youtube_ui.Fragments.HomeFragment;
import com.uk.youtube_ui.Fragments.InboxFragment;
import com.uk.youtube_ui.Fragments.LibraryFragment;
import com.uk.youtube_ui.Fragments.TrendingFragment;
import com.uk.youtube_ui.Fragments.SubscriptionsFragment;
import com.uk.youtube_ui.R;

public class MainActivity extends AppCompatActivity {
	
	public static boolean nightMode = false;
	
	/*
	* Below are random image Urls from the internet for demonstration
	*/
	
	public static final String[] thuumbnailUrls = {
		"https://i2.wp.com/brainflow.co/wp-content/uploads/2018/09/Joe-Rogan-Supplements.jpg?fit=1090%2C614&ssl=1",
		"https://nyoobserver.files.wordpress.com/2018/08/screen-shot-2018-08-22-at-1-57-37-pm.png?w=1000&h=600",
		"https://i.ytimg.com/vi/kD-_iyS95AQ/maxresdefault.jpg",
		"https://i.ytimg.com/vi/bwu_8quv1X8/maxresdefault.jpg",
		"https://www.jrepodcast.com/wp-content/uploads/2019/05/best-of-the-week-may-5-2019-joe-rogan-experience-youtube-thumbnail.jpg"
	};
	
	public static final String[] channelPics = {
		"https://yt3.ggpht.com/a/AGF-l78OfG5OxzCfyyoFqw-dKeiFNGzTIT4YgpMK4Q=s900-mo-c-c0xffffffff-rj-k-no",
		"https://i.redd.it/uldyq27j4nn01.jpg",
		"https://novacapsfans.files.wordpress.com/2018/06/image27.png?w=640",
		"https://i.ytimg.com/vi/Gki-F87qB1Y/maxresdefault.jpg",
		"https://yt3.ggpht.com/a/AGF-l78OfG5OxzCfyyoFqw-dKeiFNGzTIT4YgpMK4Q=s900-mo-c-c0xffffffff-rj-k-no"
	};
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		if (AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_YES) {
			nightMode = true;
			setTheme(R.style.MainScreenDarkTheme);
		}
		setContentView(R.layout.activity_main);
		
		initialize();
		loadFragment(new HomeFragment());
	}
	
	
	private void initialize() {
		
		Toolbar toolbar = findViewById(R.id.toolbar);
		setSupportActionBar(toolbar);
		
		BottomNavigationView btmNav = findViewById(R.id.btmNav);
		
		
		btmNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
			@Override
			public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
				switch (menuItem.getItemId()) {
					case R.id.home:
						return loadFragment(new HomeFragment());
					case R.id.search:
						return loadFragment(new TrendingFragment());
					case R.id.subscriptions:
						return loadFragment(new SubscriptionsFragment());
					case R.id.inbox:
						return loadFragment(new InboxFragment());
					case R.id.library:
						return loadFragment(new LibraryFragment());
				}
				return false;
			}
		});
		
	}
	
	
	
	private boolean loadFragment(Fragment fragment) {
		
		if (fragment != null) {
			FragmentManager fm = getSupportFragmentManager();
			fm.beginTransaction()
				.replace(R.id.container, fragment)
				.commit();
			return true;
		}
		return false;
	}
	
	
}
