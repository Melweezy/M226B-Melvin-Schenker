package grafikeditor_0.figuren;

import java.awt.*;

public class Linie extends Figur {
    private int endX;
    private int endY;

    public Linie(int x, int y, int endX, int endY) {
        super(x, y);
        this.setendX(endX);
        this.setendY(endY);
    }
    public int getendX() {
        return endX;
    }

    public void setendX(int endX) {
        this.endX = endX;
    }

    public int getendY() {
        return endY;
    }

    public void setendY(int endY) {
        this.endY = endY;
    }
}
