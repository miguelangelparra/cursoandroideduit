package com.dominio.todoappmiguelangel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Para recibir informacion del intent
        Intent intent = getIntent();
        String email = intent.getStringExtra("email");
String contraseña = intent.getStringExtra("contraseña");

        Toast.makeText(this, email, Toast.LENGTH_LONG).show();
        Toast.makeText(this, contraseña, Toast.LENGTH_SHORT).show();


    }
}
