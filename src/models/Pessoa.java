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
public class Pessoa {
    private int idPessoa;
    private String nome;
    private String bi;
    private LocalDate data_nascimento;
    private LocalDate data_cadastro;
    private String Email;
    private String telemovel;
    private Sexo sexo;

    public Pessoa() {
    }

    public Pessoa(int idPessoa, String nome, String bi, LocalDate data_nascimento, LocalDate data_cadastro, String Email, String telemovel, Sexo sexo) {
        this.idPessoa = idPessoa;
        this.nome = nome;
        this.bi = bi;
        this.data_nascimento = data_nascimento;
        this.data_cadastro = data_cadastro;
        this.Email = Email;
        this.telemovel = telemovel;
        this.sexo = sexo;
    }

    
    
    public int getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getBi() {
        return bi;
    }

    public void setBi(String bi) {
        this.bi = bi;
    }

    public LocalDate getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(LocalDate data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public LocalDate getData_cadastro() {
        return data_cadastro;
    }

    public void setData_cadastro(LocalDate data_cadastro) {
        this.data_cadastro = data_cadastro;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getTelemovel() {
        return telemovel;
    }

    public void setTelemovel(String telemovel) {
        this.telemovel = telemovel;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }
    
    
    
    
}
