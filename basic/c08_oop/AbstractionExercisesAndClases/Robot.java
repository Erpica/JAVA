package c08_oop.AbstractionExercisesAndClases;

// 6. Crea una interfaz Movable con el método move(). Haz que las clases Car y Robot implementen ese método con comportamientos diferentes.

public class Robot implements Movable{
    public void move(){
        System.out.println("Así se mueve un robot.");
    }
}
