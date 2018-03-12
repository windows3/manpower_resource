package test;

import com.windows3.po.Admin;
import com.windows3.service.AdminService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by 3 on 2018/3/12.
 */
public class AdminTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        AdminService adminService = (AdminService) context.getBean("adminService");
        Admin admin=new Admin();
        admin.setAdminName("admin");
        admin.setAdminPassword("123456");

        Admin login = adminService.login(admin);
        System.out.println(login);
    }
}
