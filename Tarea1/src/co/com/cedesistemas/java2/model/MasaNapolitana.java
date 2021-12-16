package co.com.cedesistemas.java2.model;

public class MasaNapolitana extends Masa {

    private String regionOrigen;

    public MasaNapolitana(String nombre, Double peso, Integer precio, String regionOrigen) {
        super(nombre, peso, precio);
        this.regionOrigen = regionOrigen;
    }

    public String getRegionOrigen() {
        return regionOrigen;
    }

    public void setRegionOrigen(String regionOrigen) {
        this.regionOrigen = regionOrigen;
    }

    @Override
    public void amasar() {
        System.out.println("Amasando Masa Napolitana");
    }

    @Override
    public void mezclar() {
        System.out.println("Mezclando Masa Napolitana");
    }

    @Override
    public void hornear() {
        System.out.println("Horneando Masa Napolitana");
    }

    @Override
    public void pesar() {
        System.out.println("Pesando Masa Napolitana");
    }


    @Override
    public String toString() {
        return "MasaNapolitana{" +
                "nombre='" + nombre + '\'' +
                ", peso=" + peso +
                ", precio=" + precio +
                ", regionOrigen='" + regionOrigen + '\'' +
                '}';
    }
}
