package centruAdoptie.sali;

import centruAdoptie.animale.Pisica;

public class SalaPisici extends Sala {
    private Pisica pisici[];


    public SalaPisici(Pisica[] pisici, int nrPisici) {
        this.pisici = pisici;
    }

    public SalaPisici(String nume, int capacitate, Pisica[] pisici, int nrPisici) {
        super(nume, capacitate);
        this.pisici = pisici;
    }

    public Pisica[] getPisici() {
        return pisici;
    }

    public void setPisici(Pisica[] pisici) {
        this.pisici = pisici;
    }

}
