package com.windows3.dao;

import com.windows3.po.Train;

import java.util.List;

/**
 * Created by 3 on 2018/3/24.
 */
public interface TrainDao {
    boolean addTrain(Train train);

    List<Train> queryAll();
}
