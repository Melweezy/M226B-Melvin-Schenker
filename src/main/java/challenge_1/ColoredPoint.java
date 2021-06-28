package challenge_1;

import java.util.Objects;

public class ColoredPoint extends Point {
    private boolean isRed;

    public ColoredPoint(int x, int y, boolean isRed) {
        super(x, y);
        this.isRed = isRed;
    }

    public boolean isRed() {
        return isRed;
    }

    //um die equals funktion von ColoredPoint zu nutzen, muss  die funktion gleich aussehen wie die equals funktion von Point
    //Point wird zu ColoredPoint gecastet
    public boolean equals(Point o) {
        if (!super.equals(o)) return false;
        ColoredPoint that = (ColoredPoint) o;
        return isRed == that.isRed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), isRed);
    }
}
