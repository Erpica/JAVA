package c08_oop.AbstractionExercisesAndClases;

// 2. Crea una interfaz Playable con el método play(). Luego implementa esa interfaz en dos clases: Guitar y Piano.
//  Cada una debe mostrar un mensaje diferente al ejecutarse.

public class Guitar implements Playable{

    @Override
    public void play() {
        System.out.println("Así se toca la guitarra");
    }
}
