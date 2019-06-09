/**
 * 
 */
package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import Model.*;

/**
 * @author Guilhem
 *
 */
public class NiveauDAO extends DAO<Niveau> {
	
	private int resultat;

	public NiveauDAO(Connection conn) {
		super(conn);
	}

	@Override
	public boolean create(Niveau obj) {
		try {
			setResultat(this.connect.createStatement(
			    ResultSet.TYPE_SCROLL_INSENSITIVE,
			        ResultSet.CONCUR_READ_ONLY).executeUpdate("INSERT INTO niveau VALUES ('" +obj.getId() +"', '"+ obj.getNom()+"')"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean delete(Niveau obj) {
		try{
            setResultat(this.connect.createStatement(
            ResultSet.TYPE_SCROLL_INSENSITIVE,
                ResultSet.CONCUR_READ_ONLY).executeUpdate("DELETE FROM `niveau` WHERE `id` = '" + obj.getId()+"'"));           
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
		return false;
	}

	@Override
	public boolean update(Niveau obj) {
		try{
            
			setResultat(this.connect.createStatement(
            ResultSet.TYPE_SCROLL_INSENSITIVE,
                ResultSet.CONCUR_READ_ONLY).executeUpdate("UPDATE niveau SET id= '"+  obj.getId() + "', nom ='"+obj.getNom()+ "' WHERE id = '" + obj.getId()+ "'"));
                        
        }
        catch (SQLException e) {
            e.printStackTrace();
            }
		return false;
	}
	
//**********************************
	@Override
	public Niveau find(int id) {
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
