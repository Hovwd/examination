package Repository;

import Exception.NoExistException;
import bean.Album;
import bean.Music;

public interface MusicRepositoryInterface {
	public Music getMusic(long id) ;
	public boolean AddMusic(Music m);
	public boolean deleteAlbum(String NAme)throws NoExistException;
	public boolean addMusicColection(String colName, long musId) throws NoExistException;
	public boolean addMusicAlbum(String colName,String AlbumName)throws NoExistException;
}
