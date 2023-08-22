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
    
    HashMap<Integer, Produto> cadastroProduto = new HashMap<>();
    
    
    /*public void listar() {
        for (Map.Entry<String, Pessoa> linha : dados.entrySet()) {
            System.out.println(linha);
        }
    }*/
    
    @Override
    public boolean create(Object obj) {
        if(obj != null && obj instanceof Produto){
            Produto p = (Produto) obj;
            for(Map.Entry<Integer, Produto> e : cadastroProduto.entrySet()){
                System.out.println(e);
                if(e.equals(p)){
                    //
                    System.out.println("e é igual a p");
                    return false;
                }
            }
            int id = this.cadastroProduto.size() + 1;
            p.setId(id);
            this.cadastroProduto.put(p.getId(), p);
        }
        return false;
    }

    @Override
    public Object read(Object obj) {
        if(obj != null && obj instanceof Produto){
            Produto p = (Produto) obj;
            if(this.cadastroProduto.get(p.getId()) != null){
                return cadastroProduto.get(p.getId());
            }
        }

        return null;
    }    

    @Override
    public boolean update(Object obj) {
        if(obj != null && obj instanceof Produto){
            Produto p = (Produto) obj;
            if(this.delete(p.getId()) == true){
                return this.create(p);
            }
        }
        return false; 
    }

    @Override
    public boolean delete(Object obj) {
        if(obj != null && obj instanceof Produto){
            Produto p = (Produto) obj;
            if(this.read(p) != null){
                this.cadastroProduto.remove(p.getId());
                return true;    
            }
        }
        return false;
    }
    public void listar() {
        for(Map.Entry<Integer, Produto> l : cadastroProduto.entrySet()){
            System.out.println(l);
        }
    }    
}
