package com.windows3.service;

import com.windows3.po.RecruitMessage;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;

/**
 * Created by 3 on 2018/3/20.
 */


public interface RecruitMessageService {

    boolean addRecruitMessage(RecruitMessage recruitMessage);

    List<RecruitMessage> queryRecruitByStatus(int i);

    boolean updateRecruitMessage(RecruitMessage recruitMessage);
}

