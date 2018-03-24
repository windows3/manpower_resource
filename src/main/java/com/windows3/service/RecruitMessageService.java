package com.windows3.service;

import com.windows3.po.RecruitMessage;
import org.apache.ibatis.session.RowBounds;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;
import java.util.Map;

/**
 * Created by 3 on 2018/3/20.
 */


public interface RecruitMessageService {

    boolean addRecruitMessage(RecruitMessage recruitMessage);

    List<RecruitMessage> queryRecruitByStatus(Integer integer,Integer offset);

    boolean updateRecruitMessage(RecruitMessage recruitMessage);
}

