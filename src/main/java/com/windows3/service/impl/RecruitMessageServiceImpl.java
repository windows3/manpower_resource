package com.windows3.service.impl;

import com.windows3.dao.RecruitMessageDao;
import com.windows3.po.RecruitMessage;
import com.windows3.service.RecruitMessageService;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

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
    public List<RecruitMessage> queryRecruitByStatus(Integer integer,Integer offset) {
        return recruitMessageDao.queryRecruitByStatus( integer,offset);
    }

    @Override
    public boolean updateRecruitMessage(RecruitMessage recruitMessage) {
        return recruitMessageDao.updateRecruitMessage(recruitMessage);
    }
}

