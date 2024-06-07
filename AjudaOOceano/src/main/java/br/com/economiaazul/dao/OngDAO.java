package br.com.economiaazul.dao;

import br.com.economiaazul.beans.Ongs;
import br.com.economiaazul.conexao.ConnectFactory;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class OngDAO {

    public List<Ongs> listarOngs() {
        List<Ongs> listaOngs = new ArrayList<>();
        Connection conexao = null;
        Statement consulta = null;
        ResultSet resultado = null;

        try {
            // Obtém a conexão
            ConnectFactory factory = new ConnectFactory();
            conexao = factory.conexao();

            // Cria a consulta SQL
            String sql = "SELECT * FROM Ongs";

            // Cria um statement
            consulta = conexao.createStatement();

            // Executa a consulta
            resultado = consulta.executeQuery(sql);

            // Itera sobre o resultado e cria objetos Ong
            while (resultado.next()) {
                int id = resultado.getInt("ID");
                String nome = resultado.getString("Nome");
                int anoFundacao = resultado.getInt("AnoFundacao");
                String missao = resultado.getString("Missao");
                String sede = resultado.getString("Sede");
                String website = resultado.getString("Website");
                String emailContato = resultado.getString("EmailContato");

                Ongs ong = new Ongs(id, nome, anoFundacao, missao, sede, website, emailContato);
                listaOngs.add(ong);
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            // Fecha os recursos
            try {
                if (resultado != null)
                    resultado.close();
                if (consulta != null)
                    consulta.close();
                if (conexao != null)
                    conexao.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return listaOngs;
    }
}

