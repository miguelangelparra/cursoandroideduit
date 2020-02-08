package com.dominio.a3pantallas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PantallaB extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_b);
    }

    public void aTerceraPantalla(View view) {
        Intent moverPantalla=new Intent(PantallaB.this,PantallaC.class);

        startActivity(moverPantalla);
//Finaliza la activity
        //        finish();
    }
}
