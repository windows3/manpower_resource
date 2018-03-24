package com.windows3.service.impl;


import com.windows3.dao.TrainDao;
import com.windows3.po.Resume;
import com.windows3.po.Train;
import com.windows3.service.TrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 3 on 2018/3/9.
 */
@Service(value = "trainService")
public class TrainServiceImpl implements TrainService {

    @Autowired
    private TrainDao trainDao;

    @Override
    public boolean addTrain(Train train) {
        return trainDao.addTrain(train);
    }

    @Override
    public List<Train> queryAll() {
        return trainDao.queryAll();
    }
}
