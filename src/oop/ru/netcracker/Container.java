package oop.ru.netcracker;

public class Container {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Container(int x1, int y1, int width, int height) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x1+width;
        this.y2 = y1+height;
    }

    public int getX() {
        return x1;
    }

    public int getY() {
        return y1;
    }
    public int getWidth() {
        return x2 - x1;
    }
    public int getHeight() {
        return y2 - y1;
    }
    @Override
    public String toString() {
        return "Container[(" + x1 + "," + y1 + "),(" + x2 + "," + y2 + ")]";
    }
    public boolean coliders(Ball ball) {
        if (ball == null)
            return false;
        if (ball.getX() - ball.getRadius() < x1 || x2 < ball.getX() + ball.getRadius())
            return false;
        if (ball.getY() - ball.getRadius() < y1 || y2 < ball.getY() + ball.getRadius())
            return false;
        return true;
    }
}
