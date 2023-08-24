/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models.beans;

import java.time.LocalDate;
import java.util.*;
import javax.swing.SpringLayout;
import models.beans.Produto;
/**
 *
 * @author Convidado
 */
public class Carrinho {
    
    private int id;
    private double valorTotal;
    private ArrayList<Produto> produtosCarrinho = new ArrayList();
    private LocalDate dataFinalizacao;
    private String tipoPagamento;

    public Carrinho(String tipoPagamento) {
        setTipoPagamento(tipoPagamento);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal() {
        double valor = 0.0;
        for(Produto e : produtosCarrinho){
            valor += e.getValor();
            this.valorTotal = valor;
        }
    }

    public ArrayList<Produto> getProdutosCarrinho() {
        return produtosCarrinho;
    }

    public void setProdutosCarrinho(Produto p) {
        this.produtosCarrinho.add(p);
        setValorTotal();
    }

    public LocalDate getDataFinalizacao() {
        return dataFinalizacao;
    }

    public void setDataCompra(LocalDate dataCompra) {
        this.dataFinalizacao = dataCompra;
    }

    public String getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }
    
    @Override
    public String toString() {
        
        return "Carrinho: " + getDataFinalizacao() + "\nvalor total: " + getValorTotal() + "\nTipo de pagamento: " + getTipoPagamento() + "\nProdutos: " + getProdutosCarrinho();
    
    }
}
