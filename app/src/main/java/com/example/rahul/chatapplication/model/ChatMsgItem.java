package com.example.rahul.chatapplication.model;

/**
 * Created by rahul on 4/3/2017.
 */

public class ChatMsgItem {
    private String msgBody;
    private String senderName;

    private String photoUrl;
    private String videoUrl;

    private boolean msgSeen;
    private String msgTime;

    public ChatMsgItem(String msgBody, String senderName, String photoUrl, String videoUrl, boolean msgSeen, String msgTime) {
        this.msgBody = msgBody;
        this.senderName = senderName;
        this.photoUrl = photoUrl;
        this.videoUrl = videoUrl;
        this.msgSeen = msgSeen;
        this.msgTime = msgTime;
    }

    public ChatMsgItem(String msgBody, String senderName) {
        this.msgBody = msgBody;
        this.senderName = senderName;
    }

    public String getMsgBody() {
        return msgBody;
    }

    public void setMsgBody(String msgBody) {
        this.msgBody = msgBody;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public boolean isMsgSeen() {
        return msgSeen;
    }

    public void setMsgSeen(boolean msgSeen) {
        this.msgSeen = msgSeen;
    }

    public String getMsgTime() {
        return msgTime;
    }

    public void setMsgTime(String msgTime) {
        this.msgTime = msgTime;
    }
}
