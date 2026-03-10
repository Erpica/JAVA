package c08_oop.AbstractionExercisesAndClases;

public class Piano implements Playable{
    @Override
    public void play() {
        System.out.println("Así se toca el piano");
    }
}
