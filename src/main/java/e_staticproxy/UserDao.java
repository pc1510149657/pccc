package e_staticproxy;

public class UserDao implements IUserDao {

	@Override
	public void findUser() {

		System.out.println("找到用户");
	}

}
