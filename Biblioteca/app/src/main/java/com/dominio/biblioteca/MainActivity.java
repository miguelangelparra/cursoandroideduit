package com.dominio.biblioteca;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Libro> Libros =new ArrayList<>();
    private AdaptadorLibro adaptador =new AdaptadorLibro();
    private Toolbar TBmitoolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Libros.add(new Libro(1,"1984","George Orwell"));
        Libros.add(new Libro(2,"El Tunel","Ernesto Sabato"));
        Libros.add(new Libro(3,"Harry Potter y la Piedra Filosofal","J.K. Rowling"));
        Libros.add(new Libro(4,"Sleepy Hollow"  ,"Washington Irving"));
        Libros.add(new Libro(5,"El Señor de los Anillos","Tolkien"));
        Libros.add(new Libro(6,"Asi Hablò Zaratustra","Nietzsche"));
        Libros.add(new Libro(7,"Caperucita Roja","Desconocido"));
        Libros.add(new Libro(8,"La Mandarina Roja","Nery Davila"));
        Libros.add(new Libro(9,"El Desayuno es el almuerzo","Jesus Morales"));
        Libros.add(new Libro(10,"La Paranoia es mi vida","Daniel Morales "));
        Libros.add(new Libro(11,"Ser taxista es mi pasion","Omar Parra"));

        ListView LibrosLV = (ListView) findViewById(R.id.ListaBiblioteca);


LibroManager.getInstance().setLibros(Libros);

        adaptador = new AdaptadorLibro(Libros);
        LibrosLV.setAdapter(adaptador);

        //Busca la toolbar en el xml
        TBmitoolbar = findViewById(R.id.TBmitoolbar);

        setSupportActionBar(TBmitoolbar);
        getSupportActionBar().setTitle("Biblioteca");

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_agregar,menu);
        return super.onCreateOptionsMenu(menu);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //Evalua si alguien selecciono el item del menu
        if(item.getItemId()==R.id.item_agregar){

            Intent agregar_libro = new Intent(MainActivity.this, com.dominio.biblioteca.agregar_libro.class);
            startActivity(agregar_libro);




        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onResume() {
        super.onResume();
adaptador.setLibros(LibroManager.getInstance().getLibros());
adaptador.notifyDataSetChanged();


    }
}
