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
    
    private static int id = 1;
    private int qntd;
    private double valor;
    private  final String nome;
    private String tipo, descrição;

    public Produto(double valor, int qntd, String tipo, String nome, String descrição) {
        this.nome = Objects.requireNonNull(nome);
        this.setQuantidade(qntd);
        this.setValor(valor);
        this.setTipo(tipo);
        this.setDescrição(descrição);
        Produto.id += 1;
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
    
    public int getQuantidade() {
        return qntd;
    }

    public void setQuantidade(int qntd) {
        if(qntd < 0){
            throw new IllegalArgumentException("Valor nãao pode ser negativo");
        }else this.qntd = qntd;
        
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

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descricao) {
        if(Objects.requireNonNull(descricao) == null){
            System.out.println("Descricao não pode ser nulo");
        }else this.descrição = descricao; 
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
        return Objects.equals(this.descrição, other.descrição);
    }
    
    @Override
    public String toString() {
        return "Produto{" + "valor=" + valor + ", id=" + id + ", tipo=" + tipo + ", nome=" + nome + ", descri\u00e7\u00e3o=" + descrição + '}';
    }
    
}
