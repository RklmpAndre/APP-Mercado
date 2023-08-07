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
    private String tipo, nome, descrição;

    public Produto(int id, double valor, int qntd, String tipo, String nome, String descrição) {
        setQuantidade(qntd);
        this.setId(id);
        this.setValor(valor);
        this.setTipo(tipo);
        this.setNome(nome);
        this.setDescrição(descrição);
    }
    
    public double getValor() {
        
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public int getQuantidade() {
        return qntd;
    }

    public void setQuantidade(int qntd) {
        this.qntd = qntd;
    }
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        try {
            this.nome = nome;
            
        } catch (NullPointerException e) {
            
            System.out.println("O nome foi identificado como nullo, por conta disso foi atribuido um valor default");
            this.nome = "Nome Faltando";
        }
        
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
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
