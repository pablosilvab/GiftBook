package com.example.pablo.giftbook.Actividades;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.TextView;

import com.example.pablo.giftbook.R;

public class ActivityPersonaEspecial extends AppCompatActivity {


    private static String idPersona="";
    private static final String URL= "http://colvin.chillan.ubiobio.cl:8070/pnsilva/regalosPersona.php?idPersona="+idPersona+"&format=json";
    ExpandableListView listaRegalosPosibles;
    ExpandableListView listaRegalosRealizados;
    TextView fechasDestacadas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_persona_especial);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        TextView nombre= (TextView) findViewById(R.id.CAMPO_PERSONA_ESPECIAL);
        String nombrePersonaEspecial= getIntent().getStringExtra("nombre");
        nombre.setText(nombrePersonaEspecial);


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
