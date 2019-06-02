package centruAdoptie.servicii;

import centruAdoptie.animale.Caine;
import centruAdoptie.animale.Pisica;
import centruAdoptie.sali.Sala;
import centruAdoptie.sali.SalaMixta;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ServiciuCitire {
    private static ServiciuCitire ourInstance = new ServiciuCitire();

    public static ServiciuCitire getInstance() {
        return ourInstance;
    }

    private ServiciuCitire() {
    }

    public List<Pisica> citestePisiciCSV(String filename){
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";
        List<Pisica> pisici = new ArrayList<>();
        try {
            br = new BufferedReader(new FileReader(filename));
            while ((line = br.readLine()) != null) {
                String[] s = line.split(cvsSplitBy);
                Pisica p = new Pisica();
                p.setId(s[0]);
                p.setNume(s[1]);
                p.setVarsta(s[2]);
                p.setDescriere(s[3]);
                p.setSex(s[4]);
                pisici.add(p);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return pisici;
    }

    public List<Caine> citesteCainiCSV(String filename){
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";
        List<Caine> caini = new ArrayList<>();
        try {
            br = new BufferedReader(new FileReader(filename));
            while ((line = br.readLine()) != null) {
                String[] s = line.split(cvsSplitBy);
                Caine c = new Caine();
                c.setId(s[0]);
                c.setNume(s[1]);
                c.setVarsta(s[2]);
                c.setDescriere(s[3]);
                c.setSex(s[4]);
                caini.add(c);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return caini;
    }

    public List<SalaMixta> citesteSaliCSV(String filename){
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";
        List<SalaMixta> sali = new ArrayList<>();
        try {
            br = new BufferedReader(new FileReader(filename));
            while ((line = br.readLine()) != null) {
                String[] s = line.split(cvsSplitBy);
                SalaMixta c = new SalaMixta();
                c.setNume(s[0]);
                c.setCapacitate(Integer.parseInt(s[1]));
                if (c.getCapacitate() == 10) sali.add(c);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return sali;
    }

    /* public void ScrieObiectFisier(Object object, String CaleFisier) {
        try {

            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(CaleFisier));
            objectOutputStream.writeObject(object);

            objectOutputStream.flush();
            objectOutputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }


    } */

}
