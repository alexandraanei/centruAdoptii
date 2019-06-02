package centruAdoptie.animale;

import java.io.Serializable;

public class Caine extends Animal {
    public Caine() {
    }

    public Caine(String id, String nume, String varsta, String descriere, String sex) {
        super(id, nume, varsta, descriere, sex);
    }

    @Override
    public String toString() {
        return "Caine{" +
                "id='" + id + '\'' +
                ", nume='" + nume + '\'' +
                ", varsta='" + varsta + '\'' +
                ", descriere='" + descriere + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
