package User;


import Model.User;
import Util.NoExistException;

public interface UserRepositoryInterface {
public User getUser(long id) throws NoExistException;
public boolean editUser(long id) throws NoExistException;
public boolean deletUser(String Name) throws NoExistException;
public boolean addUser(String name,String password);

}
