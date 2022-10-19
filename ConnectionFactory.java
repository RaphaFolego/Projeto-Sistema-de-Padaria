package com.mycompany.padaria;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Raphael Folego
 */
public class ConnectionFactory {
    
    private String usuario = "root";
    private String senha = "Rr@004400330033";
    private String host = "localhost";
    private String porta = "3306";
    private String bd = "db_produto";
    
    public Connection obtemConexao(){
        try{
            Connection c = DriverManager.getConnection(
            "jdbc:mysql://" + host + ":" + porta + "/" + bd, usuario, senha
            );
            return c;
        }
        catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
