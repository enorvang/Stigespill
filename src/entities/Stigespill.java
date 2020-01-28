package entities;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Thread.sleep;

/**
 * @author Espen Norvang
 */
public class Stigespill {

    private Brett brett;
    private List<Spiller> spillere;
    private Terning terning;

    /**
     * Oppretter et nytt stigespill med et gitt antall spillere
     *
     */
    public Stigespill() {
        brett = new Brett(); //standard brett med 100 ruter
        spillere = new ArrayList<>();
        terning = new Terning(); //standard terning med 6 øyne
    }


    public void setSpillere(ArrayList<Spiller> spillere){
        this.spillere = spillere;
    }

    public Brett getBrett(){
        return brett;
    }

    public void spill() {
        int rundeTeller = 1;
        System.out.println("Starter spill...");

        while(noWinners()){
            System.out.println("----- Runde " + rundeTeller + " -----");
            spillRunde();
            rundeTeller++;
            try{
                sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }

        }

        System.out.println("Spill avsluttet...");
    }

    /**
     * Spiller en runde for hver spiller
     */
    private void spillRunde() {
        for (Spiller spiller : spillere) {
            spiller.spillTrekk(terning);
        }
    }

    private boolean noWinners(){
        return !spillere.stream().anyMatch(s -> s.getBrikke().getRute().getNummer() == 100);
    }
}
