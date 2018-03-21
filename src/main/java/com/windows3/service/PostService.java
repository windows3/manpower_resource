package com.windows3.service;


import com.windows3.po.Post;

import java.util.List;

/**
 * Created by 3 on 2018/2/28.
 */
public interface PostService {


    boolean addPost(Post post);

    List<Post> queryPostByName(Post post);
    Post queryPostById(Post post);
}
