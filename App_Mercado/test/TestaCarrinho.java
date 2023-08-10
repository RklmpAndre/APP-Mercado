
import beans.Carrinho;
import beans.Produto;

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
        Carrinho c = new Carrinho(100.2, "pixis");
        Produto caixa = new Produto(10.4, 0, null,"Flanelinha","Pano de limepeza");
        Produto pano = new Produto(1120.4, 1,null,"papelão","para armazenamonte");
        
        c.addProduto(caixa);
        c.addProduto(caixa); 
        c.addProduto(pano);
        
        System.out.println(c.getCarrinho());
    }
    
}