package applyForMessage;

import com.windows3.po.ApplyForMessage;
import com.windows3.service.ApplyForMessageService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 3 on 2018/3/23.
 */
public class AddApplyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        ApplyForMessageService applyForMessageService = (ApplyForMessageService) context.getBean("applyForMessageService");
        ApplyForMessage applyForMessage=new ApplyForMessage();
        applyForMessage.setResumeId(14);
        applyForMessage.setRecruitMessageId(13);


        boolean b = applyForMessageService.addApply(applyForMessage);
        System.out.println(b);
    }
}
