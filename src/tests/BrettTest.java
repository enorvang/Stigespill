package tests;

import entities.Brett;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BrettTest {
    private Brett brett;
    private final int ANTALL_RUTER = 100;

    @BeforeEach
    public void setup(){
        brett = new Brett(ANTALL_RUTER);
    }

    @Test
    public void sjekkOmBrettHarHundreFelter(){
        assertEquals(100, brett.getAntallRuter());
    }


}
