package co.com.cedesistemas.java2.model;

import java.util.List;
import java.util.Map;

public class Pizza {
    private String nombre;
    private List<Vegetal> vegetales;
    private Masa masa;
    private Map<String, Carne> carnes;
    private List<Salsa> salsas;
    private Integer precio;

    public Pizza() {
        super();
    }

    public Pizza(String nombre, List<Vegetal> vegetales, Masa masa, Map<String, Carne> carnes, List<Salsa> salsas, Integer precio) {
        super();
        this.nombre = nombre;
        this.vegetales = vegetales;
        this.masa = masa;
        this.carnes = carnes;
        this.salsas = salsas;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Vegetal> getVegetales() {
        return vegetales;
    }

    public void setVegetales(List<Vegetal> vegetales) {
        this.vegetales = vegetales;
    }

    public Masa getMasa() {
        return masa;
    }

    public void setMasa(Masa masa) {
        this.masa = masa;
    }

    public Map<String, Carne> getCarnes() {
        return carnes;
    }

    public void setCarnes(Map<String, Carne> carnes) {
        this.carnes = carnes;
    }

    public List<Salsa> getSalsas() {
        return salsas;
    }

    public void setSalsas(List<Salsa> salsas) {
        this.salsas = salsas;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public void calcularPrecio() {
        int price = masa.getPrecio();
        for(Vegetal vegetal: vegetales){
            price += vegetal.getPrecio();
        }
        for (Salsa salsa: salsas){
            price += salsa.getPrecio();
        }
        for (Carne carne : carnes.values()){
            price += carne.getPrecio();
        }
        this.setPrecio(price);
    }


    private double calcularPeso() {
        double weigth = masa.getPeso();
        for(Vegetal vegetal: vegetales){
            weigth += vegetal.getPeso();
        }
        for (Carne carne : carnes.values()){
            weigth += carne.getPeso();
        }
        return weigth;
    }

    private String getStrVegetales(){
        boolean isFirst = true;
        StringBuilder sb = new StringBuilder();
        for(Vegetal vegetal: vegetales){
            if (!isFirst)
                sb.append(",");
            sb.append(vegetal.getNombre());
            isFirst = false;
        }
        return sb.toString();
    }
    private String getStrSalsas(){
        boolean isFirst = true;
        StringBuilder sb = new StringBuilder();
        for (Salsa salsa: salsas){
            if (!isFirst)
                sb.append(",");
            sb.append(salsa.getNombre());
            isFirst = false;
        }
        return sb.toString();
    }
    private String getStrCarnes(){
        boolean isFirst = true;
        StringBuilder sb = new StringBuilder();
        for (Carne carne : carnes.values()){
            if (!isFirst)
                sb.append(",");
            sb.append(carne.getNombre());
            isFirst = false;
        }
        return sb.toString();
    }
    public String getDescripcion(){

        return nombre +
                "\n\tMasa:" + getMasa().getNombre() +
                "\n\tIngredientes:" +
                "\n\t\t" + "Carnes:" +
                "\n\t\t\t" + getStrCarnes() +
                "\n\t\t" + "Salsas:" +
                "\n\t\t\t" + getStrSalsas() +
                "\n\t\t" + "Vegetales:" +
                "\n\t\t\t" + getStrVegetales() +
                "\n\tPeso:" + calcularPeso() +
                "\n\tPrecio:" + getPrecio();
    }


    @Override
    public String toString() {
        return "Pizza{" +
                "nombre='" + nombre + '\'' +
                ", vegetales=" + vegetales +
                ", masa=" + masa +
                ", carnes=" + carnes +
                ", salsas=" + salsas +
                ", precio=" + precio +
                '}';
    }

}
