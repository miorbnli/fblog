package com.fblog.dubbo.pojo;

import com.fblog.common.po.BasePojo;

public class UserFollow extends BasePojo{
	private static final long serialVersionUID = -5573724251281866067L;

	private Long id;

    private Long userId;

    private Long followId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getFollowId() {
        return followId;
    }

    public void setFollowId(Long followId) {
        this.followId = followId;
    }

}