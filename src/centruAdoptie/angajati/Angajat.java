package centruAdoptie.angajati;

import centruAdoptie.formulare.FormularPlata;

import java.util.Date;

public class Angajat {
    private FormularPlata formular;
    private String nume;
    private String prenume;
    private Integer varsta;
    private Date dataAngajarii;

    public Angajat() {
    }

    public Angajat(FormularPlata formular, String nume, String prenume, Integer varsta, Date dataAngajarii) {
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

    public Integer getVarsta() {
        return varsta;
    }

    public void setVarsta(Integer varsta) {
        this.varsta = varsta;
    }

    public Date getDataAngajarii() {
        return dataAngajarii;
    }

    public void setDataAngajarii(Date dataAngajarii) {
        this.dataAngajarii = dataAngajarii;
    }
}
