package grafikeditor_0.figuren;

import java.awt.*;

public class GraphicsStub extends ConcreteGraphics {
    int nbOfDrawRectCalls = 0;
    int x;
    int y;
    int width;
    int height;

    @Override
    public void drawRect(int x, int y, int width, int height) {
        nbOfDrawRectCalls++;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
}
