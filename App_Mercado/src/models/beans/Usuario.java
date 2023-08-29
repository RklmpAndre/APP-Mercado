/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models.beans;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;


/**
 *
 * @author Convidado
 */
public class Usuario {

    private String nome, cpf, email, senha;
    private LocalDate dataNascimento;
    

    public Usuario(String nome, String cpf, String dataNascimento, String email, String senha) {
        setNome(nome);
        setCpf(cpf);
        setDataNascimento(dataNascimento);
        setEmail(email);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(Objects.requireNonNull(nome) != null){
            this.nome = nome;
        }else System.out.println("Nome não pode ser nulo");
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if(Objects.requireNonNull(cpf) != null){
            this.cpf = cpf;
        }else System.out.println("CPF não pode ser nulo");

    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/uuuu");
        LocalDate dt1 = LocalDate.parse(dataNascimento, formatter);
        this.dataNascimento = dt1;
        
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(Objects.requireNonNull(email) != null){
            this.email = email;
        }else System.out.println("Email não pode ser nulo");
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        if(Objects.requireNonNull(senha) != null){
            if(senha.length() < 8){
                System.out.println("Senha muito curta");
            }else this.senha = senha;
        }else System.out.println("Senha não pode ser nula");

    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.nome);
        hash = 97 * hash + Objects.hashCode(this.cpf);
        hash = 97 * hash + Objects.hashCode(this.dataNascimento);
        hash = 97 * hash + Objects.hashCode(this.email);
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
        final Usuario other = (Usuario) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        return Objects.equals(this.dataNascimento, other.dataNascimento);
    }

    @Override
    public String toString() {
        return "Usuario{" + "nome: " + nome + ", cpf: " + cpf + ", dataNascimento: " + dataNascimento + ", email: " + email + '}';
    }
}
