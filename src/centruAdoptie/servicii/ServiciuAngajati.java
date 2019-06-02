package centruAdoptie.servicii;

import centruAdoptie.angajati.Angajat;
import centruAdoptie.formulare.FormularPlata;

import java.util.*;

public class ServiciuAngajati {
    private static ServiciuAngajati ourInstance = new ServiciuAngajati();

    public static ServiciuAngajati getInstance() {
        return ourInstance;
    }

    // public SortedSet<Angajat> ListaAngajati = new TreeSet<>();
    public List<Angajat> listaAngajati = new ArrayList<Angajat>();

    private ServiciuAngajati() {

        FormularPlata formular = new FormularPlata("123456789", 2000, "salariu");

        Calendar calendar = Calendar.getInstance();
        calendar.set(2018, Calendar.JUNE, 1);
        Date data1 = calendar.getTime();

        Angajat angajat1 = new Angajat(formular, "gogu", "gogu", "25", data1);
        Angajat angajat2 = new Angajat(formular, "a", "gog", "25", data1);
        Angajat angajat3 = new Angajat(formular, "bb", "aa", "25", data1);
        Angajat angajat4 = new Angajat(formular, "bb", "cc", "25", data1);

        listaAngajati.add(angajat1);
        listaAngajati.add(angajat2);
        listaAngajati.add(angajat3);
        listaAngajati.add(angajat4);

        Collections.sort(listaAngajati);

    }
    public void printAngajat(Angajat angajat) {
        //System.out.println("CNP: ");
        System.out.println("Nume: "+ angajat.getNume());
        System.out.println("Prenume: "+ angajat.getPrenume());
        System.out.println("Varsta: "+ angajat.getVarsta());
        System.out.println(" ");
    }
}
