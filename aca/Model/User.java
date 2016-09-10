package Model;

import java.util.List;

import Util.IdGenerator;

public class User {
private String name;
private String password;
private final long id;
private MusColection playList;// im cragrum uzern uni mi playlist
public User(String name,String password,String playlistName)
{
id=IdGenerator.getId();
this.name=name;
playList=new MusColection(playlistName);
	
	}
public User(String name,String password)
{
	id=IdGenerator.getId();
	this.name=name;
	this.password=password;
	
	}
public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public long getId() {
	return id;
}

public MusColection getPlayList() {
	return playList;
}

}
