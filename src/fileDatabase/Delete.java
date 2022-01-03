/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileDatabase;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author vicente-jpro
 */
public class Delete {
     private File arquivo;
     private String information;
     
     private final String MUDAR_LINHA = "\n";
     
    /**
     *
     * @param path src/fileDatabase/nomeDoFicheiro.txt
     */
    public Delete(String path, String information){
         this.information = information;
         this.arquivo = new File("src/fileDatabase/pessoa.txt");
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
            Read elementos = new Read();
            List<String> lista = elementos.readNow();
            lista.remove(posicaoElemento);
            

            FileWriter write = new FileWriter(this.arquivo);

            for( int i = 0; i <lista.size(); i++ ){

                String dadoDaLista = lista.get(i);
                write.write(dadoDaLista+""+MUDAR_LINHA);

            }
            write.flush();
            write.close();
            
        }
            
        
        
    }      
  
    // Retorna  a posição de um elemento existente na lista
    private int existElemento( String elemento) throws FileNotFoundException{
        Read elementos = new Read();
        List<String> lista = elementos.readNow();
        
        int posicao = 0;
        for ( int i = 0; i < lista.size(); i++ )
        {
            

            String elementoLista = lista.get(i).toString();
            if ( elementoLista.equalsIgnoreCase(elemento) ){
                return i;
             }
        }
        
        return -1;
    }
        
        
}
