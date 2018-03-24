package com.windows3.dao;

import com.windows3.po.ApplyForMessage;

import java.util.List;

/**
 * Created by 3 on 2018/3/22.
 */
public interface ApplyForMessageDao {
    boolean addApply(ApplyForMessage applyForMessage);

    List<ApplyForMessage> queryBySee(int i);

    ApplyForMessage queryById(ApplyForMessage applyForMessage);

    ApplyForMessage queryByResumeIdAndRecruitId(ApplyForMessage applyForMessage);
}
