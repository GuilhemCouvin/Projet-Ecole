/**
 * 
 */
package Model;

import java.util.ArrayList;

import javax.swing.JTextField;

import DAO.AnneeScolaireDAO;
import DAO.DAO;


/**
 * @author Guilhem
 *
 */
public class AnneeScolaire {
	
	/**
	 * Attributes
	 */
	private int id;
	private String annee;
	
	
	/**
	 * Constructors
	 */
	public AnneeScolaire() {
		this.setId(0);
		this.setAnnee("");
	}
	/**
	 * 
	 * @param id
	 * @param annee
	 */
	public AnneeScolaire(int id,String annee) {
		this.setId(id);
		this.setAnnee(annee);
	}
	/**
	 * 
	 * @param id
	 * @throws ClassNotFoundException
	 */
	public void ajouterAnnee(JTextField id,JTextField annee) throws ClassNotFoundException
    {
    DAO<AnneeScolaire> AnneeDao= new AnneeScolaireDAO();
    AnneeScolaire a = new AnneeScolaire(Integer.parseInt(id.getText()),annee.getText());
    AnneeDao.create(a);
    }
	/**
	 * 
	 * @param id
	 * @throws ClassNotFoundException
	 */
	public void supprimerAnnee(JTextField id) throws ClassNotFoundException
    {
    DAO<AnneeScolaire> AnneeScolaireDao= new AnneeScolaireDAO();
    AnneeScolaireDao.delete(id.getText());
    }
	/**
	 * 
	 * @param id
	 * @throws ClassNotFoundException
	 */
	public void updateAnnee(JTextField id,JTextField annee) throws ClassNotFoundException
    {
    DAO<AnneeScolaire> AnneeScolaireDao= new AnneeScolaireDAO();
    AnneeScolaire p = new AnneeScolaire(Integer.parseInt(id.getText()),annee.getText());
    AnneeScolaireDao.update(p);
    }
	
	//**********************************
		/**
		 * 
		 * @param nom
		 * @return
		 */
		public ArrayList<String> findAnnee(JTextField id) 
		{
			DAO<AnneeScolaire> AnneeDao = new AnneeScolaireDAO();
			ArrayList<String> s = AnneeDao.find(id.getText());
			return s;
		}
	//**********************************
	
	/**
	 * Getter id
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * Setter id
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
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
