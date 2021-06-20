package grafikeditor_0.figuren;

public class GraphicsStubKreis extends ConcreteGraphics {
    int nbOfDrawOvalCalls = 0;
    int rad1;
    int rad2;

    @Override
    public void drawOval(int i, int i1, int rad1, int rad2) {
        nbOfDrawOvalCalls++;
        this.rad1 = rad1;
        this.rad2 = rad2;
    }
}
