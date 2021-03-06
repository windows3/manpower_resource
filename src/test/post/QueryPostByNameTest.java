package post;

import com.windows3.po.Post;
import com.windows3.service.PostService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by 3 on 2018/3/20.
 */
public class QueryPostByNameTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        PostService postService = (PostService) context.getBean("postService");
        Post post=new Post();

        post.setPostName("1");
        List<Post> posts = postService.queryPostByName(post);
        System.out.println(posts);
    }
}
