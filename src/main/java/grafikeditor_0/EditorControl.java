package grafikeditor_0;

import grafikeditor_0.figuren.Dreieck;
import grafikeditor_0.figuren.Kreis;
import grafikeditor_0.figuren.Linie;
import grafikeditor_0.figuren.Rechteck;
import java.awt.*;
import java.awt.geom.Point2D;
import java.awt.Graphics;
import java.awt.Point;


final class EditorControl {
    private Zeichnung zeichnung;
    private char figurTyp;
    private char fillType;
    private Point ersterPunkt;
    private Color selectedColor = Color.black;
    private char selectedFillType;

    public void allesNeuZeichnen(Graphics g) {
        zeichnung.zeichneFiguren(g);
    }

    public void setZeichnung(Zeichnung zeichnung) {
        this.zeichnung = zeichnung;
    }

    public void setFigurTyp(char figurTyp) {
        this.figurTyp = figurTyp;
    }

    public void setFillType(char fillType){
        this.fillType = fillType;
    }

    public void setErsterPunkt(Point ersterPunkt) {
        this.ersterPunkt = ersterPunkt;
    }

    public void erzeugeFigurMitZweitemPunkt(Point zweiterPunkt) {

        switch (this.figurTyp) {
            case 'r' -> Grafikeditor.figuren.add(new Rechteck(ersterPunkt.x, ersterPunkt.y, zweiterPunkt.x - ersterPunkt.x, zweiterPunkt.y - ersterPunkt.y, selectedColor, fillType));
            case 'k' -> Grafikeditor.figuren.add(new Kreis(ersterPunkt.x, ersterPunkt.y, zweiterPunkt.x - ersterPunkt.x, selectedColor, fillType));
            case 'l' -> Grafikeditor.figuren.add(new Linie(ersterPunkt.x, ersterPunkt.y, zweiterPunkt.x, zweiterPunkt.y, selectedColor));
            case 'd' -> Grafikeditor.figuren.add(new Dreieck(ersterPunkt.x, ersterPunkt.y, zweiterPunkt.x, zweiterPunkt.y, ersterPunkt.x - (zweiterPunkt.x - ersterPunkt.x), zweiterPunkt.y, selectedColor, fillType));
        }
        Grafikeditor.frame.repaint();
    }
    public void selectedColor(Color selectedColor){
        this.selectedColor = selectedColor;
    }

    public void allesLoeschen() {
        zeichnung.allesLoeschen();
    }

}
