package com.studdybuddy.finalstudybuddy;

/**
 * Created by Tony on 3/16/2018.
 */

public class DiscussionBoard {

    private String title, desc, imageUrl, username;

    public DiscussionBoard(String title, String desc, String imageUrl, String username) {
        this.title = title;
        this.desc = desc;
        this.imageUrl=imageUrl;
        this.username = username;
    }

    public DiscussionBoard() {
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getTitle() {
        return title;
    }

    public String getDesc() {
        return desc;
    }

}



