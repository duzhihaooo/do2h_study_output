import com.dodo.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest2 {
		
		public static void main(String[] args) {
				//获取ApplicationContext，拿到Spring的容器
				ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
				
				//拿到容器，需要什么就get什么
				UserServiceImpl userServiceImpl = (UserServiceImpl) context.getBean("userServiceImpl");
				
				userServiceImpl.getUser();
				
		}
}