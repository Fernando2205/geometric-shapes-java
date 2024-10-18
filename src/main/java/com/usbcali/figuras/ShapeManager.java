package com.usbcali.figuras;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ShapeManager {
    private List<Shape> shapes;
    private int nextId;

    public ShapeManager() {
        this.shapes = new ArrayList<>();
        this.nextId = 1;
    }

    public void addShape(Shape shape) {
        shape.setId(nextId);
        nextId++;
        shapes.add(shape);
    }

    public List<Shape> getShapes2D() {
        return shapes.stream()
                .filter(shape -> shape instanceof Shape2D)
                .collect(Collectors.toList());
    }

    public List<Shape> getShapes3D() {
        return shapes.stream()
                .filter(shape -> shape instanceof Shape3D)
                .collect(Collectors.toList());
    }

    public List<Shape> getShapes() {
        return new ArrayList<>(shapes);
    }

}
