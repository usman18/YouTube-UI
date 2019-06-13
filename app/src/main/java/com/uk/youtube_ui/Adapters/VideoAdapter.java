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
import com.uk.youtube_ui.Model.Video;
import com.uk.youtube_ui.R;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class VideoAdapter extends RecyclerView.Adapter<VideoAdapter.VideoViewHolder>{
	
	private Context context;
	private ArrayList<Video> videos;
	
	public VideoAdapter(Context context, ArrayList<Video> videos) {
		this.context = context;
		this.videos = videos;
	}
	
	@NonNull
	@Override
	public VideoViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
		return new VideoViewHolder(LayoutInflater.from(context)
		.inflate(R.layout.video_row_layout, viewGroup, false));
	}
	
	@Override
	public void onBindViewHolder(@NonNull VideoViewHolder videoViewHolder, int i) {
		
		Video video = videos.get(i);
		
		Glide.with(context)
			.load(video.getThumbnailUrl())
			.into(videoViewHolder.imgThumbnail);
		
		Glide.with(context)
			.load(video.getChannelPic())
			.into(videoViewHolder.imgChannelPic);
		
		if (video.hasCaptions()) {
			videoViewHolder.tvCaptions.setVisibility(View.VISIBLE);
		} else {
			videoViewHolder.tvCaptions.setVisibility(View.GONE);
		}
		
		
		String info = video.getChannelName() + " • " + video.getViews() + " views" + " • " + video.getTimestamp();
		videoViewHolder.tvInfo.setText(info);
		
		videoViewHolder.tvTitle.setText(video.getTitle());
		videoViewHolder.tvDuration.setText(video.getVideoDuration());
		
		
		
	}
	
	@Override
	public int getItemCount() {
		if (videos != null) {
			return videos.size();
		}
		return 0;
	}
	
	class VideoViewHolder extends RecyclerView.ViewHolder {
		
		ImageView imgThumbnail;
		TextView tvDuration;
		TextView tvTitle;
		TextView tvInfo;
		CircleImageView imgChannelPic;
		TextView tvCaptions;
		
		VideoViewHolder(@NonNull View itemView) {
			super(itemView);
			
			imgThumbnail = itemView.findViewById(R.id.imgThumbnail);
			tvDuration = itemView.findViewById(R.id.tvDuration);
			tvTitle = itemView.findViewById(R.id.tvVideoTitle);
			tvInfo = itemView.findViewById(R.id.tvInfo);
			imgChannelPic = itemView.findViewById(R.id.imgChannelPic);
			tvCaptions = itemView.findViewById(R.id.tvCaptions);
		}
	}
}
