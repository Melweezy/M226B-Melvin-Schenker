package grafikeditor_0.figuren;

import grafikeditor_0.EditorFrame;

import java.awt.*;

public class Kreis extends Figur {
    private int radius;

    public Kreis(int x, int y, int radius, Color color){
        super(x,y);
        this.setradius(radius);
        this.setColor(color);
    }

    public Kreis(int x, int y, int radius, Color color, char fillType){
        super(x,y);
        this.setradius(radius);
        this.setColor(color);
        this.setFillType(fillType);
    }

    public Kreis(int x, int y, int radius){
        super(x,y);
        this.setradius(radius);
        this.setColor(color);
        this.setFillType(fillType);
    }

    public int getradius(){
        return radius;
    }

    public int setradius(int radius){
        return this.radius = radius;
    }

    @Override
    public void move(int deltaX, int deltaY) {
        x = x + deltaX;
        y = y + deltaY;
    }

    @Override
    public void zeichnen(Graphics g){
        g.setColor(color);
        if(fillType == 'f'){
            g.fillOval( getX() - getradius()/2, getY() - getradius()/2, getradius(), getradius());
        } else {
            g.drawOval( getX() - getradius()/2, getY() - getradius()/2, getradius(), getradius());
        }
    }
}
