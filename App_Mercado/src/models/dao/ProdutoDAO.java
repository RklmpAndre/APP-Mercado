/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models.dao;

import java.util.HashMap;
import models.beans.Produto;

/**
 *
 * @author 08050431
 */
public class ProdutoDAO implements DAO {
    
    HashMap<Integer, Produto> cadastroProduto = new HashMap<>();
    
    
    @Override
    public boolean create(Object obj){
        try {
            if(obj != null && obj instanceof Produto){
                Produto p = (Produto) obj;
                //if(this.read(p)){
                    
                }
                return true;
            }
        } catch (Exception e) {
            
        }
        return false;
    }

    @Override
    public Object read(Object obj) {
        try {
            if(obj != null && obj instanceof Integer){
                Integer i = (Integer) obj;
                
                return this.cadastroProduto.get(i);
            }
        } catch (Exception e) {
            throw new IllegalArgumentException("Não foi possivel por conta de: ", e);
        }
        return null;
    }

    @Override
    public boolean update(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean delete(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
