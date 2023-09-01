package models.beans;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author andre
 */
public class Carrinho {

    private List<Itens> itensCarrinhoLista;

    public Carrinho() {
        itensCarrinhoLista = new ArrayList<>();
    }
    public Carrinho(ArrayList<Itens> lista) {
        this.itensCarrinhoLista = lista;
    }

    public List<Itens> getItensCarrinhoLista() {
        return itensCarrinhoLista;
    }

   

    public void addLista(Produto p, int quant) {
        Itens ic = new Itens(p, quant);
        itensCarrinhoLista.add(ic);
    }

    public double calcTotal() {
        double d = 0.0;
        for (Itens ic : itensCarrinhoLista) {
            d = d + (ic.getProduto().getValor() * ic.getQuantidade());
        }

        return d;
    }

    public void exibirLista() {
        for (Itens ic : itensCarrinhoLista) {
            System.out.printf(ic.toString());
        }
        System.out.printf("\nTotal: R$ " + calcTotal());
    }
}
