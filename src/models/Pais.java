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
public class Pais {
    private int idPais;
    private String pais;

    public Pais() {
    }

    
    
    public Pais(int idPais, String pais) {
        this.idPais = idPais;
        this.pais = pais;
    }

    public int getIdPais() {
        return idPais;
    }

    public void setIdPais(int idPais) {
        this.idPais = idPais;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    
    
    
}
