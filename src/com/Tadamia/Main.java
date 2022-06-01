package com.Tadamia;

import ge.ufc.beans.Square;

public class Main {

    public static void main(String[] args) {
        Figure figure = new Figure("Parent");
        System.out.println("მშობელი კლასის ფართობი - " + figure.getArea());
        System.out.println("მშობელი კლასის პერიმეტრი - " + figure.getPerimeter());


        System.out.println("Rectangle.sayHello");
        Rectangle.sayHello();

        Rectangle rectangle = new Rectangle();
        System.out.println("მემკვიდრე კლასის ფართობი - " + rectangle.getArea());
        System.out.println("მემკვიდრე კლასის პერიმეტრი - " + rectangle.getPerimeter());


        Rectangle rectangle1 = new Rectangle(15,65);
        System.out.println("ახალი მემკვიდრე კლასის ფართობი - " + rectangle.getArea());
        System.out.println("ახალი მემკვიდრე კლასის პერიმეტრი - " + rectangle.getPerimeter());

        System.out.println("ახალი მემკვიდრე კლასის ფართობი (Override) - " + rectangle1.getArea(rectangle1.getWidth(), rectangle1.getHeight()));
        System.out.println("ახალი მემკვიდრე კლასის პერიმეტრი (Override) - " + rectangle1.getPerimeter(rectangle1.getWidth(), rectangle1.getHeight()));

        System.out.println("is figure instanceof Rectangle? " + (figure instanceof Rectangle));
        System.out.println("is figure instanceof Figure? " + (figure instanceof Figure));


        System.out.println("is rectangle instanceof Figure? " + (rectangle instanceof Figure));
        System.out.println("is rectangle instanceof Rectangle? " + (rectangle instanceof Rectangle));

        System.out.println("is rectangle1 instanceof Figure? " + (rectangle1 instanceof Figure));
        System.out.println("is rectangle1 instanceof Rectangle? " + (rectangle1 instanceof Rectangle));


        Square square = new Square();
        square.setSide(15);
        System.out.println("მემკვიდრე კლასის ფართობი - " + square.getArea(square.getSide(),square.getSide()));
        System.out.println("მემკვიდრე კლასის პერიმეტრი - " + square.getPerimeter(square.getSide(),square.getSide()));
    }
}
