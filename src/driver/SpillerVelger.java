package driver;

import entities.Brett;
import entities.Brikke;
import entities.Spiller;
import entities.Stigespill;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpillerVelger {
    private ArrayList<Spiller> spillere;
    private Stigespill spill;
    private final String[] ANTALL_MULIGE_SPILLERE = {"2", "3", "4"};
    private final ArrayList<String> MULIGE_FARGER = new ArrayList<>(Arrays.asList("Rosa", "Sort", "Gul", "Brun"));

    public SpillerVelger(Stigespill spill) {
        spillere = new ArrayList<>();
        this.spill = spill;
    }


    public void velgSpillere() {

        JFrame frame = new JFrame();
        int valgtAntallSpillere = JOptionPane.showOptionDialog(frame, "Velg antall spillere", "Antall spillere",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, ANTALL_MULIGE_SPILLERE, ANTALL_MULIGE_SPILLERE[0]);

        int antallSpillere = Integer.parseInt(ANTALL_MULIGE_SPILLERE[valgtAntallSpillere]);

        for (int i = 0; i < antallSpillere; i++) {
            String navn = JOptionPane.showInputDialog("Navn på spiller " + (i + 1) + ":");
            int fargeValg = JOptionPane.showOptionDialog(frame, "Velg farge på brikke", "Brikkevalg",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, MULIGE_FARGER.toArray(), MULIGE_FARGER.get(0));

            String farge = MULIGE_FARGER.get(fargeValg);
            MULIGE_FARGER.remove(fargeValg);

            Spiller s = new Spiller(navn);
            s.setBrikke(new Brikke(farge, spill.getBrett()));
            spillere.add(s);
        }

        if(spillere.size() >= 2){
            spill.setSpillere(spillere);
        }
    }

}