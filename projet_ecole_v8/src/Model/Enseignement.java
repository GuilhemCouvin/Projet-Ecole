package Model;

import java.util.ArrayList;

import javax.swing.JTextField;

import DAO.DAO;
import DAO.DisciplineDAO;
import DAO.EnseignementDAO;

public class Enseignement {
	
	private int id;
	private int id_classe;
	private int id_discipline;
	private int id_personne;
	/**
	 * 
	 * @param id
	 * @param id_classe
	 * @param id_discipline
	 * @param id_personne
	 */
	public Enseignement(int id,int id_classe,int id_discipline,int id_personne) {
		this.setId(id);
		this.setId_classe(id_classe);
		this.setId_discipline(id_discipline);
		this.setId_personne(id_personne);
	}
	public Enseignement() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * 
	 * @param id
	 * @param id_classe
	 * @param id_discipline
	 * @param id_personne
	 * @throws ClassNotFoundException
	 */
	public void ajouterEnseignement(JTextField id,JTextField id_classe,JTextField id_discipline,JTextField id_personne) throws ClassNotFoundException
    {
    DAO<Enseignement> EnseignementDao= new EnseignementDAO();
    Enseignement b = new Enseignement(Integer.parseInt(id.getText()),Integer.parseInt(id_classe.getText()),Integer.parseInt(id_discipline.getText()),Integer.parseInt(id_personne.getText()));
    EnseignementDao.create(b);
    }
	/**
	 * 
	 * @param id
	 * @throws ClassNotFoundException
	 */
	public void supprimerEnseignement(JTextField id) throws ClassNotFoundException
    {
    DAO<Enseignement> EnseignementDao= new EnseignementDAO();
    EnseignementDao.delete(id.getText());
    }
	/**
	 * 
	 * @param id
	 * @param id_classe
	 * @param id_discipline
	 * @param id_personne
	 * @throws ClassNotFoundException
	 */
	public void updateEnseignement(JTextField id,JTextField id_classe,JTextField id_discipline,JTextField id_personne) throws ClassNotFoundException
    {
    DAO<Enseignement> EnseignementDao= new EnseignementDAO();
    Enseignement p = new Enseignement(Integer.parseInt(id.getText()),Integer.parseInt(id_classe.getText()),Integer.parseInt(id_discipline.getText()),Integer.parseInt(id_personne.getText()));
    EnseignementDao.update(p);
    }
	
	//**********************************
	/**
	 * 
	 * @param id
	 * @return
	 */
	public ArrayList<String> findEnseignement(JTextField id) 
	{
		DAO<Enseignement> EnseignementDao = new EnseignementDAO();
		System.out.println(id.getText());
		ArrayList<String> s = EnseignementDao.find(id.getText());
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
	 * @return the id_discipline
	 */
	public int getId_discipline() {
		return id_discipline;
	}

	/**
	 * @param id_discipline the id_discipline to set
	 */
	public void setId_discipline(int id_discipline) {
		this.id_discipline = id_discipline;
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
