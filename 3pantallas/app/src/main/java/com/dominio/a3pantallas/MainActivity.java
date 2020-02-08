package com.dominio.a3pantallas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void asegundaPantalla(View view) {
        Intent moverPantalla= new Intent(MainActivity.this,PantallaB.class);
    startActivity(moverPantalla);

    }
}
