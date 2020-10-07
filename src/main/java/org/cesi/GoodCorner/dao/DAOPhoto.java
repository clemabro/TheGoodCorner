package org.cesi.GoodCorner.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.cesi.GoodCorner.persistent.Photo;

public class DAOPhoto implements DAO<Photo, java.lang.Integer> {

	@Override
	public Photo getById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Photo create(Photo bean) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Photo update(Photo bean) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Photo> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}

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
			}
			cursor.close();
			pre.close();
	
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
		return photos_list;
	}

}
