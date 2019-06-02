package centruAdoptie.servicii;

import centruAdoptie.animale.Animal;
import centruAdoptie.animale.Caine;
import centruAdoptie.animale.Pisica;
import centruAdoptie.formulare.FormularAdoptii;
import centruAdoptie.locatii.Locatie;

import java.util.ArrayList;
import java.util.List;

public class ServiciuIstoricAdoptii {

    private static ServiciuIstoricAdoptii ourInstance = null;

    public static ServiciuIstoricAdoptii getInstance() {
        if(ourInstance == null){
            ourInstance = new ServiciuIstoricAdoptii();
        }
        return ourInstance;
    }

    public List<FormularAdoptii> istoricAdoptii = new ArrayList<FormularAdoptii>();

    private ServiciuIstoricAdoptii() {
        Locatie adresa1 = new Locatie("Bucuresti", "sector6", "ZboinaNeagra", "2");

        Animal animal1 = new Pisica("1","matu","12sapt","pufos, russian blue","m");
        Animal animal2 = new Pisica("2","pufy","10sapt","alb, european","f");
        Animal animal3 = new Caine("3","sasha","8sapt","heterocromat, husky","f");
        Animal animal4 = new Caine("4","mango","19sapt","tuns, maidanez","m");

        FormularAdoptii form1 = new FormularAdoptii("1234567890","gogu","m", adresa1, animal1);
        FormularAdoptii form2 = new FormularAdoptii("3333333333","goaga","f", adresa1, animal2);
        FormularAdoptii form3 = new FormularAdoptii("5555555555","mirel","m", adresa1, animal3);
        FormularAdoptii form4 = new FormularAdoptii("1233445566","miki","f", adresa1, animal4);

        istoricAdoptii.add(form1);
        istoricAdoptii.add(form2);
        istoricAdoptii.add(form3);
        istoricAdoptii.add(form4);

    }

    public void printForm(FormularAdoptii form) {
        System.out.println("CNP: " + form.getCNP());
        System.out.println("Nume: " + form.getNume());
        System.out.println("Sex: " + form.getSex());
        System.out.println("Adresa: " + form.getAdresa().getOras() +", "+ form.getAdresa().getJudet() +", "+ form.getAdresa().getStrada() +", "+ form.getAdresa().getNumar());
        System.out.println("Date animal: " + form.getAnimal().getId() +", "+ form.getAnimal().getClass().getSimpleName() +", "+ form.getAnimal().getNume() +", "+ form.getAnimal().getVarsta() +", "+ form.getAnimal().getDescriere() +", "+ form.getAnimal().getSex());
        System.out.println(" ");
    }

}
