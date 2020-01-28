package driver;

import entities.Brett;
import entities.Brikke;
import entities.Spiller;
import entities.Stigespill;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;

public class GameController {

    public static void main(String[] args) {
        Stigespill spill = new Stigespill();
        Brett brett = spill.getBrett();

        SpillerVelger sv = new SpillerVelger(spill, brett);

        sv.velgSpillere();

        spill.spill();


    }
}
