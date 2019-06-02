package centruAdoptie.formulare;


import centruAdoptie.locatii.Locatie;

public class FormularPlata implements Formular {
    private String CNP;
    private int cost;
    private String descriere;

    public FormularPlata() {
    }

    public FormularPlata(String CNP, int cost, String descriere) {
        this.CNP = CNP;
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


    @Override
    public String getCNP() {
        return CNP;
    }

    @Override
    public String getNume() {
        return null;
    }

    @Override
    public String getSex() {
        return null;
    }

    @Override
    public Locatie getAdresa() {
        return null;
    }

}
