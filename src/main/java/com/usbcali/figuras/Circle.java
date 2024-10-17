package com.usbcali.figuras;

public class Circle extends Shape2D {
    private float radius;

    public Circle(float radius) {
        this.radius = radius;
        this.name = "Circle";
    }

    @Override
    float getArea() {
        return (float) (Math.PI * Math.pow(radius, 2));
    }

    @Override
    float getPerimeter() {
        return (float) (2 * Math.PI * radius);
    }

    @Override
    public String toJson() {
        return String.format("{\"id\":%d,\"name\":\"%s\",\"radius\":%.2f,\"area\":%.2f,\"perimeter\":%.2f}",
                id, name, radius, getArea(), getPerimeter());
    }
}
