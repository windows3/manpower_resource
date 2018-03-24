package com.windows3.service;


import com.windows3.po.Customer;
import com.windows3.po.Resume;
import com.windows3.po.Train;

import java.util.List;

/**
 * Created by 3 on 2018/3/9.
 */
public interface TrainService {

    boolean addTrain(Train train);

    List<Train> queryAll();
}
