/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ejercicios.libros.modelo;
import edu.ejercicios.libros.modelo.Libro;
/**
 *
 * @author ESTUDIANTE
 */
public class ConjuntoLibro {
    private Libro libros[];
    
    public ConjuntoLibro(){
        libros = new Libro[10];
    }
    public boolean creaLibro(String titulo, String autor, int paginas){
        for (int i=0;i<10;i++){
            if(libros[0]==null){
                Libro l1=new Libro(titulo,autor,paginas);
                return true;
            }
        }
        return false;
    }
}
