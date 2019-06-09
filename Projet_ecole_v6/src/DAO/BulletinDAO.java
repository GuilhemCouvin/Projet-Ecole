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
public class BulletinDAO extends DAO<Bulletin> {

	private int resultat;

	public BulletinDAO(Connection conn) {
		super(conn);
	}

	@Override
	public boolean create(Bulletin obj) {
		try {
			setResultat(this.connect.createStatement(
			    ResultSet.TYPE_SCROLL_INSENSITIVE,
			        ResultSet.CONCUR_READ_ONLY).executeUpdate("INSERT INTO bulletin VALUES ('" +obj.getId() +"', '"+ obj.getId_trimestre()+"', '"+ obj.getId_inscription()+"', '"+ obj.getAppreciation()+"')"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean delete(Bulletin obj) {
		try{
            setResultat(this.connect.createStatement(
            ResultSet.TYPE_SCROLL_INSENSITIVE,
                ResultSet.CONCUR_READ_ONLY).executeUpdate("DELETE FROM `bulletin` WHERE `id` = '" + obj.getId()+"'"));           
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
		return false;
	}

	@Override
	public boolean update(Bulletin obj) {
		try{
            
			setResultat(this.connect.createStatement(
            ResultSet.TYPE_SCROLL_INSENSITIVE,
                ResultSet.CONCUR_READ_ONLY).executeUpdate("UPDATE bulletin SET id= '"+  obj.getId() + "', trimestre_id ='"+obj.getId_trimestre()+ "', inscription_id ='"+obj.getId_inscription()+ "', appreciation ='"+obj.getAppreciation()+ "' WHERE id = '" + obj.getId()+ "'"));
                        
        }
        catch (SQLException e) {
            e.printStackTrace();
            }
		return false;
	}
	
//**********************************
	@Override
	public Bulletin find(int id) {
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
