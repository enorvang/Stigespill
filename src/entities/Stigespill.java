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
    public Stigespill() {
        brett = new Brett(); //standard brett med 100 ruter
        spillere = new ArrayList<>();
        terning = new Terning(); //standard terning med 6 øyne
    }

    public List<Spiller> getSpillere(){
        return (ArrayList<Spiller>) spillere;
    }

    public void setSpillere(ArrayList<Spiller> spillere){
        this.spillere = spillere;
    }

    public Brett getBrett(){
        return brett;
    }

    public void spill() {
        System.out.println("Starter spill...");
        for(int i = 0; i < 20; i++){
            spillRunde();
        }
        System.out.println("Spill avsluttet...");
    }

    private void spillRunde() {
        for (Spiller spiller : spillere) {
            spiller.spillTrekk(terning);
        }
    }
}
