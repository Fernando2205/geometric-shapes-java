package com.usbcali.figuras;

public class Cube extends Shape3D {
    private float side;

    public Cube(float side) {
        this.side = side;
        this.name = "Cube";
    }

    @Override
    float getVolume() {
        return (float) Math.pow(side, 3);
    }

    @Override
    float getSurfaceArea() {
        return 6 * (float) Math.pow(side, 2);
    }

    @Override
    public String toJson() {
        return String.format("{\"id\":%d,\"name\":\"%s\",\"side\":%.2f,\"volume\":%.2f,\"surfaceArea\":%.2f}",
                id, name, side, getVolume(), getSurfaceArea());
    }
}
