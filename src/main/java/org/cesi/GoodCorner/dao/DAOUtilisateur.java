***REMOVED***

import java.sql.PreparedStatement;
import java.sql.ResultSet;
***REMOVED***
import java.util.List;

import org.cesi.GoodCorner.persistent.TypeUtilisateur;
import org.cesi.GoodCorner.persistent.Utilisateur;

public class DAOUtilisateur implements DAO<Utilisateur, java.lang.Integer>{

	@Override
	public Utilisateur getById(Integer id) {
		// TODO Auto-generated method stub
		return null;
***REMOVED***
	
	public Utilisateur getByMail(String mail) {
		try {
			PreparedStatement pre = DAOUtilisateur.conn.prepareStatement("SELECT * FROM utilisateur WHERE Mail = ?");
			pre.setString(1, mail);
			
			ResultSet result = pre.executeQuery();
			
			if (result.first()) {
				TypeUtilisateur typeUser = new DAOTypeUtilisateur().getById(result.getInt("id_TypeUtilisateur"));
				
				Utilisateur oneUser = new Utilisateur(
						result.getString("Mail"),
						result.getString("MotDePasse"),
						result.getString("nom"),
						result.getString("prenom"),
						result.getString("telephone"),
						typeUser
						);

				return oneUser;
***REMOVED***
***REMOVED***

		catch (SQLException e) {
			e.printStackTrace();
***REMOVED***
		
		return null;
***REMOVED***

	@Override
	public Utilisateur create(Utilisateur bean) {
		try {
			PreparedStatement prepare = DAOUtilisateur.conn
					.prepareStatement("INSERT INTO utilisateur"
									+ " VALUES (?, ?, ?, ?, ?, ?)");
			
			prepare.setString(1, bean.getMail());
			prepare.setString(2, bean.getTelephone());
			prepare.setString(3, bean.getMotDePasse());
			prepare.setString(4, bean.getNom());
			prepare.setString(5, bean.getPrenom());
			prepare.setInt(6, bean.getTypeUtilisateur().getId());

			prepare.executeUpdate();
			
			return bean;
***REMOVED*** catch (SQLException e) {
			e.printStackTrace();
***REMOVED***
		return bean;

***REMOVED***

	@Override
	public Utilisateur update(Utilisateur bean) {
		try {
			PreparedStatement prepare = DAOUtilisateur.conn
					.prepareStatement("UPDATE utilisateur"
									+ " SET telephone = ?, motdepasse = ?, nom = ?, prenom = ?, id_TypeUtilisateur = ? WHERE mail = ?");
			
			
			prepare.setString(1, bean.getTelephone());
			prepare.setString(2, bean.getMotDePasse());
			prepare.setString(3, bean.getNom());
			prepare.setString(4, bean.getPrenom());
			prepare.setInt(5, bean.getTypeUtilisateur().getId());
			prepare.setString(6, bean.getMail());

			prepare.executeUpdate();
			
			return bean;
***REMOVED*** catch (SQLException e) {
			e.printStackTrace();
***REMOVED***
		return bean;
***REMOVED***

	@Override
	public List<Utilisateur> getAll() {
		// TODO Auto-generated method stub
		return null;
***REMOVED***

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
***REMOVED***

***REMOVED***
