package c08_oop.AbstractionExercisesAndClases;

// 4. Crea una interfaz Drawable. Implementa las clases Circle, Square, y Triangle que muestren cómo se dibuja cada figura usando draw().

public class Triangle implements Drawable{
    @Override
    public void draw(){
        System.out.println("Así se dibuja un triángulo.");
    }
}
