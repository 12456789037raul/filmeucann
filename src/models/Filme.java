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
public class Filme {
    private int pk filme;
    private String titulo;
    private int duração;
    private LocalDate ano_realizado;
    private int fk Genero;
    private int fk realizador;
    
    
}
