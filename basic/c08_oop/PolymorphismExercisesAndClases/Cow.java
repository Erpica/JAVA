package c08_oop.PolymorphismExercisesAndClases;

// 1. Crea una clase Animal con el método makeSound(). Luego crea subclases Dog,
// Cat y Cow que sobrescriban ese método con sonidos diferentes. Llama al método
// desde una lista de Animal.

public class Cow extends Animal{
    public void makeSound(){
        System.out.println("Muuu.");
    }

}
