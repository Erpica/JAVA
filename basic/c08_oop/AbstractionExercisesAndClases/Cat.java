package c08_oop.AbstractionExercisesAndClases;

// 3. Define una clase abstracta Animal con el método makeSound(). Implementa Dog y Cat para que hagan sonidos distintos.
// Crea un array de Animal para mostrar polimorfismo.

public class Cat extends Animal{
    public void makeSound(){
        System.out.println("Miau");
    }
}
