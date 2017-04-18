package com.example.pablo.giftbook.Actividades;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.pablo.giftbook.AsyncResponse.AsyncResponse;
import com.example.pablo.giftbook.CustomListAdapter;
import com.example.pablo.giftbook.ProcessJSON.ProcessJSON;
import com.example.pablo.giftbook.R;

import java.util.ArrayList;

public class ActivityRegalos extends AppCompatActivity implements AsyncResponse {

    private static final String URL = "http://colvin.chillan.ubiobio.cl:8070/pnsilva/getRegalos.php?&format=json";
    private ArrayList<Object> arrayRegalos = new ArrayList<Object>();
    Integer[] imgid={
            R.drawable.regalito,
            R.drawable.regalito
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_regalos);

        new ProcessJSON(ActivityRegalos.this).execute(URL);







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

    @Override
    public void processFinish(ArrayList<Object> lista) {
        this.arrayRegalos = lista;
        MostrarListado();
    }


    public void MostrarListado(){
        /*
        ListView listView = (ListView) findViewById(R.id.listViewRegalosPosibles);
        ArrayAdapter<Object> adapter = new ArrayAdapter<Object>(this,
                android.R.layout.simple_list_item_activated_1, arrayRegalos);
        listView.setAdapter(adapter);*/

        ListView listView = (ListView) findViewById(R.id.listViewRegalosPosibles);
        CustomListAdapter adapter = new CustomListAdapter(this, arrayRegalos,imgid);
        listView.setAdapter(adapter);





    }




}
