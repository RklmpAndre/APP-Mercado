
import models.beans.Usuario;
import models.dao.UsuarioDAO;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author andre
 */
public class TestaUsuarioDAO {
    public static void main(String[] args) {
        UsuarioDAO userList = new UsuarioDAO();
        
        Usuario user = new Usuario("André", "04021740031", "03/07/2003", "andre2016mendes@gmail.com", "01234567");
        
        testaRetorno(userList.create(user), "CREATE");
        testaRetorno(userList.read(user.getCpf()) != null, "READ");
        
    }
    public static void testaRetorno(boolean b, String operacao) {
        if (b) { // testa se b == true
            System.out.println("Operacao realizada com sucesso!");
        } else {
            System.out.println("Falha na operacao de " + operacao);
        }
    }
}
