package centruAdoptie.angajati;

import centruAdoptie.formulare.FormularPlata;

import java.util.Date;

public class Angajat implements Comparable<Angajat> {
    private FormularPlata formular;
    private String nume;
    private String prenume;
    private String varsta;
    private Date dataAngajarii;

    public Angajat() {
    }

    public Angajat(FormularPlata formular, String nume, String prenume, String varsta, Date dataAngajarii) {
        this.formular = formular;
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.dataAngajarii = dataAngajarii;
    }

    public FormularPlata getFormular() {
        return formular;
    }

    public void setFormular(FormularPlata formular) {
        this.formular = formular;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public String getVarsta() {
        return varsta;
    }

    public void setVarsta(String varsta) {
        this.varsta = varsta;
    }

    public Date getDataAngajarii() {
        return dataAngajarii;
    }

    public void setDataAngajarii(Date dataAngajarii) {
        this.dataAngajarii = dataAngajarii;
    }

    @Override
    public int compareTo(Angajat other) {
        return this.nume.compareTo(other.nume) == 0
                ? this.prenume.compareTo(other.prenume)
                : this.nume.compareTo(other.nume);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
