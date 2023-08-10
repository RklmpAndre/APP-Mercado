
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
        
        ProdutoDAO produtos = new ProdutoDAO();

        produtos.create(p1);
        
    }
    
    public static void testaRetorno(boolean b, String operacao) {
        if (b) { // testa se b == true
            System.out.println("Operação realizada com sucesso !");
        } else {
            System.out.println("Falha na operação de " + operacao);
        }
    }
}
