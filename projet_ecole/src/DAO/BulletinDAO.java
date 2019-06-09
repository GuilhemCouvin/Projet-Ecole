/**
 * 
 */
package DAO;

import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import Model.Bulletin;

/**
 * @author Guilhem
 *
 */
public class BulletinDAO extends DAO<Bulletin> {

	private int resultat;

	public BulletinDAO() {
		super();
	}

	@Override
	public boolean create(Bulletin obj) {
		try {
			setResultat(this.conn.createStatement(
			    ResultSet.TYPE_SCROLL_INSENSITIVE,
			        ResultSet.CONCUR_READ_ONLY).executeUpdate("INSERT INTO bulletin VALUES ('" +obj.getId() +"', '"+ obj.getId_trimestre()+"', '"+ obj.getId_inscription()+"', '"+ obj.getAppreciation()+"')"));
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
                ResultSet.CONCUR_READ_ONLY).executeUpdate("DELETE FROM `bulletin` WHERE `id` = '" + id+"'"));           
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
		return false;
	}

	@Override
	public boolean update(Bulletin obj) {
		try{
            
			setResultat(this.conn.createStatement(
            ResultSet.TYPE_SCROLL_INSENSITIVE,
                ResultSet.CONCUR_READ_ONLY).executeUpdate("UPDATE bulletin SET trimestre_id ='"+obj.getId_trimestre()+ "', inscription_id ='"+obj.getId_inscription()+ "', appreciation ='"+obj.getAppreciation()+ "' WHERE id = '" + obj.getId()+ "'"));
                        
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
			rs = st.executeQuery("SELECT * FROM bulletin");
			while(rs.next()) {
				String id = rs.getString("id");
				String trimestre_id = rs.getString("trimestre_id");
				String inscription_id = rs.getString("inscription_id");
				String appreciation = rs.getString("appreciation");
				String s = "ID: "+id+"Trimestre ID: "+trimestre_id+"Inscription ID: "+inscription_id+"Appreciation: "+appreciation;
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
				String query="SELECT * FROM bulletin WHERE id="+id1;
				PreparedStatement pt = conn.prepareStatement(query);
				ResultSet rs = pt.executeQuery();
				int i=0;
				while(rs.next()) {
					i++;
					String id = rs.getString("id");
					String trimestre_id = rs.getString("trimestre_id");
					String inscription_id = rs.getString("inscription_id");
					String appreciation = rs.getString("appreciation");
					String s = "ID: "+id+"Trimestre ID: "+trimestre_id+"Inscription ID: "+inscription_id+"Appreciation: "+appreciation;
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
