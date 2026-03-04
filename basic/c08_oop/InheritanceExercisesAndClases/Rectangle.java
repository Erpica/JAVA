package c08_oop.InheritanceExercisesAndClases;
//import c08_oop.AbstractionExercisesAndClases.Shape;

//    5. Crea una clase abstracta Shape con un método calculateArea(). Luego
//    implementa ese método en Circle y Rectangle.""");

public class Rectangle extends Shape{

    double base;
    double height;

    public void calculateArea () {
        System.out.println("El área del rectángulo es " + (this.base*this.height) + " metros cuadrados.");
        //return this.base*this.height;
    }

    public void calculatePerimeter (){
        System.out.println("El perímetro del rectángulo es " + (2*(this.base+this.height)) + " metros cuadrados.");
    }

    public Rectangle(double base, double height){
        this.base = base;
        this.height = height;
    }
}

