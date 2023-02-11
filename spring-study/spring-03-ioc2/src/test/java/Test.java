import com.dodo.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
		
		public static void main(String[] args) {
				//拿到Spring容器
				ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
				
				User user = (User) context.getBean("u4");
				
				user.show();
		}
}