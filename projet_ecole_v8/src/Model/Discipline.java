/**
 * 
 */
package Model;

import java.util.ArrayList;

import javax.swing.JTextField;

import DAO.DAO;
import DAO.DetailBulletinDAO;
import DAO.DisciplineDAO;

/**
 * @author Guilhem
 *
 */
public class Discipline {

	/**
	 * 
	 */
	private int id;
	private String nom;
	/**
	 * 
	 * @param id
	 * @param nom
	 */
	public Discipline(int id,String nom) {
		this.setId(id);
		this.setNom(nom);
	}
	public Discipline() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * 
	 * @param id
	 * @param nom
	 * @throws ClassNotFoundException
	 */
	public void ajouterDiscipline(JTextField id,JTextField nom) throws ClassNotFoundException
    {
    DAO<Discipline> DisciplineDao= new DisciplineDAO();
    Discipline b = new Discipline(Integer.parseInt(id.getText()),nom.getText());
    DisciplineDao.create(b);
    }
	/**
	 * 
	 * @param id
	 * @throws ClassNotFoundException
	 */
	public void supprimerDiscipline(JTextField id) throws ClassNotFoundException
    {
    DAO<Discipline> DisciplineDao= new DisciplineDAO();
    DisciplineDao.delete(id.getText());
    }
	/**
	 * 
	 * @param id
	 * @param nom
	 * @throws ClassNotFoundException
	 */
	public void updateDiscipline(JTextField id,JTextField nom) throws ClassNotFoundException
    {
    DAO<Discipline> DisciplineDao= new DisciplineDAO();
    Discipline p = new Discipline(Integer.parseInt(id.getText()),nom.getText());
    DisciplineDao.update(p);
    }
	
	//**********************************
			/**
			 * 
			 * @param nom
			 * @return
			 */
			public ArrayList<String> findDiscipline(JTextField id) 
			{
				DAO<Discipline> DisciplineDao = new DisciplineDAO();
				System.out.println(id.getText());
				ArrayList<String> s = DisciplineDao.find(id.getText());
				return s;
			}
	//**********************************
			
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
