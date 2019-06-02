package centruAdoptie.servicii;


import centruAdoptie.modele.Adoptator;
import centruAdoptie.animale.Animal;
import centruAdoptie.animale.Caine;
import centruAdoptie.animale.Pisica;
import centruAdoptie.formulare.FormularAdoptii;
import centruAdoptie.modele.Locatie;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class ServiciuAdoptator {
    private static PrintWriter printWriter;
    private static final String LOG_LOCATION = "./adoptatori.csv";
    private static ServiciuAdoptator ourInstance = new ServiciuAdoptator();

    public static ServiciuAdoptator getInstance() {
        return ourInstance;
    }

    // public SortedSet<Angajat> ListaAngajati = new TreeSet<>();
    public List<Adoptator> listaAdoptatori = new ArrayList<Adoptator>();

    private ServiciuAdoptator() {

        try {
            printWriter = new PrintWriter(new File(LOG_LOCATION));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                closeWriter();
            }
        });

        Locatie adresa1 = new Locatie("Bucuresti", "sector6", "ZboinaNeagra", "2");

        Animal animal1 = new Pisica("1","matu","12sapt","pufos, russian blue","m");
        Animal animal2 = new Pisica("2","pufy","10sapt","alb, european","f");
        Animal animal3 = new Caine("3","sasha","8sapt","heterocromat, husky","f");
        Animal animal4 = new Caine("4","mango","19sapt","tuns, maidanez","m");

        FormularAdoptii form1 = new FormularAdoptii("1234567890","gogu","m", adresa1, animal1);
        FormularAdoptii form2 = new FormularAdoptii("3333333333","goaga","f", adresa1, animal2);
        FormularAdoptii form3 = new FormularAdoptii("5555555555","mirel","m", adresa1, animal3);
        FormularAdoptii form4 = new FormularAdoptii("1233445566","miki","f", adresa1, animal4);

        Calendar calendar = Calendar.getInstance();
        calendar.set(2018, Calendar.JUNE, 1);
        Date data1 = calendar.getTime();

        Adoptator adoptator1 = new Adoptator(form1, "gogu", "gogu", 25, data1);
        Adoptator adoptator2 = new Adoptator(form2, "a", "gog", 35, data1);
        Adoptator adoptator3 = new Adoptator(form3, "bb", "aa", 35, data1);
        Adoptator adoptator4 = new Adoptator(form4, "bb", "cc", 21, data1);

        listaAdoptatori.add(adoptator1);
        listaAdoptatori.add(adoptator2);
        listaAdoptatori.add(adoptator3);
        listaAdoptatori.add(adoptator4);

        //Collections.sort(listaAngajati);

    }
    public void scrieAdoptatorCSV(Adoptator adoptator) {

        printWriter.println(adoptator.getNume() + "," + adoptator.getPrenume() + "," + adoptator.getVarsta());
        
    }

    private boolean closeWriter () {
        boolean result = true;
        printWriter.flush();
        printWriter.close();
        return result;
    }
}
