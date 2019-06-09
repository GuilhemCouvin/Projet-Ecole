/**
 * 
 */
package DAO;

import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import Model.Evaluation;


/**
 * @author Guilhem
 *
 */
public class EvaluationDAO extends DAO<Evaluation> {
	
	private int resultat;

	public EvaluationDAO( ) {
		super();
	}

	@Override
	public boolean create(Evaluation obj) {
		try {
			setResultat(this.conn.createStatement(
			    ResultSet.TYPE_SCROLL_INSENSITIVE,
			        ResultSet.CONCUR_READ_ONLY).executeUpdate("INSERT INTO evaluation VALUES ('" +obj.getId() +"', '"+ obj.getId_detailbulletin()+ obj.getNote()+ obj.getAppreciation()+"')"));
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
                ResultSet.CONCUR_READ_ONLY).executeUpdate("DELETE FROM `evaluation` WHERE `id` = '" + id+"'"));           
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
		return false;
	}

	@Override
	public boolean update(Evaluation obj) {
		try{
            
			setResultat(this.conn.createStatement(
            ResultSet.TYPE_SCROLL_INSENSITIVE,
                ResultSet.CONCUR_READ_ONLY).executeUpdate("UPDATE evaluation SET detail_bulletin_id ='"+obj.getId_detailbulletin()+ "', note ='"+obj.getNote()+ "', appreciation ='"+obj.getAppreciation()+ "' WHERE id = '" + obj.getId()+ "'"));
                        
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
			rs = st.executeQuery("SELECT * FROM evaluation");
			while(rs.next()) {
				String id = rs.getString("id");
				String detail_bulletin_id = rs.getString("detail_bulletin_id");
				String note = rs.getString("note");
				String appreciation = rs.getString("appreciation");
				String s = "ID: "+id+"Detail Bulletin ID : "+detail_bulletin_id+"note : "+note+"appreciation : "+appreciation;
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
	public Evaluation find(int id) {
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
