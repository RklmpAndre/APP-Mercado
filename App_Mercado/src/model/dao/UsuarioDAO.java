/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models.dao;

import java.util.HashMap;
import java.util.Objects;
import models.beans.Usuario;

/**
 *
 * @author andre
 */
public class UsuarioDAO implements DAO {
    
    //Implementação do padrão singleton
    //Esse padrão agrante que a classe não terá mais de uma instância
    private static UsuarioDAO udao;
    
    public static UsuarioDAO getInstance() {
        if (udao == null) {
            udao = new UsuarioDAO();
        }
        return udao;   
    }
    
     //É private para evitar que o PessoaDAO seja criado de outra forma que
    // não seja através do método getInstance.
    private UsuarioDAO(){
        
    }

    private HashMap<String, Usuario> dados = new HashMap();

    @Override
    public boolean create(Object obj) {
        Objects.requireNonNull(obj);
        if (obj instanceof Usuario) {
            Usuario u = (Usuario) obj;
            if (!dados.containsKey(u.getCpf())){
                dados.put(u.getCpf(), u);
                return true;
            }else return false;
        }
        return false;
    }

    @Override
    public Object read(Object obj) {
        Objects.requireNonNull(obj);
        if (obj instanceof String) {
            String cpf = (String) obj;
            return dados.get(cpf);
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
