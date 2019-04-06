package centruAdoptie.adoptatori;

import centruAdoptie.formulare.FormularAdoptii;

import java.util.Date;

public class Adoptator {
    private FormularAdoptii formular;
    private String nume;
    private String prenume;
    private Integer varsta;
    private Date dataAdoptiei;

    public Adoptator(FormularAdoptii formular, String nume, String prenume, Integer varsta, Date dataAdoptiei) {
        this.formular = formular;
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.dataAdoptiei = dataAdoptiei;
    }

    public Adoptator() {
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

    public Date getDataAdoptiei() {
        return dataAdoptiei;
    }

    public void setDataAdoptiei(Date dataAdoptiei) {
        this.dataAdoptiei = dataAdoptiei;
    }

    public FormularAdoptii getFormular() {
        return formular;
    }

    public void setFormular(FormularAdoptii formular) {
        this.formular = formular;
    }
}
