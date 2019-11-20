package d_anno;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {

	@Test
	public void test1() {

		String username = "siri";
		String password = "siri123";

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml", TestUser.class);

		UserAction action = (UserAction) context.getBean("userAction");

		action.login(username, password);

	}

}
