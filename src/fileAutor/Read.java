/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileAutor;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import models.Autor;

/**
 *
 * @author vicente-jpro
 */
public class Read {
    
    FileInputStream entradaArquivo;

    public Read(String path) throws FileNotFoundException {
        this.entradaArquivo = new FileInputStream( new File(path));
    }
    
    public List<Autor> readNow(){
        
        Scanner lerArquivo = new Scanner(entradaArquivo, "UTF-8");
      
        List lista = new ArrayList<Autor>();
        
        while(lerArquivo.hasNext()){
            Object nomeNoArquivo = lerArquivo.nextLine();
            lista.add( nomeNoArquivo );
           
        }
        
        return lista;
    }
    
  
    
}
