package centruAdoptie.formulare;

import centruAdoptie.locatii.Locatie;

public class FormularPlata implements Formular {
    private String CNP;
    private String nume;
    private String sex;
    private Locatie adresa;
    private int cost;
    private String descriere;

    public FormularPlata() {
    }

    public FormularPlata(String CNP, String nume, String sex, Locatie adresa, int cost, String descriere) {
        this.CNP = CNP;
        this.nume = nume;
        this.sex = sex;
        this.adresa = adresa;
        this.cost = cost;
        this.descriere = descriere;
    }

    public String getDescriere() {
        return descriere;
    }

    public void setDescriere(String descriere) {
        this.descriere = descriere;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setCNP(String CNP) {
        this.CNP = CNP;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAdresa(Locatie adresa) {
        this.adresa = adresa;
    }

    @Override
    public String getCNP() {
        return CNP;
    }

    @Override
    public String getNume() {
        return nume;
    }

    @Override
    public String getSex() {
        return sex;
    }

    @Override
    public Locatie getAdresa() {
        return adresa;
    }
}
