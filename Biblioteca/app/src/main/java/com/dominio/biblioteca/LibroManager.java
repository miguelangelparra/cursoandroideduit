package com.dominio.biblioteca;


import android.content.Context;

import com.j256.ormlite.android.apptools.OpenHelperManager;
import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.dao.Dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//Esto es un singleton
public class LibroManager {

private static LibroManager instance;
private List<Libro> libros;
//Declara dao
private Dao<Libro,Integer> dao;

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }

    private LibroManager (Context context)
    {
        OrmLiteSqliteOpenHelper helper = OpenHelperManager.getHelper(context, DBHelper.class);
        try {
            dao =helper.getDao(Libro.class);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        libros = new ArrayList<>();
}

    public List<Libro> getLibros() {

        try {
            return dao.queryForAll();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return libros;
    }
    public void agregarLibro(Libro libro){
        try {
            dao.create(libro);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


    public static LibroManager getInstance(Context context){
        if (instance==null){
            instance = new LibroManager(context);
        }
        return instance;

    }
}

/*
    public List<Libro> getLibros() {
        return libros;
    }
*/
/*
    public void agregarLibro(Libro libro){
libros.add(libro);
}*/

