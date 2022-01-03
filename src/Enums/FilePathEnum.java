/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enums;

/**
 *
 * @author vicente-jpro
 */
public enum FilePathEnum {
    
    MORADA("src/fileDatabase/pessoa.txt"),
    BAIRRO("src/fileDatabase/pessoa.txt"),
    MUNICIPIO("src/fileDatabase/pessoa.txt"),
    PROVINCIA("src/fileDatabase/pessoa.txt"),
    PAIS("src/fileDatabase/pessoa.txt"),
    
    FILME_PARTICIPANTE("src/fileDatabase/pessoa.txt"),
    FILME("src/fileDatabase/pessoa.txt"),
    AUTOR("src/fileDatabase/pessoa.txt"),
    REALIZADOR("src/fileDatabase/pessoa.txt"),
    GENERO("src/fileDatabase/pessoa.txt"),
    
    PESSOA("src/fileDatabase/pessoa.txt"),
    SEXO("src/fileDatabase/pessoa.txt");
    
    public final String pathName;

    private FilePathEnum(String pathName) {
        this.pathName = pathName;
    }
    
    
    
    
}
