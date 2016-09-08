package bean;

public class Music {
private String songName;
private double duraction;
private String author;
private boolean isPlay;
private MusColection playList;
public String getSongName() {
	return songName;
}
public void setSongName(String songName) {
	this.songName = songName;
}
public double getDuraction() {
	return duraction;
}
public void setDuraction(double duraction) {
	this.duraction = duraction;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public MusColection getPlayList() {
	return playList;
}
public void setPlayList(MusColection playList) {
	this.playList = playList;
}

public String toString()
{
	return (author+" "+songName+" "+duraction);
	}

@Override
public boolean equals(Object obj){
    if (obj == null) return false;
    if (obj == this) return true;
    if (!(obj instanceof Music))return false;
    Music music = (Music)obj;
    return music.songName.equals(this.songName) &&  music.author.equals(this.author); 
}
public void play()
{
	isPlay=true;
	}
public void stop()
{
	isPlay=false;
			}

}
