package com.uk.youtube_ui.Model;

public class Video {
	private String channelPic;
	private String thumbnailUrl;
	private String title;
	private String channelName;
	private String views;
	private String timestamp;
	private String videoDuration;
	
	
	public Video(String channelPic, String thumbnailUrl, String title, String channelName, String views, String timestamp, String videoDuration) {
		this.channelPic = channelPic;
		this.thumbnailUrl = thumbnailUrl;
		this.title = title;
		this.channelName = channelName;
		this.views = views;
		this.timestamp = timestamp;
		this.videoDuration = videoDuration;
	}
	
	public String getThumbnailUrl() {
		return thumbnailUrl;
	}
	
	public void setThumbnailUrl(String thumbnailUrl) {
		this.thumbnailUrl = thumbnailUrl;
	}
	
	public String getChannelPic() {
		return channelPic;
	}
	
	public void setChannelPic(String channelPic) {
		this.channelPic = channelPic;
	}
	
	public String getVideoDuration() {
		return videoDuration;
	}
	
	public void setVideoDuration(String videoDuration) {
		this.videoDuration = videoDuration;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getChannelName() {
		return channelName;
	}
	
	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}
	
	public String getViews() {
		return views;
	}
	
	public void setViews(String views) {
		this.views = views;
	}
	
	public String getTimestamp() {
		return timestamp;
	}
	
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
}
