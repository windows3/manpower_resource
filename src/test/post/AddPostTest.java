package post;

import com.windows3.po.Post;
import com.windows3.service.PostService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 3 on 2018/3/20.
 */
public class AddPostTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        PostService postService = (PostService) context.getBean("postService");
        Post post=new Post();
        post.setAdminId(2);
        post.setDepartmentId(3);
        post.setPostName("1");
        boolean b = postService.addPost(post);
        System.out.println(b);
    }
}
