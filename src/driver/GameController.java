package driver;

import entities.Brett;
import entities.Brikke;
import entities.Spiller;
import entities.Stigespill;

import java.util.ArrayList;

public class GameController {

    public static void main(String[] args){
        Stigespill spill = new Stigespill();
        Brett brett = spill.getBrett();
        Spiller s1 = new Spiller("Espen");
        Spiller s2 = new Spiller("Morten");
        Spiller s3 = new Spiller("Hanna");
        Spiller s4 = new Spiller("Ingrid");

        s1.setBrikke(new Brikke("Sort", brett));
        s2.setBrikke(new Brikke("Gul", brett));
        s3.setBrikke(new Brikke("Rosa", brett));
        s4.setBrikke(new Brikke("Brun", brett));

        ArrayList<Spiller> spillere = new ArrayList<>();
        spillere.add(s1);
        spillere.add(s2);
        spillere.add(s3);
        spillere.add(s4);

        spill.setSpillere(spillere);

        spill.spill();

    }
}
