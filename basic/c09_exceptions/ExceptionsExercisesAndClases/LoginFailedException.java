package c09_exceptions.ExceptionsExercisesAndClases;

//10. Implementa una clase LoginSystem que use una excepción personalizada LoginFailedException si el usuario o contraseña son incorrectos.

public class LoginFailedException extends Exception{
    public LoginFailedException (String message) {super(message);}

}
