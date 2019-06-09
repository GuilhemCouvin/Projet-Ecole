/**
 * 
 */
package DAO;

import Model.*;
import Controller.*;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;

import java.util.Scanner;

/**
 * @author Guilhem
 *
 */
public class PersonneDAO extends DAO<Personne> {

	private int resultat;

	public PersonneDAO(Connection conn) {
		super(conn);
	}

	@Override
	public boolean create(Personne obj) {
		try {
			setResultat(this.connect.createStatement(
			    ResultSet.TYPE_SCROLL_INSENSITIVE,
			        ResultSet.CONCUR_READ_ONLY).executeUpdate("INSERT INTO personne VALUES ('" +obj.getId() +"', '"+ obj.getNom()+"', '"+ obj.getPrenom()+"', '"+ obj.getType()+"')"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean delete(Personne obj) {
		try{
            setResultat(this.connect.createStatement(
            ResultSet.TYPE_SCROLL_INSENSITIVE,
                ResultSet.CONCUR_READ_ONLY).executeUpdate("DELETE FROM `personne` WHERE `id` = '" + obj.getId()+"'"));           
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
		return false;
	}

	@Override
	public boolean update(Personne obj) {
		try{
            
			setResultat(this.connect.createStatement(
            ResultSet.TYPE_SCROLL_INSENSITIVE,
                ResultSet.CONCUR_READ_ONLY).executeUpdate("UPDATE personne SET id= '"+  obj.getId() + "', nom ='"+obj.getNom()+ "', prenom ='"+obj.getPrenom()+ "', type ='"+obj.getType()+ "' WHERE id = '" + obj.getId()+ "'"));
                        
        }
        catch (SQLException e) {
            e.printStackTrace();
            }
		return false;
	}
	
//**********************************
	@Override
	public Personne find(int id) {
		// TODO Auto-generated method stub
		return null;
	}
//**********************************
	
	/**
	 * @return the resultat
	 */
	public int getResultat() {
		return resultat;
	}

	/**
	 * @param resultat the resultat to set
	 */
	public void setResultat(int resultat) {
		this.resultat = resultat;
	}

}
