/**
 * 
 */
package Model;

import Controller.*;
import DAO.*;

import java.util.*;

import javax.swing.*;

/**
 * @author Guilhem
 *
 */
public class Personne {

	/**
	 * 
	 */
	private int id;
	private String nom;
	private String prenom;
	private String type;
	
	public Personne(int id,String nom,String prenom,String type) {
		this.setId(id);
		this.setNom(nom);
		this.setPrenom(prenom);
		this.setType(type);
	}
	
	public Personne() {
		
	}

	public void ajouterPersonne(JTextField id,JTextField nom, JTextField prenom, JTextField type)
    {
    DAO<Personne> PersonneDao= new PersonneDAO(Connexion.getInstance());
    Personne d = new Personne(Integer.parseInt(id.getText()), nom.getText(),prenom.getText(),type.getText());
    PersonneDao.create(d);
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

	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

}
