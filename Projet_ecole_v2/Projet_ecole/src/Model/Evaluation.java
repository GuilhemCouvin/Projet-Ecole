package Model;

import java.util.*;

public class Evaluation {

	private int id;
	private int id_detailbulletin;
	private float note;
	private String appreciation;
	
	public Evaluation(int id,int id_detailbulletin,float note,String appreciation) {
		this.setId(id);
		this.setId_detailbulletin(id_detailbulletin);
		this.setNote(note);
		this.setAppreciation(appreciation);
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
