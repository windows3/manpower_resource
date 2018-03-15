package test;

import com.windows3.po.Department;
import com.windows3.service.DepartmentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 3 on 2018/3/16.
 */
public class DepartmentTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        DepartmentService departmentService = (DepartmentService) context.getBean("departmentService");
        Department department =new Department();
        department.setDepartmentName("人事");
        boolean b = departmentService.addDepartment(department);
        System.out.println(b);

    }
}
