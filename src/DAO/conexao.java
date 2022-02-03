/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import java.sql.*;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author coreo
 */
public class conexao {
    
     public Statement stm;
    public ResultSet rs;
    private String driver = "com.mysql.jdbc.Driver";
    private String caminho = "jdbc:mysql://localhost:3306/bar";
    private String usuario = "root";
    private String senha = "1234";
    public Connection conn;

    public void conexao() {

        try {
            System.setProperty("jdbc.Drivers", driver);
            conn = (Connection) DriverManager.getConnection(caminho, usuario, senha);
            //JOptionPane.showMessageDialog(null, "conectado blz ");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao conectado" + ex.getMessage());
        }
    }

    public void desconetar() {
        try {
            conn.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao fechar a conexcao" + ex.getMessage());
        }
    }

    public ResultSet consultarGenerico(String sqlC) {
        try {
            stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(sqlC);
            return rs;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao SQL" + ex.getMessage());
            return rs = null;
        }
    }

    public void executaSql(String Sql) {
        try {
            stm = conn.createStatement();
            rs = stm.executeQuery(Sql);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao SQL" + ex.getMessage());
        }
     }
    
    public ResultSet executaSqlTabela(String Sql) {
        try {
            stm = conn.createStatement();
            return stm.executeQuery(Sql);
            
        } catch (SQLException ex) {
            return null;
        }
     }
    
    public boolean executaSqlDelete(String Sql) {
        try {
            stm = conn.createStatement();
            stm.execute(Sql);
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao SQL" + ex.getMessage());
            return false;
        }
     }
    
}
