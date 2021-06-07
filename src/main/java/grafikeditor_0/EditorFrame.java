package grafikeditor_0;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

@SuppressWarnings("serial")
final public class EditorFrame extends JFrame {
    private static Color color;
    private final EditorControl editorControl = new EditorControl();

    public EditorFrame(int breite, int hoehe) {
        erzeugeUndSetzeEditorPanel();
        fensterEinmitten(breite, hoehe);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        //Listener für Tastatureingabe
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                editorControl.setFigurTyp(e.getKeyChar());
            }
        });
    }

    private void erzeugeUndSetzeEditorPanel() {
        JPanel panel = new EditorPanel(editorControl);

        Button colorChooserBtn = new Button("Farbe");
        Button rechteckBtn = new Button("Rechteck");
        Button kreisBtn = new Button("Kreis");
        Button linieBtn = new Button("Linie");
        Button dreieckBtn = new Button("Dreieck");

        panel.add(colorChooserBtn);
        panel.add(rechteckBtn);
        panel.add(kreisBtn);
        panel.add(linieBtn);
        panel.add(dreieckBtn);

        colorChooserBtn.setFocusable(false);
        rechteckBtn.setFocusable(false);
        kreisBtn.setFocusable(false);
        linieBtn.setFocusable(false);
        dreieckBtn.setFocusable(false);

        rechteckBtn.addActionListener(e -> editorControl.setFigurTyp('r'));
        kreisBtn.addActionListener(e -> editorControl.setFigurTyp('k'));
        linieBtn.addActionListener(e -> editorControl.setFigurTyp('l'));
        dreieckBtn.addActionListener(e -> editorControl.setFigurTyp('d'));

        colorChooserBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JColorChooser colorChooser = new JColorChooser();
                color = JColorChooser.showDialog(null, "Pick a color", Color.black);
            }
        });
        setContentPane(panel);
    }

    public static Color getColor(){
        return color;
    }

    private void fensterEinmitten(int breite, int hoehe) {
        Dimension bildschirmGroesse = Toolkit.getDefaultToolkit().getScreenSize();
        Rectangle fensterAusschnitt = new Rectangle();
        fensterAusschnitt.width = breite;
        fensterAusschnitt.height = hoehe;
        fensterAusschnitt.x = (bildschirmGroesse.width - fensterAusschnitt.width) / 2;
        fensterAusschnitt.y = (bildschirmGroesse.height - fensterAusschnitt.height) / 2;
        setBounds(fensterAusschnitt);
    }

    public void setZeichnungInControl(Zeichnung zeichnung) {
        editorControl.setZeichnung(zeichnung);
    }
}