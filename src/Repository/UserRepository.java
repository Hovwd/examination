package Repository;

import bean.User;

public class UserRepository {
	static UserRepository userRepository ;
	public static UserRepository getInstance()
	{
		if(userRepository==null)
		{
			return new UserRepository();
		}
		return userRepository;
		}
	User getUser(String name)throws Exception
	{
		return null;	
	}
	void addUser(){}
	void DeletUser(){}
}
