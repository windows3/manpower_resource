package com.windows3.dao;


import com.windows3.po.Customer;
import com.windows3.po.Resume;

import java.util.List;

/**
 * Created by 3 on 2018/3/16.
 */
public interface ResumeDao {
   boolean addResume(Resume resume);

   List<Resume> queryResumeById(Customer customer);

   boolean updateResume(Resume resume);
   Resume queryResumeByResumeId(Resume resume);
}
