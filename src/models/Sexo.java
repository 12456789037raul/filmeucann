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
public class Sexo {
    private int idSexo;
    private String nome_sexo;

    public Sexo() {
    }
 
    
    public Sexo(int idSexo, String nome_sexo) {
        this.idSexo = idSexo;
        this.nome_sexo = nome_sexo;
    }
      public Sexo(int idSexo) {
        this.idSexo = idSexo;
      
    }

      public Sexo( String nome_sexo) {
      
        this.nome_sexo = nome_sexo;
    }


    public int getIdSexo() {
        return idSexo;
    }

    public void setIdSexo(int idSexo) {
        this.idSexo = idSexo;
    }

    public String getNome_sexo() {
        return nome_sexo;
    }

    public void setNome_sexo(String nome_sexo) {
        this.nome_sexo = nome_sexo;
    }
    
    
}
