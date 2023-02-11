import com.dodo.pojo.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
		
		public static void main(String[] args) {
				ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
				
				Hello hello = (Hello) context.getBean("hello");
				System.out.println(hello);
		}
}