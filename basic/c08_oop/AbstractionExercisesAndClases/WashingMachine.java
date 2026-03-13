package c08_oop.AbstractionExercisesAndClases;

//7. Crea una clase abstracta Appliance con método turnOn() y turnOff().
//Implementa TV y WashingMachine con mensajes diferentes al encender y apagar.

public class WashingMachine extends Appliance{
    public WashingMachine() {
        this.turnedOn = false;
    }
    @Override
    public boolean turnOn(){
        System.out.println("Has encendido la lavadora");
        this.turnedOn = true;
        return true;
    }

    @Override
    public boolean turnOff(){
        System.out.println("Has apagado la lavadora");
        this.turnedOn = false;
        return false;
    }

    public boolean status(){
        return this.turnedOn;
    }

    }
