package co.com.cedesistemas.java2.model;

public class MasaAmericana extends Masa {

    private Integer calorias;

    public MasaAmericana(String nombre, Double peso, Integer precio, Integer calorias) {
        super(nombre, peso, precio);
        this.calorias = calorias;
    }

    public Integer getCalorias() {
        return calorias;
    }

    public void setCalorias(Integer calorias) {
        this.calorias = calorias;
    }

    @Override
    public void amasar() {
        System.out.println("Amasando Masa Americana");
    }

    @Override
    public void mezclar() {
        System.out.println("Mezclando Masa Americana");
    }

    @Override
    public void hornear() {
        System.out.println("Horneando Masa Americana");
    }

    @Override
    public void pesar() {
        System.out.println("Pesando Masa Americana");
    }


    @Override
    public String toString() {
        return "MasaAmericana{" +
                "nombre='" + nombre + '\'' +
                ", peso=" + peso +
                ", precio=" + precio +
                ", calorias=" + calorias +
                '}';
    }
}
