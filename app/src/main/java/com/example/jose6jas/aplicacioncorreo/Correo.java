package com.example.jose6jas.aplicacioncorreo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Correo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_correo);
        Toolbar miActionBar = (Toolbar) findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button enviar = (Button) findViewById(R.id.enviar);

        enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText correo = (EditText) findViewById(R.id.correo);
                EditText asunto = (EditText) findViewById(R.id.asunto);
                EditText mensaje = (EditText) findViewById(R.id.mensaje);

                if(correo.getText().toString().equals("correo@correo.com")){
                    Toast.makeText(getApplicationContext(),
                            "Debes escribir un correo", Toast.LENGTH_SHORT).show();


                }else{
                    EnviarMensaje(correo.getText().toString(),asunto.getText().toString(),mensaje.getText().toString());
                    Toast.makeText(getApplicationContext(),
                            "Mensaje enviado a "+correo.getText().toString(), Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    public void EnviarMensaje(String correo, String asunto, String contenido){
        //Esta Cuenta es de MORA VICTOR no queria crear otra adicional
        new MailJob("devtestsvm@gmail.com", "lalala123!").execute(
                new MailJob.Mail("devtestsvm@gmail.com", correo, asunto, contenido)
        );
    }
}
