package Model;

import java.util.ArrayList;

import javax.swing.JTextField;

import DAO.AnneeScolaireDAO;
import DAO.BulletinDAO;
import DAO.DAO;

public class Bulletin {

	private int id;
	private int id_trimestre;
	private int id_inscription;
	private String appreciation;
	
	public Bulletin(int id,int id_trimestre,int id_inscription,String appreciation) {
		this.id=id;
		this.id_trimestre=id_trimestre;
		this.id_inscription=id_inscription;
		this.appreciation=appreciation;
	}
	
	public Bulletin() {
	}
	
	public void ajouterBulletin(JTextField id,JTextField id_trimestre,JTextField id_inscription,JTextField appreciation) throws ClassNotFoundException
    {
    DAO<Bulletin> BulletinDao= new BulletinDAO();
    Bulletin b = new Bulletin(Integer.parseInt(id.getText()), Integer.parseInt(id_trimestre.getText()), Integer.parseInt(id_inscription.getText()), appreciation.getText());
    BulletinDao.create(b);
    }
	
	public void supprimerBulletin(JTextField id) throws ClassNotFoundException
    {
    DAO<Bulletin> BulletinDao= new BulletinDAO();
    BulletinDao.delete(id.getText());
    }
	
	public void updateBulletin(JTextField id,JTextField id_trimestre,JTextField id_inscription,JTextField appreciation) throws ClassNotFoundException
    {
    DAO<Bulletin> BulletinDao= new BulletinDAO();
    Bulletin p = new Bulletin(Integer.parseInt(id.getText()), Integer.parseInt(id_trimestre.getText()), Integer.parseInt(id_inscription.getText()), appreciation.getText());
    BulletinDao.update(p);
    }
	
	//**********************************
			/**
			 * 
			 * @param nom
			 * @return
			 */
			public ArrayList<String> findBulletin(JTextField id) 
			{
				DAO<Bulletin> BulletinDao = new BulletinDAO();
				System.out.println(id.getText());
				ArrayList<String> s = BulletinDao.find(id.getText());
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
	 * @return the id_trimestre
	 */
	public int getId_trimestre() {
		return id_trimestre;
	}

	/**
	 * @param id_trimestre the id_trimestre to set
	 */
	public void setId_trimestre(int id_trimestre) {
		this.id_trimestre = id_trimestre;
	}

	/**
	 * @return the id_inscription
	 */
	public int getId_inscription() {
		return id_inscription;
	}

	/**
	 * @param id_inscription the id_inscription to set
	 */
	public void setId_inscription(int id_inscription) {
		this.id_inscription = id_inscription;
	}

	/**
	 * @return the appreciation
	 */
	public String getAppreciation() {
		return appreciation;
	}

	/**
	 * @param appreciation the appreciation to set
	 */
	public void setAppreciation(String appreciation) {
		this.appreciation = appreciation;
	}

}
