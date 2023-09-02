/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.entity;

/**
 *
 * @author 08050431
 */
public class Pessoa {
    private String nome;
    private static int id;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", id=" + id + '}';
    }
    
    
}
