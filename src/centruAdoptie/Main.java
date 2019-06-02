package centruAdoptie;

import centruAdoptie.animale.Caine;
import centruAdoptie.animale.Pisica;
import centruAdoptie.sali.SalaMixta;
import centruAdoptie.servicii.*;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        ServiciuIstoricAdoptii istoric = ServiciuIstoricAdoptii.getInstance();
        ServiciuAngajati angajati = ServiciuAngajati.getInstance();
        ServiciuAudit audit = ServiciuAudit.getInstance();
        ServiciuAdoptator adoptator = ServiciuAdoptator.getInstance();


        System.out.println("Istoricul adoptiilor: \n");
        ///Afiseaza istoricul adoptiilor
        for(int i=0; i < istoric.istoricAdoptii.size(); i++) {
            istoric.printForm(istoric.istoricAdoptii.get(i));
        }
        audit.writeLogLine("afisare istoric adoptii");


        System.out.println("Pacientii sortati alfabetic: \n");
        ///Afiseaza angajatii sortati alfabetic
        for(int i=0; i < angajati.listaAngajati.size(); i++) {
            angajati.printAngajat(angajati.listaAngajati.get(i));
        }
        audit.writeLogLine("afisare pacienti alfabetic");


        System.out.println("Pisicile disponibile pt adoptie:");
        //Citeste din .csv pisicile pt adoptie
        List<Pisica> pisici;
        pisici = ServiciuCitire.getInstance().citestePisiciCSV("./pisici.csv");
        System.out.println(pisici);
        audit.writeLogLine("afisare pisici pt adoptie");


        System.out.println("\nCainii disponibile pt adoptie:");
        //Citeste din .csv cainii pt adoptie
        List<Caine> caini;
        caini = ServiciuCitire.getInstance().citesteCainiCSV("./caini.csv");
        System.out.println(caini);
        audit.writeLogLine("afisare caini pt adoptie");


        System.out.println("\nSalile cu capacitate = 10:");
        //Citeste din .csv salile disponibile si afiseaza cele cu capacitatea 10.
        List<SalaMixta> sali;
        sali = ServiciuCitire.getInstance().citesteSaliCSV("./sali.csv");
        System.out.println(sali);
        audit.writeLogLine("afisare sali capacitate 10");

        System.out.println("\nAdoptatorii care sunt mai in varsta de 30 de ani");
        for(int i=0; i < adoptator.listaAdoptatori.size(); i++) {
            if(adoptator.listaAdoptatori.get(i).getVarsta() > 29)
                adoptator.scrieAdoptatorCSV(adoptator.listaAdoptatori.get(i));
        }
        System.out.println("Vezi fisierul adoptatori.csv");
        audit.writeLogLine("adoptatori mai in varsta 30");
    }
}
