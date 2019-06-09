package Model;

import java.util.*;

public class DetailBulletin {

	private int id;
	private int id_bulletin;
	private int id_enseignement;
	private String appreciation;
	
	public DetailBulletin(int id,int id_bulletin,int id_enseignement,String appreciation) {
		this.id=id;
		this.id_bulletin=id_bulletin;
		this.id_enseignement=id_enseignement;
		this.appreciation=appreciation;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the id_bulletin
	 */
	public int getId_bulletin() {
		return id_bulletin;
	}

	/**
	 * @param id_bulletin the id_bulletin to set
	 */
	public void setId_bulletin(int id_bulletin) {
		this.id_bulletin = id_bulletin;
	}

	/**
	 * @return the id_enseignement
	 */
	public int getId_enseignement() {
		return id_enseignement;
	}

	/**
	 * @param id_enseignement the id_enseignement to set
	 */
	public void setId_enseignement(int id_enseignement) {
		this.id_enseignement = id_enseignement;
	}

	/**
	 * @return the appreciation
	 */
	public String getAppreciation() {
		return appreciation;
	}

	/**
	 * @param appreciation the appreciation to set
	 */
	public void setAppreciation(String appreciation) {
		this.appreciation = appreciation;
	}

}
