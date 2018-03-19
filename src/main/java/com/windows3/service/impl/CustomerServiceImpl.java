package com.windows3.service.impl;

import com.windows3.dao.CustomerDao;
import com.windows3.po.Customer;
import com.windows3.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 3 on 2018/3/7.
 * ----------------The heart withered--------
 */
@Service(value = "customerService")
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerDao customerDao;

    public Customer queryCustomerByName(Customer customer) {
        return customerDao.findCustomerByName(customer);
    }

    public boolean addCustomer(Customer customer) {
        return customerDao.addCustomer(customer);
    }

    public boolean deleteCustomer(Customer customer) {
        return false;
    }

    public boolean updateCustomer(Customer customer) {
        return false;
    }

    public List<Customer> queryAllCustomer() {
        return customerDao.queryAllCustomer();
    }

    public Customer findCustomerByid(int cid) {
        return null;
    }

    public Customer findCustomerByEmail(String customerName, int id) {
        return null;
    }

    public List<Customer> findLikeName(String name) {
        return null;
    }

    public List<Customer> findCustomerList(List<Customer> customerList) {
        return null;
    }
}
