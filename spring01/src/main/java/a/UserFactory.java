package a;

/**
 * 通过工厂的方法创建对象
 */
public class UserFactory {

	/**
	 * 静态方法创建对象
	 * 
	 * @return
	 */
	public static User getUser() {
		return new User(333, "静态工厂创建的对象", 33);
	}

	/**
	 * 非静态方法创建对象
	 * 
	 * @return
	 */
	public User getUser2() {
		return new User(222, "非静态工厂创建的对象", 22);
	}

}
