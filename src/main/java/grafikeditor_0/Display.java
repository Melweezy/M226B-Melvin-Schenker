package grafikeditor_0;

import grafikeditor_0.figuren.Figur;
import grafikeditor_0.figuren.Kreis;
import grafikeditor_0.figuren.Linie;
import grafikeditor_0.figuren.Rechteck;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;


/**
 * Die Klasse Display stellt ein Fenster auf dem Bildschirm zur Verf�gung, in welchem
 * Figur-Objekte dargestellt werden k�nnen.
 * Siehe auch Java-Grundkurs Abschnitt 10.2 und 10.3.
 * 
 * @author Andres Scheidegger
 */
@SuppressWarnings("serial")
public class Display extends JFrame {
  /** Die Liste der dargestellten Figur-Objekte */
  private List<Figur> figuren = new ArrayList<Figur>();

  /**
   * Konstruktor. Initialisiert das Fenster in der Mitte des Bildschirms und erzeugt ein
   * JFrame-Objekt, auf welchem die Figuren gezeichnet werden.
   */
  public Display() {
    Dimension windowSize = new Dimension(800, 600);
    setSize(windowSize);
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    int windowPositionX = (screenSize.width - windowSize.width) / 2;
    int windowPositionY = (screenSize.height - windowSize.height) / 2;
    Point windowPosition = new Point(windowPositionX, windowPositionY);
    setLocation(windowPosition);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    createAndAddDrawingPanel();
    setVisible(true);
  }

  private void createAndAddDrawingPanel() {
    // Das JPanel-Objekt ist ein Objekt einer anonymen Unterklasse von JPanel
    // Siehe Java-Grundkurs Abschnitt 3.9
    add(new JPanel() {
      // Die paintComponent()-Methode wird automatisch aufgerufen, wenn irgendwer die repaint()-
      // Methode beim Dsiplay aufruft.
      @Override
      protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        zeichneFiguren(g);
      }
    });
  }

  /**
   * Zeichnet alle Figuren.
   * @param g Referenz auf das Graphics-Objekt zum zeichnen.
   */
  private void zeichneFiguren(Graphics g) {
    Graphics2D g2 = (Graphics2D) g;

    for (Figur f : figuren) {
      if (f instanceof Rechteck) {
        Rechteck r = (Rechteck)f;
        g.setColor(Color.MAGENTA);
        g.fillRect(r.getX(), r.getY(), r.getBreite(), r.getHoehe());
        g2.setStroke(new BasicStroke(10));
        g.setColor(Color.BLACK);
        g.drawRect(r.getX(), r.getY(), r.getBreite(), r.getHoehe());
      }
      /* TODO: Hier muss für jede weitere Figur-Klasse, welche dargestellt werden k�nnen muss,
       * ein analoger Abschnitt, wie für die Rechteck-Klasse folgen.
       */
      if (f instanceof Linie) {
        Linie l = (Linie)f;
        g2.setStroke(new BasicStroke(50,BasicStroke.CAP_ROUND,BasicStroke.JOIN_ROUND));
        g.drawLine(l.getX(), l.getY(), l.getendX(),l.getendY());
        g2.setStroke(new BasicStroke());
      }
      if (f instanceof Kreis) {
        g2.setStroke(new BasicStroke(10));
        Kreis k = (Kreis) f;
        g.setColor(Color.BLUE);
        g.drawOval( k.getX() - k.getradius()/2, k.getY() - k.getradius()/2, k.getradius(), k.getradius());
        g.setColor(Color.BLACK);
        g2.setStroke(new BasicStroke());
      }
    }
  }

  /**
   * F�gt eine weitere Figur hinzu und l�st die Auffrischung des Fensterinhaltes aus.
   * @param figur Referenz auf das weitere Figur-Objekt.
   */
  public void hinzufuegen(Figur figur) {
    figuren.add(figur);
    repaint();

  }
}
