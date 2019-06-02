package centruAdoptie.modele;

import centruAdoptie.formulare.FormularPlata;

public class Clinica {
    private FormularPlata chitante[];
    private String nume;
    private Locatie locatie;
    private String tip;

    public Clinica(FormularPlata[] chitante, String nume, Locatie locatie, String tip) {
        this.chitante = chitante;
        this.nume = nume;
        this.locatie = locatie;
        this.tip = tip;
    }

    public Clinica() {
    }

    public FormularPlata[] getChitante() {
        return chitante;
    }

    public void setChitante(FormularPlata[] chitante) {
        this.chitante = chitante;
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

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }
}
