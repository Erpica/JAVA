package c08_oop.InheritanceExercisesAndClases;

//6. Crea una clase Bird con el método fly(). Luego crea Eagle que sobrescriba
//fly() pero también llame al método original con super.fly().

public class Eagle extends Bird{
    @Override
    public void fly() {
        super.fly();
        System.out.println("Pero soy un águila y vuelo más rápido.");
    }
}
