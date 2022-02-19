//import processing.core.PApplet;

public class Ball {

    private int diameter;
    private int positionX;
    private int positionY;

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public int getPositionX() {
        return positionX;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    public void moveX(int speed) {
        this.setPositionX(this.positionX += speed);
    }
}
