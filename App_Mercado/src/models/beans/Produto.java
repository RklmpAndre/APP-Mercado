/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beans;

/**
 *
 * @author Convidado
 */
public class Produto {
    double valor;
    int id;
    String tipo, nome, descrição;

    public Produto(double valor, int id, String tipo, String nome, String descrição) {
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
    public String toString() {
        return "Produto{" + "valor=" + valor + ", id=" + id + ", tipo=" + tipo + ", nome=" + nome + ", descri\u00e7\u00e3o=" + descrição + '}';
    }
    
}
