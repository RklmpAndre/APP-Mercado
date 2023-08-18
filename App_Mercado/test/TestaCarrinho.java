
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
        
        Carrinho c = new Carrinho(100.2, "pixis");
        Produto caixa = new Produto(1, 54, 54.6,"Flanelinha","Pano de limepeza", "limpa carros");
        Produto pano = new Produto(4, 26, 98.6,"papelão","para armazenamento", "forma de caixa");
        
        c.addProduto(pano);
        c.addProduto(pano); 
        
        c.listaProduto();
        
    }
    
}