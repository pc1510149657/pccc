package e_staticproxy;

public class TestUser {

	public static void main(String[] args) {
		IUserDao dao=new UserDao();
		
		UserProxy proxy=new UserProxy(dao);
		proxy.findUser();
	}
}
