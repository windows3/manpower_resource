package com.windows3.service;


import com.windows3.po.Customer;
import com.windows3.po.Resume;

import java.util.List;

/**
 * Created by 3 on 2018/3/9.
 */
public interface ResumeService {

    boolean addResume(Resume resume);

    List<Resume> queryResumeById(Customer customer);

    boolean updateResume(Resume resume);
    Resume queryResumeByResumeId(Resume resume);
}
