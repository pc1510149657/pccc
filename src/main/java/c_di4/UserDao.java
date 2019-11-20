package c_di4;

public class UserDao implements IUserDao {

	@Override
	public void login(String username, String password) {
		System.out.println("登录成功, 账号信息:");
		System.out.println(username + " --- " + password);
	}

}
