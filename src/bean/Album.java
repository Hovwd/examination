package bean;
import java.util.List;
public class Album {
private String name;
private String authorName;
private List<Music> albumMusics;

public int getMusicCount() {
	return albumMusics.size();
}
public boolean addMusic(Music mus)
{
	// petq e stugi ete hexinaki anunner@ nuynne kavelacni albomi mej
	return false;
	}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAuthorName() {
	return authorName;
}
public void setAuthorName(String authorName) {
	this.authorName = authorName;
}
public List<Music> getAlbum()
{
	return albumMusics;
	}
public boolean deleteMusic(String name)
{
	return false;
	
	}

}
