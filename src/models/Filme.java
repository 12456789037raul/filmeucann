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
public class Filme extends Genero{
    private int idFilme;
    private String titulo;
    private int duração;
    private LocalDate ano_realizado;
    private Realizador realizador;

    public Filme(int idFilme, String titulo, int duração, LocalDate ano_realizado, Realizador realizador) {
        this.idFilme = idFilme;
        this.titulo = titulo;
        this.duração = duração;
        this.ano_realizado = ano_realizado;
        this.realizador = realizador;
    }

    public int getIdFilme() {
        return idFilme;
    }

    public void setIdFilme(int idFilme) {
        this.idFilme = idFilme;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuração() {
        return duração;
    }

    public void setDuração(int duração) {
        this.duração = duração;
    }

    public LocalDate getAno_realizado() {
        return ano_realizado;
    }

    public void setAno_realizado(LocalDate ano_realizado) {
        this.ano_realizado = ano_realizado;
    }

    public Realizador getRealizador() {
        return realizador;
    }

    public void setRealizador(Realizador realizador) {
        this.realizador = realizador;
    }

   

   
    
    
    
    
}
