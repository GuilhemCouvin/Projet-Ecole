/**
 * 
 */
package Model;

import java.util.*;

/**
 * @author Guilhem
 *
 */
public class Niveau {

	/**
	 * 
	 */
	private int id;
	private String nom;
	
	private ArrayList<Niveau> niveau;
	
	public Niveau() {
	}
	public Niveau(int id,String nom) {
		this.setId(id);
		this.setNom(nom);
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
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

}
