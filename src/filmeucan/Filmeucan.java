/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filmeucan;

import fileDatabase.Delete;
import fileDatabase.Read;
import fileDatabase.Update;
import fileDatabase.Write;

import java.io.IOException;

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
        
    String path = "src/fileDatabase/pessoa.txt";
   // Write file = new Write(path, "Vicente Simão");
    // file.writeNow();
    //Read readFile = new Read();
    
   // readFile.readNow();
     //   new FormPessoa();
    
     //Update updateFile = new Update(path, "update", "Raul programador javeiro");
     
     //updateFile.updateNow();
     
     Delete deleteFile = new Delete(path, "Raul programador");
     deleteFile.deleteNow();
    }
}
