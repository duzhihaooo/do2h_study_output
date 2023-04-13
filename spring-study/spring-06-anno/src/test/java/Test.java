import com.dodo.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        //拿到Spring容器
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        final User user = (User) context.getBean("user");
        System.out.println(user.name);
    }
}