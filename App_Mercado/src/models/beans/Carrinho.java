/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models.beans;

import java.util.*;
import models.beans.Produto;
/**
 *
 * @author Convidado
 */
public class Carrinho {
    
    private double valorTotal;
    private String tipoPagamento;
    private boolean entrega = false;
    private ArrayList<Produto> carrinho;
    
    //ProdutoLista, ValorTotal, Entrega, TipoPagamento, ID, usuario
    
    public Carrinho(double valorTotal, String tipoPagamento) {
        this.valorTotal = valorTotal;
        this.tipoPagamento = tipoPagamento;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public boolean isEntrega() {
        return entrega;
    }

    public void setEntrega(boolean entrega) {
        this.entrega = entrega;
    }

    public ArrayList<Produto> getCarrinho() {
        return carrinho;
    }

    public void setCarrinho(ArrayList<Produto> carrinho) {
        this.carrinho = carrinho;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.valorTotal) ^ (Double.doubleToLongBits(this.valorTotal) >>> 32));
        hash = 29 * hash + Objects.hashCode(this.tipoPagamento);
        hash = 29 * hash + (this.entrega ? 1 : 0);
        hash = 29 * hash + Objects.hashCode(this.carrinho);
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
        final Carrinho other = (Carrinho) obj;
        if (Double.doubleToLongBits(this.valorTotal) != Double.doubleToLongBits(other.valorTotal)) {
            return false;
        }
        if (this.entrega != other.entrega) {
            return false;
        }
        if (!Objects.equals(this.tipoPagamento, other.tipoPagamento)) {
            return false;
        }
        return Objects.equals(this.carrinho, other.carrinho);
    }
    
    public void addProduto(Produto p){
        carrinho.add(p);
    }
    
    public void removeProduto(Produto p){
        carrinho.remove(p);
    }

    @Override
    public String toString() {
        return "Carrinho{" + "valorTotal=" + valorTotal + ", tipoPagamento=" + tipoPagamento + ", entrega=" + entrega + ", carrinho=" + carrinho + '}';
    }
    
}
