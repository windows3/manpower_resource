package com.windows3.dao;

import com.windows3.po.Post;

import java.util.List;

/**
 * Created by 3 on 2018/3/16.
 */
public interface PostDao {
    boolean addPost(Post post);

    List<Post> queryPostByName(Post post);
    Post queryPostById(Post post);
}
