package br.com.economiaazul.bo;


import br.com.economiaazul.dao.OngDAO;


import java.sql.SQLException;

public class OngBO {
	
	 private OngDAO ongDAO;
	 
	 public OngBO() throws ClassNotFoundException, SQLException {
	        this.ongDAO = new OngDAO();
	    }

}
