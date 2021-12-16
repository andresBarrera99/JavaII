package co.com.cedesistemas.java2.model;

public class Madurez {
    private String tipoMadurez;
    private Integer dias;

    public Madurez(String tipoMadurez, Integer dias) {
        this.tipoMadurez = tipoMadurez;
        this.dias = dias;
    }

    public String getTipoMadurez() {
        return tipoMadurez;
    }

    public void setTipoMadurez(String tipoMadurez) {
        this.tipoMadurez = tipoMadurez;
    }

    public Integer getDias() {
        return dias;
    }

    @Override
    public String toString() {
        return "Madurez{" +
                "tipoMadurez='" + tipoMadurez + '\'' +
                ", dias=" + dias +
                '}';
    }

    public void setDias(Integer dias) {
        this.dias = dias;
    }

}
