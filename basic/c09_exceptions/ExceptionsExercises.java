package c09_exceptions;

import c09_exceptions.ExceptionsExercisesAndClases.*;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ExceptionsExercises {

    public static void main(String[] args) throws TemperatureException, LoginFailedException {

        System.out.println("1. Divide dos números almacenados en dos variables. Maneja la división por cero con try-catch.");
        int num1 = 3;
        int num2 = 0;
        try {
            var result = num1 / num2;
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\n2. Crea un array de 3 elementos e intenta acceder al índice 5. Captura el ArrayIndexOutOfBoundsException.");
        String[] myStringsArray = new String[3];
        try {
            System.out.println(myStringsArray[5]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\n3. Crea una variable String nula e intenta imprimir su longitud. Maneja el NullPointerException.");
        String myNullValue = null;
        try {
            System.out.println(myNullValue.length());
        } catch (NullPointerException e){
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\n4. Escribe una función que transforma texto a número. Usa try-catch para manejar entradas no válidas (NumberFormatException).");
        System.out.println("5. Escribe un programa con un bloque finally que se ejecute siempre, haya o no error.");
        var myText = "a";
        // System.out.println(myText.getClass().getSimpleName()); // Ver tipo de datos, no vale para datos primitivos
        // System.out.println(intNum.getClass().getSimpleName()); // Ver tipo de datos, no vale para datos primitivos
        //      SI LOS DATOS SON PRIMITIVOS, PODEMOS HACERLO ASÍ:
        /*
        int numero = 42;
        String texto1 = Integer.toString(numero);
        String texto2 = String.valueOf(numero);
        System.out.println(texto1.getClass().getSimpleName()); // "42"
        System.out.println(texto2.getClass().getSimpleName()); // "42"
        */

        try {
            //Integer intNum = Integer.parseInt(myText);
            var myInteger = textToInteger (myText);
        } catch (NumberFormatException e){
            System.out.println("No puedes convertir una letra en un número. Error " + e.getMessage());
        } finally {
            System.out.println("Finaly: Gracias por usar mi programa");
        }

        System.out.println("6. Usa throw para lanzar un IllegalArgumentException si un número introducido es negativo.");
        Integer myNumber = 10;
        if (myNumber < 0){
            throw new IllegalArgumentException("Error personalizado");
        } else {
            System.out.println("Todo OK");
        }

        System.out.println("7. Crea una clase TemperatureChecker que lanza una excepción personalizada si la temperatura es menor a -50 o mayor a 50.");
        var myTemperature = 10;
        try {
            var checkingTemperature = new TemperatureChecker(myTemperature);
        } catch (TemperatureException e) {
            System.out.println("Te lanzo error personalizado: " + e.getMessage());
        }

        System.out.println("8. Crea un programa con varios bloques catch: uno para ArithmeticException, otro para ArrayIndexOutOfBoundsException.");
        try {
            //var divByCero = 10 / 0;
            String[] myArrayString = new String[3];
            System.out.println(myArrayString[5]);
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }

        System.out.println("9. Crea una función checkPassword(String pass) que lance una excepción si la contraseña es demasiado corta.");
        var myPassword = "1234567";
        try {
            checkPassword(myPassword);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println("10. Implementa una clase LoginSystem que use una excepción personalizada LoginFailedException si el usuario o contraseña son incorrectos.");
        var user = "Pica";
        var password = "124";
        try {
            var myLogin = new LoginSystem(user, password);
        } catch (LoginFailedException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

    public static Integer textToInteger (String myText) {
        Integer intNum = Integer.parseInt(myText);
        return intNum;
    }

    public static void checkPassword (String password) throws PasswordException {
        if(password.length() <= 8){
            throw new PasswordException("Error, contraseña demasiado corta.");
        } else {
            System.out.println("Contraseña OK.");
        }
    }
}
