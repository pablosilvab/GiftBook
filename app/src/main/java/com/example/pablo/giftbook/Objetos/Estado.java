package com.example.pablo.giftbook.Objetos;

/**
 * Created by Linkunder on 07-06-2016.
 */
public class Estado {

    private int idEstado;
    private String nombre;

    public Estado(int idEstado, String nombre) {
        this.idEstado = idEstado;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Estado{" +
                "idEstado=" + idEstado +
                ", nombre='" + nombre + '\'' +
                '}';
    }

    public int getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
