/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ejercicios.libros.modelo;
import java.util.ArrayList;
/**
 *
 * @author ESTUDIANTE
 */
public class ConjuntoLibro {
    private ArrayList<Libro> libros;
    
    public ConjuntoLibro(){
        this.libros = new ArrayList<>();
    }
    public boolean creaLibro(Libro libro){
        return this.libros.add(libro);
    }
    public ArrayList<Libro> mostraLibros(){
        return this.libros;
    }
    public boolean eliminarxAutor(String nombre){
        for (Libro libro :this.libros){
            if (libro.getAutor().equals(nombre)){
                return libros.remove(libro);
            }
        }
        return false;
    }
    public boolean eliminarxTitulo(String titulo){
        for (Libro libro :this.libros){
            if (libro.getAutor().equals(titulo)){
                return libros.remove(libro);
            }
        }
        return false;
    }
}
