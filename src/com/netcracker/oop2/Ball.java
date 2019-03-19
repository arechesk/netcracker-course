package com.netcracker.oop2;

public class Ball {
    private float x;
    private float y;
    private int radius;
    private float xDelta;
    private float yDelta;

    public Ball(float x, float y, int radius, int speed, int direction) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        xDelta = (float)(Math.cos(Math.PI * direction / 180) * speed);
        yDelta = (float)(Math.sin(Math.PI * direction / 180) * speed);
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public int getRadius() {
        return radius;
    }

    public float getxDelta() {
        return xDelta;
    }

    public float getyDelta() {
        return yDelta;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setxDelta(float xDelta) {
        this.xDelta = xDelta;
    }

    public void setyDelta(float yDelta) {
        this.yDelta = yDelta;
    }

    @Override
    public String toString() {
        return "Ball[(" + x + "," + y + "),radius=" + radius + ",speed=(" + xDelta +"," + yDelta + ")]";
    }
    public void move() {
        x += xDelta;
        y += yDelta;
    }
    public void reflectHorizontal() {
        xDelta = -xDelta;
    }
    public void reflectVertical() {
        yDelta = -yDelta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ball ball = (Ball) o;

        if (Float.compare(ball.x, x) != 0) return false;
        if (Float.compare(ball.y, y) != 0) return false;
        if (radius != ball.radius) return false;
        if (Float.compare(ball.xDelta, xDelta) != 0) return false;
        return Float.compare(ball.yDelta, yDelta) == 0;
    }

    @Override
    public int hashCode() {
        int result = (x != +0.0f ? Float.floatToIntBits(x) : 0);
        result = 31 * result + (y != +0.0f ? Float.floatToIntBits(y) : 0);
        result = 31 * result + radius;
        result = 31 * result + (xDelta != +0.0f ? Float.floatToIntBits(xDelta) : 0);
        result = 31 * result + (yDelta != +0.0f ? Float.floatToIntBits(yDelta) : 0);
        return result;
    }
}
