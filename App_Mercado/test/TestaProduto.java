
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
        Produto p = new Produto(2, 10.90, "André", "Alimento", "Grandes Alimentos");
        Produto p1 = new Produto(5, 10.90, "André", "Alimento", "Grandes Alimentos");
        Produto p2 = new Produto(0, 10.90, "Daniel", "Alimento", "Grandes Alimentos");
        Produto p3 = new Produto(0, 10.90, "Daniel", "Alimento", "Grandes Alimentos");
        
        testaRetorno(produtos.create(p), "CREATE");
        testaRetorno(produtos.create(p1), "CREATE");
        testaRetorno(produtos.create(p2), "CREATE");
        testaRetorno(produtos.create(p3), "CREATE");
        
        System.out.println("---------------------------------------------------------");
        
        System.out.println(produtos.read(1));
        
        System.out.println("---------------------------------------------------------");
        
        p2.setId(1);
        
        testaRetorno(produtos.update(p2), "UPDATE");
        
        System.out.println(produtos.read(1));
        
        System.out.println("---------------------------------------------------------");
        
        testaRetorno(produtos.delete(1), "DELETE");
        
        System.out.println(produtos.read(1));
    }
    
    public static void testaRetorno(boolean b, String operacao) {
        if (b) { // testa se b == true
            System.out.println("Operacao realizada com sucesso!");
        } else {
            System.out.println("Falha na operacao de " + operacao);
        }
    }
}
