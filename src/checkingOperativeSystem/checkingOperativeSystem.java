/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkingOperativeSystem;

/**
 * //Operating system is based on Windows
    WINDOWS("win"),
    
    //Operating system is Apple OSX based
    APPLE("osx");
 * @author vicente-jpro
 */
public class checkingOperativeSystem {
    
    private String type;

    public checkingOperativeSystem(String type ) {
        this.type = System.getProperty("os.name").toLowerCase();
    }
   
   public boolean is_windows(String name){
       return type.contains(name);
   }
   
    
}
