package co.com.cedesistemas.java2.model;

public class Vegetal {
    private Integer id;
    private String nombre;
    private Double peso;
    private Integer precio;

    public Vegetal(Integer id, String nombre, Double peso, Integer precio) {
        this.id = id;
        this.nombre = nombre;
        this.peso = peso;
        this.precio = precio;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
    public String toString() {
        return "Vegetal{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", peso=" + peso +
                ", precio=" + precio +
                '}';
    }
}
