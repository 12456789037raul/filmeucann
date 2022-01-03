/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileDatabase;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author vicente-jpro
 */
public class Read {
    
    FileInputStream entradaArquivo;

    public Read() throws FileNotFoundException {
        this.entradaArquivo = new FileInputStream( new File("src/fileDatabase/pessoa.txt"));
    }
    
    public void readNow(){
        Scanner lerArquivo = new Scanner(entradaArquivo, "UTF-8");
        
        while(lerArquivo.hasNext()){
            String data = lerArquivo.nextLine();
            System.out.println(data);
        }
    }
    
}
