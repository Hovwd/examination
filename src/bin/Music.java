package bin;

public class Music {
String songName;
double duraction;
String author;
PlayList playList;
String path;

public Music(){} 

Override
public String toString()
{
	return (author+" "+songName+" "+duraction);
	}
Override 
@Override
public boolean equals(Object obj){
    if (obj == null) return false;
    if (obj == this) return true;
    if (!(obj instanceof Music))return false;
    Music music = (Music)obj;
    return music.songName.equals(this.songName) &&  music.author.equals(this.author);
   
}

}
