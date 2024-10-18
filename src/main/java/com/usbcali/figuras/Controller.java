package com.usbcali.figuras;

import java.util.List;
import java.util.stream.Collectors;

public class Controller {

    public void run() {
        ShapeManager shapeManager = new ShapeManager();
        while (true) {
            String[] options = { "Add 2D Shape", "Add 3D Shape", "View 2D Shapes", "View 3D Shapes", "View All Shapes",
                    "Exit" };
            int choice = PopUp.showOptions("Select an operation:", options);

            switch (choice) {
                case 0: // Add 2D Shape
                    String[] options2D = { "Circle", "Square", "Rectangle" };
                    int choice2D = PopUp.showOptions("Select a 2D shape:", options2D);
                    Shape shape2D = null;

                    switch (choice2D) {
                        case 0:
                            float radius = Float.parseFloat(PopUp.showInputMessage("Enter radius:"));
                            shape2D = new Circle(radius);
                            break;
                        case 1:
                            float side = Float.parseFloat(PopUp.showInputMessage("Enter side length:"));
                            shape2D = new Square(side);
                            break;
                        case 2:
                            float width = Float.parseFloat(PopUp.showInputMessage("Enter width:"));
                            float height = Float.parseFloat(PopUp.showInputMessage("Enter height:"));
                            shape2D = new Rectangle(width, height);
                            break;
                    }

                    if (shape2D != null) {
                        shapeManager.addShape(shape2D);
                        PopUp.showMessage("Shape added:\n" + shape2D.toJson());
                    }
                    break;

                case 1: // Add 3D Shape
                    String[] options3D = { "Sphere", "Cube", "Cuboid" };
                    int choice3D = PopUp.showOptions("Select a 3D shape:", options3D);
                    Shape shape3D = null;

                    switch (choice3D) {
                        case 0:
                            float radiusSphere = Float.parseFloat(PopUp.showInputMessage("Enter radius:"));
                            shape3D = new Sphere(radiusSphere);
                            break;
                        case 1:
                            float sideCube = Float.parseFloat(PopUp.showInputMessage("Enter side length:"));
                            shape3D = new Cube(sideCube);
                            break;
                        case 2:
                            float length = Float.parseFloat(PopUp.showInputMessage("Enter length:"));
                            float widthCuboid = Float.parseFloat(PopUp.showInputMessage("Enter width:"));
                            float heightCuboid = Float.parseFloat(PopUp.showInputMessage("Enter height:"));
                            shape3D = new Cuboid(length, widthCuboid, heightCuboid);
                            break;
                    }

                    if (shape3D != null) {
                        shapeManager.addShape(shape3D);
                        PopUp.showMessage("Shape added:\n" + shape3D.toJson());
                    }
                    break;

                case 2: // View 2D Shapes
                    viewShapes(shapeManager.getShapes2D());
                    break;

                case 3: // View 3D Shapes
                    viewShapes(shapeManager.getShapes3D());
                    break;

                case 4: // View All Shapes
                    viewShapes(shapeManager.getShapes());
                    break;

                case 5: // Exit
                    System.exit(0);

                default:
                    PopUp.showMessage("Invalid option. Please try again.");
            }
        }
    }

    private static void viewShapes(List<Shape> shapes) {
        if (shapes.isEmpty()) {
            PopUp.showMessage("No shapes to display.");
        } else {
            String shapesJson = shapes.stream()
                    .map(Shape::toJson)
                    .collect(Collectors.joining("\n"));
            PopUp.showMessage(shapesJson);
        }
    }
}
