package com.usbcali.figuras;

public abstract class Shape2D implements Shape {
    protected int id;
    protected String name;

    abstract float getArea();

    abstract float getPerimeter();

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int getId() {
        return id;
    }
}
