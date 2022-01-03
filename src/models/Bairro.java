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
public class Bairro extends Municipio{
    private int idBairro;
    private String descrição;

    public Bairro(){
    }
    
    public Bairro(int idBairro, String descrição) {
        this.idBairro = idBairro;
        this.descrição = descrição;
    }
    
    
    
    public int getIdBairro() {
        return idBairro;
    }

    public void setIdBairro(int idBairro) {
        this.idBairro = idBairro;
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

}
