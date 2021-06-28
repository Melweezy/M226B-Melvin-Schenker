package grafikeditor_0.figuren;

import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class KreisTest {
    private GraphicsStubKreis g = new GraphicsStubKreis();
    @Test
    void zeichnen() {
        Kreis k = new Kreis(10,20,30);
        k.zeichnen(g);
        assertEquals(1, g.nbOfDrawOvalCalls);
        assertEquals(30, g.rad1);
        assertEquals(30, g.rad2);
    }
}