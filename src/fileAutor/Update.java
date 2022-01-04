/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileAutor;

import GenericObject.GenericObject;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author vicente-jpro
 */
public class Update {
     private File arquivo;
     private GenericObject oldInformation, newInformation;
     private String path;
     private final String MUDAR_LINHA = "\n";
     
    /**
     *
     * @param path src/fileDatabase/nomeDoFicheiro.txt
     */
    public Update(String path, GenericObject oldInformation, GenericObject newInformation){
         this.oldInformation = oldInformation;
         this.newInformation = newInformation;
         this.path = path;
         this.arquivo = new File(path);
     }
    
    public void updateNow() throws IOException{
        createFile();
    }
    // Cria um novo ficheiro
    private void createFile() throws IOException{
    
        if (!arquivo.exists() ){
              Object pathArquivo = arquivo.createNewFile();
              System.out.println(""+pathArquivo);
           
        }
        
        
        int posicaoElemento = existElemento( oldInformation.toString() );
        if ( posicaoElemento == -1 )
        {
            System.out.println("Elemento não exite no ficheiro");
        }else{
                // Elemento existente
            Read elementos = new Read(path);
            List<GenericObject> lista = elementos.readNow();
            lista.set(posicaoElemento, newInformation);
            

            FileWriter write = new FileWriter(this.arquivo);

            for( int i = 0; i <lista.size(); i++ ){

                String dadoDaLista = lista.get(i).toString();
                write.write(dadoDaLista+""+MUDAR_LINHA);

              

            }
            write.flush();
            write.close();
            
        }
            
        
        
    }      
  
    // Retorna  a posição de um elemento existente na lista
    private int existElemento( String elemento) throws FileNotFoundException{
        Read elementos = new Read(path);
        List<GenericObject> lista = elementos.readNow();
        
        for ( int i = 0; i < lista.size(); i++ )
        {
            

            String elementoLista = lista.get(i).toString();
            if ( elementoLista.equalsIgnoreCase(elemento) ){
                return i;
                }
            System.out.println("elemento antigo: "+elemento);
            System.out.println("elemento antigo na lista: "+lista.get(i));
        }
        
        return -1;
    }
        
        
}
