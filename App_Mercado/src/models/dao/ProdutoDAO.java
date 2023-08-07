/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models.dao;

import java.util.ArrayList;
import java.util.Iterator;
import models.beans.Produto;

/**
 *
 * @author andre
 */
public class ProdutoDAO implements DAO {

    private ArrayList produtos = new ArrayList();
       
    public ProdutoDAO(){
        try {
            Class.forName("m")
        }
    }
    
    @Override
    public boolean create(Object obj) {

        if (obj != null && obj instanceof Produto) {
            Produto p = (Produto) obj;
            return this.produtos.add(p);
        }
        return false;
    }

    @Override
    public Object read(Object obj) {
        if(obj != null & obj instanceof Produto){
            Produto p = (Produto) obj;
            Iterator it = produtos.iterator();
            while(it.hasNext()){
                Produto p2 = (Produto) it.next();
                if(p2.equals(p)){
                    return p;
                }
            }
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
