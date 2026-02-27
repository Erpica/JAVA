package c08_oop;

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

class Car extends Vehicle {
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

class Bike extends Vehicle{
    public void describe(){
        System.out.println("Soy una bici.");
    }

}