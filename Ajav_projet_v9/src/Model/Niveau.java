/**
 * 
 */
package Model;

import java.util.*;

import javax.swing.JTextField;

import DAO.DAO;
import DAO.InscriptionDAO;
import DAO.NiveauDAO;

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
	/**
	 * 
	 * @param id
	 * @param nom
	 */
	public Niveau(int id,String nom) {
		this.setId(id);
		this.setNom(nom);
	}
	/**
	 * 
	 * @param id
	 * @param nom
	 * @throws ClassNotFoundException
	 */
	public void ajouterNiveau(JTextField id,JTextField nom) throws ClassNotFoundException
    {
    DAO<Niveau> NiveauDao= new NiveauDAO();
    Niveau b = new Niveau(Integer.parseInt(id.getText()),nom.getText());
    NiveauDao.create(b);
    }
	/**
	 * 
	 * @param id
	 * @throws ClassNotFoundException
	 */
	public void supprimerNiveau(JTextField id) throws ClassNotFoundException
    {
    DAO<Niveau> NiveauDao= new NiveauDAO();
    NiveauDao.delete(id.getText());
    }
	/**
	 * 
	 * @param id
	 * @param nom
	 * @throws ClassNotFoundException
	 */
	public void updateNiveau(JTextField id,JTextField nom) throws ClassNotFoundException
    {
    DAO<Niveau> NiveauDao= new NiveauDAO();
    Niveau p = new Niveau(Integer.parseInt(id.getText()),nom.getText());
    NiveauDao.update(p);
    }
	
	//**********************************
	/**
	 * 
	 * @param id
	 * @return
	 */
	public ArrayList<String> findNiveau(JTextField id) 
	{
		DAO<Niveau> NiveauDao = new NiveauDAO();
		System.out.println(id.getText());
		ArrayList<String> s = NiveauDao.find(id.getText());
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
	/**
	 * @return the niveau
	 */
	public ArrayList<Niveau> getNiveau() {
		return niveau;
	}
	/**
	 * @param niveau the niveau to set
	 */
	public void setNiveau(ArrayList<Niveau> niveau) {
		this.niveau = niveau;
	}

}
