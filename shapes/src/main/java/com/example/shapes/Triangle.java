package com.example.shapes;

import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;

public class Triangle extends Polygon {

    public Triangle(double centerX, double centerY, double size) {
        double halfSize = size / 2.0;
        double height = Math.sqrt(3) * halfSize;

        double[] points = {
                centerX, centerY - height / 2,
                centerX - halfSize, centerY + height / 2,
                centerX + halfSize, centerY + height / 2
        };

        for (double point : points) {
            this.getPoints().add(point);
        }

        this.setFill(Color.TRANSPARENT);
        this.setStroke(Color.BLACK);
    }
}
