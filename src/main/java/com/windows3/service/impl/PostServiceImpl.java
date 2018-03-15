package com.windows3.service.impl;

import com.windows3.dao.PostDao;
import com.windows3.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 3 on 2018/3/7.
 * ----------------The heart withered--------
 */
@Service(value = "postService")
public class PostServiceImpl implements PostService {

    @Autowired
    private PostDao postDao;


}
