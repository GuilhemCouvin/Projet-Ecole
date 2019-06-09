/**
 * 
 */
package Model;

import java.util.*;

/**
 * @author Guilhem
 *
 */
public class Classe {

	/**
	 * 
	 */
	private int id;
	private String nom;
	private int id_ecole;
	private int id_niveau;
	private int id_annee;
	
	public Classe() {
		
	}
	
	public Classe(int id,String nom,int id_ecole,int id_niveau,int id_annee) {
		this.id=id;
		this.nom=nom;
		this.id_annee=id_annee;
		this.id_ecole=id_ecole;
		this.id_niveau=id_niveau;
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
	 * @return the id_ecole
	 */
	public int getId_ecole() {
		return id_ecole;
	}

	/**
	 * @param id_ecole the id_ecole to set
	 */
	public void setId_ecole(int id_ecole) {
		this.id_ecole = id_ecole;
	}

	/**
	 * @return the id_niveau
	 */
	public int getId_niveau() {
		return id_niveau;
	}

	/**
	 * @param id_niveau the id_niveau to set
	 */
	public void setId_niveau(int id_niveau) {
		this.id_niveau = id_niveau;
	}

	/**
	 * @return the id_annee
	 */
	public int getId_annee() {
		return id_annee;
	}

	/**
	 * @param id_annee the id_annee to set
	 */
	public void setId_annee(int id_annee) {
		this.id_annee = id_annee;
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
