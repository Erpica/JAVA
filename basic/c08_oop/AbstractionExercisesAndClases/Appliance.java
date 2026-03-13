package c08_oop.AbstractionExercisesAndClases;

//7. Crea una clase abstracta Appliance con método turnOn() y turnOff().
//Implementa TV y WashingMachine con mensajes diferentes al encender y apagar.

public abstract class Appliance {
    boolean turnedOn;

    public abstract boolean turnOn();

    public abstract boolean turnOff();
}
