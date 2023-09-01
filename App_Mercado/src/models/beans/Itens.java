package models.beans;

import java.util.Objects;

/**
 *
 * @author andre
 */
public class Itens {
    private Produto produto;
    private int quantidade;

    public Itens(Produto produto, int quantidade) {
        setProduto(produto);
        setQuantidade(quantidade);
    }

    public Itens() {
        
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        Objects.requireNonNull(produto, "Produto não pode ser nulo");
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if(quantidade < 0){
            throw new IllegalArgumentException("Quantidade não pode ser negativa");
        }
        this.quantidade = quantidade;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.produto);
        hash = 59 * hash + this.quantidade;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Itens other = (Itens) obj;
        if (this.quantidade != other.quantidade) {
            return false;
        }
        return Objects.equals(this.produto, other.produto);
    }
    
    
    
    @Override
    public String toString() {
        return "Produto: " + produto.getDescricao() + " | Valor: R$" + produto.getValor()+ " | Quantidade: " + getQuantidade() + " | Total: R$" + (getQuantidade() * produto.getValor()) + "\n";
    }
}
