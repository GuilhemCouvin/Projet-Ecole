/**
 * 
 */
package Model;

import java.util.*;


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
