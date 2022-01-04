/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filePessoa;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import models.Pessoa;

/**
 *
 * @author vicente-jpro
 */
public class Read {
    
    FileInputStream entradaArquivo;

    public Read(String path) throws FileNotFoundException {
        this.entradaArquivo = new FileInputStream( new File(path));
    }
    
    public List<Pessoa> readNow(){
        
        Scanner lerArquivo = new Scanner(entradaArquivo, "UTF-8");
      
        List lista = new ArrayList<Pessoa>();
        
        while(lerArquivo.hasNext()){
            lista.add( lerArquivo.next() );
           
        }
        
        return lista;
    }
    
  
    
}
