package c08_oop.PolymorphismExercisesAndClases;

// 1. Crea una clase Animal con el método makeSound(). Luego crea subclases Dog,
// Cat y Cow que sobrescriban ese método con sonidos diferentes. Llama al método
// desde una lista de Animal.

// 7. Crea una función showAnimalType(Animal animal) que imprima el tipo de
// animal. Pasa diferentes subclases (Dog, Cat, Horse) para que cada una imprima
// su tipo con su propio getType() sobrescrito.

public class Dog extends Animal{
    public Dog (String name){
        super(name);
    }

    public void makeSound(){
        System.out.println("Guau.");
    }

    public String getType(){
        return "Perro";
    }
}
