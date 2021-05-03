package grafikeditor_0;

import grafikeditor_0.figuren.Kreis;
import grafikeditor_0.figuren.Linie;
import grafikeditor_0.figuren.Rechteck;

import java.awt.*;

public class Grafikeditor {
    private static final Display display = new Display();

    public static void main(String[] args) {
        display.hinzufuegen(new Rechteck(400,200,100,100));
        display.hinzufuegen(new Rechteck(500,300,200,200));
        display.hinzufuegen(new Linie(0,0,200,200));
        display.hinzufuegen(new Linie(200,200,200,400));
        display.hinzufuegen(new Kreis(400,200,100));
    }
}
