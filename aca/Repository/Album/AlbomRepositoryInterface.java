package Album;


import Model.Album;
import Util.NoExistException;

public interface AlbomRepositoryInterface {
	public Album getAlbums();
	public boolean AddAlbum(String name) throws NoExistException;
	public boolean deleteAlbum();
	public boolean addAlbumColection(String colName, long Id);
	
}
