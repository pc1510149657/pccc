package b;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {

	@Test
	public void test1() {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("bean.xml",this.getClass());
		
		User user=(User) context.getBean("user");
		System.out.println(user);
	}
}
