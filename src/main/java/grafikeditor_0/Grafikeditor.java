package grafikeditor_0;

import grafikeditor_0.figuren.*;
import java.util.ArrayList;
import java.util.List;

import java.awt.*;

public class Grafikeditor {
    public static List<Figur> figuren = new ArrayList<>();
    @SuppressWarnings("unused")
    public static EditorFrame frame = new EditorFrame(800, 600);

    public static void main(String[] args) { new Grafikeditor(); }

    private Grafikeditor() {
        figuren.add(new Rechteck(240, 220, 50, 40));
        figuren.add(new Linie(500, 300, 100, 50));
        figuren.add(new Rechteck(120, 120, 200, 300));
        figuren.add(new Kreis(300, 300, 100));

//        FigurFileDAO dao = new FigurFileDAO();
//        FigurParser pp = new FigurParser(dao);

        Zeichnung zeichnung = new Zeichnung(figuren);

        frame.setZeichnungInControl(zeichnung);

        frame.repaint();
    }
}
