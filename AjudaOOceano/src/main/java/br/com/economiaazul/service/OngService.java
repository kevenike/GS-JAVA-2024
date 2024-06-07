package br.com.economiaazul.service;


import br.com.economiaazul.beans.Ongs;
import br.com.economiaazul.dao.OngDAO;

import java.sql.SQLException;
import java.util.List;

public class OngService {

	private OngDAO ongDAO;

    public OngService() throws ClassNotFoundException, SQLException {
        this.ongDAO = new OngDAO();
    }

    public List<Ongs> listarOngs() {
        return ongDAO.listarOngs();
    }
}