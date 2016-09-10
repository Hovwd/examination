package Model;

import java.util.ArrayList;
import java.util.List;

public class MusColection {
private String colectionName;
private List<Music> musics;
private List<Album> albums;
public MusColection(String name)
{
	this.colectionName=name;
	musics=new ArrayList();
	albums=new ArrayList();
	}
public List<Music> getMusics() {
	return musics;
}
public void setMusics(List<Music> musics) {
	this.musics = musics;
}
public List<Album> getAlbums() {
	return albums;
}
public void setAlbums(List<Album> albums) {
	this.albums = albums;
}
public String getColectionName() {
	return colectionName;
}
public void setColectionName(String colectionName) {
	this.colectionName = colectionName;
}

}

