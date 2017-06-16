package com.example.jose6jas.aplicacioncorreo.pojo;

/**
 * Created by jose6jas on 6/15/17.
 */

public class Foto {
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    private String nombre;
    private int foto;
    private int count;

    public Foto(String nombre, int foto, int count){
        this.nombre = nombre;
        this.foto = foto;
        this.count = count;


    }

}
