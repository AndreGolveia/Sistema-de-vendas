/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sistema_de_vendas;

import java.sql.Connection;

public class Principal {
    public static void main(String[] args) {
        try {
            Connection conn = ConexaoBD.obterConexao();
            new TelaConsulta(conn);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
