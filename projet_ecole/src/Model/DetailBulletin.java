package Model;

import java.util.ArrayList;

import javax.swing.JTextField;

import DAO.ClasseDAO;
import DAO.DAO;
import DAO.DetailBulletinDAO;

public class DetailBulletin {

	private int id;
	private int id_bulletin;
	private int id_enseignement;
	private String appreciation;
	/**
	 * 
	 * @param id
	 * @param id_bulletin
	 * @param id_enseignement
	 * @param appreciation
	 */
	public DetailBulletin(int id,int id_bulletin,int id_enseignement,String appreciation) {
		this.id=id;
		this.id_bulletin=id_bulletin;
		this.id_enseignement=id_enseignement;
		this.appreciation=appreciation;
	}
	/**
	 * 
	 * @param id
	 * @param id_bulletin
	 * @param id_enseignement
	 * @param appreciation
	 * @throws ClassNotFoundException
	 */
	public void ajouterDetailBulletin(JTextField id,JTextField id_bulletin,JTextField id_enseignement,JTextField appreciation) throws ClassNotFoundException
    {
    DAO<DetailBulletin> DetailBulletinDao= new DetailBulletinDAO();
    DetailBulletin b = new DetailBulletin(Integer.parseInt(id.getText()), Integer.parseInt(id_bulletin.getText()), Integer.parseInt(id_enseignement.getText()),appreciation.getText());
    DetailBulletinDao.create(b);
    }
	/**
	 * 
	 * @param id
	 * @throws ClassNotFoundException
	 */
	public void supprimerDetailBulletin(JTextField id) throws ClassNotFoundException
    {
    DAO<DetailBulletin> DetailBulletinDao= new DetailBulletinDAO();
    DetailBulletinDao.delete(id.getText());
    }
	/**
	 * 
	 * @param id
	 * @param id_bulletin
	 * @param id_enseignement
	 * @param appreciation
	 * @throws ClassNotFoundException
	 */
	public void updateDetailBulletin(JTextField id,JTextField id_bulletin,JTextField id_enseignement,JTextField appreciation) throws ClassNotFoundException
    {
    DAO<DetailBulletin> DetailBulletinDao= new DetailBulletinDAO();
    DetailBulletin p = new DetailBulletin(Integer.parseInt(id.getText()), Integer.parseInt(id_bulletin.getText()), Integer.parseInt(id_enseignement.getText()),appreciation.getText());
    DetailBulletinDao.update(p);
    }
	
	//**********************************
		/**
		 * 
		 * @param nom
		 * @return
		 */
		public ArrayList<String> findDetailBulletin(JTextField id) 
		{
			DAO<DetailBulletin> DetailBulletinDao = new DetailBulletinDAO();
			System.out.println(id.getText());
			ArrayList<String> s = DetailBulletinDao.find(id.getText());
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
	 * @return the id_bulletin
	 */
	public int getId_bulletin() {
		return id_bulletin;
	}

	/**
	 * @param id_bulletin the id_bulletin to set
	 */
	public void setId_bulletin(int id_bulletin) {
		this.id_bulletin = id_bulletin;
	}

	/**
	 * @return the id_enseignement
	 */
	public int getId_enseignement() {
		return id_enseignement;
	}

	/**
	 * @param id_enseignement the id_enseignement to set
	 */
	public void setId_enseignement(int id_enseignement) {
		this.id_enseignement = id_enseignement;
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
