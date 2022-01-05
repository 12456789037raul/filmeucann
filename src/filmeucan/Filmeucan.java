/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filmeucan;


import Enums.FilePathEnum;
import filePessoa.Read;
import java.io.IOException;
import java.util.List;
import models.Pessoa;
import views.ReadJframe;

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
        
      /*   
    String path = "src/fileDatabase/pessoa.txt";
    Write file = new Write(path, pessoa);
    file.writeNow();
   */
    Read readFile = new Read(FilePathEnum.PESSOA.pathName);
    List<Pessoa> listaPessoa = readFile.readNow();
    
    
    new ReadJframe(listaPessoa);
    
    for (int i = 0; i < listaPessoa.size(); i++){
       listaPessoa.get(i);
        
        System.out.println(  listaPessoa.get(i) );
    }

    
     //new PessoaForm();
     
       
    
     //Update updateFile = new Update(path, "update", "Raul programador javeiro");
     
     //updateFile.updateNow();
     

     
   //  Delete deleteFile = new Delete(path, "update");
     //deleteFile.deleteNow();
    }
}
