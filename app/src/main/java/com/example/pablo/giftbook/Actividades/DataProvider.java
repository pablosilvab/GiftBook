package com.example.pablo.giftbook.Actividades;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Pablo on 20/06/2016.
 */
public class DataProvider {

    public static HashMap<String , List<String>> getInfo(){
        HashMap<String , List<String>> MoviesDetail = new HashMap<String, List<String>>();


        List<String> Action_movies = new ArrayList<String>();
        Action_movies.add("Guardianes de la Galaxia");
        Action_movies.add("Terminator");
        Action_movies.add("The Avengers");
        Action_movies.add("Rambo");
        Action_movies.add("Star Wars");

        List<String> Romantic_movies = new ArrayList<String>();
        Romantic_movies.add("Titanic");
        Romantic_movies.add("Los Simpson");
        Romantic_movies.add("Amor sincero");
        Romantic_movies.add("Amor de mentira");
        Romantic_movies.add("Amor amor");

        List<String> Horror_movies = new ArrayList<String>();
        Horror_movies.add("El conjuro");
        Horror_movies.add("El exorcista");
        Horror_movies.add("Actividad paranormal");
        Horror_movies.add("El rito");
        Horror_movies.add("El grito");

        List<String> Comedy_movies = new ArrayList<String>();
        Comedy_movies.add("American Pie");
        Comedy_movies.add("Forrest Gump");
        Comedy_movies.add("Deadpool");
        Comedy_movies.add("Todopoderoso");
        Comedy_movies.add("Tonto y retonto");

        MoviesDetail.put("Peliculas de accion",Action_movies);
        MoviesDetail.put("Peliculas romanticas",Romantic_movies);
        MoviesDetail.put("Peliculas de terror",Horror_movies);
        MoviesDetail.put("Peliculas de comedia",Comedy_movies);

        return MoviesDetail;
    }
}
