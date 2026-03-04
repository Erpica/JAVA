package c08_oop.ClassesExercisesAndClases;

//7. Crea una clase Rectangle con métodos para calcular el área y el perímetro.

public class Rectangle {
    public double base;
    public double height;

    public void calculateArea(){
        System.out.println("El área del rectángulo es " + (this.base*this.height) + " metros cuadrados.");
    }

    public void calculatePerimeter(){
        System.out.println("El perimetro del rectángulo es " + (2*(this.base+this.height)) + " metros cuadrados.");
    }
}
