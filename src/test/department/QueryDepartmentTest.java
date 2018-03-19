package department;

import com.windows3.po.Department;
import com.windows3.service.DepartmentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by 3 on 2018/3/20.
 */
public class QueryDepartmentTest {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        DepartmentService departmentService = (DepartmentService) context.getBean("departmentService");
        Department department =new Department();
        department.setDepartmentName("1");
        List<Department> departments = departmentService.queryDepartment(department);
        System.out.println(departments);
    }
}
