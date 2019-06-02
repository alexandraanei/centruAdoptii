package centruAdoptie.animale;

import java.io.Serializable;

public class Pisica extends Animal implements Serializable{
    public Pisica() {
    }

    public Pisica(String id, String nume, String varsta, String descriere, String sex) {
        super(id, nume, varsta, descriere, sex);
    }

    @Override
    public String toString() {
        return "Pisica{" +
                "id='" + id + '\'' +
                ", nume='" + nume + '\'' +
                ", varsta='" + varsta + '\'' +
                ", descriere='" + descriere + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }

}
