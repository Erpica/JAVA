package c08_oop.PolymorphismExercisesAndClases;

// 4. Crea una clase Greeter con dos métodos greet(): uno que salude con
// "Hello", y otro que reciba un nombre y salude con "Hello, [nombre]".

public class Greeter {
    public void greet(){
        System.out.println("Hello.");
    }
    public void greet(String name){
        System.out.printf("Hello %s.\n", name);
    }
}
