package centruAdoptie.sali;

public abstract class Sala {
    protected String nume;
    protected int capacitate;

    public Sala() {
    }

    public Sala(String nume, int capacitate) {
        this.nume = nume;
        this.capacitate = capacitate;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getCapacitate() {
        return capacitate;
    }

    public void setCapacitate(int capacitate) {
        this.capacitate = capacitate;
    }

    @Override
    public String toString() {
        return "Sala{" +
                "nume='" + nume + '\'' +
                ", capacitate=" + capacitate +
                '}';
    }
}
