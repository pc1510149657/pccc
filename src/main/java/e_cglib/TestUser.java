package e_cglib;

/**
 * 使用CGLIB执行
 */
public class TestUser {

	public static void main(String[] args) {

		// 创建出目标对象
		UserDao dao = new UserDao();
		System.out.println("dao:" + dao.getClass());
		// dao:class b_cglib.UserDao
		// dao:class b_cglib.UserDao

		// 创建出代理对象
		UserDao proxy = (UserDao) new UserProxy(dao).getProxyInstance();
		System.out.println("proxy:" + proxy.getClass());
		// proxy:class b_cglib.UserDao$$EnhancerByCGLIB$$bf669414
		// proxy:class b_cglib.UserDao$$EnhancerByCGLIB$$def9b041
		
		// 执行方法
		proxy.findUser();

	}

}
