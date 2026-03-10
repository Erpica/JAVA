package c08_oop.PolymorphismExercisesAndClases;

// 10. Crea una clase Character con método attack(). Luego crea subclases
// Warrior, Archer, Mage con ataques diferentes. En main, crea un array de
// Character y llama a attack() para cada uno.

public class Mage extends Character{
    public void attack(){
        System.out.println("Estoy lanzando una magia.");
    }
}
