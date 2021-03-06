package applyForMessage;

import com.windows3.po.ApplyForMessage;
import com.windows3.service.ApplyForMessageService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by 3 on 2018/3/23.
 */
public class QueryBySeeApplyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        ApplyForMessageService applyForMessageService = (ApplyForMessageService) context.getBean("applyForMessageService");


        List<ApplyForMessage> applyForMessages = applyForMessageService.queryBySee(0);
        System.out.println(applyForMessages);
    }
}
