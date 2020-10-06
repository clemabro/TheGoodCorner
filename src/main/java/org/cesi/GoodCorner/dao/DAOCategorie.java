***REMOVED***

import java.sql.ResultSet;
***REMOVED***
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.cesi.GoodCorner.persistent.Categorie;

public class DAOCategorie implements DAO<Categorie, java.lang.Integer> {

	@Override
	public Categorie getById(Integer id) {
		// TODO Auto-generated method stub
		return null;
***REMOVED***

	@Override
	public Categorie create(Categorie bean) {
		// TODO Auto-generated method stub
		return null;
***REMOVED***

	@Override
	public Categorie update(Categorie bean) {
		// TODO Auto-generated method stub
		return null;
***REMOVED***

	@Override
	public List<Categorie> getAll() {
		// Definition of the list returned
		List<Categorie> cat_list = new ArrayList<Categorie>();

		// Declaration of the object used for the sql query
		try {

			Statement query = DAOCategorie.conn.createStatement();

			ResultSet cursor = query.executeQuery("SELECT * FROM categorie");

			while (cursor.next()) {
				Categorie oneCat = new Categorie(new Integer(cursor.getInt("id")), cursor.getString("libelle"));

				cat_list.add(oneCat);
***REMOVED***
			cursor.close();
			query.close();

***REMOVED*** catch (SQLException e) {
			e.printStackTrace();
***REMOVED***

		return cat_list;
***REMOVED***

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
***REMOVED***

***REMOVED***
