
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
        Produto p1 = new Produto(0, 0, 0, "Limpeza", "Limpezos", "Grandes Limpezas");
        Produto p2 = new Produto(0, 0, 0, "Limpeza", "Limpezos", "Grandes Limpezas");
        Produto p3 = new Produto(1, 0, 0, "Bebida", "Nhami", "Grandes Sedes");
        Produto p4 = new Produto(2, 0, 0, "Higiene", "Shampoo", "Grandes Belezas");
        Produto p5 = new Produto(2, 0, 0, "Higiene", "Shampoo", "Grandes Belezas");
        Produto p6 = new Produto(4, 0, 0, null, null, null);
        
        System.out.println(p6.toString());
        
        ProdutoDAO produtos = new ProdutoDAO();
        
        
        testaRetorno(produtos.create(p6), "create");
        testaRetorno(produtos.create(null), "create");
        testaRetorno(produtos.create(p1), "create");
        testaRetorno(produtos.create(p2), "create");
        testaRetorno(produtos.create(p4), "create");
        testaRetorno(produtos.create(p5), "create");
        testaRetorno(produtos.read(p5) != null, "read");
        
        System.out.println("======================= teste delete ===================");
        
        testaRetorno(produtos.delete(p1), "DELETE");
        testaRetorno(produtos.read(p1) != null, "read");
        
        System.out.println("======================= teste update mudança===================");
        
        p4.setNome("Corações");
        
        System.out.println(produtos.read(p4));
        
        testaRetorno(produtos.read(p4) != null, "read");
    }
    
    public static void testaRetorno(boolean b, String operacao) {
        if (b) { // testa se b == true
            System.out.println("Operação realizada com sucesso !");
        } else {
            System.out.println("Falha na operação de " + operacao);
        }
    }
}
