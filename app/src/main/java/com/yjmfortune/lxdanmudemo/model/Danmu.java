package com.yjmfortune.lxdanmudemo.model;

/**
 * Created by feiyang on 16/3/2.
 */
public class Danmu {
    public long   id;
    public int    userId;
    public String type;
    public int    avatarUrl;
    public String content;
    public String url;
    public Danmu(long id, int userId, String type, int avatarUrl, String content) {
        this.id = id;
        this.userId = userId;
        this.type = type;
        this.avatarUrl = avatarUrl;
        this.content = content;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(int avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Danmu() {
    }
}
