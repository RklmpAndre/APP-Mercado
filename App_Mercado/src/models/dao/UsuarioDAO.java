/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models.dao;

import java.util.HashMap;
import models.beans.Usuario;

/**
 *
 * @author andre
 */
public class UsuarioDAO implements DAO {

    private HashMap<String, Usuario> cadastraUsuario = new HashMap();

    @Override
    public boolean create(Object obj) {
        if (obj != null && obj instanceof Usuario) {
            Usuario u = (Usuario) obj;
            if (!cadastraUsuario.containsKey(u.getCpf())){
                cadastraUsuario.put(u.getCpf(), u);
                return true;
            }else return false;
        }
        return false;
    }

    @Override
    public Object read(Object obj) {
        if (obj != null && obj instanceof String) {
            String cpf = (String) obj;
            return cadastraUsuario.get(cpf);
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
