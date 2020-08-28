package br.senac.sp.bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConexaoDB {

    // Bloco Executado uma unica vez quando o servidor é inicializado
    static {
        try {
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConexaoDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static Connection obterConexao() throws ClassNotFoundException, SQLException {
        // url do banco de dados, muda de tipo de banco de dados
        String url = "jdbc:derby://localhost:1527/senac";
        //o usuario de acesso do banco ( estou usando mysql, geralmente é root)
        String user = "senac";
        //senha do banco
        String senha = "senac";

        return DriverManager.getConnection(url, user, senha);
    }
}
