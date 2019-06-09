package Model;

import java.util.ArrayList;

import javax.swing.JTextField;

import DAO.DAO;
import DAO.EnseignementDAO;
import DAO.EvaluationDAO;

public class Evaluation {

	private int id;
	private int id_detailbulletin;
	private float note;
	private String appreciation;
	/**
	 * 
	 * @param id
	 * @param id_detailbulletin
	 * @param note
	 * @param appreciation
	 */
	public Evaluation(int id,int id_detailbulletin,float note,String appreciation) {
		this.setId(id);
		this.setId_detailbulletin(id_detailbulletin);
		this.setNote(note);
		this.setAppreciation(appreciation);
	}
	
	public Evaluation() {
		
	}
	/**
	 * 
	 * @param id
	 * @param id_detailbulletin
	 * @param note
	 * @param appreciation
	 * @throws ClassNotFoundException
	 */
	public void ajouterEvaluation(JTextField id,JTextField id_detailbulletin,JTextField note,JTextField appreciation) throws ClassNotFoundException
    {
    DAO<Evaluation> EvaluationDao= new EvaluationDAO();
    Evaluation b = new Evaluation(Integer.parseInt(id.getText()),Integer.parseInt(id_detailbulletin.getText()),Float.parseFloat(note.getText()),appreciation.getText());
    EvaluationDao.create(b);
    }
	/**
	 * 
	 * @param id
	 * @throws ClassNotFoundException
	 */
	public void supprimerEvaluation(JTextField id) throws ClassNotFoundException
    {
    DAO<Evaluation> EvaluationDao= new EvaluationDAO();
    EvaluationDao.delete(id.getText());
    }
	/**
	 * 
	 * @param id
	 * @param id_detailbulletin
	 * @param note
	 * @param appreciation
	 * @throws ClassNotFoundException
	 */
	public void updateEvaluation(JTextField id,JTextField id_detailbulletin,JTextField note,JTextField appreciation) throws ClassNotFoundException
    {
    DAO<Evaluation> EvaluationDao= new EvaluationDAO();
    Evaluation p = new Evaluation(Integer.parseInt(id.getText()),Integer.parseInt(id_detailbulletin.getText()),Float.parseFloat(note.getText()),appreciation.getText());
    EvaluationDao.update(p);
    }

	//**********************************
		/**
		 * 
		 * @param id
		 * @return
		 */
		public ArrayList<String> findEvaluation(JTextField id) 
		{
			DAO<Evaluation> EvaluationDao = new EvaluationDAO();
			System.out.println(id.getText());
			ArrayList<String> s = EvaluationDao.find(id.getText());
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
	 * @return the id_detailbulletin
	 */
	public int getId_detailbulletin() {
		return id_detailbulletin;
	}

	/**
	 * @param id_detailbulletin the id_detailbulletin to set
	 */
	public void setId_detailbulletin(int id_detailbulletin) {
		this.id_detailbulletin = id_detailbulletin;
	}

	/**
	 * @return the note
	 */
	public float getNote() {
		return note;
	}

	/**
	 * @param note the note to set
	 */
	public void setNote(float note) {
		this.note = note;
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
