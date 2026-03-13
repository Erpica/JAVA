package c08_oop.AbstractionExercisesAndClases;

// 1. Crea una clase abstracta Shape con el método calculateArea().
//  Luego implementa dos subclases: Circle y Rectangle, y haz que cada una calcule su propia área.

// 4. Crea una interfaz Drawable. Implementa las clases Circle, Square, y Triangle que muestren cómo se dibuja cada figura usando draw().


public class Circle extends Shape implements Drawable{
    double radius;

    public double calculateArea(){
        return Math.PI*Math.pow(this.radius, 2);
    }

    public Circle (double radius){
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Así se dibuja un círculo.");
    }
}
