package com.windows3.service.impl;


import com.windows3.dao.TrainDao;
import com.windows3.dao.TrainSonDao;
import com.windows3.po.Train;
import com.windows3.po.TrainSon;
import com.windows3.service.TrainService;
import com.windows3.service.TrainSonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 3 on 2018/3/9.
 */
@Service(value = "trainSonService")
public class TrainSonServiceImpl implements TrainSonService {

    @Autowired
    private TrainSonDao trainSonDao;

    @Override
    public List<TrainSon> queryByTrainId(Train train) {
        return trainSonDao.queryByTrainId(train);
    }

    @Override
    public boolean addTrainSon(TrainSon trainSon) {
        return trainSonDao.addTrainSon(trainSon);
    }
}
