package grafikeditor_0.figuren;

import grafikeditor_0.EditorFrame;

import java.awt.*;

public class Dreieck extends Figur {
    private int[] xKoordinaten;
    private int[] yKoordinaten;

    public Dreieck(int x, int y, int x2, int y2, int x3, int y3){
        super(x,y);
        xKoordinaten = new int[]{x, x2, x3};
        yKoordinaten = new int[]{y, y2, y3};
    }

    public void zeichnen(Graphics g){
        g.setColor(EditorFrame.getColor());
        g.drawPolygon(xKoordinaten, yKoordinaten, 3);
    }
}
