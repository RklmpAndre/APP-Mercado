/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models.dao;

import connection.ConnectionFactory;
import java.sql.*;
import javax.swing.JOptionPane;
import models.beans.Produto;

/**
 *
 * @author andre
 */
public class ProdutoDAO_BD {

    
    public void create(Produto p) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO produto (nome, tipo, descicao, valor"
                    + "quantidade)VALUES(?,?,?,?,?)");
            stmt.setString(1, p.getNome());
            stmt.setString(2, p.getTipo());
            stmt.setString(3, p.getDescrição());
            stmt.setDouble(4, p.getValor());
            stmt.setInt(5, p.getQuantidade());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar");
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

    
    public Object read(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    public boolean update(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    public boolean delete(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
