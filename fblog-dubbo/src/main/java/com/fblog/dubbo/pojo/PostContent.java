package com.fblog.dubbo.pojo;

import com.fblog.common.po.BasePojo;

public class PostContent extends BasePojo{
	private static final long serialVersionUID = 911322276499464026L;


	private Long postId;


    private String postContent;

    public Long getPostId() {
        return postId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
    }


    public String getPostContent() {
        return postContent;
    }

    public void setPostContent(String postContent) {
        this.postContent = postContent == null ? null : postContent.trim();
    }
}