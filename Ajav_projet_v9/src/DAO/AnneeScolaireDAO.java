package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import Model.*;

public final class AnneeScolaireDAO extends DAO<AnneeScolaire> {
	
	private int resultat;
	
	public AnneeScolaireDAO() {
		super();
	}
	/**
	 * @param obj
	 */
	@Override
	public boolean create(AnneeScolaire obj) {
		try {
			setResultat(this.conn.createStatement(
			    ResultSet.TYPE_SCROLL_INSENSITIVE,
			        ResultSet.CONCUR_READ_ONLY).executeUpdate("INSERT INTO annee_scolaire VALUES ('" +obj.getId() +"')"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	/**
	 * @param id
	 */
	@Override
	public boolean delete(String id) {
		try{
            setResultat(this.conn.createStatement(
            ResultSet.TYPE_SCROLL_INSENSITIVE,
                ResultSet.CONCUR_READ_ONLY).executeUpdate("DELETE FROM `annee_scolaire` WHERE `id` = '" + id +"'"));           
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
		return false;
	}
	/**
	 * @param obj
	 */
	@Override
	public boolean update(AnneeScolaire obj) {
		try{
			setResultat(this.conn.createStatement(
            ResultSet.TYPE_SCROLL_INSENSITIVE,
                ResultSet.CONCUR_READ_ONLY).executeUpdate("UPDATE annee_scolaire SET id= '"+  obj.getId()+ "'"));              
        }
        catch (SQLException e) {
            e.printStackTrace();
            }
		return false;
	}
	/**
	 * @return array
	 */
	@Override
	public ArrayList<String> display() {
		ArrayList<String> array = new ArrayList<String>();
		try{
			rs = st.executeQuery("SELECT * FROM annee_scolaire");
			while(rs.next()) {
				String id = rs.getString("id");
				String s = "ID: "+id;
				array.add(s);	
			}
                        
        }
        catch (SQLException e) {
            e.printStackTrace();
            }
		return array;
	}
	/**
	 * @param id
	 */
	//**********************************
		@Override
		public ArrayList<String> find(String id1) {
			ArrayList<String> array = new ArrayList<String>();
			try{
				String query="SELECT * FROM annee_scolaire WHERE id="+id1;
				PreparedStatement pt = conn.prepareStatement(query);
				ResultSet rs = pt.executeQuery();
				int i=0;
				while(rs.next()) {
					i++;
					String id = rs.getString("id");
					String s = "ID: "+id;
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
