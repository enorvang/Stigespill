package driver;

import entities.Brett;
import entities.Stigespill;


public class GameController {

    public static void main(String[] args) {
        Stigespill spill = new Stigespill();

        SpillerVelger sv = new SpillerVelger(spill);

        sv.velgSpillere();

        spill.spill();


    }
}
