/**
 * 
 */
package Model;

import java.util.*;

/**
 * @author Guilhem
 *
 */
public class Inscription {

	/**
	 * 
	 */
	private int id;
	private int id_classe;
	private int id_personne;
	
	public Inscription() {
		this.id=0;
		this.id_classe=0;
		this.id_personne=0;
	}
	
	public Inscription(int id, int id_classe,int id_personne) {
		this.id=id;
		this.id_classe=id_classe;
		this.id_personne=id_personne;
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
	 * @return the id_classe
	 */
	public int getId_classe() {
		return id_classe;
	}

	/**
	 * @param id_classe the id_classe to set
	 */
	public void setId_classe(int id_classe) {
		this.id_classe = id_classe;
	}

	/**
	 * @return the id_personne
	 */
	public int getId_personne() {
		return id_personne;
	}

	/**
	 * @param id_personne the id_personne to set
	 */
	public void setId_personne(int id_personne) {
		this.id_personne = id_personne;
	}

}
