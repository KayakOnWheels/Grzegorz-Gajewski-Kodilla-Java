package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.Nested;

import java.sql.Array;
import java.util.ArrayList;


public class ShapeCollectorTestSuite {


    @DisplayName("Adds figure to shape ShapeCollector")
    @Test
    void addFigureTest() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Square square = new Square(5);

        //When
        shapeCollector.addFigure(square);

        //Then
        Assertions.assertEquals(1/*new Square(5)*/, shapeCollector.getAllFigures().size());//shapeCollector.getFigure(0));
        Assertions.assertEquals(square, shapeCollector.getFigure(0));
    }


    @DisplayName("Removes figure from ShapesCollector")
    @Test
    void removeFigureTest() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Square square = new Square(5);
        shapeCollector.addFigure(square);

        //When
        shapeCollector.removeFigure(square);

        //Then
        Assertions.assertEquals(0, shapeCollector.getAllFigures().size());
    }


    @DisplayName("Gets figure from ShapeCollector")
    @Test
    void getFigureTest() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(new Square(5));
        shapeCollector.addFigure(new Circle(5));
        shapeCollector.addFigure(new Triangle(5, 6));

        //When

        //Square outcomeSquare = (Square) shapeCollector.getFigure(0);
        Shape outcomeSquare = shapeCollector.getFigure(1);

        //Then
        Assertions.assertEquals(new Circle(5), outcomeSquare);
    }


    @DisplayName("Display all figures in shapeCollector")
    @Test
    void showFiguresTest() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Square square = new Square(5);
        Circle circle = new Circle(5);
        Triangle triangle = new Triangle(5, 6);


        //When
        shapeCollector.addFigure(square);
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(triangle);

        shapeCollector.showFigures();

        //Then
    }

    @DisplayName("Return every figure in ShapeCollector")
    @Test
    void getAllFiguresTest() {

        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Square square = new Square(5);
        Circle circle = new Circle(5);
        Triangle triangle = new Triangle(5, 6);

        shapeCollector.addFigure(square);
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(triangle);

        Square square2 = new Square(5);
        Circle circle2 = new Circle(5);
        Triangle triangle2 = new Triangle(5, 6);

        ArrayList<Shape> checkList = new ArrayList<>();
        checkList.add(square2);
        checkList.add(circle2);
        checkList.add(triangle2);


        //When
        ArrayList<Shape> outcomeList = new ArrayList<>();
        outcomeList = shapeCollector.getAllFigures();

        //Then
        Assertions.assertEquals(checkList, outcomeList);
    }
}
