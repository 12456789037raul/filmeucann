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
public class Municipio extends Provincia{
    private int idMunicipio;
    private String nome_municipio;

    
    public Municipio(){
    }
    
    public Municipio(int idMunicipio, String nome_municipio) {
        this.idMunicipio = idMunicipio;
        this.nome_municipio = nome_municipio;
    }

    
    public int getIdMunicipio() {
        return idMunicipio;
    }

    public String getNome_municipio() {
        return nome_municipio;
    }
    
  
}
