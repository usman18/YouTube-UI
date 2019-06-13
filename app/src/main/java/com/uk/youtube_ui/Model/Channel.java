package com.uk.youtube_ui.Model;

public class Channel {
	private String name;
	private String channelPicture;
	private boolean newContentAvailable;
	
	public Channel(String name, String channelPicture, boolean newContentAvailable) {
		this.name = name;
		this.channelPicture = channelPicture;
		this.newContentAvailable = newContentAvailable;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getChannelPicture() {
		return channelPicture;
	}
	
	public void setChannelPicture(String channelPicture) {
		this.channelPicture = channelPicture;
	}
	
	public boolean hasNewContentAvailable() {
		return newContentAvailable;
	}
	
	public void setNewContentAvailable(boolean newContentAvailable) {
		this.newContentAvailable = newContentAvailable;
	}
}
