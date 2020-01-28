package entities;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Espen Norvang
 */
public class Stigespill {

    private Brett brett;
    private List<Spiller> spillere;
    private Terning terning;

    /**
     * Oppretter et nytt stigespill med et gitt antall spillere
     * @param spillere
     */
    public Stigespill(ArrayList<Spiller> spillere) {
        brett = new Brett(); //standard brett med 100 ruter
        this.spillere = spillere;
        terning = new Terning(); //standard terning med 6 øyne
    }

    public void spill() {
        while(true){
            spillRunde();
        }
    }

    private void spillRunde() {
        for (Spiller spiller : spillere) {
            spiller.spillTrekk(terning);
        }

    }


}
