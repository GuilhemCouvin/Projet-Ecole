/**
 * 
 */
package DAO;

import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import Model.Inscription;

/**
 * @author Guilhem
 *
 */
public class InscriptionDAO extends DAO<Inscription> {
	
	private int resultat;

	public InscriptionDAO( ) {
		super();
	}

	@Override
	public boolean create(Inscription obj) {
		try {
			setResultat(this.conn.createStatement(
			    ResultSet.TYPE_SCROLL_INSENSITIVE,
			        ResultSet.CONCUR_READ_ONLY).executeUpdate("INSERT INTO inscription VALUES ('" +obj.getId() +"', '"+ obj.getId_classe()+ obj.getId_personne()+"')"));
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
                ResultSet.CONCUR_READ_ONLY).executeUpdate("DELETE FROM `inscription` WHERE `id` = '" + id+"'"));           
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
		return false;
	}

	@Override
	public boolean update(Inscription obj) {
		try{
            
			setResultat(this.conn.createStatement(
            ResultSet.TYPE_SCROLL_INSENSITIVE,
                ResultSet.CONCUR_READ_ONLY).executeUpdate("UPDATE inscription SET classe_id ='"+obj.getId_classe()+ "', personne_id ='"+obj.getId_personne()+ "' WHERE id = '" + obj.getId()+ "'"));
                        
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
			rs = st.executeQuery("SELECT * FROM inscription");
			while(rs.next()) {
				String id = rs.getString("id");
				String classe_id = rs.getString("classe_id");
				String personne_id = rs.getString("personne_id");
				String s = "ID: "+id+"Classe ID : "+classe_id+"Personne ID: "+personne_id;
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
				String query="SELECT * FROM inscription WHERE id="+id1;
				PreparedStatement pt = conn.prepareStatement(query);
				ResultSet rs = pt.executeQuery();
				int i=0;
				while(rs.next()) {
					i++;
					String id = rs.getString("id");
					String classe_id = rs.getString("classe_id");
					String personne_id = rs.getString("personne_id");
					String s = "ID: "+id+"Classe ID : "+classe_id+"Personne ID: "+personne_id;
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
