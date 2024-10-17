package com.usbcali.figuras;

public class Sphere extends Shape3D {
    private float radius;

    public Sphere(float radius) {
        this.radius = radius;
        this.name = "Sphere";
    }

    @Override
    float getSurfaceArea() {
        return (float) (4 * Math.PI * Math.pow(radius, 2));
    }

    @Override
    float getVolume() {
        return (float) ((4 / 3) * Math.PI * Math.pow(radius, 3));
    }

    @Override
    public String toJson() {
        return String.format("{\"id\":%d,\"name\":\"%s\",\"radius\":%.2f,\"volume\":%.2f,\"surfaceArea\":%.2f}",
                id, name, radius, getVolume(), getSurfaceArea());
    }

}
