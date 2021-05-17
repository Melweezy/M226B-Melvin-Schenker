package grafikeditor_0;

import grafikeditor_0.figuren.Figur;

import java.awt.*;
import java.util.List;

public class Zeichnung {
    private Figur[] figuren;

    public Zeichnung(Figur[] figuren) {
        this.figuren = figuren;
    }

    /**
     * Zeichnet alle Figuren.
     * @param g Referenz auf das Graphics-Objekt zum zeichnen.
     */
    public void zeichneFiguren(Graphics g) {
        for (Figur figur : figuren) {
            figur.zeichnen(g);
        }
    }

    public Figur[] getFiguren(){
        return figuren;
    }
}