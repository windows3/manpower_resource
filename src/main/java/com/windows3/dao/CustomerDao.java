package com.windows3.dao;

import com.windows3.po.Customer;

import java.util.List;

/**
 * Created by 3 on 2018/2/28.
 */
public interface CustomerDao {

    Customer findCustomerByName(Customer customer);


    boolean addCustomer(Customer customer);


    List<Customer> queryAllCustomer();




}
