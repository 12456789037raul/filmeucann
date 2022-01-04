/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileProvincia;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import models.Provincia;

/**
 *
 * @author vicente-jpro
 */
public class Read {
    
    FileInputStream entradaArquivo;

    public Read(String path) throws FileNotFoundException {
        this.entradaArquivo = new FileInputStream( new File(path));
    }
    
    public List<Provincia> readNow(){
        
        Scanner lerArquivo = new Scanner(entradaArquivo, "UTF-8");
      
        List lista = new ArrayList<Provincia>();
        
        while(lerArquivo.hasNext()){
            Object nomeNoArquivo = lerArquivo.nextLine();
            lista.add( nomeNoArquivo );
           
        }
        
        return lista;
    }
    
  
    
}
