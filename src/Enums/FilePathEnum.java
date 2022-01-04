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
    
    MORADA("src/files/morada.txt"),
    BAIRRO("src/files/bairro.txt"),
    MUNICIPIO("src/files/municipio.txt"),
    PROVINCIA("src/files/provincia.txt"),
    PAIS("src/files/pais.txt"),
    
    FILME_PARTICIPANTE("src/files/filme_participante.txt"),
    FILME("src/files/filme.txt"),
    AUTOR("src/files/autor.txt"),
    REALIZADOR("src/files/realizador.txt"),
    GENERO("src/files/genero.txt"),
    
    PESSOA("src/files/pessoa.txt"),
    SEXO("src/files/sexo.txt");
    
    public final String pathName;

    private FilePathEnum(String pathName) {
        this.pathName = pathName;
    }
    
    
    
    
}
