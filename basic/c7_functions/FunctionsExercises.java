package basic.c7_functions;

import java.util.ArrayList;
import java.util.List;

public class FunctionsExercises {

    public static void main(String[] args) {

        System.out.println("1. Crea una función que imprima \"¡Te doy la bienvenida al curso de Java desde cero!\".");
        printHello();

        System.out.println("\n2. Escribe una función que reciba un nombre como parámetro y salude a esa persona.");
        greetSomeone("Anto");

        System.out.println("\n3. Haz un método que reciba dos números enteros y devuelva su resta.");
        restNumbers(3, 4);

        System.out.println("\n4. Crea un método que calcule el cuadrado de un número (n * n).");
        squareOfNumber(3);

        System.out.println("\n5. Escribe una función que reciba un número y diga si es par o impar.");
        evenNumber(6);

        System.out.println("\n6. Crea un método que reciba una edad y retorne true si es mayor de edad (y false en caso contrario).");
        System.out.println(isAdult(21));

        System.out.println("\n7. Implementa una función que reciba una cadena y retorne su longitud.");
        System.out.println(lenthOfString("Hola que tal"));

        System.out.println("\n8. Crea un método que reciba un array de enteros, calcula su media y lo retorna.");
        int[] myNumbers = {3, 5, 6};
        System.out.println(averageOfNumbers(myNumbers));
        // System.out.println(averageOfNumbers(new int[]{3, 5, 6}));  // => De otra forma

        System.out.println("\n9. Escribe un método que reciba un número y retorna su factorial.");
        System.out.println(factorialOfANumber(5));

        System.out.println("\n10. Crea una función que reciba un ArrayList<String> y lo recorra mostrando cada elemento.");
        ArrayList<String> myArrayList = new ArrayList<>(List.of("Hola", "Soy", "Anto"));
        readString(myArrayList);

    }
    public static void printHello() {
        System.out.println("\"¡Te doy la bienvenida al curso de Java desde cero!\".");
    }

    public static void greetSomeone (String name) {
        System.out.println("Hola " + name);
    }

    public static void restNumbers (Integer oneNumber, Integer secondNumber) {
        System.out.println(oneNumber - secondNumber);
    }

    public static void squareOfNumber(Integer number){
        System.out.println(number*number);
    }

    public static void evenNumber (Integer number) {
        if (number % 2 == 0) {
            System.out.println("El número " + number + " es par.");
        } else {
            System.out.println("El número " + number + " no es par.");
        }
    }

    public static boolean isAdult (int age){
            if (age >= 18){
                return true;
            } else {
                return false;
            }
    }

    public static Integer lenthOfString (String myString){
        return myString.length();
    }

    public static float averageOfNumbers (int[] myNumbers){
        var numberOfNumbers = 0;
        float sumOfNumbers = 0;
        for (int number: myNumbers){
            numberOfNumbers++;
            sumOfNumbers += number;
        }
        return sumOfNumbers / numberOfNumbers;
    }

    public static Integer factorialOfANumber (Integer number){
        var factorial = 1;
        for (int i = number; i > 1; i--){
            factorial *= i;
        }
        return factorial;
    }

    public static void readString (ArrayList<String> myArray){
        for (String element: myArray){
            System.out.println(element);
        }
    }
}
