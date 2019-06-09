/**
 * 
 */
package DAO;

import Model.*;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;

import java.util.Scanner;

/**
 * @author Guilhem
 *
 */
public class ClasseDAO extends DAO<Classe> {

	private int resultat;

	public ClasseDAO(Connection conn) {
		super(conn);
	}

	@Override
	public boolean create(Classe obj) {
		try {
			setResultat(this.connect.createStatement(
			    ResultSet.TYPE_SCROLL_INSENSITIVE,
			        ResultSet.CONCUR_READ_ONLY).executeUpdate("INSERT INTO classe VALUES ('" +obj.getId() +"', '"+ obj.getNom()+"', '"+ obj.getId_ecole()+"', '"+ obj.getId_annee()+"')"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean delete(Classe obj) {
		try{
            setResultat(this.connect.createStatement(
            ResultSet.TYPE_SCROLL_INSENSITIVE,
                ResultSet.CONCUR_READ_ONLY).executeUpdate("DELETE FROM `classe` WHERE `id` = '" + obj.getId()+"'"));           
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
		return false;
	}

	@Override
	public boolean update(Classe obj) {
		try{
            
			setResultat(this.connect.createStatement(
            ResultSet.TYPE_SCROLL_INSENSITIVE,
                ResultSet.CONCUR_READ_ONLY).executeUpdate("UPDATE classe SET id= '"+  obj.getId() + "', nom ='"+obj.getNom()+ "', ecole_id ='"+obj.getId_ecole()+ "', annee_scolaire_id ='"+obj.getId_annee()+ "' WHERE id = '" + obj.getId()+ "'"));
                        
        }
        catch (SQLException e) {
            e.printStackTrace();
            }
		return false;
	}
	
//**********************************
	@Override
	public Classe find(int id) {
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
