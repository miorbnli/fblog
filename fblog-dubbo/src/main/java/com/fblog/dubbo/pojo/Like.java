package com.fblog.dubbo.pojo;

import com.fblog.common.po.BasePojo;

public class Like extends BasePojo {
	private static final long serialVersionUID = -497934904449405832L;

	private Integer likeId;

    private Long postId;

    private Long userId;

    public Integer getLikeId() {
        return likeId;
    }

    public void setLikeId(Integer likeId) {
        this.likeId = likeId;
    }

    public Long getPostId() {
        return postId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}