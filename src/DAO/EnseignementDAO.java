/**
 * 
 */
package DAO;

import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import Model.Enseignement;

/**
 * @author Guilhem
 *
 */
public class EnseignementDAO extends DAO<Enseignement> {
	
	private int resultat;

	public EnseignementDAO( ) {
		super();
	}

	@Override
	public boolean create(Enseignement obj) {
		try {
			setResultat(this.conn.createStatement(
			    ResultSet.TYPE_SCROLL_INSENSITIVE,
			        ResultSet.CONCUR_READ_ONLY).executeUpdate("INSERT INTO enseignement VALUES ('" +obj.getId() +"', '"+ obj.getId_classe()+ obj.getId_discipline()+ obj.getId_personne()+"')"));
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
                ResultSet.CONCUR_READ_ONLY).executeUpdate("DELETE FROM `enseignement` WHERE `id` = '" + id+"'"));           
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
		return false;
	}

	@Override
	public boolean update(Enseignement obj) {
		try{
            
			setResultat(this.conn.createStatement(
            ResultSet.TYPE_SCROLL_INSENSITIVE,
                ResultSet.CONCUR_READ_ONLY).executeUpdate("UPDATE enseignement SET classe_id ='"+obj.getId_classe()+ "', discipline_id ='"+obj.getId_discipline()+ "', personne_id ='"+obj.getId_personne()+ "' WHERE id = '" + obj.getId()+ "'"));
                        
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
			rs = st.executeQuery("SELECT * FROM enseignement");
			while(rs.next()) {
				String id = rs.getString("id");
				String classe_id = rs.getString("classe_id");
				String personne_id = rs.getString("personne_id");
				String discipline_id = rs.getString("discipline_id");
				String s = "ID: "+id+"Classe ID : "+classe_id+"Personne ID: "+personne_id+"Discipline ID: "+discipline_id;
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
	public Enseignement find(int id) {
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
