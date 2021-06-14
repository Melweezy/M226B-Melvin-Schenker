package grafikeditor_0.figuren;

import java.awt.*;

public abstract class Figur {
	protected int x;
	protected int y;
	protected Color color;
	protected char fillType;

	public Figur (int x, int y) {
		this.x = x;
		this.y = y;

	}
	public void move(int deltaX, int deltaY){
		this.x += deltaX;
		this.y += deltaY;
	}

	public void setColor(Color color){
		this.color = color;
	}

	public void setFillType(char fillType){
		this.fillType = fillType;
	}

	public abstract void zeichnen(Graphics g);

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
}
