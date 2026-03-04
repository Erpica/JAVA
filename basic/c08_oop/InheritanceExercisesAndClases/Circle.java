package c08_oop.InheritanceExercisesAndClases;

//    5. Crea una clase abstracta Shape con un método calculateArea(). Luego
//    implementa ese método en Circle y Rectangle.""");


public class Circle extends Shape{
    double radius;

    public void calculateArea(){
        //System.out.println(String.format("El área del círculo es %.2f metros cuadrados.", Math.PI * Math.pow(this.radius, 2))); // Otra forma, peor.
        System.out.printf("El área del círculo es %.2f metros cuadrados.%n", Math.PI * Math.pow(this.radius, 2));
    }

    public Circle (double radius){
        this.radius = radius;
    }
}