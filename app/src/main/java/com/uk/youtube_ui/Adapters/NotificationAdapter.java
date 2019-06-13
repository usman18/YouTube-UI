package com.uk.youtube_ui.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.uk.youtube_ui.Model.Notification;
import com.uk.youtube_ui.R;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class NotificationAdapter extends RecyclerView.Adapter<NotificationAdapter.NotificationViewHolder> {
	
	private Context context;
	private ArrayList<Notification> notifications;
	
	public NotificationAdapter(Context context, ArrayList<Notification> notifications) {
		this.context = context;
		this.notifications = notifications;
	}
	
	@NonNull
	@Override
	public NotificationViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
		return new NotificationViewHolder(LayoutInflater.from(context)
			.inflate(R.layout.notification_row, viewGroup, false));
	}
	
	@Override
	public void onBindViewHolder(@NonNull NotificationViewHolder notificationViewHolder, int i) {
		Notification notification = notifications.get(i);
		
		Glide.with(context)
			.load(notification.getChannelPic())
			.into(notificationViewHolder.imgChannelPic);
		
		Glide.with(context)
			.load(notification.getThumbnailUrl())
			.into(notificationViewHolder.imgVideoThumbnail);
		
		String notificationTitle = notification.getChannelName() + ": " + notification.getTitle();
		notificationViewHolder.tvNotificationTitle.setText(notificationTitle);
		
		notificationViewHolder.tvTimeStamp.setText(notification.getTimestamp());
		
		if (notification.isContentSeen()) {
			notificationViewHolder.contentSeenCircle.setVisibility(View.INVISIBLE);
		} else {
			notificationViewHolder.contentSeenCircle.setVisibility(View.VISIBLE);
		}
		
	}
	
	@Override
	public int getItemCount() {
		if (notifications != null) {
			return notifications.size();
		}
		return 0;
	}
	
	class NotificationViewHolder extends RecyclerView.ViewHolder {
		CircleImageView imgChannelPic;
		CircleImageView contentSeenCircle;
		TextView tvNotificationTitle;
		TextView tvTimeStamp;
		ImageView imgVideoThumbnail;
		
		NotificationViewHolder(@NonNull View itemView) {
			super(itemView);
			imgChannelPic = itemView.findViewById(R.id.imgChannelPic);
			contentSeenCircle = itemView.findViewById(R.id.newContentCircle);
			tvNotificationTitle = itemView.findViewById(R.id.tvNotificationTitle);
			tvTimeStamp = itemView.findViewById(R.id.tvTimeStamp);
			imgVideoThumbnail = itemView.findViewById(R.id.imgThumbnail);
			
		}
	}
}
