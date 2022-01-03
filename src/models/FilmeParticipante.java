/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.time.LocalDate;

/**
 *
 * @author Raúl Coimbra
 */
public class FilmeParticipante extends Autor{
    private LocalDate data_paticipação;
    private Filme filme;

    public FilmeParticipante(LocalDate data_paticipação, Filme filme) {
        this.data_paticipação = data_paticipação;
        this.filme = filme;
    }

    public LocalDate getData_paticipação() {
        return data_paticipação;
    }

    public void setData_paticipação(LocalDate data_paticipação) {
        this.data_paticipação = data_paticipação;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }
    
    
}
