/**
 * 
 */
package DAO;

import java.sql.*;
import java.util.ArrayList;

import Model.Personne;

/**
 * @author Guilhem
 *
 */
public class PersonneDAO extends DAO<Personne> {

	private int resultat;

	public PersonneDAO() {
		super();
	}

	@Override
	public boolean create(Personne obj) {
		try {
			setResultat(this.conn.createStatement(
			    ResultSet.TYPE_SCROLL_INSENSITIVE,
			        ResultSet.CONCUR_READ_ONLY).executeUpdate("INSERT INTO personne VALUES ('" +obj.getId() +"', '"+ obj.getNom()+"', '"+ obj.getPrenom()+"', '"+ obj.getType()+"')"));
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
                ResultSet.CONCUR_READ_ONLY).executeUpdate("DELETE FROM `personne` WHERE `id` = '" + id +"'"));           
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
		return false;
	}

	@Override
	public boolean update(Personne obj) {
		try{
            
			setResultat(this.conn.createStatement(
            ResultSet.TYPE_SCROLL_INSENSITIVE,
                ResultSet.CONCUR_READ_ONLY).executeUpdate("UPDATE personne SET nom ='"+obj.getNom()+ "', prenom ='"+obj.getPrenom()+ "', type ='"+obj.getType()+ "' WHERE id = '" + obj.getId()+ "'"));
                        
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
			rs = st.executeQuery("SELECT * FROM personne");
			while(rs.next()) {
				String id = rs.getString("id");
				String nom = rs.getString("nom");
				String prenom = rs.getString("prenom");
				String type = rs.getString("type");
				String s = "ID: "+id+"  nom:"+nom+"  prenom:"+prenom+"  type:"+type;
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
