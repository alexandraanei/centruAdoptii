package centruAdoptie.formulare;

import centruAdoptie.animale.Animal;
import centruAdoptie.modele.Locatie;

public class FormularAdoptii implements Formular {
    private String CNP;
    private String nume;
    private String sex;
    private Locatie adresa;
    private Animal animal;

    public FormularAdoptii() {
    }

    public FormularAdoptii(String CNP, String nume, String sex, Locatie adresa, Animal animal) {
        this.CNP = CNP;
        this.nume = nume;
        this.sex = sex;
        this.adresa = adresa;
        this.animal = animal;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
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
