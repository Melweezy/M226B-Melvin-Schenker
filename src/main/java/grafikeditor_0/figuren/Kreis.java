package grafikeditor_0.figuren;

public class Kreis extends Figur {
    private int radius;

    public Kreis(int x, int y, int radius){
        super(x,y);
        this.setradius(radius);
    }
    public int getradius(){
        return radius;
    }

    public int setradius(int radius){
        return this.radius = radius;
    }

    public void move(int deltaX, int deltaY) {
        x = x + deltaX;
        y = y + deltaY;
    }
}
