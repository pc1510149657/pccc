package a;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUserFactory {

	@Test
	public void test1() {
		User u1 = UserFactory.getUser();
		System.out.println(u1);
		
		User u2 = new UserFactory().getUser2();
		System.out.println(u2);
	}

	@Test
	public void test2() {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml", TestUserFactory.class);
		User user3 = (User) context.getBean("user3");
		System.out.println(user3);
	}
	
	@Test
	public void test3() {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml", TestUserFactory.class);
		User user4 = (User) context.getBean("user4");
		System.out.println(user4);
	}

}
