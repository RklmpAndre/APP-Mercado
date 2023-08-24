
import java.util.ArrayList;
import models.beans.Carrinho;
import models.beans.Produto;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vfroe_000
 */
public class TestaCarrinho {
    public static void main(String[] args) {
        //ArrayList<Produto> carrinho = new ArrayList();
        
        Produto p = new Produto(10, 10.90, "Andre", "Alimento", "Grande Alimento");
        Produto p2 = new Produto(5, 11.90, "Arthur", "Alimento", "Grande Alimento");
        
        Carrinho carrinho = new Carrinho("Alucard");
        
        carrinho.setProdutosCarrinho(p);
        carrinho.setProdutosCarrinho(p2);
        
        System.out.println(carrinho.getValorTotal());
        
        System.out.println(carrinho.toString());
    }
    
}