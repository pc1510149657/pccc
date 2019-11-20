package c_di2;

public class UserAction {

	private IUserService userService;

	public void setUserService(IUserService userService) {
		this.userService = userService;
	}
	
	public void login(String username,String password) {
		userService.login(username,password);
	}
	
}
