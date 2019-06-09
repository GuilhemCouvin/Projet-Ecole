/**
 * 
 */
package Model;

import java.util.ArrayList;

import javax.swing.JTextField;

import DAO.AnneeScolaireDAO;
import DAO.DAO;
import DAO.PersonneDAO;


/**
 * @author Guilhem
 *
 */
public class AnneeScolaire {
	
	/**
	 * Attributes
	 */
	private int id;
	
	
	/**
	 * Constructors
	 */
	public AnneeScolaire() {
		this.setId(0);
	}
	/**
	 * 
	 * @param id
	 */
	public AnneeScolaire(int id) {
		this.setId(id);
	}
	/**
	 * 
	 * @param id
	 * @throws ClassNotFoundException
	 */
	public void ajouterAnnee(JTextField id) throws ClassNotFoundException
    {
    DAO<AnneeScolaire> AnneeDao= new AnneeScolaireDAO();
    AnneeScolaire a = new AnneeScolaire(Integer.parseInt(id.getText()));
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
	public void updateAnnee(JTextField id) throws ClassNotFoundException
    {
    DAO<AnneeScolaire> AnneeScolaireDao= new AnneeScolaireDAO();
    AnneeScolaire p = new AnneeScolaire(Integer.parseInt(id.getText()));
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
			System.out.println(id.getText());
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

}
