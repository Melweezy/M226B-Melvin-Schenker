package grafikeditor_0;

import grafikeditor_0.figuren.*;

import java.awt.*;

public class Grafikeditor {
    private static final Display display = new Display();

    public static void main(String[] args) {
        Rechteck r1 = new Rechteck(300, 400, 100,100);
        Linie l1 = new Linie(0, 0, 300, 400);
        Kreis k1 = new Kreis(300, 0, 200);
        Kreis k2 = new Kreis(600, 300, 300);
        Dreieck d1 = new Dreieck(200,200,400,200,325, 350);





        Figur[] figuren = new Figur[]{r1, l1, k1, k2, d1};

        Zeichnung zeichnung = new Zeichnung(figuren);
        display.setZeichnung(zeichnung);

//        r1.move(50,50);
//        l1.move(10,10);
    }
}
