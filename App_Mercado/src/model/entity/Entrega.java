/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models.beans;

import java.time.LocalDate;

/**
 *
 * @author andre
 */
public class Entrega {
    
    private Endereco local;
    private LocalDate dataSaida, dataChegada;

    public Entrega(Endereco local, LocalDate dataSaida, LocalDate dataChegada) {
        this.local = local;
        this.dataSaida = dataSaida;
        this.dataChegada = dataChegada;
    }

    public LocalDate getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(LocalDate dataSaida) {
        this.dataSaida = dataSaida;
    }

    public LocalDate getDataChegada() {
        return dataChegada;
    }

    public void setDataChegada(LocalDate dataChegada) {
        this.dataChegada = dataChegada;
    }
    
    
}
