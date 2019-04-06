package centruAdoptie.animale;

public abstract class Animal {
    private String id;
    private String nume;
    private String varsta;
    private String descriere;
    private String sex;

    public Animal() {
    }

    public Animal(String id, String nume, String varsta, String descriere, String sex) {
        this.id = id;
        this.nume = nume;
        this.varsta = varsta;
        this.descriere = descriere;
        this.sex = sex;
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
