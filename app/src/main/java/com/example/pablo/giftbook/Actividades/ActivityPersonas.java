package com.example.pablo.giftbook.Actividades;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.pablo.giftbook.AsyncResponse.AsyncResponse;
import com.example.pablo.giftbook.Objetos.DetallePersonas;
import com.example.pablo.giftbook.ProcessJSON.ProcessJSON;
import com.example.pablo.giftbook.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class ActivityPersonas extends AppCompatActivity implements AsyncResponse {

    private static String idUsuario="1";
    private static final String URL= "http://colvin.chillan.ubiobio.cl:8070/cmorar/webservicePersona.php?todos=1&format=json";
    private ArrayList<Object> lista=new ArrayList<Object>();

    HashMap<String, List<String>> Movies_category;
    List<String> Movies_list;
    ExpandableListView listaExpandible;
    MoviesAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_personas);
        //PROCESS JSON
        new ProcessJSON(ActivityPersonas.this).execute(URL);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    public void processFinish(ArrayList<Object> lista){
        this.lista=lista;
        MostrarListado();
    }
    public void MostrarListado(){

        // Lista Expandible
        listaExpandible = (ExpandableListView) findViewById(R.id.EXPANDABLE_LIST_PERSONAS);
        //HASHMAP Para guardar la lista con el expandible
        HashMap<String , List<String>> Personas = new HashMap<String, List<String>>();
        //Llenamos las categorias
        List<String> Familia = new ArrayList<String>();
        List<String> Amigos = new ArrayList<String>();
        List<String> Otros = new ArrayList<String>();



        for(int i=0; i< lista.size(); i++){
            if(((DetallePersonas)lista.get(i)).getCategoria().toString().equals("Familia")){
                Familia.add(""+((DetallePersonas) lista.get(i)).getNombre());
            }
           if((((DetallePersonas)lista.get(i)).getCategoria().toString().equals("Amigos"))){
               Amigos.add(""+((DetallePersonas) lista.get(i)).getNombre());
           }
            if((((DetallePersonas)lista.get(i)).getCategoria().toString().toString().equals("Otros"))){
                Otros.add(""+((DetallePersonas) lista.get(i)).getNombre());
            }
        }

        Personas.put("Familia",Familia);
        Personas.put("Amigos", Amigos);
        Personas.put("Otros", Otros);


        Movies_category = Personas; //hashmap completo

        Movies_list = new ArrayList<String>(Movies_category.keySet());
        adapter = new MoviesAdapter(this,Movies_category,Movies_list);
        listaExpandible.setAdapter(adapter);


        listaExpandible.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {
                Intent intentPersona = new Intent(ActivityPersonas.this, ActivityPersonaEspecial.class);
                intentPersona.putExtra("nombre",(Movies_category.get(Movies_list.get(groupPosition)).get(childPosition)));

                startActivity(intentPersona);
                return false;
            }
        });










    }


}
