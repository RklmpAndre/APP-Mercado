/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models.dao;

import java.util.ArrayList;
import java.util.Iterator;
import models.beans.Pessoa;

/**
 *
 * @author 08050431
 */
public class PessoaDAO implements DAO{

    ArrayList<Pessoa> dados = new ArrayList<>();
    
    @Override
    public boolean create(Object obj) {
        int id = dados.size() +1;
        Pessoa p = (Pessoa) obj;
        p.setId(id);
        dados.add(p);
        return true;
    }

    @Override
    public Object read(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean update(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean delete(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public void listar(){
        Iterator it = dados.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
    
}
