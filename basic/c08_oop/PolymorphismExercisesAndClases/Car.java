package c08_oop.PolymorphismExercisesAndClases;

// 5. Crea una clase Vehicle con un método start(). Luego crea Car, Bike y Truck
// que sobrescriban ese método. Recorre una lista ArrayList<Vehicle> para llamar
// a start() en cada uno.

public class Car extends Vehicle{
    @Override
    public void start(){
        System.out.println("Arranco así porque soy un coche");
    }
}
