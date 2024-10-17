package com.usbcali.figuras;

public class Cuboid extends Shape3D {
    private float width;
    private float height;
    private float length;

    public Cuboid(float width, float height, float length) {
        this.width = width;
        this.height = height;
        this.length = length;
        this.name = "Cuboid";
    }

    @Override
    float getSurfaceArea() {
        return 2 * (width * height + width * length + height * length);
    }

    @Override
    float getVolume() {
        return width * height * length;
    }

    @Override
    public String toJson() {
        return String.format(
                "{\"id\":%d,\"name\":\"%s\",\"length\":%.2f,\"width\":%.2f,\"height\":%.2f,\"volume\":%.2f,\"surfaceArea\":%.2f}",
                id, name, length, width, height, getVolume(), getSurfaceArea());
    }
}
