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
        Zeichnung zeichnung = new Zeichnung(figuren);

        frame.setZeichnungInControl(zeichnung);

        frame.repaint();
    }
}
