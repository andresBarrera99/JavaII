package co.com.cedesistemas.java2.model;

public class Carne {

    private String nombre;
    private Integer precio;
    private Madurez madurez;
    private Double peso;
    private String frigorifico;

    public Carne(String nombre, Integer precio, Madurez madurez, Double peso, String frigorifico) {
        this.nombre = nombre;
        this.precio = precio;
        this.madurez = madurez;
        this.peso = peso;
        this.frigorifico = frigorifico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public Madurez getMadurez() {
        return madurez;
    }

    public void setMadurez(Madurez madurez) {
        this.madurez = madurez;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public String getFrigorifico() {
        return frigorifico;
    }

    public void setFrigorifico(String frigorifico) {
        this.frigorifico = frigorifico;
    }

    @Override
    public String toString() {
        return "Carne{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", madurez=" + madurez +
                ", peso=" + peso +
                ", frigorifico='" + frigorifico + '\'' +
                '}';
    }
}
