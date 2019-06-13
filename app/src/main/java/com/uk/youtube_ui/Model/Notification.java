package com.uk.youtube_ui.Model;

public class Notification {
	private String channelPic;
	private String thumbnailUrl;
	private String title;
	private String channelName;
	private String timestamp;
	private boolean contentSeen;
	
	public Notification(String channelPic, String thumbnailUrl, String title, String channelName, String timestamp, boolean contentSeen) {
		this.channelPic = channelPic;
		this.thumbnailUrl = thumbnailUrl;
		this.title = title;
		this.channelName = channelName;
		this.timestamp = timestamp;
		this.contentSeen = contentSeen;
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

	public String getTimestamp() {
		return timestamp;
	}
	
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	
	public boolean isContentSeen() {
		return contentSeen;
	}
	
	public void setContentSeen(boolean contentSeen) {
		this.contentSeen = contentSeen;
	}
}
