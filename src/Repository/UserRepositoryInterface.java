package Repository;

import bean.User;

public interface UserRepositoryInterface {
public User getUser(String Name);
public boolean editUser();
public void deletUser(String Name);
public void addUser(String name,String password);

}
