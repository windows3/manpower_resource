package recruitMessage;

import com.windows3.po.RecruitMessage;
import com.windows3.service.RecruitMessageService;
import org.apache.ibatis.session.RowBounds;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by 3 on 2018/3/20.
 */
public class QueryRecruitByStatus {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        RecruitMessageService recruitMessageService = (RecruitMessageService) context.getBean("recruitMessageService");
        //跳过几行
        int offset = 0;
        //取几行
        int limit = 1;

        RowBounds rb = new RowBounds(offset, limit);
        List<RecruitMessage> recruitMessageList =
                recruitMessageService.queryRecruitByStatus(1,1);
        System.out.println(recruitMessageList);

    }
}
