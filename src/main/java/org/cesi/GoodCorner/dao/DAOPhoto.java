***REMOVED***

import java.sql.PreparedStatement;
import java.sql.ResultSet;
***REMOVED***
import java.util.ArrayList;
import java.util.List;

import org.cesi.GoodCorner.persistent.Photo;

public class DAOPhoto implements DAO<Photo, java.lang.Integer> {

	@Override
	public Photo getById(Integer id) {
		// TODO Auto-generated method stub
		return null;
***REMOVED***

	@Override
	public Photo create(Photo bean) {
		// TODO Auto-generated method stub
		return null;
***REMOVED***

	@Override
	public Photo update(Photo bean) {
		// TODO Auto-generated method stub
		return null;
***REMOVED***

	@Override
	public List<Photo> getAll() {
		// TODO Auto-generated method stub
		return null;
***REMOVED***

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
***REMOVED***

	public List<Photo> getByIdAnnonce(int idAnnonce) {
		// Definition of the list returned
		List<Photo> photos_list = new ArrayList<Photo>();
	
		// Declaration of the object used for the sql query
		try {			
			PreparedStatement pre = DAOPhoto.conn.prepareStatement("SELECT * FROM photos WHERE id_Annonce = ?");
			pre.setInt(1, idAnnonce);
			
			ResultSet cursor = pre.executeQuery();
	
			while (cursor.next()) {
				Photo onePic = new Photo(cursor.getInt("id"), cursor.getString("chemin"));
	
				photos_list.add(onePic);
***REMOVED***
			cursor.close();
			pre.close();
	
***REMOVED*** catch (SQLException e) {
			e.printStackTrace();
***REMOVED***
	
		return photos_list;
***REMOVED***

***REMOVED***
