/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileDatabase;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author vicente-jpro
 */
public class Write {
     private File arquivo;
     private String information;
     private final String MUDAR_LINHA = "\n";
     
    /**
     *
     * @param path src/fileDatabase/nomeDoFicheiro.txt
     */
    public Write(String path, String information){
         this.information = information;
         this.arquivo = new File("src/fileDatabase/pessoa.txt");
     }
    
    public void writeNow() throws IOException{
        createFile();
    }
    // Cria um novo ficheiro
    private void createFile() throws IOException{
    
        if (!arquivo.exists() ){
              Object pathArquivo = arquivo.createNewFile();
              System.out.println(""+pathArquivo);
           
        }
        System.out.println("Entrou escreveu "+information);
        FileWriter write = new FileWriter(this.arquivo);
 
        write.append(information+""+MUDAR_LINHA);
        
        write.flush();
        write.close();
    }      
  
        
        
        
}
