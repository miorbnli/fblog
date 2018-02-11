package com.fblog.dubbo.pojo;

public class Channel {
    private Integer channelId;

    private String channelNameKey;

    private String channelName;

    private Integer status;

    public Integer getChannelId() {
        return channelId;
    }

    public void setChannelId(Integer channelId) {
        this.channelId = channelId;
    }

    public String getChannelNameKey() {
        return channelNameKey;
    }

    public void setChannelNameKey(String channelNameKey) {
        this.channelNameKey = channelNameKey == null ? null : channelNameKey.trim();
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName == null ? null : channelName.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}