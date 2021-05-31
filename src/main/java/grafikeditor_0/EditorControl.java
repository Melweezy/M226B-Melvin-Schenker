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
    private Point ersterPunkt;

    public void allesNeuZeichnen(Graphics g) {
        zeichnung.zeichneFiguren(g);
    }

    public void setZeichnung(Zeichnung zeichnung) {
        this.zeichnung = zeichnung;
    }

    public void setFigurTyp(char figurTyp) {
        this.figurTyp = figurTyp;
    }

    public void setErsterPunkt(Point ersterPunkt) {
        this.ersterPunkt = ersterPunkt;
    }

    public void erzeugeFigurMitZweitemPunkt(Point zweiterPunkt) {
        if(this.figurTyp == 'r'){
            Grafikeditor.figuren.add(new Rechteck(ersterPunkt.x, ersterPunkt.y, zweiterPunkt.x - ersterPunkt.x , zweiterPunkt.y - ersterPunkt.y));
        }
        if(this.figurTyp == 'k'){
            Grafikeditor.figuren.add(new Kreis(ersterPunkt.x, ersterPunkt.y, zweiterPunkt.x - ersterPunkt.x));
        }
        if(this.figurTyp == 'l'){
            Grafikeditor.figuren.add(new Linie(ersterPunkt.x, ersterPunkt.y, zweiterPunkt.x, zweiterPunkt.y));
        }
        if(this.figurTyp == 'd'){
            Grafikeditor.figuren.add(new Dreieck(ersterPunkt.x, ersterPunkt.y, zweiterPunkt.x, zweiterPunkt.y, ersterPunkt.x - (zweiterPunkt.x - ersterPunkt.x), zweiterPunkt.y));
        }

        Grafikeditor.frame.repaint();
    }
}
