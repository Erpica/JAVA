package c08_oop.InheritanceExercisesAndClases;

// 1. Crea una clase Vehicle con un método move(). Luego crea una subclase Car
//que herede de Vehicle y agrega el método honk().

// 9. Crea una clase Vehicle y tres subclases: Car, Bike y Truck, cada una con
// un método describe() sobrescrito.

public class Car extends Vehicle {
    String name;

    public Car(String name){
        this.name = name;
    }
    public void honk(){
        System.out.println("Mec Mec!");
    }
    public void describe(){
        System.out.println("Soy un coche y me llamo " + this.name + ".");
    }

}
