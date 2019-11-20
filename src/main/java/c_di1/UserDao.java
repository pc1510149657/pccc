package c_di1;

public class UserDao implements IUserDao {

	@Override
	public void login(String username, String password) {
		System.out.println("登录成功");
		System.out.println(username+"~~~"+password);
	}

}
