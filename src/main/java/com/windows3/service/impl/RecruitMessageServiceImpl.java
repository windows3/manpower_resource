package com.windows3.service.impl;

import com.windows3.dao.RecruitMessageDao;
import com.windows3.po.RecruitMessage;
import com.windows3.service.RecruitMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 3 on 2018/3/20.
 */

@Service(value = "recruitMessageService")
public class RecruitMessageServiceImpl implements RecruitMessageService{

    @Autowired
    private RecruitMessageDao recruitMessageDao;
    @Override
    public boolean addRecruitMessage(RecruitMessage recruitMessage) {
        return recruitMessageDao.addRecruitMessage(recruitMessage);
    }

    @Override
    public List<RecruitMessage> queryRecruitByStatus(int i) {
        return recruitMessageDao.queryRecruitByStatus(i);
    }

    @Override
    public boolean updateRecruitMessage(RecruitMessage recruitMessage) {
        return recruitMessageDao.updateRecruitMessage(recruitMessage);
    }
}

