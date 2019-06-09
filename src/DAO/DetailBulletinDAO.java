/**
 * 
 */
package DAO;

import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import Model.DetailBulletin;

/**
 * @author Guilhem
 *
 */
public final class DetailBulletinDAO extends DAO<DetailBulletin> {
	
	private int resultat;

	public DetailBulletinDAO() {
		super();
	}

	@Override
	public boolean create(DetailBulletin obj) {
		try {
			setResultat(this.conn.createStatement(
			    ResultSet.TYPE_SCROLL_INSENSITIVE,
			        ResultSet.CONCUR_READ_ONLY).executeUpdate("INSERT INTO detail_bulletin VALUES ('" +obj.getId() +"', '"+ obj.getId_bulletin()+"', '"+ obj.getId_enseignement()+"', '"+ obj.getAppreciation()+"')"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean delete(String id) {
		try{
            setResultat(this.conn.createStatement(
            ResultSet.TYPE_SCROLL_INSENSITIVE,
                ResultSet.CONCUR_READ_ONLY).executeUpdate("DELETE FROM `detail_bulletin` WHERE `id` = '" + id+"'"));           
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
		return false;
	}

	@Override
	public boolean update(DetailBulletin obj) {
		try{
            
			setResultat(this.conn.createStatement(
            ResultSet.TYPE_SCROLL_INSENSITIVE,
                ResultSet.CONCUR_READ_ONLY).executeUpdate("UPDATE detail_bulletin SET bulletin_id ='"+obj.getId_bulletin()+ "', enseignement_id ='"+obj.getId_enseignement()+ "', appreciation ='"+obj.getAppreciation()+ "' WHERE id = '" + obj.getId()+ "'"));
                        
        }
        catch (SQLException e) {
            e.printStackTrace();
            }
		return false;
	}
	
	@Override
	public ArrayList<String> display() {
		ArrayList<String> array = new ArrayList<String>();
		try{
			rs = st.executeQuery("SELECT * FROM detail_bulletin");
			while(rs.next()) {
				String id = rs.getString("id");
				String enseignement_id = rs.getString("enseignement_id");
				String bulletin_id = rs.getString("bulletin_id");
				String appreciation = rs.getString("appreciation");
				String s = "ID: "+id+"Enseignement ID : "+enseignement_id+"Bulletin ID: "+bulletin_id+"Appreciation: "+appreciation;
				array.add(s);	
			}
                        
        }
        catch (SQLException e) {
            e.printStackTrace();
            }
		return array;
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
