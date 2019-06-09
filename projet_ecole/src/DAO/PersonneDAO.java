				/**
 * 
 */
package DAO;

import java.sql.*;
import java.util.ArrayList;

import javax.swing.JOptionPane;

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
			        ResultSet.CONCUR_READ_ONLY).executeUpdate("INSERT INTO personne (`nom`, `prenom`, `type`) VALUES ('"+ obj.getNom()+"', '"+ obj.getPrenom()+"', '"+ obj.getType()+"')"));
					//ResultSet.CONCUR_READ_ONLY).executeUpdate("INSERT INTO personne VALUES ('" +obj.getId() +"', '"+ obj.getNom()+"', '"+ obj.getPrenom()+"', '"+ obj.getType()+"')"));
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
	public ArrayList<String> find(String id1) {
		ArrayList<String> array = new ArrayList<String>();
		try{
			String query="SELECT * FROM personne WHERE id="+id1;
			PreparedStatement pt = conn.prepareStatement(query);
			ResultSet rs = pt.executeQuery();
			int i=0;
			while(rs.next()) {
				i++;
				String id = rs.getString("id");
				String nom = rs.getString("nom");
				String prenom = rs.getString("prenom");
				String type = rs.getString("type");
				String s = "ID: "+id+"  nom:"+nom+"  prenom:"+prenom+"  type:"+type;
				array.add(s);
			}if(i==1) {
				JOptionPane.showMessageDialog(null, "Recherche réussi !");
			}else {
				JOptionPane.showMessageDialog(null, "Recherche introuvable !");
			}          
        }
        catch (SQLException e) {
            e.printStackTrace();
            }
		return array;
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
