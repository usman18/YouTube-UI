package com.uk.youtube_ui.Fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.uk.youtube_ui.Activities.MainActivity;
import com.uk.youtube_ui.Adapters.VideoAdapter;
import com.uk.youtube_ui.Model.Video;
import com.uk.youtube_ui.R;

import java.util.ArrayList;

public class HomeFragment extends Fragment {
	private RecyclerView rvVideos;
	private VideoAdapter adapter;
	private ArrayList<Video> videos;
	
	
	@Nullable
	@Override
	public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
		return inflater.inflate(R.layout.home_layout, null);
	}
	
	
	@Override
	public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
		super.onViewCreated(view, savedInstanceState);

		initialize(view);
		populateVideos();
		adapter.notifyDataSetChanged();
		
	}
	
	
	private void initialize(View view) {
		
		videos = new ArrayList<>();
		rvVideos = view.findViewById(R.id.rvHomePosts);
		adapter = new VideoAdapter(getContext(), videos);
		rvVideos.setLayoutManager(new LinearLayoutManager(getContext()));
		rvVideos.setAdapter(adapter);
		
	}
	
	
	private void populateVideos() {
		/*
		 *  Population logic goes here...
		 */
		
		videos.add(new Video(MainActivity.channelPics[3], MainActivity.thuumbnailUrls[3], "Late Night Show with Jimmy Kimmel starring Kevin Hart", "Jimmy Kimmel", "23m", "1 day ago", "11:10", true));
		videos.add(new Video(MainActivity.channelPics[2], MainActivity.thuumbnailUrls[2], "Late Night Show with Jimmy Fallon starring Will Smith", "Late Night Show with Jimmy Fallon", "6m", "3 days ago", "6:00", true));
		videos.add(new Video(MainActivity.channelPics[0], MainActivity.thuumbnailUrls[0], "The Joe Rogan Experience", "JRE", "1m", "5 days ago", "1:10", false));
		videos.add(new Video(MainActivity.channelPics[1], MainActivity.thuumbnailUrls[1], "Elon Musk Interview", "MKBHD", "1.5m", "1 week ago", "29:10", true));
		videos.add(new Video(MainActivity.channelPics[4], MainActivity.thuumbnailUrls[4], "JRE - Best of the week", "JRE Clips", "1.3m", "2 days ago", "10:08", false));
		
	}
}
