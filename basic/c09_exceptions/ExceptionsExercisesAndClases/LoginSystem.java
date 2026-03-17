package c09_exceptions.ExceptionsExercisesAndClases;

//10. Implementa una clase LoginSystem que use una excepción personalizada LoginFailedException si el usuario o contraseña son incorrectos.

public class LoginSystem {
    String user = "Pica";
    String password = "1234";

    public LoginSystem (String user, String password) throws LoginFailedException {
        if (this.user.equals(user) && this.password.equals(password)){
            System.out.println("Logado.");
        } else {
            //System.out.println("Error de usuario o contraseña.");
            throw new LoginFailedException("Usuario o contraseña incorrectos.");
        }
    }
}
