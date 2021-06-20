package grafikeditor_0;

import grafikeditor_0.figuren.Figur;
import grafikeditor_0.figuren.Kreis;
import grafikeditor_0.figuren.Linie;
import grafikeditor_0.figuren.Rechteck;
import java.util.ArrayList;
import java.util.List;

public class FigurParser {
  private FigurFileDAO dao;

  public FigurParser(FigurFileDAO dao) {
    this.dao = dao;
  }

  public List<Figur> parse() {
    List<Figur> figuren = new ArrayList<Figur>();
    String[] figurData = dao.readNextFigurData();
    while (figurData != null) {
      String figurTyp = figurData[0];
      int x = Integer.parseInt(figurData[1]);
      int y = Integer.parseInt(figurData[2]);
      switch (figurTyp) {
      case "Rechteck":
        int breite = Integer.parseInt(figurData[3]);
        int hoehe = Integer.parseInt(figurData[4]);
        figuren.add(new Rechteck(x, y, breite, hoehe));
        break;
      case "Kreis":
        int radius = Integer.parseInt(figurData[3]);
        figuren.add(new Kreis(x, y, radius));
        break;
      case "Linie":
        int endx = Integer.parseInt(figurData[3]);
        int endy = Integer.parseInt(figurData[4]);
        figuren.add(new Linie(x, y, endx, endy));
        break;
      }
      figurData = dao.readNextFigurData();
    }
    return figuren;
  }
}
