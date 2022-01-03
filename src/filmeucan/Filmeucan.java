/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filmeucan;

import fileDatabase.Read;

import java.io.IOException;
import java.util.List;
import models.Pessoa;

/**
 *
 * @author Raúl Coimbra
 */
public class Filmeucan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic her
     Pessoa pessoa = new Pessoa();
     pessoa.setIdPessoa(2);
     pessoa.setNome("Vicente Simão o grade Javeiro");
        
        
    String path = "src/fileDatabase/pessoa.txt";
    //Write file = new Write(path, pessoa);
    //file.writeNow();
    
    Read readFile = new Read(path);
    List<GenericObject> listaObject = readFile.readNow();
    
    for (int i = 0; i < listaObject.size(); i++){
       listaObject.get(i);
        
        System.out.println(  listaObject.get(i) );
    }
     //   new FormPessoa();
    
     //Update updateFile = new Update(path, "update", "Raul programador javeiro");
     
     //updateFile.updateNow();
     

     
   //  Delete deleteFile = new Delete(path, "update");
     //deleteFile.deleteNow();
    }
}
