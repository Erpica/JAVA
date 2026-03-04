package c08_oop.InheritanceExercisesAndClases;

// 1. Crea una clase Vehicle con un método move(). Luego crea una subclase Car
//que herede de Vehicle y agrega el método honk().

// 9. Crea una clase Vehicle y tres subclases: Car, Bike y Truck, cada una con
// un método describe() sobrescrito.

public abstract class Vehicle {
    public void  move(){
        System.out.println("Me estoy moviendo");
    }
    public abstract void describe();
}

