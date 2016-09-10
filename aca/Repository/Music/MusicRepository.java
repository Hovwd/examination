package Music;

import Model.Album;
import Model.Music;
import Util.NoExistException;
public class MusicRepository implements MusicRepositoryInterface{
	private MusicRepository(){}
	static MusicRepository musics;
	public static MusicRepository getInstance()
	{
		if(musics==null)
		{
			 musics = new MusicRepository();
		}
		return musics;
		}
	@Override
	public Music getMusic(long id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean AddMusic(Music m) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean deleteAlbum(String NAme) throws NoExistException {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean addMusicColection(String colName, long musId) throws NoExistException {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean addMusicAlbum(String colName, String AlbumName) throws NoExistException {
		// TODO Auto-generated method stub
		return false;
	}

}
