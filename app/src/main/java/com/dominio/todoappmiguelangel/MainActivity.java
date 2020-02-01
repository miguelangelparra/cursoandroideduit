package com.dominio.todoappmiguelangel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

//APP CompatActivity es la clase que permite hacer activities
//OnclickListener es una interface para la escucha del evento click
//Toda clase que implementa una interfaces se vuelve la interface
public class MainActivity extends AppCompatActivity
        implements View.OnClickListener {

    //Cada tag debe importarse en java con el mismo nombre.  en el constructo se debe buscar la referencia al layout con el id
    private EditText etEmail ;
    private EditText etContraseña;
    private Button btnLogin ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //R es una clase java que se autogenera, como una libreta index, Sabe donde esta cada recurso
        //Por ejemplo de layout saca el file del activity main
        setContentView(R.layout.activity_main);

        //Cada tag debe importarse en java con el mismo nombre.  en el constructo se debe buscar la referencia al layout con el id
         etEmail = findViewById(R.id.et_email);
        etContraseña = findViewById(R.id.et_contraseña);
         btnLogin =findViewById(R.id.btn_login);
//Metodo setOnClickListener permite escuchar el evento click. Vive en la clase View , en la interface OnclickListener
        btnLogin.setOnClickListener(this);

    }

    //Como todos los botones y edit son view puedo evaluarlos como view para saber a que hace referencia el click
    @Override
    public void onClick(View v) {
//Aca se ejecuta toda la logica luego del click
if (v==btnLogin){
    attempLogin();

}

    }

    private void attempLogin() {
        String email = etEmail.getText().toString();
        String contraseña = etContraseña.getText().toString();
        //Valida credenciales
        if(validateCredentials(email,contraseña)){
            //Avisar al usuario que algoo salio mal
            Toast.makeText(this, "Credenciales invalidas ", Toast.LENGTH_LONG).show();
            return;
        }
        //Llamada a metodo que loguea
         login(email,contraseña);

        }
        //Metodo que valida credenciales
    private boolean validateCredentials(String email, String contraseña){
return email.isEmpty()||contraseña.isEmpty() ;
    }

    //Metodo que dispara login
    private void login(String email, String contraseña) {
        Toast.makeText(this, "Bienvenido "+ email + ", te estabamos esperando. ", Toast.LENGTH_LONG).show();

    }

}
