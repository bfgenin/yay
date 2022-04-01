package com.company;

public class Rectangle {

    double length;
    double width;

    //constr
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    double getPerimiter(){
        return (2 * (this.width)) + (2 * (this.length));
    }

    double getArea(){
        return (this.length * this.width);
    }
}
