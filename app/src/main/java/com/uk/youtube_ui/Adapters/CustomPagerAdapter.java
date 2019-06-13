package com.uk.youtube_ui.Adapters;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;


import java.util.ArrayList;

public class CustomPagerAdapter extends FragmentStatePagerAdapter {
	private ArrayList<Fragment> fragments;
	private ArrayList<String> tabNames;
	private int size;
	
	
	public CustomPagerAdapter(FragmentManager fm, ArrayList<Fragment> fragments, ArrayList<String> tabNames, int size) {
		super(fm);
		this.fragments = fragments;
		this.tabNames = tabNames;
		this.size = size;
	}
	
	@Override
	public Fragment getItem(int i) {
		if (fragments != null) {
			return fragments.get(i);
		}
		return null;
	}
	
	
	@Nullable
	@Override
	public CharSequence getPageTitle(int position) {
		if (tabNames != null) {
			return tabNames.get(position);
		}
		return null;
	}
	
	@Override
	public int getCount() {
		return size;
	}
}
