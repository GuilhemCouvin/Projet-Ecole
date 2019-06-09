/**
 * 
 */
package DAO;

import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import Model.Discipline;

/**
 * @author Guilhem
 *
 */
public class DisciplineDAO extends DAO<Discipline> {
	private int resultat;

	public DisciplineDAO() {
		super();
	}

	@Override
	public boolean create(Discipline obj) {
		try {
			setResultat(this.conn.createStatement(
			    ResultSet.TYPE_SCROLL_INSENSITIVE,
			        ResultSet.CONCUR_READ_ONLY).executeUpdate("INSERT INTO discipline VALUES ('" +obj.getId() +"', '"+ obj.getNom()+"')"));
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
                ResultSet.CONCUR_READ_ONLY).executeUpdate("DELETE FROM `discipline` WHERE `id` = '" + id+"'"));           
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
		return false;
	}

	@Override
	public boolean update(Discipline obj) {
		try{
            
			setResultat(this.conn.createStatement(
            ResultSet.TYPE_SCROLL_INSENSITIVE,
                ResultSet.CONCUR_READ_ONLY).executeUpdate("UPDATE discipline SET nom ='"+obj.getNom()+ "' WHERE id = '" + obj.getId()+ "'"));
                        
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
			rs = st.executeQuery("SELECT * FROM discipline");
			while(rs.next()) {
				String id = rs.getString("id");
				String nom = rs.getString("nom");
				String s = "ID: "+id+"Nom : "+nom;
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
				String query="SELECT * FROM discipline WHERE id="+id1;
				PreparedStatement pt = conn.prepareStatement(query);
				ResultSet rs = pt.executeQuery();
				int i=0;
				while(rs.next()) {
					i++;
					String id = rs.getString("id");
					String nom = rs.getString("nom");
					String s = "ID: "+id+"Nom : "+nom;
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
