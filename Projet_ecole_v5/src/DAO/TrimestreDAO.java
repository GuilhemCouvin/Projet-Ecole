/**
 * 
 */
package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import Model.*;

/**
 * @author Guilhem
 *
 */
public class TrimestreDAO extends DAO<Trimestre> {
	
	private int resultat;

	public TrimestreDAO(Connection conn) {
		super(conn);
	}

	@Override
	public boolean create(Trimestre obj) {
		try {
			setResultat(this.connect.createStatement(
			    ResultSet.TYPE_SCROLL_INSENSITIVE,
			        ResultSet.CONCUR_READ_ONLY).executeUpdate("INSERT INTO trimestre VALUES ('" +obj.getId() +"', '"+ obj.getNumero()+"', '"+ obj.getDebut()+"', '"+ obj.getFin()+"', '"+ obj.getAnnee()+"')"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean delete(Trimestre obj) {
		try{
            setResultat(this.connect.createStatement(
            ResultSet.TYPE_SCROLL_INSENSITIVE,
                ResultSet.CONCUR_READ_ONLY).executeUpdate("DELETE FROM `trimestre` WHERE `id` = '" + obj.getId()+"'"));           
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
		return false;
	}

	@Override
	public boolean update(Trimestre obj) {
		try{
            
			setResultat(this.connect.createStatement(
            ResultSet.TYPE_SCROLL_INSENSITIVE,
                ResultSet.CONCUR_READ_ONLY).executeUpdate("UPDATE trimestre SET id= '"+  obj.getId() + "', numero ='"+obj.getNumero()+"', debut ='"+obj.getDebut()+"', fin ='"+obj.getFin()+"', annee_scolaire_id ='"+obj.getAnnee()+ "' WHERE id = '" + obj.getId()+ "'"));
                        
        }
        catch (SQLException e) {
            e.printStackTrace();
            }
		return false;
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
