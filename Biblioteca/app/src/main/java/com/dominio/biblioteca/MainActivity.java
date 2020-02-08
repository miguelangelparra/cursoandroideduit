package com.dominio.biblioteca;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    private ArrayList<Libro> Libros =new ArrayList<>();
    private AdaptadorLibro adaptador =new AdaptadorLibro();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Libros.add(new Libro(1,"1984","George Orwell"));
        Libros.add(new Libro(2,"El Tunel","Ernesto Sabato"));
        Libros.add(new Libro(3,"Harry Potter y la Piedra Filosofal","J.K. Rowling"));
        Libros.add(new Libro(4,"Sleepy Hollow","Washington Irving"));
        Libros.add(new Libro(5,"El Señor de los Anillos","Tolkien"));

        ListView LibrosLV = (ListView) findViewById(R.id.ListaBiblioteca);
        adaptador = new AdaptadorLibro(Libros);
        LibrosLV.setAdapter(adaptador);



    }
}
