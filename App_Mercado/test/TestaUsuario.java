
import models.beans.Usuario;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author andre
 */
public class TestaUsuario {
    public static void main(String[] args) {
          Usuario user = new Usuario("André", "04021740031", "03/07/2003", "andre2016mendes@gmail.com", "01234567");
          System.out.println(user.toString());
          
          
          
    }
    
    public static void testaRetorno(boolean b, String operacao) {
        if (b) { // testa se b == true
            System.out.println("Operacao realizada com sucesso!");
        } else {
            System.out.println("Falha na operacao de " + operacao);
        }
    }
}
