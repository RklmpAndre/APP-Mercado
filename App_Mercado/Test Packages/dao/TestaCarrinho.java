package dao;

import models.beans.Itens;
import models.beans.Produto;
import models.dao.ItensDAO;
import models.dao.ProdutoDAO;

/**
 *
 * @author andre
 */
public class TestaCarrinho {
    public static void main(String[] args) {
        ProdutoDAO produtos = ProdutoDAO.getInstance();
        ItensDAO itens = ItensDAO.getInstance();
        
        /*Produto p2 = new Produto(10, 20.00, "Coisinhas", "Comida", "André é um produto");*/
        
        
        Produto p = new Produto(10, 10.90, "André", "Comida", "André é um produto");
        Produto p2 = new Produto(20, 11.90, "Paolo", "Comida", "André é um produto");
        
        Itens i = new Itens(p, 8);
        Itens i2 = new Itens(p2, 8);
        
        
        testaRetorno(produtos.create(p), "Create Produto");//true
        testaRetorno(itens.create(i), "CREATE ITENS");//true
        testaRetorno(itens.create(i), "CREATE ITENS");//false
        testaRetorno(itens.create(i2), "CREATE ITENS");//false
        testaRetorno(itens.read(i) != null, "READ itens");//true
        testaRetorno(itens.read(i2) != null, "READ itens");//false
        
        
    }
    public static void testaRetorno(boolean b, String operacao) {
        if (b) { // testa se b == true
            System.out.println("Operacao realizada com sucesso!");
        } else {
            System.out.println("Falha na operacao de " + operacao);
        }
    }
}
