package co.com.cedesistemas.java2.model;

public class Salsa {

    private Integer id;
    private String nombre;
    private Integer precio;
    private String flavor;
    private Integer grams;

    public Salsa(Integer id, String nombre, Integer precio, String flavor, Integer grams) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.flavor = flavor;
        this.grams = grams;
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

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public Integer getGrams() {
        return grams;
    }

    public void setGrams(Integer grams) {
        this.grams = grams;
    }

    @Override
    public String toString() {
        return "Salsa{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", flavor='" + flavor + '\'' +
                ", grams=" + grams +
                '}';
    }
}
