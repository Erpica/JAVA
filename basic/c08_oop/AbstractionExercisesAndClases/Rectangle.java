package c08_oop.AbstractionExercisesAndClases;

// 1. Crea una clase abstracta Shape con el método calculateArea().
//  Luego implementa dos subclases: Circle y Rectangle, y haz que cada una calcule su propia área.

public class Rectangle extends Shape{
    double side;

    public double calculateArea(){
        return Math.pow(this.side, 2);
    }

    public Rectangle(double side){
        this.side = side;
    }

}
