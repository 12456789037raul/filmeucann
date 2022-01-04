/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enums;

/**
 *
 * @author vicente-jpro
 */
public enum SexoEnum {
    
    MASCULINO("masculino"),
    FEMININO("feminino");
    
    public final String nome;
    
    SexoEnum(String nome){
        this.nome = nome;
    }
    
}
