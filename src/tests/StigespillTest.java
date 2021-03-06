package tests;

import entities.Brett;
import entities.Brikke;
import entities.Rute;
import entities.Terning;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StigespillTest {
    private Brett brett;
    private Map<Integer, Rute> ruteKart;
    Brikke brikke;
    private Terning terning;

    @BeforeEach
    public void setup() {
        brett = new Brett();
        ruteKart = brett.getRuteKart();
        brikke = new Brikke("Sort", brett);
        terning = new Terning();
    }

    @Test
    public void sjekkOmBrettHarHundreFelter() {
        assertEquals(100, ruteKart.size());
    }

    @Test
    public void sjekkOmBrettHarSlanger() {
        //slangehode på 25->2, 52-42, 70->55, 95->72, 99->54
        assertEquals(2, ruteKart.get(25).getMapping());
        assertEquals(42, ruteKart.get(52).getMapping());
        assertEquals(55, ruteKart.get(70).getMapping());
        assertEquals(72, ruteKart.get(95).getMapping());
        assertEquals(54, ruteKart.get(99).getMapping());
    }

    @Test
    public void sjekkOmBrettHarStiger() {
        //stige på 6->25, 11->40, 17->69, 46->90, 60->85
        assertEquals(25, ruteKart.get(6).getMapping());
        assertEquals(40, ruteKart.get(11).getMapping());
        assertEquals(69, ruteKart.get(17).getMapping());
        assertEquals(90, ruteKart.get(46).getMapping());
        assertEquals(85, ruteKart.get(60).getMapping());
    }

    @Test
    public void sjekkOmBrikkeInitialiseresTilPosisjon1() {
        assertEquals(1, brikke.getRute().getNummer());
    }

    @Test
    public void sjekkOmBrikkeFlyttesSeksRuter() {
        brikke.flytt(6);
        assertEquals(7, brikke.getRute().getNummer());
    }

    @Test
    public void sjekkOmBrikkeKanFlyttesTilBestemtRute() {
        brikke.flyttTilNyPosisjon(50);
        assertEquals(50, brikke.getRute().getNummer());
    }

    @Test
    public void sjekkOmNyRuteErFireLengerFrem(){
        Rute rute = brett.getRuteKart().get(1); //startrute
        Rute nyRute = brett.finnNyRute(rute, 4);
        assertEquals(5, nyRute.getNummer());
    }

    @Test
    public void terningKastErMellom1og6(){
        int verdi = terning.trill();
        assertTrue(verdi >= 1 && verdi <= 6);
    }
}
