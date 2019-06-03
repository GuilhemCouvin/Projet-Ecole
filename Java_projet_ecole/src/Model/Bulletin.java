package Model;

import java.util.*;

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
