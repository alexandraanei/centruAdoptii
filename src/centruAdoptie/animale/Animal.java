package centruAdoptie.animale;

import java.io.Serializable;

public abstract class Animal implements Serializable {
    protected String id;
    protected String nume;
    protected String varsta;
    protected String descriere;
    protected String sex;

    public Animal() {
    }

    public Animal(String id, String nume, String varsta, String descriere, String sex) {
        this.id = id;
        this.nume = nume;
        this.varsta = varsta;
        this.descriere = descriere;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id='" + id + '\'' +
                ", nume='" + nume + '\'' +
                ", varsta='" + varsta + '\'' +
                ", descriere='" + descriere + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getVarsta() {
        return varsta;
    }

    public void setVarsta(String varsta) {
        this.varsta = varsta;
    }

    public String getDescriere() {
        return descriere;
    }

    public void setDescriere(String descriere) {
        this.descriere = descriere;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
