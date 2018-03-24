package com.windows3.service.impl;

import com.windows3.dao.ApplyForMessageDao;
import com.windows3.po.ApplyForMessage;
import com.windows3.service.ApplyForMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 3 on 2018/3/22.
 */
@Service(value = "applyForMessageService")
public class ApplyForMessageServiceImpl implements ApplyForMessageService{

    @Autowired
    private ApplyForMessageDao applyForMessageDao;

    @Override
    public boolean addApply(ApplyForMessage applyForMessage) {
        return applyForMessageDao.addApply(applyForMessage);
    }

    @Override
    public List<ApplyForMessage> queryBySee(int i) {
        return applyForMessageDao.queryBySee(i);
    }

    @Override
    public ApplyForMessage queryById(ApplyForMessage applyForMessage) {
        return applyForMessageDao.queryById(applyForMessage);
    }

    @Override
    public ApplyForMessage queryByResumeIdAndRecruitId(ApplyForMessage applyForMessage) {
        return applyForMessageDao.queryByResumeIdAndRecruitId(applyForMessage);
    }
}
