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
public class Autor extends Pessoa{
    private int idAutor;
    private LocalDate data_cadastro;  

    public Autor(){
    }
    
    public Autor(int idAutor, LocalDate data_cadastro) {
        this.idAutor = idAutor;
        this.data_cadastro = data_cadastro;
    }

    public int getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(int idAutor) {
        this.idAutor = idAutor;
    }

    public LocalDate getData_cadastro() {
        return data_cadastro;
    }

    public void setData_cadastro(LocalDate data_cadastro) {
        this.data_cadastro = data_cadastro;
    }
    
    
}
