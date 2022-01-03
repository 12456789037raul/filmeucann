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
public enum OperativeSystemEnum {
    
    
    //Operating system is based on Windows
    WINDOWS("win"),
    
    //Operating system is Apple OSX based
    APPLE("osx");
    
    public final String type;

    private OperativeSystemEnum(String type) {
        this.type = type;
    }
    
}
    


