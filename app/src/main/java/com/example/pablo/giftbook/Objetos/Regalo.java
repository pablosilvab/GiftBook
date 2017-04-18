package com.example.pablo.giftbook.Objetos;

/**
 * Created by Pablo on 07/06/2016.
 */
public class Regalo {

    private int idRegalo;
    private String nombre;
    private String descripcion;
    private int precio;
    private String fotogragia;
    private String ubicacion;
    private int idPersona;
    private int idEstado;

    public Regalo(int idRegalo, String nombre, String descripcion, int precio, String fotogragia, String ubicacion, int idPersona, int idEstado) {
        this.idRegalo = idRegalo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.fotogragia = fotogragia;
        this.ubicacion = ubicacion;
        this.idPersona = idPersona;
        this.idEstado = idEstado;
    }

    public int getIdRegalo() {
        return idRegalo;
    }

    public void setIdRegalo(int idRegalo) {
        this.idRegalo = idRegalo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getFotogragia() {
        return fotogragia;
    }

    public void setFotogragia(String fotogragia) {
        this.fotogragia = fotogragia;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public int getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }

    @Override
    public String toString() {
        return
                "Id Regalo=" + idRegalo + "\n" +
                "Nombre=" + nombre + "\n" +
                "Descripcion=" + descripcion + "\n" +
                "Precio=" + precio + "\n" +
                "Fotogragia=" + fotogragia + "\n" +
                "Ubicacion=" + ubicacion + "\n" +
                "Id Persona=" + idPersona + "\n" +
                "Id Estado=" + idEstado + "\n";
    }

}
