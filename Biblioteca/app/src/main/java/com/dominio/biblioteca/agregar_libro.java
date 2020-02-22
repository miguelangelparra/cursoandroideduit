package com.dominio.biblioteca;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class agregar_libro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar_libro);

//Va a buscar la info en el main Activity
        SharedPreferences preferences = getSharedPreferences(MainActivity.WIFI, MODE_PRIVATE);
        Boolean estado_Wifi;

        estado_Wifi = preferences.getBoolean(MainActivity.ESTADO_WIFI, true);
        if (estado_Wifi == true) {
            Toast.makeText(getApplicationContext(), "WIFI ONLY ON ", Toast.LENGTH_LONG).show();
        }
    }

    public void create(View view) {

        EditText ETtitulo = findViewById(R.id.ETtitulo);
        EditText ETautor = findViewById(R.id.ETAutor);

        String titulo,autor;

        titulo = ETtitulo.getText().toString();
        autor = ETautor.getText().toString();
        //Validando campos de libros
        if (titulo.isEmpty() || autor.isEmpty()){
            Toast.makeText(this, "Por favor, complete todos los campos. ", Toast.LENGTH_SHORT).show();
        }else{
            int id = LibroManager.getInstance(getApplicationContext()).getLibros().size()+2;
            Libro libro = new Libro(id,titulo,autor);
            LibroManager.getInstance(getApplicationContext()).agregarLibro(libro);
            finish();
              }
            }
}
