package driver;

import entities.Stigespill;

/**
 *
 * @author Espen Norvang & Morten Sund
 */
public class SpillKontroller {

    public static void main(String[] args) {
        Stigespill spill = new Stigespill();
        SpillerVelger sv = new SpillerVelger(spill);

        sv.velgSpillere();
        spill.spill();


    }
}
