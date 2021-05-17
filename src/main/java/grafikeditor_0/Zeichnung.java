package grafikeditor_0;

import grafikeditor_0.figuren.Figur;

import java.awt.*;

public class Zeichnung {
    private Figur[] figuren;

    public Zeichnung(Figur[] figuren){
        this.figuren = figuren;
    }

    public void zeichneFiguren(Figur[] figuren, Graphics g){
        for(Figur f : figuren){
            f.zeichnen(g);
        }
    }

    public Figur[] getFiguren(){
        return figuren;
    }
}