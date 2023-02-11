import com.dodo.dao.UserDaoImpl;
import com.dodo.dao.UserDaoOracleImpl;
import com.dodo.service.UserServiceImpl;

public class MyTest {
		
		public static void main(String[] args) {
				
				//用户实际调用的是业务层，dao层用户不需要接触！
				final UserServiceImpl userService = new UserServiceImpl();
				userService.setUserDao(new UserDaoOracleImpl());
				userService.getUser();
				
				
		}
}