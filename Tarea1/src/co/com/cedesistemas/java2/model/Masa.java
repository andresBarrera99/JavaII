package co.com.cedesistemas.java2.model;

import co.com.cedesistemas.java2.adapter.IAccionesMasa;

public class Masa implements IAccionesMasa {
    protected String nombre;
    protected Double peso;
    protected Integer precio;

    public Masa(String nombre, Double peso, Integer precio) {
        this.nombre = nombre;
        this.peso = peso;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    @Override
    public void amasar() {
        System.out.println("kneading any masa");
    }

    @Override
    public void mezclar() {
        System.out.println("mixing any masa");
    }

    @Override
    public void hornear() {
        System.out.println("baking any masa");
    }

    @Override
    public void pesar() {
        System.out.println("weighing any masa");
    }

    @Override
    public String toString() {
        return "Masa{" +
                "nombre='" + nombre + '\'' +
                ", peso=" + peso +
                ", precio=" + precio +
                '}';
    }
}
