package br.com.economiaazul.main;

import br.com.economiaazul.beans.Ongs;
import br.com.economiaazul.dao.OngDAO;

import java.util.List;

public class TesteExecutar {

    public static void main(String[] args) {
        OngDAO ongDAO = new OngDAO();

        // Testar o método listarOngs
        System.out.println("Testando o método listarOngs...");
        List<Ongs> ongs = ongDAO.listarOngs();

        if (ongs.isEmpty()) {
            System.out.println("Nenhuma ONG encontrada.");
        } else {
            for (Ongs ong : ongs) {
                System.out.println(ong);
            }
        }
    }
}
