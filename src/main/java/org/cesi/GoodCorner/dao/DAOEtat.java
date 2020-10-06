***REMOVED***

import java.sql.PreparedStatement;
import java.sql.ResultSet;
***REMOVED***
import java.util.List;

import org.cesi.GoodCorner.persistent.Etat;

public class DAOEtat implements DAO<Etat, java.lang.Integer> {

	@Override
	public Etat getById(Integer id) {
		try {
			PreparedStatement pre = DAOEtat.conn.prepareStatement("SELECT * FROM etat WHERE id = ?");
			pre.setInt(1, id);
			
			ResultSet result = pre.executeQuery();
			
			if (result.first()) {
				
				Etat etat = new Etat(
						result.getInt("id"),
						result.getString("libelle")
					);

				return etat;
***REMOVED***
***REMOVED***

		catch (SQLException e) {
			e.printStackTrace();
***REMOVED***
		
		return null;
***REMOVED***

	@Override
	public Etat create(Etat bean) {
		// TODO Auto-generated method stub
		return null;
***REMOVED***

	@Override
	public Etat update(Etat bean) {
		// TODO Auto-generated method stub
		return null;
***REMOVED***

	@Override
	public List<Etat> getAll() {
		// TODO Auto-generated method stub
		return null;
***REMOVED***

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
***REMOVED***

***REMOVED***
