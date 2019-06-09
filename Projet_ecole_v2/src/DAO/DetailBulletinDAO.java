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
public final class DetailBulletinDAO extends DAO<DetailBulletin> {
	
	private int resultat;

	public DetailBulletinDAO(Connection conn) {
		super(conn);
	}

	@Override
	public boolean create(DetailBulletin obj) {
		try {
			setResultat(this.connect.createStatement(
			    ResultSet.TYPE_SCROLL_INSENSITIVE,
			        ResultSet.CONCUR_READ_ONLY).executeUpdate("INSERT INTO detail_bulletin VALUES ('" +obj.getId() +"', '"+ obj.getId_bulletin()+"', '"+ obj.getId_enseignement()+"', '"+ obj.getAppreciation()+"')"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean delete(DetailBulletin obj) {
		try{
            setResultat(this.connect.createStatement(
            ResultSet.TYPE_SCROLL_INSENSITIVE,
                ResultSet.CONCUR_READ_ONLY).executeUpdate("DELETE FROM `detail_bulletin` WHERE `id` = '" + obj.getId()+"'"));           
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
		return false;
	}

	@Override
	public boolean update(DetailBulletin obj) {
		try{
            
			setResultat(this.connect.createStatement(
            ResultSet.TYPE_SCROLL_INSENSITIVE,
                ResultSet.CONCUR_READ_ONLY).executeUpdate("UPDATE detail_bulletin SET id= '"+  obj.getId() + "', bulletin_id ='"+obj.getId_bulletin()+ "', enseignement_id ='"+obj.getId_enseignement()+ "', appreciation ='"+obj.getAppreciation()+ "' WHERE id = '" + obj.getId()+ "'"));
                        
        }
        catch (SQLException e) {
            e.printStackTrace();
            }
		return false;
	}
	
//**********************************
	@Override
	public DetailBulletin find(int id) {
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
