package centruAdoptie.locatii;

public class Locatie {
    private String oras;
    private String judet;
    private String strada;
    private String numar;

    public Locatie(String oras, String judet, String strada, String numar) {
        this.oras = oras;
        this.judet = judet;
        this.strada = strada;
        this.numar = numar;
    }

    public Locatie() {
    }

    public String getOras() {
        return oras;
    }

    public void setOras(String oras) {
        this.oras = oras;
    }

    public String getJudet() {
        return judet;
    }

    public void setJudet(String judet) {
        this.judet = judet;
    }

    public String getStrada() {
        return strada;
    }

    public void setStrada(String strada) {
        this.strada = strada;
    }

    public String getNumar() {
        return numar;
    }

    public void setNumar(String numar) {
        this.numar = numar;
    }
}
