/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models.dao;

import java.util.HashMap;
import java.util.Map;
import models.beans.Produto;

/**
 *
 * @author 08050431
 */
public class ProdutoDAO implements DAO {
    
    
    private static ProdutoDAO prdao;
    
    public static ProdutoDAO getInstance() {
        if (prdao == null) {
            prdao = new ProdutoDAO();
        }
        return prdao;   
    }
    
     //É private para evitar que o PessoaDAO seja criado de outra forma que
    // não seja através do método getInstance.
    public ProdutoDAO(){
        
    }
    
    HashMap<Integer, Produto> dados = new HashMap<>();
    
    
    @Override
    public boolean create(Object obj) {
        if(obj != null && obj instanceof Produto){
            Produto p = (Produto) obj;
            int id = this.dados.size() + 1;
            if(!dados.containsValue(p)){
                p.setId(id);
                dados.put(p.getId(), p);
                return true;
            }
        }
        return false;
    }

    @Override
    public Object read(Object obj) {
        if(obj != null && obj instanceof Integer){
            Integer id = (Integer) obj;
            return dados.get(id);
        }
        return null;
    }
    
    @Override
    public boolean update(Object obj){
        if (obj != null && obj instanceof Produto) {
            Produto p = (Produto) obj;
            if(delete(p.getId()) == true){
                dados.put(p.getId(), p);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delete(Object obj) {
        if (obj != null && obj instanceof Integer) {
            Integer id = (Integer) obj;
            return(dados.remove(id) !=null);
        }
        return false;
    }
    
     public Produto listar() {
        
        for (Map.Entry<Integer, Produto> lista : dados.entrySet()) {
            return lista.getValue();
        }
        return null;
    } 
}
