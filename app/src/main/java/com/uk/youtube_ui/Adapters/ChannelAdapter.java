package com.uk.youtube_ui.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.uk.youtube_ui.Model.Channel;
import com.uk.youtube_ui.R;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class ChannelAdapter extends RecyclerView.Adapter<ChannelAdapter.ChannelViewHolder> {
	
	private Context context;
	private ArrayList<Channel> channels;
	
	public ChannelAdapter(Context context, ArrayList<Channel> channels) {
		this.context = context;
		this.channels = channels;
	}
	
	@NonNull
	@Override
	public ChannelViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
		return new ChannelViewHolder(LayoutInflater.from(context)
			.inflate(R.layout.subscriptions_item, viewGroup, false));
	}
	
	@Override
	public void onBindViewHolder(@NonNull ChannelViewHolder channelViewHolder, int i) {
		
		Channel channel = channels.get(i);
		
		channelViewHolder.tvChannelName.setText(channel.getName());
		Glide.with(context)
			.load(channel.getChannelPicture())
			.into(channelViewHolder.imgChannelPic);
		
		if (channel.hasNewContentAvailable()) {
			channelViewHolder.newContentCircle.setVisibility(View.VISIBLE);
		} else {
			channelViewHolder.newContentCircle.setVisibility(View.GONE);
		}
		
		
	}
	
	@Override
	public int getItemCount() {
		if (channels != null) {
			return channels.size();
		}
		return 0;
	}
	
	class ChannelViewHolder extends RecyclerView.ViewHolder {
		
		TextView tvChannelName;
		CircleImageView imgChannelPic;
		CircleImageView newContentCircle;
		
		ChannelViewHolder(@NonNull View itemView) {
			super(itemView);
		
			tvChannelName = itemView.findViewById(R.id.tvChannelName);
			imgChannelPic = itemView.findViewById(R.id.imgChannelPic);
			newContentCircle = itemView.findViewById(R.id.newContentCircle);
		}
	}
}
