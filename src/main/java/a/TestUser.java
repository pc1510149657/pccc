package a;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {

	@Test
	public void test1() {

		User user = new User();
		System.out.println(user);

		User user2 = new User(111, "siri", 5);
		System.out.println(user2);
	}
	
	/**
	 * 获取ApplicationContext的三种方式:<br>
	 * ClassPathXmlApplicationContext （从类路径中加载）<br>
	 * FileSystemXmlApplicationContext （从文件系统中加载）<br>
	 * XmlWebApplicationContext （从web系统中加载) <br>
	 * 
	 * 
	 * 我们在通过ApplicationContext中的getBean获取对象的时候, <br>
	 * 其实是首先获取到BeanFactory的对象, <br>
	 * 然后通过BeanFactory中的getBean的方法获取到对象的实例.
	 */

	@Test
	public void test2() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml", TestUser.class);
		// System.out.println(context);
		User user = (User) context.getBean("user");
		System.out.println(user);

		User uu = (User) context.getBean("user");
		System.out.println(uu);

		System.out.println(user == uu);
		
		/**
		 * 销毁IOC
		 */
		context.destroy();
	}

	@Test
	public void test3() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml", TestUser.class);
		// System.out.println(context);
		User user = (User) context.getBean("user2");
		System.out.println(user);
	}

}
