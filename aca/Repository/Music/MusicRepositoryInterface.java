package Music;

import Model.Music;
import Util.NoExistException;

public interface MusicRepositoryInterface {
	public Music getMusic(long id) throws NoExistException ;
	public boolean AddMusic(Music m) ;
	public boolean deleteAlbum(String NAme)throws NoExistException;
	public boolean addMusicColection(String colName, long musId) throws NoExistException;
	public boolean addMusicAlbum(String colName,String AlbumName)throws NoExistException;
}
