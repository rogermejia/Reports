/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.report.system.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author rogelio.mejia
 */
public class Connector {
    static String bd = "northwind";
    static String user = "root";
    static String pass = "root";
    static String route = "jdbc:mysql://localhost/"+bd;
    Connection cnx = null;
    
    public Connector () throws ClassNotFoundException {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            cnx = DriverManager.getConnection(route, user, pass);
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    public Connection connect(){
        try{
            return cnx;
        }catch(Exception e){
            return null;
        }
    }
    
    public void closure() throws SQLException{
        this.cnx.close();
    }
}
