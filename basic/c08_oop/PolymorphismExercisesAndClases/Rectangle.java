package c08_oop.PolymorphismExercisesAndClases;

// 2. Crea una clase Shape con el método calculateArea(). Luego implementa
// subclases Circle y Rectangle con sus propias fórmulas. Usa una lista de Shape
// para recorrer e imprimir el área de varias figuras.

public class Rectangle extends Shape{
    double with;
    double height;

    public Rectangle(double with, double height){
        this.with= with;
        this.height = height;
    }

    public void calculateArea(){
        System.out.printf("El área del rectángulo es " + (this.with*this.height) + " metros cuadrados.");
        System.out.println();
    }
}
