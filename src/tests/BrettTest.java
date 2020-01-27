package tests;

import entities.Brett;
import entities.Rute;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BrettTest {
    private Brett brett;
    private final int ANTALL_RUTER = 100;
    private HashMap<Integer, Rute> ruteKart;

    @BeforeEach
    public void setup(){
        brett = new Brett();
        brett.leggTilSlangerOgStiger(); //slangehode på 25->2, 52-42, 70->55, 95->72, 99->54
                                        //stige på 6->25, 11->40, 17->69, 46->90, 60->85
        ruteKart = brett.getRuteKart();
    }

    @Test
    public void sjekkOmBrettHarHundreFelter(){
        assertEquals(100, ruteKart.size());
    }

    @Test
    public void sjekkOmBrettHarSlanger(){
        assertEquals(2, ruteKart.get(25).getMapping());
        assertEquals(42, ruteKart.get(52).getMapping());
        assertEquals(55, ruteKart.get(70).getMapping());
        assertEquals(72, ruteKart.get(95).getMapping());
        assertEquals(54, ruteKart.get(99).getMapping());
    }

    @Test
    public void sjekkOmBrettHarStiger(){
        assertEquals(25, ruteKart.get(6).getMapping());
        assertEquals(40, ruteKart.get(11).getMapping());
        assertEquals(69, ruteKart.get(17).getMapping());
        assertEquals(90, ruteKart.get(46).getMapping());
        assertEquals(85, ruteKart.get(60).getMapping());
    }
}
