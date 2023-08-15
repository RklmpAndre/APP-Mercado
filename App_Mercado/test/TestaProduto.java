
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
        Produto p1 = new Produto(10.90, 2, "Loucura", "nome", "descrição");
        Produto p2 = new Produto(10.90, 2, "Loucura", "nome", "descrição");
        
        
        System.out.println(p1.getId());
  
        
        
        ProdutoDAO produtos = new ProdutoDAO();
        
        System.out.println("=====================TESTE CREATE==============================");
        
        testaRetorno(produtos.create(p1), "CREATE");//sucesso
        //testaRetorno(produtos.create(p2), "CREATE");//erro
        //testaRetorno(produtos.create(p3), "CREATE");//sucesso
        //testaRetorno(produtos.create(p4), "CREATE");//sucesso
        //testaRetorno(produtos.create(p5), "CREATE");//sucesso
        
        System.out.println("=====================TESTE READ==============================");
        
        testaRetorno(produtos.read(p1) != null, "READ");//sucesso
        //testaRetorno(produtos.read(p2) != null, "READ");//sucesso por terem o mesmo id
        //testaRetorno(produtos.read(p3) != null, "READ");//sucesso
        //(produtos.read(p6) != null, "READ");//erro
        
        System.out.println("=====================TESTE DELETE==============================");
        
        testaRetorno(produtos.delete(p1), "DELETE");//sucesso
        //testaRetorno(produtos.delete(p6), "DELETE");//erro
        
        testaRetorno(produtos.read(p1) != null,"READ");//erro
        
        System.out.println("=====================TESTE UPDATE==============================");
        
        
        //---------------------------------
        produtos.listar();
        
    }
    
    public static void testaRetorno(boolean b, String operacao) {
        if (b) { // testa se b == true
            System.out.println("Operacao realizada com sucesso!");
        } else {
            System.out.println("Falha na operacao de " + operacao);
        }
    }
}
