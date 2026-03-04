package c08_oop.PolymorphismExercisesAndClases;

// 2. Crea una clase Shape con el método calculateArea(). Luego implementa
// subclases Circle y Rectangle con sus propias fórmulas. Usa una lista de Shape
// para recorrer e imprimir el área de varias figuras.

public class Circle extends Shape{
    public double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public void calculateArea(){
        System.out.printf("El área del círculo es %.2f metros cuadrados", Math.PI*Math.pow(radius, 2));
        System.out.println();
    }
}
