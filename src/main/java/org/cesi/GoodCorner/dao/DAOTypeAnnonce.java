***REMOVED***

import java.sql.PreparedStatement;
import java.sql.ResultSet;
***REMOVED***
import java.util.List;

import org.cesi.GoodCorner.persistent.TypeAnnonce;

public class DAOTypeAnnonce implements DAO<TypeAnnonce, java.lang.Integer> {

	@Override
	public TypeAnnonce getById(Integer id) {
		try {
			PreparedStatement pre = DAOTypeAnnonce.conn.prepareStatement("SELECT * FROM typeutilisateur WHERE id = ?");
			pre.setInt(1, id);
			
			ResultSet result = pre.executeQuery();
			
			if (result.first()) {
				
				TypeAnnonce type = new TypeAnnonce(
						result.getInt("id"),
						result.getString("libelle")
						);

				return type;
***REMOVED***
***REMOVED***

		catch (SQLException e) {
			e.printStackTrace();
***REMOVED***
		
		return null;
***REMOVED***

	@Override
	public TypeAnnonce create(TypeAnnonce bean) {
		// TODO Auto-generated method stub
		return null;
***REMOVED***

	@Override
	public TypeAnnonce update(TypeAnnonce bean) {
		// TODO Auto-generated method stub
		return null;
***REMOVED***

	@Override
	public List<TypeAnnonce> getAll() {
		// TODO Auto-generated method stub
		return null;
***REMOVED***

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
***REMOVED***

***REMOVED***
