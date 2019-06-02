package centruAdoptie.modele;

import java.util.Date;

public class Proiect {
    private String nume;
    private Locatie locatie;
    private String scop;
    private Date data;

    public Proiect() {
    }

    public Proiect(String nume, Locatie locatie, String scop, Date data) {
        this.nume = nume;
        this.locatie = locatie;
        this.scop = scop;
        this.data = data;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Locatie getLocatie() {
        return locatie;
    }

    public void setLocatie(Locatie locatie) {
        this.locatie = locatie;
    }

    public String getScop() {
        return scop;
    }

    public void setScop(String scop) {
        this.scop = scop;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}
