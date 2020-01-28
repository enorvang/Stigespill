package driver;

import entities.Brett;
import entities.Stigespill;


public class GameController {

    public static void main(String[] args) {
        Stigespill spill = new Stigespill();
        Brett brett = spill.getBrett();

        SpillerVelger sv = new SpillerVelger(spill, brett);

        sv.velgSpillere();

        spill.spill();


    }
}
