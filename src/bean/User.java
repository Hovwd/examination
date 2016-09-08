package bean;

import java.util.List;

public class User {
private String name;
private String password;
private final long id;
private MusColection playList;// im cragrum uzern uni mi playlist
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
