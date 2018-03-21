package recruitMessage;

import com.windows3.po.RecruitMessage;
import com.windows3.service.RecruitMessageService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by 3 on 2018/3/20.
 */
public class QueryRecruitByStatus {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        RecruitMessageService recruitMessageService = (RecruitMessageService) context.getBean("recruitMessageService");

        List<RecruitMessage> recruitMessageList =
                recruitMessageService.queryRecruitByStatus(0);
        System.out.println(recruitMessageList);
    }
}
