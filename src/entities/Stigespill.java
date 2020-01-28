package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
     */
    public Stigespill() {
        brett = new Brett(); //standard brett med 100 ruter
        brett.leggTilSlangerOgStiger();
        spillere = new ArrayList<>();
        terning = new Terning(); //standard terning med 6 øyne
    }


    public void setSpillere(ArrayList<Spiller> spillere) {
        this.spillere = spillere;
    }

    public Brett getBrett() {
        return brett;
    }

    public void spill() {
        int rundeTeller = 1;
        System.out.println("Starter spill...");

        while (ingenVinnere()) {
            System.out.println("----- Runde " + rundeTeller + " -----");
            spillRunde();
            rundeTeller++;
            try {
                sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

        String vinner = spillere.stream()
                .filter(s -> s.getBrikke().getRute().getNummer() == 100)
                .map(s -> s.getNavn())
                .collect(Collectors.joining());
        System.out.println("***** " + vinner + " vant. Gratulerer! *****");

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

    private boolean ingenVinnere() {
        return !spillere.stream().anyMatch(s -> s.getBrikke().getRute().getNummer() == 100);
    }
}
