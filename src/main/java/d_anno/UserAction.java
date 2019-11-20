package d_anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserAction {

	@Autowired
	private IUserService userService;

//	public void setUserService(IUserService userService) {
//		this.userService = userService;
//	}

	public void login(String username, String password) {
		userService.login(username, password);
	}

}
