package com.windows3.dao;

import com.windows3.po.RecruitMessage;
import org.apache.ibatis.session.RowBounds;

import java.util.List;
import java.util.Map;

/**
 * Created by 3 on 2018/3/20.
 */
public interface RecruitMessageDao {
    boolean addRecruitMessage(RecruitMessage recruitMessage);

    List<RecruitMessage> queryRecruitByStatus(Integer integer,Integer offset);

    boolean updateRecruitMessage(RecruitMessage recruitMessage);

    RecruitMessage queryById(RecruitMessage recruitMessage);

}
