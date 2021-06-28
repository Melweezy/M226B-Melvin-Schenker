package grafikeditor_0.figuren;

import grafikeditor_0.EditorFrame;

import java.awt.*;

public class Dreieck extends Figur {
    private int[] xKoordinaten;
    private int[] yKoordinaten;

    public Dreieck(int x, int y, int x2, int y2, int x3, int y3, Color color){
        super(x,y);
        xKoordinaten = new int[]{x, x2, x3};
        yKoordinaten = new int[]{y, y2, y3};
        this.setColor(color);
    }

    public Dreieck(int x, int y, int x2, int y2, int x3, int y3, Color color, char fillType){
        super(x,y);
        xKoordinaten = new int[]{x, x2, x3};
        yKoordinaten = new int[]{y, y2, y3};
        this.setColor(color);
        this.setFillType(fillType);
    }

    public void zeichnen(Graphics g){
        g.setColor(color);
        if(fillType == 'f'){
            g.fillPolygon(xKoordinaten, yKoordinaten, 3);
        } else  {
            g.drawPolygon(xKoordinaten, yKoordinaten, 3);
        }
    }
}
