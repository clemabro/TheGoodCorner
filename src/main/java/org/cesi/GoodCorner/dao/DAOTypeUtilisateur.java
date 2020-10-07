***REMOVED***

import java.sql.PreparedStatement;
import java.sql.ResultSet;
***REMOVED***
import java.util.List;

import org.cesi.GoodCorner.persistent.TypeUtilisateur;

public class DAOTypeUtilisateur implements DAO<TypeUtilisateur, java.lang.Integer> {

	@Override
	public TypeUtilisateur getById(Integer id) {
		try {
			PreparedStatement pre = DAOTypeAnnonce.conn.prepareStatement("SELECT * FROM typeutilisateur WHERE id = ?");
			pre.setInt(1, id);
			
			ResultSet result = pre.executeQuery();
			
			if (result.first()) {
				
				TypeUtilisateur type = new TypeUtilisateur(
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
	public TypeUtilisateur create(TypeUtilisateur bean) {
		// TODO Auto-generated method stub
		return null;
***REMOVED***

	@Override
	public TypeUtilisateur update(TypeUtilisateur bean) {
		// TODO Auto-generated method stub
		return null;
***REMOVED***

	@Override
	public List<TypeUtilisateur> getAll() {
		// TODO Auto-generated method stub
		return null;
***REMOVED***

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
***REMOVED***

***REMOVED***
