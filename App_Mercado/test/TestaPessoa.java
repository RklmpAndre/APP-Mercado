
import models.beans.Pessoa;
import models.dao.PessoaDAO;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 08050431
 */
public class TestaPessoa {
    public static void main(String[] args) {
        PessoaDAO dao = new PessoaDAO();
        Pessoa p = new Pessoa("Pedro");
        dao.create(p);
        
        Pessoa p2 = new Pessoa("Luiz");
        dao.create(p2);
        
        dao.listar();
    }
}
