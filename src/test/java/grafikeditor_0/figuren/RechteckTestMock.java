package grafikeditor_0.figuren;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import java.awt.*;

class RechteckTestMock {

    //Mock-Objekt erzeugen
    private Graphics g = Mockito.mock(Graphics.class);

    @Test
    void zeichnen() {
        Rechteck r = new Rechteck(10, 10, 20, 40);
        r.zeichnen(g);
        //Überprüft wie oft drawRect ausgeführt wird
        Mockito.verify(g, Mockito.times(2)).drawRect(10, 10, 20, 40);
    }
}