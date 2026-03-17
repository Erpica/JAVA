package c09_exceptions;

public class ThrowExample {
    public void checkAge(int age) throws IllegalArgumentException {
        if (age < 18) {
            throw new IllegalArgumentException("Tienes que ser mayor de edad");
        } else {
            System.out.println("Es mayor de edad");
        }
    }

    // Si CustomException extiende, por ejemplo, de RuntimeException no necesita el throws en la declaración

    public void checkScore(int score) throws CustomException {
        if (score < 0 || score > 100) {
            throw new CustomException("La puntuación debe estar entre 0 y 100");
        } else {
            System.out.println("Puntuación válida: " + score);
        }
    }

}
