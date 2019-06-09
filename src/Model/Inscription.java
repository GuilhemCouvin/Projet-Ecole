/**
 * 
 */
package Model;

import javax.swing.JTextField;

import DAO.DAO;
import DAO.InscriptionDAO;

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
	}
	/**
	 * 
	 * @param id
	 * @param id_classe
	 * @param id_personne
	 */
	public Inscription(int id, int id_classe,int id_personne) {
		this.id=id;
		this.id_classe=id_classe;
		this.id_personne=id_personne;
	}
	/**
	 * 
	 * @param id
	 * @param id_classe
	 * @param id_personne
	 * @throws ClassNotFoundException
	 */
	public void ajouterInscription(JTextField id,JTextField id_classe,JTextField id_personne) throws ClassNotFoundException
    {
    DAO<Inscription> InscriptionDao= new InscriptionDAO();
    Inscription b = new Inscription(Integer.parseInt(id.getText()),Integer.parseInt(id_classe.getText()),Integer.parseInt(id_personne.getText()));
    InscriptionDao.create(b);
    }
	/**
	 * 
	 * @param id
	 * @throws ClassNotFoundException
	 */
	public void supprimerInscription(JTextField id) throws ClassNotFoundException
    {
    DAO<Inscription> InscriptionDao= new InscriptionDAO();
    InscriptionDao.delete(id.getText());
    }
	/**
	 * 
	 * @param id
	 * @param id_classe
	 * @param id_personne
	 * @throws ClassNotFoundException
	 */
	public void updateInscription(JTextField id,JTextField id_classe,JTextField id_personne) throws ClassNotFoundException
    {
    DAO<Inscription> InscriptionDao= new InscriptionDAO();
    Inscription p = new Inscription(Integer.parseInt(id.getText()),Integer.parseInt(id_classe.getText()),Integer.parseInt(id_personne.getText()));
    InscriptionDao.update(p);
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
