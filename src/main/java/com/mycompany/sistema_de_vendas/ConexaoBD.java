package com.mycompany.sistema_de_vendas;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexaoBD {
    
    private static String host = "localhost";
    private static String porta = "3306";
    private static String db = "tutorial";
    private static String usuario = "root";
    private static String senha = "123456";
    
    //cláusula catch or declare
    public static Connection obterConexao () throws Exception{
        String url = String.format(
                "jdbc:mysql://%s:%s/%s",
                host, porta, db 
        );
        Connection conexao = DriverManager.getConnection(url, usuario, senha);
        return conexao;
    }
}
