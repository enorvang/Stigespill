package entities;

import java.util.ArrayList;
import java.util.List;

public class Stigespill {

    private Brett brett;
    private List<Spiller> spillere;
    private Terning terning;

    public Stigespill() {
        brett = new Brett(); //standard brett med 100 ruter
        spillere = new ArrayList<>();
        terning = new Terning(); //standard terning med 6 øyne
    }

    public void spill() {
        while (true) {
            spillRunde();
        }
    }

    private void spillRunde() {
        for (Spiller spiller : spillere) {
            spiller.spillTrekk(terning);
        }
    }

}
