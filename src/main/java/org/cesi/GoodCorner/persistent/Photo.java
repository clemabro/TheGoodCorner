package org.cesi.GoodCorner.persistent;

public class Photo {
	private Integer id;
	private String chemin;
	
	/**
	 * @param id
	 * @param chemin
	 */
	public Photo(Integer id, String chemin) {
		this.id = id;
		this.chemin = chemin;
	}
	/**
	 * @param chemin
	 */
	public Photo(String chemin) {
		this.chemin = chemin;
	}
	/**
	 * 
	 */
	public Photo() {
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getChemin() {
		return chemin;
	}
	public void setChemin(String chemin) {
		this.chemin = chemin;
	}
}
