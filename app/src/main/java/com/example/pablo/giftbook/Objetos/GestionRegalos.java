package com.example.pablo.giftbook.Objetos;

/**
 * Created by Pablo on 08/06/2016.
 */
public class GestionRegalos {

    private int idUsuario;
    private int idRegalo;

    public GestionRegalos(int idUsuario, int idRegalo) {
        this.idUsuario = idUsuario;
        this.idRegalo = idRegalo;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdRegalo() {
        return idRegalo;
    }

    public void setIdRegalo(int idRegalo) {
        this.idRegalo = idRegalo;
    }

    @Override
    public String toString() {
        return "GestionRegalos{" +
                "idUsuario=" + idUsuario +
                ", idRegalo=" + idRegalo +
                '}';
    }
}
