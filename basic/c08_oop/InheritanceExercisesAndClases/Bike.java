package c08_oop.InheritanceExercisesAndClases;

// 9. Crea una clase Vehicle y tres subclases: Car, Bike y Truck, cada una con
// un método describe() sobrescrito.

public class Bike extends Vehicle{
    public void describe(){
        System.out.println("Soy una bici.");
    }

}
