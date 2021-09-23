package com.codegym;

public class Point3D extends Point2D{
    private float z = 0.0f;

    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public float setZ(float z) {
        this.z = z;
        return z;
    }
    public float[] getXYZ() {
        float[] array = new float[3];
        array[0] = super.getX();
        array[1] = super.getY();
        array[2] = z;
        return array;
    }
    public void setXYZ(float x, float y, float z) {
        float[] array = new float[3];
        array[0] = super.setX(x);
        array[1] = super.setY(y);
        array[2] = setZ(z);
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "z=" + z + " x = " + super.getX() + " y = " + super.getY() +
                '}';
    }
}
