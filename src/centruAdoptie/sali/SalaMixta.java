package centruAdoptie.sali;

import centruAdoptie.animale.Caine;
import centruAdoptie.animale.Pisica;

import java.util.Arrays;

public class SalaMixta extends Sala {
    private Caine caini[];
    private Pisica pisici[];

    public SalaMixta() {
    }

    public SalaMixta(String nume, int capacitate) {
        super(nume, capacitate);
    }

    public SalaMixta(Caine[] caini, int nrCaini, Pisica[] pisici, int nrPisici) {
        this.caini = caini;
        this.pisici = pisici;
    }

    public SalaMixta(String nume, int capacitate, Caine[] caini, int nrCaini, Pisica[] pisici, int nrPisici) {
        super(nume, capacitate);
        this.caini = caini;
        this.pisici = pisici;
    }

    public Caine[] getCaini() {
        return caini;
    }

    public void setCaini(Caine[] caini) {
        this.caini = caini;
    }

    public Pisica[] getPisici() {
        return pisici;
    }

    public void setPisici(Pisica[] pisici) {
        this.pisici = pisici;
    }

    @Override
    public String toString() {
        return "SalaMixta{" +
                "nume='" + nume + '\'' +
                ", capacitate=" + capacitate +
                ", caini=" + Arrays.toString(caini) +
                ", pisici=" + Arrays.toString(pisici) +
                '}';
    }
}
