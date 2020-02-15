package com.dominio.biblioteca;


import java.util.ArrayList;
import java.util.List;

//Esto es un singleton
public class LibroManager {

private static LibroManager instance;
private List<Libro> libros;

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }

    private LibroManager (){
    libros = new ArrayList<>();
}

    public List<Libro> getLibros() {
        return libros;
    }

    public void agregarLibro(Libro libro){
libros.add(libro);
}

public static LibroManager getInstance(){
    if (instance==null){
        instance = new LibroManager();
    }
        return instance;

}
    }
