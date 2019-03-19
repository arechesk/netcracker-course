package com.netcracker.oop2;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Container container = (Container) o;

        if (x1 != container.x1) return false;
        if (y1 != container.y1) return false;
        if (x2 != container.x2) return false;
        return y2 == container.y2;
    }

    @Override
    public int hashCode() {
        int result = x1;
        result = 31 * result + y1;
        result = 31 * result + x2;
        result = 31 * result + y2;
        return result;
    }
}
