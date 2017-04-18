package com.example.pablo.giftbook.Objetos;

/**
 * Created by Pablo on 08/06/2016.
 */
public class Subcategoria {

    private int idSubcategoria;
    private String nombre;
    private int idCategoria;

    public Subcategoria(int idSubcategoria, String nombre, int idCategoria) {
        this.idSubcategoria = idSubcategoria;
        this.nombre = nombre;
        this.idCategoria = idCategoria;
    }

    public int getIdSubcategoria() {
        return idSubcategoria;
    }

    public void setIdSubcategoria(int idSubcategoria) {
        this.idSubcategoria = idSubcategoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    @Override
    public String toString() {
        return "Subcategoria{" +
                "idSubcategoria=" + idSubcategoria +
                ", nombre='" + nombre + '\'' +
                ", idCategoria=" + idCategoria +
                '}';
    }
}
