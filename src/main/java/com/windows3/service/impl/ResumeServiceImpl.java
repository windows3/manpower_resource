package com.windows3.service.impl;

import com.windows3.dao.PostDao;
import com.windows3.dao.ResumeDao;
import com.windows3.po.Customer;
import com.windows3.po.Post;
import com.windows3.po.Resume;
import com.windows3.service.PostService;
import com.windows3.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.List;

/**
 * Created by 3 on 2018/3/7.
 * ----------------The heart withered--------
 */
@Service(value = "resumeService")
public class ResumeServiceImpl implements ResumeService {

    @Autowired
    private ResumeDao resumeDao;


    @Override
    public boolean addResume(Resume resume) {

        return resumeDao.addResume(resume);
    }

    @Override
    public List<Resume> queryResumeById(Customer customer) {
        return resumeDao.queryResumeById(customer);
    }

    @Override
    public boolean updateResume(Resume resume) {
        return resumeDao.updateResume(resume);


    }

    @Override
    public Resume queryResumeByResumeId(Resume resume) {
        return resumeDao.queryResumeByResumeId(resume);
    }
}
