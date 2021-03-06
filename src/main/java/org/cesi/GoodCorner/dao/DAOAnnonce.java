package org.cesi.GoodCorner.dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.cesi.GoodCorner.persistent.Annonce;
import org.cesi.GoodCorner.persistent.Categorie;
import org.cesi.GoodCorner.persistent.Etat;
import org.cesi.GoodCorner.persistent.Photo;
import org.cesi.GoodCorner.persistent.TypeAnnonce;
import org.cesi.GoodCorner.persistent.Utilisateur;

public class DAOAnnonce implements DAO<Annonce, java.lang.Integer> {

	@Override
	public Annonce getById(Integer id) {
		try {
			PreparedStatement pre = DAOTypeAnnonce.conn.prepareStatement("SELECT * FROM annonce WHERE id = ?");
			pre.setInt(1, id);
			
			ResultSet cursor = pre.executeQuery();
			
			if (cursor.first()) {
				
				Utilisateur user = new DAOUtilisateur().getByMail(cursor.getString("Mail"));
				TypeAnnonce typeAnnonce = new DAOTypeAnnonce().getById(cursor.getInt("id_TypeAnnonce"));
				Categorie cat = new DAOCategorie().getById(cursor.getInt("id_Categorie"));
				Etat etat = new DAOEtat().getById(cursor.getInt("id_Etat"));
				List<Photo> photosAnnonce = new DAOPhoto().getByIdAnnonce(cursor.getInt("id"));
				
				Annonce oneAnnonce = new Annonce(
						cursor.getInt("id"), 
						cursor.getString("titre"),
						cursor.getString("description"),
						cursor.getInt("prix"),
						cursor.getString("ville"),
						cursor.getDate("dateCreation"),
						cursor.getDate("dateUpdate"),
						user,
						typeAnnonce,
						cat,
						etat,
						photosAnnonce
						);
				
				return oneAnnonce;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public Annonce create(Annonce bean) {
		try {
			PreparedStatement prepare = DAOUtilisateur.conn
					.prepareStatement("INSERT INTO annonce (titre, description, prix, ville, dateCreation, dateUpdate, Mail, id_TypeAnnonce, id_Categorie, id_Etat)"
									+ " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
			
			Calendar calendar = Calendar.getInstance();
			prepare.setString(1, bean.getTitre());
			prepare.setString(2, bean.getDescription());
			prepare.setInt(3, (int) bean.getPrix());
			prepare.setString(4, bean.getVille());
			prepare.setDate(5, new Date(calendar.getTime().getTime()));
			prepare.setDate(6, new Date(calendar.getTime().getTime()));
			prepare.setString(7, bean.getUtilisateur().getMail());
			prepare.setInt(8, bean.getTypeAnnonce().getId());
			prepare.setInt(9, bean.getCategorie().getId());
			// Etat mis à vide pour l'instant
			prepare.setInt(10, 1);

			prepare.executeUpdate();
			
			return bean;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return bean;
	}

	@Override
	public Annonce update(Annonce bean) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Annonce> getAll() {
		// Definition of the list returned
		List<Annonce> annonces_list = new ArrayList<Annonce>();

		// Declaration of the object used for the sql query
		try {

			Statement query = DAOAnnonce.conn.createStatement();

			ResultSet cursor = query.executeQuery("SELECT * FROM annonce ORDER BY id DESC");

			while (cursor.next()) {
				Utilisateur user = new DAOUtilisateur().getByMail(cursor.getString("Mail"));
				TypeAnnonce typeAnnonce = new DAOTypeAnnonce().getById(cursor.getInt("id_TypeAnnonce"));
				Categorie cat = new DAOCategorie().getById(cursor.getInt("id_Categorie"));
				Etat etat = new DAOEtat().getById(cursor.getInt("id_Etat"));
				List<Photo> photosAnnonce = new DAOPhoto().getByIdAnnonce(cursor.getInt("id"));
				
				Annonce oneAnnonce = new Annonce(
						cursor.getInt("id"), 
						cursor.getString("titre"),
						cursor.getString("description"),
						cursor.getInt("prix"),
						cursor.getString("ville"),
						cursor.getDate("dateCreation"),
						cursor.getDate("dateUpdate"),
						user,
						typeAnnonce,
						cat,
						etat,
						photosAnnonce
						);

				annonces_list.add(oneAnnonce);
			}
			
			cursor.close();
			query.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return annonces_list;
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}

	public List<Annonce> getByIdCategorie(Integer idCategorie) {
		// Definition of the list returned
		List<Annonce> annonces_list = new ArrayList<Annonce>();
	
		// Declaration of the object used for the sql query
		try {			
			PreparedStatement pre = DAOPhoto.conn.prepareStatement("SELECT * FROM annonce WHERE id_Categorie = ?");
			pre.setInt(1, idCategorie);
			
			ResultSet cursor = pre.executeQuery();
	
			while (cursor.next()) {
				Utilisateur user = new DAOUtilisateur().getByMail(cursor.getString("Mail"));
				TypeAnnonce typeAnnonce = new DAOTypeAnnonce().getById(cursor.getInt("id_TypeAnnonce"));
				Categorie cat = new DAOCategorie().getById(cursor.getInt("id_Categorie"));
				Etat etat = new DAOEtat().getById(cursor.getInt("id_Etat"));
				List<Photo> photosAnnonce = new DAOPhoto().getByIdAnnonce(cursor.getInt("id"));
				
				Annonce oneAnnonce = new Annonce(
						cursor.getInt("id"), 
						cursor.getString("titre"),
						cursor.getString("description"),
						cursor.getInt("prix"),
						cursor.getString("ville"),
						cursor.getDate("dateCreation"),
						cursor.getDate("dateUpdate"),
						user,
						typeAnnonce,
						cat,
						etat,
						photosAnnonce
						);

				annonces_list.add(oneAnnonce);
			}
			cursor.close();
			pre.close();
	
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
		return annonces_list;
	}

	public List<Annonce> getByIdCategorieAndTypeAnnonce(Integer idCategorie, Integer idTypeAnnonce) {
		// Definition of the list returned
		List<Annonce> annonces_list = new ArrayList<Annonce>();
	
		// Declaration of the object used for the sql query
		try {			
			PreparedStatement pre = DAOPhoto.conn.prepareStatement("SELECT * FROM annonce WHERE id_Categorie = ? AND id_TypeAnnonce = ?");
			pre.setInt(1, idCategorie);
			pre.setInt(2, idTypeAnnonce);
			
			ResultSet cursor = pre.executeQuery();
	
			while (cursor.next()) {
				Utilisateur user = new DAOUtilisateur().getByMail(cursor.getString("Mail"));
				TypeAnnonce typeAnnonce = new DAOTypeAnnonce().getById(cursor.getInt("id_TypeAnnonce"));
				Categorie cat = new DAOCategorie().getById(cursor.getInt("id_Categorie"));
				Etat etat = new DAOEtat().getById(cursor.getInt("id_Etat"));
				List<Photo> photosAnnonce = new DAOPhoto().getByIdAnnonce(cursor.getInt("id"));
				
				Annonce oneAnnonce = new Annonce(
						cursor.getInt("id"), 
						cursor.getString("titre"),
						cursor.getString("description"),
						cursor.getInt("prix"),
						cursor.getString("ville"),
						cursor.getDate("dateCreation"),
						cursor.getDate("dateUpdate"),
						user,
						typeAnnonce,
						cat,
						etat,
						photosAnnonce
						);

				annonces_list.add(oneAnnonce);
			}
			cursor.close();
			pre.close();
	
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
		return annonces_list;
	}

	public List<Annonce> getAllByTypeAnnonce(Integer idTypeAnnonce) {
		// Definition of the list returned
		List<Annonce> annonces_list = new ArrayList<Annonce>();
	
		// Declaration of the object used for the sql query
		try {			
			PreparedStatement pre = DAOPhoto.conn.prepareStatement("SELECT * FROM annonce WHERE id_TypeAnnonce = ?");
			pre.setInt(1, idTypeAnnonce);
			
			ResultSet cursor = pre.executeQuery();
	
			while (cursor.next()) {
				Utilisateur user = new DAOUtilisateur().getByMail(cursor.getString("Mail"));
				TypeAnnonce typeAnnonce = new DAOTypeAnnonce().getById(cursor.getInt("id_TypeAnnonce"));
				Categorie cat = new DAOCategorie().getById(cursor.getInt("id_Categorie"));
				Etat etat = new DAOEtat().getById(cursor.getInt("id_Etat"));
				List<Photo> photosAnnonce = new DAOPhoto().getByIdAnnonce(cursor.getInt("id"));
				
				Annonce oneAnnonce = new Annonce(
						cursor.getInt("id"), 
						cursor.getString("titre"),
						cursor.getString("description"),
						cursor.getInt("prix"),
						cursor.getString("ville"),
						cursor.getDate("dateCreation"),
						cursor.getDate("dateUpdate"),
						user,
						typeAnnonce,
						cat,
						etat,
						photosAnnonce
						);

				annonces_list.add(oneAnnonce);
			}
			cursor.close();
			pre.close();
	
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
		return annonces_list;
	}

}
