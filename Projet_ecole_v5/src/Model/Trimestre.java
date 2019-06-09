/**
 * 
 */
package Model;

import java.util.*;

/**
 * @author Guilhem
 *
 */
public class Trimestre {

	/**
	 * Attributes
	 */
	private int id;
	private int numero;
	private Date debut;
	private Date fin;
	private AnneeScolaire annee;
	
	public Trimestre() {
		//Default constructor
	}
	public Trimestre(int id, int numero, Date debut, Date fin, AnneeScolaire annee) {
		this.setId(id);
		this.setNumero(numero);
		this.setDebut(debut);
		this.setFin(fin);
		this.setAnnee(annee);
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
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * @param numero the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}

	/**
	 * @return the debut
	 */
	public Date getDebut() {
		return debut;
	}

	/**
	 * @param debut the debut to set
	 */
	public void setDebut(Date debut) {
		this.debut = debut;
	}

	/**
	 * @return the fin
	 */
	public Date getFin() {
		return fin;
	}

	/**
	 * @param fin the fin to set
	 */
	public void setFin(Date fin) {
		this.fin = fin;
	}

	/**
	 * @return the annee
	 */
	public AnneeScolaire getAnnee() {
		return annee;
	}

	/**
	 * @param annee the annee to set
	 */
	public void setAnnee(AnneeScolaire annee) {
		this.annee = annee;
	}

}
