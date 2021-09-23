package com.codegym;

public class Point2D {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point2D() {
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float setX(float x) {
        this.x = x;
        return x;
    }

    public float getY() {
        return y;
    }

    public float setY(float y) {
        this.y = y;
        return y;
    }
    public void setXY(float x, float y) {
        float[] array = {x, y};
    }
    public float[] getXY() {
        return new float[] {x, y};
    }


    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
