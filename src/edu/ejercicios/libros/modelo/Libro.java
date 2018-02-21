/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ejercicios.libros.modelo;

/**
 *
 * @author ESTUDIANTE
 */
public class Libro {
    private String titulo, autor;
    private int paginas, calificacion;

    public Libro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public Libro(String titulo, String autor, int paginas, int calificacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.calificacion = calificacion;
        this.paginas = paginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }
    
    
}