package com.example.pablo.giftbook.Objetos;

/**
 * Created by Linkunder on 07-06-2016.
 */

public class Persona {

    private int idPersona;
    private String nombre;
    private String fechaNacimiento;
    private String sexo;
    private int idSubcategoria;
    private int idUsuario;

    public Persona(int idPersona, String nombre, String fechaNacimiento, String sexo,int idSubcategoria, int idUsuario) {
        this.idPersona = idPersona;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.idSubcategoria = idSubcategoria;
        this.sexo = sexo;
        this.idUsuario = idUsuario;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdSubcategoria() {
        return idSubcategoria;
    }

    public void setIdSubcategoria(int idSubcategoria) {
        this.idSubcategoria = idSubcategoria;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Override
    public String toString() {
        return
                "id=" + idPersona +
                "nombre='" + nombre +
                "fechaNacimiento='" + fechaNacimiento +
                "sexo='" + sexo +
                "idSubcategoria=" + idSubcategoria +
                "idUsuario=" + idUsuario;
    }
}
