package com.uk.youtube_ui.Model;

public class Message {
	private String name;            //Name of the person
	private String lastMessage;
	private String profilePic;             //Image url
	private String timestamp;
	private String seenBy;
	
	
	public Message(String name, String lastMessage, String profilePic, String timestamp, String seenBy) {
		this.name = name;
		this.lastMessage = lastMessage;
		this.profilePic = profilePic;
		this.timestamp = timestamp;
		this.seenBy = seenBy;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getLastMessage() {
		return lastMessage;
	}
	
	public void setLastMessage(String lastMessage) {
		this.lastMessage = lastMessage;
	}
	
	public String getTimestamp() {
		return timestamp;
	}
	
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	
	public void setSeenBy(String seenBy) {
		this.seenBy = seenBy;
	}
	
	public String getSeenBy() {
		return seenBy;
	}
	
	public String getProfilePic() {
		return profilePic;
	}
	
	public void setProfilePic(String profilePic) {
		this.profilePic = profilePic;
	}
}
