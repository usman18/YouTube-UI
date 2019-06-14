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
import com.uk.youtube_ui.Adapters.NotificationAdapter;
import com.uk.youtube_ui.Model.Notification;
import com.uk.youtube_ui.R;

import java.util.ArrayList;

public class NotificationsFragment extends Fragment {
	
	private RecyclerView rvNotifications;
	private NotificationAdapter notificationAdapter;
	private ArrayList<Notification> notifications;
	
	
	@Nullable
	@Override
	public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
		return inflater.inflate(R.layout.notifications_layout, null);
	}
	
	
	@Override
	public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
		super.onViewCreated(view, savedInstanceState);
		
		
		rvNotifications = view.findViewById(R.id.rvNotifications);
		rvNotifications.setLayoutManager(new LinearLayoutManager(getContext()));
	
		notifications = new ArrayList<>();
		
		notifications.add(new Notification(MainActivity.channelPics[0], MainActivity.thuumbnailUrls[0], "JRE - Best of the week", "Powerful JRE", "1 hour ago", false));
		notifications.add(new Notification(MainActivity.channelPics[1], MainActivity.thuumbnailUrls[1], "Elon Musk Interview", "MKBHD", "3 hours ago", false));
		notifications.add(new Notification(MainActivity.channelPics[2], MainActivity.thuumbnailUrls[2], "Late Night Show with Will Smith", "The Late Night Show with Jimmy Fallon", "1 day ago", true));
		notifications.add(new Notification(MainActivity.channelPics[3], MainActivity.thuumbnailUrls[3], "Late Night Show with Jimmy Kimmel starring Kevin Hart", "Jimmy Kimmel", "2 days ago", false));
		notifications.add(new Notification(MainActivity.channelPics[0], MainActivity.thuumbnailUrls[0], "JRE - Best of the week", "Powerful JRE", "1 hour ago", false));
		notifications.add(new Notification(MainActivity.channelPics[1], MainActivity.thuumbnailUrls[1], "Elon Musk Interview", "MKBHD", "3 hours ago", false));
		notifications.add(new Notification(MainActivity.channelPics[2], MainActivity.thuumbnailUrls[2], "Late Night Show with Will Smith", "The Late Night Show with Jimmy Fallon", "1 day ago", true));
		notifications.add(new Notification(MainActivity.channelPics[3], MainActivity.thuumbnailUrls[3], "Late Night Show with Jimmy Kimmel starring Kevin Hart", "Jimmy Kimmel", "2 days ago", false));
		notifications.add(new Notification(MainActivity.channelPics[0], MainActivity.thuumbnailUrls[0], "JRE - Best of the week", "Powerful JRE", "1 hour ago", false));
		notifications.add(new Notification(MainActivity.channelPics[1], MainActivity.thuumbnailUrls[1], "Elon Musk Interview", "MKBHD", "3 hours ago", false));
		notifications.add(new Notification(MainActivity.channelPics[2], MainActivity.thuumbnailUrls[2], "Late Night Show with Will Smith", "The Late Night Show with Jimmy Fallon", "1 day ago", true));
		notifications.add(new Notification(MainActivity.channelPics[3], MainActivity.thuumbnailUrls[3], "Late Night Show with Jimmy Kimmel starring Kevin Hart", "Jimmy Kimmel", "2 days ago", false));
		
		notificationAdapter = new NotificationAdapter(getContext(), notifications);
		
		rvNotifications.setAdapter(notificationAdapter);
		
	}
}
