package c_di3;

public class UserService implements IUserService {

	private IUserDao userDao;
	
	
	public void setUserDao(IUserDao userDao) {
		this.userDao = userDao;
	}


	@Override
	public void login(String username, String password) {
		
		userDao.login(username,password);
	}

}
