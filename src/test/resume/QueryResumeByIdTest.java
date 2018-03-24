package resume;

import com.windows3.po.Admin;
import com.windows3.po.Resume;
import com.windows3.service.AdminService;
import com.windows3.service.ResumeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 3 on 2018/3/12.
 */
public class QueryResumeByIdTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        ResumeService resumeService = (ResumeService) context.getBean("resumeService");
        Resume resume=new Resume();
        resume.setId(14);
        Resume resume1 = resumeService.queryResumeByResumeId(resume);
        System.out.println(resume1);
    }
}
