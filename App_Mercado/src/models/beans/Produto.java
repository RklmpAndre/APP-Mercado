/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models.beans;

import java.util.Objects;

/**
 *
 * @author Convidado
 */
public class Produto {
    
    
    private int id, qntd;
    private double valor;
    private  final String nome;
    private String tipo, descricao;

    public Produto(int id, int qntd, double valor, String nome, String tipo, String descricao) {
        this.nome = Objects.requireNonNull(nome, "Nome não pode ser null");
        setId(id);
        setQuantidade(qntd);
        setValor(valor);
        setTipo(tipo);
        setDescricao(descricao);
    }

    

    public int getQuantidade() {
        return qntd;
    }

    public void setQuantidade(int qntd) {
        if(qntd < 0){
            throw new IllegalArgumentException("Quantidade não pode ser negativa");
        }else this.qntd = qntd;

    }

    public void setId(int id) {
        if(id < 0){
            throw new IllegalArgumentException("ID não pode ser negativo");
        }else this.id = id;
        
    }
    
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        if(valor < 0){
            throw new IllegalArgumentException("Valor nãao pode ser negativo");
        }else this.valor = valor;
    }

    public int getId() {
        return this.id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        if(Objects.requireNonNull(tipo) == null){
            System.out.println("Tipo não pode ser nulo");
        }else this.tipo = tipo;
    }

    public String getNome() {
        return this.nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        if(Objects.requireNonNull(descricao) == null){
            System.out.println("Descricao não pode ser nulo");
        }else this.descricao = descricao; 
    }

    @Override
    public int hashCode() {
        int hash = 7;
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
        final Produto other = (Produto) obj;
        if (this.id != other.id) {
            return false;
        }
        if (Double.doubleToLongBits(this.valor) != Double.doubleToLongBits(other.valor)) {
            return false;
        }
        if (!Objects.equals(this.tipo, other.tipo)) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return Objects.equals(this.descricao, other.descricao);
    }

    @Override
    public String toString() {
        return "Produto{" + "qntd=" + getQuantidade() + ", valor=" + getValor() + ", nome=" + getNome() + ", tipo=" + getTipo() + ", descrição=" + getDescricao() + '}';
    }
    
    
    
}
