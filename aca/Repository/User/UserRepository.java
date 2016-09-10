package Repository;

import bean.User;

public class UserRepository implements UserRepositoryInterface {
	static UserRepository userRepository ;
	public static UserRepository getInstance()
	{
		if(userRepository==null)
		{
			userRepository = new UserRepository();
		}
		return userRepository;
		}
	@Override
	public User getUser(String Name) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean editUser() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void deletUser(String Name) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void addUser(String name, String password) {
		// TODO Auto-generated method stub
		
	}

}
