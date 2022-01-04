/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileProvincia;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import models.Provincia;

/**
 *
 * @author vicente-jpro
 */
public class Write {
     private File arquivo;
     private Provincia information;
     private String path;
     private final String MUDAR_LINHA = "\n";
     
    /**
     *
     * @param path src/fileDatabase/nomeDoFicheiro.txt
     */
    public Write(String path, Provincia information){
         this.information = information;
         this.path = path;
         this.arquivo = new File(path);
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
        
        Read elementos = new Read(path);
        List<Provincia> lista = elementos.readNow();
        lista.add(information);
        
        System.out.println("Entrou escreveu "+information);
        FileWriter write = new FileWriter(this.arquivo);
        
        for( int i = 0; i <lista.size(); i++ ){
          
             write.write(lista.get(i)+""+MUDAR_LINHA);
            
        }
        
        write.flush();
        write.close();
    }      
  
        
        
        
}
