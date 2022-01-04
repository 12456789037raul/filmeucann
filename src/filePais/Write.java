/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filePais;

import GenericObject.GenericObject;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import models.Pais;

/**
 *
 * @author vicente-jpro
 */
public class Write {
     private File arquivo;
     private Pais information;
     private String path;
     private final String MUDAR_LINHA = "\n";
     
    /**
     *
     * @param path src/fileDatabase/nomeDoFicheiro.txt
     */
    public Write(String path, Pais information){
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
        List<GenericObject> lista = elementos.readNow();
        lista.add(information);
        
        System.out.println("Entrou escreveu "+information);
        FileWriter write = new FileWriter(this.arquivo);
        
        for( int i = 0; i <lista.size(); i++ ){
            String dadoDaLista = lista.get(i).getObjectName().toString();
             write.write(dadoDaLista+""+MUDAR_LINHA);
            
        }
        
        write.flush();
        write.close();
    }      
  
        
        
        
}
