package com.example.pablo.giftbook.ProcessJSON;

import android.os.AsyncTask;

import com.example.pablo.giftbook.AsyncResponse.AsyncResponse;
import com.example.pablo.giftbook.HTTPData.HTTPDataHandler;
import com.example.pablo.giftbook.Objetos.Acontecimiento;
import com.example.pablo.giftbook.Objetos.Categoria;
import com.example.pablo.giftbook.Objetos.DetallePersonas;
import com.example.pablo.giftbook.Objetos.Estado;
import com.example.pablo.giftbook.Objetos.GestionRegalos;
import com.example.pablo.giftbook.Objetos.Persona;
import com.example.pablo.giftbook.Objetos.Regalo;
import com.example.pablo.giftbook.Objetos.Subcategoria;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Pablo on 07/06/2016.
 */
public class ProcessJSON extends AsyncTask<String,Void,ArrayList<Object>> {

    public AsyncResponse delegate = null;

    public ProcessJSON(AsyncResponse delegate){
        this.delegate = delegate;
    }

    protected ArrayList<Object> doInBackground(String... params) {
        String stream = null;
        ArrayList<Object> listaObjetos = new ArrayList<Object>();
        String urlString = params[0];
        HTTPDataHandler hh = new HTTPDataHandler();
        stream = hh.GetHTTPData(urlString);
        if (stream!=null){
            try {

                JSONObject reader = new JSONObject(stream);

                if (reader.has("regalos")) {
                    JSONArray regalos = reader.getJSONArray("regalos");

                    for (int i = 0; i < regalos.length(); i++) {
                        // Tomo el primer regalo
                        JSONObject objetoRegalo = regalos.getJSONObject(i);
                        JSONObject regalo = objetoRegalo.getJSONObject("regalo");

                        // Obtengo datos
                        int idRegalo = regalo.getInt("idRegalo");
                        String nombre = regalo.getString("nombre");
                        String descripcion = regalo.getString("descripcion");
                        int precio = regalo.getInt("precio");
                        String fotografia = regalo.getString("fotografia");
                        String ubicacion = regalo.getString("ubicacion");
                        int idPersona = regalo.getInt("idPersona");
                        int idEstado = regalo.getInt("idEstado");

                        // Nuevo objeto regalo
                        Regalo nuevoRegalo = new Regalo(idRegalo, nombre, descripcion, precio, fotografia, ubicacion, idPersona, idEstado);

                        listaObjetos.add(nuevoRegalo);
                    }
                }

                if(reader.has("personas")){
                    JSONArray personas = reader.getJSONArray ("personas");

                    for (int counter = 0; counter<personas.length(); counter ++){


                        JSONObject first= (JSONObject) personas.getJSONObject(counter);
                        JSONObject personaJ =first.getJSONObject("persona");

                        int idPersona= personaJ.getInt("idPersona");
                        String nombre=personaJ.getString("nombre");
                        String fechaNacimiento=personaJ.getString("fechaNacimiento");
                        String sexo=personaJ.getString("sexo");
                        int idSubcategoria= personaJ.getInt("idSubcategoria");
                        int idUsuario= personaJ.getInt("idUsuario");
                        Persona nuevaPersona= new Persona(idPersona,nombre,fechaNacimiento,sexo,idSubcategoria,idUsuario);

                        listaObjetos.add(nuevaPersona);
                    }

                }
                if(reader.has("categorias")){
                    JSONArray categorias = reader.getJSONArray ("categorias");

                    for (int counter = 0; counter<categorias.length(); counter ++){


                        JSONObject first= (JSONObject) categorias.getJSONObject(counter);
                        JSONObject categoriaJ =first.getJSONObject("categoria");

                        int idEstado= categoriaJ.getInt("idCategoria");
                        String nombre=categoriaJ.getString("nombre");
                        Categoria nuevaCategoria= new Categoria(idEstado,nombre);

                        listaObjetos.add(nuevaCategoria);
                    }

                }
                if(reader.has("subcategorias")){
                    JSONArray subcategorias = reader.getJSONArray("subcategorias");

                    for (int i = 0; i<subcategorias.length(); i++){
                        // Tomo el acontecimiento
                        JSONObject objetoSubcategoria = subcategorias.getJSONObject(i);
                        JSONObject subcategoria = objetoSubcategoria.getJSONObject("subcategoria");

                        // Obtengo datos
                        int idSubcategoria = subcategoria.getInt("idSubcategoria");
                        String nombre = subcategoria.getString("nombre");
                        int idCategoria = subcategoria.getInt("idCategoria");

                        // Nuevo objeto acontecimiento
                        Subcategoria nuevaSubcategoria = new Subcategoria(idSubcategoria,nombre,idCategoria);
                        listaObjetos.add(nuevaSubcategoria);
                    }
                }
                if(reader.has("estados")){
                    JSONArray estados = reader.getJSONArray ("estados");

                    for (int counter = 0; counter<estados.length(); counter ++){


                        JSONObject first= (JSONObject) estados.getJSONObject(counter);
                        JSONObject estadoJ =first.getJSONObject("estado");

                        int idEstado= estadoJ.getInt("idEstado");
                        String nombre=estadoJ.getString("nombre");
                        Estado nuevoEstado= new Estado(idEstado,nombre);

                        listaObjetos.add(nuevoEstado);
                    }

                }
                if(reader.has("acontecimientos")){
                    JSONArray acontecimientos = reader.getJSONArray("acontecimientos");

                    for (int i = 0; i<acontecimientos.length(); i++){
                        // Tomo el acontecimiento
                        JSONObject objetoAcontecimiento = acontecimientos.getJSONObject(i);
                        JSONObject acontecimiento = objetoAcontecimiento.getJSONObject("acontecimiento");

                        // Obtengo datos
                        int idAcontecimiento = acontecimiento.getInt("idAcontecimiento");
                        String nombre = acontecimiento.getString("nombre");
                        String fecha = acontecimiento.getString("fecha");
                        int idPersona = acontecimiento.getInt("idPersona");

                        Date fecha2= new Date();

                        // Nuevo objeto acontecimiento
                        Acontecimiento nuevoAcontecimiento = new Acontecimiento(idAcontecimiento,nombre,fecha2,idPersona);

                        listaObjetos.add(nuevoAcontecimiento);
                    }
                }
                if(reader.has("estados")){
                    JSONArray estados = reader.getJSONArray ("estados");

                    for (int counter = 0; counter<estados.length(); counter ++){


                        JSONObject first= (JSONObject) estados.getJSONObject(counter);
                        JSONObject estadoJ =first.getJSONObject("estado");

                        int idEstado= estadoJ.getInt("idEstado");
                        String nombre=estadoJ.getString("nombre");
                        Estado nuevoEstado= new Estado(idEstado,nombre);

                        listaObjetos.add(nuevoEstado);
                    }


                }
                if(reader.has("DetallesPersonas")){
                    JSONArray d = reader.getJSONArray ("DetallesPersonas");

                    for (int counter = 0; counter<d.length(); counter ++){


                        JSONObject first= (JSONObject) d.getJSONObject(counter);
                        JSONObject dJ =first.getJSONObject("DetallePersonas");

                        String nombre= dJ.getString("nombre");
                        String subcategoria=dJ.getString("subcategoria");
                        String categoria = dJ.getString("categoria");
                        DetallePersonas detalle= new DetallePersonas(nombre,subcategoria,categoria);

                        listaObjetos.add(detalle);
                    }


                }
                if(reader.has("gestionRegalos")){
                    JSONArray gestionRegalos = reader.getJSONArray("gestionRegalos");

                    for (int i = 0; i<gestionRegalos.length(); i++){
                        // Tomo el acontecimiento
                        JSONObject objetoGestionRegalos = gestionRegalos.getJSONObject(i);
                        JSONObject gestionRegalo = objetoGestionRegalos.getJSONObject("gestionRegalo");

                        // Obtengo datos
                        int idUsuario = gestionRegalo.getInt("idUsuario");
                        int idRegalo = gestionRegalo.getInt("idRegalo");

                        // Nuevo objeto acontecimiento
                        GestionRegalos nuevoGestionRegalo = new GestionRegalos(idUsuario,idRegalo);

                        listaObjetos.add(nuevoGestionRegalo);
                    }
                }

                }catch(JSONException e){
                    e.printStackTrace();
                }

        }
        return listaObjetos;
    }

    protected void onPostExecute(ArrayList<Object> str) {
        delegate.processFinish(str);
    }
}
