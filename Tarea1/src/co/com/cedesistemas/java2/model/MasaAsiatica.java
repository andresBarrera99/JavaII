package co.com.cedesistemas.java2.model;

public class MasaAsiatica extends Masa {

    private String paisOrigen;
    private String color;

    public MasaAsiatica(String nombre, Double peso, Integer precio, String paisOrigen, String color) {
        super(nombre, peso, precio);
        this.paisOrigen = paisOrigen;
        this.color = color;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void amasar() {
        System.out.println("Amasando Masa Asiatica");
    }

    @Override
    public void mezclar() {
        System.out.println("Mezclando Masa Asiatica");
    }

    @Override
    public void hornear() {
        System.out.println("Horneando Masa Asiatica");
    }

    @Override
    public void pesar() {
        System.out.println("Pesando Masa Asiatica");
    }

    @Override
    public String toString() {
        return "MasaAsiatica{" +
                "nombre='" + nombre + '\'' +
                ", peso=" + peso +
                ", precio=" + precio +
                ", paisOrigen='" + paisOrigen + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
