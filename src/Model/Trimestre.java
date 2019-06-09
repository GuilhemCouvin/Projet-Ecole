/**
 * 
 */
package Model;

import javax.swing.JTextField;

import DAO.DAO;
import DAO.TrimestreDAO;

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
	private int debut;
	private int fin;
	private String annee;
	/**
	 * Default Constructor 
	 */
	public Trimestre() {
		//Default constructor
	}
	/**
	 * Constructor
	 * @param id
	 * @param numero
	 * @param debut
	 * @param fin
	 * @param annee
	 */
	public Trimestre(int id, int numero, int debut, int fin, String annee) {
		this.setId(id);
		this.setNumero(numero);
		this.setDebut(debut);
		this.setFin(fin);
		this.setAnnee(annee);
	}
	/**
	 * 
	 * @param id
	 * @param numero
	 * @param debut
	 * @param fin
	 * @param annee
	 * @throws ClassNotFoundException
	 */
	public void ajouterTrimestre(JTextField id,JTextField numero,JTextField debut,JTextField fin,JTextField annee) throws ClassNotFoundException
    {
    DAO<Trimestre> TrimestreDao= new TrimestreDAO();
    Trimestre b = new Trimestre(Integer.parseInt(id.getText()),Integer.parseInt(numero.getText()),Integer.parseInt(debut.getText()),Integer.parseInt(fin.getText()), annee.getText());
    TrimestreDao.create(b);
    }
	/**
	 * 
	 * @param id
	 * @throws ClassNotFoundException
	 */
	public void supprimerTrimestre(JTextField id) throws ClassNotFoundException
    {
    DAO<Trimestre> TrimestreDao= new TrimestreDAO();
    TrimestreDao.delete(id.getText());
    }
	/**
	 * 
	 * @param id
	 * @param numero
	 * @param debut
	 * @param fin
	 * @param annee
	 * @throws ClassNotFoundException
	 */
	public void updateTrimestre(JTextField id,JTextField numero,JTextField debut,JTextField fin,JTextField annee) throws ClassNotFoundException
    {
    DAO<Trimestre> TrimestreDao= new TrimestreDAO();
    Trimestre p = new Trimestre(Integer.parseInt(id.getText()),Integer.parseInt(numero.getText()),Integer.parseInt(debut.getText()),Integer.parseInt(fin.getText()), annee.getText());
    TrimestreDao.update(p);
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
	public int getDebut() {
		return debut;
	}

	/**
	 * @param debut the debut to set
	 */
	public void setDebut(int debut) {
		this.debut = debut;
	}

	/**
	 * @return the fin
	 */
	public int getFin() {
		return fin;
	}

	/**
	 * @param fin the fin to set
	 */
	public void setFin(int fin) {
		this.fin = fin;
	}

	/**
	 * @return the annee
	 */
	public String getAnnee() {
		return annee;
	}

	/**
	 * @param annee the annee to set
	 */
	public void setAnnee(String annee) {
		this.annee = annee;
	}

}
