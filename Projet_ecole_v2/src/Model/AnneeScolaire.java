/**
 * 
 */
package Model;

import java.util.*;

import javax.swing.JTextField;

import Controller.Connexion;
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
	
	
	/**
	 * Constructors
	 */
	public AnneeScolaire() {
		this.setId(0);
	}
	public AnneeScolaire(int id) {
		this.setId(id);
	}
	
	public void ajouterAnnee(JTextField id) throws ClassNotFoundException
    {
    DAO<AnneeScolaire> AnneeDao= new AnneeScolaireDAO(Connexion.getInstance());
    AnneeScolaire a = new AnneeScolaire(Integer.parseInt(id.getText()));
    AnneeDao.create(a);
    }
	
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
