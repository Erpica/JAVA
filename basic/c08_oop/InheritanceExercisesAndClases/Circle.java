package c08_oop.InheritanceExercisesAndClases;

// 1. Crea una clase abstracta Shape con el método calculateArea().
//  Luego implementa dos subclases: Circle y Rectangle, y haz que cada una calcule su propia área.


public class Circle extends Shape{
    double radius;

    public double calculateArea(){
        return Math.PI*Math.pow(this.radius, 2);
    }

    public Circle (double radius){
        this.radius = radius;
    }
}