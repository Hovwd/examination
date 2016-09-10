package Repository;

import Exception.NoExistException;
import bean.Album;

public class AlbumRepository implements AlbomRepositoryInterface{
	static AlbumRepository albums;
	public static AlbumRepository getInstance()
	{
		if(albums==null)
		{
			 albums = new AlbumRepository();
		}
		return albums;
		}
	@Override
	public Album getAlbums() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean AddAlbum(String name) throws NoExistException {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean deleteAlbum() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean addAlbumColection(String colName, long Id) {
		// TODO Auto-generated method stub
		return false;
	}

}
