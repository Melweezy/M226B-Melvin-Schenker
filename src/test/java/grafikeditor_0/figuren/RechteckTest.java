package grafikeditor_0.figuren;

import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class RechteckTest {
    private GraphicsStub g = new GraphicsStub();
    @Test
    void zeichnen() {
        Rechteck r = new Rechteck(10,20,30,40);
        r.zeichnen(g);
        assertEquals(1, g.nbOfDrawRectCalls);
        assertEquals(10, g.x);
        assertEquals(20, g.y);
        assertEquals(30, g.width);
        assertEquals(40, g.height);
    }
}