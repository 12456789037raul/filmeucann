/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileFilmeParticipante;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import models.FilmeParticipante;

/**
 *
 * @author vicente-jpro
 */
public class Delete {
     private FilmeParticipante information;
     private String path;
     private final String MUDAR_LINHA = "\n";
    private final File arquivo;
     
    /**
     *
     * @param path src/fileDatabase/nomeDoFicheiro.txt
     */
    public Delete(String path, FilmeParticipante information){
         this.information = information;
         this.path = path;
         this.arquivo = new File(path);
     }
    
    public void deleteNow() throws IOException{
        createFile();
    }
    // Cria um novo ficheiro
    private void createFile() throws IOException{
    
        if (!arquivo.exists() ){
              Object pathArquivo = arquivo.createNewFile();
              System.out.println(""+pathArquivo);
           
        }
        
        
        int posicaoElemento = existElemento( information );
        if ( posicaoElemento == -1 )
        {
            System.out.println("Elemento não exite no ficheiro");
        }else{
                // Elemento existente
            Read elementos = new Read(path);
            List<FilmeParticipante> lista = elementos.readNow();
            lista.remove(posicaoElemento);
            

            FileWriter write = new FileWriter(this.arquivo);

            for( int i = 0; i <lista.size(); i++ ){

                
                write.write(lista.get(i)+""+MUDAR_LINHA);

            }
            write.flush();
            write.close();
            
        }
            
        
        
    }      
  
    // Retorna  a posição de um elemento existente na lista
    private int existElemento( Object elemento) throws FileNotFoundException{
        Read elementos = new Read(path);
        List<FilmeParticipante> lista = elementos.readNow();
        
        for ( int i = 0; i < lista.size(); i++ )
        {
            

            String elementoLista = lista.get(i).toString();
            if ( elementoLista.equalsIgnoreCase(elemento.toString()) ){
                return i;
             }
        }
        
        return -1;
    }
        
        
}
