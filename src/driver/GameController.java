package driver;

import entities.Brett;
import entities.Brikke;
import entities.Spiller;
import entities.Stigespill;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;

public class GameController {

    public static void main(String[] args){
        Stigespill spill = new Stigespill();
        Brett brett = spill.getBrett();
        ArrayList<Spiller> spillere = new ArrayList<>();

//        Spiller s1 = new Spiller("Espen");
//        Spiller s2 = new Spiller("Niklas");
//        Spiller s3 = new Spiller("Christian");
//        Spiller s4 = new Spiller("Morten");
//        s1.setBrikke(new Brikke("Sort", brett));
//        s2.setBrikke(new Brikke("Gul", brett));
//        s3.setBrikke(new Brikke("Rosa", brett));
//        s4.setBrikke(new Brikke("Brun", brett));
//        spillere.add(s1);
//        spillere.add(s2);
//        spillere.add(s3);
//        spillere.add(s4);

        String[] muligeAntallSpillere = {"2", "3", "4"};
        ArrayList<String> muligeFarger = new ArrayList<>(Arrays.asList("Rosa", "Sort", "Gul", "Brun"));


        JFrame frame = new JFrame("Stigespill");
        int valgtAntallSpillere = JOptionPane.showOptionDialog(null, "Velg antall spillere", "Antall spillere",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, muligeAntallSpillere, muligeAntallSpillere[0]);

        int antallSpillere = Integer.parseInt(muligeAntallSpillere[valgtAntallSpillere]);

        for(int i = 0; i < antallSpillere; i++){

            String navn = JOptionPane.showInputDialog("Navn på spiller " + (i+1) + ":");
            int fargeValg = JOptionPane.showOptionDialog(null, "Velg farge på brikke","Brikkevalg",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, muligeFarger.toArray(), muligeFarger.get(0));
            String farge = muligeFarger.get(fargeValg);
            muligeFarger.remove(fargeValg);
            Spiller s = new Spiller(navn);
            s.setBrikke(new Brikke(farge, brett));
            spillere.add(s);
        }

        if(spillere.size() >= 2){
            spill.setSpillere(spillere);
            spill.spill();
        }


    }
}
