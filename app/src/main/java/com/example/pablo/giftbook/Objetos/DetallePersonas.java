package com.example.pablo.giftbook.Objetos;

/**
 * Created by Linkunder on 21-06-2016.
 */
public class DetallePersonas {

    private String nombre;
    private String subcategoria;
    private String categoria;

    public DetallePersonas(String nombre, String subcategoria, String categoria) {
        this.nombre = nombre;
        this.subcategoria = subcategoria;
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSubcategoria() {
        return subcategoria;
    }

    public void setSubcategoria(String subcategoria) {
        this.subcategoria = subcategoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "DetallePersonas{" +
                "nombre='" + nombre + '\'' +
                ", subcategoria='" + subcategoria + '\'' +
                ", categoria='" + categoria + '\'' +
                '}';
    }
}
