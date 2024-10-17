package com.usbcali.figuras;

public class Rectangle extends Shape2D {
    private float width;
    private float height;

    public Rectangle(float width, float height) {
        this.width = width;
        this.height = height;
        this.name = "Rectangle";
    }

    @Override
    float getArea() {
        return width * height;
    }

    @Override
    float getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public String toJson() {
        return String.format(
                "{\"id\":%d,\"name\":\"%s\",\"width\":%.2f,\"height\":%.2f,\"area\":%.2f,\"perimeter\":%.2f}",
                id, name, width, height, getArea(), getPerimeter());
    }
}
