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
    public boolean create(Object obj) {
        if(obj != null && obj instanceof Produto){
            Produto p = (Produto) obj;
            int id = this.cadastroProduto.size() + 1;
            if(!cadastroProduto.containsValue(p)){
                p.setId(id);
                cadastroProduto.put(p.getId(), p);
                return true; 
            }
        }
        return false;
    }

    @Override
    public Object read(Object obj) {
        if(obj != null && obj instanceof Integer){
            Integer id = (Integer) obj;
            return cadastroProduto.get(id);
        }
        return null;
    }
    
    @Override
    public boolean update(Object obj){
        if (obj != null && obj instanceof Produto) {
            Produto p = (Produto) obj;
            if(delete(p.getId()) == true){
                cadastroProduto.put(p.getId(), p);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delete(Object obj) {
        if (obj != null && obj instanceof Integer) {
            Integer id = (Integer) obj;
            return(cadastroProduto.remove(id) !=null);
        }
        return false;
    }
}
