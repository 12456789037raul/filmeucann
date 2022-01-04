/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author Raúl Coimbra
 */
import java.time.LocalDate;

public class Realizador extends Pessoa{
    private int idRealizador;
    private LocalDate dataCadastro; 

    public Realizador(int idRealizador, LocalDate dataCadastro) {
        this.idRealizador = idRealizador;
        this.dataCadastro = dataCadastro;
    }

    public int getIdRealizador() {
        return idRealizador;
    }

    public void setIdRealizador(int idRealizador) {
        this.idRealizador = idRealizador;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
    
    
    
}
