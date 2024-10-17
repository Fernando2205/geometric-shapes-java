package com.usbcali.figuras;

public abstract class Shape3D implements Shape {
    protected int id;
    protected String name;

    abstract float getVolume();

    abstract float getSurfaceArea();

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int getId() {
        return id;
    }

}
