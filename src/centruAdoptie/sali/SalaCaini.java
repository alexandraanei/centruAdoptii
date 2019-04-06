package centruAdoptie.sali;

import centruAdoptie.animale.Caine;

public class SalaCaini extends Sala {
    private Caine caini[];

    public SalaCaini(Caine[] caini, int nrCaini) {
        this.caini = caini;
    }

    public SalaCaini(String nume, int capacitate, Caine[] caini, int nrCaini) {
        super(nume, capacitate);
        this.caini = caini;
    }

    public Caine[] getCaini() {
        return caini;
    }

    public void setCaini(Caine[] caini) {
        this.caini = caini;
    }
}
