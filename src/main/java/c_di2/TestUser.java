package c_di2;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {

	@Test
	public void test1() {
		String username="siri";
		String password ="siri123";
		
		ApplicationContext context =new ClassPathXmlApplicationContext("bean.xml",this.getClass());
		
		UserAction action = (UserAction) context.getBean("userAction");
		
		action.login(username, password);
	}
}
