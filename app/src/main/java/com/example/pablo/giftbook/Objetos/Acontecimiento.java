package com.example.pablo.giftbook.Objetos;

import java.util.Date;

/**
 * Created by Pablo on 07/06/2016.
 */
public class Acontecimiento {

    private int idAcontecimiento;
    private String nombre;
    private Date fecha;
    private int idPersona;

    public Acontecimiento(int idAcontecimiento, String nombre, Date fecha, int idPersona) {
        this.idAcontecimiento = idAcontecimiento;
        this.nombre = nombre;
        this.fecha = fecha;
        this.idPersona = idPersona;
    }

    public int getIdAcontecimiento() {
        return idAcontecimiento;
    }

    public void setIdAcontecimiento(int idAcontecimiento) {
        this.idAcontecimiento = idAcontecimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    @Override
    public String toString() {
        return "Acontecimiento{" +
                "idAcontecimiento=" + idAcontecimiento +
                ", nombre='" + nombre + '\'' +
                ", fecha=" + fecha +
                ", idPersona=" + idPersona +
                '}';
    }
}
