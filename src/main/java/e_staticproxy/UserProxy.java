package e_staticproxy;

public class UserProxy {

	private IUserDao dao;

	public UserProxy(IUserDao dao) {
		super();
		this.dao = dao;
	}
	
	
	public void findUser() {

		System.out.println("正在查找用户");
		dao.findUser();
		System.out.println("真好");
	}
}
