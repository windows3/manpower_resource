package test;

import com.windows3.po.Customer;
import com.windows3.service.CustomerService;
import com.windows3.service.impl.CustomerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by 3 on 2018/3/12.
 */
public class CustomerTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        CustomerService customerService = (CustomerService) context.getBean("customerService");


        List<Customer> customers = customerService.queryAllCustomer();
        System.out.println(customers);
    }
}
