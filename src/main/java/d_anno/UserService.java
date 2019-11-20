package d_anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {

	@Autowired
	private IUserDao userDao;

//	public void setUserDao(IUserDao userDao) {
//		this.userDao = userDao;
//	}

	@Override
	public void login(String username, String password) {
		userDao.login(username, password);
	}

}
