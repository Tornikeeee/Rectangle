package com.Tadamia;

public class Figure {
    public Figure(String s){
        System.out.println("Supper class : " + s);
    }


    protected double getArea(){
        return -11;
    }

    protected double getPerimeter(){
        return -12;
    }

    public static final void sayHello(){
        System.out.println("Say hello to my little friend");
    }
}
