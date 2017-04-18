package com.example.pablo.giftbook.Actividades;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.pablo.giftbook.R;

public class ActivityNuevoRegalo extends AppCompatActivity {

    private EditText campoNombre;
    private EditText campoDescripcion;
    private EditText campoPrecio;
    private Button botonAgregar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_nuevo_regalo);


        campoNombre = (EditText) findViewById(R.id.CAMPO_NOMBRE);
        campoDescripcion = (EditText) findViewById(R.id.CAMPO_DESCRIPCION);
        campoPrecio = (EditText) findViewById(R.id.CAMPO_PRECIO);

        botonAgregar = (Button) findViewById(R.id.BOTON_AGREGAR_NUEVO);

        botonAgregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentNuevoRegalo = new Intent(ActivityNuevoRegalo.this, ActivityRegaloGuardado.class);

                // Llenar objeto

                startActivity(intentNuevoRegalo);
            }
        });



        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
