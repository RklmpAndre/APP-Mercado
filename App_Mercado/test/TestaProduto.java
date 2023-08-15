
import java.util.ArrayList;
import models.beans.Produto;
import models.dao.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 08050431
 */
public class TestaProduto {
    public static void main(String[] args) {
        
        //Instancia o DAO
        ProdutoDAO produtos = new ProdutoDAO();
        
        //Produtos
        //Produto p3 = new Produto(1, 10, 32.90, null, "ValeRroz", "Pacote de arroz"); Da erro pelo nome ser nullo
        //Produto p3 = new Produto(1, 10, 32.90, null, "ValeRroz", "Pacote de arroz"); Da erro pelo tipo ser nullo
        Produto p3 = new Produto(1, 10, 32.90, "ValeRoz", null, "Pacote de arroz"); 
        Produto p1 = new Produto(0, 11, 19.90, "Festivo", "Confetes", "Confetes festivos");
        Produto p2 = new Produto(0, 10, 32.90, "Alimenticio", "ValeRroz", "Pacote de arroz");
        

        /*dará erro por ser nulo
        Produto p2 = new Produto(19.90, 20, "Festivo", null, "Confetes festivos");*/
        
        
        
        
    }
    
    public static void testaRetorno(boolean b, String operacao) {
        if (b) { // testa se b == true
            System.out.println("Operacao realizada com sucesso!");
        } else {
            System.out.println("Falha na operacao de " + operacao);
        }
    }
}
