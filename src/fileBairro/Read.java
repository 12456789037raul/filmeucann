/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 package fileBairro;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import models.Bairro;

/**
 *
 * @author vicente-jpro
 */
public class Read {
    
    FileInputStream entradaArquivo;

    public Read(String path) throws FileNotFoundException {
        this.entradaArquivo = new FileInputStream( new File(path));
    }
    
    public List<Bairro> readNow(){
        
        Scanner lerArquivo = new Scanner(entradaArquivo, "UTF-8");
      
        List lista = new ArrayList<Bairro>();
        
        while(lerArquivo.hasNext()){
            Object nomeNoArquivo = lerArquivo.nextLine();
            lista.add( nomeNoArquivo );
           
        }
        
        return lista;
    }
    
  
    
}
