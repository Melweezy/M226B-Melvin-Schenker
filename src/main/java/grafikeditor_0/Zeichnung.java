package grafikeditor_0;

import grafikeditor_0.figuren.Figur;

import java.awt.*;
import java.util.List;

public class Zeichnung {
    private List<Figur> figuren;

    public Zeichnung(List<Figur> figuren) {
        this.figuren = figuren;
    }

    /**
     * Zeichnet alle Figuren.
     *
     * @param g Referenz auf das Graphics-Objekt zum zeichnen.
     */
    public void zeichneFiguren(Graphics g) {
        for (Figur figur : figuren) {
            figur.zeichnen(g);
        }
    }

    /**
     * Fügt eine weitere Figur hinzu und löst die Auffrischung des Fensterinhaltes aus.
     *
     * @param figur Referenz auf das weitere Figur-Objekt.
     */
    public void hinzufuegen(Figur figur) {
        figuren.add(figur);
    }

    /**
     * Löscht alle Figuren und löst die Auffrischung des Fensterinhaltes aus.
     */
    public void allesLoeschen() {
        figuren.clear();
    }
}