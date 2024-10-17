package com.usbcali.figuras;

public class Square extends Shape2D {
    private float side;

    public Square(float side) {
        this.side = side;
        this.name = "Square";
    }

    @Override
    float getArea() {
        return side * side;
    }

    @Override
    float getPerimeter() {
        return 4 * side;
    }

    @Override
    public String toJson() {
        return String.format("{\"id\":%d,\"name\":\"%s\",\"side\":%.2f,\"area\":%.2f,\"perimeter\":%.2f}",
                id, name, side, getArea(), getPerimeter());
    }

}