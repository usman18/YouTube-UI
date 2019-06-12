package com.uk.youtube_ui.Activities;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import com.uk.youtube_ui.Fragments.HomeFragment;
import com.uk.youtube_ui.Fragments.InboxFragment;
import com.uk.youtube_ui.Fragments.LibraryFragment;
import com.uk.youtube_ui.Fragments.SearchFragment;
import com.uk.youtube_ui.Fragments.SubscriptionsFragment;
import com.uk.youtube_ui.R;

public class MainActivity extends AppCompatActivity {
	
	private BottomNavigationView btmNav;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		btmNav = findViewById(R.id.btmNav);
		
		loadFragment(new HomeFragment());
		
		btmNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
			@Override
			public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
				switch (menuItem.getItemId()) {
					case R.id.home:
						return loadFragment(new HomeFragment());
					case R.id.search:
						return loadFragment(new SearchFragment());
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
