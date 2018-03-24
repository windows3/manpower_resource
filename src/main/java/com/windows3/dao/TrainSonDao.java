package com.windows3.dao;

import com.windows3.po.Train;
import com.windows3.po.TrainSon;

import java.util.List;

/**
 * Created by 3 on 2018/3/24.
 */
public interface TrainSonDao {
    List<TrainSon> queryByTrainId(Train train);
   boolean addTrainSon(TrainSon trainSon);
}
