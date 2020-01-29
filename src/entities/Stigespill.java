package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.lang.Thread.sleep;

/**
 * @author Espen Norvang & Morten Sund
 */
public class Stigespill {

    private Brett brett;
    private List<Spiller> spillere;
    private Terning terning;
    private boolean spillVunnet;

    /**
     * Oppretter et nytt stigespill med et gitt antall spillere
     */
    public Stigespill() {
        brett = new Brett(); //standard brett med 100 ruter
        brett.leggTilSlangerOgStiger();
        spillere = new ArrayList<>();
        terning = new Terning(); //standard terning med 6 øyne
        spillVunnet = false;
    }


    public void setSpillere(ArrayList<Spiller> spillere) {
        this.spillere = spillere;
    }

    public Brett getBrett() {
        return brett;
    }

    /**
     * Kjører spillet helt til en spiller havner på rute 100 og vinner spillet
     */
    public void spill() {
        int rundeTeller = 1;
        System.out.println("Starter spill...");

        while (!spillVunnet) {
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
        System.exit(1);
    }

    /**
     * Spiller en runde for hver spiller
     */
    private void spillRunde() {
        for (Spiller spiller : spillere) {
            spiller.spillTrekk(terning);
            if(spiller.getBrikke().getRute().getNummer()==100){
                spillVunnet=true;
            }
        }
    }
}
