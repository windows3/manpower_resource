package com.windows3.dao;

import com.windows3.po.RecruitMessage;

import java.util.List;

/**
 * Created by 3 on 2018/3/20.
 */
public interface RecruitMessageDao {
    boolean addRecruitMessage(RecruitMessage recruitMessage);

    List<RecruitMessage> queryRecruitByStatus(int i);

    boolean updateRecruitMessage(RecruitMessage recruitMessage);
}
