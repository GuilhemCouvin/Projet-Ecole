/**
 * 
 */
package DAO;

import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import Model.Trimestre;

/**
 * @author Guilhem
 *
 */
public class TrimestreDAO extends DAO<Trimestre> {
	
	private int resultat;

	public TrimestreDAO() {
		super();
	}

	@Override
	public boolean create(Trimestre obj) {
		try {
			setResultat(this.conn.createStatement(
			    ResultSet.TYPE_SCROLL_INSENSITIVE,
			        ResultSet.CONCUR_READ_ONLY).executeUpdate("INSERT INTO trimestre VALUES ('" +obj.getId() +"', '"+ obj.getNumero()+"', '"+ obj.getDebut()+"', '"+ obj.getFin()+"', '"+ obj.getAnnee()+"')"));
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
                ResultSet.CONCUR_READ_ONLY).executeUpdate("DELETE FROM `trimestre` WHERE `id` = '" + id+"'"));           
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
		return false;
	}

	@Override
	public boolean update(Trimestre obj) {
		try{
            
			setResultat(this.conn.createStatement(
            ResultSet.TYPE_SCROLL_INSENSITIVE,
                ResultSet.CONCUR_READ_ONLY).executeUpdate("UPDATE trimestre SET numero ='"+obj.getNumero()+"', debut ='"+obj.getDebut()+"', fin ='"+obj.getFin()+"', annee_scolaire_id ='"+obj.getAnnee()+ "' WHERE id = '" + obj.getId()+ "'"));
                        
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
			rs = st.executeQuery("SELECT * FROM trimestre");
			while(rs.next()) {
				String id = rs.getString("id");
				String numero = rs.getString("numero");
				String debut = rs.getString("debut");
				String fin = rs.getString("fin");
				String annee_scolaire_id = rs.getString("annee_scolaire_id");
				String s = "ID: "+id+"Numero : "+numero+"Debut : "+debut+"Fin : "+fin+"Annee Scolaire ID : "+annee_scolaire_id;
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
	public Trimestre find(int id) {
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
