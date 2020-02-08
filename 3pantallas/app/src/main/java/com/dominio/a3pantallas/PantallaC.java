package com.dominio.a3pantallas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class PantallaC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_c);
    }


    //Sobreescritura del evento disparado por el  boton back
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent moverPantalla=new Intent(PantallaC.this,MainActivity.class);

        startActivity(moverPantalla);
        finish();
    }


}
