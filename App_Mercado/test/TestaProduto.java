
import beans.Produto;

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
        Produto p = new Produto(10.4, 0,null,"Flanelinha","Pano de limepeza");
        
        System.out.println(p.toString());
    }
}
