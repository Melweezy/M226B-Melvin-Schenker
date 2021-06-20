package grafikeditor_0;

import grafikeditor_0.figuren.Figur;
import grafikeditor_0.figuren.Kreis;
import grafikeditor_0.figuren.Rechteck;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FigurParserTest {

    private FigurDAO dao;
    private FigurParser pp;

    @Test
    public void test() {
        dao = new FigurDAOStub();
        pp = new FigurParser(dao);
        Rechteck re = new Rechteck(100,300, 20, 50);
        Kreis kr = new Kreis(250,30,50);
        List<Figur> figuren = pp.parse();

        assertEquals(2, figuren.size());
        assertEquals(re.getX(), figuren.get(0).getX());
        assertEquals(re.getY(), figuren.get(0).getY());
        assertEquals(kr.getX(), figuren.get(1).getX());
        assertEquals(kr.getY(), figuren.get(1).getY());
    }
}